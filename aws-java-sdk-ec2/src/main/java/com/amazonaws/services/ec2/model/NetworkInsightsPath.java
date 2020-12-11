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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInsightsPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsPath implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the path.
     * </p>
     */
    private String networkInsightsPathId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the path.
     * </p>
     */
    private String networkInsightsPathArn;
    /**
     * <p>
     * The time stamp when the path was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     */
    private String sourceIp;
    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     */
    private String destinationIp;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The destination port.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The tags associated with the path.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the path.
     * </p>
     * 
     * @param networkInsightsPathId
     *        The ID of the path.
     */

    public void setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
    }

    /**
     * <p>
     * The ID of the path.
     * </p>
     * 
     * @return The ID of the path.
     */

    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    /**
     * <p>
     * The ID of the path.
     * </p>
     * 
     * @param networkInsightsPathId
     *        The ID of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withNetworkInsightsPathId(String networkInsightsPathId) {
        setNetworkInsightsPathId(networkInsightsPathId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the path.
     * </p>
     * 
     * @param networkInsightsPathArn
     *        The Amazon Resource Name (ARN) of the path.
     */

    public void setNetworkInsightsPathArn(String networkInsightsPathArn) {
        this.networkInsightsPathArn = networkInsightsPathArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the path.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the path.
     */

    public String getNetworkInsightsPathArn() {
        return this.networkInsightsPathArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the path.
     * </p>
     * 
     * @param networkInsightsPathArn
     *        The Amazon Resource Name (ARN) of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withNetworkInsightsPathArn(String networkInsightsPathArn) {
        setNetworkInsightsPathArn(networkInsightsPathArn);
        return this;
    }

    /**
     * <p>
     * The time stamp when the path was created.
     * </p>
     * 
     * @param createdDate
     *        The time stamp when the path was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The time stamp when the path was created.
     * </p>
     * 
     * @return The time stamp when the path was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The time stamp when the path was created.
     * </p>
     * 
     * @param createdDate
     *        The time stamp when the path was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     * 
     * @param source
     *        The AWS resource that is the source of the path.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     * 
     * @return The AWS resource that is the source of the path.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     * 
     * @param source
     *        The AWS resource that is the source of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destination
     *        The AWS resource that is the destination of the path.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     * 
     * @return The AWS resource that is the destination of the path.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destination
     *        The AWS resource that is the destination of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     * 
     * @param sourceIp
     *        The IP address of the AWS resource that is the source of the path.
     */

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     * 
     * @return The IP address of the AWS resource that is the source of the path.
     */

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     * 
     * @param sourceIp
     *        The IP address of the AWS resource that is the source of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withSourceIp(String sourceIp) {
        setSourceIp(sourceIp);
        return this;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destinationIp
     *        The IP address of the AWS resource that is the destination of the path.
     */

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     * 
     * @return The IP address of the AWS resource that is the destination of the path.
     */

    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destinationIp
     *        The IP address of the AWS resource that is the destination of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withDestinationIp(String destinationIp) {
        setDestinationIp(destinationIp);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public NetworkInsightsPath withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public NetworkInsightsPath withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The destination port.
     * </p>
     * 
     * @param destinationPort
     *        The destination port.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port.
     * </p>
     * 
     * @return The destination port.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination port.
     * </p>
     * 
     * @param destinationPort
     *        The destination port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The tags associated with the path.
     * </p>
     * 
     * @return The tags associated with the path.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the path.
     * </p>
     * 
     * @param tags
     *        The tags associated with the path.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the path.
     * </p>
     * 
     * @param tags
     *        The tags associated with the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsPath withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNetworkInsightsPathId() != null)
            sb.append("NetworkInsightsPathId: ").append(getNetworkInsightsPathId()).append(",");
        if (getNetworkInsightsPathArn() != null)
            sb.append("NetworkInsightsPathArn: ").append(getNetworkInsightsPathArn()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getSourceIp() != null)
            sb.append("SourceIp: ").append(getSourceIp()).append(",");
        if (getDestinationIp() != null)
            sb.append("DestinationIp: ").append(getDestinationIp()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
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

        if (obj instanceof NetworkInsightsPath == false)
            return false;
        NetworkInsightsPath other = (NetworkInsightsPath) obj;
        if (other.getNetworkInsightsPathId() == null ^ this.getNetworkInsightsPathId() == null)
            return false;
        if (other.getNetworkInsightsPathId() != null && other.getNetworkInsightsPathId().equals(this.getNetworkInsightsPathId()) == false)
            return false;
        if (other.getNetworkInsightsPathArn() == null ^ this.getNetworkInsightsPathArn() == null)
            return false;
        if (other.getNetworkInsightsPathArn() != null && other.getNetworkInsightsPathArn().equals(this.getNetworkInsightsPathArn()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        if (other.getDestinationIp() == null ^ this.getDestinationIp() == null)
            return false;
        if (other.getDestinationIp() != null && other.getDestinationIp().equals(this.getDestinationIp()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsPathId() == null) ? 0 : getNetworkInsightsPathId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsPathArn() == null) ? 0 : getNetworkInsightsPathArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        hashCode = prime * hashCode + ((getDestinationIp() == null) ? 0 : getDestinationIp().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInsightsPath clone() {
        try {
            return (NetworkInsightsPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
