package co.com.models.entities;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PersistentObject implements Serializable{

	private static final long serialVersionUID = -7930250123581827476L;

}
