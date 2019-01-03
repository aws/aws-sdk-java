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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListComplianceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComplianceStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code> objects
     * than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list another group of
     * <code>PolicyComplianceStatus</code> objects. For the second and subsequent <code>ListComplianceStatus</code>
     * requests, specify the value of <code>NextToken</code> from the previous response to get information about another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to return
     * for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number that you specify
     * for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that you can use to get another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * 
     * @param policyId
     *        The ID of the AWS Firewall Manager policy that you want the details for.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * 
     * @return The ID of the AWS Firewall Manager policy that you want the details for.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * 
     * @param policyId
     *        The ID of the AWS Firewall Manager policy that you want the details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceStatusRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code> objects
     * than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list another group of
     * <code>PolicyComplianceStatus</code> objects. For the second and subsequent <code>ListComplianceStatus</code>
     * requests, specify the value of <code>NextToken</code> from the previous response to get information about another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code>
     *        objects than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     *        <code>NextToken</code> value in the response that allows you to list another group of
     *        <code>PolicyComplianceStatus</code> objects. For the second and subsequent
     *        <code>ListComplianceStatus</code> requests, specify the value of <code>NextToken</code> from the previous
     *        response to get information about another batch of <code>PolicyComplianceStatus</code> objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code> objects
     * than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list another group of
     * <code>PolicyComplianceStatus</code> objects. For the second and subsequent <code>ListComplianceStatus</code>
     * requests, specify the value of <code>NextToken</code> from the previous response to get information about another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @return If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code>
     *         objects than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     *         <code>NextToken</code> value in the response that allows you to list another group of
     *         <code>PolicyComplianceStatus</code> objects. For the second and subsequent
     *         <code>ListComplianceStatus</code> requests, specify the value of <code>NextToken</code> from the previous
     *         response to get information about another batch of <code>PolicyComplianceStatus</code> objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code> objects
     * than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list another group of
     * <code>PolicyComplianceStatus</code> objects. For the second and subsequent <code>ListComplianceStatus</code>
     * requests, specify the value of <code>NextToken</code> from the previous response to get information about another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> and you have more <code>PolicyComplianceStatus</code>
     *        objects than the number that you specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     *        <code>NextToken</code> value in the response that allows you to list another group of
     *        <code>PolicyComplianceStatus</code> objects. For the second and subsequent
     *        <code>ListComplianceStatus</code> requests, specify the value of <code>NextToken</code> from the previous
     *        response to get information about another batch of <code>PolicyComplianceStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to return
     * for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number that you specify
     * for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that you can use to get another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to
     *        return for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number that
     *        you specify for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that you can
     *        use to get another batch of <code>PolicyComplianceStatus</code> objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to return
     * for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number that you specify
     * for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that you can use to get another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @return Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to
     *         return for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number
     *         that you specify for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that
     *         you can use to get another batch of <code>PolicyComplianceStatus</code> objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to return
     * for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number that you specify
     * for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that you can use to get another
     * batch of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of <code>PolicyComplianceStatus</code> objects that you want AWS Firewall Manager to
     *        return for this request. If you have more <code>PolicyComplianceStatus</code> objects than the number that
     *        you specify for <code>MaxResults</code>, the response includes a <code>NextToken</code> value that you can
     *        use to get another batch of <code>PolicyComplianceStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceStatusRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListComplianceStatusRequest == false)
            return false;
        ListComplianceStatusRequest other = (ListComplianceStatusRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListComplianceStatusRequest clone() {
        return (ListComplianceStatusRequest) super.clone();
    }

}
