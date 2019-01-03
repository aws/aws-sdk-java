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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateSkillGroupFromRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     */
    private String skillGroupArn;
    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated. Required.
     * </p>
     */
    private String roomArn;

    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of the skill group to disassociate from a room. Required.
     */

    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     * 
     * @return The ARN of the skill group to disassociate from a room. Required.
     */

    public String getSkillGroupArn() {
        return this.skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of the skill group to disassociate from a room. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSkillGroupFromRoomRequest withSkillGroupArn(String skillGroupArn) {
        setSkillGroupArn(skillGroupArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated. Required.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room from which the skill group is to be disassociated. Required.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated. Required.
     * </p>
     * 
     * @return The ARN of the room from which the skill group is to be disassociated. Required.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated. Required.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room from which the skill group is to be disassociated. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateSkillGroupFromRoomRequest withRoomArn(String roomArn) {
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
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: ").append(getSkillGroupArn()).append(",");
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

        if (obj instanceof DisassociateSkillGroupFromRoomRequest == false)
            return false;
        DisassociateSkillGroupFromRoomRequest other = (DisassociateSkillGroupFromRoomRequest) obj;
        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
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

        hashCode = prime * hashCode + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateSkillGroupFromRoomRequest clone() {
        return (DisassociateSkillGroupFromRoomRequest) super.clone();
    }

}
