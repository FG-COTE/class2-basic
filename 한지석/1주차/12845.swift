//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/09/20.
//

import Foundation

var n = Int(readLine()!)
var inputCards = readLine()!.components(separatedBy: " ")
var cards = inputCards.map { Int(String($0))! }
cards.sort(by: { $0 > $1 })

var count = cards[0] + cards[1]

for i in 2..<cards.count {
    count += cards[0] + cards[i]
}

print(count)
