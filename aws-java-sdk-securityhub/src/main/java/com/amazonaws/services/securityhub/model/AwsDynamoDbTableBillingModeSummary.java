/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the billing for read/write capacity on the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableBillingModeSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableBillingModeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method used to charge for read and write throughput and to manage capacity.
     * </p>
     */
    private String billingMode;
    /**
     * <p>
     * If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that value.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String lastUpdateToPayPerRequestDateTime;

    /**
     * <p>
     * The method used to charge for read and write throughput and to manage capacity.
     * </p>
     * 
     * @param billingMode
     *        The method used to charge for read and write throughput and to manage capacity.
     */

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <p>
     * The method used to charge for read and write throughput and to manage capacity.
     * </p>
     * 
     * @return The method used to charge for read and write throughput and to manage capacity.
     */

    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * <p>
     * The method used to charge for read and write throughput and to manage capacity.
     * </p>
     * 
     * @param billingMode
     *        The method used to charge for read and write throughput and to manage capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableBillingModeSummary withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
     * <p>
     * If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that value.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastUpdateToPayPerRequestDateTime
     *        If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that
     *        value.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLastUpdateToPayPerRequestDateTime(String lastUpdateToPayPerRequestDateTime) {
        this.lastUpdateToPayPerRequestDateTime = lastUpdateToPayPerRequestDateTime;
    }

    /**
     * <p>
     * If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that value.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that
     *         value.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLastUpdateToPayPerRequestDateTime() {
        return this.lastUpdateToPayPerRequestDateTime;
    }

    /**
     * <p>
     * If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that value.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastUpdateToPayPerRequestDateTime
     *        If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that
     *        value.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableBillingModeSummary withLastUpdateToPayPerRequestDateTime(String lastUpdateToPayPerRequestDateTime) {
        setLastUpdateToPayPerRequestDateTime(lastUpdateToPayPerRequestDateTime);
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
        if (getBillingMode() != null)
            sb.append("BillingMode: ").append(getBillingMode()).append(",");
        if (getLastUpdateToPayPerRequestDateTime() != null)
            sb.append("LastUpdateToPayPerRequestDateTime: ").append(getLastUpdateToPayPerRequestDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableBillingModeSummary == false)
            return false;
        AwsDynamoDbTableBillingModeSummary other = (AwsDynamoDbTableBillingModeSummary) obj;
        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null && other.getBillingMode().equals(this.getBillingMode()) == false)
            return false;
        if (other.getLastUpdateToPayPerRequestDateTime() == null ^ this.getLastUpdateToPayPerRequestDateTime() == null)
            return false;
        if (other.getLastUpdateToPayPerRequestDateTime() != null
                && other.getLastUpdateToPayPerRequestDateTime().equals(this.getLastUpdateToPayPerRequestDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateToPayPerRequestDateTime() == null) ? 0 : getLastUpdateToPayPerRequestDateTime().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableBillingModeSummary clone() {
        try {
            return (AwsDynamoDbTableBillingModeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableBillingModeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
