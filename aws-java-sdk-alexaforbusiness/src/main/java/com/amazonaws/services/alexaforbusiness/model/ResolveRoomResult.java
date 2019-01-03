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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveRoomResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     */
    private String roomName;
    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     */
    private java.util.List<RoomSkillParameter> roomSkillParameters;

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room from which the skill request was invoked.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * 
     * @return The ARN of the room from which the skill request was invoked.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room from which the skill request was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveRoomResult withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * 
     * @param roomName
     *        The name of the room from which the skill request was invoked.
     */

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * 
     * @return The name of the room from which the skill request was invoked.
     */

    public String getRoomName() {
        return this.roomName;
    }

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * 
     * @param roomName
     *        The name of the room from which the skill request was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveRoomResult withRoomName(String roomName) {
        setRoomName(roomName);
        return this;
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     * 
     * @return Response to get the room profile request. Required.
     */

    public java.util.List<RoomSkillParameter> getRoomSkillParameters() {
        return roomSkillParameters;
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     * 
     * @param roomSkillParameters
     *        Response to get the room profile request. Required.
     */

    public void setRoomSkillParameters(java.util.Collection<RoomSkillParameter> roomSkillParameters) {
        if (roomSkillParameters == null) {
            this.roomSkillParameters = null;
            return;
        }

        this.roomSkillParameters = new java.util.ArrayList<RoomSkillParameter>(roomSkillParameters);
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoomSkillParameters(java.util.Collection)} or {@link #withRoomSkillParameters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param roomSkillParameters
     *        Response to get the room profile request. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveRoomResult withRoomSkillParameters(RoomSkillParameter... roomSkillParameters) {
        if (this.roomSkillParameters == null) {
            setRoomSkillParameters(new java.util.ArrayList<RoomSkillParameter>(roomSkillParameters.length));
        }
        for (RoomSkillParameter ele : roomSkillParameters) {
            this.roomSkillParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     * 
     * @param roomSkillParameters
     *        Response to get the room profile request. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveRoomResult withRoomSkillParameters(java.util.Collection<RoomSkillParameter> roomSkillParameters) {
        setRoomSkillParameters(roomSkillParameters);
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
        if (getRoomName() != null)
            sb.append("RoomName: ").append(getRoomName()).append(",");
        if (getRoomSkillParameters() != null)
            sb.append("RoomSkillParameters: ").append(getRoomSkillParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveRoomResult == false)
            return false;
        ResolveRoomResult other = (ResolveRoomResult) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getRoomSkillParameters() == null ^ this.getRoomSkillParameters() == null)
            return false;
        if (other.getRoomSkillParameters() != null && other.getRoomSkillParameters().equals(this.getRoomSkillParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode + ((getRoomSkillParameters() == null) ? 0 : getRoomSkillParameters().hashCode());
        return hashCode;
    }

    @Override
    public ResolveRoomResult clone() {
        try {
            return (ResolveRoomResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
