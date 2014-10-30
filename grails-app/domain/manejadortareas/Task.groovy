package manejadortareas

class Task {
	
	String description
	
	static hasMany = [
		comments: Comment
	]
	
    static constraints = {
		description blank: false
    }
}
