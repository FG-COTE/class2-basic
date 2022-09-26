//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/09/26.
//

import Foundation

var N = Int(readLine()!)!
var num: [Int] = []

for _ in 0..<N {
    num.append(Int(readLine()!)!)
}

num.sort()

for i in 0..<num.count {
    print(num[i])
}
