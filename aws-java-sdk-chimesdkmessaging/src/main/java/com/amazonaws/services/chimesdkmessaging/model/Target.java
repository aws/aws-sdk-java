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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target of a message, a sender, a user, or a bot. Only the target and the sender can view targeted messages. Only
 * users who can see targeted messages can take actions on them. However, administrators can delete targeted messages
 * that they can’t see.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the target channel member.
     * </p>
     */
    private String memberArn;

    /**
     * <p>
     * The ARN of the target channel member.
     * </p>
     * 
     * @param memberArn
     *        The ARN of the target channel member.
     */

    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The ARN of the target channel member.
     * </p>
     * 
     * @return The ARN of the target channel member.
     */

    public String getMemberArn() {
        return this.memberArn;
    }

    /**
     * <p>
     * The ARN of the target channel member.
     * </p>
     * 
     * @param memberArn
     *        The ARN of the target channel member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withMemberArn(String memberArn) {
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

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
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

        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
