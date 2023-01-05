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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSegmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of structures that contain information about the segments in this Region.
     * </p>
     */
    private java.util.List<Segment> segments;

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     * </p>
     * 
     * @return The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListSegments</code> operation to return the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of structures that contain information about the segments in this Region.
     * </p>
     * 
     * @return An array of structures that contain information about the segments in this Region.
     */

    public java.util.List<Segment> getSegments() {
        return segments;
    }

    /**
     * <p>
     * An array of structures that contain information about the segments in this Region.
     * </p>
     * 
     * @param segments
     *        An array of structures that contain information about the segments in this Region.
     */

    public void setSegments(java.util.Collection<Segment> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<Segment>(segments);
    }

    /**
     * <p>
     * An array of structures that contain information about the segments in this Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegments(java.util.Collection)} or {@link #withSegments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param segments
     *        An array of structures that contain information about the segments in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentsResult withSegments(Segment... segments) {
        if (this.segments == null) {
            setSegments(new java.util.ArrayList<Segment>(segments.length));
        }
        for (Segment ele : segments) {
            this.segments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain information about the segments in this Region.
     * </p>
     * 
     * @param segments
     *        An array of structures that contain information about the segments in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentsResult withSegments(java.util.Collection<Segment> segments) {
        setSegments(segments);
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
        if (getSegments() != null)
            sb.append("Segments: ").append(getSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSegmentsResult == false)
            return false;
        ListSegmentsResult other = (ListSegmentsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        return hashCode;
    }

    @Override
    public ListSegmentsResult clone() {
        try {
            return (ListSegmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
