package sgaa.server.controller;

import java.sql.Date;

import javax.swing.ImageIcon;

import sgaa.server.dao.PetDAO;
import sgaa.server.dataStructure.Stack.StackArray;
import sgaa.server.dto.PetDTO;

public class PetController<T>
{
	private PetDAO<T> dao;
	
	public PetController() 
	{
		dao = new PetDAO<T>();
	}
	
	public boolean insert(int id, String name, String color, String address, Date birthdate, boolean state, int breed, String mail, ImageIcon image) 
	{
		PetDTO dato = new PetDTO(id, name, color, address, birthdate, state, breed, mail, image);
		return dao.insert(dato);
	}

	public boolean update(int id, String name, String color, String address, Date birthdate, boolean state, int breed, String mail, ImageIcon image) 
	{
		PetDTO dato = new PetDTO(id, name, color, address, birthdate, state, breed, mail, image);
		return dao.update(dato);
	}

	public boolean delete(int id) 
	{
		PetDTO dato = new PetDTO();
		dato.setId(id);
		return dao.delete(dato);
	}

	public PetDTO findById(int id) 
	{
		PetDTO dato = new PetDTO();
		dato.setId(id);
		return (PetDTO) dao.findById(dato);
	}
	
	public StackArray<PetDTO>findAll()
	{
		PetDTO dato = new PetDTO();
		return dao.findAll(dato);
	}
}
