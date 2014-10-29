package mant
	
class User {
	String name
	String apellido
	int id
	
    static constraints = {
		name blank: false
		apellido blank: false
		id blank: false, unique:true
    }
    
    public String toString(){
		this.name
	}
}
