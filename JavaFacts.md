
# FACADE AND DECORATOR
YOU CAN IMPLEMENT AN INTERFACE/ABSTRACT CLASS

BY COMPOSITION, MAKING IT BE ATTRIBUTE OF ANOTHER CLASS



## Interfaces -> What those type MUST do
interface Smart(){
    public study();
}

class Student IMPLEMENTS Smart{ // MUST IMPLEMENT study();
    @Override
    String study(){
        return "Pass"
    }
}

## HEREDITATION OF CONSTRUCTOR
## A Child extends Parent
class Child extends Parent {
    public Child() {
        super();           // ✅ Good - call parent first
        // then do child-specific setup
    }
    
    public Child(String name) { 
        super(name);       // ✅ Good - use parent's logic
        // add child extras
    }
}