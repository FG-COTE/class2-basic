//
//  example3.swift
//  1주차
//
//  Created by 한지석 on 2022/09/17.
//

import Foundation

var n = Int(readLine()!)

var x = 1
var y = 1

var plans = readLine()!.components(separatedBy: " ")

var nx = 0
var ny = 0

let dx = [0, 0, 1, -1]
let dy = [1, -1, 0, 0]
let moveTypes = ["R", "L", "D", "U"]

for plan in plans {
    for i in 0..<moveTypes.count {
        if String(plan) == moveTypes[i] {
            nx = x + dx[i]
            ny = y + dy[i]
        }
    }
    
    if nx < 1 || ny < 1 || nx > n! || ny > n!{
        continue
    }
    
    x = nx
    y = ny
}

print("\(x), \(y)")

