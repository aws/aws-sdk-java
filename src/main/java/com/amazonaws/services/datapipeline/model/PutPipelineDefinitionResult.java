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
 * Contains the output of the PutPipelineDefinition action.
 * </p>
 */
public class PutPipelineDefinitionResult implements Serializable {

    /**
     * A list of the validation errors that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ValidationError> validationErrors;

    /**
     * A list of the validation warnings that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ValidationWarning> validationWarnings;

    /**
     * If <code>True</code>, there were validation errors. If errored is
     * <code>True</code>, the pipeline definition is stored but cannot be
     * activated until you correct the pipeline and call
     * <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     */
    private Boolean errored;

    /**
     * A list of the validation errors that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     *
     * @return A list of the validation errors that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     */
    public java.util.List<ValidationError> getValidationErrors() {
        if (validationErrors == null) {
              validationErrors = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationError>();
              validationErrors.setAutoConstruct(true);
        }
        return validationErrors;
    }
    
    /**
     * A list of the validation errors that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     *
     * @param validationErrors A list of the validation errors that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     */
    public void setValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ValidationError> validationErrorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationError>(validationErrors.size());
        validationErrorsCopy.addAll(validationErrors);
        this.validationErrors = validationErrorsCopy;
    }
    
    /**
     * A list of the validation errors that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationErrors A list of the validation errors that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutPipelineDefinitionResult withValidationErrors(ValidationError... validationErrors) {
        if (getValidationErrors() == null) setValidationErrors(new java.util.ArrayList<ValidationError>(validationErrors.length));
        for (ValidationError value : validationErrors) {
            getValidationErrors().add(value);
        }
        return this;
    }
    
    /**
     * A list of the validation errors that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationErrors A list of the validation errors that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutPipelineDefinitionResult withValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ValidationError> validationErrorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationError>(validationErrors.size());
            validationErrorsCopy.addAll(validationErrors);
            this.validationErrors = validationErrorsCopy;
        }

        return this;
    }

    /**
     * A list of the validation warnings that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     *
     * @return A list of the validation warnings that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     */
    public java.util.List<ValidationWarning> getValidationWarnings() {
        if (validationWarnings == null) {
              validationWarnings = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationWarning>();
              validationWarnings.setAutoConstruct(true);
        }
        return validationWarnings;
    }
    
    /**
     * A list of the validation warnings that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     *
     * @param validationWarnings A list of the validation warnings that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     */
    public void setValidationWarnings(java.util.Collection<ValidationWarning> validationWarnings) {
        if (validationWarnings == null) {
            this.validationWarnings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ValidationWarning> validationWarningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationWarning>(validationWarnings.size());
        validationWarningsCopy.addAll(validationWarnings);
        this.validationWarnings = validationWarningsCopy;
    }
    
    /**
     * A list of the validation warnings that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationWarnings A list of the validation warnings that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutPipelineDefinitionResult withValidationWarnings(ValidationWarning... validationWarnings) {
        if (getValidationWarnings() == null) setValidationWarnings(new java.util.ArrayList<ValidationWarning>(validationWarnings.length));
        for (ValidationWarning value : validationWarnings) {
            getValidationWarnings().add(value);
        }
        return this;
    }
    
    /**
     * A list of the validation warnings that are associated with the objects
     * defined in <code>pipelineObjects</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationWarnings A list of the validation warnings that are associated with the objects
     *         defined in <code>pipelineObjects</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutPipelineDefinitionResult withValidationWarnings(java.util.Collection<ValidationWarning> validationWarnings) {
        if (validationWarnings == null) {
            this.validationWarnings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ValidationWarning> validationWarningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationWarning>(validationWarnings.size());
            validationWarningsCopy.addAll(validationWarnings);
            this.validationWarnings = validationWarningsCopy;
        }

        return this;
    }

    /**
     * If <code>True</code>, there were validation errors. If errored is
     * <code>True</code>, the pipeline definition is stored but cannot be
     * activated until you correct the pipeline and call
     * <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     *
     * @return If <code>True</code>, there were validation errors. If errored is
     *         <code>True</code>, the pipeline definition is stored but cannot be
     *         activated until you correct the pipeline and call
     *         <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     */
    public Boolean isErrored() {
        return errored;
    }
    
    /**
     * If <code>True</code>, there were validation errors. If errored is
     * <code>True</code>, the pipeline definition is stored but cannot be
     * activated until you correct the pipeline and call
     * <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     *
     * @param errored If <code>True</code>, there were validation errors. If errored is
     *         <code>True</code>, the pipeline definition is stored but cannot be
     *         activated until you correct the pipeline and call
     *         <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     */
    public void setErrored(Boolean errored) {
        this.errored = errored;
    }
    
    /**
     * If <code>True</code>, there were validation errors. If errored is
     * <code>True</code>, the pipeline definition is stored but cannot be
     * activated until you correct the pipeline and call
     * <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errored If <code>True</code>, there were validation errors. If errored is
     *         <code>True</code>, the pipeline definition is stored but cannot be
     *         activated until you correct the pipeline and call
     *         <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutPipelineDefinitionResult withErrored(Boolean errored) {
        this.errored = errored;
        return this;
    }

    /**
     * If <code>True</code>, there were validation errors. If errored is
     * <code>True</code>, the pipeline definition is stored but cannot be
     * activated until you correct the pipeline and call
     * <a>PutPipelineDefinition</a> to commit the corrected pipeline.
     *
     * @return If <code>True</code>, there were validation errors. If errored is
     *         <code>True</code>, the pipeline definition is stored but cannot be
     *         activated until you correct the pipeline and call
     *         <a>PutPipelineDefinition</a> to commit the corrected pipeline.
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
        if (getValidationWarnings() != null) sb.append("ValidationWarnings: " + getValidationWarnings() + ",");
        if (isErrored() != null) sb.append("Errored: " + isErrored() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode()); 
        hashCode = prime * hashCode + ((getValidationWarnings() == null) ? 0 : getValidationWarnings().hashCode()); 
        hashCode = prime * hashCode + ((isErrored() == null) ? 0 : isErrored().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutPipelineDefinitionResult == false) return false;
        PutPipelineDefinitionResult other = (PutPipelineDefinitionResult)obj;
        
        if (other.getValidationErrors() == null ^ this.getValidationErrors() == null) return false;
        if (other.getValidationErrors() != null && other.getValidationErrors().equals(this.getValidationErrors()) == false) return false; 
        if (other.getValidationWarnings() == null ^ this.getValidationWarnings() == null) return false;
        if (other.getValidationWarnings() != null && other.getValidationWarnings().equals(this.getValidationWarnings()) == false) return false; 
        if (other.isErrored() == null ^ this.isErrored() == null) return false;
        if (other.isErrored() != null && other.isErrored().equals(this.isErrored()) == false) return false; 
        return true;
    }
    
}
    