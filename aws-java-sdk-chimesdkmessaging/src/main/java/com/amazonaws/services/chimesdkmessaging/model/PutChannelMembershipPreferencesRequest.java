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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelMembershipPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutChannelMembershipPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member setting the preferences.
     * </p>
     */
    private String memberArn;
    /**
     * <p>
     * The <code>AppInstanceUserARN</code> of the user making the API call.
     * </p>
     */
    private String chimeBearer;
    /**
     * <p>
     * The channel membership preferences of an <code>AppInstanceUser</code> .
     * </p>
     */
    private ChannelMembershipPreferences preferences;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member setting the preferences.
     * </p>
     * 
     * @param memberArn
     *        The <code>AppInstanceUserArn</code> of the member setting the preferences.
     */

    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member setting the preferences.
     * </p>
     * 
     * @return The <code>AppInstanceUserArn</code> of the member setting the preferences.
     */

    public String getMemberArn() {
        return this.memberArn;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member setting the preferences.
     * </p>
     * 
     * @param memberArn
     *        The <code>AppInstanceUserArn</code> of the member setting the preferences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesRequest withMemberArn(String memberArn) {
        setMemberArn(memberArn);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserARN</code> of the user making the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserARN</code> of the user making the API call.
     */

    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserARN</code> of the user making the API call.
     * </p>
     * 
     * @return The <code>AppInstanceUserARN</code> of the user making the API call.
     */

    public String getChimeBearer() {
        return this.chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserARN</code> of the user making the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserARN</code> of the user making the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
        return this;
    }

    /**
     * <p>
     * The channel membership preferences of an <code>AppInstanceUser</code> .
     * </p>
     * 
     * @param preferences
     *        The channel membership preferences of an <code>AppInstanceUser</code> .
     */

    public void setPreferences(ChannelMembershipPreferences preferences) {
        this.preferences = preferences;
    }

    /**
     * <p>
     * The channel membership preferences of an <code>AppInstanceUser</code> .
     * </p>
     * 
     * @return The channel membership preferences of an <code>AppInstanceUser</code> .
     */

    public ChannelMembershipPreferences getPreferences() {
        return this.preferences;
    }

    /**
     * <p>
     * The channel membership preferences of an <code>AppInstanceUser</code> .
     * </p>
     * 
     * @param preferences
     *        The channel membership preferences of an <code>AppInstanceUser</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesRequest withPreferences(ChannelMembershipPreferences preferences) {
        setPreferences(preferences);
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
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer()).append(",");
        if (getPreferences() != null)
            sb.append("Preferences: ").append(getPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutChannelMembershipPreferencesRequest == false)
            return false;
        PutChannelMembershipPreferencesRequest other = (PutChannelMembershipPreferencesRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMemberArn() == null ^ this.getMemberArn() == null)
            return false;
        if (other.getMemberArn() != null && other.getMemberArn().equals(this.getMemberArn()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getPreferences() == null ^ this.getPreferences() == null)
            return false;
        if (other.getPreferences() != null && other.getPreferences().equals(this.getPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode + ((getPreferences() == null) ? 0 : getPreferences().hashCode());
        return hashCode;
    }

    @Override
    public PutChannelMembershipPreferencesRequest clone() {
        return (PutChannelMembershipPreferencesRequest) super.clone();
    }

}
