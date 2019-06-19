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
 * Description of Caption output
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The
     * name should be of the format "Caption Selector <N>", which denotes that the Nth Caption Selector will be used
     * from each input.
     */
    private String captionSelectorName;
    /**
     * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * For most captions output formats, the encoder puts this language information in the output captions metadata. If
     * your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font
     * language for rendering the captions text.
     */
    private String customLanguageCode;
    /**
     * Specific settings required by destination type. Note that burnin_destination_settings are not available if the
     * source of the caption data is Embedded or Teletext.
     */
    private CaptionDestinationSettings destinationSettings;
    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     */
    private String languageCode;
    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     */
    private String languageDescription;

    /**
     * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The
     * name should be of the format "Caption Selector <N>", which denotes that the Nth Caption Selector will be used
     * from each input.
     * 
     * @param captionSelectorName
     *        Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating
     *        captions. The name should be of the format "Caption Selector <N>", which denotes that the Nth Caption
     *        Selector will be used from each input.
     */

    public void setCaptionSelectorName(String captionSelectorName) {
        this.captionSelectorName = captionSelectorName;
    }

    /**
     * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The
     * name should be of the format "Caption Selector <N>", which denotes that the Nth Caption Selector will be used
     * from each input.
     * 
     * @return Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating
     *         captions. The name should be of the format "Caption Selector <N>", which denotes that the Nth Caption
     *         Selector will be used from each input.
     */

    public String getCaptionSelectorName() {
        return this.captionSelectorName;
    }

    /**
     * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The
     * name should be of the format "Caption Selector <N>", which denotes that the Nth Caption Selector will be used
     * from each input.
     * 
     * @param captionSelectorName
     *        Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating
     *        captions. The name should be of the format "Caption Selector <N>", which denotes that the Nth Caption
     *        Selector will be used from each input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withCaptionSelectorName(String captionSelectorName) {
        setCaptionSelectorName(captionSelectorName);
        return this;
    }

    /**
     * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * For most captions output formats, the encoder puts this language information in the output captions metadata. If
     * your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font
     * language for rendering the captions text.
     * 
     * @param customLanguageCode
     *        Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language
     *        code. For most captions output formats, the encoder puts this language information in the output captions
     *        metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information
     *        to choose the font language for rendering the captions text.
     */

    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * For most captions output formats, the encoder puts this language information in the output captions metadata. If
     * your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font
     * language for rendering the captions text.
     * 
     * @return Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter
     *         language code. For most captions output formats, the encoder puts this language information in the output
     *         captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language
     *         information to choose the font language for rendering the captions text.
     */

    public String getCustomLanguageCode() {
        return this.customLanguageCode;
    }

    /**
     * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * For most captions output formats, the encoder puts this language information in the output captions metadata. If
     * your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font
     * language for rendering the captions text.
     * 
     * @param customLanguageCode
     *        Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language
     *        code. For most captions output formats, the encoder puts this language information in the output captions
     *        metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information
     *        to choose the font language for rendering the captions text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withCustomLanguageCode(String customLanguageCode) {
        setCustomLanguageCode(customLanguageCode);
        return this;
    }

    /**
     * Specific settings required by destination type. Note that burnin_destination_settings are not available if the
     * source of the caption data is Embedded or Teletext.
     * 
     * @param destinationSettings
     *        Specific settings required by destination type. Note that burnin_destination_settings are not available if
     *        the source of the caption data is Embedded or Teletext.
     */

    public void setDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Specific settings required by destination type. Note that burnin_destination_settings are not available if the
     * source of the caption data is Embedded or Teletext.
     * 
     * @return Specific settings required by destination type. Note that burnin_destination_settings are not available
     *         if the source of the caption data is Embedded or Teletext.
     */

    public CaptionDestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * Specific settings required by destination type. Note that burnin_destination_settings are not available if the
     * source of the caption data is Embedded or Teletext.
     * 
     * @param destinationSettings
     *        Specific settings required by destination type. Note that burnin_destination_settings are not available if
     *        the source of the caption data is Embedded or Teletext.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withDestinationSettings(CaptionDestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @param languageCode
     *        Specify the language of this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information to choose the font language for rendering the captions
     *        text.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @return Specify the language of this captions output track. For most captions output formats, the encoder puts
     *         this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *         Burn in, the encoder uses this language information to choose the font language for rendering the
     *         captions text.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @param languageCode
     *        Specify the language of this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information to choose the font language for rendering the captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionDescription withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Specify the language of this captions output track. For most captions output formats, the encoder puts this
     * language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the
     * encoder uses this language information to choose the font language for rendering the captions text.
     * 
     * @param languageCode
     *        Specify the language of this captions output track. For most captions output formats, the encoder puts
     *        this language information in the output captions metadata. If your output captions format is DVB-Sub or
     *        Burn in, the encoder uses this language information to choose the font language for rendering the captions
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionDescription withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     * 
     * @param languageDescription
     *        Human readable information to indicate captions available for players (eg. English, or Spanish).
     *        Alphanumeric characters, spaces, and underscore are legal.
     */

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     * 
     * @return Human readable information to indicate captions available for players (eg. English, or Spanish).
     *         Alphanumeric characters, spaces, and underscore are legal.
     */

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     * 
     * @param languageDescription
     *        Human readable information to indicate captions available for players (eg. English, or Spanish).
     *        Alphanumeric characters, spaces, and underscore are legal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withLanguageDescription(String languageDescription) {
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
        if (getCaptionSelectorName() != null)
            sb.append("CaptionSelectorName: ").append(getCaptionSelectorName()).append(",");
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: ").append(getCustomLanguageCode()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
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

        if (obj instanceof CaptionDescription == false)
            return false;
        CaptionDescription other = (CaptionDescription) obj;
        if (other.getCaptionSelectorName() == null ^ this.getCaptionSelectorName() == null)
            return false;
        if (other.getCaptionSelectorName() != null && other.getCaptionSelectorName().equals(this.getCaptionSelectorName()) == false)
            return false;
        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
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

        hashCode = prime * hashCode + ((getCaptionSelectorName() == null) ? 0 : getCaptionSelectorName().hashCode());
        hashCode = prime * hashCode + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public CaptionDescription clone() {
        try {
            return (CaptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
