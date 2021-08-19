# w3-SpringBoot_Part_A

## 패키지 구조

```bas
├── java
│   └── org
│       └── prgrms
│           └── kdtspringorder
│               ├── App.java
│               ├── AppConfigurationClass.java
│               ├── AppTest.java // 콘솔 어플리케이션을 실행하기 위한 main 메소드가 이곳에 정의되어 있습니다.
│               ├── KdtSpringOrderApplication.java
│               ├── io // 콘솔에서의 입력 및 출력을 담당하는 클래스들을 모아 두었습니다.
│               │   ├── abstraction // 추상 클래스나 인터페이스를 모아 두었습니다.
│               │   │   ├── Input.java
│               │   │   └── Output.java
│               │   ├── domain
│               │   │   └── Command.java
│               │   ├── enums
│               │   │   └── CommandType.java
│               │   ├── exception // 입력 및 출력 과정에서 발생 할 수 있는 예외들을 모아두었습니다.
│               │   │   └── InvalidCommandException.java
│               │   └── implementation // 추상 클래스나 인터페이스에 대한 구현체들을 모아두었습니다.
│               │       └── Console.java
│               ├── order
│               │   ├── OrderTester.java
│               │   ├── domain
│               │   │   ├── abstraction
│               │   │   └── implementation
│               │   │       ├── Order.java
│               │   │       └── OrderItem.java
│               │   ├── enums
│               │   │   └── OrderStatus.java
│               │   ├── exception
│               │   ├── repository
│               │   │   ├── abstraction
│               │   │   │   └── OrderRepository.java
│               │   │   └── implementation
│               │   ├── service
│               │   │   └── OrderService.java
│               │   └── validation
│               └── voucher // 미션-2에서 사용하는 Voucher와 관련된 클래스들을 모아 두었습니다.
│                   ├── domain // 도메인 클래스라 생각하는 것들을 모아두었습니다.
│                   │   └── Voucher.java
│                   ├── enums // Voucher와 관련된 Enum들을 정의해 놓았습니다.
│                   │   └── VoucherPolicy.java
│                   ├── exception 
│                   ├── repository
│                   │   ├── abstraction
│                   │   │   └── VoucherRepository.java
│                   │   └── implementation
│                   │       └── MemoryVoucherRepository.java
│                   ├── service
│                   │   └── VoucherService.java
│                   └── validation
│                       └── CommandValidator.java
└── resources
    └── application.properties
```

## 어플리케이션 사용 예시

### AppTest.class에 정의되어 있는 main 메소드 실행시 어플리케이션 실행 가능

![image-20210819135411953](image-20210819135411953.png)

### 3가지 명령어의 실행 방법

| 명령어 |            수행 역할             | 사용 가능한 옵션들 | 수행 결과                                                    |
| :----: | :------------------------------: | :----------------: | ------------------------------------------------------------ |
|  exit  |        어플리케이션 종료         |         -          | <img src="images/image-20210819135654278.png" alt="image-20210819135654278" style="zoom:60%;" /> |
| create |           바우처 생성            |   fixed/percent    | 1. create fixed 수행 결과<br /><img src="image-20210819141129821.png" alt="image-20210819141129821" style="zoom:60%;" /><br /><br />2. create percent 수행 결과<br /><img src="image-20210819141112762.png" alt="image-20210819141112762" style="zoom:60%;" /><br /><br />3. fixed, percent 옵션 없이 create만 입력한 경우 혹은 잘못된 옵션을 입력한 경우<br /><img src="images/image-20210819141346975.png" alt="image-20210819141346975" style="zoom:60%;" /><br /><br />4. 명령어 없이 create만 입력한 경우 <br /><img src="images/image-20210819141526695.png" alt="image-20210819141526695" style="zoom:60%;" /> |
|  list  | 생성된 바우처의 목록을 보여준다. |         -          | <img src="images/image-20210819141826753.png" alt="image-20210819141826753" style="zoom:60%;" /> |



## 커밋 메시지 관련

브랜치를 따고 미션을 시작해야 했는데 로컬에서 먼저 시작해버려서 커밋 메시지가 1개 밖에 없습니다... 😹