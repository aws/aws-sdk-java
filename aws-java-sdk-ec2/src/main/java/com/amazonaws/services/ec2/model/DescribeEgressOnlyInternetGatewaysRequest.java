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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeEgressOnlyInternetGatewaysRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEgressOnlyInternetGatewaysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeEgressOnlyInternetGatewaysRequest> {

    /**
     * <p>
     * One or more egress-only internet gateway IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> egressOnlyInternetGatewayIds;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more egress-only internet gateway IDs.
     * </p>
     * 
     * @return One or more egress-only internet gateway IDs.
     */

    public java.util.List<String> getEgressOnlyInternetGatewayIds() {
        if (egressOnlyInternetGatewayIds == null) {
            egressOnlyInternetGatewayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return egressOnlyInternetGatewayIds;
    }

    /**
     * <p>
     * One or more egress-only internet gateway IDs.
     * </p>
     * 
     * @param egressOnlyInternetGatewayIds
     *        One or more egress-only internet gateway IDs.
     */

    public void setEgressOnlyInternetGatewayIds(java.util.Collection<String> egressOnlyInternetGatewayIds) {
        if (egressOnlyInternetGatewayIds == null) {
            this.egressOnlyInternetGatewayIds = null;
            return;
        }

        this.egressOnlyInternetGatewayIds = new com.amazonaws.internal.SdkInternalList<String>(egressOnlyInternetGatewayIds);
    }

    /**
     * <p>
     * One or more egress-only internet gateway IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEgressOnlyInternetGatewayIds(java.util.Collection)} or
     * {@link #withEgressOnlyInternetGatewayIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param egressOnlyInternetGatewayIds
     *        One or more egress-only internet gateway IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEgressOnlyInternetGatewaysRequest withEgressOnlyInternetGatewayIds(String... egressOnlyInternetGatewayIds) {
        if (this.egressOnlyInternetGatewayIds == null) {
            setEgressOnlyInternetGatewayIds(new com.amazonaws.internal.SdkInternalList<String>(egressOnlyInternetGatewayIds.length));
        }
        for (String ele : egressOnlyInternetGatewayIds) {
            this.egressOnlyInternetGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more egress-only internet gateway IDs.
     * </p>
     * 
     * @param egressOnlyInternetGatewayIds
     *        One or more egress-only internet gateway IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEgressOnlyInternetGatewaysRequest withEgressOnlyInternetGatewayIds(java.util.Collection<String> egressOnlyInternetGatewayIds) {
        setEgressOnlyInternetGatewayIds(egressOnlyInternetGatewayIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEgressOnlyInternetGatewaysRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEgressOnlyInternetGatewaysRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeEgressOnlyInternetGatewaysRequest> getDryRunRequest() {
        Request<DescribeEgressOnlyInternetGatewaysRequest> request = new DescribeEgressOnlyInternetGatewaysRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getEgressOnlyInternetGatewayIds() != null)
            sb.append("EgressOnlyInternetGatewayIds: ").append(getEgressOnlyInternetGatewayIds()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEgressOnlyInternetGatewaysRequest == false)
            return false;
        DescribeEgressOnlyInternetGatewaysRequest other = (DescribeEgressOnlyInternetGatewaysRequest) obj;
        if (other.getEgressOnlyInternetGatewayIds() == null ^ this.getEgressOnlyInternetGatewayIds() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayIds() != null && other.getEgressOnlyInternetGatewayIds().equals(this.getEgressOnlyInternetGatewayIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressOnlyInternetGatewayIds() == null) ? 0 : getEgressOnlyInternetGatewayIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEgressOnlyInternetGatewaysRequest clone() {
        return (DescribeEgressOnlyInternetGatewaysRequest) super.clone();
    }
}
