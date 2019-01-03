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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRoomSkillParameterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     */
    private String skillId;
    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     */
    private RoomSkillParameter roomSkillParameter;

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room associated with the room skill parameter. Required.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
     * </p>
     * 
     * @return The ARN of the room associated with the room skill parameter. Required.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room associated with the room skill parameter. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRoomSkillParameterRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill associated with the room skill parameter. Required.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * 
     * @return The ARN of the skill associated with the room skill parameter. Required.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill associated with the room skill parameter. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRoomSkillParameterRequest withSkillId(String skillId) {
        setSkillId(skillId);
        return this;
    }

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     * 
     * @param roomSkillParameter
     *        The updated room skill parameter. Required.
     */

    public void setRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
        this.roomSkillParameter = roomSkillParameter;
    }

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     * 
     * @return The updated room skill parameter. Required.
     */

    public RoomSkillParameter getRoomSkillParameter() {
        return this.roomSkillParameter;
    }

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     * 
     * @param roomSkillParameter
     *        The updated room skill parameter. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRoomSkillParameterRequest withRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
        setRoomSkillParameter(roomSkillParameter);
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
        if (getRoomSkillParameter() != null)
            sb.append("RoomSkillParameter: ").append(getRoomSkillParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRoomSkillParameterRequest == false)
            return false;
        PutRoomSkillParameterRequest other = (PutRoomSkillParameterRequest) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getRoomSkillParameter() == null ^ this.getRoomSkillParameter() == null)
            return false;
        if (other.getRoomSkillParameter() != null && other.getRoomSkillParameter().equals(this.getRoomSkillParameter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getRoomSkillParameter() == null) ? 0 : getRoomSkillParameter().hashCode());
        return hashCode;
    }

    @Override
    public PutRoomSkillParameterRequest clone() {
        return (PutRoomSkillParameterRequest) super.clone();
    }

}
