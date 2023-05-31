/**
 * File         : DAOManager.java
 * Nama         : Oktaviana Sadama Nur Azizah
 * Tanggal      : 2023-05-31
 * Deskripsi    : Pengelola DAO dalam program
**/

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}