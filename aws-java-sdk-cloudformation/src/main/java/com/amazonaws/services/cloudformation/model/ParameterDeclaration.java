/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The ParameterDeclaration data type.
 * </p>
 */
public class ParameterDeclaration implements Serializable {

    /**
     * The name that is associated with the parameter.
     */
    private String parameterKey;

    /**
     * The default value of the parameter.
     */
    private String defaultValue;

    /**
     * The type of parameter.
     */
    private String parameterType;

    /**
     * Flag that indicates whether the parameter value is shown as plain text
     * in logs and in the AWS Management Console.
     */
    private Boolean noEcho;

    /**
     * The description that is associate with the parameter.
     */
    private String description;

    /**
     * The name that is associated with the parameter.
     *
     * @return The name that is associated with the parameter.
     */
    public String getParameterKey() {
        return parameterKey;
    }
    
    /**
     * The name that is associated with the parameter.
     *
     * @param parameterKey The name that is associated with the parameter.
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }
    
    /**
     * The name that is associated with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterKey The name that is associated with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterDeclaration withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * The default value of the parameter.
     *
     * @return The default value of the parameter.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value of the parameter.
     *
     * @param defaultValue The default value of the parameter.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The default value of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterDeclaration withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The type of parameter.
     *
     * @return The type of parameter.
     */
    public String getParameterType() {
        return parameterType;
    }
    
    /**
     * The type of parameter.
     *
     * @param parameterType The type of parameter.
     */
    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }
    
    /**
     * The type of parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterType The type of parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterDeclaration withParameterType(String parameterType) {
        this.parameterType = parameterType;
        return this;
    }

    /**
     * Flag that indicates whether the parameter value is shown as plain text
     * in logs and in the AWS Management Console.
     *
     * @return Flag that indicates whether the parameter value is shown as plain text
     *         in logs and in the AWS Management Console.
     */
    public Boolean isNoEcho() {
        return noEcho;
    }
    
    /**
     * Flag that indicates whether the parameter value is shown as plain text
     * in logs and in the AWS Management Console.
     *
     * @param noEcho Flag that indicates whether the parameter value is shown as plain text
     *         in logs and in the AWS Management Console.
     */
    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }
    
    /**
     * Flag that indicates whether the parameter value is shown as plain text
     * in logs and in the AWS Management Console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noEcho Flag that indicates whether the parameter value is shown as plain text
     *         in logs and in the AWS Management Console.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterDeclaration withNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
        return this;
    }

    /**
     * Flag that indicates whether the parameter value is shown as plain text
     * in logs and in the AWS Management Console.
     *
     * @return Flag that indicates whether the parameter value is shown as plain text
     *         in logs and in the AWS Management Console.
     */
    public Boolean getNoEcho() {
        return noEcho;
    }

    /**
     * The description that is associate with the parameter.
     *
     * @return The description that is associate with the parameter.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description that is associate with the parameter.
     *
     * @param description The description that is associate with the parameter.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description that is associate with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description that is associate with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterDeclaration withDescription(String description) {
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
        if (getParameterType() != null) sb.append("ParameterType: " + getParameterType() + ",");
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
        hashCode = prime * hashCode + ((getParameterType() == null) ? 0 : getParameterType().hashCode()); 
        hashCode = prime * hashCode + ((isNoEcho() == null) ? 0 : isNoEcho().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ParameterDeclaration == false) return false;
        ParameterDeclaration other = (ParameterDeclaration)obj;
        
        if (other.getParameterKey() == null ^ this.getParameterKey() == null) return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getParameterType() == null ^ this.getParameterType() == null) return false;
        if (other.getParameterType() != null && other.getParameterType().equals(this.getParameterType()) == false) return false; 
        if (other.isNoEcho() == null ^ this.isNoEcho() == null) return false;
        if (other.isNoEcho() != null && other.isNoEcho().equals(this.isNoEcho()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    