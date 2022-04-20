package com.devsuperior.movieflix.resources.exceptions;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Objects;

public class OAuthCustomError {

    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public OAuthCustomError(){
    }

    public OAuthCustomError(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OAuthCustomError that = (OAuthCustomError) o;
        return Objects.equals(error, that.error) && Objects.equals(errorDescription, that.errorDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, errorDescription);
    }
}
