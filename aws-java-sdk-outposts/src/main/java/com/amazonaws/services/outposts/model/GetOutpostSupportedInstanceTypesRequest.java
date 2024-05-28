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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostSupportedInstanceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOutpostSupportedInstanceTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or ARN of the Outpost.
     * </p>
     */
    private String outpostIdentifier;
    /**
     * <p>
     * The ID for the Amazon Web Services Outposts order.
     * </p>
     */
    private String orderId;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * The ID or ARN of the Outpost.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or ARN of the Outpost.
     */

    public void setOutpostIdentifier(String outpostIdentifier) {
        this.outpostIdentifier = outpostIdentifier;
    }

    /**
     * <p>
     * The ID or ARN of the Outpost.
     * </p>
     * 
     * @return The ID or ARN of the Outpost.
     */

    public String getOutpostIdentifier() {
        return this.outpostIdentifier;
    }

    /**
     * <p>
     * The ID or ARN of the Outpost.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or ARN of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutpostSupportedInstanceTypesRequest withOutpostIdentifier(String outpostIdentifier) {
        setOutpostIdentifier(outpostIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services Outposts order.
     * </p>
     * 
     * @param orderId
     *        The ID for the Amazon Web Services Outposts order.
     */

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services Outposts order.
     * </p>
     * 
     * @return The ID for the Amazon Web Services Outposts order.
     */

    public String getOrderId() {
        return this.orderId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services Outposts order.
     * </p>
     * 
     * @param orderId
     *        The ID for the Amazon Web Services Outposts order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutpostSupportedInstanceTypesRequest withOrderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutpostSupportedInstanceTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOutpostSupportedInstanceTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getOutpostIdentifier() != null)
            sb.append("OutpostIdentifier: ").append(getOutpostIdentifier()).append(",");
        if (getOrderId() != null)
            sb.append("OrderId: ").append(getOrderId()).append(",");
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

        if (obj instanceof GetOutpostSupportedInstanceTypesRequest == false)
            return false;
        GetOutpostSupportedInstanceTypesRequest other = (GetOutpostSupportedInstanceTypesRequest) obj;
        if (other.getOutpostIdentifier() == null ^ this.getOutpostIdentifier() == null)
            return false;
        if (other.getOutpostIdentifier() != null && other.getOutpostIdentifier().equals(this.getOutpostIdentifier()) == false)
            return false;
        if (other.getOrderId() == null ^ this.getOrderId() == null)
            return false;
        if (other.getOrderId() != null && other.getOrderId().equals(this.getOrderId()) == false)
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

        hashCode = prime * hashCode + ((getOutpostIdentifier() == null) ? 0 : getOutpostIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOutpostSupportedInstanceTypesRequest clone() {
        return (GetOutpostSupportedInstanceTypesRequest) super.clone();
    }

}
