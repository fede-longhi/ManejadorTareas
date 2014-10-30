package manejadortareas

class Event {
	
	String description
	User assignedTo
	User assigner
	
	static hasMany = [
		tasks: Task
		]
	
    static constraints = {
    }
}
