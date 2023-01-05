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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteSegment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSegmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the segment to delete.
     * </p>
     */
    private String segment;

    /**
     * <p>
     * Specifies the segment to delete.
     * </p>
     * 
     * @param segment
     *        Specifies the segment to delete.
     */

    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * Specifies the segment to delete.
     * </p>
     * 
     * @return Specifies the segment to delete.
     */

    public String getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * Specifies the segment to delete.
     * </p>
     * 
     * @param segment
     *        Specifies the segment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSegmentRequest withSegment(String segment) {
        setSegment(segment);
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
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSegmentRequest == false)
            return false;
        DeleteSegmentRequest other = (DeleteSegmentRequest) obj;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSegmentRequest clone() {
        return (DeleteSegmentRequest) super.clone();
    }

}
