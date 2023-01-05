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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an individual setting that controls some aspect of MemoryDB behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/Parameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the parameter
     * </p>
     */
    private String value;
    /**
     * <p>
     * A description of the parameter
     * </p>
     */
    private String description;
    /**
     * <p>
     * The parameter's data type
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     */
    private String minimumEngineVersion;

    /**
     * <p>
     * The name of the parameter
     * </p>
     * 
     * @param name
     *        The name of the parameter
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter
     * </p>
     * 
     * @return The name of the parameter
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter
     * </p>
     * 
     * @param name
     *        The name of the parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the parameter
     * </p>
     * 
     * @param value
     *        The value of the parameter
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the parameter
     * </p>
     * 
     * @return The value of the parameter
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the parameter
     * </p>
     * 
     * @param value
     *        The value of the parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A description of the parameter
     * </p>
     * 
     * @param description
     *        A description of the parameter
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter
     * </p>
     * 
     * @return A description of the parameter
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter
     * </p>
     * 
     * @param description
     *        A description of the parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The parameter's data type
     * </p>
     * 
     * @param dataType
     *        The parameter's data type
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The parameter's data type
     * </p>
     * 
     * @return The parameter's data type
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The parameter's data type
     * </p>
     * 
     * @param dataType
     *        The parameter's data type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the parameter.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @return The valid range of values for the parameter.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The earliest engine version to which the parameter can apply.
     */

    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * 
     * @return The earliest engine version to which the parameter can apply.
     */

    public String getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The earliest engine version to which the parameter can apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withMinimumEngineVersion(String minimumEngineVersion) {
        setMinimumEngineVersion(minimumEngineVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: ").append(getMinimumEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
