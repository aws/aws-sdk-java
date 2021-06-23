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
 * An object that consists of the member Amazon Resource Name (ARN) and member ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MemberIdArnPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberIdArnPair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the member.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member.
     * </p>
     */
    private String memberArn;

    /**
     * <p>
     * The ID of the member.
     * </p>
     * 
     * @param memberId
     *        The ID of the member.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The ID of the member.
     * </p>
     * 
     * @return The ID of the member.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The ID of the member.
     * </p>
     * 
     * @param memberId
     *        The ID of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberIdArnPair withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member.
     * </p>
     * 
     * @param memberArn
     *        The Amazon Resource Name (ARN) of the member.
     */

    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the member.
     */

    public String getMemberArn() {
        return this.memberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member.
     * </p>
     * 
     * @param memberArn
     *        The Amazon Resource Name (ARN) of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberIdArnPair withMemberArn(String memberArn) {
        setMemberArn(memberArn);
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
        if (getMemberArn() != null)
            sb.append("MemberArn: ").append(getMemberArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberIdArnPair == false)
            return false;
        MemberIdArnPair other = (MemberIdArnPair) obj;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getMemberArn() == null ^ this.getMemberArn() == null)
            return false;
        if (other.getMemberArn() != null && other.getMemberArn().equals(this.getMemberArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
        return hashCode;
    }

    @Override
    public MemberIdArnPair clone() {
        try {
            return (MemberIdArnPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MemberIdArnPairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
