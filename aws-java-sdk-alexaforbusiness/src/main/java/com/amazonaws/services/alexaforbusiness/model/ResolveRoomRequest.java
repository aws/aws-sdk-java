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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveRoomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The ARN of the skill that was requested. Required.
     * </p>
     */
    private String skillId;

    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     * 
     * @param userId
     *        The ARN of the user. Required.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     * 
     * @return The ARN of the user. Required.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     * 
     * @param userId
     *        The ARN of the user. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveRoomRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill that was requested. Required.
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
     * </p>
     * 
     * @return The ARN of the skill that was requested. Required.
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
     * </p>
     * 
     * @param skillId
     *        The ARN of the skill that was requested. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveRoomRequest withSkillId(String skillId) {
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
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

        if (obj instanceof ResolveRoomRequest == false)
            return false;
        ResolveRoomRequest other = (ResolveRoomRequest) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
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

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        return hashCode;
    }

    @Override
    public ResolveRoomRequest clone() {
        return (ResolveRoomRequest) super.clone();
    }

}
