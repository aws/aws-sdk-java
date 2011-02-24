/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The TemplateParameter data type.
 * </p>
 */
public class TemplateParameter {

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
        sb.append("ParameterKey: " + parameterKey + ", ");
        sb.append("DefaultValue: " + defaultValue + ", ");
        sb.append("NoEcho: " + noEcho + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    