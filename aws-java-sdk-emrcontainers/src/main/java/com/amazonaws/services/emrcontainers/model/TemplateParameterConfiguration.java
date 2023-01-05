/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of a job template parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/TemplateParameterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateParameterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The default value for the job template parameter.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * </p>
     * 
     * @param type
     *        The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * @see TemplateParameterDataType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * </p>
     * 
     * @return The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * @see TemplateParameterDataType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * </p>
     * 
     * @param type
     *        The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateParameterDataType
     */

    public TemplateParameterConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * </p>
     * 
     * @param type
     *        The type of the job template parameter. Allowed values are: ‘String’, ‘Number’.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateParameterDataType
     */

    public TemplateParameterConfiguration withType(TemplateParameterDataType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The default value for the job template parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the job template parameter.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the job template parameter.
     * </p>
     * 
     * @return The default value for the job template parameter.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for the job template parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the job template parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateParameterConfiguration withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateParameterConfiguration == false)
            return false;
        TemplateParameterConfiguration other = (TemplateParameterConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public TemplateParameterConfiguration clone() {
        try {
            return (TemplateParameterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.TemplateParameterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
