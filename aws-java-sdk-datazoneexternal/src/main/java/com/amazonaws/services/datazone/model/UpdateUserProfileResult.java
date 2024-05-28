/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private UserProfileDetails details;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the user profile.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the user profile.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the user profile.
     * </p>
     */
    private String type;

    /**
     * @param details
     */

    public void setDetails(UserProfileDetails details) {
        this.details = details;
    }

    /**
     * @return
     */

    public UserProfileDetails getDetails() {
        return this.details;
    }

    /**
     * @param details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileResult withDetails(UserProfileDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a user profile is updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a user profile is updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a user profile is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user profile.
     * </p>
     * 
     * @param id
     *        The identifier of the user profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the user profile.
     * </p>
     * 
     * @return The identifier of the user profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the user profile.
     * </p>
     * 
     * @param id
     *        The identifier of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the user profile.
     * </p>
     * 
     * @param status
     *        The status of the user profile.
     * @see UserProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the user profile.
     * </p>
     * 
     * @return The status of the user profile.
     * @see UserProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the user profile.
     * </p>
     * 
     * @param status
     *        The status of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileStatus
     */

    public UpdateUserProfileResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the user profile.
     * </p>
     * 
     * @param status
     *        The status of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileStatus
     */

    public UpdateUserProfileResult withStatus(UserProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @param type
     *        The type of the user profile.
     * @see UserProfileType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @return The type of the user profile.
     * @see UserProfileType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @param type
     *        The type of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileType
     */

    public UpdateUserProfileResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @param type
     *        The type of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileType
     */

    public UpdateUserProfileResult withType(UserProfileType type) {
        this.type = type.toString();
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserProfileResult == false)
            return false;
        UpdateUserProfileResult other = (UpdateUserProfileResult) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserProfileResult clone() {
        try {
            return (UpdateUserProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
