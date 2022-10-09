import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private val br = BufferedReader(InputStreamReader(System.`in`))
private lateinit var graph: Array<MutableList<Int>>
private lateinit var visited: Array<Boolean>

fun main(args: Array<String>) {
    val n = br.readLine().toInt()
    val computerPairSize = br.readLine().toInt()
    graph = Array(n + 1) { mutableListOf() }
    visited = Array(n + 1) { false }
    visited[1] = true

    repeat(computerPairSize) { index ->
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val queue: Queue<Int> = LinkedList()
    queue.add(1)
    var cnt = 0
    while (queue.isNotEmpty()) {
        val now = queue.poll()
        graph[now].forEach { next ->
            if(!visited[next]) {
                visited[next] = true
                cnt += 1
                queue.add(next)
            }
        }
    }

    println(cnt)
}
