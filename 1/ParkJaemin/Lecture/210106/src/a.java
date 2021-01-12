//ls: 현재 내가 위치한 장소의 파일 리스트를 볼 수 있다.
//
//        ls의 옵션 -a: all의 의미를 가지고 있어서 숨김 파일 포함한 모든 내용을 리스트 형식으로 볼 수 있다.
//        ls의 옵션 -l: 현재 보고 있는 파일의 세부사항을 볼 수 있게 도와준다.
//        d가 붙어있으면 디렉토리를 의미한다.
//        -는 일반 파일을 의미한다.
//        두 개의 옵션을 결합하여 -al 형식으로 사용할 수 있다.
//
//        . 은 현재 내가 위치한 디렉토리를 의미한다.
//        .. 은 현재 내가 위치한 디렉토리의 상위 디렉토리를 의미한다.
//
//        pwd: 현재 내가 위치한 디렉토리가 어디인지를 알려주는 명령어
//        cd: 디렉토리를 이동하는 명령어
//
//        cd를 활용할 때 ../.. 으로 두 칸을 건너 뛸 수도 있고 3칸, 4칸등 활용이 가능하다.
//        cd 디렉토리 경로를 알고 있다면 안쪽으로 여러칸을 건너갈 수도 있다.
//        ~ 은 홈 디렉토리
//
//        clear: 화면이 지저분해서 저리하고자 할 때 사용한다.
//
//        mkdir: 디렉토리를 생성하는 명령어다.
//        vi: 편집 명령어로 뒤쪽에 편집할 파일명을 적는다.
//
//        입력 모드, 커맨드 모드가 있다.
//        입력 모드 진입: a 혹은 i, shift + a, shift + i
//
//        shift + a: 맨 뒷줄에서 입력 모드를 시작
//        shift + i: 맨 앞줄에서 입력 모드를 시작
//        a: 커서를 기준으로 바로 뒷 글자부터 시작
//        i: 현재 커서 위치에서 시작
//
//        yy: 1줄 복사
//        p: 붙여넣기
//
//        d숫자d: 숫자만큼 지우기
//        y숫자y: 숫자만큼 복사하기
//
//        u: 뒤로가기
//        ctrl + R: 앞으로가기
//
//        :%s/바꾸고싶은내용/바뀐후의내용/g 으로 문자 치환이 가능하다.
//
//        :set nu - 라인 숫자를 볼 때 사용한다.
//        :set nonu
//
//        Ctrl + F: 페이지 다운
//        Ctrl + B: 페이지 업
//
//        :wq - 저장하고 나가기
//        :wq! - 간혹 강종을 하게 되면 readonly 가 되는데 이 경우에 저장을 하려고 하면 필요한 명령
//
//        readonly 가 나오는 것은 ls -a, ls -al 명령을 입력해서
//        확장자가 .swp 인 파일을 찾아서 삭제한다.
//
//        rm: 파일 삭제 명령어
//        rm -rf: 디렉토리 삭제
//
//
//
//        * 연습 문제
//
//        1) 홈 디렉토리로 이동한다.
//        이동 이후에 practice 라는 디렉토리를 만든다.
//        practice 디렉토리 내부에 java 폴더를 만든다.
//        그리고 practice 디렉토리 내부에 javascript 폴더를 만든다.
//
//        2) 1 번에서 만들었던 practice 디렉토리에 wrong 디렉토리를 만든다.
//        여기에 아무런 내용이나 vi 를 사용하여 기록해본다.
//
//        3) 2 번에서 만든 wrong 디렉토리를 지워보자!
//
//        4) practice 디렉토리에 test 폴더를 만든다.
//        이후 test 폴더에서 vi 로 파일을 편집하도록 한다.
//        아래 내용을 편집하도록 한다.
//
//        Hello Java Programming on Linux ~~!!~!
//        위의 내용을 15줄 동일하게 생성한다.
//
//        5) 위에서 만든 파일의 내용을 3줄 지워보자
//
//        6) Java 를 JavaScript 로 변경해보자
//
//
//
//        * Git(깃) 활용하기
//
//        - 사본과 원본 연결하기
//
//        1) cd proj
//        2) git clone (GroupStudy의 사본 주소)
//        위 명령을 통해서 사본의 내용을 내 컴퓨터에 저장한다.
//        3) cd GroupStudy
//        4) git remote -v 를 통해서 origin 과 upstream 을 확인한다.
//        만약 upstream 이 없다면 명령을 통해 추가해야 한다.
//        5) git remote add upstream (GroupStudy의 원본 주소)
//        6) git fetch upstream 을 통해 다운 받을 정보를 받아온다.
//        7) git merge upstram/main 을 통해 실제 컴퓨터에 원본 내용을 저장한다.
//        8) git push origin main
//        최종적으로 우리의 사본에 업데이트가 된다.
//        9) 내용을 추가했다면 git add -> git commit -> git push 순으로 진행한다.
//        10) 내 사본에 업데이트 된 것을 확인하고 PR(Pull Request)를 넣는다.
//        11) 관리자가 승인하면 원본에 내용이 업데이트 된 것을 확인할 수 있다.