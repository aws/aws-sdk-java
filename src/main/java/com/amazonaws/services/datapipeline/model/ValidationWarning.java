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
 * Defines a validation warning returned by PutPipelineDefinition or ValidatePipelineDefinition. Validation warnings do not prevent pipeline activation.
 * The set of validation warnings that can be returned are defined by AWS Data Pipeline.
 * </p>
 */
public class ValidationWarning implements Serializable {

    /**
     * The identifier of the object that contains the validation warning.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String id;

    /**
     * A description of the validation warning.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> warnings;

    /**
     * The identifier of the object that contains the validation warning.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the object that contains the validation warning.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the object that contains the validation warning.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param id The identifier of the object that contains the validation warning.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the object that contains the validation warning.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param id The identifier of the object that contains the validation warning.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationWarning withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A description of the validation warning.
     *
     * @return A description of the validation warning.
     */
    public java.util.List<String> getWarnings() {
        if (warnings == null) {
              warnings = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              warnings.setAutoConstruct(true);
        }
        return warnings;
    }
    
    /**
     * A description of the validation warning.
     *
     * @param warnings A description of the validation warning.
     */
    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> warningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(warnings.size());
        warningsCopy.addAll(warnings);
        this.warnings = warningsCopy;
    }
    
    /**
     * A description of the validation warning.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warnings A description of the validation warning.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationWarning withWarnings(String... warnings) {
        if (getWarnings() == null) setWarnings(new java.util.ArrayList<String>(warnings.length));
        for (String value : warnings) {
            getWarnings().add(value);
        }
        return this;
    }
    
    /**
     * A description of the validation warning.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warnings A description of the validation warning.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationWarning withWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> warningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(warnings.size());
            warningsCopy.addAll(warnings);
            this.warnings = warningsCopy;
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
        if (getWarnings() != null) sb.append("Warnings: " + getWarnings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidationWarning == false) return false;
        ValidationWarning other = (ValidationWarning)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getWarnings() == null ^ this.getWarnings() == null) return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false) return false; 
        return true;
    }
    
}
    