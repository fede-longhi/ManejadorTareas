package manejadortareas

class Group {

	String name
	
	static hasMany = [
		users: User,
		calendar: Calendar, 
	]
	
    static constraints = {
    }
	
	String toString(){
		this.name
	}
}
