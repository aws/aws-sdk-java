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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a project member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ProjectMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The designated role of a project member.
     * </p>
     */
    private String designation;
    /**
     * <p>
     * The membership details of a project member.
     * </p>
     */
    private MemberDetails memberDetails;

    /**
     * <p>
     * The designated role of a project member.
     * </p>
     * 
     * @param designation
     *        The designated role of a project member.
     * @see UserDesignation
     */

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * <p>
     * The designated role of a project member.
     * </p>
     * 
     * @return The designated role of a project member.
     * @see UserDesignation
     */

    public String getDesignation() {
        return this.designation;
    }

    /**
     * <p>
     * The designated role of a project member.
     * </p>
     * 
     * @param designation
     *        The designated role of a project member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserDesignation
     */

    public ProjectMember withDesignation(String designation) {
        setDesignation(designation);
        return this;
    }

    /**
     * <p>
     * The designated role of a project member.
     * </p>
     * 
     * @param designation
     *        The designated role of a project member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserDesignation
     */

    public ProjectMember withDesignation(UserDesignation designation) {
        this.designation = designation.toString();
        return this;
    }

    /**
     * <p>
     * The membership details of a project member.
     * </p>
     * 
     * @param memberDetails
     *        The membership details of a project member.
     */

    public void setMemberDetails(MemberDetails memberDetails) {
        this.memberDetails = memberDetails;
    }

    /**
     * <p>
     * The membership details of a project member.
     * </p>
     * 
     * @return The membership details of a project member.
     */

    public MemberDetails getMemberDetails() {
        return this.memberDetails;
    }

    /**
     * <p>
     * The membership details of a project member.
     * </p>
     * 
     * @param memberDetails
     *        The membership details of a project member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectMember withMemberDetails(MemberDetails memberDetails) {
        setMemberDetails(memberDetails);
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
        if (getMemberDetails() != null)
            sb.append("MemberDetails: ").append(getMemberDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectMember == false)
            return false;
        ProjectMember other = (ProjectMember) obj;
        if (other.getDesignation() == null ^ this.getDesignation() == null)
            return false;
        if (other.getDesignation() != null && other.getDesignation().equals(this.getDesignation()) == false)
            return false;
        if (other.getMemberDetails() == null ^ this.getMemberDetails() == null)
            return false;
        if (other.getMemberDetails() != null && other.getMemberDetails().equals(this.getMemberDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesignation() == null) ? 0 : getDesignation().hashCode());
        hashCode = prime * hashCode + ((getMemberDetails() == null) ? 0 : getMemberDetails().hashCode());
        return hashCode;
    }

    @Override
    public ProjectMember clone() {
        try {
            return (ProjectMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ProjectMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
