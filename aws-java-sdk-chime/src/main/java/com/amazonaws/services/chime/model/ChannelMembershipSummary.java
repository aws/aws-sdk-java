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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the details of a <code>ChannelMembership</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelMembershipSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMembershipSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A member's summary data.
     * </p>
     */
    private Identity member;

    /**
     * <p>
     * A member's summary data.
     * </p>
     * 
     * @param member
     *        A member's summary data.
     */

    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * <p>
     * A member's summary data.
     * </p>
     * 
     * @return A member's summary data.
     */

    public Identity getMember() {
        return this.member;
    }

    /**
     * <p>
     * A member's summary data.
     * </p>
     * 
     * @param member
     *        A member's summary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembershipSummary withMember(Identity member) {
        setMember(member);
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
        if (getMember() != null)
            sb.append("Member: ").append(getMember());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembershipSummary == false)
            return false;
        ChannelMembershipSummary other = (ChannelMembershipSummary) obj;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMembershipSummary clone() {
        try {
            return (ChannelMembershipSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelMembershipSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
