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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * A specification identifying an individual configuration option along with its current value.
 * </p>
 */
public class ConfigurationOptionSetting implements Serializable {

    /**
     * A unique namespace identifying the option's associated AWS resource.
     */
    private String namespace;

    /**
     * The name of the configuration option.
     */
    private String optionName;

    /**
     * The current value for the configuration option.
     */
    private String value;

    /**
     * Default constructor for a new ConfigurationOptionSetting object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ConfigurationOptionSetting() {}
    
    /**
     * Constructs a new ConfigurationOptionSetting object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param namespace A unique namespace identifying the option's
     * associated AWS resource.
     * @param optionName The name of the configuration option.
     * @param value The current value for the configuration option.
     */
    public ConfigurationOptionSetting(String namespace, String optionName, String value) {
        setNamespace(namespace);
        setOptionName(optionName);
        setValue(value);
    }

    /**
     * A unique namespace identifying the option's associated AWS resource.
     *
     * @return A unique namespace identifying the option's associated AWS resource.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     *
     * @param namespace A unique namespace identifying the option's associated AWS resource.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param namespace A unique namespace identifying the option's associated AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionSetting withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The name of the configuration option.
     *
     * @return The name of the configuration option.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * The name of the configuration option.
     *
     * @param optionName The name of the configuration option.
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * The name of the configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName The name of the configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionSetting withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * The current value for the configuration option.
     *
     * @return The current value for the configuration option.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The current value for the configuration option.
     *
     * @param value The current value for the configuration option.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The current value for the configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The current value for the configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigurationOptionSetting withValue(String value) {
        this.value = value;
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
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getOptionName() != null) sb.append("OptionName: " + getOptionName() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigurationOptionSetting == false) return false;
        ConfigurationOptionSetting other = (ConfigurationOptionSetting)obj;
        
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getOptionName() == null ^ this.getOptionName() == null) return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    