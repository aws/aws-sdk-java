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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for the action to deactivate the image in a specific layer.
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StaticImageDeactivateScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticImageDeactivateScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /** The time in milliseconds for the image to fade out. Default is 0 (no fade-out). */
    private Integer fadeOut;
    /** The image overlay layer to deactivate, 0 to 7. Default is 0. */
    private Integer layer;

    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
     * 
     * @param fadeOut
     *        The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
     */

    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
     * 
     * @return The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
     */

    public Integer getFadeOut() {
        return this.fadeOut;
    }

    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
     * 
     * @param fadeOut
     *        The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageDeactivateScheduleActionSettings withFadeOut(Integer fadeOut) {
        setFadeOut(fadeOut);
        return this;
    }

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * 
     * @param layer
     *        The image overlay layer to deactivate, 0 to 7. Default is 0.
     */

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * 
     * @return The image overlay layer to deactivate, 0 to 7. Default is 0.
     */

    public Integer getLayer() {
        return this.layer;
    }

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * 
     * @param layer
     *        The image overlay layer to deactivate, 0 to 7. Default is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageDeactivateScheduleActionSettings withLayer(Integer layer) {
        setLayer(layer);
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
        if (getFadeOut() != null)
            sb.append("FadeOut: ").append(getFadeOut()).append(",");
        if (getLayer() != null)
            sb.append("Layer: ").append(getLayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticImageDeactivateScheduleActionSettings == false)
            return false;
        StaticImageDeactivateScheduleActionSettings other = (StaticImageDeactivateScheduleActionSettings) obj;
        if (other.getFadeOut() == null ^ this.getFadeOut() == null)
            return false;
        if (other.getFadeOut() != null && other.getFadeOut().equals(this.getFadeOut()) == false)
            return false;
        if (other.getLayer() == null ^ this.getLayer() == null)
            return false;
        if (other.getLayer() != null && other.getLayer().equals(this.getLayer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFadeOut() == null) ? 0 : getFadeOut().hashCode());
        hashCode = prime * hashCode + ((getLayer() == null) ? 0 : getLayer().hashCode());
        return hashCode;
    }

    @Override
    public StaticImageDeactivateScheduleActionSettings clone() {
        try {
            return (StaticImageDeactivateScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.StaticImageDeactivateScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
