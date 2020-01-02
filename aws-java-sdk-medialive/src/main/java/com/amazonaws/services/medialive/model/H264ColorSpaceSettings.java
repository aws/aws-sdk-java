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
 * H264 Color Space Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/H264ColorSpaceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H264ColorSpaceSettings implements Serializable, Cloneable, StructuredPojo {

    private ColorSpacePassthroughSettings colorSpacePassthroughSettings;

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

    public H264ColorSpaceSettings withColorSpacePassthroughSettings(ColorSpacePassthroughSettings colorSpacePassthroughSettings) {
        setColorSpacePassthroughSettings(colorSpacePassthroughSettings);
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

    public H264ColorSpaceSettings withRec601Settings(Rec601Settings rec601Settings) {
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

    public H264ColorSpaceSettings withRec709Settings(Rec709Settings rec709Settings) {
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

        if (obj instanceof H264ColorSpaceSettings == false)
            return false;
        H264ColorSpaceSettings other = (H264ColorSpaceSettings) obj;
        if (other.getColorSpacePassthroughSettings() == null ^ this.getColorSpacePassthroughSettings() == null)
            return false;
        if (other.getColorSpacePassthroughSettings() != null
                && other.getColorSpacePassthroughSettings().equals(this.getColorSpacePassthroughSettings()) == false)
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
        hashCode = prime * hashCode + ((getRec601Settings() == null) ? 0 : getRec601Settings().hashCode());
        hashCode = prime * hashCode + ((getRec709Settings() == null) ? 0 : getRec709Settings().hashCode());
        return hashCode;
    }

    @Override
    public H264ColorSpaceSettings clone() {
        try {
            return (H264ColorSpaceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.H264ColorSpaceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
