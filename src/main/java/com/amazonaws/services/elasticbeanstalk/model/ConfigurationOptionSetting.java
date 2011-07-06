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
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * A specification identifying an individual configuration option along
 * with its current value.
 * </p>
 */
public class ConfigurationOptionSetting {

    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String namespace;

    /**
     * The name of the configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String optionName;

    /**
     * The current value for the configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
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
        this.namespace = namespace;
        this.optionName = optionName;
        this.value = value;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return A unique namespace identifying the option's associated AWS resource.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration option.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * The name of the configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return The current value for the configuration option.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The current value for the configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
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
        sb.append("Namespace: " + namespace + ", ");
        sb.append("OptionName: " + optionName + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    