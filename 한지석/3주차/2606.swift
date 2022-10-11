//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/10/11.
//

import Foundation

let n = Int(readLine()!)!
let m = Int(readLine()!)!

var dict: [Int:[Int]] = [:]
var visited: [Int] = []

for i in 1..<n + 1 {
    dict[i] = []
}

for _ in 0..<m {
    let input = readLine()!.split(separator: " ").map({Int($0)!})
    dict[input[0]]!.append(input[1])
    dict[input[1]]!.append(input[0])
}

func bfs(dict: [Int: [Int]], start: Int) {
    var visitedQueue: [Int] = [] // 방문한 큐
    var needVisitQueue: [Int] = [start] // 방문해야할 큐
    
    while !needVisitQueue.isEmpty {
        let node: Int = needVisitQueue.removeFirst()
        
        if visitedQueue.contains(node) { continue }
        
        visitedQueue.append(node)
        needVisitQueue += dict[node] ?? []
    }
    print(visitedQueue.count - 1)
}

bfs(dict: dict, start: 1)

