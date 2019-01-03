/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Quotas configured for a usage plan.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuotaSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial time period.
     * </p>
     */
    private Integer offset;
    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * </p>
     */
    private String period;

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     * 
     * @param limit
     *        The maximum number of requests that can be made in a given time period.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     * 
     * @return The maximum number of requests that can be made in a given time period.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     * 
     * @param limit
     *        The maximum number of requests that can be made in a given time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuotaSettings withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial time period.
     * </p>
     * 
     * @param offset
     *        The number of requests subtracted from the given limit in the initial time period.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial time period.
     * </p>
     * 
     * @return The number of requests subtracted from the given limit in the initial time period.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial time period.
     * </p>
     * 
     * @param offset
     *        The number of requests subtracted from the given limit in the initial time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuotaSettings withOffset(Integer offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * </p>
     * 
     * @param period
     *        The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * @see QuotaPeriodType
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * </p>
     * 
     * @return The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * @see QuotaPeriodType
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * </p>
     * 
     * @param period
     *        The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuotaPeriodType
     */

    public QuotaSettings withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * </p>
     * 
     * @param period
     *        The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * @see QuotaPeriodType
     */

    public void setPeriod(QuotaPeriodType period) {
        withPeriod(period);
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * </p>
     * 
     * @param period
     *        The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuotaPeriodType
     */

    public QuotaSettings withPeriod(QuotaPeriodType period) {
        this.period = period.toString();
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuotaSettings == false)
            return false;
        QuotaSettings other = (QuotaSettings) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        return hashCode;
    }

    @Override
    public QuotaSettings clone() {
        try {
            return (QuotaSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.QuotaSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
