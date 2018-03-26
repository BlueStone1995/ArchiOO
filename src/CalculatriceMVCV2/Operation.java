package CalculatriceMVCV2;

import Exceptions.DivisionException;

public interface Operation {

	float execute(float a, float b) throws DivisionException;

}
