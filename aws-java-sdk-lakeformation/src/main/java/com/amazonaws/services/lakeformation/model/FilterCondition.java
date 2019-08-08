/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure describes the filtering of columns in a table based on a filter condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/FilterCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field to filter in the filter condition.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The comparison operator used in the filter condition.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * A string with values used in evaluating the filter condition.
     * </p>
     */
    private java.util.List<String> stringValueList;

    /**
     * <p>
     * The field to filter in the filter condition.
     * </p>
     * 
     * @param field
     *        The field to filter in the filter condition.
     * @see FieldNameString
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field to filter in the filter condition.
     * </p>
     * 
     * @return The field to filter in the filter condition.
     * @see FieldNameString
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field to filter in the filter condition.
     * </p>
     * 
     * @param field
     *        The field to filter in the filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldNameString
     */

    public FilterCondition withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The field to filter in the filter condition.
     * </p>
     * 
     * @param field
     *        The field to filter in the filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldNameString
     */

    public FilterCondition withField(FieldNameString field) {
        this.field = field.toString();
        return this;
    }

    /**
     * <p>
     * The comparison operator used in the filter condition.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison operator used in the filter condition.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The comparison operator used in the filter condition.
     * </p>
     * 
     * @return The comparison operator used in the filter condition.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The comparison operator used in the filter condition.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison operator used in the filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public FilterCondition withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The comparison operator used in the filter condition.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison operator used in the filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public FilterCondition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * A string with values used in evaluating the filter condition.
     * </p>
     * 
     * @return A string with values used in evaluating the filter condition.
     */

    public java.util.List<String> getStringValueList() {
        return stringValueList;
    }

    /**
     * <p>
     * A string with values used in evaluating the filter condition.
     * </p>
     * 
     * @param stringValueList
     *        A string with values used in evaluating the filter condition.
     */

    public void setStringValueList(java.util.Collection<String> stringValueList) {
        if (stringValueList == null) {
            this.stringValueList = null;
            return;
        }

        this.stringValueList = new java.util.ArrayList<String>(stringValueList);
    }

    /**
     * <p>
     * A string with values used in evaluating the filter condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValueList(java.util.Collection)} or {@link #withStringValueList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stringValueList
     *        A string with values used in evaluating the filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withStringValueList(String... stringValueList) {
        if (this.stringValueList == null) {
            setStringValueList(new java.util.ArrayList<String>(stringValueList.length));
        }
        for (String ele : stringValueList) {
            this.stringValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string with values used in evaluating the filter condition.
     * </p>
     * 
     * @param stringValueList
     *        A string with values used in evaluating the filter condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withStringValueList(java.util.Collection<String> stringValueList) {
        setStringValueList(stringValueList);
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getStringValueList() != null)
            sb.append("StringValueList: ").append(getStringValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCondition == false)
            return false;
        FilterCondition other = (FilterCondition) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getStringValueList() == null ^ this.getStringValueList() == null)
            return false;
        if (other.getStringValueList() != null && other.getStringValueList().equals(this.getStringValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getStringValueList() == null) ? 0 : getStringValueList().hashCode());
        return hashCode;
    }

    @Override
    public FilterCondition clone() {
        try {
            return (FilterCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.FilterConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
