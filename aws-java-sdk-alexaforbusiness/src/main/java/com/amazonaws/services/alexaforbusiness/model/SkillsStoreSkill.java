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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detailed information about an Alexa skill.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SkillsStoreSkill" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkillsStoreSkill implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the skill.
     * </p>
     */
    private String skillId;
    /**
     * <p>
     * The name of the skill.
     * </p>
     */
    private String skillName;
    /**
     * <p>
     * Short description about the skill.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     */
    private String iconUrl;
    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     */
    private java.util.List<String> sampleUtterances;
    /**
     * <p>
     * Information about the skill.
     * </p>
     */
    private SkillDetails skillDetails;
    /**
     * <p>
     * Linking support for a skill.
     * </p>
     */
    private Boolean supportsLinking;

    /**
     * <p>
     * The ARN of the skill.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill.
     * </p>
     * 
     * @return The ARN of the skill.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The ARN of the skill.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withSkillId(String skillId) {
        setSkillId(skillId);
        return this;
    }

    /**
     * <p>
     * The name of the skill.
     * </p>
     * 
     * @param skillName
     *        The name of the skill.
     */

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    /**
     * <p>
     * The name of the skill.
     * </p>
     * 
     * @return The name of the skill.
     */

    public String getSkillName() {
        return this.skillName;
    }

    /**
     * <p>
     * The name of the skill.
     * </p>
     * 
     * @param skillName
     *        The name of the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withSkillName(String skillName) {
        setSkillName(skillName);
        return this;
    }

    /**
     * <p>
     * Short description about the skill.
     * </p>
     * 
     * @param shortDescription
     *        Short description about the skill.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * Short description about the skill.
     * </p>
     * 
     * @return Short description about the skill.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * Short description about the skill.
     * </p>
     * 
     * @param shortDescription
     *        Short description about the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     * 
     * @param iconUrl
     *        The URL where the skill icon resides.
     */

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     * 
     * @return The URL where the skill icon resides.
     */

    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     * 
     * @param iconUrl
     *        The URL where the skill icon resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withIconUrl(String iconUrl) {
        setIconUrl(iconUrl);
        return this;
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     * 
     * @return Sample utterances that interact with the skill.
     */

    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     * 
     * @param sampleUtterances
     *        Sample utterances that interact with the skill.
     */

    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        Sample utterances that interact with the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withSampleUtterances(String... sampleUtterances) {
        if (this.sampleUtterances == null) {
            setSampleUtterances(new java.util.ArrayList<String>(sampleUtterances.length));
        }
        for (String ele : sampleUtterances) {
            this.sampleUtterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     * 
     * @param sampleUtterances
     *        Sample utterances that interact with the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * Information about the skill.
     * </p>
     * 
     * @param skillDetails
     *        Information about the skill.
     */

    public void setSkillDetails(SkillDetails skillDetails) {
        this.skillDetails = skillDetails;
    }

    /**
     * <p>
     * Information about the skill.
     * </p>
     * 
     * @return Information about the skill.
     */

    public SkillDetails getSkillDetails() {
        return this.skillDetails;
    }

    /**
     * <p>
     * Information about the skill.
     * </p>
     * 
     * @param skillDetails
     *        Information about the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withSkillDetails(SkillDetails skillDetails) {
        setSkillDetails(skillDetails);
        return this;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     * 
     * @param supportsLinking
     *        Linking support for a skill.
     */

    public void setSupportsLinking(Boolean supportsLinking) {
        this.supportsLinking = supportsLinking;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     * 
     * @return Linking support for a skill.
     */

    public Boolean getSupportsLinking() {
        return this.supportsLinking;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     * 
     * @param supportsLinking
     *        Linking support for a skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillsStoreSkill withSupportsLinking(Boolean supportsLinking) {
        setSupportsLinking(supportsLinking);
        return this;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     * 
     * @return Linking support for a skill.
     */

    public Boolean isSupportsLinking() {
        return this.supportsLinking;
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
        if (getSkillId() != null)
            sb.append("SkillId: ").append(getSkillId()).append(",");
        if (getSkillName() != null)
            sb.append("SkillName: ").append(getSkillName()).append(",");
        if (getShortDescription() != null)
            sb.append("ShortDescription: ").append(getShortDescription()).append(",");
        if (getIconUrl() != null)
            sb.append("IconUrl: ").append(getIconUrl()).append(",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances()).append(",");
        if (getSkillDetails() != null)
            sb.append("SkillDetails: ").append(getSkillDetails()).append(",");
        if (getSupportsLinking() != null)
            sb.append("SupportsLinking: ").append(getSupportsLinking());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillsStoreSkill == false)
            return false;
        SkillsStoreSkill other = (SkillsStoreSkill) obj;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getSkillName() == null ^ this.getSkillName() == null)
            return false;
        if (other.getSkillName() != null && other.getSkillName().equals(this.getSkillName()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getIconUrl() == null ^ this.getIconUrl() == null)
            return false;
        if (other.getIconUrl() != null && other.getIconUrl().equals(this.getIconUrl()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getSkillDetails() == null ^ this.getSkillDetails() == null)
            return false;
        if (other.getSkillDetails() != null && other.getSkillDetails().equals(this.getSkillDetails()) == false)
            return false;
        if (other.getSupportsLinking() == null ^ this.getSupportsLinking() == null)
            return false;
        if (other.getSupportsLinking() != null && other.getSupportsLinking().equals(this.getSupportsLinking()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getSkillName() == null) ? 0 : getSkillName().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getSkillDetails() == null) ? 0 : getSkillDetails().hashCode());
        hashCode = prime * hashCode + ((getSupportsLinking() == null) ? 0 : getSupportsLinking().hashCode());
        return hashCode;
    }

    @Override
    public SkillsStoreSkill clone() {
        try {
            return (SkillsStoreSkill) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SkillsStoreSkillMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
