//
//  example_2.swift
//  1주차
//
//  Created by 한지석 on 2022/09/17.
//

import Foundation

var input = readLine()!
var inputToCharacter: [Character] = []

for i in 0..<input.count {
    inputToCharacter.append(input[input.index(input.startIndex, offsetBy: i)])
}

var numbers = inputToCharacter.map { Int(String($0))! }
var count = 0

for i in 0..<numbers.count {
    if numbers[i] <= 1 || count <= 1{
        count += numbers[i]
    } else {
        count *= numbers[i]
    }
}

print(count)
