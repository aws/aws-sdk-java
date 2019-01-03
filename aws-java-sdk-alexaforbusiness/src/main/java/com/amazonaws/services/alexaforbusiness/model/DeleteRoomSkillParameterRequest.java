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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRoomSkillParameterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the room from which to remove the room skill parameter details.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The ID of the skill from which to remove the room skill parameter details.
     * </p>
     */
    private String skillId;
    /**
     * <p>
     * The room skill parameter key for which to remove details.
     * </p>
     */
    private String parameterKey;

    /**
     * <p>
     * The ARN of the room from which to remove the room skill parameter details.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room from which to remove the room skill parameter details.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which to remove the room skill parameter details.
     * </p>
     * 
     * @return The ARN of the room from which to remove the room skill parameter details.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which to remove the room skill parameter details.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room from which to remove the room skill parameter details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRoomSkillParameterRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The ID of the skill from which to remove the room skill parameter details.
     * </p>
     * 
     * @param skillId
     *        The ID of the skill from which to remove the room skill parameter details.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ID of the skill from which to remove the room skill parameter details.
     * </p>
     * 
     * @return The ID of the skill from which to remove the room skill parameter details.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The ID of the skill from which to remove the room skill parameter details.
     * </p>
     * 
     * @param skillId
     *        The ID of the skill from which to remove the room skill parameter details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRoomSkillParameterRequest withSkillId(String skillId) {
        setSkillId(skillId);
        return this;
    }

    /**
     * <p>
     * The room skill parameter key for which to remove details.
     * </p>
     * 
     * @param parameterKey
     *        The room skill parameter key for which to remove details.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The room skill parameter key for which to remove details.
     * </p>
     * 
     * @return The room skill parameter key for which to remove details.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The room skill parameter key for which to remove details.
     * </p>
     * 
     * @param parameterKey
     *        The room skill parameter key for which to remove details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRoomSkillParameterRequest withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
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
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn()).append(",");
        if (getSkillId() != null)
            sb.append("SkillId: ").append(getSkillId()).append(",");
        if (getParameterKey() != null)
            sb.append("ParameterKey: ").append(getParameterKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRoomSkillParameterRequest == false)
            return false;
        DeleteRoomSkillParameterRequest other = (DeleteRoomSkillParameterRequest) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRoomSkillParameterRequest clone() {
        return (DeleteRoomSkillParameterRequest) super.clone();
    }

}
