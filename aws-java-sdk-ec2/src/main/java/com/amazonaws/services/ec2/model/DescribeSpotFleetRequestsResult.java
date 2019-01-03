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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeSpotFleetRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotFleetRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SpotFleetRequestConfig> spotFleetRequestConfigs;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     * 
     * @return Information about the configuration of your Spot Fleet.
     */

    public java.util.List<SpotFleetRequestConfig> getSpotFleetRequestConfigs() {
        if (spotFleetRequestConfigs == null) {
            spotFleetRequestConfigs = new com.amazonaws.internal.SdkInternalList<SpotFleetRequestConfig>();
        }
        return spotFleetRequestConfigs;
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     * 
     * @param spotFleetRequestConfigs
     *        Information about the configuration of your Spot Fleet.
     */

    public void setSpotFleetRequestConfigs(java.util.Collection<SpotFleetRequestConfig> spotFleetRequestConfigs) {
        if (spotFleetRequestConfigs == null) {
            this.spotFleetRequestConfigs = null;
            return;
        }

        this.spotFleetRequestConfigs = new com.amazonaws.internal.SdkInternalList<SpotFleetRequestConfig>(spotFleetRequestConfigs);
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotFleetRequestConfigs(java.util.Collection)} or
     * {@link #withSpotFleetRequestConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param spotFleetRequestConfigs
     *        Information about the configuration of your Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsResult withSpotFleetRequestConfigs(SpotFleetRequestConfig... spotFleetRequestConfigs) {
        if (this.spotFleetRequestConfigs == null) {
            setSpotFleetRequestConfigs(new com.amazonaws.internal.SdkInternalList<SpotFleetRequestConfig>(spotFleetRequestConfigs.length));
        }
        for (SpotFleetRequestConfig ele : spotFleetRequestConfigs) {
            this.spotFleetRequestConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     * 
     * @param spotFleetRequestConfigs
     *        Information about the configuration of your Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsResult withSpotFleetRequestConfigs(java.util.Collection<SpotFleetRequestConfig> spotFleetRequestConfigs) {
        setSpotFleetRequestConfigs(spotFleetRequestConfigs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSpotFleetRequestConfigs() != null)
            sb.append("SpotFleetRequestConfigs: ").append(getSpotFleetRequestConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotFleetRequestsResult == false)
            return false;
        DescribeSpotFleetRequestsResult other = (DescribeSpotFleetRequestsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotFleetRequestConfigs() == null ^ this.getSpotFleetRequestConfigs() == null)
            return false;
        if (other.getSpotFleetRequestConfigs() != null && other.getSpotFleetRequestConfigs().equals(this.getSpotFleetRequestConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestConfigs() == null) ? 0 : getSpotFleetRequestConfigs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotFleetRequestsResult clone() {
        try {
            return (DescribeSpotFleetRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
