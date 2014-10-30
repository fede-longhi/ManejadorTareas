package manejadortareas

class Calendar {
	
	String name
	
	static belongsTo = [
		group: Group,	
	]
		
	static hasMany = [
		events: Event
	]
	
    static constraints = {
    }
}
