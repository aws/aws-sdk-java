/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Caption Description
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * Indicates whether the caption track implements accessibility features such as written descriptions of spoken
     * dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output group.
     */
    private String accessibility;
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
     * Identifies the DASH roles to assign to this captions output. Applies only when the captions output is configured
     * for DVB DASH accessibility signaling.
     */
    private java.util.List<String> captionDashRoles;
    /**
     * Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming outputs
     * to signal accessibility information to packagers.
     */
    private String dvbDashAccessibility;

    /**
     * Indicates whether the caption track implements accessibility features such as written descriptions of spoken
     * dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output group.
     * 
     * @param accessibility
     *        Indicates whether the caption track implements accessibility features such as written descriptions of
     *        spoken dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output
     *        group.
     * @see AccessibilityType
     */

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    /**
     * Indicates whether the caption track implements accessibility features such as written descriptions of spoken
     * dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output group.
     * 
     * @return Indicates whether the caption track implements accessibility features such as written descriptions of
     *         spoken dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output
     *         group.
     * @see AccessibilityType
     */

    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * Indicates whether the caption track implements accessibility features such as written descriptions of spoken
     * dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output group.
     * 
     * @param accessibility
     *        Indicates whether the caption track implements accessibility features such as written descriptions of
     *        spoken dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessibilityType
     */

    public CaptionDescription withAccessibility(String accessibility) {
        setAccessibility(accessibility);
        return this;
    }

    /**
     * Indicates whether the caption track implements accessibility features such as written descriptions of spoken
     * dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output group.
     * 
     * @param accessibility
     *        Indicates whether the caption track implements accessibility features such as written descriptions of
     *        spoken dialog, music, and sounds. This signaling is added to HLS output group and MediaPackage output
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessibilityType
     */

    public CaptionDescription withAccessibility(AccessibilityType accessibility) {
        this.accessibility = accessibility.toString();
        return this;
    }

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
     * Identifies the DASH roles to assign to this captions output. Applies only when the captions output is configured
     * for DVB DASH accessibility signaling.
     * 
     * @return Identifies the DASH roles to assign to this captions output. Applies only when the captions output is
     *         configured for DVB DASH accessibility signaling.
     * @see DashRoleCaption
     */

    public java.util.List<String> getCaptionDashRoles() {
        return captionDashRoles;
    }

    /**
     * Identifies the DASH roles to assign to this captions output. Applies only when the captions output is configured
     * for DVB DASH accessibility signaling.
     * 
     * @param captionDashRoles
     *        Identifies the DASH roles to assign to this captions output. Applies only when the captions output is
     *        configured for DVB DASH accessibility signaling.
     * @see DashRoleCaption
     */

    public void setCaptionDashRoles(java.util.Collection<String> captionDashRoles) {
        if (captionDashRoles == null) {
            this.captionDashRoles = null;
            return;
        }

        this.captionDashRoles = new java.util.ArrayList<String>(captionDashRoles);
    }

    /**
     * Identifies the DASH roles to assign to this captions output. Applies only when the captions output is configured
     * for DVB DASH accessibility signaling.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionDashRoles(java.util.Collection)} or {@link #withCaptionDashRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param captionDashRoles
     *        Identifies the DASH roles to assign to this captions output. Applies only when the captions output is
     *        configured for DVB DASH accessibility signaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashRoleCaption
     */

    public CaptionDescription withCaptionDashRoles(String... captionDashRoles) {
        if (this.captionDashRoles == null) {
            setCaptionDashRoles(new java.util.ArrayList<String>(captionDashRoles.length));
        }
        for (String ele : captionDashRoles) {
            this.captionDashRoles.add(ele);
        }
        return this;
    }

    /**
     * Identifies the DASH roles to assign to this captions output. Applies only when the captions output is configured
     * for DVB DASH accessibility signaling.
     * 
     * @param captionDashRoles
     *        Identifies the DASH roles to assign to this captions output. Applies only when the captions output is
     *        configured for DVB DASH accessibility signaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashRoleCaption
     */

    public CaptionDescription withCaptionDashRoles(java.util.Collection<String> captionDashRoles) {
        setCaptionDashRoles(captionDashRoles);
        return this;
    }

    /**
     * Identifies the DASH roles to assign to this captions output. Applies only when the captions output is configured
     * for DVB DASH accessibility signaling.
     * 
     * @param captionDashRoles
     *        Identifies the DASH roles to assign to this captions output. Applies only when the captions output is
     *        configured for DVB DASH accessibility signaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashRoleCaption
     */

    public CaptionDescription withCaptionDashRoles(DashRoleCaption... captionDashRoles) {
        java.util.ArrayList<String> captionDashRolesCopy = new java.util.ArrayList<String>(captionDashRoles.length);
        for (DashRoleCaption value : captionDashRoles) {
            captionDashRolesCopy.add(value.toString());
        }
        if (getCaptionDashRoles() == null) {
            setCaptionDashRoles(captionDashRolesCopy);
        } else {
            getCaptionDashRoles().addAll(captionDashRolesCopy);
        }
        return this;
    }

    /**
     * Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming outputs
     * to signal accessibility information to packagers.
     * 
     * @param dvbDashAccessibility
     *        Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming
     *        outputs to signal accessibility information to packagers.
     * @see DvbDashAccessibility
     */

    public void setDvbDashAccessibility(String dvbDashAccessibility) {
        this.dvbDashAccessibility = dvbDashAccessibility;
    }

    /**
     * Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming outputs
     * to signal accessibility information to packagers.
     * 
     * @return Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming
     *         outputs to signal accessibility information to packagers.
     * @see DvbDashAccessibility
     */

    public String getDvbDashAccessibility() {
        return this.dvbDashAccessibility;
    }

    /**
     * Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming outputs
     * to signal accessibility information to packagers.
     * 
     * @param dvbDashAccessibility
     *        Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming
     *        outputs to signal accessibility information to packagers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbDashAccessibility
     */

    public CaptionDescription withDvbDashAccessibility(String dvbDashAccessibility) {
        setDvbDashAccessibility(dvbDashAccessibility);
        return this;
    }

    /**
     * Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming outputs
     * to signal accessibility information to packagers.
     * 
     * @param dvbDashAccessibility
     *        Identifies DVB DASH accessibility signaling in this captions output. Used in Microsoft Smooth Streaming
     *        outputs to signal accessibility information to packagers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbDashAccessibility
     */

    public CaptionDescription withDvbDashAccessibility(DvbDashAccessibility dvbDashAccessibility) {
        this.dvbDashAccessibility = dvbDashAccessibility.toString();
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
        if (getAccessibility() != null)
            sb.append("Accessibility: ").append(getAccessibility()).append(",");
        if (getCaptionSelectorName() != null)
            sb.append("CaptionSelectorName: ").append(getCaptionSelectorName()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: ").append(getLanguageDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCaptionDashRoles() != null)
            sb.append("CaptionDashRoles: ").append(getCaptionDashRoles()).append(",");
        if (getDvbDashAccessibility() != null)
            sb.append("DvbDashAccessibility: ").append(getDvbDashAccessibility());
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
        if (other.getAccessibility() == null ^ this.getAccessibility() == null)
            return false;
        if (other.getAccessibility() != null && other.getAccessibility().equals(this.getAccessibility()) == false)
            return false;
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
        if (other.getCaptionDashRoles() == null ^ this.getCaptionDashRoles() == null)
            return false;
        if (other.getCaptionDashRoles() != null && other.getCaptionDashRoles().equals(this.getCaptionDashRoles()) == false)
            return false;
        if (other.getDvbDashAccessibility() == null ^ this.getDvbDashAccessibility() == null)
            return false;
        if (other.getDvbDashAccessibility() != null && other.getDvbDashAccessibility().equals(this.getDvbDashAccessibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessibility() == null) ? 0 : getAccessibility().hashCode());
        hashCode = prime * hashCode + ((getCaptionSelectorName() == null) ? 0 : getCaptionSelectorName().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCaptionDashRoles() == null) ? 0 : getCaptionDashRoles().hashCode());
        hashCode = prime * hashCode + ((getDvbDashAccessibility() == null) ? 0 : getDvbDashAccessibility().hashCode());
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
