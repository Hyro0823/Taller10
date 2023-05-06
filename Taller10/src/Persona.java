import java.util.Date;

public class Persona {
	
	public Persona(String nombre, int edad, String direccion, String ciudad, String pais) {
	}

	public class Person {
	private String firstName; private String middleName; private String lastName; private Date dateOfBirth;

	public Person(String firstName, String middleName,
	String lastName, Date dateOfBirth){
	this.firstName = firstName; this.middleName = middleName; this.lastName = lastName; this.dateOfBirth = dateOfBirth;
	}


	/**
	*	Returns a String of the firstName
	*	@return firstName
	*/
	public String getFirstName(){
	return firstName;
	}

	/**
	*	Returns a string of the middleName
	*	@return middleName
	*/
	public String getMiddleName(){
	return middleName;
	}

	/**
	*	Returns a String of the lastName
	*	@return lastName
	*/
	public String getLastName(){
	return lastName;
	}

	/**
	*	Returns a concatenated string of the Person's name
	*	@return the Person's first, middle, and last name.
	*/
	public String getName(){
	return firstName + " " + middleName + " " + lastName;
	}

	/**
	*	Returns the Person's date of birth as a date type
	*	@return a Date type of the Person's date of birth.
	*/
	public Date getDateOfBirth(){
	return dateOfBirth;
	}
	}

	public class Alumno extends Persona {
	    private int idAlumno;
	    private double gpa;
	    private String carrera;
	    private String titulo;
	    private int anioGraduacion;

	    public Alumno(String nombre, int edad, String direccion, String ciudad, String pais, int idAlumno, double gpa, String carrera, String titulo, int anioGraduacion) {
	        super(nombre, edad, direccion, ciudad, pais);
	        this.idAlumno = idAlumno;
	        this.gpa = gpa;
	        this.carrera = carrera;
	        this.titulo = titulo;
	        this.anioGraduacion = anioGraduacion;
	    }

	    public int getIdAlumno() {
	        return idAlumno;
	    }

	    public void setIdAlumno(int idAlumno) {
	        this.idAlumno = idAlumno;
	    }

	    public double getGpa() {
	        return gpa;
	    }

	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    public String getCarrera() {
	        return carrera;
	    }

	    public void setCarrera(String carrera) {
	        this.carrera = carrera;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public int getAnioGraduacion() {
	        return anioGraduacion;
	    }

	    public void setAnioGraduacion(int anioGraduacion) {
	        this.anioGraduacion = anioGraduacion;
	    }

	    public void cambiarCarrera(String nuevaCarrera) {
	        this.carrera = nuevaCarrera;
	    }

	    public double calcularGpa(double[] calificaciones) {
	        double total = 0;
	        for (double calificacion : calificaciones) {
	            total += calificacion;
	        }
	        return total / calificaciones.length;
	    }
	}
}
