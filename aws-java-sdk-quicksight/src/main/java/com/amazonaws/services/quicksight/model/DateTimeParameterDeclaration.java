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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A parameter declaration for the <code>DateTime</code> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DateTimeParameterDeclaration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateTimeParameterDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     */
    private DateTimeDefaultValues defaultValues;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;
    /**
     * <p>
     * The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not been
     * set.
     * </p>
     */
    private DateTimeValueWhenUnsetConfiguration valueWhenUnset;

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     * 
     * @param name
     *        The name of the parameter that is being declared.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     * 
     * @return The name of the parameter that is being declared.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     * 
     * @param name
     *        The name of the parameter that is being declared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeParameterDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     * 
     * @param defaultValues
     *        The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default
     *        value can be provided.
     */

    public void setDefaultValues(DateTimeDefaultValues defaultValues) {
        this.defaultValues = defaultValues;
    }

    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     * 
     * @return The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default
     *         value can be provided.
     */

    public DateTimeDefaultValues getDefaultValues() {
        return this.defaultValues;
    }

    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     * 
     * @param defaultValues
     *        The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default
     *        value can be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeParameterDeclaration withDefaultValues(DateTimeDefaultValues defaultValues) {
        setDefaultValues(defaultValues);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TimeGranularity
     */

    public void setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @return The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TimeGranularity
     */

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public DateTimeParameterDeclaration withTimeGranularity(String timeGranularity) {
        setTimeGranularity(timeGranularity);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public DateTimeParameterDeclaration withTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
        return this;
    }

    /**
     * <p>
     * The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not been
     * set.
     * </p>
     * 
     * @param valueWhenUnset
     *        The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not
     *        been set.
     */

    public void setValueWhenUnset(DateTimeValueWhenUnsetConfiguration valueWhenUnset) {
        this.valueWhenUnset = valueWhenUnset;
    }

    /**
     * <p>
     * The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not been
     * set.
     * </p>
     * 
     * @return The configuration that defines the default value of a <code>DateTime</code> parameter when a value has
     *         not been set.
     */

    public DateTimeValueWhenUnsetConfiguration getValueWhenUnset() {
        return this.valueWhenUnset;
    }

    /**
     * <p>
     * The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not been
     * set.
     * </p>
     * 
     * @param valueWhenUnset
     *        The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not
     *        been set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeParameterDeclaration withValueWhenUnset(DateTimeValueWhenUnsetConfiguration valueWhenUnset) {
        setValueWhenUnset(valueWhenUnset);
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
        if (getDefaultValues() != null)
            sb.append("DefaultValues: ").append(getDefaultValues()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity()).append(",");
        if (getValueWhenUnset() != null)
            sb.append("ValueWhenUnset: ").append(getValueWhenUnset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateTimeParameterDeclaration == false)
            return false;
        DateTimeParameterDeclaration other = (DateTimeParameterDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultValues() == null ^ this.getDefaultValues() == null)
            return false;
        if (other.getDefaultValues() != null && other.getDefaultValues().equals(this.getDefaultValues()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        if (other.getValueWhenUnset() == null ^ this.getValueWhenUnset() == null)
            return false;
        if (other.getValueWhenUnset() != null && other.getValueWhenUnset().equals(this.getValueWhenUnset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultValues() == null) ? 0 : getDefaultValues().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        hashCode = prime * hashCode + ((getValueWhenUnset() == null) ? 0 : getValueWhenUnset().hashCode());
        return hashCode;
    }

    @Override
    public DateTimeParameterDeclaration clone() {
        try {
            return (DateTimeParameterDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DateTimeParameterDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
