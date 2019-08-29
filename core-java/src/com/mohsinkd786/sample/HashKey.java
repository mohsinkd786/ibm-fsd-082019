package com.mohsinkd786.sample;

public class HashKey {

	private int id;
	private String keyName;

	public HashKey(int id, String keyName) {
		super();
		this.id = id;
		this.keyName = keyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((keyName == null) ? 0 : keyName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		HashKey other = (HashKey) obj;
		if (id != other.id)
			return false;
		if (keyName == null) {
			if (other.keyName != null)
				return false;
		} else if (!keyName.equals(other.keyName))
			return false;
		return true;
	}

	/*
	 * @Override public boolean equals(Object obj) { HashKey kObj = (HashKey) obj;
	 * if (!keyName.equals(kObj.keyName)) { return false; } return true; }
	 */
}
