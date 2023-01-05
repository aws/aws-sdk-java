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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateSegment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSegmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains the complete information about the segment that was just created.
     * </p>
     */
    private Segment segment;

    /**
     * <p>
     * A structure that contains the complete information about the segment that was just created.
     * </p>
     * 
     * @param segment
     *        A structure that contains the complete information about the segment that was just created.
     */

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * A structure that contains the complete information about the segment that was just created.
     * </p>
     * 
     * @return A structure that contains the complete information about the segment that was just created.
     */

    public Segment getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * A structure that contains the complete information about the segment that was just created.
     * </p>
     * 
     * @param segment
     *        A structure that contains the complete information about the segment that was just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSegmentResult withSegment(Segment segment) {
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

        if (obj instanceof CreateSegmentResult == false)
            return false;
        CreateSegmentResult other = (CreateSegmentResult) obj;
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
    public CreateSegmentResult clone() {
        try {
            return (CreateSegmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
