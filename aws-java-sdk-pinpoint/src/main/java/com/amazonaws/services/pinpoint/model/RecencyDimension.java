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
 * Specifies criteria for including or excluding endpoints from a segment based on how recently an endpoint was active.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RecencyDimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecencyDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or inactive.
     * </p>
     */
    private String duration;
    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within
     * the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the
     * specified duration are included in the segment.
     * </p>
     */
    private String recencyType;

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or inactive.
     * </p>
     * 
     * @param duration
     *        The duration to use when determining whether an endpoint is active or inactive.
     * @see Duration
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or inactive.
     * </p>
     * 
     * @return The duration to use when determining whether an endpoint is active or inactive.
     * @see Duration
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or inactive.
     * </p>
     * 
     * @param duration
     *        The duration to use when determining whether an endpoint is active or inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Duration
     */

    public RecencyDimension withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or inactive.
     * </p>
     * 
     * @param duration
     *        The duration to use when determining whether an endpoint is active or inactive.
     * @see Duration
     */

    public void setDuration(Duration duration) {
        withDuration(duration);
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or inactive.
     * </p>
     * 
     * @param duration
     *        The duration to use when determining whether an endpoint is active or inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Duration
     */

    public RecencyDimension withDuration(Duration duration) {
        this.duration = duration.toString();
        return this;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within
     * the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the
     * specified duration are included in the segment.
     * </p>
     * 
     * @param recencyType
     *        The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active
     *        within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active
     *        within the specified duration are included in the segment.
     * @see RecencyType
     */

    public void setRecencyType(String recencyType) {
        this.recencyType = recencyType;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within
     * the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the
     * specified duration are included in the segment.
     * </p>
     * 
     * @return The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were
     *         active within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't
     *         active within the specified duration are included in the segment.
     * @see RecencyType
     */

    public String getRecencyType() {
        return this.recencyType;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within
     * the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the
     * specified duration are included in the segment.
     * </p>
     * 
     * @param recencyType
     *        The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active
     *        within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active
     *        within the specified duration are included in the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecencyType
     */

    public RecencyDimension withRecencyType(String recencyType) {
        setRecencyType(recencyType);
        return this;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within
     * the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the
     * specified duration are included in the segment.
     * </p>
     * 
     * @param recencyType
     *        The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active
     *        within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active
     *        within the specified duration are included in the segment.
     * @see RecencyType
     */

    public void setRecencyType(RecencyType recencyType) {
        withRecencyType(recencyType);
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within
     * the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the
     * specified duration are included in the segment.
     * </p>
     * 
     * @param recencyType
     *        The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active
     *        within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active
     *        within the specified duration are included in the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecencyType
     */

    public RecencyDimension withRecencyType(RecencyType recencyType) {
        this.recencyType = recencyType.toString();
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getRecencyType() != null)
            sb.append("RecencyType: ").append(getRecencyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecencyDimension == false)
            return false;
        RecencyDimension other = (RecencyDimension) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getRecencyType() == null ^ this.getRecencyType() == null)
            return false;
        if (other.getRecencyType() != null && other.getRecencyType().equals(this.getRecencyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getRecencyType() == null) ? 0 : getRecencyType().hashCode());
        return hashCode;
    }

    @Override
    public RecencyDimension clone() {
        try {
            return (RecencyDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.RecencyDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
