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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows setting a specific user's job to run first.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UserJobsFirst" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserJobsFirst implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user's ID.
     * </p>
     */
    private String userIdentityId;

    /**
     * <p>
     * The user's ID.
     * </p>
     * 
     * @param userIdentityId
     *        The user's ID.
     */

    public void setUserIdentityId(String userIdentityId) {
        this.userIdentityId = userIdentityId;
    }

    /**
     * <p>
     * The user's ID.
     * </p>
     * 
     * @return The user's ID.
     */

    public String getUserIdentityId() {
        return this.userIdentityId;
    }

    /**
     * <p>
     * The user's ID.
     * </p>
     * 
     * @param userIdentityId
     *        The user's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserJobsFirst withUserIdentityId(String userIdentityId) {
        setUserIdentityId(userIdentityId);
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
        if (getUserIdentityId() != null)
            sb.append("UserIdentityId: ").append(getUserIdentityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserJobsFirst == false)
            return false;
        UserJobsFirst other = (UserJobsFirst) obj;
        if (other.getUserIdentityId() == null ^ this.getUserIdentityId() == null)
            return false;
        if (other.getUserIdentityId() != null && other.getUserIdentityId().equals(this.getUserIdentityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserIdentityId() == null) ? 0 : getUserIdentityId().hashCode());
        return hashCode;
    }

    @Override
    public UserJobsFirst clone() {
        try {
            return (UserJobsFirst) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.UserJobsFirstMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
