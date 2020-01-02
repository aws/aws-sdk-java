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
public class DescribeTrafficMirrorSessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     * Alternatively, you can filter the results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficMirrorSession> trafficMirrorSessions;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     * Alternatively, you can filter the results.
     * </p>
     * 
     * @return Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     *         Alternatively, you can filter the results.
     */

    public java.util.List<TrafficMirrorSession> getTrafficMirrorSessions() {
        if (trafficMirrorSessions == null) {
            trafficMirrorSessions = new com.amazonaws.internal.SdkInternalList<TrafficMirrorSession>();
        }
        return trafficMirrorSessions;
    }

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     * Alternatively, you can filter the results.
     * </p>
     * 
     * @param trafficMirrorSessions
     *        Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     *        Alternatively, you can filter the results.
     */

    public void setTrafficMirrorSessions(java.util.Collection<TrafficMirrorSession> trafficMirrorSessions) {
        if (trafficMirrorSessions == null) {
            this.trafficMirrorSessions = null;
            return;
        }

        this.trafficMirrorSessions = new com.amazonaws.internal.SdkInternalList<TrafficMirrorSession>(trafficMirrorSessions);
    }

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     * Alternatively, you can filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficMirrorSessions(java.util.Collection)} or
     * {@link #withTrafficMirrorSessions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trafficMirrorSessions
     *        Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     *        Alternatively, you can filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorSessionsResult withTrafficMirrorSessions(TrafficMirrorSession... trafficMirrorSessions) {
        if (this.trafficMirrorSessions == null) {
            setTrafficMirrorSessions(new com.amazonaws.internal.SdkInternalList<TrafficMirrorSession>(trafficMirrorSessions.length));
        }
        for (TrafficMirrorSession ele : trafficMirrorSessions) {
            this.trafficMirrorSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     * Alternatively, you can filter the results.
     * </p>
     * 
     * @param trafficMirrorSessions
     *        Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     *        Alternatively, you can filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorSessionsResult withTrafficMirrorSessions(java.util.Collection<TrafficMirrorSession> trafficMirrorSessions) {
        setTrafficMirrorSessions(trafficMirrorSessions);
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

    public DescribeTrafficMirrorSessionsResult withNextToken(String nextToken) {
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
        if (getTrafficMirrorSessions() != null)
            sb.append("TrafficMirrorSessions: ").append(getTrafficMirrorSessions()).append(",");
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

        if (obj instanceof DescribeTrafficMirrorSessionsResult == false)
            return false;
        DescribeTrafficMirrorSessionsResult other = (DescribeTrafficMirrorSessionsResult) obj;
        if (other.getTrafficMirrorSessions() == null ^ this.getTrafficMirrorSessions() == null)
            return false;
        if (other.getTrafficMirrorSessions() != null && other.getTrafficMirrorSessions().equals(this.getTrafficMirrorSessions()) == false)
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

        hashCode = prime * hashCode + ((getTrafficMirrorSessions() == null) ? 0 : getTrafficMirrorSessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficMirrorSessionsResult clone() {
        try {
            return (DescribeTrafficMirrorSessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
