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
 * The configuration of the origin endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/OriginEndpointListConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginEndpointListConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     */
    private String originEndpointName;
    /**
     * <p>
     * The type of container attached to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file.
     * </p>
     */
    private String containerType;
    /**
     * <p>
     * Any descriptive information that you want to add to the origin endpoint for future identification purposes.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     */
    private java.util.List<ListHlsManifestConfiguration> hlsManifests;
    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     */
    private java.util.List<ListLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests;
    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     */
    private java.util.List<ListDashManifestConfiguration> dashManifests;

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

    public OriginEndpointListConfiguration withArn(String arn) {
        setArn(arn);
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

    public OriginEndpointListConfiguration withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
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

    public OriginEndpointListConfiguration withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and and must be unique for your account in the AWS Region and channel.
     */

    public void setOriginEndpointName(String originEndpointName) {
        this.originEndpointName = originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @return The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *         and and must be unique for your account in the AWS Region and channel.
     */

    public String getOriginEndpointName() {
        return this.originEndpointName;
    }

    /**
     * <p>
     * The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint, and and
     * must be unique for your account in the AWS Region and channel.
     * </p>
     * 
     * @param originEndpointName
     *        The name that describes the origin endpoint. The name is the primary identifier for the origin endpoint,
     *        and and must be unique for your account in the AWS Region and channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withOriginEndpointName(String originEndpointName) {
        setOriginEndpointName(originEndpointName);
        return this;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file.
     * </p>
     * 
     * @param containerType
     *        The type of container attached to this origin endpoint. A container type is a file format that
     *        encapsulates one or more media streams, such as audio and video, into a single file.
     * @see ContainerType
     */

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file.
     * </p>
     * 
     * @return The type of container attached to this origin endpoint. A container type is a file format that
     *         encapsulates one or more media streams, such as audio and video, into a single file.
     * @see ContainerType
     */

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file.
     * </p>
     * 
     * @param containerType
     *        The type of container attached to this origin endpoint. A container type is a file format that
     *        encapsulates one or more media streams, such as audio and video, into a single file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public OriginEndpointListConfiguration withContainerType(String containerType) {
        setContainerType(containerType);
        return this;
    }

    /**
     * <p>
     * The type of container attached to this origin endpoint. A container type is a file format that encapsulates one
     * or more media streams, such as audio and video, into a single file.
     * </p>
     * 
     * @param containerType
     *        The type of container attached to this origin endpoint. A container type is a file format that
     *        encapsulates one or more media streams, such as audio and video, into a single file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public OriginEndpointListConfiguration withContainerType(ContainerType containerType) {
        this.containerType = containerType.toString();
        return this;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the origin endpoint for future identification purposes.
     * </p>
     * 
     * @param description
     *        Any descriptive information that you want to add to the origin endpoint for future identification
     *        purposes.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the origin endpoint for future identification purposes.
     * </p>
     * 
     * @return Any descriptive information that you want to add to the origin endpoint for future identification
     *         purposes.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the origin endpoint for future identification purposes.
     * </p>
     * 
     * @param description
     *        Any descriptive information that you want to add to the origin endpoint for future identification
     *        purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the origin endpoint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     * 
     * @return The date and time the origin endpoint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the origin endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the origin endpoint was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     * 
     * @return The date and time the origin endpoint was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The date and time the origin endpoint was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the origin endpoint was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * 
     * @return An HTTP live streaming (HLS) manifest configuration.
     */

    public java.util.List<ListHlsManifestConfiguration> getHlsManifests() {
        return hlsManifests;
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * 
     * @param hlsManifests
     *        An HTTP live streaming (HLS) manifest configuration.
     */

    public void setHlsManifests(java.util.Collection<ListHlsManifestConfiguration> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<ListHlsManifestConfiguration>(hlsManifests);
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHlsManifests(java.util.Collection)} or {@link #withHlsManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hlsManifests
     *        An HTTP live streaming (HLS) manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withHlsManifests(ListHlsManifestConfiguration... hlsManifests) {
        if (this.hlsManifests == null) {
            setHlsManifests(new java.util.ArrayList<ListHlsManifestConfiguration>(hlsManifests.length));
        }
        for (ListHlsManifestConfiguration ele : hlsManifests) {
            this.hlsManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An HTTP live streaming (HLS) manifest configuration.
     * </p>
     * 
     * @param hlsManifests
     *        An HTTP live streaming (HLS) manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withHlsManifests(java.util.Collection<ListHlsManifestConfiguration> hlsManifests) {
        setHlsManifests(hlsManifests);
        return this;
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * 
     * @return A low-latency HLS manifest configuration.
     */

    public java.util.List<ListLowLatencyHlsManifestConfiguration> getLowLatencyHlsManifests() {
        return lowLatencyHlsManifests;
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * 
     * @param lowLatencyHlsManifests
     *        A low-latency HLS manifest configuration.
     */

    public void setLowLatencyHlsManifests(java.util.Collection<ListLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests) {
        if (lowLatencyHlsManifests == null) {
            this.lowLatencyHlsManifests = null;
            return;
        }

        this.lowLatencyHlsManifests = new java.util.ArrayList<ListLowLatencyHlsManifestConfiguration>(lowLatencyHlsManifests);
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLowLatencyHlsManifests(java.util.Collection)} or
     * {@link #withLowLatencyHlsManifests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lowLatencyHlsManifests
     *        A low-latency HLS manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withLowLatencyHlsManifests(ListLowLatencyHlsManifestConfiguration... lowLatencyHlsManifests) {
        if (this.lowLatencyHlsManifests == null) {
            setLowLatencyHlsManifests(new java.util.ArrayList<ListLowLatencyHlsManifestConfiguration>(lowLatencyHlsManifests.length));
        }
        for (ListLowLatencyHlsManifestConfiguration ele : lowLatencyHlsManifests) {
            this.lowLatencyHlsManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A low-latency HLS manifest configuration.
     * </p>
     * 
     * @param lowLatencyHlsManifests
     *        A low-latency HLS manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withLowLatencyHlsManifests(java.util.Collection<ListLowLatencyHlsManifestConfiguration> lowLatencyHlsManifests) {
        setLowLatencyHlsManifests(lowLatencyHlsManifests);
        return this;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @return A DASH manifest configuration.
     */

    public java.util.List<ListDashManifestConfiguration> getDashManifests() {
        return dashManifests;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @param dashManifests
     *        A DASH manifest configuration.
     */

    public void setDashManifests(java.util.Collection<ListDashManifestConfiguration> dashManifests) {
        if (dashManifests == null) {
            this.dashManifests = null;
            return;
        }

        this.dashManifests = new java.util.ArrayList<ListDashManifestConfiguration>(dashManifests);
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashManifests(java.util.Collection)} or {@link #withDashManifests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dashManifests
     *        A DASH manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withDashManifests(ListDashManifestConfiguration... dashManifests) {
        if (this.dashManifests == null) {
            setDashManifests(new java.util.ArrayList<ListDashManifestConfiguration>(dashManifests.length));
        }
        for (ListDashManifestConfiguration ele : dashManifests) {
            this.dashManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A DASH manifest configuration.
     * </p>
     * 
     * @param dashManifests
     *        A DASH manifest configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginEndpointListConfiguration withDashManifests(java.util.Collection<ListDashManifestConfiguration> dashManifests) {
        setDashManifests(dashManifests);
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
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getOriginEndpointName() != null)
            sb.append("OriginEndpointName: ").append(getOriginEndpointName()).append(",");
        if (getContainerType() != null)
            sb.append("ContainerType: ").append(getContainerType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getHlsManifests() != null)
            sb.append("HlsManifests: ").append(getHlsManifests()).append(",");
        if (getLowLatencyHlsManifests() != null)
            sb.append("LowLatencyHlsManifests: ").append(getLowLatencyHlsManifests()).append(",");
        if (getDashManifests() != null)
            sb.append("DashManifests: ").append(getDashManifests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginEndpointListConfiguration == false)
            return false;
        OriginEndpointListConfiguration other = (OriginEndpointListConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getOriginEndpointName() == null ^ this.getOriginEndpointName() == null)
            return false;
        if (other.getOriginEndpointName() != null && other.getOriginEndpointName().equals(this.getOriginEndpointName()) == false)
            return false;
        if (other.getContainerType() == null ^ this.getContainerType() == null)
            return false;
        if (other.getContainerType() != null && other.getContainerType().equals(this.getContainerType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getHlsManifests() == null ^ this.getHlsManifests() == null)
            return false;
        if (other.getHlsManifests() != null && other.getHlsManifests().equals(this.getHlsManifests()) == false)
            return false;
        if (other.getLowLatencyHlsManifests() == null ^ this.getLowLatencyHlsManifests() == null)
            return false;
        if (other.getLowLatencyHlsManifests() != null && other.getLowLatencyHlsManifests().equals(this.getLowLatencyHlsManifests()) == false)
            return false;
        if (other.getDashManifests() == null ^ this.getDashManifests() == null)
            return false;
        if (other.getDashManifests() != null && other.getDashManifests().equals(this.getDashManifests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpointName() == null) ? 0 : getOriginEndpointName().hashCode());
        hashCode = prime * hashCode + ((getContainerType() == null) ? 0 : getContainerType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getLowLatencyHlsManifests() == null) ? 0 : getLowLatencyHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getDashManifests() == null) ? 0 : getDashManifests().hashCode());
        return hashCode;
    }

    @Override
    public OriginEndpointListConfiguration clone() {
        try {
            return (OriginEndpointListConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.OriginEndpointListConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
