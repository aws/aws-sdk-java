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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An asset in a folder, such as a dashboard, analysis, or dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FolderMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FolderMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The type of the asset.
     * </p>
     */
    private String memberType;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param memberId
     *        The ID of the asset.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param memberId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMember withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @param memberType
     *        The type of the asset.
     * @see MemberType
     */

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @return The type of the asset.
     * @see MemberType
     */

    public String getMemberType() {
        return this.memberType;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @param memberType
     *        The type of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public FolderMember withMemberType(String memberType) {
        setMemberType(memberType);
        return this;
    }

    /**
     * <p>
     * The type of the asset.
     * </p>
     * 
     * @param memberType
     *        The type of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public FolderMember withMemberType(MemberType memberType) {
        this.memberType = memberType.toString();
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
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getMemberType() != null)
            sb.append("MemberType: ").append(getMemberType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FolderMember == false)
            return false;
        FolderMember other = (FolderMember) obj;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        return hashCode;
    }

    @Override
    public FolderMember clone() {
        try {
            return (FolderMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FolderMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
