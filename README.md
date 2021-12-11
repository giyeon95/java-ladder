# 사다리 게임

## 진행 방법

* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 🚀 2단계 - 사다리(생성)

- (UI) 사다리 게임에 참여하는 사람 이름을 받는 InputView 기능 개발 (v)
- 참여하는 사람의 이름은, 5글자 이름을 넘어서는 안되며, 참가자를 저장하는 Participant 개발 (v)
- 참여하는 사람의 이름을 잘라서, 참가자를 저장하는 Participants 일급콜렉션 개발 (v)
- (UI) 최대 사다리의 높이를 입력받는 InputView 기능 개발 (v)
- 사다리 생성 기능 개발 (v)
- 사다리 생성이 되어야 하는지를 판단하는 내부 기능 개발 (v)
- (UI) 사다리 생성에 따라, 실행 결과를 보여주는 ResultView 기능 개발 (v)

## 🚀 3단계 - 사다리(게임 실행)

- [] (UI) 사다리 결과를 입력받는 InputView 개발
- [] (UI) 사다리 실행 결과를 보여주도록 ResultView 기능 수정
- [] (UI) 입력받는 실행 결과에 따라, 결과를 보여주는 기능 개발
- [] (UI) `all` 입력시, 전체 결과를 보여주는 기능 개발
- [] 사다리 수행 결과 저장 클래스 구현
- [v] 사다리 결과 계산 기능 구현