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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata of the user stored in a collection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A provided ID for the User. Unique within the collection.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * </p>
     */
    private String userStatus;

    /**
     * <p>
     * A provided ID for the User. Unique within the collection.
     * </p>
     * 
     * @param userId
     *        A provided ID for the User. Unique within the collection.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * A provided ID for the User. Unique within the collection.
     * </p>
     * 
     * @return A provided ID for the User. Unique within the collection.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * A provided ID for the User. Unique within the collection.
     * </p>
     * 
     * @param userId
     *        A provided ID for the User. Unique within the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * </p>
     * 
     * @param userStatus
     *        Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * @see UserStatus
     */

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * </p>
     * 
     * @return Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * @see UserStatus
     */

    public String getUserStatus() {
        return this.userStatus;
    }

    /**
     * <p>
     * Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * </p>
     * 
     * @param userStatus
     *        Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatus
     */

    public User withUserStatus(String userStatus) {
        setUserStatus(userStatus);
        return this;
    }

    /**
     * <p>
     * Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * </p>
     * 
     * @param userStatus
     *        Communicates if the UserID has been updated with latest set of faces to be associated with the UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatus
     */

    public User withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
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
        if (getUserStatus() != null)
            sb.append("UserStatus: ").append(getUserStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
