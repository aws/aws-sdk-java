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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Output Group settings, including type
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/OutputGroupSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputGroupSettings implements Serializable, Cloneable, StructuredPojo {

    private CmafGroupSettings cmafGroupSettings;

    private DashIsoGroupSettings dashIsoGroupSettings;

    private FileGroupSettings fileGroupSettings;

    private HlsGroupSettings hlsGroupSettings;

    private MsSmoothGroupSettings msSmoothGroupSettings;

    private String type;

    /**
     * @param cmafGroupSettings
     */

    public void setCmafGroupSettings(CmafGroupSettings cmafGroupSettings) {
        this.cmafGroupSettings = cmafGroupSettings;
    }

    /**
     * @return
     */

    public CmafGroupSettings getCmafGroupSettings() {
        return this.cmafGroupSettings;
    }

    /**
     * @param cmafGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withCmafGroupSettings(CmafGroupSettings cmafGroupSettings) {
        setCmafGroupSettings(cmafGroupSettings);
        return this;
    }

    /**
     * @param dashIsoGroupSettings
     */

    public void setDashIsoGroupSettings(DashIsoGroupSettings dashIsoGroupSettings) {
        this.dashIsoGroupSettings = dashIsoGroupSettings;
    }

    /**
     * @return
     */

    public DashIsoGroupSettings getDashIsoGroupSettings() {
        return this.dashIsoGroupSettings;
    }

    /**
     * @param dashIsoGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withDashIsoGroupSettings(DashIsoGroupSettings dashIsoGroupSettings) {
        setDashIsoGroupSettings(dashIsoGroupSettings);
        return this;
    }

    /**
     * @param fileGroupSettings
     */

    public void setFileGroupSettings(FileGroupSettings fileGroupSettings) {
        this.fileGroupSettings = fileGroupSettings;
    }

    /**
     * @return
     */

    public FileGroupSettings getFileGroupSettings() {
        return this.fileGroupSettings;
    }

    /**
     * @param fileGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withFileGroupSettings(FileGroupSettings fileGroupSettings) {
        setFileGroupSettings(fileGroupSettings);
        return this;
    }

    /**
     * @param hlsGroupSettings
     */

    public void setHlsGroupSettings(HlsGroupSettings hlsGroupSettings) {
        this.hlsGroupSettings = hlsGroupSettings;
    }

    /**
     * @return
     */

    public HlsGroupSettings getHlsGroupSettings() {
        return this.hlsGroupSettings;
    }

    /**
     * @param hlsGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withHlsGroupSettings(HlsGroupSettings hlsGroupSettings) {
        setHlsGroupSettings(hlsGroupSettings);
        return this;
    }

    /**
     * @param msSmoothGroupSettings
     */

    public void setMsSmoothGroupSettings(MsSmoothGroupSettings msSmoothGroupSettings) {
        this.msSmoothGroupSettings = msSmoothGroupSettings;
    }

    /**
     * @return
     */

    public MsSmoothGroupSettings getMsSmoothGroupSettings() {
        return this.msSmoothGroupSettings;
    }

    /**
     * @param msSmoothGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withMsSmoothGroupSettings(MsSmoothGroupSettings msSmoothGroupSettings) {
        setMsSmoothGroupSettings(msSmoothGroupSettings);
        return this;
    }

    /**
     * @param type
     * @see OutputGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see OutputGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputGroupType
     */

    public OutputGroupSettings withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputGroupType
     */

    public OutputGroupSettings withType(OutputGroupType type) {
        this.type = type.toString();
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
        if (getCmafGroupSettings() != null)
            sb.append("CmafGroupSettings: ").append(getCmafGroupSettings()).append(",");
        if (getDashIsoGroupSettings() != null)
            sb.append("DashIsoGroupSettings: ").append(getDashIsoGroupSettings()).append(",");
        if (getFileGroupSettings() != null)
            sb.append("FileGroupSettings: ").append(getFileGroupSettings()).append(",");
        if (getHlsGroupSettings() != null)
            sb.append("HlsGroupSettings: ").append(getHlsGroupSettings()).append(",");
        if (getMsSmoothGroupSettings() != null)
            sb.append("MsSmoothGroupSettings: ").append(getMsSmoothGroupSettings()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroupSettings == false)
            return false;
        OutputGroupSettings other = (OutputGroupSettings) obj;
        if (other.getCmafGroupSettings() == null ^ this.getCmafGroupSettings() == null)
            return false;
        if (other.getCmafGroupSettings() != null && other.getCmafGroupSettings().equals(this.getCmafGroupSettings()) == false)
            return false;
        if (other.getDashIsoGroupSettings() == null ^ this.getDashIsoGroupSettings() == null)
            return false;
        if (other.getDashIsoGroupSettings() != null && other.getDashIsoGroupSettings().equals(this.getDashIsoGroupSettings()) == false)
            return false;
        if (other.getFileGroupSettings() == null ^ this.getFileGroupSettings() == null)
            return false;
        if (other.getFileGroupSettings() != null && other.getFileGroupSettings().equals(this.getFileGroupSettings()) == false)
            return false;
        if (other.getHlsGroupSettings() == null ^ this.getHlsGroupSettings() == null)
            return false;
        if (other.getHlsGroupSettings() != null && other.getHlsGroupSettings().equals(this.getHlsGroupSettings()) == false)
            return false;
        if (other.getMsSmoothGroupSettings() == null ^ this.getMsSmoothGroupSettings() == null)
            return false;
        if (other.getMsSmoothGroupSettings() != null && other.getMsSmoothGroupSettings().equals(this.getMsSmoothGroupSettings()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCmafGroupSettings() == null) ? 0 : getCmafGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getDashIsoGroupSettings() == null) ? 0 : getDashIsoGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getFileGroupSettings() == null) ? 0 : getFileGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsGroupSettings() == null) ? 0 : getHlsGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getMsSmoothGroupSettings() == null) ? 0 : getMsSmoothGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public OutputGroupSettings clone() {
        try {
            return (OutputGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.OutputGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
