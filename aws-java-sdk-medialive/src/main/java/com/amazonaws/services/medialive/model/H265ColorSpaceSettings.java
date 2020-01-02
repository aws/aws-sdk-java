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
 * H265 Color Space Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/H265ColorSpaceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H265ColorSpaceSettings implements Serializable, Cloneable, StructuredPojo {

    private ColorSpacePassthroughSettings colorSpacePassthroughSettings;

    private Hdr10Settings hdr10Settings;

    private Rec601Settings rec601Settings;

    private Rec709Settings rec709Settings;

    /**
     * @param colorSpacePassthroughSettings
     */

    public void setColorSpacePassthroughSettings(ColorSpacePassthroughSettings colorSpacePassthroughSettings) {
        this.colorSpacePassthroughSettings = colorSpacePassthroughSettings;
    }

    /**
     * @return
     */

    public ColorSpacePassthroughSettings getColorSpacePassthroughSettings() {
        return this.colorSpacePassthroughSettings;
    }

    /**
     * @param colorSpacePassthroughSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265ColorSpaceSettings withColorSpacePassthroughSettings(ColorSpacePassthroughSettings colorSpacePassthroughSettings) {
        setColorSpacePassthroughSettings(colorSpacePassthroughSettings);
        return this;
    }

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

    public H265ColorSpaceSettings withHdr10Settings(Hdr10Settings hdr10Settings) {
        setHdr10Settings(hdr10Settings);
        return this;
    }

    /**
     * @param rec601Settings
     */

    public void setRec601Settings(Rec601Settings rec601Settings) {
        this.rec601Settings = rec601Settings;
    }

    /**
     * @return
     */

    public Rec601Settings getRec601Settings() {
        return this.rec601Settings;
    }

    /**
     * @param rec601Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265ColorSpaceSettings withRec601Settings(Rec601Settings rec601Settings) {
        setRec601Settings(rec601Settings);
        return this;
    }

    /**
     * @param rec709Settings
     */

    public void setRec709Settings(Rec709Settings rec709Settings) {
        this.rec709Settings = rec709Settings;
    }

    /**
     * @return
     */

    public Rec709Settings getRec709Settings() {
        return this.rec709Settings;
    }

    /**
     * @param rec709Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265ColorSpaceSettings withRec709Settings(Rec709Settings rec709Settings) {
        setRec709Settings(rec709Settings);
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
        if (getColorSpacePassthroughSettings() != null)
            sb.append("ColorSpacePassthroughSettings: ").append(getColorSpacePassthroughSettings()).append(",");
        if (getHdr10Settings() != null)
            sb.append("Hdr10Settings: ").append(getHdr10Settings()).append(",");
        if (getRec601Settings() != null)
            sb.append("Rec601Settings: ").append(getRec601Settings()).append(",");
        if (getRec709Settings() != null)
            sb.append("Rec709Settings: ").append(getRec709Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H265ColorSpaceSettings == false)
            return false;
        H265ColorSpaceSettings other = (H265ColorSpaceSettings) obj;
        if (other.getColorSpacePassthroughSettings() == null ^ this.getColorSpacePassthroughSettings() == null)
            return false;
        if (other.getColorSpacePassthroughSettings() != null
                && other.getColorSpacePassthroughSettings().equals(this.getColorSpacePassthroughSettings()) == false)
            return false;
        if (other.getHdr10Settings() == null ^ this.getHdr10Settings() == null)
            return false;
        if (other.getHdr10Settings() != null && other.getHdr10Settings().equals(this.getHdr10Settings()) == false)
            return false;
        if (other.getRec601Settings() == null ^ this.getRec601Settings() == null)
            return false;
        if (other.getRec601Settings() != null && other.getRec601Settings().equals(this.getRec601Settings()) == false)
            return false;
        if (other.getRec709Settings() == null ^ this.getRec709Settings() == null)
            return false;
        if (other.getRec709Settings() != null && other.getRec709Settings().equals(this.getRec709Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColorSpacePassthroughSettings() == null) ? 0 : getColorSpacePassthroughSettings().hashCode());
        hashCode = prime * hashCode + ((getHdr10Settings() == null) ? 0 : getHdr10Settings().hashCode());
        hashCode = prime * hashCode + ((getRec601Settings() == null) ? 0 : getRec601Settings().hashCode());
        hashCode = prime * hashCode + ((getRec709Settings() == null) ? 0 : getRec709Settings().hashCode());
        return hashCode;
    }

    @Override
    public H265ColorSpaceSettings clone() {
        try {
            return (H265ColorSpaceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.H265ColorSpaceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
