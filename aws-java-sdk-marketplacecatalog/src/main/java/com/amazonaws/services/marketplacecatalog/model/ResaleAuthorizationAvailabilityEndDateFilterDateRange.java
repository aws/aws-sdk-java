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
 * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization with date range as input.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ResaleAuthorizationAvailabilityEndDateFilterDateRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResaleAuthorizationAvailabilityEndDateFilterDateRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     * </p>
     */
    private String afterValue;
    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     * </p>
     */
    private String beforeValue;

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     * </p>
     * 
     * @param afterValue
     *        Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     */

    public void setAfterValue(String afterValue) {
        this.afterValue = afterValue;
    }

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     * </p>
     * 
     * @return Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     */

    public String getAfterValue() {
        return this.afterValue;
    }

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     * </p>
     * 
     * @param afterValue
     *        Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization after a date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationAvailabilityEndDateFilterDateRange withAfterValue(String afterValue) {
        setAfterValue(afterValue);
        return this;
    }

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     * </p>
     * 
     * @param beforeValue
     *        Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     */

    public void setBeforeValue(String beforeValue) {
        this.beforeValue = beforeValue;
    }

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     * </p>
     * 
     * @return Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     */

    public String getBeforeValue() {
        return this.beforeValue;
    }

    /**
     * <p>
     * Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     * </p>
     * 
     * @param beforeValue
     *        Allows filtering on <code>AvailabilityEndDate</code> of a ResaleAuthorization before a date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationAvailabilityEndDateFilterDateRange withBeforeValue(String beforeValue) {
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

        if (obj instanceof ResaleAuthorizationAvailabilityEndDateFilterDateRange == false)
            return false;
        ResaleAuthorizationAvailabilityEndDateFilterDateRange other = (ResaleAuthorizationAvailabilityEndDateFilterDateRange) obj;
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
    public ResaleAuthorizationAvailabilityEndDateFilterDateRange clone() {
        try {
            return (ResaleAuthorizationAvailabilityEndDateFilterDateRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ResaleAuthorizationAvailabilityEndDateFilterDateRangeMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
