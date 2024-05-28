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
 * Object that contains date range of the last modified date to be filtered on. You can optionally provide a
 * <code>BeforeValue</code> and/or <code>AfterValue</code>. Both are inclusive.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DataProductLastModifiedDateFilterDateRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProductLastModifiedDateFilterDateRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Date after which the data product was last modified.
     * </p>
     */
    private String afterValue;
    /**
     * <p>
     * Date before which the data product was last modified.
     * </p>
     */
    private String beforeValue;

    /**
     * <p>
     * Date after which the data product was last modified.
     * </p>
     * 
     * @param afterValue
     *        Date after which the data product was last modified.
     */

    public void setAfterValue(String afterValue) {
        this.afterValue = afterValue;
    }

    /**
     * <p>
     * Date after which the data product was last modified.
     * </p>
     * 
     * @return Date after which the data product was last modified.
     */

    public String getAfterValue() {
        return this.afterValue;
    }

    /**
     * <p>
     * Date after which the data product was last modified.
     * </p>
     * 
     * @param afterValue
     *        Date after which the data product was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductLastModifiedDateFilterDateRange withAfterValue(String afterValue) {
        setAfterValue(afterValue);
        return this;
    }

    /**
     * <p>
     * Date before which the data product was last modified.
     * </p>
     * 
     * @param beforeValue
     *        Date before which the data product was last modified.
     */

    public void setBeforeValue(String beforeValue) {
        this.beforeValue = beforeValue;
    }

    /**
     * <p>
     * Date before which the data product was last modified.
     * </p>
     * 
     * @return Date before which the data product was last modified.
     */

    public String getBeforeValue() {
        return this.beforeValue;
    }

    /**
     * <p>
     * Date before which the data product was last modified.
     * </p>
     * 
     * @param beforeValue
     *        Date before which the data product was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductLastModifiedDateFilterDateRange withBeforeValue(String beforeValue) {
        setBeforeValue(beforeValue);
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
        if (getAfterValue() != null)
            sb.append("AfterValue: ").append(getAfterValue()).append(",");
        if (getBeforeValue() != null)
            sb.append("BeforeValue: ").append(getBeforeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProductLastModifiedDateFilterDateRange == false)
            return false;
        DataProductLastModifiedDateFilterDateRange other = (DataProductLastModifiedDateFilterDateRange) obj;
        if (other.getAfterValue() == null ^ this.getAfterValue() == null)
            return false;
        if (other.getAfterValue() != null && other.getAfterValue().equals(this.getAfterValue()) == false)
            return false;
        if (other.getBeforeValue() == null ^ this.getBeforeValue() == null)
            return false;
        if (other.getBeforeValue() != null && other.getBeforeValue().equals(this.getBeforeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfterValue() == null) ? 0 : getAfterValue().hashCode());
        hashCode = prime * hashCode + ((getBeforeValue() == null) ? 0 : getBeforeValue().hashCode());
        return hashCode;
    }

    @Override
    public DataProductLastModifiedDateFilterDateRange clone() {
        try {
            return (DataProductLastModifiedDateFilterDateRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.DataProductLastModifiedDateFilterDateRangeMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
