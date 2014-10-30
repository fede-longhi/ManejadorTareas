package manejadortareas

class Comment {
	
	String text
	User user
	
	static belongsTo = [
		task: Task,
	]
	
    static constraints = {
		text blank: false
    }
	
	public String toString(){
		"${this.text} by ${this.user}"
	}
}
