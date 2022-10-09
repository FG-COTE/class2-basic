//
//  main.swift
//  3주차
//
//  Created by 한지석 on 2022/10/09.
//
// DFS

import Foundation

let graph: [String: [String]] = [
    "A" : ["B", "C"],
    "B" : ["A", "D", "E"],
    "C" : ["A", "F"],
    "D" : ["B"],
    "E" : ["B"],
    "F" : ["C"],
]

func DFS(graph: [String: [String]], start: String) -> [String] {
    
    var visitedQueue: [String] = []
    var needVisitStack: [String] = [start]
    
    while !needVisitStack.isEmpty {
        let node: String = needVisitStack.removeLast()
        print(node)
        if visitedQueue.contains(node) { continue }
        
        visitedQueue.append(node)
        needVisitStack += graph[node] ?? []
        print(visitedQueue)
        print(needVisitStack)
    }
    print(visitedQueue)
    return visitedQueue
}

DFS(graph: graph, start: "A")
