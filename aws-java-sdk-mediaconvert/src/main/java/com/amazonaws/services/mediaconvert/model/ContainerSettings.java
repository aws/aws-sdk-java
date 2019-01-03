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
 * Container specific settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ContainerSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerSettings implements Serializable, Cloneable, StructuredPojo {

    private String container;

    private F4vSettings f4vSettings;

    private M2tsSettings m2tsSettings;

    private M3u8Settings m3u8Settings;

    private MovSettings movSettings;

    private Mp4Settings mp4Settings;

    /**
     * @param container
     * @see ContainerType
     */

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * @return
     * @see ContainerType
     */

    public String getContainer() {
        return this.container;
    }

    /**
     * @param container
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public ContainerSettings withContainer(String container) {
        setContainer(container);
        return this;
    }

    /**
     * @param container
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public ContainerSettings withContainer(ContainerType container) {
        this.container = container.toString();
        return this;
    }

    /**
     * @param f4vSettings
     */

    public void setF4vSettings(F4vSettings f4vSettings) {
        this.f4vSettings = f4vSettings;
    }

    /**
     * @return
     */

    public F4vSettings getF4vSettings() {
        return this.f4vSettings;
    }

    /**
     * @param f4vSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withF4vSettings(F4vSettings f4vSettings) {
        setF4vSettings(f4vSettings);
        return this;
    }

    /**
     * @param m2tsSettings
     */

    public void setM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
    }

    /**
     * @return
     */

    public M2tsSettings getM2tsSettings() {
        return this.m2tsSettings;
    }

    /**
     * @param m2tsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withM2tsSettings(M2tsSettings m2tsSettings) {
        setM2tsSettings(m2tsSettings);
        return this;
    }

    /**
     * @param m3u8Settings
     */

    public void setM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
    }

    /**
     * @return
     */

    public M3u8Settings getM3u8Settings() {
        return this.m3u8Settings;
    }

    /**
     * @param m3u8Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withM3u8Settings(M3u8Settings m3u8Settings) {
        setM3u8Settings(m3u8Settings);
        return this;
    }

    /**
     * @param movSettings
     */

    public void setMovSettings(MovSettings movSettings) {
        this.movSettings = movSettings;
    }

    /**
     * @return
     */

    public MovSettings getMovSettings() {
        return this.movSettings;
    }

    /**
     * @param movSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withMovSettings(MovSettings movSettings) {
        setMovSettings(movSettings);
        return this;
    }

    /**
     * @param mp4Settings
     */

    public void setMp4Settings(Mp4Settings mp4Settings) {
        this.mp4Settings = mp4Settings;
    }

    /**
     * @return
     */

    public Mp4Settings getMp4Settings() {
        return this.mp4Settings;
    }

    /**
     * @param mp4Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withMp4Settings(Mp4Settings mp4Settings) {
        setMp4Settings(mp4Settings);
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
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getF4vSettings() != null)
            sb.append("F4vSettings: ").append(getF4vSettings()).append(",");
        if (getM2tsSettings() != null)
            sb.append("M2tsSettings: ").append(getM2tsSettings()).append(",");
        if (getM3u8Settings() != null)
            sb.append("M3u8Settings: ").append(getM3u8Settings()).append(",");
        if (getMovSettings() != null)
            sb.append("MovSettings: ").append(getMovSettings()).append(",");
        if (getMp4Settings() != null)
            sb.append("Mp4Settings: ").append(getMp4Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerSettings == false)
            return false;
        ContainerSettings other = (ContainerSettings) obj;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getF4vSettings() == null ^ this.getF4vSettings() == null)
            return false;
        if (other.getF4vSettings() != null && other.getF4vSettings().equals(this.getF4vSettings()) == false)
            return false;
        if (other.getM2tsSettings() == null ^ this.getM2tsSettings() == null)
            return false;
        if (other.getM2tsSettings() != null && other.getM2tsSettings().equals(this.getM2tsSettings()) == false)
            return false;
        if (other.getM3u8Settings() == null ^ this.getM3u8Settings() == null)
            return false;
        if (other.getM3u8Settings() != null && other.getM3u8Settings().equals(this.getM3u8Settings()) == false)
            return false;
        if (other.getMovSettings() == null ^ this.getMovSettings() == null)
            return false;
        if (other.getMovSettings() != null && other.getMovSettings().equals(this.getMovSettings()) == false)
            return false;
        if (other.getMp4Settings() == null ^ this.getMp4Settings() == null)
            return false;
        if (other.getMp4Settings() != null && other.getMp4Settings().equals(this.getMp4Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getF4vSettings() == null) ? 0 : getF4vSettings().hashCode());
        hashCode = prime * hashCode + ((getM2tsSettings() == null) ? 0 : getM2tsSettings().hashCode());
        hashCode = prime * hashCode + ((getM3u8Settings() == null) ? 0 : getM3u8Settings().hashCode());
        hashCode = prime * hashCode + ((getMovSettings() == null) ? 0 : getMovSettings().hashCode());
        hashCode = prime * hashCode + ((getMp4Settings() == null) ? 0 : getMp4Settings().hashCode());
        return hashCode;
    }

    @Override
    public ContainerSettings clone() {
        try {
            return (ContainerSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ContainerSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
