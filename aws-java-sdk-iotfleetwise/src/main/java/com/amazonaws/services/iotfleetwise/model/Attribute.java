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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A signal that represents static information about the vehicle, such as engine type or manufacturing date.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/Attribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     * <code>Vehicle.Body.Engine.Type</code>.
     * </p>
     */
    private String fullyQualifiedName;
    /**
     * <p>
     * The specified data type of the attribute.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * A brief description of the attribute.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The scientific unit for the attribute.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * A list of possible values an attribute can be assigned.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * The specified possible minimum value of the attribute.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The specified possible maximum value of the attribute.
     * </p>
     */
    private Double max;
    /**
     * <p>
     * A specified value for the attribute.
     * </p>
     */
    @Deprecated
    private String assignedValue;
    /**
     * <p>
     * The default value of the attribute.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     * <code>Vehicle.Body.Engine.Type</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     *        <code>Vehicle.Body.Engine.Type</code>.
     */

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     * <code>Vehicle.Body.Engine.Type</code>.
     * </p>
     * 
     * @return The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     *         <code>Vehicle.Body.Engine.Type</code>.
     */

    public String getFullyQualifiedName() {
        return this.fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     * <code>Vehicle.Body.Engine.Type</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be
     *        <code>Vehicle.Body.Engine.Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withFullyQualifiedName(String fullyQualifiedName) {
        setFullyQualifiedName(fullyQualifiedName);
        return this;
    }

    /**
     * <p>
     * The specified data type of the attribute.
     * </p>
     * 
     * @param dataType
     *        The specified data type of the attribute.
     * @see NodeDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The specified data type of the attribute.
     * </p>
     * 
     * @return The specified data type of the attribute.
     * @see NodeDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The specified data type of the attribute.
     * </p>
     * 
     * @param dataType
     *        The specified data type of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataType
     */

    public Attribute withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The specified data type of the attribute.
     * </p>
     * 
     * @param dataType
     *        The specified data type of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataType
     */

    public Attribute withDataType(NodeDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * A brief description of the attribute.
     * </p>
     * 
     * @param description
     *        A brief description of the attribute.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the attribute.
     * </p>
     * 
     * @return A brief description of the attribute.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the attribute.
     * </p>
     * 
     * @param description
     *        A brief description of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The scientific unit for the attribute.
     * </p>
     * 
     * @param unit
     *        The scientific unit for the attribute.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The scientific unit for the attribute.
     * </p>
     * 
     * @return The scientific unit for the attribute.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The scientific unit for the attribute.
     * </p>
     * 
     * @param unit
     *        The scientific unit for the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * A list of possible values an attribute can be assigned.
     * </p>
     * 
     * @return A list of possible values an attribute can be assigned.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * A list of possible values an attribute can be assigned.
     * </p>
     * 
     * @param allowedValues
     *        A list of possible values an attribute can be assigned.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * A list of possible values an attribute can be assigned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        A list of possible values an attribute can be assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of possible values an attribute can be assigned.
     * </p>
     * 
     * @param allowedValues
     *        A list of possible values an attribute can be assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The specified possible minimum value of the attribute.
     * </p>
     * 
     * @param min
     *        The specified possible minimum value of the attribute.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The specified possible minimum value of the attribute.
     * </p>
     * 
     * @return The specified possible minimum value of the attribute.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The specified possible minimum value of the attribute.
     * </p>
     * 
     * @param min
     *        The specified possible minimum value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The specified possible maximum value of the attribute.
     * </p>
     * 
     * @param max
     *        The specified possible maximum value of the attribute.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The specified possible maximum value of the attribute.
     * </p>
     * 
     * @return The specified possible maximum value of the attribute.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The specified possible maximum value of the attribute.
     * </p>
     * 
     * @param max
     *        The specified possible maximum value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withMax(Double max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * A specified value for the attribute.
     * </p>
     * 
     * @param assignedValue
     *        A specified value for the attribute.
     */
    @Deprecated
    public void setAssignedValue(String assignedValue) {
        this.assignedValue = assignedValue;
    }

    /**
     * <p>
     * A specified value for the attribute.
     * </p>
     * 
     * @return A specified value for the attribute.
     */
    @Deprecated
    public String getAssignedValue() {
        return this.assignedValue;
    }

    /**
     * <p>
     * A specified value for the attribute.
     * </p>
     * 
     * @param assignedValue
     *        A specified value for the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Attribute withAssignedValue(String assignedValue) {
        setAssignedValue(assignedValue);
        return this;
    }

    /**
     * <p>
     * The default value of the attribute.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the attribute.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute.
     * </p>
     * 
     * @return The default value of the attribute.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withDefaultValue(String defaultValue) {
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
        if (getFullyQualifiedName() != null)
            sb.append("FullyQualifiedName: ").append(getFullyQualifiedName()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getAssignedValue() != null)
            sb.append("AssignedValue: ").append(getAssignedValue()).append(",");
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

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;
        if (other.getFullyQualifiedName() == null ^ this.getFullyQualifiedName() == null)
            return false;
        if (other.getFullyQualifiedName() != null && other.getFullyQualifiedName().equals(this.getFullyQualifiedName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getAssignedValue() == null ^ this.getAssignedValue() == null)
            return false;
        if (other.getAssignedValue() != null && other.getAssignedValue().equals(this.getAssignedValue()) == false)
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

        hashCode = prime * hashCode + ((getFullyQualifiedName() == null) ? 0 : getFullyQualifiedName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getAssignedValue() == null) ? 0 : getAssignedValue().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.AttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
