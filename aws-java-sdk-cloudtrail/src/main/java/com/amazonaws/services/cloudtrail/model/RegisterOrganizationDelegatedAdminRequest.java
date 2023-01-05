/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Specifies an organization member account ID as a CloudTrail delegated administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RegisterOrganizationDelegatedAdmin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterOrganizationDelegatedAdminRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An organization member account ID that you want to designate as a delegated administrator.
     * </p>
     */
    private String memberAccountId;

    /**
     * <p>
     * An organization member account ID that you want to designate as a delegated administrator.
     * </p>
     * 
     * @param memberAccountId
     *        An organization member account ID that you want to designate as a delegated administrator.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * An organization member account ID that you want to designate as a delegated administrator.
     * </p>
     * 
     * @return An organization member account ID that you want to designate as a delegated administrator.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * An organization member account ID that you want to designate as a delegated administrator.
     * </p>
     * 
     * @param memberAccountId
     *        An organization member account ID that you want to designate as a delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterOrganizationDelegatedAdminRequest withMemberAccountId(String memberAccountId) {
        setMemberAccountId(memberAccountId);
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
        if (getMemberAccountId() != null)
            sb.append("MemberAccountId: ").append(getMemberAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterOrganizationDelegatedAdminRequest == false)
            return false;
        RegisterOrganizationDelegatedAdminRequest other = (RegisterOrganizationDelegatedAdminRequest) obj;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        return hashCode;
    }

    @Override
    public RegisterOrganizationDelegatedAdminRequest clone() {
        return (RegisterOrganizationDelegatedAdminRequest) super.clone();
    }

}
