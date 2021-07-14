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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Endpoint settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/EndpointSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that you want to give the endpoint settings.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Enumerated values to use for this endpoint.
     * </p>
     */
    private java.util.List<String> enumValues;
    /**
     * <p>
     * A value that marks this endpoint setting as sensitive.
     * </p>
     */
    private Boolean sensitive;
    /**
     * <p>
     * The unit of measure for this endpoint setting.
     * </p>
     */
    private String units;
    /**
     * <p>
     * The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     * </p>
     */
    private String applicability;
    /**
     * <p>
     * The minimum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     */
    private Integer intValueMin;
    /**
     * <p>
     * The maximum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     */
    private Integer intValueMax;
    /**
     * <p>
     * The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code>.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The name that you want to give the endpoint settings.
     * </p>
     * 
     * @param name
     *        The name that you want to give the endpoint settings.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to give the endpoint settings.
     * </p>
     * 
     * @return The name that you want to give the endpoint settings.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to give the endpoint settings.
     * </p>
     * 
     * @param name
     *        The name that you want to give the endpoint settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param type
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @see EndpointSettingTypeValue
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @return The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @see EndpointSettingTypeValue
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param type
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointSettingTypeValue
     */

    public EndpointSetting withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param type
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointSettingTypeValue
     */

    public EndpointSetting withType(EndpointSettingTypeValue type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Enumerated values to use for this endpoint.
     * </p>
     * 
     * @return Enumerated values to use for this endpoint.
     */

    public java.util.List<String> getEnumValues() {
        return enumValues;
    }

    /**
     * <p>
     * Enumerated values to use for this endpoint.
     * </p>
     * 
     * @param enumValues
     *        Enumerated values to use for this endpoint.
     */

    public void setEnumValues(java.util.Collection<String> enumValues) {
        if (enumValues == null) {
            this.enumValues = null;
            return;
        }

        this.enumValues = new java.util.ArrayList<String>(enumValues);
    }

    /**
     * <p>
     * Enumerated values to use for this endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnumValues(java.util.Collection)} or {@link #withEnumValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param enumValues
     *        Enumerated values to use for this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withEnumValues(String... enumValues) {
        if (this.enumValues == null) {
            setEnumValues(new java.util.ArrayList<String>(enumValues.length));
        }
        for (String ele : enumValues) {
            this.enumValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enumerated values to use for this endpoint.
     * </p>
     * 
     * @param enumValues
     *        Enumerated values to use for this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withEnumValues(java.util.Collection<String> enumValues) {
        setEnumValues(enumValues);
        return this;
    }

    /**
     * <p>
     * A value that marks this endpoint setting as sensitive.
     * </p>
     * 
     * @param sensitive
     *        A value that marks this endpoint setting as sensitive.
     */

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    /**
     * <p>
     * A value that marks this endpoint setting as sensitive.
     * </p>
     * 
     * @return A value that marks this endpoint setting as sensitive.
     */

    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * <p>
     * A value that marks this endpoint setting as sensitive.
     * </p>
     * 
     * @param sensitive
     *        A value that marks this endpoint setting as sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withSensitive(Boolean sensitive) {
        setSensitive(sensitive);
        return this;
    }

    /**
     * <p>
     * A value that marks this endpoint setting as sensitive.
     * </p>
     * 
     * @return A value that marks this endpoint setting as sensitive.
     */

    public Boolean isSensitive() {
        return this.sensitive;
    }

    /**
     * <p>
     * The unit of measure for this endpoint setting.
     * </p>
     * 
     * @param units
     *        The unit of measure for this endpoint setting.
     */

    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * <p>
     * The unit of measure for this endpoint setting.
     * </p>
     * 
     * @return The unit of measure for this endpoint setting.
     */

    public String getUnits() {
        return this.units;
    }

    /**
     * <p>
     * The unit of measure for this endpoint setting.
     * </p>
     * 
     * @param units
     *        The unit of measure for this endpoint setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withUnits(String units) {
        setUnits(units);
        return this;
    }

    /**
     * <p>
     * The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     * </p>
     * 
     * @param applicability
     *        The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     */

    public void setApplicability(String applicability) {
        this.applicability = applicability;
    }

    /**
     * <p>
     * The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     * </p>
     * 
     * @return The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     */

    public String getApplicability() {
        return this.applicability;
    }

    /**
     * <p>
     * The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     * </p>
     * 
     * @param applicability
     *        The relevance or validity of an endpoint setting for an engine name and its endpoint type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withApplicability(String applicability) {
        setApplicability(applicability);
        return this;
    }

    /**
     * <p>
     * The minimum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     * 
     * @param intValueMin
     *        The minimum value of an endpoint setting that is of type <code>int</code>.
     */

    public void setIntValueMin(Integer intValueMin) {
        this.intValueMin = intValueMin;
    }

    /**
     * <p>
     * The minimum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     * 
     * @return The minimum value of an endpoint setting that is of type <code>int</code>.
     */

    public Integer getIntValueMin() {
        return this.intValueMin;
    }

    /**
     * <p>
     * The minimum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     * 
     * @param intValueMin
     *        The minimum value of an endpoint setting that is of type <code>int</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withIntValueMin(Integer intValueMin) {
        setIntValueMin(intValueMin);
        return this;
    }

    /**
     * <p>
     * The maximum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     * 
     * @param intValueMax
     *        The maximum value of an endpoint setting that is of type <code>int</code>.
     */

    public void setIntValueMax(Integer intValueMax) {
        this.intValueMax = intValueMax;
    }

    /**
     * <p>
     * The maximum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     * 
     * @return The maximum value of an endpoint setting that is of type <code>int</code>.
     */

    public Integer getIntValueMax() {
        return this.intValueMax;
    }

    /**
     * <p>
     * The maximum value of an endpoint setting that is of type <code>int</code>.
     * </p>
     * 
     * @param intValueMax
     *        The maximum value of an endpoint setting that is of type <code>int</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withIntValueMax(Integer intValueMax) {
        setIntValueMax(intValueMax);
        return this;
    }

    /**
     * <p>
     * The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code>.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     *        <code>ModifyEndpoint</code>.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code>.
     * </p>
     * 
     * @return The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     *         <code>ModifyEndpoint</code>.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code>.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the endpoint setting if no value is specified using <code>CreateEndpoint</code> or
     *        <code>ModifyEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSetting withDefaultValue(String defaultValue) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getEnumValues() != null)
            sb.append("EnumValues: ").append(getEnumValues()).append(",");
        if (getSensitive() != null)
            sb.append("Sensitive: ").append(getSensitive()).append(",");
        if (getUnits() != null)
            sb.append("Units: ").append(getUnits()).append(",");
        if (getApplicability() != null)
            sb.append("Applicability: ").append(getApplicability()).append(",");
        if (getIntValueMin() != null)
            sb.append("IntValueMin: ").append(getIntValueMin()).append(",");
        if (getIntValueMax() != null)
            sb.append("IntValueMax: ").append(getIntValueMax()).append(",");
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

        if (obj instanceof EndpointSetting == false)
            return false;
        EndpointSetting other = (EndpointSetting) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getEnumValues() == null ^ this.getEnumValues() == null)
            return false;
        if (other.getEnumValues() != null && other.getEnumValues().equals(this.getEnumValues()) == false)
            return false;
        if (other.getSensitive() == null ^ this.getSensitive() == null)
            return false;
        if (other.getSensitive() != null && other.getSensitive().equals(this.getSensitive()) == false)
            return false;
        if (other.getUnits() == null ^ this.getUnits() == null)
            return false;
        if (other.getUnits() != null && other.getUnits().equals(this.getUnits()) == false)
            return false;
        if (other.getApplicability() == null ^ this.getApplicability() == null)
            return false;
        if (other.getApplicability() != null && other.getApplicability().equals(this.getApplicability()) == false)
            return false;
        if (other.getIntValueMin() == null ^ this.getIntValueMin() == null)
            return false;
        if (other.getIntValueMin() != null && other.getIntValueMin().equals(this.getIntValueMin()) == false)
            return false;
        if (other.getIntValueMax() == null ^ this.getIntValueMax() == null)
            return false;
        if (other.getIntValueMax() != null && other.getIntValueMax().equals(this.getIntValueMax()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getEnumValues() == null) ? 0 : getEnumValues().hashCode());
        hashCode = prime * hashCode + ((getSensitive() == null) ? 0 : getSensitive().hashCode());
        hashCode = prime * hashCode + ((getUnits() == null) ? 0 : getUnits().hashCode());
        hashCode = prime * hashCode + ((getApplicability() == null) ? 0 : getApplicability().hashCode());
        hashCode = prime * hashCode + ((getIntValueMin() == null) ? 0 : getIntValueMin().hashCode());
        hashCode = prime * hashCode + ((getIntValueMax() == null) ? 0 : getIntValueMax().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public EndpointSetting clone() {
        try {
            return (EndpointSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.EndpointSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
