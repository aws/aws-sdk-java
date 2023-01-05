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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A PartiQL predicate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RowFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A filter expression.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * A wildcard for all rows.
     * </p>
     */
    private AllRowsWildcard allRowsWildcard;

    /**
     * <p>
     * A filter expression.
     * </p>
     * 
     * @param filterExpression
     *        A filter expression.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * A filter expression.
     * </p>
     * 
     * @return A filter expression.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * A filter expression.
     * </p>
     * 
     * @param filterExpression
     *        A filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * A wildcard for all rows.
     * </p>
     * 
     * @param allRowsWildcard
     *        A wildcard for all rows.
     */

    public void setAllRowsWildcard(AllRowsWildcard allRowsWildcard) {
        this.allRowsWildcard = allRowsWildcard;
    }

    /**
     * <p>
     * A wildcard for all rows.
     * </p>
     * 
     * @return A wildcard for all rows.
     */

    public AllRowsWildcard getAllRowsWildcard() {
        return this.allRowsWildcard;
    }

    /**
     * <p>
     * A wildcard for all rows.
     * </p>
     * 
     * @param allRowsWildcard
     *        A wildcard for all rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withAllRowsWildcard(AllRowsWildcard allRowsWildcard) {
        setAllRowsWildcard(allRowsWildcard);
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
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append(getFilterExpression()).append(",");
        if (getAllRowsWildcard() != null)
            sb.append("AllRowsWildcard: ").append(getAllRowsWildcard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowFilter == false)
            return false;
        RowFilter other = (RowFilter) obj;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getAllRowsWildcard() == null ^ this.getAllRowsWildcard() == null)
            return false;
        if (other.getAllRowsWildcard() != null && other.getAllRowsWildcard().equals(this.getAllRowsWildcard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getAllRowsWildcard() == null) ? 0 : getAllRowsWildcard().hashCode());
        return hashCode;
    }

    @Override
    public RowFilter clone() {
        try {
            return (RowFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.RowFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
