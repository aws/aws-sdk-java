/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration option setting for the environment.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticBeanstalkEnvironmentOptionSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticBeanstalkEnvironmentOptionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of resource that the configuration option is associated with.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String optionName;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The value of the configuration setting.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of resource that the configuration option is associated with.
     * </p>
     * 
     * @param namespace
     *        The type of resource that the configuration option is associated with.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The type of resource that the configuration option is associated with.
     * </p>
     * 
     * @return The type of resource that the configuration option is associated with.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The type of resource that the configuration option is associated with.
     * </p>
     * 
     * @param namespace
     *        The type of resource that the configuration option is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentOptionSetting withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param optionName
     *        The name of the option.
     */

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @return The name of the option.
     */

    public String getOptionName() {
        return this.optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param optionName
     *        The name of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentOptionSetting withOptionName(String optionName) {
        setOptionName(optionName);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentOptionSetting withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The value of the configuration setting.
     * </p>
     * 
     * @param value
     *        The value of the configuration setting.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the configuration setting.
     * </p>
     * 
     * @return The value of the configuration setting.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the configuration setting.
     * </p>
     * 
     * @param value
     *        The value of the configuration setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentOptionSetting withValue(String value) {
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getOptionName() != null)
            sb.append("OptionName: ").append(getOptionName()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
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

        if (obj instanceof AwsElasticBeanstalkEnvironmentOptionSetting == false)
            return false;
        AwsElasticBeanstalkEnvironmentOptionSetting other = (AwsElasticBeanstalkEnvironmentOptionSetting) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticBeanstalkEnvironmentOptionSetting clone() {
        try {
            return (AwsElasticBeanstalkEnvironmentOptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticBeanstalkEnvironmentOptionSettingMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
