/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTrafficSources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the traffic sources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficSourceState> trafficSources;
    /**
     * <p>
     * This string indicates that the response contains more items than can be returned in a single response. To receive
     * additional items, specify this string for the <code>NextToken</code> value when requesting the next set of items.
     * This value is null when there are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the traffic sources.
     * </p>
     * 
     * @return Information about the traffic sources.
     */

    public java.util.List<TrafficSourceState> getTrafficSources() {
        if (trafficSources == null) {
            trafficSources = new com.amazonaws.internal.SdkInternalList<TrafficSourceState>();
        }
        return trafficSources;
    }

    /**
     * <p>
     * Information about the traffic sources.
     * </p>
     * 
     * @param trafficSources
     *        Information about the traffic sources.
     */

    public void setTrafficSources(java.util.Collection<TrafficSourceState> trafficSources) {
        if (trafficSources == null) {
            this.trafficSources = null;
            return;
        }

        this.trafficSources = new com.amazonaws.internal.SdkInternalList<TrafficSourceState>(trafficSources);
    }

    /**
     * <p>
     * Information about the traffic sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficSources(java.util.Collection)} or {@link #withTrafficSources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param trafficSources
     *        Information about the traffic sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficSourcesResult withTrafficSources(TrafficSourceState... trafficSources) {
        if (this.trafficSources == null) {
            setTrafficSources(new com.amazonaws.internal.SdkInternalList<TrafficSourceState>(trafficSources.length));
        }
        for (TrafficSourceState ele : trafficSources) {
            this.trafficSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the traffic sources.
     * </p>
     * 
     * @param trafficSources
     *        Information about the traffic sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficSourcesResult withTrafficSources(java.util.Collection<TrafficSourceState> trafficSources) {
        setTrafficSources(trafficSources);
        return this;
    }

    /**
     * <p>
     * This string indicates that the response contains more items than can be returned in a single response. To receive
     * additional items, specify this string for the <code>NextToken</code> value when requesting the next set of items.
     * This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        This string indicates that the response contains more items than can be returned in a single response. To
     *        receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This string indicates that the response contains more items than can be returned in a single response. To receive
     * additional items, specify this string for the <code>NextToken</code> value when requesting the next set of items.
     * This value is null when there are no more items to return.
     * </p>
     * 
     * @return This string indicates that the response contains more items than can be returned in a single response. To
     *         receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *         next set of items. This value is null when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This string indicates that the response contains more items than can be returned in a single response. To receive
     * additional items, specify this string for the <code>NextToken</code> value when requesting the next set of items.
     * This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        This string indicates that the response contains more items than can be returned in a single response. To
     *        receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficSourcesResult withNextToken(String nextToken) {
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
        if (getTrafficSources() != null)
            sb.append("TrafficSources: ").append(getTrafficSources()).append(",");
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

        if (obj instanceof DescribeTrafficSourcesResult == false)
            return false;
        DescribeTrafficSourcesResult other = (DescribeTrafficSourcesResult) obj;
        if (other.getTrafficSources() == null ^ this.getTrafficSources() == null)
            return false;
        if (other.getTrafficSources() != null && other.getTrafficSources().equals(this.getTrafficSources()) == false)
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

        hashCode = prime * hashCode + ((getTrafficSources() == null) ? 0 : getTrafficSources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficSourcesResult clone() {
        try {
            return (DescribeTrafficSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
