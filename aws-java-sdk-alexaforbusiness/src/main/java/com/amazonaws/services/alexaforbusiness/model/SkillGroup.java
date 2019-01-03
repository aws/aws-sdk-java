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
 * A skill group with attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SkillGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkillGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a skill group.
     * </p>
     */
    private String skillGroupArn;
    /**
     * <p>
     * The name of a skill group.
     * </p>
     */
    private String skillGroupName;
    /**
     * <p>
     * The description of a skill group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of a skill group.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of a skill group.
     */

    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The ARN of a skill group.
     * </p>
     * 
     * @return The ARN of a skill group.
     */

    public String getSkillGroupArn() {
        return this.skillGroupArn;
    }

    /**
     * <p>
     * The ARN of a skill group.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of a skill group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillGroup withSkillGroupArn(String skillGroupArn) {
        setSkillGroupArn(skillGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of a skill group.
     * </p>
     * 
     * @param skillGroupName
     *        The name of a skill group.
     */

    public void setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
    }

    /**
     * <p>
     * The name of a skill group.
     * </p>
     * 
     * @return The name of a skill group.
     */

    public String getSkillGroupName() {
        return this.skillGroupName;
    }

    /**
     * <p>
     * The name of a skill group.
     * </p>
     * 
     * @param skillGroupName
     *        The name of a skill group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillGroup withSkillGroupName(String skillGroupName) {
        setSkillGroupName(skillGroupName);
        return this;
    }

    /**
     * <p>
     * The description of a skill group.
     * </p>
     * 
     * @param description
     *        The description of a skill group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a skill group.
     * </p>
     * 
     * @return The description of a skill group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a skill group.
     * </p>
     * 
     * @param description
     *        The description of a skill group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillGroup withDescription(String description) {
        setDescription(description);
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
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: ").append(getSkillGroupArn()).append(",");
        if (getSkillGroupName() != null)
            sb.append("SkillGroupName: ").append(getSkillGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillGroup == false)
            return false;
        SkillGroup other = (SkillGroup) obj;
        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        if (other.getSkillGroupName() == null ^ this.getSkillGroupName() == null)
            return false;
        if (other.getSkillGroupName() != null && other.getSkillGroupName().equals(this.getSkillGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSkillGroupName() == null) ? 0 : getSkillGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SkillGroup clone() {
        try {
            return (SkillGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SkillGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
