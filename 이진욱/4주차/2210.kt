import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

private val br = BufferedReader(InputStreamReader(System.`in`))
val graph = mutableListOf<List<Int>>()
val sets = mutableSetOf<String>()
val dirs = listOf(listOf(1, 0), listOf(0, 1), listOf(-1, 0), listOf(0, -1)) // 상, 하, 좌, 우

fun main(args: Array<String>) {
    repeat(5) {
        graph.add(br.readLine().split(" ").map { it.toInt() })
    }

    for(i in 0 until 5)
        for(j in 0 until 5) {
            dfs(i, j, "", 0)
        }

    print(sets.size)
}

/**
 * prevI : 이전에 방문한 i 값
 * prevJ : 이전에 방문한 j 값
 * prevStr : 이때까지 방문하며 만들어진 수
 * cnt : 방문 횟수
 */
fun dfs(prevI: Int, prevJ: Int, prevStr: String, cnt: Int) {
    // 방문 횟수가 6인 경우, 이때까지 방문하며 만들어진 수를 set에 넣는다.
    if(cnt == 6) {
        sets.add(prevStr)
        return
    }

    // 상하좌우로 이동하며 dfs 수행
    for((di,dj) in dirs) {
        val newI = prevI + di
        val newJ = prevJ + dj

        if(newI !in 0 until 5 || newJ !in 0 until 5) continue
        dfs(newI, newJ, prevStr + "${graph[newI][newJ]}", cnt + 1)
    }
}

/**
 * 첫번째로 밝을 수 있는 숫자판의 개수 : 25
 * 두번째로 밟을 수 있는 숫자판의 개수 : 4 (상, 하, 좌, 우)
 * 세번재로 밟을 수 있는 숫자판의 개수 : 4 (상, 하, 좌, 우)
 * 네번째로 밟을 수 있는 숫자판의 개수 : 4 (상, 하, 좌, 우)
 * 다섯번째로 밟을 수 있는 숫자판의 개수 : 4 (상, 하, 좌, 우)
 * 여섯번째로 밟을 수 있는 숫자판의 개수 : 4 (상, 하, 좌, 우)
 * 
 * 최악의 경우의 수 : 25 * 4 * 4 * 4 * 4 * 4 = 25,600
 * 
 * dfs + 브루트포스(완전탐색) 하면 된다.
 */
