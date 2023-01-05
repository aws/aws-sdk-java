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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the sub-channels associated with the elastic channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SubChannelSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubChannelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     */
    private String subChannelId;
    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     */
    private Integer membershipCount;

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * 
     * @param subChannelId
     *        The unique ID of a SubChannel.
     */

    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * 
     * @return The unique ID of a SubChannel.
     */

    public String getSubChannelId() {
        return this.subChannelId;
    }

    /**
     * <p>
     * The unique ID of a SubChannel.
     * </p>
     * 
     * @param subChannelId
     *        The unique ID of a SubChannel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubChannelSummary withSubChannelId(String subChannelId) {
        setSubChannelId(subChannelId);
        return this;
    }

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     * 
     * @param membershipCount
     *        The number of members in a SubChannel.
     */

    public void setMembershipCount(Integer membershipCount) {
        this.membershipCount = membershipCount;
    }

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     * 
     * @return The number of members in a SubChannel.
     */

    public Integer getMembershipCount() {
        return this.membershipCount;
    }

    /**
     * <p>
     * The number of members in a SubChannel.
     * </p>
     * 
     * @param membershipCount
     *        The number of members in a SubChannel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubChannelSummary withMembershipCount(Integer membershipCount) {
        setMembershipCount(membershipCount);
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
        if (getSubChannelId() != null)
            sb.append("SubChannelId: ").append(getSubChannelId()).append(",");
        if (getMembershipCount() != null)
            sb.append("MembershipCount: ").append(getMembershipCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubChannelSummary == false)
            return false;
        SubChannelSummary other = (SubChannelSummary) obj;
        if (other.getSubChannelId() == null ^ this.getSubChannelId() == null)
            return false;
        if (other.getSubChannelId() != null && other.getSubChannelId().equals(this.getSubChannelId()) == false)
            return false;
        if (other.getMembershipCount() == null ^ this.getMembershipCount() == null)
            return false;
        if (other.getMembershipCount() != null && other.getMembershipCount().equals(this.getMembershipCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        hashCode = prime * hashCode + ((getMembershipCount() == null) ? 0 : getMembershipCount().hashCode());
        return hashCode;
    }

    @Override
    public SubChannelSummary clone() {
        try {
            return (SubChannelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.SubChannelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
