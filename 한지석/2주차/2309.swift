//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/09/27.
//

import Foundation

var array: [Int] = []
var total = 0
var del1 = 0
var del2 = 0

for _ in 0..<9 {
    let input = Int(readLine()!)!
    array.append(input)
    total += input
}

array.sort()

for i in 0..<8 {
    for j in i+1..<9 {
        if total - array[i] - array[j] == 100 {
            
            del1 = array[i]
            del2 = array[j]
            break
            
        }
    }
}

array.remove(at: array.firstIndex(of: del1)!)
array.remove(at: array.firstIndex(of: del2)!)

for answer in array {
    print(answer)
}

