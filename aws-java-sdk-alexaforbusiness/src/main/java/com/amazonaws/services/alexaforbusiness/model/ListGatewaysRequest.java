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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGateways" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewaysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The gateway group ARN for which to list gateways.
     * </p>
     */
    private String gatewayGroupArn;
    /**
     * <p>
     * The token used to paginate though multiple pages of gateway summaries.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of gateway summaries to return. The default is 50.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The gateway group ARN for which to list gateways.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The gateway group ARN for which to list gateways.
     */

    public void setGatewayGroupArn(String gatewayGroupArn) {
        this.gatewayGroupArn = gatewayGroupArn;
    }

    /**
     * <p>
     * The gateway group ARN for which to list gateways.
     * </p>
     * 
     * @return The gateway group ARN for which to list gateways.
     */

    public String getGatewayGroupArn() {
        return this.gatewayGroupArn;
    }

    /**
     * <p>
     * The gateway group ARN for which to list gateways.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The gateway group ARN for which to list gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysRequest withGatewayGroupArn(String gatewayGroupArn) {
        setGatewayGroupArn(gatewayGroupArn);
        return this;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway summaries.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate though multiple pages of gateway summaries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway summaries.
     * </p>
     * 
     * @return The token used to paginate though multiple pages of gateway summaries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway summaries.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate though multiple pages of gateway summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of gateway summaries to return. The default is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of gateway summaries to return. The default is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of gateway summaries to return. The default is 50.
     * </p>
     * 
     * @return The maximum number of gateway summaries to return. The default is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of gateway summaries to return. The default is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of gateway summaries to return. The default is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysRequest withMaxResults(Integer maxResults) {
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
        if (getGatewayGroupArn() != null)
            sb.append("GatewayGroupArn: ").append(getGatewayGroupArn()).append(",");
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

        if (obj instanceof ListGatewaysRequest == false)
            return false;
        ListGatewaysRequest other = (ListGatewaysRequest) obj;
        if (other.getGatewayGroupArn() == null ^ this.getGatewayGroupArn() == null)
            return false;
        if (other.getGatewayGroupArn() != null && other.getGatewayGroupArn().equals(this.getGatewayGroupArn()) == false)
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

        hashCode = prime * hashCode + ((getGatewayGroupArn() == null) ? 0 : getGatewayGroupArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewaysRequest clone() {
        return (ListGatewaysRequest) super.clone();
    }

}
