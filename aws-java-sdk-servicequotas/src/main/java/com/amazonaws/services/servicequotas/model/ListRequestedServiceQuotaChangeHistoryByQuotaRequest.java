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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistoryByQuota"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRequestedServiceQuotaChangeHistoryByQuotaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Specifies that you want to filter the results to only the requests with the matching status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in a
     * previous request. A <code>NextToken</code> response indicates that more output is available. Set this parameter
     * to the value of the previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of results that you want included on each page of the response. If you do not
     * include this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     * those included in the current response, the <code>NextToken</code> response element is present and has a value
     * (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies at which level within the Amazon Web Services account the quota request applies to.
     * </p>
     */
    private String quotaRequestedAtLevel;

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service identifier. To find the service code value for an Amazon Web Services service, use
     *        the <a>ListServices</a> operation.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     * 
     * @return Specifies the service identifier. To find the service code value for an Amazon Web Services service, use
     *         the <a>ListServices</a> operation.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     * 
     * @param serviceCode
     *        Specifies the service identifier. To find the service code value for an Amazon Web Services service, use
     *        the <a>ListServices</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     * 
     * @param quotaCode
     *        Specifies the quota identifier. To find the quota code for a specific quota, use the
     *        <a>ListServiceQuotas</a> operation, and look for the <code>QuotaCode</code> response in the output for the
     *        quota you want.
     */

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     * 
     * @return Specifies the quota identifier. To find the quota code for a specific quota, use the
     *         <a>ListServiceQuotas</a> operation, and look for the <code>QuotaCode</code> response in the output for
     *         the quota you want.
     */

    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     * 
     * @param quotaCode
     *        Specifies the quota identifier. To find the quota code for a specific quota, use the
     *        <a>ListServiceQuotas</a> operation, and look for the <code>QuotaCode</code> response in the output for the
     *        quota you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to filter the results to only the requests with the matching status.
     * </p>
     * 
     * @param status
     *        Specifies that you want to filter the results to only the requests with the matching status.
     * @see RequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies that you want to filter the results to only the requests with the matching status.
     * </p>
     * 
     * @return Specifies that you want to filter the results to only the requests with the matching status.
     * @see RequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies that you want to filter the results to only the requests with the matching status.
     * </p>
     * 
     * @param status
     *        Specifies that you want to filter the results to only the requests with the matching status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestStatus
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to filter the results to only the requests with the matching status.
     * </p>
     * 
     * @param status
     *        Specifies that you want to filter the results to only the requests with the matching status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestStatus
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withStatus(RequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in a
     * previous request. A <code>NextToken</code> response indicates that more output is available. Set this parameter
     * to the value of the previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @param nextToken
     *        Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in
     *        a previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in a
     * previous request. A <code>NextToken</code> response indicates that more output is available. Set this parameter
     * to the value of the previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @return Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in
     *         a previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value of the previous call's <code>NextToken</code> response to indicate where the
     *         output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in a
     * previous request. A <code>NextToken</code> response indicates that more output is available. Set this parameter
     * to the value of the previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @param nextToken
     *        Specifies a value for receiving additional results after you receive a <code>NextToken</code> response in
     *        a previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of results that you want included on each page of the response. If you do not
     * include this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     * those included in the current response, the <code>NextToken</code> response element is present and has a value
     * (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        Specifies the maximum number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value appropriate to the operation. If additional items exist
     *        beyond those included in the current response, the <code>NextToken</code> response element is present and
     *        has a value (is not null). Include that value as the <code>NextToken</code> request parameter in the next
     *        call to the operation to get the next part of the results.</p> <note>
     *        <p>
     *        An API operation can return fewer results than the maximum even when there are more results available. You
     *        should check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of results that you want included on each page of the response. If you do not
     * include this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     * those included in the current response, the <code>NextToken</code> response element is present and has a value
     * (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @return Specifies the maximum number of results that you want included on each page of the response. If you do
     *         not include this parameter, it defaults to a value appropriate to the operation. If additional items
     *         exist beyond those included in the current response, the <code>NextToken</code> response element is
     *         present and has a value (is not null). Include that value as the <code>NextToken</code> request parameter
     *         in the next call to the operation to get the next part of the results.</p> <note>
     *         <p>
     *         An API operation can return fewer results than the maximum even when there are more results available.
     *         You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     *         results.
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of results that you want included on each page of the response. If you do not
     * include this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     * those included in the current response, the <code>NextToken</code> response element is present and has a value
     * (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        Specifies the maximum number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value appropriate to the operation. If additional items exist
     *        beyond those included in the current response, the <code>NextToken</code> response element is present and
     *        has a value (is not null). Include that value as the <code>NextToken</code> request parameter in the next
     *        call to the operation to get the next part of the results.</p> <note>
     *        <p>
     *        An API operation can return fewer results than the maximum even when there are more results available. You
     *        should check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies at which level within the Amazon Web Services account the quota request applies to.
     * </p>
     * 
     * @param quotaRequestedAtLevel
     *        Specifies at which level within the Amazon Web Services account the quota request applies to.
     * @see AppliedLevelEnum
     */

    public void setQuotaRequestedAtLevel(String quotaRequestedAtLevel) {
        this.quotaRequestedAtLevel = quotaRequestedAtLevel;
    }

    /**
     * <p>
     * Specifies at which level within the Amazon Web Services account the quota request applies to.
     * </p>
     * 
     * @return Specifies at which level within the Amazon Web Services account the quota request applies to.
     * @see AppliedLevelEnum
     */

    public String getQuotaRequestedAtLevel() {
        return this.quotaRequestedAtLevel;
    }

    /**
     * <p>
     * Specifies at which level within the Amazon Web Services account the quota request applies to.
     * </p>
     * 
     * @param quotaRequestedAtLevel
     *        Specifies at which level within the Amazon Web Services account the quota request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppliedLevelEnum
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withQuotaRequestedAtLevel(String quotaRequestedAtLevel) {
        setQuotaRequestedAtLevel(quotaRequestedAtLevel);
        return this;
    }

    /**
     * <p>
     * Specifies at which level within the Amazon Web Services account the quota request applies to.
     * </p>
     * 
     * @param quotaRequestedAtLevel
     *        Specifies at which level within the Amazon Web Services account the quota request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppliedLevelEnum
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest withQuotaRequestedAtLevel(AppliedLevelEnum quotaRequestedAtLevel) {
        this.quotaRequestedAtLevel = quotaRequestedAtLevel.toString();
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getQuotaRequestedAtLevel() != null)
            sb.append("QuotaRequestedAtLevel: ").append(getQuotaRequestedAtLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRequestedServiceQuotaChangeHistoryByQuotaRequest == false)
            return false;
        ListRequestedServiceQuotaChangeHistoryByQuotaRequest other = (ListRequestedServiceQuotaChangeHistoryByQuotaRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getQuotaRequestedAtLevel() == null ^ this.getQuotaRequestedAtLevel() == null)
            return false;
        if (other.getQuotaRequestedAtLevel() != null && other.getQuotaRequestedAtLevel().equals(this.getQuotaRequestedAtLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getQuotaRequestedAtLevel() == null) ? 0 : getQuotaRequestedAtLevel().hashCode());
        return hashCode;
    }

    @Override
    public ListRequestedServiceQuotaChangeHistoryByQuotaRequest clone() {
        return (ListRequestedServiceQuotaChangeHistoryByQuotaRequest) super.clone();
    }

}
