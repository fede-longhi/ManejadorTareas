package manejadortareas

class User {
	
	String name
	String lastname
	int id
	String password
	
	static belongsTo = [
		group: Group,	
	]

    static constraints = {
		name blank: false
		lastname blank: false
		password blank: false
		id unique: true
    }
	
	public String toString(){
		"${this.lastname}, ${this.name}"
	}
}
