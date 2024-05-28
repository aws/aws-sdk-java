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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotas" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceQuotasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the service identifier. To find the service code value for an Amazon Web Services service, use the
     * <a>ListServices</a> operation.
     * </p>
     */
    private String serviceCode;
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
     * Specifies the quota identifier. To find the quota code for a specific quota, use the <a>ListServiceQuotas</a>
     * operation, and look for the <code>QuotaCode</code> response in the output for the quota you want.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Specifies at which level of granularity that the quota value is applied.
     * </p>
     */
    private String quotaAppliedAtLevel;

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

    public ListServiceQuotasRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
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

    public ListServiceQuotasRequest withNextToken(String nextToken) {
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

    public ListServiceQuotasRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListServiceQuotasRequest withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Specifies at which level of granularity that the quota value is applied.
     * </p>
     * 
     * @param quotaAppliedAtLevel
     *        Specifies at which level of granularity that the quota value is applied.
     * @see AppliedLevelEnum
     */

    public void setQuotaAppliedAtLevel(String quotaAppliedAtLevel) {
        this.quotaAppliedAtLevel = quotaAppliedAtLevel;
    }

    /**
     * <p>
     * Specifies at which level of granularity that the quota value is applied.
     * </p>
     * 
     * @return Specifies at which level of granularity that the quota value is applied.
     * @see AppliedLevelEnum
     */

    public String getQuotaAppliedAtLevel() {
        return this.quotaAppliedAtLevel;
    }

    /**
     * <p>
     * Specifies at which level of granularity that the quota value is applied.
     * </p>
     * 
     * @param quotaAppliedAtLevel
     *        Specifies at which level of granularity that the quota value is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppliedLevelEnum
     */

    public ListServiceQuotasRequest withQuotaAppliedAtLevel(String quotaAppliedAtLevel) {
        setQuotaAppliedAtLevel(quotaAppliedAtLevel);
        return this;
    }

    /**
     * <p>
     * Specifies at which level of granularity that the quota value is applied.
     * </p>
     * 
     * @param quotaAppliedAtLevel
     *        Specifies at which level of granularity that the quota value is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppliedLevelEnum
     */

    public ListServiceQuotasRequest withQuotaAppliedAtLevel(AppliedLevelEnum quotaAppliedAtLevel) {
        this.quotaAppliedAtLevel = quotaAppliedAtLevel.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getQuotaCode() != null)
            sb.append("QuotaCode: ").append(getQuotaCode()).append(",");
        if (getQuotaAppliedAtLevel() != null)
            sb.append("QuotaAppliedAtLevel: ").append(getQuotaAppliedAtLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceQuotasRequest == false)
            return false;
        ListServiceQuotasRequest other = (ListServiceQuotasRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getQuotaCode() == null ^ this.getQuotaCode() == null)
            return false;
        if (other.getQuotaCode() != null && other.getQuotaCode().equals(this.getQuotaCode()) == false)
            return false;
        if (other.getQuotaAppliedAtLevel() == null ^ this.getQuotaAppliedAtLevel() == null)
            return false;
        if (other.getQuotaAppliedAtLevel() != null && other.getQuotaAppliedAtLevel().equals(this.getQuotaAppliedAtLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getQuotaCode() == null) ? 0 : getQuotaCode().hashCode());
        hashCode = prime * hashCode + ((getQuotaAppliedAtLevel() == null) ? 0 : getQuotaAppliedAtLevel().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceQuotasRequest clone() {
        return (ListServiceQuotasRequest) super.clone();
    }

}
