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
 * Frame Capture Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FrameCaptureSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameCaptureSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means capture a
     * frame every 10 seconds.
     */
    private Integer captureInterval;

    /**
     * The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means capture a
     * frame every 10 seconds.
     * 
     * @param captureInterval
     *        The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means
     *        capture a frame every 10 seconds.
     */

    public void setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
    }

    /**
     * The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means capture a
     * frame every 10 seconds.
     * 
     * @return The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means
     *         capture a frame every 10 seconds.
     */

    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    /**
     * The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means capture a
     * frame every 10 seconds.
     * 
     * @param captureInterval
     *        The frequency, in seconds, for capturing frames for inclusion in the output. For example, "10" means
     *        capture a frame every 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameCaptureSettings withCaptureInterval(Integer captureInterval) {
        setCaptureInterval(captureInterval);
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
        if (getCaptureInterval() != null)
            sb.append("CaptureInterval: ").append(getCaptureInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureSettings == false)
            return false;
        FrameCaptureSettings other = (FrameCaptureSettings) obj;
        if (other.getCaptureInterval() == null ^ this.getCaptureInterval() == null)
            return false;
        if (other.getCaptureInterval() != null && other.getCaptureInterval().equals(this.getCaptureInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptureInterval() == null) ? 0 : getCaptureInterval().hashCode());
        return hashCode;
    }

    @Override
    public FrameCaptureSettings clone() {
        try {
            return (FrameCaptureSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FrameCaptureSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
