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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoomSkillParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRoomSkillParameterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     */
    private RoomSkillParameter roomSkillParameter;

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     * 
     * @param roomSkillParameter
     *        The details of the room skill parameter requested. Required.
     */

    public void setRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
        this.roomSkillParameter = roomSkillParameter;
    }

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     * 
     * @return The details of the room skill parameter requested. Required.
     */

    public RoomSkillParameter getRoomSkillParameter() {
        return this.roomSkillParameter;
    }

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     * 
     * @param roomSkillParameter
     *        The details of the room skill parameter requested. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoomSkillParameterResult withRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
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

        if (obj instanceof GetRoomSkillParameterResult == false)
            return false;
        GetRoomSkillParameterResult other = (GetRoomSkillParameterResult) obj;
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

        hashCode = prime * hashCode + ((getRoomSkillParameter() == null) ? 0 : getRoomSkillParameter().hashCode());
        return hashCode;
    }

    @Override
    public GetRoomSkillParameterResult clone() {
        try {
            return (GetRoomSkillParameterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
