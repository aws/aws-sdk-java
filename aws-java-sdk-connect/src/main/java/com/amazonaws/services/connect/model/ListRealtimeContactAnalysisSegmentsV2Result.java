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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRealtimeContactAnalysisSegmentsV2"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRealtimeContactAnalysisSegmentsV2Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     */
    private java.util.List<RealtimeContactAnalysisSegment> segments;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * 
     * @param channel
     *        The channel of the contact. <code>Voice</code> will not be returned.
     * @see RealTimeContactAnalysisSupportedChannel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * 
     * @return The channel of the contact. <code>Voice</code> will not be returned.
     * @see RealTimeContactAnalysisSupportedChannel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * 
     * @param channel
     *        The channel of the contact. <code>Voice</code> will not be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSupportedChannel
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * 
     * @param channel
     *        The channel of the contact. <code>Voice</code> will not be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSupportedChannel
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withChannel(RealTimeContactAnalysisSupportedChannel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * 
     * @param status
     *        Status of real-time contact analysis.
     * @see RealTimeContactAnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * 
     * @return Status of real-time contact analysis.
     * @see RealTimeContactAnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * 
     * @param status
     *        Status of real-time contact analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisStatus
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * 
     * @param status
     *        Status of real-time contact analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisStatus
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withStatus(RealTimeContactAnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     * 
     * @return An analyzed transcript or category.
     */

    public java.util.List<RealtimeContactAnalysisSegment> getSegments() {
        return segments;
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     * 
     * @param segments
     *        An analyzed transcript or category.
     */

    public void setSegments(java.util.Collection<RealtimeContactAnalysisSegment> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<RealtimeContactAnalysisSegment>(segments);
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegments(java.util.Collection)} or {@link #withSegments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param segments
     *        An analyzed transcript or category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withSegments(RealtimeContactAnalysisSegment... segments) {
        if (this.segments == null) {
            setSegments(new java.util.ArrayList<RealtimeContactAnalysisSegment>(segments.length));
        }
        for (RealtimeContactAnalysisSegment ele : segments) {
            this.segments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     * 
     * @param segments
     *        An analyzed transcript or category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withSegments(java.util.Collection<RealtimeContactAnalysisSegment> segments) {
        setSegments(segments);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsV2Result withNextToken(String nextToken) {
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSegments() != null)
            sb.append("Segments: ").append(getSegments()).append(",");
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

        if (obj instanceof ListRealtimeContactAnalysisSegmentsV2Result == false)
            return false;
        ListRealtimeContactAnalysisSegmentsV2Result other = (ListRealtimeContactAnalysisSegmentsV2Result) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
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

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRealtimeContactAnalysisSegmentsV2Result clone() {
        try {
            return (ListRealtimeContactAnalysisSegmentsV2Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
