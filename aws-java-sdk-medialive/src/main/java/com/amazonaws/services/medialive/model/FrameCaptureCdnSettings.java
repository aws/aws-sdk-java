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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Frame Capture Cdn Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FrameCaptureCdnSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameCaptureCdnSettings implements Serializable, Cloneable, StructuredPojo {

    private FrameCaptureS3Settings frameCaptureS3Settings;

    /**
     * @param frameCaptureS3Settings
     */

    public void setFrameCaptureS3Settings(FrameCaptureS3Settings frameCaptureS3Settings) {
        this.frameCaptureS3Settings = frameCaptureS3Settings;
    }

    /**
     * @return
     */

    public FrameCaptureS3Settings getFrameCaptureS3Settings() {
        return this.frameCaptureS3Settings;
    }

    /**
     * @param frameCaptureS3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameCaptureCdnSettings withFrameCaptureS3Settings(FrameCaptureS3Settings frameCaptureS3Settings) {
        setFrameCaptureS3Settings(frameCaptureS3Settings);
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
        if (getFrameCaptureS3Settings() != null)
            sb.append("FrameCaptureS3Settings: ").append(getFrameCaptureS3Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureCdnSettings == false)
            return false;
        FrameCaptureCdnSettings other = (FrameCaptureCdnSettings) obj;
        if (other.getFrameCaptureS3Settings() == null ^ this.getFrameCaptureS3Settings() == null)
            return false;
        if (other.getFrameCaptureS3Settings() != null && other.getFrameCaptureS3Settings().equals(this.getFrameCaptureS3Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameCaptureS3Settings() == null) ? 0 : getFrameCaptureS3Settings().hashCode());
        return hashCode;
    }

    @Override
    public FrameCaptureCdnSettings clone() {
        try {
            return (FrameCaptureCdnSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FrameCaptureCdnSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
