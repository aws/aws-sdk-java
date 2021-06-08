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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN, EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 ad
 * markers from the origin manifest to the MediaTailor personalized manifest.
 * </p>
 * <p>
 * No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but no ads are filled for
 * that ad break, MediaTailor will not set the value to 0.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AdMarkerPassthrough" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdMarkerPassthrough implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables ad marker passthrough for your configuration.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Enables ad marker passthrough for your configuration.
     * </p>
     * 
     * @param enabled
     *        Enables ad marker passthrough for your configuration.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables ad marker passthrough for your configuration.
     * </p>
     * 
     * @return Enables ad marker passthrough for your configuration.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables ad marker passthrough for your configuration.
     * </p>
     * 
     * @param enabled
     *        Enables ad marker passthrough for your configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdMarkerPassthrough withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables ad marker passthrough for your configuration.
     * </p>
     * 
     * @return Enables ad marker passthrough for your configuration.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdMarkerPassthrough == false)
            return false;
        AdMarkerPassthrough other = (AdMarkerPassthrough) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AdMarkerPassthrough clone() {
        try {
            return (AdMarkerPassthrough) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AdMarkerPassthroughMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
