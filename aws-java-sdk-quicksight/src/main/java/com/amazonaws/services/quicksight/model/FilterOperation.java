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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A transform operation that filters rows based on a condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are kept in
     * the dataset.
     * </p>
     */
    private String conditionExpression;

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are kept in
     * the dataset.
     * </p>
     * 
     * @param conditionExpression
     *        An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are
     *        kept in the dataset.
     */

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are kept in
     * the dataset.
     * </p>
     * 
     * @return An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are
     *         kept in the dataset.
     */

    public String getConditionExpression() {
        return this.conditionExpression;
    }

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are kept in
     * the dataset.
     * </p>
     * 
     * @param conditionExpression
     *        An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are
     *        kept in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterOperation withConditionExpression(String conditionExpression) {
        setConditionExpression(conditionExpression);
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
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: ").append(getConditionExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterOperation == false)
            return false;
        FilterOperation other = (FilterOperation) obj;
        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null)
            return false;
        if (other.getConditionExpression() != null && other.getConditionExpression().equals(this.getConditionExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        return hashCode;
    }

    @Override
    public FilterOperation clone() {
        try {
            return (FilterOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
