package it.uniroma3.siw.authtest.model;

import javax.persistence.*;

/**
 * A User is a generic person who can use our application.
 * Subclasses of User include Admin and Customer.
 * @see User
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * Unique identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", columnDefinition = "serial", nullable = false)
    protected Long id;

    /**
     * The first name of this User
     */
    @Column(name = "first_name")
    protected String firstName;

    /**
     * The last name of this User
     */
    @Column(name = "last_name")
    protected String lastName;

    /**
     * The username of this User for authentication
     */
    @Column(name = "username", unique=true)
    protected String username;

    /**
     * The password of this User for authentication
     */
    @Column(name = "password")
    protected String password;

    /**
     * The authorization role for this User
     */
    @Column(name = "role")
    protected String role;

    /**
     * Constructor
     *
     * @param id The id of this User
     * @param firstName The first name of this User
     * @param lastName The last name of this User
     * @param username The username of this User for authentication
     * @param password The password of this User for authentication
     * @param role The authorization role for this User
     */
    public User(Long id, String firstName, String lastName, String username, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    /**
     * Empty Constructor
     */
     public User() {
    }

    /**
     * Id getter
     * @return the Id for this User
     */
    public Long getId() {
        return id;
    }

    /**
     * Id setter
     * @param id the id for this User
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * First name getter
     * @return the first name for this User
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name setter
     * @param firstName the first name for this User
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name getter
     * @return the last name for this User, as a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name setter
     * @param lastName the last name for this User
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * username getter
     * @return the username for this User
     */
    public String getUsername() {
        return username;
    }

    /**
     * username setter
     * @param username the username for this User
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * password getter
     * @return the password for this User
     */
    public String getPassword() {
        return password;
    }

    /**
     * password setter
     * @param password the password for this User
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * role getter
     * @return role the role for this User
     */
    public String getRole() {
        return role;
    }

    /**
     * role setter
     * @param role the role for this User
     */
    public void setRole(String role) {
        this.role = role;
    }
}
