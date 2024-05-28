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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListEdgeAgentConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgeAgentConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     */
    private String hubDeviceArn;
    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The default is 5.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     * truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     * configurations, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * 
     * @param hubDeviceArn
     *        The "Internet of Things (IoT) Thing" Arn of the edge agent.
     */

    public void setHubDeviceArn(String hubDeviceArn) {
        this.hubDeviceArn = hubDeviceArn;
    }

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * 
     * @return The "Internet of Things (IoT) Thing" Arn of the edge agent.
     */

    public String getHubDeviceArn() {
        return this.hubDeviceArn;
    }

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * 
     * @param hubDeviceArn
     *        The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeAgentConfigurationsRequest withHubDeviceArn(String hubDeviceArn) {
        setHubDeviceArn(hubDeviceArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The default is 5.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of edge configurations to return in the response. The default is 5.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The default is 5.
     * </p>
     * 
     * @return The maximum number of edge configurations to return in the response. The default is 5.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The default is 5.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of edge configurations to return in the response. The default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeAgentConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     * truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     * configurations, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     *        truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     *        configurations, provide this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     * truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     * configurations, provide this token in your next request.
     * </p>
     * 
     * @return If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     *         truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     *         configurations, provide this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     * truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     * configurations, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter, when the result of a <code>ListEdgeAgentConfigurations</code> operation is
     *        truncated, the call returns the <code>NextToken</code> in the response. To get another batch of edge
     *        configurations, provide this token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeAgentConfigurationsRequest withNextToken(String nextToken) {
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
        if (getHubDeviceArn() != null)
            sb.append("HubDeviceArn: ").append(getHubDeviceArn()).append(",");
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

        if (obj instanceof ListEdgeAgentConfigurationsRequest == false)
            return false;
        ListEdgeAgentConfigurationsRequest other = (ListEdgeAgentConfigurationsRequest) obj;
        if (other.getHubDeviceArn() == null ^ this.getHubDeviceArn() == null)
            return false;
        if (other.getHubDeviceArn() != null && other.getHubDeviceArn().equals(this.getHubDeviceArn()) == false)
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

        hashCode = prime * hashCode + ((getHubDeviceArn() == null) ? 0 : getHubDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEdgeAgentConfigurationsRequest clone() {
        return (ListEdgeAgentConfigurationsRequest) super.clone();
    }

}
