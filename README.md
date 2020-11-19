# hello-design-pattern
## 생성 (Creational Pattern)
- 추상 팩토리 (Abstract Factory Method)
    - 팩토리 매서드 패턴과 동일하며 추상 팩토리로 구체적인 팩토리를 구한다.

- 빌더 (Builder)
    - 생성 인자가 많을 경우 생성과 표기를 분리해 복잡한 객체를 생성한다
    
- 팩토리 메서드 (Factory Method)
    - 인터페이스로 객체를 정의하고 팩토리가 객체를 생성한다.
    
- 프로토타입 (Prototype)
    - 기존 객체를 복제함으로써 객체를 생성한다.
    
- 싱글톤 (Singleton)
    - 한 클래스에 한 객체만 존재하도록 제한한다.


## 구조 (Structural Pattern)
- 어댑터 (Adaptor)
    - 어댑터 패턴은 서로 다른 인터페이스를 가진 두 클래스를 어댑터 클래스로 인터페이스를 통일 시켜 사용하는 방법이다.
    
- 컴포지트 (Composite)
    - 전체-부분 관계를 트리 구조로 표현해서 클라이언트에서는 부분과 관계를 동일 매서드로 처리한다.
    - 예를 들어 디렉토리 파일 구조를 떠올리면 된다.
    
- 데코레이터 (Decorator)
    - 기본 객체에 추가 기능을 동적으로 유연하게 첨가하는 패턴이다.
    
- 프록시 (Proxy)
    - 프록시 객체를 통해서 원래 객체에 접근하는 방식이다.

- 퍼사드 (Facade)
    - 퍼사드는 건물의 정면이라는 뜻으로 어떤 서브시스템들의 통합된 인터페이스를 제공하는 방식이다.
    
- 브릿지 (Bridge)
    - 구현부에서 추상층을 분리하여 각자 독립적으로 변형 및 확장이 가능하도록 하는 방식이다.
    - 기능 클래스 계층과 구현 클래스 계층을 분리하는 것이 핵심이다.
    
- 플라이웨이트 (Flyweight)
    - 동일하거나 유사한 객체들 사이에 가능한 많은 데이터를 서로 공유하여 new 연산자로 인한 메모리 낭비를 줄이는 방식이다.

## 행위 (Behavioral Pattern)
- 전략 (Strategy)
    - 전략 알고리즘들을 캡슐화하고, 컨텍스트에게 적합한 전략 객체를 생성해서 주입하는 방식이다.
    
- 템플릿 메서드 (Template Method)
    - 상위 클래스가 뼈대가 되는 로직을 구성하고, 하위 클래스들이 이 로직의 요소들을 각각 구현하는 패턴이다.
    - 상위에서 알고리즘의 구조를 정의하고, 하위에서는 알고리즘 구조의 변경없이 알고리즘만 재정의하는 패턴이다.
    
- 옵저버 (Observer)
    - 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지받고 자동 갱신 될 수 있게 하는 방식이다.
    
- 상태 (State)
    - 상태 자체를 객체화함으로써, 상태에 따른 액션도 상태 객체에 내부에 구현하는 패턴이다.