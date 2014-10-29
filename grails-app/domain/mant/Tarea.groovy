package mant

class Tarea {
    
	String descripcion
    String lugar
    User encargado
	PrioridadTarea prioridad
	

	static hasMany = [
		comments: Comment
		]
	
	static constraints = {
		descripcion blank: false
    }

    public String toString(){
		this.description
    }
}
