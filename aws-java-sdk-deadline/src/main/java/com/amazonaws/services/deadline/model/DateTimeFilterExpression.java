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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time stamp in date-time format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DateTimeFilterExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateTimeFilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time.
     * </p>
     */
    private java.util.Date dateTime;
    /**
     * <p>
     * The name of the date-time field to filter on.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of comparison to use to filter the results.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The date and time.
     * </p>
     * 
     * @param dateTime
     *        The date and time.
     */

    public void setDateTime(java.util.Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * <p>
     * The date and time.
     * </p>
     * 
     * @return The date and time.
     */

    public java.util.Date getDateTime() {
        return this.dateTime;
    }

    /**
     * <p>
     * The date and time.
     * </p>
     * 
     * @param dateTime
     *        The date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeFilterExpression withDateTime(java.util.Date dateTime) {
        setDateTime(dateTime);
        return this;
    }

    /**
     * <p>
     * The name of the date-time field to filter on.
     * </p>
     * 
     * @param name
     *        The name of the date-time field to filter on.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the date-time field to filter on.
     * </p>
     * 
     * @return The name of the date-time field to filter on.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the date-time field to filter on.
     * </p>
     * 
     * @param name
     *        The name of the date-time field to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeFilterExpression withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of comparison to use to filter the results.
     * </p>
     * 
     * @param operator
     *        The type of comparison to use to filter the results.
     * @see ComparisonOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The type of comparison to use to filter the results.
     * </p>
     * 
     * @return The type of comparison to use to filter the results.
     * @see ComparisonOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The type of comparison to use to filter the results.
     * </p>
     * 
     * @param operator
     *        The type of comparison to use to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public DateTimeFilterExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The type of comparison to use to filter the results.
     * </p>
     * 
     * @param operator
     *        The type of comparison to use to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public DateTimeFilterExpression withOperator(ComparisonOperator operator) {
        this.operator = operator.toString();
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
        if (getDateTime() != null)
            sb.append("DateTime: ").append(getDateTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateTimeFilterExpression == false)
            return false;
        DateTimeFilterExpression other = (DateTimeFilterExpression) obj;
        if (other.getDateTime() == null ^ this.getDateTime() == null)
            return false;
        if (other.getDateTime() != null && other.getDateTime().equals(this.getDateTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public DateTimeFilterExpression clone() {
        try {
            return (DateTimeFilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.DateTimeFilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
