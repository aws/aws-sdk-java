/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A specification identifying an individual configuration option along with its current value. For a list of possible
 * option values, go to <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html">Option
 * Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ConfigurationOptionSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationOptionSetting implements Serializable, Cloneable {

    /**
     * <p>
     * A unique resource name for a time-based scaling configuration option.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the configuration option.
     * </p>
     */
    private String optionName;
    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     */
    private String value;

    /**
     * Default constructor for ConfigurationOptionSetting object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ConfigurationOptionSetting() {
    }

    /**
     * Constructs a new ConfigurationOptionSetting object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param namespace
     *        A unique namespace identifying the option's associated AWS resource.
     * @param optionName
     *        The name of the configuration option.
     * @param value
     *        The current value for the configuration option.
     */
    public ConfigurationOptionSetting(String namespace, String optionName, String value) {
        setNamespace(namespace);
        setOptionName(optionName);
        setValue(value);
    }

    /**
     * <p>
     * A unique resource name for a time-based scaling configuration option.
     * </p>
     * 
     * @param resourceName
     *        A unique resource name for a time-based scaling configuration option.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * A unique resource name for a time-based scaling configuration option.
     * </p>
     * 
     * @return A unique resource name for a time-based scaling configuration option.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * A unique resource name for a time-based scaling configuration option.
     * </p>
     * 
     * @param resourceName
     *        A unique resource name for a time-based scaling configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionSetting withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     * 
     * @param namespace
     *        A unique namespace identifying the option's associated AWS resource.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     * 
     * @return A unique namespace identifying the option's associated AWS resource.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * A unique namespace identifying the option's associated AWS resource.
     * </p>
     * 
     * @param namespace
     *        A unique namespace identifying the option's associated AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionSetting withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * 
     * @param optionName
     *        The name of the configuration option.
     */

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * 
     * @return The name of the configuration option.
     */

    public String getOptionName() {
        return this.optionName;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * 
     * @param optionName
     *        The name of the configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionSetting withOptionName(String optionName) {
        setOptionName(optionName);
        return this;
    }

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     * 
     * @param value
     *        The current value for the configuration option.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     * 
     * @return The current value for the configuration option.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     * 
     * @param value
     *        The current value for the configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptionSetting withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getOptionName() != null)
            sb.append("OptionName: ").append(getOptionName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationOptionSetting == false)
            return false;
        ConfigurationOptionSetting other = (ConfigurationOptionSetting) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationOptionSetting clone() {
        try {
            return (ConfigurationOptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
