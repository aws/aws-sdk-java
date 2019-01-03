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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to obtain deliverability metrics for a domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainStatisticsReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainStatisticsReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain that you want to obtain deliverability metrics for.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The <code>EndDate</code>
     * that you specify has to be less than or equal to 30 days after the <code>StartDate</code>.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The domain that you want to obtain deliverability metrics for.
     * </p>
     * 
     * @param domain
     *        The domain that you want to obtain deliverability metrics for.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain that you want to obtain deliverability metrics for.
     * </p>
     * 
     * @return The domain that you want to obtain deliverability metrics for.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain that you want to obtain deliverability metrics for.
     * </p>
     * 
     * @param domain
     *        The domain that you want to obtain deliverability metrics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainStatisticsReportRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     * </p>
     * 
     * @param startDate
     *        The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     * </p>
     * 
     * @return The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     * </p>
     * 
     * @param startDate
     *        The first day (in Unix time) that you want to obtain domain deliverability metrics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainStatisticsReportRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The <code>EndDate</code>
     * that you specify has to be less than or equal to 30 days after the <code>StartDate</code>.
     * </p>
     * 
     * @param endDate
     *        The last day (in Unix time) that you want to obtain domain deliverability metrics for. The
     *        <code>EndDate</code> that you specify has to be less than or equal to 30 days after the
     *        <code>StartDate</code>.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The <code>EndDate</code>
     * that you specify has to be less than or equal to 30 days after the <code>StartDate</code>.
     * </p>
     * 
     * @return The last day (in Unix time) that you want to obtain domain deliverability metrics for. The
     *         <code>EndDate</code> that you specify has to be less than or equal to 30 days after the
     *         <code>StartDate</code>.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The <code>EndDate</code>
     * that you specify has to be less than or equal to 30 days after the <code>StartDate</code>.
     * </p>
     * 
     * @param endDate
     *        The last day (in Unix time) that you want to obtain domain deliverability metrics for. The
     *        <code>EndDate</code> that you specify has to be less than or equal to 30 days after the
     *        <code>StartDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainStatisticsReportRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainStatisticsReportRequest == false)
            return false;
        GetDomainStatisticsReportRequest other = (GetDomainStatisticsReportRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainStatisticsReportRequest clone() {
        return (GetDomainStatisticsReportRequest) super.clone();
    }

}
