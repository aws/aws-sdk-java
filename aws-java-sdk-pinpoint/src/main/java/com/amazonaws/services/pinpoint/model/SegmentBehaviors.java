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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies dimension settings for including or excluding endpoints from a segment based on how recently an endpoint
 * was active.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentBehaviors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentBehaviors implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension settings that are based on how recently an endpoint was active.
     * </p>
     */
    private RecencyDimension recency;

    /**
     * <p>
     * The dimension settings that are based on how recently an endpoint was active.
     * </p>
     * 
     * @param recency
     *        The dimension settings that are based on how recently an endpoint was active.
     */

    public void setRecency(RecencyDimension recency) {
        this.recency = recency;
    }

    /**
     * <p>
     * The dimension settings that are based on how recently an endpoint was active.
     * </p>
     * 
     * @return The dimension settings that are based on how recently an endpoint was active.
     */

    public RecencyDimension getRecency() {
        return this.recency;
    }

    /**
     * <p>
     * The dimension settings that are based on how recently an endpoint was active.
     * </p>
     * 
     * @param recency
     *        The dimension settings that are based on how recently an endpoint was active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentBehaviors withRecency(RecencyDimension recency) {
        setRecency(recency);
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
        if (getRecency() != null)
            sb.append("Recency: ").append(getRecency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentBehaviors == false)
            return false;
        SegmentBehaviors other = (SegmentBehaviors) obj;
        if (other.getRecency() == null ^ this.getRecency() == null)
            return false;
        if (other.getRecency() != null && other.getRecency().equals(this.getRecency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecency() == null) ? 0 : getRecency().hashCode());
        return hashCode;
    }

    @Override
    public SegmentBehaviors clone() {
        try {
            return (SegmentBehaviors) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentBehaviorsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
