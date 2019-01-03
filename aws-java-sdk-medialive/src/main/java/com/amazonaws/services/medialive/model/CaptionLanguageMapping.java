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
 * Maps a caption channel to an ISO 693-2 language code (http://www.loc.gov/standards/iso639-2), with an optional
 * description.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionLanguageMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionLanguageMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have a
     * unique channel number (maximum of 4)
     */
    private Integer captionChannel;
    /** Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2) */
    private String languageCode;
    /** Textual description of language */
    private String languageDescription;

    /**
     * The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have a
     * unique channel number (maximum of 4)
     * 
     * @param captionChannel
     *        The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have
     *        a unique channel number (maximum of 4)
     */

    public void setCaptionChannel(Integer captionChannel) {
        this.captionChannel = captionChannel;
    }

    /**
     * The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have a
     * unique channel number (maximum of 4)
     * 
     * @return The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have
     *         a unique channel number (maximum of 4)
     */

    public Integer getCaptionChannel() {
        return this.captionChannel;
    }

    /**
     * The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have a
     * unique channel number (maximum of 4)
     * 
     * @param captionChannel
     *        The closed caption channel being described by this CaptionLanguageMapping. Each channel mapping must have
     *        a unique channel number (maximum of 4)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionLanguageMapping withCaptionChannel(Integer captionChannel) {
        setCaptionChannel(captionChannel);
        return this;
    }

    /**
     * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
     * 
     * @param languageCode
     *        Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
     * 
     * @return Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
     * 
     * @param languageCode
     *        Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionLanguageMapping withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Textual description of language
     * 
     * @param languageDescription
     *        Textual description of language
     */

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Textual description of language
     * 
     * @return Textual description of language
     */

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    /**
     * Textual description of language
     * 
     * @param languageDescription
     *        Textual description of language
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionLanguageMapping withLanguageDescription(String languageDescription) {
        setLanguageDescription(languageDescription);
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
        if (getCaptionChannel() != null)
            sb.append("CaptionChannel: ").append(getCaptionChannel()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: ").append(getLanguageDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionLanguageMapping == false)
            return false;
        CaptionLanguageMapping other = (CaptionLanguageMapping) obj;
        if (other.getCaptionChannel() == null ^ this.getCaptionChannel() == null)
            return false;
        if (other.getCaptionChannel() != null && other.getCaptionChannel().equals(this.getCaptionChannel()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageDescription() == null ^ this.getLanguageDescription() == null)
            return false;
        if (other.getLanguageDescription() != null && other.getLanguageDescription().equals(this.getLanguageDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptionChannel() == null) ? 0 : getCaptionChannel().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public CaptionLanguageMapping clone() {
        try {
            return (CaptionLanguageMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CaptionLanguageMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
