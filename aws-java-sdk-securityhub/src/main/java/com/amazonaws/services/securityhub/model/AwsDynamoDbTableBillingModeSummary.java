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
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
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
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUpdateToPayPerRequestDateTime
     *        If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that
     *        value.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setLastUpdateToPayPerRequestDateTime(String lastUpdateToPayPerRequestDateTime) {
        this.lastUpdateToPayPerRequestDateTime = lastUpdateToPayPerRequestDateTime;
    }

    /**
     * <p>
     * If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that value.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that
     *         value.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getLastUpdateToPayPerRequestDateTime() {
        return this.lastUpdateToPayPerRequestDateTime;
    }

    /**
     * <p>
     * If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that value.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastUpdateToPayPerRequestDateTime
     *        If the billing mode is <code>PAY_PER_REQUEST</code>, indicates when the billing mode was set to that
     *        value.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
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
