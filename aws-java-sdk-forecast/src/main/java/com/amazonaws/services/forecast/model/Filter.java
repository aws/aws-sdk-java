/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter for choosing a subset of objects. Each filter consists of a condition and a match statement. The
 * condition is either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the objects
 * that match the statement, respectively. The match statement consists of a key and a value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter to filter on.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value to match.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To exclude
     * matching objects, specify <code>IS_NOT</code>.
     * </p>
     */
    private String condition;

    /**
     * <p>
     * The name of the parameter to filter on.
     * </p>
     * 
     * @param key
     *        The name of the parameter to filter on.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the parameter to filter on.
     * </p>
     * 
     * @return The name of the parameter to filter on.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the parameter to filter on.
     * </p>
     * 
     * @param key
     *        The name of the parameter to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value to match.
     * </p>
     * 
     * @param value
     *        The value to match.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to match.
     * </p>
     * 
     * @return The value to match.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to match.
     * </p>
     * 
     * @param value
     *        The value to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To exclude
     * matching objects, specify <code>IS_NOT</code>.
     * </p>
     * 
     * @param condition
     *        The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To
     *        exclude matching objects, specify <code>IS_NOT</code>.
     * @see FilterConditionString
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To exclude
     * matching objects, specify <code>IS_NOT</code>.
     * </p>
     * 
     * @return The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To
     *         exclude matching objects, specify <code>IS_NOT</code>.
     * @see FilterConditionString
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To exclude
     * matching objects, specify <code>IS_NOT</code>.
     * </p>
     * 
     * @param condition
     *        The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To
     *        exclude matching objects, specify <code>IS_NOT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterConditionString
     */

    public Filter withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To exclude
     * matching objects, specify <code>IS_NOT</code>.
     * </p>
     * 
     * @param condition
     *        The condition to apply. To include the objects that match the statement, specify <code>IS</code>. To
     *        exclude matching objects, specify <code>IS_NOT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterConditionString
     */

    public Filter withCondition(FilterConditionString condition) {
        this.condition = condition.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
