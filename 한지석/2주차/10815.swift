//
//  10815.swift
//  2주차
//
//  Created by 한지석 on 2022/09/26.
//

import Foundation

func binarySearch(array: [Int], num: Int) {
    var start = 0
    var end = (array.count - 1)
    
    while start <= end {
        let mid = (start + end) / 2
        
        if array[mid] == num {
            print("1", terminator: " ")
            return
        }
        if array[mid] > num {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    print("0", terminator: " ")
}

let N = Int(readLine()!)!

var input1 = readLine()!.components(separatedBy: " ")
var card = input1.map { Int(String($0))! }
card.sort()

let M = Int(readLine()!)!
var input2 = readLine()!.components(separatedBy: " ")
var inputCard = input2.map { Int(String($0))! }

for index in 0..<M {
    binarySearch(array: card, num: inputCard[index])
}
