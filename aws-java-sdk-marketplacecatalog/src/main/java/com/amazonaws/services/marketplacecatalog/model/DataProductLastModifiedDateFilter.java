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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object that allows filtering based on the last modified date of data products.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DataProductLastModifiedDateFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProductLastModifiedDateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dates between which the data product was last modified.
     * </p>
     */
    private DataProductLastModifiedDateFilterDateRange dateRange;

    /**
     * <p>
     * Dates between which the data product was last modified.
     * </p>
     * 
     * @param dateRange
     *        Dates between which the data product was last modified.
     */

    public void setDateRange(DataProductLastModifiedDateFilterDateRange dateRange) {
        this.dateRange = dateRange;
    }

    /**
     * <p>
     * Dates between which the data product was last modified.
     * </p>
     * 
     * @return Dates between which the data product was last modified.
     */

    public DataProductLastModifiedDateFilterDateRange getDateRange() {
        return this.dateRange;
    }

    /**
     * <p>
     * Dates between which the data product was last modified.
     * </p>
     * 
     * @param dateRange
     *        Dates between which the data product was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductLastModifiedDateFilter withDateRange(DataProductLastModifiedDateFilterDateRange dateRange) {
        setDateRange(dateRange);
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
        if (getDateRange() != null)
            sb.append("DateRange: ").append(getDateRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProductLastModifiedDateFilter == false)
            return false;
        DataProductLastModifiedDateFilter other = (DataProductLastModifiedDateFilter) obj;
        if (other.getDateRange() == null ^ this.getDateRange() == null)
            return false;
        if (other.getDateRange() != null && other.getDateRange().equals(this.getDateRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDateRange() == null) ? 0 : getDateRange().hashCode());
        return hashCode;
    }

    @Override
    public DataProductLastModifiedDateFilter clone() {
        try {
            return (DataProductLastModifiedDateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.DataProductLastModifiedDateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
