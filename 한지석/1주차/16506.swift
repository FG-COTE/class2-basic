//
//  main.swift
//  1주차
//
//  Created by 한지석 on 2022/09/20.
//

import Foundation

// 4 + 1 + 1 + 3 + 3 + 4

var assembleC = ["ADDC", "SUBC", "MOVC", "ANDC", "ORC", "", "MULTC", "LSFTLC", "LSFTRC", "ASFTRC", "RLC", "RRC"]
var assemble = ["ADD", "SUB", "MOV", "AND", "OR", "NOT", "MULT", "LSFTL", "LSFTR", "ASFTR", "RL", "RR"]

var n = Int(readLine()!)!

for _ in 0..<n {
    
    var output = ""
    var binary = ""
    var zeroSum = 0
    
    var input = readLine()!.components(separatedBy: " ")
    let assembleCode = String(input[0])
    
    if let firstIndex = input.firstIndex(of: assembleCode){
        input.remove(at: firstIndex)
    }
    
    var binaryArray = input.map { Int(String($0))! }
    
    
    if assembleCode.contains("C") {
        
        if let index = assembleC.firstIndex(of: assembleCode) {
        
            binary = (String(index, radix: 2))
            zeroSum = 4 - binary.count
            output += String(repeating: "0", count: zeroSum) + "\(binary)10"
            
        }
        
        binary = String(binaryArray[0], radix: 2)
        zeroSum = 3 - binary.count
        output += String(repeating: "0", count: zeroSum) + "\(binary)"
        
        if assembleCode != "MOVC"{
            
            binary = String(binaryArray[1], radix: 2)
            zeroSum = 3 - binary.count
            output += String(repeating: "0", count: zeroSum) + "\(binary)"
            
        } else {
            
            output += "000"
            
        }
        
        binary = String(binaryArray[2], radix: 2)
        zeroSum = 4 - binary.count
        output += String(repeating: "0", count: zeroSum) + "\(binary)"
        
        print(output)
        
    } else {

        if let index = assemble.firstIndex(of: assembleCode) {
            
            binary = (String(index, radix: 2))
            zeroSum = 4 - binary.count
            output += String(repeating: "0", count: zeroSum) + "\(binary)00"
            
        }
        
        binary = String(binaryArray[0], radix: 2)
        zeroSum = 3 - binary.count
        output += String(repeating: "0", count: zeroSum) + "\(binary)"
        
        if assembleCode != "MOV" || assembleCode != "NOT"{
            
            binary = String(binaryArray[1], radix: 2)
            zeroSum = 3 - binary.count
            output += String(repeating: "0", count: zeroSum) + "\(binary)"
            
        } else {
            
            output += "000"
            
        }
        
        binary = String(binaryArray[2], radix: 2)
        zeroSum = 3 - binary.count
        output += String(repeating: "0", count: zeroSum) + "\(binary)0"
        
        print(output)
        
    }
}


