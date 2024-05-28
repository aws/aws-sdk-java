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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ChannelListConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelListConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * Any descriptive information that you want to add to the channel for future identification purposes.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated with the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelListConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @return The name that describes the channel. The name is the primary identifier for the channel, and must be
     *         unique for your account in the AWS Region and channel group.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelListConfiguration withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     */

    public void setChannelGroupName(String channelGroupName) {
        this.channelGroupName = channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @return The name that describes the channel group. The name is the primary identifier for the channel group, and
     *         must be unique for your account in the AWS Region.
     */

    public String getChannelGroupName() {
        return this.channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelListConfiguration withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
        return this;
    }

    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the channel was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     * 
     * @return The date and time the channel was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the channel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelListConfiguration withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the channel was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     * 
     * @return The date and time the channel was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the channel was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelListConfiguration withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the channel for future identification purposes.
     * </p>
     * 
     * @param description
     *        Any descriptive information that you want to add to the channel for future identification purposes.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the channel for future identification purposes.
     * </p>
     * 
     * @return Any descriptive information that you want to add to the channel for future identification purposes.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the channel for future identification purposes.
     * </p>
     * 
     * @param description
     *        Any descriptive information that you want to add to the channel for future identification purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelListConfiguration withDescription(String description) {
        setDescription(description);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelListConfiguration == false)
            return false;
        ChannelListConfiguration other = (ChannelListConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ChannelListConfiguration clone() {
        try {
            return (ChannelListConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.ChannelListConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
