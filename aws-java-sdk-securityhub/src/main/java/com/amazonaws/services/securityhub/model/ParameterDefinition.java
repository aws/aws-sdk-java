/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that describes a security control parameter and the options for customizing it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ParameterDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Description of a control parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The options for customizing a control parameter. Customization options vary based on the data type of the
     * parameter.
     * </p>
     */
    private ConfigurationOptions configurationOptions;

    /**
     * <p>
     * Description of a control parameter.
     * </p>
     * 
     * @param description
     *        Description of a control parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of a control parameter.
     * </p>
     * 
     * @return Description of a control parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of a control parameter.
     * </p>
     * 
     * @param description
     *        Description of a control parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The options for customizing a control parameter. Customization options vary based on the data type of the
     * parameter.
     * </p>
     * 
     * @param configurationOptions
     *        The options for customizing a control parameter. Customization options vary based on the data type of the
     *        parameter.
     */

    public void setConfigurationOptions(ConfigurationOptions configurationOptions) {
        this.configurationOptions = configurationOptions;
    }

    /**
     * <p>
     * The options for customizing a control parameter. Customization options vary based on the data type of the
     * parameter.
     * </p>
     * 
     * @return The options for customizing a control parameter. Customization options vary based on the data type of the
     *         parameter.
     */

    public ConfigurationOptions getConfigurationOptions() {
        return this.configurationOptions;
    }

    /**
     * <p>
     * The options for customizing a control parameter. Customization options vary based on the data type of the
     * parameter.
     * </p>
     * 
     * @param configurationOptions
     *        The options for customizing a control parameter. Customization options vary based on the data type of the
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDefinition withConfigurationOptions(ConfigurationOptions configurationOptions) {
        setConfigurationOptions(configurationOptions);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getConfigurationOptions() != null)
            sb.append("ConfigurationOptions: ").append(getConfigurationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterDefinition == false)
            return false;
        ParameterDefinition other = (ParameterDefinition) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConfigurationOptions() == null ^ this.getConfigurationOptions() == null)
            return false;
        if (other.getConfigurationOptions() != null && other.getConfigurationOptions().equals(this.getConfigurationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOptions() == null) ? 0 : getConfigurationOptions().hashCode());
        return hashCode;
    }

    @Override
    public ParameterDefinition clone() {
        try {
            return (ParameterDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ParameterDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
