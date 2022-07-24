import random
computer = random.randint(0,2) ##0~2의 범위를 랜덤으로 받는다.
option = ['rock', 'scissors', 'paper'] ##선택한 값(가위, 바위 보)을 배열로 선언한다.
com_value = option[computer] ##(1)컴퓨터가 선택한 값

##내가 선택한 값 리턴하는 함수
def get_my_value():
    while True:
        my_value = input("rock, scissors, paper : ")
        if my_value not in option:
            print("wrong input, try again")
        else:
            break
    return my_value

my_value = get_my_value() ##(2)my_value 변수에 내가 낸 값 할당

##결과를 출력하는 함수: (1)과 (2) 값을 이용
def get_result(com_value, my_value) :
    if com_value == my_value :
        print("draw!")
    elif my_value == 'rock':
        if com_value == 'scissors':
            print("you win!")
        else:
            print("you lose!")
    elif my_value == 'scissors':
        if com_value == 'paper':
            print("you win!")
        else:
            print("you lose!")
    elif my_value == 'paper':
        if com_value == 'rock':
            print("you win!")
        else:
            print("you lose!")

print("my value : ", my_value)
print("computer value : ", com_value)
get_result(com_value, my_value)
