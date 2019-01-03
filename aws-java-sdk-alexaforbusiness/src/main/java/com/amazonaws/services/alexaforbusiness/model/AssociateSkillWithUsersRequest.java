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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithUsers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateSkillWithUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the organization.
     * </p>
     */
    private String organizationArn;
    /**
     * <p>
     * The private skill ID you want to make available to enrolled users.&gt;
     * </p>
     */
    private String skillId;

    /**
     * <p>
     * The ARN of the organization.
     * </p>
     * 
     * @param organizationArn
     *        The ARN of the organization.
     */

    public void setOrganizationArn(String organizationArn) {
        this.organizationArn = organizationArn;
    }

    /**
     * <p>
     * The ARN of the organization.
     * </p>
     * 
     * @return The ARN of the organization.
     */

    public String getOrganizationArn() {
        return this.organizationArn;
    }

    /**
     * <p>
     * The ARN of the organization.
     * </p>
     * 
     * @param organizationArn
     *        The ARN of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSkillWithUsersRequest withOrganizationArn(String organizationArn) {
        setOrganizationArn(organizationArn);
        return this;
    }

    /**
     * <p>
     * The private skill ID you want to make available to enrolled users.&gt;
     * </p>
     * 
     * @param skillId
     *        The private skill ID you want to make available to enrolled users.&gt;
     */

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The private skill ID you want to make available to enrolled users.&gt;
     * </p>
     * 
     * @return The private skill ID you want to make available to enrolled users.&gt;
     */

    public String getSkillId() {
        return this.skillId;
    }

    /**
     * <p>
     * The private skill ID you want to make available to enrolled users.&gt;
     * </p>
     * 
     * @param skillId
     *        The private skill ID you want to make available to enrolled users.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSkillWithUsersRequest withSkillId(String skillId) {
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
        if (getOrganizationArn() != null)
            sb.append("OrganizationArn: ").append(getOrganizationArn()).append(",");
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

        if (obj instanceof AssociateSkillWithUsersRequest == false)
            return false;
        AssociateSkillWithUsersRequest other = (AssociateSkillWithUsersRequest) obj;
        if (other.getOrganizationArn() == null ^ this.getOrganizationArn() == null)
            return false;
        if (other.getOrganizationArn() != null && other.getOrganizationArn().equals(this.getOrganizationArn()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationArn() == null) ? 0 : getOrganizationArn().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSkillWithUsersRequest clone() {
        return (AssociateSkillWithUsersRequest) super.clone();
    }

}
