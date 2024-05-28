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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProjectMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProjectMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain where project membership is deleted.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The project member whose project membership is deleted.
     * </p>
     */
    private Member member;
    /**
     * <p>
     * The ID of the Amazon DataZone project the membership to which is deleted.
     * </p>
     */
    private String projectIdentifier;

    /**
     * <p>
     * The ID of the Amazon DataZone domain where project membership is deleted.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where project membership is deleted.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where project membership is deleted.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain where project membership is deleted.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where project membership is deleted.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where project membership is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectMembershipRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The project member whose project membership is deleted.
     * </p>
     * 
     * @param member
     *        The project member whose project membership is deleted.
     */

    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * <p>
     * The project member whose project membership is deleted.
     * </p>
     * 
     * @return The project member whose project membership is deleted.
     */

    public Member getMember() {
        return this.member;
    }

    /**
     * <p>
     * The project member whose project membership is deleted.
     * </p>
     * 
     * @param member
     *        The project member whose project membership is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectMembershipRequest withMember(Member member) {
        setMember(member);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project the membership to which is deleted.
     * </p>
     * 
     * @param projectIdentifier
     *        The ID of the Amazon DataZone project the membership to which is deleted.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project the membership to which is deleted.
     * </p>
     * 
     * @return The ID of the Amazon DataZone project the membership to which is deleted.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project the membership to which is deleted.
     * </p>
     * 
     * @param projectIdentifier
     *        The ID of the Amazon DataZone project the membership to which is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectMembershipRequest withProjectIdentifier(String projectIdentifier) {
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

        if (obj instanceof DeleteProjectMembershipRequest == false)
            return false;
        DeleteProjectMembershipRequest other = (DeleteProjectMembershipRequest) obj;
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

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProjectMembershipRequest clone() {
        return (DeleteProjectMembershipRequest) super.clone();
    }

}
