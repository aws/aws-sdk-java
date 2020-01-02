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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Statmux rate control settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexStatmuxVideoSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexStatmuxVideoSettings implements Serializable, Cloneable, StructuredPojo {

    /** Maximum statmux bitrate. */
    private Integer maximumBitrate;
    /** Minimum statmux bitrate. */
    private Integer minimumBitrate;

    /**
     * Maximum statmux bitrate.
     * 
     * @param maximumBitrate
     *        Maximum statmux bitrate.
     */

    public void setMaximumBitrate(Integer maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Maximum statmux bitrate.
     * 
     * @return Maximum statmux bitrate.
     */

    public Integer getMaximumBitrate() {
        return this.maximumBitrate;
    }

    /**
     * Maximum statmux bitrate.
     * 
     * @param maximumBitrate
     *        Maximum statmux bitrate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexStatmuxVideoSettings withMaximumBitrate(Integer maximumBitrate) {
        setMaximumBitrate(maximumBitrate);
        return this;
    }

    /**
     * Minimum statmux bitrate.
     * 
     * @param minimumBitrate
     *        Minimum statmux bitrate.
     */

    public void setMinimumBitrate(Integer minimumBitrate) {
        this.minimumBitrate = minimumBitrate;
    }

    /**
     * Minimum statmux bitrate.
     * 
     * @return Minimum statmux bitrate.
     */

    public Integer getMinimumBitrate() {
        return this.minimumBitrate;
    }

    /**
     * Minimum statmux bitrate.
     * 
     * @param minimumBitrate
     *        Minimum statmux bitrate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexStatmuxVideoSettings withMinimumBitrate(Integer minimumBitrate) {
        setMinimumBitrate(minimumBitrate);
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
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: ").append(getMaximumBitrate()).append(",");
        if (getMinimumBitrate() != null)
            sb.append("MinimumBitrate: ").append(getMinimumBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexStatmuxVideoSettings == false)
            return false;
        MultiplexStatmuxVideoSettings other = (MultiplexStatmuxVideoSettings) obj;
        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getMinimumBitrate() == null ^ this.getMinimumBitrate() == null)
            return false;
        if (other.getMinimumBitrate() != null && other.getMinimumBitrate().equals(this.getMinimumBitrate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinimumBitrate() == null) ? 0 : getMinimumBitrate().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexStatmuxVideoSettings clone() {
        try {
            return (MultiplexStatmuxVideoSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexStatmuxVideoSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
