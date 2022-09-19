//
//  example_1.swift
//  1주차
//
//  Created by 한지석 on 2022/09/17.
//

import Foundation

let input = (readLine()!.components(separatedBy: " "))
var count = 0

var N = Int(input[0])!
let K = Int(input[1])!

while N > 1 {
    if N % K == 0 {
        N = N / K
    } else {
        N -= 1
    }
    count += 1
}

print(count)
