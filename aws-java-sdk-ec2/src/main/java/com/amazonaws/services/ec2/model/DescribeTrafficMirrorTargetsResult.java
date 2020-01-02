/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficMirrorTarget> trafficMirrorTargets;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     * 
     * @return Information about one or more Traffic Mirror targets.
     */

    public java.util.List<TrafficMirrorTarget> getTrafficMirrorTargets() {
        if (trafficMirrorTargets == null) {
            trafficMirrorTargets = new com.amazonaws.internal.SdkInternalList<TrafficMirrorTarget>();
        }
        return trafficMirrorTargets;
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     * 
     * @param trafficMirrorTargets
     *        Information about one or more Traffic Mirror targets.
     */

    public void setTrafficMirrorTargets(java.util.Collection<TrafficMirrorTarget> trafficMirrorTargets) {
        if (trafficMirrorTargets == null) {
            this.trafficMirrorTargets = null;
            return;
        }

        this.trafficMirrorTargets = new com.amazonaws.internal.SdkInternalList<TrafficMirrorTarget>(trafficMirrorTargets);
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficMirrorTargets(java.util.Collection)} or {@link #withTrafficMirrorTargets(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param trafficMirrorTargets
     *        Information about one or more Traffic Mirror targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorTargetsResult withTrafficMirrorTargets(TrafficMirrorTarget... trafficMirrorTargets) {
        if (this.trafficMirrorTargets == null) {
            setTrafficMirrorTargets(new com.amazonaws.internal.SdkInternalList<TrafficMirrorTarget>(trafficMirrorTargets.length));
        }
        for (TrafficMirrorTarget ele : trafficMirrorTargets) {
            this.trafficMirrorTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     * 
     * @param trafficMirrorTargets
     *        Information about one or more Traffic Mirror targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorTargetsResult withTrafficMirrorTargets(java.util.Collection<TrafficMirrorTarget> trafficMirrorTargets) {
        setTrafficMirrorTargets(trafficMirrorTargets);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorTargetsResult withNextToken(String nextToken) {
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
        if (getTrafficMirrorTargets() != null)
            sb.append("TrafficMirrorTargets: ").append(getTrafficMirrorTargets()).append(",");
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

        if (obj instanceof DescribeTrafficMirrorTargetsResult == false)
            return false;
        DescribeTrafficMirrorTargetsResult other = (DescribeTrafficMirrorTargetsResult) obj;
        if (other.getTrafficMirrorTargets() == null ^ this.getTrafficMirrorTargets() == null)
            return false;
        if (other.getTrafficMirrorTargets() != null && other.getTrafficMirrorTargets().equals(this.getTrafficMirrorTargets()) == false)
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

        hashCode = prime * hashCode + ((getTrafficMirrorTargets() == null) ? 0 : getTrafficMirrorTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficMirrorTargetsResult clone() {
        try {
            return (DescribeTrafficMirrorTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
