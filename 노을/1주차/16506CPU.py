n = int(input())

opcode_assembly = {'ADD':'0000', 'SUB':'0001', 'MOV':'0010', 'AND':'0011','OR':'0100',
                   'NOT':'0101','MULT':'0110', 'LSFTL':'0111', 'LSFTR':'1000',
                   'ASFTR':'1001','RL':'1010','RR':'1011'}

for i in range(n):
    input_data = input().split()
    machine_code = ''
    if input_data[0][-1]=='C':
        op = opcode_assembly.get(input_data[0][:-1])
        machine_code += op
        machine_code += '1'
    else:
        op = opcode_assembly.get(input_data[0])
        machine_code += op
        machine_code += '0'
    machine_code += '0'
    rd = bin(int(input_data[1]))
    machine_code+=str(rd)[2:].zfill(3)
    ra = bin(int(input_data[2]))
    machine_code+=str(ra)[2:].zfill(3)
    
    rb = bin(int(input_data[3]))
    if machine_code[4]=='0':
        machine_code+=str(rb)[2:].zfill(3)
        machine_code+='0'
    else:
        machine_code+=str(rb)[2:].zfill(4)
        
    print(machine_code)
     
