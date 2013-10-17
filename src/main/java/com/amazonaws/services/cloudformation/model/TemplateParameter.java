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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The TemplateParameter data type.
 * </p>
 */
public class TemplateParameter implements Serializable {

    /**
     * The name associated with the parameter.
     */
    private String parameterKey;

    /**
     * The default value associated with the parameter.
     */
    private String defaultValue;

    /**
     * Flag indicating whether the parameter should be displayed as plain
     * text in logs and UIs.
     */
    private Boolean noEcho;

    /**
     * User defined description associated with the parameter.
     */
    private String description;

    /**
     * The name associated with the parameter.
     *
     * @return The name associated with the parameter.
     */
    public String getParameterKey() {
        return parameterKey;
    }
    
    /**
     * The name associated with the parameter.
     *
     * @param parameterKey The name associated with the parameter.
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }
    
    /**
     * The name associated with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterKey The name associated with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TemplateParameter withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * The default value associated with the parameter.
     *
     * @return The default value associated with the parameter.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value associated with the parameter.
     *
     * @param defaultValue The default value associated with the parameter.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value associated with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The default value associated with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TemplateParameter withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Flag indicating whether the parameter should be displayed as plain
     * text in logs and UIs.
     *
     * @return Flag indicating whether the parameter should be displayed as plain
     *         text in logs and UIs.
     */
    public Boolean isNoEcho() {
        return noEcho;
    }
    
    /**
     * Flag indicating whether the parameter should be displayed as plain
     * text in logs and UIs.
     *
     * @param noEcho Flag indicating whether the parameter should be displayed as plain
     *         text in logs and UIs.
     */
    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }
    
    /**
     * Flag indicating whether the parameter should be displayed as plain
     * text in logs and UIs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noEcho Flag indicating whether the parameter should be displayed as plain
     *         text in logs and UIs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TemplateParameter withNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
        return this;
    }

    /**
     * Flag indicating whether the parameter should be displayed as plain
     * text in logs and UIs.
     *
     * @return Flag indicating whether the parameter should be displayed as plain
     *         text in logs and UIs.
     */
    public Boolean getNoEcho() {
        return noEcho;
    }

    /**
     * User defined description associated with the parameter.
     *
     * @return User defined description associated with the parameter.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * User defined description associated with the parameter.
     *
     * @param description User defined description associated with the parameter.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * User defined description associated with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description User defined description associated with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TemplateParameter withDescription(String description) {
        this.description = description;
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
        if (getParameterKey() != null) sb.append("ParameterKey: " + getParameterKey() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (isNoEcho() != null) sb.append("NoEcho: " + isNoEcho() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((isNoEcho() == null) ? 0 : isNoEcho().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TemplateParameter == false) return false;
        TemplateParameter other = (TemplateParameter)obj;
        
        if (other.getParameterKey() == null ^ this.getParameterKey() == null) return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.isNoEcho() == null ^ this.isNoEcho() == null) return false;
        if (other.isNoEcho() != null && other.isNoEcho().equals(this.isNoEcho()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    