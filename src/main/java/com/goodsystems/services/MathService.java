package com.goodsystems.services;

import org.springframework.stereotype.Service;

import com.goodsystems.exceptions.UnsupportedMathOperationException;

@Service
public class MathService {

	public Double sum(String numberOne, String numberTwo) {
		if (errorVerify(numberOne, numberTwo) != null) {
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	public Double subtraction(String numberOne, String numberTwo) {
		if (errorVerify(numberOne, numberTwo) != null) {
		}
		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}

	public Double multiplication(String numberOne, String numberTwo) {
		if (errorVerify(numberOne, numberTwo) != null) {
		}
		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}

	public Double division(String numberOne, String numberTwo) {
		if (errorVerify(numberOne, numberTwo) != null) {
		}
		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}

	public Double average(String numberOne, String numberTwo) {
		if (errorVerify(numberOne, numberTwo) != null) {
		}
		return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
	}

	public Double squareRoot(String number) {
		if (!isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Math.sqrt(convertToDouble(number));
	}

	public Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	public boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	public Exception errorVerify(String numberOne, String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return null;
	}
}
