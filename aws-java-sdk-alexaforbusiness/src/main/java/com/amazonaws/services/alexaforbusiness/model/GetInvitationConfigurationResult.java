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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetInvitationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInvitationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     */
    private String organizationName;
    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled user can use.
     * </p>
     */
    private String contactEmail;
    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * </p>
     */
    private java.util.List<String> privateSkillIds;

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * 
     * @param organizationName
     *        The name of the organization sending the enrollment invite to a user.
     */

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * 
     * @return The name of the organization sending the enrollment invite to a user.
     */

    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * 
     * @param organizationName
     *        The name of the organization sending the enrollment invite to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvitationConfigurationResult withOrganizationName(String organizationName) {
        setOrganizationName(organizationName);
        return this;
    }

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled user can use.
     * </p>
     * 
     * @param contactEmail
     *        The email ID of the organization or individual contact that the enrolled user can use.
     */

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled user can use.
     * </p>
     * 
     * @return The email ID of the organization or individual contact that the enrolled user can use.
     */

    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled user can use.
     * </p>
     * 
     * @param contactEmail
     *        The email ID of the organization or individual contact that the enrolled user can use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvitationConfigurationResult withContactEmail(String contactEmail) {
        setContactEmail(contactEmail);
        return this;
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * </p>
     * 
     * @return The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     */

    public java.util.List<String> getPrivateSkillIds() {
        return privateSkillIds;
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * </p>
     * 
     * @param privateSkillIds
     *        The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     */

    public void setPrivateSkillIds(java.util.Collection<String> privateSkillIds) {
        if (privateSkillIds == null) {
            this.privateSkillIds = null;
            return;
        }

        this.privateSkillIds = new java.util.ArrayList<String>(privateSkillIds);
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateSkillIds(java.util.Collection)} or {@link #withPrivateSkillIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param privateSkillIds
     *        The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvitationConfigurationResult withPrivateSkillIds(String... privateSkillIds) {
        if (this.privateSkillIds == null) {
            setPrivateSkillIds(new java.util.ArrayList<String>(privateSkillIds.length));
        }
        for (String ele : privateSkillIds) {
            this.privateSkillIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * </p>
     * 
     * @param privateSkillIds
     *        The list of private skill IDs that you want to recommend to the user to enable in the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvitationConfigurationResult withPrivateSkillIds(java.util.Collection<String> privateSkillIds) {
        setPrivateSkillIds(privateSkillIds);
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
        if (getOrganizationName() != null)
            sb.append("OrganizationName: ").append(getOrganizationName()).append(",");
        if (getContactEmail() != null)
            sb.append("ContactEmail: ").append(getContactEmail()).append(",");
        if (getPrivateSkillIds() != null)
            sb.append("PrivateSkillIds: ").append(getPrivateSkillIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInvitationConfigurationResult == false)
            return false;
        GetInvitationConfigurationResult other = (GetInvitationConfigurationResult) obj;
        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null)
            return false;
        if (other.getOrganizationName() != null && other.getOrganizationName().equals(this.getOrganizationName()) == false)
            return false;
        if (other.getContactEmail() == null ^ this.getContactEmail() == null)
            return false;
        if (other.getContactEmail() != null && other.getContactEmail().equals(this.getContactEmail()) == false)
            return false;
        if (other.getPrivateSkillIds() == null ^ this.getPrivateSkillIds() == null)
            return false;
        if (other.getPrivateSkillIds() != null && other.getPrivateSkillIds().equals(this.getPrivateSkillIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        hashCode = prime * hashCode + ((getContactEmail() == null) ? 0 : getContactEmail().hashCode());
        hashCode = prime * hashCode + ((getPrivateSkillIds() == null) ? 0 : getPrivateSkillIds().hashCode());
        return hashCode;
    }

    @Override
    public GetInvitationConfigurationResult clone() {
        try {
            return (GetInvitationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
