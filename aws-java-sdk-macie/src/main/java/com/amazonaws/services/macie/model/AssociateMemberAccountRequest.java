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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateMemberAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateMemberAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * </p>
     */
    private String memberAccountId;

    /**
     * <p>
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * </p>
     * 
     * @param memberAccountId
     *        The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * </p>
     * 
     * @return The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * </p>
     * 
     * @param memberAccountId
     *        The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberAccountRequest withMemberAccountId(String memberAccountId) {
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

        if (obj instanceof AssociateMemberAccountRequest == false)
            return false;
        AssociateMemberAccountRequest other = (AssociateMemberAccountRequest) obj;
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
    public AssociateMemberAccountRequest clone() {
        return (AssociateMemberAccountRequest) super.clone();
    }

}
