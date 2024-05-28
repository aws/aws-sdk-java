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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the protected query output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQueryOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQueryOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If present, the output for a protected query with an `S3` output type.
     * </p>
     */
    private ProtectedQueryS3Output s3;
    /**
     * <p>
     * The list of member Amazon Web Services account(s) that received the results of the query.
     * </p>
     */
    private java.util.List<ProtectedQuerySingleMemberOutput> memberList;

    /**
     * <p>
     * If present, the output for a protected query with an `S3` output type.
     * </p>
     * 
     * @param s3
     *        If present, the output for a protected query with an `S3` output type.
     */

    public void setS3(ProtectedQueryS3Output s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * If present, the output for a protected query with an `S3` output type.
     * </p>
     * 
     * @return If present, the output for a protected query with an `S3` output type.
     */

    public ProtectedQueryS3Output getS3() {
        return this.s3;
    }

    /**
     * <p>
     * If present, the output for a protected query with an `S3` output type.
     * </p>
     * 
     * @param s3
     *        If present, the output for a protected query with an `S3` output type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryOutput withS3(ProtectedQueryS3Output s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * The list of member Amazon Web Services account(s) that received the results of the query.
     * </p>
     * 
     * @return The list of member Amazon Web Services account(s) that received the results of the query.
     */

    public java.util.List<ProtectedQuerySingleMemberOutput> getMemberList() {
        return memberList;
    }

    /**
     * <p>
     * The list of member Amazon Web Services account(s) that received the results of the query.
     * </p>
     * 
     * @param memberList
     *        The list of member Amazon Web Services account(s) that received the results of the query.
     */

    public void setMemberList(java.util.Collection<ProtectedQuerySingleMemberOutput> memberList) {
        if (memberList == null) {
            this.memberList = null;
            return;
        }

        this.memberList = new java.util.ArrayList<ProtectedQuerySingleMemberOutput>(memberList);
    }

    /**
     * <p>
     * The list of member Amazon Web Services account(s) that received the results of the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberList(java.util.Collection)} or {@link #withMemberList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param memberList
     *        The list of member Amazon Web Services account(s) that received the results of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryOutput withMemberList(ProtectedQuerySingleMemberOutput... memberList) {
        if (this.memberList == null) {
            setMemberList(new java.util.ArrayList<ProtectedQuerySingleMemberOutput>(memberList.length));
        }
        for (ProtectedQuerySingleMemberOutput ele : memberList) {
            this.memberList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of member Amazon Web Services account(s) that received the results of the query.
     * </p>
     * 
     * @param memberList
     *        The list of member Amazon Web Services account(s) that received the results of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryOutput withMemberList(java.util.Collection<ProtectedQuerySingleMemberOutput> memberList) {
        setMemberList(memberList);
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
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getMemberList() != null)
            sb.append("MemberList: ").append(getMemberList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQueryOutput == false)
            return false;
        ProtectedQueryOutput other = (ProtectedQueryOutput) obj;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getMemberList() == null ^ this.getMemberList() == null)
            return false;
        if (other.getMemberList() != null && other.getMemberList().equals(this.getMemberList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getMemberList() == null) ? 0 : getMemberList().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQueryOutput clone() {
        try {
            return (ProtectedQueryOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQueryOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
