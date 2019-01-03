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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutSkillAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSkillAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult
     * map to establish the authorization.
     * </p>
     */
    private java.util.Map<String, String> authorizationResult;
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
     * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult
     * map to establish the authorization.
     * </p>
     * 
     * @return The authorization result specific to OAUTH code grant output. "Code” must be populated in the
     *         AuthorizationResult map to establish the authorization.
     */

    public java.util.Map<String, String> getAuthorizationResult() {
        return authorizationResult;
    }

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult
     * map to establish the authorization.
     * </p>
     * 
     * @param authorizationResult
     *        The authorization result specific to OAUTH code grant output. "Code” must be populated in the
     *        AuthorizationResult map to establish the authorization.
     */

    public void setAuthorizationResult(java.util.Map<String, String> authorizationResult) {
        this.authorizationResult = authorizationResult;
    }

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult
     * map to establish the authorization.
     * </p>
     * 
     * @param authorizationResult
     *        The authorization result specific to OAUTH code grant output. "Code” must be populated in the
     *        AuthorizationResult map to establish the authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSkillAuthorizationRequest withAuthorizationResult(java.util.Map<String, String> authorizationResult) {
        setAuthorizationResult(authorizationResult);
        return this;
    }

    public PutSkillAuthorizationRequest addAuthorizationResultEntry(String key, String value) {
        if (null == this.authorizationResult) {
            this.authorizationResult = new java.util.HashMap<String, String>();
        }
        if (this.authorizationResult.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.authorizationResult.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuthorizationResult.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSkillAuthorizationRequest clearAuthorizationResultEntries() {
        this.authorizationResult = null;
        return this;
    }

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

    public PutSkillAuthorizationRequest withSkillId(String skillId) {
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

    public PutSkillAuthorizationRequest withRoomArn(String roomArn) {
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
        if (getAuthorizationResult() != null)
            sb.append("AuthorizationResult: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof PutSkillAuthorizationRequest == false)
            return false;
        PutSkillAuthorizationRequest other = (PutSkillAuthorizationRequest) obj;
        if (other.getAuthorizationResult() == null ^ this.getAuthorizationResult() == null)
            return false;
        if (other.getAuthorizationResult() != null && other.getAuthorizationResult().equals(this.getAuthorizationResult()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAuthorizationResult() == null) ? 0 : getAuthorizationResult().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public PutSkillAuthorizationRequest clone() {
        return (PutSkillAuthorizationRequest) super.clone();
    }

}
