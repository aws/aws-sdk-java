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
 * Hls Cdn Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/HlsCdnSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsCdnSettings implements Serializable, Cloneable, StructuredPojo {

    private HlsAkamaiSettings hlsAkamaiSettings;

    private HlsBasicPutSettings hlsBasicPutSettings;

    private HlsMediaStoreSettings hlsMediaStoreSettings;

    private HlsWebdavSettings hlsWebdavSettings;

    /**
     * @param hlsAkamaiSettings
     */

    public void setHlsAkamaiSettings(HlsAkamaiSettings hlsAkamaiSettings) {
        this.hlsAkamaiSettings = hlsAkamaiSettings;
    }

    /**
     * @return
     */

    public HlsAkamaiSettings getHlsAkamaiSettings() {
        return this.hlsAkamaiSettings;
    }

    /**
     * @param hlsAkamaiSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsCdnSettings withHlsAkamaiSettings(HlsAkamaiSettings hlsAkamaiSettings) {
        setHlsAkamaiSettings(hlsAkamaiSettings);
        return this;
    }

    /**
     * @param hlsBasicPutSettings
     */

    public void setHlsBasicPutSettings(HlsBasicPutSettings hlsBasicPutSettings) {
        this.hlsBasicPutSettings = hlsBasicPutSettings;
    }

    /**
     * @return
     */

    public HlsBasicPutSettings getHlsBasicPutSettings() {
        return this.hlsBasicPutSettings;
    }

    /**
     * @param hlsBasicPutSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsCdnSettings withHlsBasicPutSettings(HlsBasicPutSettings hlsBasicPutSettings) {
        setHlsBasicPutSettings(hlsBasicPutSettings);
        return this;
    }

    /**
     * @param hlsMediaStoreSettings
     */

    public void setHlsMediaStoreSettings(HlsMediaStoreSettings hlsMediaStoreSettings) {
        this.hlsMediaStoreSettings = hlsMediaStoreSettings;
    }

    /**
     * @return
     */

    public HlsMediaStoreSettings getHlsMediaStoreSettings() {
        return this.hlsMediaStoreSettings;
    }

    /**
     * @param hlsMediaStoreSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsCdnSettings withHlsMediaStoreSettings(HlsMediaStoreSettings hlsMediaStoreSettings) {
        setHlsMediaStoreSettings(hlsMediaStoreSettings);
        return this;
    }

    /**
     * @param hlsWebdavSettings
     */

    public void setHlsWebdavSettings(HlsWebdavSettings hlsWebdavSettings) {
        this.hlsWebdavSettings = hlsWebdavSettings;
    }

    /**
     * @return
     */

    public HlsWebdavSettings getHlsWebdavSettings() {
        return this.hlsWebdavSettings;
    }

    /**
     * @param hlsWebdavSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsCdnSettings withHlsWebdavSettings(HlsWebdavSettings hlsWebdavSettings) {
        setHlsWebdavSettings(hlsWebdavSettings);
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
        if (getHlsAkamaiSettings() != null)
            sb.append("HlsAkamaiSettings: ").append(getHlsAkamaiSettings()).append(",");
        if (getHlsBasicPutSettings() != null)
            sb.append("HlsBasicPutSettings: ").append(getHlsBasicPutSettings()).append(",");
        if (getHlsMediaStoreSettings() != null)
            sb.append("HlsMediaStoreSettings: ").append(getHlsMediaStoreSettings()).append(",");
        if (getHlsWebdavSettings() != null)
            sb.append("HlsWebdavSettings: ").append(getHlsWebdavSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsCdnSettings == false)
            return false;
        HlsCdnSettings other = (HlsCdnSettings) obj;
        if (other.getHlsAkamaiSettings() == null ^ this.getHlsAkamaiSettings() == null)
            return false;
        if (other.getHlsAkamaiSettings() != null && other.getHlsAkamaiSettings().equals(this.getHlsAkamaiSettings()) == false)
            return false;
        if (other.getHlsBasicPutSettings() == null ^ this.getHlsBasicPutSettings() == null)
            return false;
        if (other.getHlsBasicPutSettings() != null && other.getHlsBasicPutSettings().equals(this.getHlsBasicPutSettings()) == false)
            return false;
        if (other.getHlsMediaStoreSettings() == null ^ this.getHlsMediaStoreSettings() == null)
            return false;
        if (other.getHlsMediaStoreSettings() != null && other.getHlsMediaStoreSettings().equals(this.getHlsMediaStoreSettings()) == false)
            return false;
        if (other.getHlsWebdavSettings() == null ^ this.getHlsWebdavSettings() == null)
            return false;
        if (other.getHlsWebdavSettings() != null && other.getHlsWebdavSettings().equals(this.getHlsWebdavSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHlsAkamaiSettings() == null) ? 0 : getHlsAkamaiSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsBasicPutSettings() == null) ? 0 : getHlsBasicPutSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsMediaStoreSettings() == null) ? 0 : getHlsMediaStoreSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsWebdavSettings() == null) ? 0 : getHlsWebdavSettings().hashCode());
        return hashCode;
    }

    @Override
    public HlsCdnSettings clone() {
        try {
            return (HlsCdnSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.HlsCdnSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
