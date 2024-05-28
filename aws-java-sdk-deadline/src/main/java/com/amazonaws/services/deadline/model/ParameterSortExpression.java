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
 * Organizes parameters according to your specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ParameterSortExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterSortExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameter name to sort by.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The sort order for the parameter.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The parameter name to sort by.
     * </p>
     * 
     * @param name
     *        The parameter name to sort by.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The parameter name to sort by.
     * </p>
     * 
     * @return The parameter name to sort by.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The parameter name to sort by.
     * </p>
     * 
     * @param name
     *        The parameter name to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSortExpression withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The sort order for the parameter.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the parameter.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the parameter.
     * </p>
     * 
     * @return The sort order for the parameter.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the parameter.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ParameterSortExpression withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the parameter.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ParameterSortExpression withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterSortExpression == false)
            return false;
        ParameterSortExpression other = (ParameterSortExpression) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ParameterSortExpression clone() {
        try {
            return (ParameterSortExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.ParameterSortExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
