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
 * Defines a validation error returned by PutPipelineDefinition or ValidatePipelineDefinition. Validation errors prevent pipeline activation. The set of
 * validation errors that can be returned are defined by AWS Data Pipeline.
 * </p>
 */
public class ValidationError implements Serializable {

    /**
     * The identifier of the object that contains the validation error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String id;

    /**
     * A description of the validation error.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> errors;

    /**
     * The identifier of the object that contains the validation error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the object that contains the validation error.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the object that contains the validation error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param id The identifier of the object that contains the validation error.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the object that contains the validation error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param id The identifier of the object that contains the validation error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationError withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A description of the validation error.
     *
     * @return A description of the validation error.
     */
    public java.util.List<String> getErrors() {
        if (errors == null) {
              errors = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              errors.setAutoConstruct(true);
        }
        return errors;
    }
    
    /**
     * A description of the validation error.
     *
     * @param errors A description of the validation error.
     */
    public void setErrors(java.util.Collection<String> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> errorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(errors.size());
        errorsCopy.addAll(errors);
        this.errors = errorsCopy;
    }
    
    /**
     * A description of the validation error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errors A description of the validation error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationError withErrors(String... errors) {
        if (getErrors() == null) setErrors(new java.util.ArrayList<String>(errors.length));
        for (String value : errors) {
            getErrors().add(value);
        }
        return this;
    }
    
    /**
     * A description of the validation error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errors A description of the validation error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationError withErrors(java.util.Collection<String> errors) {
        if (errors == null) {
            this.errors = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> errorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(errors.size());
            errorsCopy.addAll(errors);
            this.errors = errorsCopy;
        }

        return this;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getErrors() != null) sb.append("Errors: " + getErrors() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidationError == false) return false;
        ValidationError other = (ValidationError)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getErrors() == null ^ this.getErrors() == null) return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false) return false; 
        return true;
    }
    
}
    