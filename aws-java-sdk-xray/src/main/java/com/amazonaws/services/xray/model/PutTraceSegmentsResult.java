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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTraceSegmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Segments that failed processing.
     * </p>
     */
    private java.util.List<UnprocessedTraceSegment> unprocessedTraceSegments;

    /**
     * <p>
     * Segments that failed processing.
     * </p>
     * 
     * @return Segments that failed processing.
     */

    public java.util.List<UnprocessedTraceSegment> getUnprocessedTraceSegments() {
        return unprocessedTraceSegments;
    }

    /**
     * <p>
     * Segments that failed processing.
     * </p>
     * 
     * @param unprocessedTraceSegments
     *        Segments that failed processing.
     */

    public void setUnprocessedTraceSegments(java.util.Collection<UnprocessedTraceSegment> unprocessedTraceSegments) {
        if (unprocessedTraceSegments == null) {
            this.unprocessedTraceSegments = null;
            return;
        }

        this.unprocessedTraceSegments = new java.util.ArrayList<UnprocessedTraceSegment>(unprocessedTraceSegments);
    }

    /**
     * <p>
     * Segments that failed processing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedTraceSegments(java.util.Collection)} or
     * {@link #withUnprocessedTraceSegments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedTraceSegments
     *        Segments that failed processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTraceSegmentsResult withUnprocessedTraceSegments(UnprocessedTraceSegment... unprocessedTraceSegments) {
        if (this.unprocessedTraceSegments == null) {
            setUnprocessedTraceSegments(new java.util.ArrayList<UnprocessedTraceSegment>(unprocessedTraceSegments.length));
        }
        for (UnprocessedTraceSegment ele : unprocessedTraceSegments) {
            this.unprocessedTraceSegments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Segments that failed processing.
     * </p>
     * 
     * @param unprocessedTraceSegments
     *        Segments that failed processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTraceSegmentsResult withUnprocessedTraceSegments(java.util.Collection<UnprocessedTraceSegment> unprocessedTraceSegments) {
        setUnprocessedTraceSegments(unprocessedTraceSegments);
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
        if (getUnprocessedTraceSegments() != null)
            sb.append("UnprocessedTraceSegments: ").append(getUnprocessedTraceSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTraceSegmentsResult == false)
            return false;
        PutTraceSegmentsResult other = (PutTraceSegmentsResult) obj;
        if (other.getUnprocessedTraceSegments() == null ^ this.getUnprocessedTraceSegments() == null)
            return false;
        if (other.getUnprocessedTraceSegments() != null && other.getUnprocessedTraceSegments().equals(this.getUnprocessedTraceSegments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnprocessedTraceSegments() == null) ? 0 : getUnprocessedTraceSegments().hashCode());
        return hashCode;
    }

    @Override
    public PutTraceSegmentsResult clone() {
        try {
            return (PutTraceSegmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
