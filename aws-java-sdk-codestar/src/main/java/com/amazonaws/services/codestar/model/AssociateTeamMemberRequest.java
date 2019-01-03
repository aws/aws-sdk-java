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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/AssociateTeamMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTeamMemberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project to which you will add the IAM user.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested the team member association to the
     * project. This token can be used to repeat the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in
     * an AWS CodeStar project.
     * </p>
     */
    private String projectRole;
    /**
     * <p>
     * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources,
     * for example Amazon EC2 instances.
     * </p>
     */
    private Boolean remoteAccessAllowed;

    /**
     * <p>
     * The ID of the project to which you will add the IAM user.
     * </p>
     * 
     * @param projectId
     *        The ID of the project to which you will add the IAM user.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project to which you will add the IAM user.
     * </p>
     * 
     * @return The ID of the project to which you will add the IAM user.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project to which you will add the IAM user.
     * </p>
     * 
     * @param projectId
     *        The ID of the project to which you will add the IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTeamMemberRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested the team member association to the
     * project. This token can be used to repeat the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested the team member association to
     *        the project. This token can be used to repeat the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested the team member association to the
     * project. This token can be used to repeat the request.
     * </p>
     * 
     * @return A user- or system-generated token that identifies the entity that requested the team member association
     *         to the project. This token can be used to repeat the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested the team member association to the
     * project. This token can be used to repeat the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested the team member association to
     *        the project. This token can be used to repeat the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTeamMemberRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTeamMemberRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in
     * an AWS CodeStar project.
     * </p>
     * 
     * @param projectRole
     *        The AWS CodeStar project role that will apply to this user. This role determines what actions a user can
     *        take in an AWS CodeStar project.
     */

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    /**
     * <p>
     * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in
     * an AWS CodeStar project.
     * </p>
     * 
     * @return The AWS CodeStar project role that will apply to this user. This role determines what actions a user can
     *         take in an AWS CodeStar project.
     */

    public String getProjectRole() {
        return this.projectRole;
    }

    /**
     * <p>
     * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in
     * an AWS CodeStar project.
     * </p>
     * 
     * @param projectRole
     *        The AWS CodeStar project role that will apply to this user. This role determines what actions a user can
     *        take in an AWS CodeStar project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTeamMemberRequest withProjectRole(String projectRole) {
        setProjectRole(projectRole);
        return this;
    }

    /**
     * <p>
     * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources,
     * for example Amazon EC2 instances.
     * </p>
     * 
     * @param remoteAccessAllowed
     *        Whether the team member is allowed to use an SSH public/private key pair to remotely access project
     *        resources, for example Amazon EC2 instances.
     */

    public void setRemoteAccessAllowed(Boolean remoteAccessAllowed) {
        this.remoteAccessAllowed = remoteAccessAllowed;
    }

    /**
     * <p>
     * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources,
     * for example Amazon EC2 instances.
     * </p>
     * 
     * @return Whether the team member is allowed to use an SSH public/private key pair to remotely access project
     *         resources, for example Amazon EC2 instances.
     */

    public Boolean getRemoteAccessAllowed() {
        return this.remoteAccessAllowed;
    }

    /**
     * <p>
     * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources,
     * for example Amazon EC2 instances.
     * </p>
     * 
     * @param remoteAccessAllowed
     *        Whether the team member is allowed to use an SSH public/private key pair to remotely access project
     *        resources, for example Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTeamMemberRequest withRemoteAccessAllowed(Boolean remoteAccessAllowed) {
        setRemoteAccessAllowed(remoteAccessAllowed);
        return this;
    }

    /**
     * <p>
     * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources,
     * for example Amazon EC2 instances.
     * </p>
     * 
     * @return Whether the team member is allowed to use an SSH public/private key pair to remotely access project
     *         resources, for example Amazon EC2 instances.
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof AssociateTeamMemberRequest == false)
            return false;
        AssociateTeamMemberRequest other = (AssociateTeamMemberRequest) obj;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getProjectRole() == null) ? 0 : getProjectRole().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccessAllowed() == null) ? 0 : getRemoteAccessAllowed().hashCode());
        return hashCode;
    }

    @Override
    public AssociateTeamMemberRequest clone() {
        return (AssociateTeamMemberRequest) super.clone();
    }

}
