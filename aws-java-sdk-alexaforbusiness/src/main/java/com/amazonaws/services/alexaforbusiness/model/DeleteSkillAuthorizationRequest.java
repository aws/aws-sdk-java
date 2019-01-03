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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSkillAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     */
    private String skillId;
    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     */
    private String roomArn;

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * 
     * @param skillId
     *        The unique identifier of a skill.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * 
     * @return The unique identifier of a skill.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * 
     * @param skillId
     *        The unique identifier of a skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSkillAuthorizationRequest withSkillId(String skillId) {
        setSkillId(skillId);
        return this;
    }

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * 
     * @param roomArn
     *        The room that the skill is authorized for.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * 
     * @return The room that the skill is authorized for.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * 
     * @param roomArn
     *        The room that the skill is authorized for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSkillAuthorizationRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
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
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSkillAuthorizationRequest == false)
            return false;
        DeleteSkillAuthorizationRequest other = (DeleteSkillAuthorizationRequest) obj;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSkillAuthorizationRequest clone() {
        return (DeleteSkillAuthorizationRequest) super.clone();
    }

}
