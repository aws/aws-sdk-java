/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that encapsulates a signaling channel's metadata and properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ChannelInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The ARN of the signaling channel.
     * </p>
     */
    private String channelARN;
    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     */
    private String channelType;
    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     */
    private String channelStatus;
    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     */
    private SingleMasterConfiguration singleMasterConfiguration;
    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     * 
     * @param channelName
     *        The name of the signaling channel.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     * 
     * @return The name of the signaling channel.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     * 
     * @param channelName
     *        The name of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelInfo withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The ARN of the signaling channel.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel.
     * </p>
     * 
     * @return The ARN of the signaling channel.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelInfo withChannelARN(String channelARN) {
        setChannelARN(channelARN);
        return this;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * 
     * @param channelType
     *        The type of the signaling channel.
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * 
     * @return The type of the signaling channel.
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * 
     * @param channelType
     *        The type of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public ChannelInfo withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * 
     * @param channelType
     *        The type of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public ChannelInfo withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * 
     * @param channelStatus
     *        Current status of the signaling channel.
     * @see Status
     */

    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * 
     * @return Current status of the signaling channel.
     * @see Status
     */

    public String getChannelStatus() {
        return this.channelStatus;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * 
     * @param channelStatus
     *        Current status of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ChannelInfo withChannelStatus(String channelStatus) {
        setChannelStatus(channelStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * 
     * @param channelStatus
     *        Current status of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ChannelInfo withChannelStatus(Status channelStatus) {
        this.channelStatus = channelStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the signaling channel was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     * 
     * @return The time at which the signaling channel was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the signaling channel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelInfo withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @param singleMasterConfiguration
     *        A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     */

    public void setSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @return A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     */

    public SingleMasterConfiguration getSingleMasterConfiguration() {
        return this.singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @param singleMasterConfiguration
     *        A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelInfo withSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        setSingleMasterConfiguration(singleMasterConfiguration);
        return this;
    }

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * 
     * @param version
     *        The current version of the signaling channel.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * 
     * @return The current version of the signaling channel.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * 
     * @param version
     *        The current version of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelInfo withVersion(String version) {
        setVersion(version);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelARN() != null)
            sb.append("ChannelARN: ").append(getChannelARN()).append(",");
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
        if (getChannelStatus() != null)
            sb.append("ChannelStatus: ").append(getChannelStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getSingleMasterConfiguration() != null)
            sb.append("SingleMasterConfiguration: ").append(getSingleMasterConfiguration()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelInfo == false)
            return false;
        ChannelInfo other = (ChannelInfo) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getChannelStatus() == null ^ this.getChannelStatus() == null)
            return false;
        if (other.getChannelStatus() != null && other.getChannelStatus().equals(this.getChannelStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getSingleMasterConfiguration() == null ^ this.getSingleMasterConfiguration() == null)
            return false;
        if (other.getSingleMasterConfiguration() != null && other.getSingleMasterConfiguration().equals(this.getSingleMasterConfiguration()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getChannelStatus() == null) ? 0 : getChannelStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getSingleMasterConfiguration() == null) ? 0 : getSingleMasterConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ChannelInfo clone() {
        try {
            return (ChannelInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ChannelInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
