//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/10/10.
//

import Foundation

let n = Int(readLine()!)!

var arr = Array(repeating: Array(repeating: 0, count: n), count: n)
var visited = Array(repeating: Array(repeating: false, count: n), count: n)

for i in 0..<n {
    
    let input = readLine()!.components(separatedBy: " ")
    let inputArray = input.map { Int(String($0))! }
    
    for j in 0..<inputArray.count {
        arr[i][j] = inputArray[j]
    }
    
}

func dfs(_ x: Int, _ y: Int){

    // 방문, -1, 범위초과 시 리턴
    if x <= -1 || x >= n || y <= -1 || y >= n || visited[x][y] == true {
        return
    }
    
    // -1, 즉 목적지 도착 시 방문체크 후 리턴
    if arr[x][y] == -1 {
        visited[x][y] = true
        return
    }
    
    // 방문 체크
    visited[x][y] = true
    
//    print("x, y - \(x), \(y)")
//    print("arr[x][y] - \(arr[x][y])")
    
    dfs(x + arr[x][y], y) // 아래 확인
    dfs(x, y + arr[x][y]) // 우측 확인
    
}

dfs(0, 0)

if visited[n - 1][n - 1]{
    print("HaruHaru")
} else {
    print("Hing")
}
    
//print(arr)
//print(visited)
