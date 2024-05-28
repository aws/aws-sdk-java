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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The condition for the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QueryConditionItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryConditionItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparison operator for query condition to query on.
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The name of the field for query condition to query on.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The value for the query condition to query on.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The comparison operator for query condition to query on.
     * </p>
     * 
     * @param comparator
     *        The comparison operator for query condition to query on.
     * @see QueryConditionComparisonOperator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The comparison operator for query condition to query on.
     * </p>
     * 
     * @return The comparison operator for query condition to query on.
     * @see QueryConditionComparisonOperator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The comparison operator for query condition to query on.
     * </p>
     * 
     * @param comparator
     *        The comparison operator for query condition to query on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryConditionComparisonOperator
     */

    public QueryConditionItem withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The comparison operator for query condition to query on.
     * </p>
     * 
     * @param comparator
     *        The comparison operator for query condition to query on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryConditionComparisonOperator
     */

    public QueryConditionItem withComparator(QueryConditionComparisonOperator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The name of the field for query condition to query on.
     * </p>
     * 
     * @param field
     *        The name of the field for query condition to query on.
     * @see QueryConditionFieldName
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The name of the field for query condition to query on.
     * </p>
     * 
     * @return The name of the field for query condition to query on.
     * @see QueryConditionFieldName
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The name of the field for query condition to query on.
     * </p>
     * 
     * @param field
     *        The name of the field for query condition to query on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryConditionFieldName
     */

    public QueryConditionItem withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The name of the field for query condition to query on.
     * </p>
     * 
     * @param field
     *        The name of the field for query condition to query on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryConditionFieldName
     */

    public QueryConditionItem withField(QueryConditionFieldName field) {
        this.field = field.toString();
        return this;
    }

    /**
     * <p>
     * The value for the query condition to query on.
     * </p>
     * 
     * @param value
     *        The value for the query condition to query on.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the query condition to query on.
     * </p>
     * 
     * @return The value for the query condition to query on.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the query condition to query on.
     * </p>
     * 
     * @param value
     *        The value for the query condition to query on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryConditionItem withValue(String value) {
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
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

        if (obj instanceof QueryConditionItem == false)
            return false;
        QueryConditionItem other = (QueryConditionItem) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
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

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public QueryConditionItem clone() {
        try {
            return (QueryConditionItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.QueryConditionItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
