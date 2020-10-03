
import vk_api
import requests
import time
import random

def main():
    with open('loginsss1.txt') as f:
         lines = f.read().splitlines()
               
            
    """ Пример обработки капчи """
    cnt = 0
    for i in range(0,20):
        with open('loginsss1.txt') as f:
           lines = f.read().splitlines()

        if (i % 2) == 0  and i != 0:
            pal = lines[i].find(':')
            print(pal)
    
            log = lines[i][0:pal]

            size = len(lines[i])
            print(size)
            dd = lines[i][(pal+1):size]

            passwd = dd[0:dd.find(':')]
            tokens = dd[(dd.find(':') +1):size]
            print(log)
            print(passwd)
            print(tokens)
            time.sleep(2)
            newpasswd = 'd' + passwd + '1'
            print(log)
            print(newpasswd)
            print(passwd + '/n')
            time.sleep(2)
            print(cnt)
            vk_session = vk_api.VkApi(token = tokens)
            time.sleep(2)

            time.sleep(2)
            sex = 1
            path = ''
            vk = vk_session.get_api()
            time.sleep(2)
            sexi = vk.account.getProfileInfo()
            sex = sexi['sex']
            time.sleep(3)
            stat = []
            lines = []
            if sex == 1:
                with open('fwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('femalestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")



            elif sex == 2:
                with open('mwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('malestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")
                

            elif sex == 0:
                with open('mwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('malestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(12)
                print("g")
            
            randpost = random.randint(1,38)
            ids = stat[randpost][0:stat[randpost].find(':')]
            sizes = len(stat[randpost])
            print(sizes)
            print(ids)
            dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
            print(dd)

            vk.wall.repost(object = ('wall' + ids + '_' + dd))
            time.sleep(13)
            randpost = random.randint(1,38)
            ids = stat[randpost][0:stat[randpost].find(':')]
            sizes = len(stat[randpost])
            print(sizes)
            print(ids)
            dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
            print(dd)
            vk.wall.repost(object = ('wall' + ids + '_' + dd))
            time.sleep(30)
            cnt = cnt + 1

            rr = input("поменяй впн")
            print(rr)
            cnt = 0
        elif (i % 2) != 0:
            pal = lines[i].find(':')
            print(pal)
    
            log = lines[i][0:pal]

            size = len(lines[i])
            print(size)
            dd = lines[i][(pal+1):size]

            passwd = dd[0:dd.find(':')]
            tokens = dd[(dd.find(':') +1):size]
            print(log)
            print(passwd)
            print(tokens)
            time.sleep(2)
            newpasswd = 'd' + passwd + '1'
            print(log)
            print(newpasswd)
            print(passwd + '/n')
            time.sleep(2)
            print(cnt)
            vk_session = vk_api.VkApi(token = tokens)
            time.sleep(2)

            time.sleep(2)
            sex = 1
            path = ''
            vk = vk_session.get_api()
            time.sleep(2)
            sexi = vk.account.getProfileInfo()
            sex = sexi['sex']
            time.sleep(3)
            stat = []
            lines = []
            if sex == 1:
                with open('fwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('femalestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(12)
                print("g")



            elif sex == 2:
                with open('mwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('malestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")
                

            elif sex == 0:
                with open('mwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('malestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")
            
            randpost = random.randint(1,38)
            ids = stat[randpost][0:stat[randpost].find(':')]
            sizes = len(stat[randpost])
            print(sizes)
            print(ids)
            dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
            print(dd)
 
            vk.wall.repost(object = ('wall' + ids + '_' + dd))
            time.sleep(13)
            randpost = random.randint(1,38)
            ids = stat[randpost][0:stat[randpost].find(':')]
            sizes = len(stat[randpost])
            print(sizes)
            print(ids)
            dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
            print(dd)
            vk.wall.repost(object = ('wall' + ids + '_' + dd))
            time.sleep(20)
            cnt = cnt + 1
            
        else:
            pal = lines[i].find(':')
            print(pal)
    
            log = lines[i][0:pal]

            size = len(lines[i])
            print(size)
            dd = lines[i][(pal+1):size]

            passwd = dd[0:dd.find(':')]
            tokens = dd[(dd.find(':') +1):size]
            print(log)
            print(passwd)
            print(tokens)
            time.sleep(2)
            newpasswd = 'd' + passwd + '1'
            print(log)
            print(newpasswd)
            print(passwd + '/n')
            time.sleep(2)
            print(cnt)
            vk_session = vk_api.VkApi(login = log,password=passwd)
            time.sleep(2)

            sex = 1
            path = ''
            vk = vk_session.get_api()
            time.sleep(2)
            sexi = vk.account.getProfileInfo()
            sex = sexi['sex']
            time.sleep(3)
            stat = []
            lines = []
            if sex == 1:
                with open('fwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('femalestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")



            elif sex == 2:
                with open('mwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                with open('malestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")
                

            elif sex == 0:
                with open('mwalls.txt',encoding='utf-8') as f:
                  stat = f.read().splitlines()
                randpost = random.randint(1,38)
                ids = stat[randpost][0:stat[randpost].find(':')]
                sizes = len(stat[randpost])
                print(sizes)
                print(ids)
                dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
                print(dd)
                vk.wall.repost(object = ('wall' + ids + '_' + dd))
                time.sleep(9)
                with open('malestatus.txt',encoding='utf-8') as f:
                  status1 = f.read().splitlines()

                tex = status1[random.randint(0,28)]
                print(tex)
                vk.status.set(text = tex)
                time.sleep(14)
                print("g")
            
            randpost = random.randint(1,38)
            ids = stat[randpost][0:stat[randpost].find(':')]
            sizes = len(stat[randpost])
            print(sizes)
            print(ids)
            dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
            print(dd)
            vk.wall.repost(object = ('wall' + ids + '_' + dd))
            time.sleep(13)
            randpost = random.randint(1,38)
            ids = stat[randpost][0:stat[randpost].find(':')]
            sizes = len(stat[randpost])
            print(sizes)
            print(ids)
            dd = stat[randpost][(stat[randpost].find(':')+1):sizes]
            print(dd)
            vk.wall.repost(object = ('wall' + ids + '_' + dd))

    
            
            #vk.messages.send(user_id ='204747021',message = 'владик')
            time.sleep(20)
            cnt = cnt + 1

            
        








       


if __name__ == '__main__':
    main()