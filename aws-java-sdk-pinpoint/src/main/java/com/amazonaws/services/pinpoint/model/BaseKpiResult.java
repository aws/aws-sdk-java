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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the results of a query that retrieved the data for a standard metric that applies to an application,
 * campaign, or journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/BaseKpiResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaseKpiResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved the data for a standard metric that
     * applies to an application, campaign, or journey.
     * </p>
     */
    private java.util.List<ResultRow> rows;

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved the data for a standard metric that
     * applies to an application, campaign, or journey.
     * </p>
     * 
     * @return An array of objects that provides the results of a query that retrieved the data for a standard metric
     *         that applies to an application, campaign, or journey.
     */

    public java.util.List<ResultRow> getRows() {
        return rows;
    }

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved the data for a standard metric that
     * applies to an application, campaign, or journey.
     * </p>
     * 
     * @param rows
     *        An array of objects that provides the results of a query that retrieved the data for a standard metric
     *        that applies to an application, campaign, or journey.
     */

    public void setRows(java.util.Collection<ResultRow> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<ResultRow>(rows);
    }

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved the data for a standard metric that
     * applies to an application, campaign, or journey.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        An array of objects that provides the results of a query that retrieved the data for a standard metric
     *        that applies to an application, campaign, or journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaseKpiResult withRows(ResultRow... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<ResultRow>(rows.length));
        }
        for (ResultRow ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved the data for a standard metric that
     * applies to an application, campaign, or journey.
     * </p>
     * 
     * @param rows
     *        An array of objects that provides the results of a query that retrieved the data for a standard metric
     *        that applies to an application, campaign, or journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaseKpiResult withRows(java.util.Collection<ResultRow> rows) {
        setRows(rows);
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
        if (getRows() != null)
            sb.append("Rows: ").append(getRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaseKpiResult == false)
            return false;
        BaseKpiResult other = (BaseKpiResult) obj;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        return hashCode;
    }

    @Override
    public BaseKpiResult clone() {
        try {
            return (BaseKpiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.BaseKpiResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
