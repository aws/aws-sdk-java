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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ARN of the member you want to add to the channel.
     * </p>
     */
    private String memberArn;
    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned. This
     * is only supported by moderators.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     */
    private String chimeBearer;

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel to which you're adding users.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * 
     * @return The ARN of the channel to which you're adding users.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel to which you're adding users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelMembershipRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the member you want to add to the channel.
     * </p>
     * 
     * @param memberArn
     *        The ARN of the member you want to add to the channel.
     */

    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The ARN of the member you want to add to the channel.
     * </p>
     * 
     * @return The ARN of the member you want to add to the channel.
     */

    public String getMemberArn() {
        return this.memberArn;
    }

    /**
     * <p>
     * The ARN of the member you want to add to the channel.
     * </p>
     * 
     * @param memberArn
     *        The ARN of the member you want to add to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelMembershipRequest withMemberArn(String memberArn) {
        setMemberArn(memberArn);
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned. This
     * is only supported by moderators.
     * </p>
     * 
     * @param type
     *        The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *        returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *        filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not
     *        returned. This is only supported by moderators.
     * @see ChannelMembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned. This
     * is only supported by moderators.
     * </p>
     * 
     * @return The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *         returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *         filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are
     *         not returned. This is only supported by moderators.
     * @see ChannelMembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned. This
     * is only supported by moderators.
     * </p>
     * 
     * @param type
     *        The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *        returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *        filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not
     *        returned. This is only supported by moderators.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public CreateChannelMembershipRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned. This
     * is only supported by moderators.
     * </p>
     * 
     * @param type
     *        The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *        returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *        filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not
     *        returned. This is only supported by moderators.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public CreateChannelMembershipRequest withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user that makes the API call.
     */

    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @return The <code>AppInstanceUserArn</code> of the user that makes the API call.
     */

    public String getChimeBearer() {
        return this.chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelMembershipRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getMemberArn() != null)
            sb.append("MemberArn: ").append(getMemberArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelMembershipRequest == false)
            return false;
        CreateChannelMembershipRequest other = (CreateChannelMembershipRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMemberArn() == null ^ this.getMemberArn() == null)
            return false;
        if (other.getMemberArn() != null && other.getMemberArn().equals(this.getMemberArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelMembershipRequest clone() {
        return (CreateChannelMembershipRequest) super.clone();
    }

}
