//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/09/26.
//

import Foundation

// O(n^2)
func bubbleSort(_ array: inout [Int]) {
    for index1 in 0..<(array.count - 1) {
        var isSwap = false // 모든 배열의 정렬이 끝남을 알리는 장치
        for index2 in 0..<((array.count - index1) - 1) {
            if array[index2] > array[index2 + 1] {
                array.swapAt(index2, (index2 + 1))
                isSwap = true
            }
        }
        if isSwap == false { return }
    }
}

// O(n^2)
func selectionSort(_ array: inout [Int]) {
    for stand in 0..<(array.count - 1) {
        var minIndex = stand
        for index in (stand + 1)..<array.count {
            if array[index] < array[minIndex] {
                minIndex = index
            }
        }
        array.swapAt(stand, minIndex)
    }
}

// O(n^2)
func insertionSort(_ array: inout [Int]) {
    for stand in 1..<array.count {
        for index in stride(from: stand, to: 0, by: -1) { // 반복문 내림차순 진행
            if array[index] < array[index - 1] {
                array.swapAt(index, index - 1)
            } else {
                break
            }
        }
    }
}

// O(n)
func quickSort(_ array: [Int]) -> [Int] {
    guard let first = array.first, array.count > 1 else { return array }
    
    let pivot = first
    let left = array.filter { $0 < pivot } // filter 사용 시 O(2n)
    let right = array.filter { $0 > pivot }
    
    return quickSort(left) + [pivot] + quickSort(right)
}

// O(n log n)
func mergeSort(_ array: [Int]) -> [Int] {
    if array.count <= 1 { return array }
    let center = array.count / 2
    let left = Array(array[0..<center])
    let right = Array(array[center..<array.count])
    
    func merge(_ left: [Int], _ right: [Int]) -> [Int] {
        var left = left
        var right = right
        var result: [Int] = []
        
        while !left.isEmpty && !right.isEmpty {
            if left[0] < right[0] {
                result.append(left.removeFirst())
            } else {
                result.append(right.removeFirst())
            }
        }
        
        if !left.isEmpty {
            result.append(contentsOf: left)
        }
        
        if !right.isEmpty {
            result.append(contentsOf: right)
        }
        
        return result
    }
    
    return merge(mergeSort(left), mergeSort(right))
}
