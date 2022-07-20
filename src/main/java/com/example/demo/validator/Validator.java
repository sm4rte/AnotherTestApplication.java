package com.example.demo.validator;

public interface Validator<T> {
    void validate(T target) throws Exception;
}
