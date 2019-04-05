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
 * Use these settings to set up encryption with a static key provider.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/StaticKeyProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticKeyProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS
     * string. May be omitted to indicate an implicit value of 'identity'.
     */
    private String keyFormat;
    /**
     * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of
     * version values (1/2/3).
     */
    private String keyFormatVersions;
    /** Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue). */
    private String staticKeyValue;
    /** Relates to DRM implementation. The location of the license server used for protecting content. */
    private String url;

    /**
     * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS
     * string. May be omitted to indicate an implicit value of 'identity'.
     * 
     * @param keyFormat
     *        Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse
     *        DNS string. May be omitted to indicate an implicit value of 'identity'.
     */

    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    /**
     * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS
     * string. May be omitted to indicate an implicit value of 'identity'.
     * 
     * @return Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse
     *         DNS string. May be omitted to indicate an implicit value of 'identity'.
     */

    public String getKeyFormat() {
        return this.keyFormat;
    }

    /**
     * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS
     * string. May be omitted to indicate an implicit value of 'identity'.
     * 
     * @param keyFormat
     *        Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse
     *        DNS string. May be omitted to indicate an implicit value of 'identity'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticKeyProvider withKeyFormat(String keyFormat) {
        setKeyFormat(keyFormat);
        return this;
    }

    /**
     * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of
     * version values (1/2/3).
     * 
     * @param keyFormatVersions
     *        Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of
     *        version values (1/2/3).
     */

    public void setKeyFormatVersions(String keyFormatVersions) {
        this.keyFormatVersions = keyFormatVersions;
    }

    /**
     * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of
     * version values (1/2/3).
     * 
     * @return Relates to DRM implementation. Either a single positive integer version value or a slash delimited list
     *         of version values (1/2/3).
     */

    public String getKeyFormatVersions() {
        return this.keyFormatVersions;
    }

    /**
     * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of
     * version values (1/2/3).
     * 
     * @param keyFormatVersions
     *        Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of
     *        version values (1/2/3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticKeyProvider withKeyFormatVersions(String keyFormatVersions) {
        setKeyFormatVersions(keyFormatVersions);
        return this;
    }

    /**
     * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
     * 
     * @param staticKeyValue
     *        Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value
     *        (StaticKeyValue).
     */

    public void setStaticKeyValue(String staticKeyValue) {
        this.staticKeyValue = staticKeyValue;
    }

    /**
     * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
     * 
     * @return Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value
     *         (StaticKeyValue).
     */

    public String getStaticKeyValue() {
        return this.staticKeyValue;
    }

    /**
     * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
     * 
     * @param staticKeyValue
     *        Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value
     *        (StaticKeyValue).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticKeyProvider withStaticKeyValue(String staticKeyValue) {
        setStaticKeyValue(staticKeyValue);
        return this;
    }

    /**
     * Relates to DRM implementation. The location of the license server used for protecting content.
     * 
     * @param url
     *        Relates to DRM implementation. The location of the license server used for protecting content.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Relates to DRM implementation. The location of the license server used for protecting content.
     * 
     * @return Relates to DRM implementation. The location of the license server used for protecting content.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * Relates to DRM implementation. The location of the license server used for protecting content.
     * 
     * @param url
     *        Relates to DRM implementation. The location of the license server used for protecting content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticKeyProvider withUrl(String url) {
        setUrl(url);
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
        if (getKeyFormat() != null)
            sb.append("KeyFormat: ").append(getKeyFormat()).append(",");
        if (getKeyFormatVersions() != null)
            sb.append("KeyFormatVersions: ").append(getKeyFormatVersions()).append(",");
        if (getStaticKeyValue() != null)
            sb.append("StaticKeyValue: ").append(getStaticKeyValue()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticKeyProvider == false)
            return false;
        StaticKeyProvider other = (StaticKeyProvider) obj;
        if (other.getKeyFormat() == null ^ this.getKeyFormat() == null)
            return false;
        if (other.getKeyFormat() != null && other.getKeyFormat().equals(this.getKeyFormat()) == false)
            return false;
        if (other.getKeyFormatVersions() == null ^ this.getKeyFormatVersions() == null)
            return false;
        if (other.getKeyFormatVersions() != null && other.getKeyFormatVersions().equals(this.getKeyFormatVersions()) == false)
            return false;
        if (other.getStaticKeyValue() == null ^ this.getStaticKeyValue() == null)
            return false;
        if (other.getStaticKeyValue() != null && other.getStaticKeyValue().equals(this.getStaticKeyValue()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyFormat() == null) ? 0 : getKeyFormat().hashCode());
        hashCode = prime * hashCode + ((getKeyFormatVersions() == null) ? 0 : getKeyFormatVersions().hashCode());
        hashCode = prime * hashCode + ((getStaticKeyValue() == null) ? 0 : getStaticKeyValue().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public StaticKeyProvider clone() {
        try {
            return (StaticKeyProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.StaticKeyProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
