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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon Connect campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/Campaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Campaign implements Serializable, Cloneable, StructuredPojo {

    private String arn;

    private String connectInstanceId;

    private DialerConfig dialerConfig;

    private String id;

    private String name;

    private OutboundCallConfig outboundCallConfig;

    private java.util.Map<String, String> tags;

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param connectInstanceId
     */

    public void setConnectInstanceId(String connectInstanceId) {
        this.connectInstanceId = connectInstanceId;
    }

    /**
     * @return
     */

    public String getConnectInstanceId() {
        return this.connectInstanceId;
    }

    /**
     * @param connectInstanceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withConnectInstanceId(String connectInstanceId) {
        setConnectInstanceId(connectInstanceId);
        return this;
    }

    /**
     * @param dialerConfig
     */

    public void setDialerConfig(DialerConfig dialerConfig) {
        this.dialerConfig = dialerConfig;
    }

    /**
     * @return
     */

    public DialerConfig getDialerConfig() {
        return this.dialerConfig;
    }

    /**
     * @param dialerConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withDialerConfig(DialerConfig dialerConfig) {
        setDialerConfig(dialerConfig);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param outboundCallConfig
     */

    public void setOutboundCallConfig(OutboundCallConfig outboundCallConfig) {
        this.outboundCallConfig = outboundCallConfig;
    }

    /**
     * @return
     */

    public OutboundCallConfig getOutboundCallConfig() {
        return this.outboundCallConfig;
    }

    /**
     * @param outboundCallConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withOutboundCallConfig(OutboundCallConfig outboundCallConfig) {
        setOutboundCallConfig(outboundCallConfig);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Campaign#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Campaign addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConnectInstanceId() != null)
            sb.append("ConnectInstanceId: ").append(getConnectInstanceId()).append(",");
        if (getDialerConfig() != null)
            sb.append("DialerConfig: ").append(getDialerConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutboundCallConfig() != null)
            sb.append("OutboundCallConfig: ").append(getOutboundCallConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Campaign == false)
            return false;
        Campaign other = (Campaign) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectInstanceId() == null ^ this.getConnectInstanceId() == null)
            return false;
        if (other.getConnectInstanceId() != null && other.getConnectInstanceId().equals(this.getConnectInstanceId()) == false)
            return false;
        if (other.getDialerConfig() == null ^ this.getDialerConfig() == null)
            return false;
        if (other.getDialerConfig() != null && other.getDialerConfig().equals(this.getDialerConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutboundCallConfig() == null ^ this.getOutboundCallConfig() == null)
            return false;
        if (other.getOutboundCallConfig() != null && other.getOutboundCallConfig().equals(this.getOutboundCallConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectInstanceId() == null) ? 0 : getConnectInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDialerConfig() == null) ? 0 : getDialerConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutboundCallConfig() == null) ? 0 : getOutboundCallConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Campaign clone() {
        try {
            return (Campaign) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.CampaignMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
