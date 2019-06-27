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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about all the segments that are associated with an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentsResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the application (Segments resource) or each
     * version of a segment that's associated with the application (Segment Versions resource).
     * </p>
     */
    private java.util.List<SegmentResponse> item;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the application (Segments resource) or each
     * version of a segment that's associated with the application (Segment Versions resource).
     * </p>
     * 
     * @return An array of responses, one for each segment that's associated with the application (Segments resource) or
     *         each version of a segment that's associated with the application (Segment Versions resource).
     */

    public java.util.List<SegmentResponse> getItem() {
        return item;
    }

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the application (Segments resource) or each
     * version of a segment that's associated with the application (Segment Versions resource).
     * </p>
     * 
     * @param item
     *        An array of responses, one for each segment that's associated with the application (Segments resource) or
     *        each version of a segment that's associated with the application (Segment Versions resource).
     */

    public void setItem(java.util.Collection<SegmentResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<SegmentResponse>(item);
    }

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the application (Segments resource) or each
     * version of a segment that's associated with the application (Segment Versions resource).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        An array of responses, one for each segment that's associated with the application (Segments resource) or
     *        each version of a segment that's associated with the application (Segment Versions resource).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentsResponse withItem(SegmentResponse... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<SegmentResponse>(item.length));
        }
        for (SegmentResponse ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the application (Segments resource) or each
     * version of a segment that's associated with the application (Segment Versions resource).
     * </p>
     * 
     * @param item
     *        An array of responses, one for each segment that's associated with the application (Segments resource) or
     *        each version of a segment that's associated with the application (Segment Versions resource).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentsResponse withItem(java.util.Collection<SegmentResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentsResponse withNextToken(String nextToken) {
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
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

        if (obj instanceof SegmentsResponse == false)
            return false;
        SegmentsResponse other = (SegmentsResponse) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
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

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SegmentsResponse clone() {
        try {
            return (SegmentsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
