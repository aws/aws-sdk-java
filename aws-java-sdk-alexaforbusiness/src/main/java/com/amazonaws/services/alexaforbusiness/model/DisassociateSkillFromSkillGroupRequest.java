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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromSkillGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateSkillFromSkillGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a skill. Required.
     * </p>
     */
    private String skillGroupArn;
    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
     * </p>
     */
    private String skillId;

    /**
     * <p>
     * The unique identifier of a skill. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The unique identifier of a skill. Required.
     */

    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The unique identifier of a skill. Required.
     * </p>
     * 
     * @return The unique identifier of a skill. Required.
     */

    public String getSkillGroupArn() {
        return this.skillGroupArn;
    }

    /**
     * <p>
     * The unique identifier of a skill. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The unique identifier of a skill. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSkillFromSkillGroupRequest withSkillGroupArn(String skillGroupArn) {
        setSkillGroupArn(skillGroupArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
     * </p>
     * 
     * @param skillId
     *        The ARN of a skill group to associate to a skill.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
     * </p>
     * 
     * @return The ARN of a skill group to associate to a skill.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
     * </p>
     * 
     * @param skillId
     *        The ARN of a skill group to associate to a skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSkillFromSkillGroupRequest withSkillId(String skillId) {
        setSkillId(skillId);
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
        if (getSkillId() != null)
            sb.append("SkillId: ").append(getSkillId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateSkillFromSkillGroupRequest == false)
            return false;
        DisassociateSkillFromSkillGroupRequest other = (DisassociateSkillFromSkillGroupRequest) obj;
        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateSkillFromSkillGroupRequest clone() {
        return (DisassociateSkillFromSkillGroupRequest) super.clone();
    }

}
