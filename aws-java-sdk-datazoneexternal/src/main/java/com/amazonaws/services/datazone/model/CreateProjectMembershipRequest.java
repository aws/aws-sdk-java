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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProjectMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The designation of the project membership.
     * </p>
     */
    private String designation;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which project membership is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The project member whose project membership was created.
     * </p>
     */
    private Member member;
    /**
     * <p>
     * The ID of the project for which this project membership was created.
     * </p>
     */
    private String projectIdentifier;

    /**
     * <p>
     * The designation of the project membership.
     * </p>
     * 
     * @param designation
     *        The designation of the project membership.
     * @see UserDesignation
     */

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * <p>
     * The designation of the project membership.
     * </p>
     * 
     * @return The designation of the project membership.
     * @see UserDesignation
     */

    public String getDesignation() {
        return this.designation;
    }

    /**
     * <p>
     * The designation of the project membership.
     * </p>
     * 
     * @param designation
     *        The designation of the project membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserDesignation
     */

    public CreateProjectMembershipRequest withDesignation(String designation) {
        setDesignation(designation);
        return this;
    }

    /**
     * <p>
     * The designation of the project membership.
     * </p>
     * 
     * @param designation
     *        The designation of the project membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserDesignation
     */

    public CreateProjectMembershipRequest withDesignation(UserDesignation designation) {
        this.designation = designation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which project membership is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which project membership is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which project membership is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which project membership is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which project membership is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which project membership is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectMembershipRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The project member whose project membership was created.
     * </p>
     * 
     * @param member
     *        The project member whose project membership was created.
     */

    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * <p>
     * The project member whose project membership was created.
     * </p>
     * 
     * @return The project member whose project membership was created.
     */

    public Member getMember() {
        return this.member;
    }

    /**
     * <p>
     * The project member whose project membership was created.
     * </p>
     * 
     * @param member
     *        The project member whose project membership was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectMembershipRequest withMember(Member member) {
        setMember(member);
        return this;
    }

    /**
     * <p>
     * The ID of the project for which this project membership was created.
     * </p>
     * 
     * @param projectIdentifier
     *        The ID of the project for which this project membership was created.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The ID of the project for which this project membership was created.
     * </p>
     * 
     * @return The ID of the project for which this project membership was created.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The ID of the project for which this project membership was created.
     * </p>
     * 
     * @param projectIdentifier
     *        The ID of the project for which this project membership was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectMembershipRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
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
        if (getDesignation() != null)
            sb.append("Designation: ").append(getDesignation()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMember() != null)
            sb.append("Member: ").append(getMember()).append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectMembershipRequest == false)
            return false;
        CreateProjectMembershipRequest other = (CreateProjectMembershipRequest) obj;
        if (other.getDesignation() == null ^ this.getDesignation() == null)
            return false;
        if (other.getDesignation() != null && other.getDesignation().equals(this.getDesignation()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesignation() == null) ? 0 : getDesignation().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectMembershipRequest clone() {
        return (CreateProjectMembershipRequest) super.clone();
    }

}
