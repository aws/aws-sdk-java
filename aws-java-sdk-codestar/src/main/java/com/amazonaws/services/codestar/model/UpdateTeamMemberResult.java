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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateTeamMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTeamMemberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The project role granted to the user.
     * </p>
     */
    private String projectRole;
    /**
     * <p>
     * Whether a team member is allowed to remotely access project resources using the SSH public key associated with
     * the user's profile.
     * </p>
     */
    private Boolean remoteAccessAllowed;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTeamMemberResult withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The project role granted to the user.
     * </p>
     * 
     * @param projectRole
     *        The project role granted to the user.
     */

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    /**
     * <p>
     * The project role granted to the user.
     * </p>
     * 
     * @return The project role granted to the user.
     */

    public String getProjectRole() {
        return this.projectRole;
    }

    /**
     * <p>
     * The project role granted to the user.
     * </p>
     * 
     * @param projectRole
     *        The project role granted to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTeamMemberResult withProjectRole(String projectRole) {
        setProjectRole(projectRole);
        return this;
    }

    /**
     * <p>
     * Whether a team member is allowed to remotely access project resources using the SSH public key associated with
     * the user's profile.
     * </p>
     * 
     * @param remoteAccessAllowed
     *        Whether a team member is allowed to remotely access project resources using the SSH public key associated
     *        with the user's profile.
     */

    public void setRemoteAccessAllowed(Boolean remoteAccessAllowed) {
        this.remoteAccessAllowed = remoteAccessAllowed;
    }

    /**
     * <p>
     * Whether a team member is allowed to remotely access project resources using the SSH public key associated with
     * the user's profile.
     * </p>
     * 
     * @return Whether a team member is allowed to remotely access project resources using the SSH public key associated
     *         with the user's profile.
     */

    public Boolean getRemoteAccessAllowed() {
        return this.remoteAccessAllowed;
    }

    /**
     * <p>
     * Whether a team member is allowed to remotely access project resources using the SSH public key associated with
     * the user's profile.
     * </p>
     * 
     * @param remoteAccessAllowed
     *        Whether a team member is allowed to remotely access project resources using the SSH public key associated
     *        with the user's profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTeamMemberResult withRemoteAccessAllowed(Boolean remoteAccessAllowed) {
        setRemoteAccessAllowed(remoteAccessAllowed);
        return this;
    }

    /**
     * <p>
     * Whether a team member is allowed to remotely access project resources using the SSH public key associated with
     * the user's profile.
     * </p>
     * 
     * @return Whether a team member is allowed to remotely access project resources using the SSH public key associated
     *         with the user's profile.
     */

    public Boolean isRemoteAccessAllowed() {
        return this.remoteAccessAllowed;
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getProjectRole() != null)
            sb.append("ProjectRole: ").append(getProjectRole()).append(",");
        if (getRemoteAccessAllowed() != null)
            sb.append("RemoteAccessAllowed: ").append(getRemoteAccessAllowed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTeamMemberResult == false)
            return false;
        UpdateTeamMemberResult other = (UpdateTeamMemberResult) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getProjectRole() == null ^ this.getProjectRole() == null)
            return false;
        if (other.getProjectRole() != null && other.getProjectRole().equals(this.getProjectRole()) == false)
            return false;
        if (other.getRemoteAccessAllowed() == null ^ this.getRemoteAccessAllowed() == null)
            return false;
        if (other.getRemoteAccessAllowed() != null && other.getRemoteAccessAllowed().equals(this.getRemoteAccessAllowed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getProjectRole() == null) ? 0 : getProjectRole().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccessAllowed() == null) ? 0 : getRemoteAccessAllowed().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTeamMemberResult clone() {
        try {
            return (UpdateTeamMemberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
