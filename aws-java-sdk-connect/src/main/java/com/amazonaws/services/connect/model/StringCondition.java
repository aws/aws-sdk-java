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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A leaf node condition which can be used to specify a string condition.
 * </p>
 * <note>
 * <p>
 * The currently supported value for <code>FieldName</code>: <code>name</code>
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StringCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * The value of the string.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     */
    private String comparisonType;

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     * 
     * @param fieldName
     *        The name of the field in the string condition.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     * 
     * @return The name of the field in the string condition.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     * 
     * @param fieldName
     *        The name of the field in the string condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringCondition withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * The value of the string.
     * </p>
     * 
     * @param value
     *        The value of the string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the string.
     * </p>
     * 
     * @return The value of the string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the string.
     * </p>
     * 
     * @param value
     *        The value of the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringCondition withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * 
     * @param comparisonType
     *        The type of comparison to be made when evaluating the string condition.
     * @see StringComparisonType
     */

    public void setComparisonType(String comparisonType) {
        this.comparisonType = comparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * 
     * @return The type of comparison to be made when evaluating the string condition.
     * @see StringComparisonType
     */

    public String getComparisonType() {
        return this.comparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * 
     * @param comparisonType
     *        The type of comparison to be made when evaluating the string condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringComparisonType
     */

    public StringCondition withComparisonType(String comparisonType) {
        setComparisonType(comparisonType);
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * 
     * @param comparisonType
     *        The type of comparison to be made when evaluating the string condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringComparisonType
     */

    public StringCondition withComparisonType(StringComparisonType comparisonType) {
        this.comparisonType = comparisonType.toString();
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getComparisonType() != null)
            sb.append("ComparisonType: ").append(getComparisonType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringCondition == false)
            return false;
        StringCondition other = (StringCondition) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparisonType() == null ^ this.getComparisonType() == null)
            return false;
        if (other.getComparisonType() != null && other.getComparisonType().equals(this.getComparisonType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparisonType() == null) ? 0 : getComparisonType().hashCode());
        return hashCode;
    }

    @Override
    public StringCondition clone() {
        try {
            return (StringCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.StringConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
