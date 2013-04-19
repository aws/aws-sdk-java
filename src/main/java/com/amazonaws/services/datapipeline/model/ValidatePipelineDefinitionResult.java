/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;
import java.io.Serializable;

/**
 * <p>
 * Contains the output from the ValidatePipelineDefinition action.
 * </p>
 */
public class ValidatePipelineDefinitionResult  implements Serializable  {

    /**
     * Lists the validation errors that were found by
     * ValidatePipelineDefinition.
     */
    private java.util.List<ValidationError> validationErrors;

    /**
     * If <code>True</code>, there were validation errors.
     */
    private Boolean errored;

    /**
     * Lists the validation errors that were found by
     * ValidatePipelineDefinition.
     *
     * @return Lists the validation errors that were found by
     *         ValidatePipelineDefinition.
     */
    public java.util.List<ValidationError> getValidationErrors() {
        
        if (validationErrors == null) {
            validationErrors = new java.util.ArrayList<ValidationError>();
        }
        return validationErrors;
    }
    
    /**
     * Lists the validation errors that were found by
     * ValidatePipelineDefinition.
     *
     * @param validationErrors Lists the validation errors that were found by
     *         ValidatePipelineDefinition.
     */
    public void setValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        java.util.List<ValidationError> validationErrorsCopy = new java.util.ArrayList<ValidationError>(validationErrors.size());
        validationErrorsCopy.addAll(validationErrors);
        this.validationErrors = validationErrorsCopy;
    }
    
    /**
     * Lists the validation errors that were found by
     * ValidatePipelineDefinition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationErrors Lists the validation errors that were found by
     *         ValidatePipelineDefinition.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidatePipelineDefinitionResult withValidationErrors(ValidationError... validationErrors) {
        if (getValidationErrors() == null) setValidationErrors(new java.util.ArrayList<ValidationError>(validationErrors.length));
        for (ValidationError value : validationErrors) {
            getValidationErrors().add(value);
        }
        return this;
    }
    
    /**
     * Lists the validation errors that were found by
     * ValidatePipelineDefinition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationErrors Lists the validation errors that were found by
     *         ValidatePipelineDefinition.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidatePipelineDefinitionResult withValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
        } else {
            java.util.List<ValidationError> validationErrorsCopy = new java.util.ArrayList<ValidationError>(validationErrors.size());
            validationErrorsCopy.addAll(validationErrors);
            this.validationErrors = validationErrorsCopy;
        }

        return this;
    }
    
    /**
     * If <code>True</code>, there were validation errors.
     *
     * @return If <code>True</code>, there were validation errors.
     */
    public Boolean isErrored() {
        return errored;
    }
    
    /**
     * If <code>True</code>, there were validation errors.
     *
     * @param errored If <code>True</code>, there were validation errors.
     */
    public void setErrored(Boolean errored) {
        this.errored = errored;
    }
    
    /**
     * If <code>True</code>, there were validation errors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errored If <code>True</code>, there were validation errors.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidatePipelineDefinitionResult withErrored(Boolean errored) {
        this.errored = errored;
        return this;
    }
    
    
    /**
     * If <code>True</code>, there were validation errors.
     *
     * @return If <code>True</code>, there were validation errors.
     */
    public Boolean getErrored() {
        return errored;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getValidationErrors() != null) sb.append("ValidationErrors: " + getValidationErrors() + ",");    	
        if (isErrored() != null) sb.append("Errored: " + isErrored() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode()); 
        hashCode = prime * hashCode + ((isErrored() == null) ? 0 : isErrored().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidatePipelineDefinitionResult == false) return false;
        ValidatePipelineDefinitionResult other = (ValidatePipelineDefinitionResult)obj;
        
        if (other.getValidationErrors() == null ^ this.getValidationErrors() == null) return false;
        if (other.getValidationErrors() != null && other.getValidationErrors().equals(this.getValidationErrors()) == false) return false; 
        if (other.isErrored() == null ^ this.isErrored() == null) return false;
        if (other.isErrored() != null && other.isErrored().equals(this.isErrored()) == false) return false; 
        return true;
    }
    
}
    