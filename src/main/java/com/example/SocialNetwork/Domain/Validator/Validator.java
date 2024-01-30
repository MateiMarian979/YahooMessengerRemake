package com.example.SocialNetwork.Domain.Validator;

public interface Validator<T> {
    void validate(T entity) throws ValidationException;
}
