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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The contact or contact channel that is being engaged.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the contact channel Incident Manager is engaging.
     * </p>
     */
    private ChannelTargetInfo channelTargetInfo;
    /**
     * <p>
     * Information about the contact that Incident Manager is engaging.
     * </p>
     */
    private ContactTargetInfo contactTargetInfo;

    /**
     * <p>
     * Information about the contact channel Incident Manager is engaging.
     * </p>
     * 
     * @param channelTargetInfo
     *        Information about the contact channel Incident Manager is engaging.
     */

    public void setChannelTargetInfo(ChannelTargetInfo channelTargetInfo) {
        this.channelTargetInfo = channelTargetInfo;
    }

    /**
     * <p>
     * Information about the contact channel Incident Manager is engaging.
     * </p>
     * 
     * @return Information about the contact channel Incident Manager is engaging.
     */

    public ChannelTargetInfo getChannelTargetInfo() {
        return this.channelTargetInfo;
    }

    /**
     * <p>
     * Information about the contact channel Incident Manager is engaging.
     * </p>
     * 
     * @param channelTargetInfo
     *        Information about the contact channel Incident Manager is engaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withChannelTargetInfo(ChannelTargetInfo channelTargetInfo) {
        setChannelTargetInfo(channelTargetInfo);
        return this;
    }

    /**
     * <p>
     * Information about the contact that Incident Manager is engaging.
     * </p>
     * 
     * @param contactTargetInfo
     *        Information about the contact that Incident Manager is engaging.
     */

    public void setContactTargetInfo(ContactTargetInfo contactTargetInfo) {
        this.contactTargetInfo = contactTargetInfo;
    }

    /**
     * <p>
     * Information about the contact that Incident Manager is engaging.
     * </p>
     * 
     * @return Information about the contact that Incident Manager is engaging.
     */

    public ContactTargetInfo getContactTargetInfo() {
        return this.contactTargetInfo;
    }

    /**
     * <p>
     * Information about the contact that Incident Manager is engaging.
     * </p>
     * 
     * @param contactTargetInfo
     *        Information about the contact that Incident Manager is engaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withContactTargetInfo(ContactTargetInfo contactTargetInfo) {
        setContactTargetInfo(contactTargetInfo);
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
        if (getChannelTargetInfo() != null)
            sb.append("ChannelTargetInfo: ").append(getChannelTargetInfo()).append(",");
        if (getContactTargetInfo() != null)
            sb.append("ContactTargetInfo: ").append(getContactTargetInfo());
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
        if (other.getChannelTargetInfo() == null ^ this.getChannelTargetInfo() == null)
            return false;
        if (other.getChannelTargetInfo() != null && other.getChannelTargetInfo().equals(this.getChannelTargetInfo()) == false)
            return false;
        if (other.getContactTargetInfo() == null ^ this.getContactTargetInfo() == null)
            return false;
        if (other.getContactTargetInfo() != null && other.getContactTargetInfo().equals(this.getContactTargetInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelTargetInfo() == null) ? 0 : getChannelTargetInfo().hashCode());
        hashCode = prime * hashCode + ((getContactTargetInfo() == null) ? 0 : getContactTargetInfo().hashCode());
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
        com.amazonaws.services.ssmcontacts.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
