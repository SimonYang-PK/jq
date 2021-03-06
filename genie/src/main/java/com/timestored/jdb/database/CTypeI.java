package com.timestored.jdb.database;

public interface CTypeI {

	char getCharacterCode();

	short getTypeNum();

	String getLongJavaName();

	String getNativeJavaName();
	
	CTypeI getListType();
	
	String getQName();
}
