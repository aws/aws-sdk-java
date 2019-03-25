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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtectionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProtectionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the details for.
     * </p>
     */
    private String memberAccountId;
    /**
     * <p>
     * The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more objects than the number that you specify for
     * <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the response that allows
     * you to list another group of objects. For the second and subsequent <code>GetProtectionStatus</code> requests,
     * specify the value of <code>NextToken</code> from the previous response to get information about another batch of
     * objects.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more
     * objects than the number that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of objects.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     * 
     * @param policyId
     *        The ID of the policy for which you want to get the attack information.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     * 
     * @return The ID of the policy for which you want to get the attack information.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     * 
     * @param policyId
     *        The ID of the policy for which you want to get the attack information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the details for.
     * </p>
     * 
     * @param memberAccountId
     *        The AWS account that is in scope of the policy that you want to get the details for.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the details for.
     * </p>
     * 
     * @return The AWS account that is in scope of the policy that you want to get the details for.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the details for.
     * </p>
     * 
     * @param memberAccountId
     *        The AWS account that is in scope of the policy that you want to get the details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusRequest withMemberAccountId(String memberAccountId) {
        setMemberAccountId(memberAccountId);
        return this;
    }

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     * 
     * @param startTime
     *        The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample
     *        request above indicates a number type because the default used by AWS Firewall Manager is Unix time in
     *        seconds. However, any valid <code>timestamp</code> format is allowed.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     * 
     * @return The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample
     *         request above indicates a number type because the default used by AWS Firewall Manager is Unix time in
     *         seconds. However, any valid <code>timestamp</code> format is allowed.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     * 
     * @param startTime
     *        The start of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample
     *        request above indicates a number type because the default used by AWS Firewall Manager is Unix time in
     *        seconds. However, any valid <code>timestamp</code> format is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     * 
     * @param endTime
     *        The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample
     *        request above indicates a number type because the default used by AWS Firewall Manager is Unix time in
     *        seconds. However, any valid <code>timestamp</code> format is allowed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     * 
     * @return The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample
     *         request above indicates a number type because the default used by AWS Firewall Manager is Unix time in
     *         seconds. However, any valid <code>timestamp</code> format is allowed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample request
     * above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However,
     * any valid <code>timestamp</code> format is allowed.
     * </p>
     * 
     * @param endTime
     *        The end of the time period to query for the attacks. This is a <code>timestamp</code> type. The sample
     *        request above indicates a number type because the default used by AWS Firewall Manager is Unix time in
     *        seconds. However, any valid <code>timestamp</code> format is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more objects than the number that you specify for
     * <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the response that allows
     * you to list another group of objects. For the second and subsequent <code>GetProtectionStatus</code> requests,
     * specify the value of <code>NextToken</code> from the previous response to get information about another batch of
     * objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> and you have more objects than the number that you
     *        specify for <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the
     *        response that allows you to list another group of objects. For the second and subsequent
     *        <code>GetProtectionStatus</code> requests, specify the value of <code>NextToken</code> from the previous
     *        response to get information about another batch of objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more objects than the number that you specify for
     * <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the response that allows
     * you to list another group of objects. For the second and subsequent <code>GetProtectionStatus</code> requests,
     * specify the value of <code>NextToken</code> from the previous response to get information about another batch of
     * objects.
     * </p>
     * 
     * @return If you specify a value for <code>MaxResults</code> and you have more objects than the number that you
     *         specify for <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the
     *         response that allows you to list another group of objects. For the second and subsequent
     *         <code>GetProtectionStatus</code> requests, specify the value of <code>NextToken</code> from the previous
     *         response to get information about another batch of objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more objects than the number that you specify for
     * <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the response that allows
     * you to list another group of objects. For the second and subsequent <code>GetProtectionStatus</code> requests,
     * specify the value of <code>NextToken</code> from the previous response to get information about another batch of
     * objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> and you have more objects than the number that you
     *        specify for <code>MaxResults</code>, AWS Firewall Manager returns a <code>NextToken</code> value in the
     *        response that allows you to list another group of objects. For the second and subsequent
     *        <code>GetProtectionStatus</code> requests, specify the value of <code>NextToken</code> from the previous
     *        response to get information about another batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more
     * objects than the number that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of objects.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have
     *        more objects than the number that you specify for <code>MaxResults</code>, the response includes a
     *        <code>NextToken</code> value that you can use to get another batch of objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more
     * objects than the number that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of objects.
     * </p>
     * 
     * @return Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you
     *         have more objects than the number that you specify for <code>MaxResults</code>, the response includes a
     *         <code>NextToken</code> value that you can use to get another batch of objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more
     * objects than the number that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of objects.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have
     *        more objects than the number that you specify for <code>MaxResults</code>, the response includes a
     *        <code>NextToken</code> value that you can use to get another batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtectionStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getMemberAccountId() != null)
            sb.append("MemberAccountId: ").append(getMemberAccountId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProtectionStatusRequest == false)
            return false;
        GetProtectionStatusRequest other = (GetProtectionStatusRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetProtectionStatusRequest clone() {
        return (GetProtectionStatusRequest) super.clone();
    }

}
