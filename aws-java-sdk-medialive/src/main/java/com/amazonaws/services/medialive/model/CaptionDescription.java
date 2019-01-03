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
 * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies which input caption selector to use as a caption source when generating output captions. This field
     * should match a captionSelector name.
     */
    private String captionSelectorName;
    /** Additional settings for captions destination that depend on the destination type. */
    private CaptionDestinationSettings destinationSettings;
    /** ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/ */
    private String languageCode;
    /** Human readable information to indicate captions available for players (eg. English, or Spanish). */
    private String languageDescription;
    /**
     * Name of the caption description. Used to associate a caption description with an output. Names must be unique
     * within an event.
     */
    private String name;

    /**
     * Specifies which input caption selector to use as a caption source when generating output captions. This field
     * should match a captionSelector name.
     * 
     * @param captionSelectorName
     *        Specifies which input caption selector to use as a caption source when generating output captions. This
     *        field should match a captionSelector name.
     */

    public void setCaptionSelectorName(String captionSelectorName) {
        this.captionSelectorName = captionSelectorName;
    }

    /**
     * Specifies which input caption selector to use as a caption source when generating output captions. This field
     * should match a captionSelector name.
     * 
     * @return Specifies which input caption selector to use as a caption source when generating output captions. This
     *         field should match a captionSelector name.
     */

    public String getCaptionSelectorName() {
        return this.captionSelectorName;
    }

    /**
     * Specifies which input caption selector to use as a caption source when generating output captions. This field
     * should match a captionSelector name.
     * 
     * @param captionSelectorName
     *        Specifies which input caption selector to use as a caption source when generating output captions. This
     *        field should match a captionSelector name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withCaptionSelectorName(String captionSelectorName) {
        setCaptionSelectorName(captionSelectorName);
        return this;
    }

    /**
     * Additional settings for captions destination that depend on the destination type.
     * 
     * @param destinationSettings
     *        Additional settings for captions destination that depend on the destination type.
     */

    public void setDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Additional settings for captions destination that depend on the destination type.
     * 
     * @return Additional settings for captions destination that depend on the destination type.
     */

    public CaptionDestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * Additional settings for captions destination that depend on the destination type.
     * 
     * @param destinationSettings
     *        Additional settings for captions destination that depend on the destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withDestinationSettings(CaptionDestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     * 
     * @param languageCode
     *        ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     * 
     * @return ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     * 
     * @param languageCode
     *        ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     * @param languageDescription
     *        Human readable information to indicate captions available for players (eg. English, or Spanish).
     */

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     * @return Human readable information to indicate captions available for players (eg. English, or Spanish).
     */

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     * @param languageDescription
     *        Human readable information to indicate captions available for players (eg. English, or Spanish).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withLanguageDescription(String languageDescription) {
        setLanguageDescription(languageDescription);
        return this;
    }

    /**
     * Name of the caption description. Used to associate a caption description with an output. Names must be unique
     * within an event.
     * 
     * @param name
     *        Name of the caption description. Used to associate a caption description with an output. Names must be
     *        unique within an event.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the caption description. Used to associate a caption description with an output. Names must be unique
     * within an event.
     * 
     * @return Name of the caption description. Used to associate a caption description with an output. Names must be
     *         unique within an event.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of the caption description. Used to associate a caption description with an output. Names must be unique
     * within an event.
     * 
     * @param name
     *        Name of the caption description. Used to associate a caption description with an output. Names must be
     *        unique within an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescription withName(String name) {
        setName(name);
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
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: ").append(getLanguageDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptionSelectorName() == null) ? 0 : getCaptionSelectorName().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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
        com.amazonaws.services.medialive.model.transform.CaptionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
