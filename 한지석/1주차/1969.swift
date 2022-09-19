//
//  1969(Swift).swift
//  1주차
//
//  Created by 한지석 on 2022/09/18.
//

import Foundation

let input = readLine()!.components(separatedBy: " ")

let N = Int(input[0])!
let M = Int(input[1])!

var dna: [String] = []

// A, T, G, C
var HD = ["A", "C", "G", "T"]
var HDCount = [0, 0, 0, 0]

var answer = ""
var count = 0

for _ in 0..<N {
    let readline = readLine()!
    dna.append(readline)
}

for i in 0..<M { // 8
    for j in 0..<N { // 5
        let index = dna[j].index(dna[j].startIndex, offsetBy: i)
        // 각 위치 배열에 카운트하기
        if let firstIndex = HD.firstIndex(of: String(dna[j][index])) {
            HDCount[firstIndex] += 1
        }
    }

    let max = HDCount.max()!

    // 정답 이어붙이기 & 맥스는 0으로 --> 적게 나온 알파벳들을 더해주어야 하기 때문
    if let firstIndex = HDCount.firstIndex(of: max) {
        answer += HD[firstIndex]
        HDCount[firstIndex] = 0
    }
    
    // 남은 HDCount들을 카운트에 더해준다.
    for k in 0..<4 {
        count += HDCount[k]
    }

    HDCount = [0, 0, 0, 0]

}

print(answer)
print(count)

