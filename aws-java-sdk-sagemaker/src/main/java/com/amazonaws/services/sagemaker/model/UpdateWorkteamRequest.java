/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkteamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     */
    private String workteamName;
    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide input for both of these
     * parameters in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be aware that user
     * groups that are already in the work team must also be listed in <code>Groups</code> when you make this request to
     * remain on the work team. If you do not include these user groups, they will no longer be associated with the work
     * team you update.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;
    /**
     * <p>
     * An updated description for the work team.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team to update.
     */

    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * 
     * @return The name of the work team to update.
     */

    public String getWorkteamName() {
        return this.workteamName;
    }

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withWorkteamName(String workteamName) {
        setWorkteamName(workteamName);
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide input for both of these
     * parameters in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be aware that user
     * groups that are already in the work team must also be listed in <code>Groups</code> when you make this request to
     * remain on the work team. If you do not include these user groups, they will no longer be associated with the work
     * team you update.
     * </p>
     * 
     * @return A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *         up the work team. </p>
     *         <p>
     *         Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *         workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *         using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide
     *         input for both of these parameters in a single request.
     *         </p>
     *         <p>
     *         For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *         groups</i> within the user pool used to create a workforce. All of the
     *         <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *         <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *         worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *         <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     *         Amazon Cognito User Pools</a>.
     *         </p>
     *         <p>
     *         For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *         private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be
     *         aware that user groups that are already in the work team must also be listed in <code>Groups</code> when
     *         you make this request to remain on the work team. If you do not include these user groups, they will no
     *         longer be associated with the work team you update.
     */

    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide input for both of these
     * parameters in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be aware that user
     * groups that are already in the work team must also be listed in <code>Groups</code> when you make this request to
     * remain on the work team. If you do not include these user groups, they will no longer be associated with the work
     * team you update.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *        up the work team. </p>
     *        <p>
     *        Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *        workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *        using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide
     *        input for both of these parameters in a single request.
     *        </p>
     *        <p>
     *        For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *        groups</i> within the user pool used to create a workforce. All of the
     *        <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *        <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *        worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *        <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.
     *        </p>
     *        <p>
     *        For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *        private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be
     *        aware that user groups that are already in the work team must also be listed in <code>Groups</code> when
     *        you make this request to remain on the work team. If you do not include these user groups, they will no
     *        longer be associated with the work team you update.
     */

    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide input for both of these
     * parameters in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be aware that user
     * groups that are already in the work team must also be listed in <code>Groups</code> when you make this request to
     * remain on the work team. If you do not include these user groups, they will no longer be associated with the work
     * team you update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDefinitions(java.util.Collection)} or {@link #withMemberDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *        up the work team. </p>
     *        <p>
     *        Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *        workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *        using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide
     *        input for both of these parameters in a single request.
     *        </p>
     *        <p>
     *        For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *        groups</i> within the user pool used to create a workforce. All of the
     *        <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *        <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *        worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *        <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.
     *        </p>
     *        <p>
     *        For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *        private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be
     *        aware that user groups that are already in the work team must also be listed in <code>Groups</code> when
     *        you make this request to remain on the work team. If you do not include these user groups, they will no
     *        longer be associated with the work team you update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (this.memberDefinitions == null) {
            setMemberDefinitions(new java.util.ArrayList<MemberDefinition>(memberDefinitions.length));
        }
        for (MemberDefinition ele : memberDefinitions) {
            this.memberDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make up the
     * work team.
     * </p>
     * <p>
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces
     * created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created using your own OIDC
     * identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide input for both of these
     * parameters in a single request.
     * </p>
     * <p>
     * For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user groups</i>
     * within the user pool used to create a workforce. All of the <code>CognitoMemberDefinition</code> objects that
     * make up the member definition must have the same <code>ClientId</code> and <code>UserPool</code> values. To add a
     * Amazon Cognito user group to an existing worker pool, see <a href="">Adding groups to a User Pool</a>. For more
     * information about user pools, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private
     * work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be aware that user
     * groups that are already in the work team must also be listed in <code>Groups</code> when you make this request to
     * remain on the work team. If you do not include these user groups, they will no longer be associated with the work
     * team you update.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the workers that make
     *        up the work team. </p>
     *        <p>
     *        Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private
     *        workforces created using Amazon Cognito use <code>CognitoMemberDefinition</code>. For workforces created
     *        using your own OIDC identity provider (IdP) use <code>OidcMemberDefinition</code>. You should not provide
     *        input for both of these parameters in a single request.
     *        </p>
     *        <p>
     *        For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito <i>user
     *        groups</i> within the user pool used to create a workforce. All of the
     *        <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     *        <code>ClientId</code> and <code>UserPool</code> values. To add a Amazon Cognito user group to an existing
     *        worker pool, see <a href="">Adding groups to a User Pool</a>. For more information about user pools, see
     *        <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.
     *        </p>
     *        <p>
     *        For workforces created using your own OIDC IdP, specify the user groups that you want to include in your
     *        private work team in <code>OidcMemberDefinition</code> by listing those groups in <code>Groups</code>. Be
     *        aware that user groups that are already in the work team must also be listed in <code>Groups</code> when
     *        you make this request to remain on the work team. If you do not include these user groups, they will no
     *        longer be associated with the work team you update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * 
     * @param description
     *        An updated description for the work team.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * 
     * @return An updated description for the work team.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * 
     * @param description
     *        An updated description for the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     * 
     * @param notificationConfiguration
     *        Configures SNS topic notifications for available or expiring work items
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     * 
     * @return Configures SNS topic notifications for available or expiring work items
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     * 
     * @param notificationConfiguration
     *        Configures SNS topic notifications for available or expiring work items
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: ").append(getWorkteamName()).append(",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: ").append(getMemberDefinitions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkteamRequest == false)
            return false;
        UpdateWorkteamRequest other = (UpdateWorkteamRequest) obj;
        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkteamRequest clone() {
        return (UpdateWorkteamRequest) super.clone();
    }

}
