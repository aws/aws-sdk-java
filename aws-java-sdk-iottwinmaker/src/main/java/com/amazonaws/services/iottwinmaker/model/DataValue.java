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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that specifies a value for a property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DataValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * A double value.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * An integer value.
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * A long value.
     * </p>
     */
    private Long longValue;
    /**
     * <p>
     * A string value.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * A list of multiple values.
     * </p>
     */
    private java.util.List<DataValue> listValue;
    /**
     * <p>
     * An object that maps strings to multiple <code>DataValue</code> objects.
     * </p>
     */
    private java.util.Map<String, DataValue> mapValue;
    /**
     * <p>
     * A value that relates a component to another component.
     * </p>
     */
    private RelationshipValue relationshipValue;
    /**
     * <p>
     * An expression that produces the value.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * A Boolean value.
     * </p>
     * 
     * @param booleanValue
     *        A Boolean value.
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * A Boolean value.
     * </p>
     * 
     * @return A Boolean value.
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A Boolean value.
     * </p>
     * 
     * @param booleanValue
     *        A Boolean value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * A Boolean value.
     * </p>
     * 
     * @return A Boolean value.
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A double value.
     * </p>
     * 
     * @param doubleValue
     *        A double value.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * A double value.
     * </p>
     * 
     * @return A double value.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * A double value.
     * </p>
     * 
     * @param doubleValue
     *        A double value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * An integer value.
     * </p>
     * 
     * @param integerValue
     *        An integer value.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * An integer value.
     * </p>
     * 
     * @return An integer value.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * An integer value.
     * </p>
     * 
     * @param integerValue
     *        An integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * A long value.
     * </p>
     * 
     * @param longValue
     *        A long value.
     */

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * A long value.
     * </p>
     * 
     * @return A long value.
     */

    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * <p>
     * A long value.
     * </p>
     * 
     * @param longValue
     *        A long value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withLongValue(Long longValue) {
        setLongValue(longValue);
        return this;
    }

    /**
     * <p>
     * A string value.
     * </p>
     * 
     * @param stringValue
     *        A string value.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * A string value.
     * </p>
     * 
     * @return A string value.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * A string value.
     * </p>
     * 
     * @param stringValue
     *        A string value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * A list of multiple values.
     * </p>
     * 
     * @return A list of multiple values.
     */

    public java.util.List<DataValue> getListValue() {
        return listValue;
    }

    /**
     * <p>
     * A list of multiple values.
     * </p>
     * 
     * @param listValue
     *        A list of multiple values.
     */

    public void setListValue(java.util.Collection<DataValue> listValue) {
        if (listValue == null) {
            this.listValue = null;
            return;
        }

        this.listValue = new java.util.ArrayList<DataValue>(listValue);
    }

    /**
     * <p>
     * A list of multiple values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListValue(java.util.Collection)} or {@link #withListValue(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listValue
     *        A list of multiple values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withListValue(DataValue... listValue) {
        if (this.listValue == null) {
            setListValue(new java.util.ArrayList<DataValue>(listValue.length));
        }
        for (DataValue ele : listValue) {
            this.listValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of multiple values.
     * </p>
     * 
     * @param listValue
     *        A list of multiple values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withListValue(java.util.Collection<DataValue> listValue) {
        setListValue(listValue);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to multiple <code>DataValue</code> objects.
     * </p>
     * 
     * @return An object that maps strings to multiple <code>DataValue</code> objects.
     */

    public java.util.Map<String, DataValue> getMapValue() {
        return mapValue;
    }

    /**
     * <p>
     * An object that maps strings to multiple <code>DataValue</code> objects.
     * </p>
     * 
     * @param mapValue
     *        An object that maps strings to multiple <code>DataValue</code> objects.
     */

    public void setMapValue(java.util.Map<String, DataValue> mapValue) {
        this.mapValue = mapValue;
    }

    /**
     * <p>
     * An object that maps strings to multiple <code>DataValue</code> objects.
     * </p>
     * 
     * @param mapValue
     *        An object that maps strings to multiple <code>DataValue</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withMapValue(java.util.Map<String, DataValue> mapValue) {
        setMapValue(mapValue);
        return this;
    }

    /**
     * Add a single MapValue entry
     *
     * @see DataValue#withMapValue
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataValue addMapValueEntry(String key, DataValue value) {
        if (null == this.mapValue) {
            this.mapValue = new java.util.HashMap<String, DataValue>();
        }
        if (this.mapValue.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.mapValue.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MapValue.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue clearMapValueEntries() {
        this.mapValue = null;
        return this;
    }

    /**
     * <p>
     * A value that relates a component to another component.
     * </p>
     * 
     * @param relationshipValue
     *        A value that relates a component to another component.
     */

    public void setRelationshipValue(RelationshipValue relationshipValue) {
        this.relationshipValue = relationshipValue;
    }

    /**
     * <p>
     * A value that relates a component to another component.
     * </p>
     * 
     * @return A value that relates a component to another component.
     */

    public RelationshipValue getRelationshipValue() {
        return this.relationshipValue;
    }

    /**
     * <p>
     * A value that relates a component to another component.
     * </p>
     * 
     * @param relationshipValue
     *        A value that relates a component to another component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withRelationshipValue(RelationshipValue relationshipValue) {
        setRelationshipValue(relationshipValue);
        return this;
    }

    /**
     * <p>
     * An expression that produces the value.
     * </p>
     * 
     * @param expression
     *        An expression that produces the value.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * An expression that produces the value.
     * </p>
     * 
     * @return An expression that produces the value.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * An expression that produces the value.
     * </p>
     * 
     * @param expression
     *        An expression that produces the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValue withExpression(String expression) {
        setExpression(expression);
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
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getLongValue() != null)
            sb.append("LongValue: ").append(getLongValue()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getListValue() != null)
            sb.append("ListValue: ").append(getListValue()).append(",");
        if (getMapValue() != null)
            sb.append("MapValue: ").append(getMapValue()).append(",");
        if (getRelationshipValue() != null)
            sb.append("RelationshipValue: ").append(getRelationshipValue()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataValue == false)
            return false;
        DataValue other = (DataValue) obj;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null && other.getLongValue().equals(this.getLongValue()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getListValue() == null ^ this.getListValue() == null)
            return false;
        if (other.getListValue() != null && other.getListValue().equals(this.getListValue()) == false)
            return false;
        if (other.getMapValue() == null ^ this.getMapValue() == null)
            return false;
        if (other.getMapValue() != null && other.getMapValue().equals(this.getMapValue()) == false)
            return false;
        if (other.getRelationshipValue() == null ^ this.getRelationshipValue() == null)
            return false;
        if (other.getRelationshipValue() != null && other.getRelationshipValue().equals(this.getRelationshipValue()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getListValue() == null) ? 0 : getListValue().hashCode());
        hashCode = prime * hashCode + ((getMapValue() == null) ? 0 : getMapValue().hashCode());
        hashCode = prime * hashCode + ((getRelationshipValue() == null) ? 0 : getRelationshipValue().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public DataValue clone() {
        try {
            return (DataValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.DataValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
