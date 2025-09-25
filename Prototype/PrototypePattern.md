
# Copy existing objects CLONE
in reliable maneer.
(Clone object)

CREATES CONSTRUCTION FUNCTION THAT ACCEPTS OBJECT AS PARAMETER AND COPIES FIELDS

THEN CALLS CONSTRUCTOR IN CLONE METHOD
public Vehicle clone() {
        return new Car(this);
    }

# Java ONLY auto-calls the empty constructor
# If there's no empty constructor, you MUST  
# explicitly call super()!