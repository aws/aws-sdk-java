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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and channel
     * members can add themselves and other members to unrestricted channels. Only administrators and moderators can add
     * members to restricted channels.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't discoverable by
     * users outside the channel. Public channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     */
    private String privacy;
    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags for the creation request.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     */
    private String chimeBearer;

    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the channel request.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     * 
     * @return The ARN of the channel request.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the channel request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and channel
     * members can add themselves and other members to unrestricted channels. Only administrators and moderators can add
     * members to restricted channels.
     * </p>
     * 
     * @param mode
     *        The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and
     *        channel members can add themselves and other members to unrestricted channels. Only administrators and
     *        moderators can add members to restricted channels.
     * @see ChannelMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and channel
     * members can add themselves and other members to unrestricted channels. Only administrators and moderators can add
     * members to restricted channels.
     * </p>
     * 
     * @return The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and
     *         channel members can add themselves and other members to unrestricted channels. Only administrators and
     *         moderators can add members to restricted channels.
     * @see ChannelMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and channel
     * members can add themselves and other members to unrestricted channels. Only administrators and moderators can add
     * members to restricted channels.
     * </p>
     * 
     * @param mode
     *        The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and
     *        channel members can add themselves and other members to unrestricted channels. Only administrators and
     *        moderators can add members to restricted channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMode
     */

    public CreateChannelRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and channel
     * members can add themselves and other members to unrestricted channels. Only administrators and moderators can add
     * members to restricted channels.
     * </p>
     * 
     * @param mode
     *        The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>. Administrators, moderators, and
     *        channel members can add themselves and other members to unrestricted channels. Only administrators and
     *        moderators can add members to restricted channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMode
     */

    public CreateChannelRequest withMode(ChannelMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't discoverable by
     * users outside the channel. Public channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * 
     * @param privacy
     *        The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't
     *        discoverable by users outside the channel. Public channels are discoverable by anyone in the
     *        <code>AppInstance</code>.
     * @see ChannelPrivacy
     */

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't discoverable by
     * users outside the channel. Public channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * 
     * @return The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't
     *         discoverable by users outside the channel. Public channels are discoverable by anyone in the
     *         <code>AppInstance</code>.
     * @see ChannelPrivacy
     */

    public String getPrivacy() {
        return this.privacy;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't discoverable by
     * users outside the channel. Public channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * 
     * @param privacy
     *        The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't
     *        discoverable by users outside the channel. Public channels are discoverable by anyone in the
     *        <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPrivacy
     */

    public CreateChannelRequest withPrivacy(String privacy) {
        setPrivacy(privacy);
        return this;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't discoverable by
     * users outside the channel. Public channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * 
     * @param privacy
     *        The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>. Private channels aren't
     *        discoverable by users outside the channel. Public channels are discoverable by anyone in the
     *        <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPrivacy
     */

    public CreateChannelRequest withPrivacy(ChannelPrivacy privacy) {
        this.privacy = privacy.toString();
        return this;
    }

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     * 
     * @param metadata
     *        The metadata of the creation request. Limited to 1KB and UTF-8.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     * 
     * @return The metadata of the creation request. Limited to 1KB and UTF-8.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     * 
     * @param metadata
     *        The metadata of the creation request. Limited to 1KB and UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     * 
     * @param clientRequestToken
     *        The client token for the request. An <code>Idempotency</code> token.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     * 
     * @return The client token for the request. An <code>Idempotency</code> token.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     * 
     * @param clientRequestToken
     *        The client token for the request. An <code>Idempotency</code> token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * 
     * @return The tags for the creation request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * 
     * @param tags
     *        The tags for the creation request.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * 
     * @param tags
     *        The tags for the creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateChannelRequest withChimeBearer(String chimeBearer) {
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getPrivacy() != null)
            sb.append("Privacy: ").append(getPrivacy()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getPrivacy() == null ^ this.getPrivacy() == null)
            return false;
        if (other.getPrivacy() != null && other.getPrivacy().equals(this.getPrivacy()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getPrivacy() == null) ? 0 : getPrivacy().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
