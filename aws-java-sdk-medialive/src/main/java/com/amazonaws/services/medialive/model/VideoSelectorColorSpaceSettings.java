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
 * Video Selector Color Space Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VideoSelectorColorSpaceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoSelectorColorSpaceSettings implements Serializable, Cloneable, StructuredPojo {

    private Hdr10Settings hdr10Settings;

    /**
     * @param hdr10Settings
     */

    public void setHdr10Settings(Hdr10Settings hdr10Settings) {
        this.hdr10Settings = hdr10Settings;
    }

    /**
     * @return
     */

    public Hdr10Settings getHdr10Settings() {
        return this.hdr10Settings;
    }

    /**
     * @param hdr10Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelectorColorSpaceSettings withHdr10Settings(Hdr10Settings hdr10Settings) {
        setHdr10Settings(hdr10Settings);
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
        if (getHdr10Settings() != null)
            sb.append("Hdr10Settings: ").append(getHdr10Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelectorColorSpaceSettings == false)
            return false;
        VideoSelectorColorSpaceSettings other = (VideoSelectorColorSpaceSettings) obj;
        if (other.getHdr10Settings() == null ^ this.getHdr10Settings() == null)
            return false;
        if (other.getHdr10Settings() != null && other.getHdr10Settings().equals(this.getHdr10Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHdr10Settings() == null) ? 0 : getHdr10Settings().hashCode());
        return hashCode;
    }

    @Override
    public VideoSelectorColorSpaceSettings clone() {
        try {
            return (VideoSelectorColorSpaceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VideoSelectorColorSpaceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
