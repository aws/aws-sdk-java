/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/ListRealtimeContactAnalysisSegments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRealtimeContactAnalysisSegmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     */
    private java.util.List<RealtimeContactAnalysisSegment> segments;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results. If response includes
     * <code>nextToken</code> there are two possible scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There are more segments so another call is required to get them.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no more segments at this time, but more may be available later (real-time analysis is in progress) so
     * the client should call the operation again to get new segments.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed) and there
     * are no more segments to retrieve.
     * </p>
     */
    private String nextToken;

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

    public ListRealtimeContactAnalysisSegmentsResult withSegments(RealtimeContactAnalysisSegment... segments) {
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

    public ListRealtimeContactAnalysisSegmentsResult withSegments(java.util.Collection<RealtimeContactAnalysisSegment> segments) {
        setSegments(segments);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results. If response includes
     * <code>nextToken</code> there are two possible scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There are more segments so another call is required to get them.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no more segments at this time, but more may be available later (real-time analysis is in progress) so
     * the client should call the operation again to get new segments.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed) and there
     * are no more segments to retrieve.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results. If response includes
     *        <code>nextToken</code> there are two possible scenarios:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        There are more segments so another call is required to get them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There are no more segments at this time, but more may be available later (real-time analysis is in
     *        progress) so the client should call the operation again to get new segments.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed)
     *        and there are no more segments to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results. If response includes
     * <code>nextToken</code> there are two possible scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There are more segments so another call is required to get them.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no more segments at this time, but more may be available later (real-time analysis is in progress) so
     * the client should call the operation again to get new segments.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed) and there
     * are no more segments to retrieve.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results. If response includes
     *         <code>nextToken</code> there are two possible scenarios:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         There are more segments so another call is required to get them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There are no more segments at this time, but more may be available later (real-time analysis is in
     *         progress) so the client should call the operation again to get new segments.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed)
     *         and there are no more segments to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results. If response includes
     * <code>nextToken</code> there are two possible scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There are more segments so another call is required to get them.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no more segments at this time, but more may be available later (real-time analysis is in progress) so
     * the client should call the operation again to get new segments.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed) and there
     * are no more segments to retrieve.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results. If response includes
     *        <code>nextToken</code> there are two possible scenarios:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        There are more segments so another call is required to get them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There are no more segments at this time, but more may be available later (real-time analysis is in
     *        progress) so the client should call the operation again to get new segments.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If response does not include <code>nextToken</code>, the analysis is completed (successfully or failed)
     *        and there are no more segments to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRealtimeContactAnalysisSegmentsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListRealtimeContactAnalysisSegmentsResult == false)
            return false;
        ListRealtimeContactAnalysisSegmentsResult other = (ListRealtimeContactAnalysisSegmentsResult) obj;
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

        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRealtimeContactAnalysisSegmentsResult clone() {
        try {
            return (ListRealtimeContactAnalysisSegmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
