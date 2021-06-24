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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateChannelMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateChannelMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     */
    private String channelArn;
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
     * The ARNs of the members you want to add to the channel.
     * </p>
     */
    private java.util.List<String> memberArns;
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

    public BatchCreateChannelMembershipRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
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

    public BatchCreateChannelMembershipRequest withType(String type) {
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

    public BatchCreateChannelMembershipRequest withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ARNs of the members you want to add to the channel.
     * </p>
     * 
     * @return The ARNs of the members you want to add to the channel.
     */

    public java.util.List<String> getMemberArns() {
        return memberArns;
    }

    /**
     * <p>
     * The ARNs of the members you want to add to the channel.
     * </p>
     * 
     * @param memberArns
     *        The ARNs of the members you want to add to the channel.
     */

    public void setMemberArns(java.util.Collection<String> memberArns) {
        if (memberArns == null) {
            this.memberArns = null;
            return;
        }

        this.memberArns = new java.util.ArrayList<String>(memberArns);
    }

    /**
     * <p>
     * The ARNs of the members you want to add to the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberArns(java.util.Collection)} or {@link #withMemberArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param memberArns
     *        The ARNs of the members you want to add to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateChannelMembershipRequest withMemberArns(String... memberArns) {
        if (this.memberArns == null) {
            setMemberArns(new java.util.ArrayList<String>(memberArns.length));
        }
        for (String ele : memberArns) {
            this.memberArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the members you want to add to the channel.
     * </p>
     * 
     * @param memberArns
     *        The ARNs of the members you want to add to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateChannelMembershipRequest withMemberArns(java.util.Collection<String> memberArns) {
        setMemberArns(memberArns);
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

    public BatchCreateChannelMembershipRequest withChimeBearer(String chimeBearer) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMemberArns() != null)
            sb.append("MemberArns: ").append(getMemberArns()).append(",");
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

        if (obj instanceof BatchCreateChannelMembershipRequest == false)
            return false;
        BatchCreateChannelMembershipRequest other = (BatchCreateChannelMembershipRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMemberArns() == null ^ this.getMemberArns() == null)
            return false;
        if (other.getMemberArns() != null && other.getMemberArns().equals(this.getMemberArns()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMemberArns() == null) ? 0 : getMemberArns().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateChannelMembershipRequest clone() {
        return (BatchCreateChannelMembershipRequest) super.clone();
    }

}
