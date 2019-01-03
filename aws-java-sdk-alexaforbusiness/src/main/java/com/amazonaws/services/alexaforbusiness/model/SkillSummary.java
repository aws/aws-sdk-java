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
 * The summary of skills.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SkillSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkillSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the skill summary.
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
     * Linking support for a skill.
     * </p>
     */
    private Boolean supportsLinking;
    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     */
    private String enablementType;
    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     */
    private String skillType;

    /**
     * <p>
     * The ARN of the skill summary.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill summary.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill summary.
     * </p>
     * 
     * @return The ARN of the skill summary.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The ARN of the skill summary.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillSummary withSkillId(String skillId) {
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

    public SkillSummary withSkillName(String skillName) {
        setSkillName(skillName);
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

    public SkillSummary withSupportsLinking(Boolean supportsLinking) {
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
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @param enablementType
     *        Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @see EnablementType
     */

    public void setEnablementType(String enablementType) {
        this.enablementType = enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @return Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @see EnablementType
     */

    public String getEnablementType() {
        return this.enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @param enablementType
     *        Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementType
     */

    public SkillSummary withEnablementType(String enablementType) {
        setEnablementType(enablementType);
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @param enablementType
     *        Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementType
     */

    public SkillSummary withEnablementType(EnablementType enablementType) {
        this.enablementType = enablementType.toString();
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @param skillType
     *        Whether the skill is publicly available or is a private skill.
     * @see SkillType
     */

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @return Whether the skill is publicly available or is a private skill.
     * @see SkillType
     */

    public String getSkillType() {
        return this.skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @param skillType
     *        Whether the skill is publicly available or is a private skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SkillType
     */

    public SkillSummary withSkillType(String skillType) {
        setSkillType(skillType);
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @param skillType
     *        Whether the skill is publicly available or is a private skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SkillType
     */

    public SkillSummary withSkillType(SkillType skillType) {
        this.skillType = skillType.toString();
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
        if (getSkillId() != null)
            sb.append("SkillId: ").append(getSkillId()).append(",");
        if (getSkillName() != null)
            sb.append("SkillName: ").append(getSkillName()).append(",");
        if (getSupportsLinking() != null)
            sb.append("SupportsLinking: ").append(getSupportsLinking()).append(",");
        if (getEnablementType() != null)
            sb.append("EnablementType: ").append(getEnablementType()).append(",");
        if (getSkillType() != null)
            sb.append("SkillType: ").append(getSkillType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillSummary == false)
            return false;
        SkillSummary other = (SkillSummary) obj;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getSkillName() == null ^ this.getSkillName() == null)
            return false;
        if (other.getSkillName() != null && other.getSkillName().equals(this.getSkillName()) == false)
            return false;
        if (other.getSupportsLinking() == null ^ this.getSupportsLinking() == null)
            return false;
        if (other.getSupportsLinking() != null && other.getSupportsLinking().equals(this.getSupportsLinking()) == false)
            return false;
        if (other.getEnablementType() == null ^ this.getEnablementType() == null)
            return false;
        if (other.getEnablementType() != null && other.getEnablementType().equals(this.getEnablementType()) == false)
            return false;
        if (other.getSkillType() == null ^ this.getSkillType() == null)
            return false;
        if (other.getSkillType() != null && other.getSkillType().equals(this.getSkillType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getSkillName() == null) ? 0 : getSkillName().hashCode());
        hashCode = prime * hashCode + ((getSupportsLinking() == null) ? 0 : getSupportsLinking().hashCode());
        hashCode = prime * hashCode + ((getEnablementType() == null) ? 0 : getEnablementType().hashCode());
        hashCode = prime * hashCode + ((getSkillType() == null) ? 0 : getSkillType().hashCode());
        return hashCode;
    }

    @Override
    public SkillSummary clone() {
        try {
            return (SkillSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SkillSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
