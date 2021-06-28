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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings specific to audio sources in an HLS alternate rendition group. Specify the properties (renditionGroupId,
 * renditionName or renditionLanguageCode) to identify the unique audio track among the alternative rendition groups
 * present in the HLS manifest. If no unique track is found, or multiple tracks match the properties provided, the job
 * fails. If no properties in hlsRenditionGroupSettings are specified, the default audio track within the video segment
 * is chosen. If there is no audio within video segment, the alternative audio with DEFAULT=YES is chosen instead.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/HlsRenditionGroupSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsRenditionGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /** Optional. Specify alternative group ID */
    private String renditionGroupId;
    /** Optional. Specify ISO 639-2 or ISO 639-3 code in the language property */
    private String renditionLanguageCode;
    /** Optional. Specify media name */
    private String renditionName;

    /**
     * Optional. Specify alternative group ID
     * 
     * @param renditionGroupId
     *        Optional. Specify alternative group ID
     */

    public void setRenditionGroupId(String renditionGroupId) {
        this.renditionGroupId = renditionGroupId;
    }

    /**
     * Optional. Specify alternative group ID
     * 
     * @return Optional. Specify alternative group ID
     */

    public String getRenditionGroupId() {
        return this.renditionGroupId;
    }

    /**
     * Optional. Specify alternative group ID
     * 
     * @param renditionGroupId
     *        Optional. Specify alternative group ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsRenditionGroupSettings withRenditionGroupId(String renditionGroupId) {
        setRenditionGroupId(renditionGroupId);
        return this;
    }

    /**
     * Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * 
     * @param renditionLanguageCode
     *        Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * @see LanguageCode
     */

    public void setRenditionLanguageCode(String renditionLanguageCode) {
        this.renditionLanguageCode = renditionLanguageCode;
    }

    /**
     * Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * 
     * @return Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * @see LanguageCode
     */

    public String getRenditionLanguageCode() {
        return this.renditionLanguageCode;
    }

    /**
     * Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * 
     * @param renditionLanguageCode
     *        Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public HlsRenditionGroupSettings withRenditionLanguageCode(String renditionLanguageCode) {
        setRenditionLanguageCode(renditionLanguageCode);
        return this;
    }

    /**
     * Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * 
     * @param renditionLanguageCode
     *        Optional. Specify ISO 639-2 or ISO 639-3 code in the language property
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public HlsRenditionGroupSettings withRenditionLanguageCode(LanguageCode renditionLanguageCode) {
        this.renditionLanguageCode = renditionLanguageCode.toString();
        return this;
    }

    /**
     * Optional. Specify media name
     * 
     * @param renditionName
     *        Optional. Specify media name
     */

    public void setRenditionName(String renditionName) {
        this.renditionName = renditionName;
    }

    /**
     * Optional. Specify media name
     * 
     * @return Optional. Specify media name
     */

    public String getRenditionName() {
        return this.renditionName;
    }

    /**
     * Optional. Specify media name
     * 
     * @param renditionName
     *        Optional. Specify media name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsRenditionGroupSettings withRenditionName(String renditionName) {
        setRenditionName(renditionName);
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
        if (getRenditionGroupId() != null)
            sb.append("RenditionGroupId: ").append(getRenditionGroupId()).append(",");
        if (getRenditionLanguageCode() != null)
            sb.append("RenditionLanguageCode: ").append(getRenditionLanguageCode()).append(",");
        if (getRenditionName() != null)
            sb.append("RenditionName: ").append(getRenditionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsRenditionGroupSettings == false)
            return false;
        HlsRenditionGroupSettings other = (HlsRenditionGroupSettings) obj;
        if (other.getRenditionGroupId() == null ^ this.getRenditionGroupId() == null)
            return false;
        if (other.getRenditionGroupId() != null && other.getRenditionGroupId().equals(this.getRenditionGroupId()) == false)
            return false;
        if (other.getRenditionLanguageCode() == null ^ this.getRenditionLanguageCode() == null)
            return false;
        if (other.getRenditionLanguageCode() != null && other.getRenditionLanguageCode().equals(this.getRenditionLanguageCode()) == false)
            return false;
        if (other.getRenditionName() == null ^ this.getRenditionName() == null)
            return false;
        if (other.getRenditionName() != null && other.getRenditionName().equals(this.getRenditionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenditionGroupId() == null) ? 0 : getRenditionGroupId().hashCode());
        hashCode = prime * hashCode + ((getRenditionLanguageCode() == null) ? 0 : getRenditionLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getRenditionName() == null) ? 0 : getRenditionName().hashCode());
        return hashCode;
    }

    @Override
    public HlsRenditionGroupSettings clone() {
        try {
            return (HlsRenditionGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.HlsRenditionGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
