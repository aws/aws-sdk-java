/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Traffic Mirror target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TrafficMirrorTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficMirrorTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     */
    private String trafficMirrorTargetId;
    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     */
    private String networkLoadBalancerArn;
    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The tags assigned to the Traffic Mirror target.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The ID of the Traffic Mirror target.
     */

    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @return The ID of the Traffic Mirror target.
     */

    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The ID of the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        setTrafficMirrorTargetId(trafficMirrorTargetId);
        return this;
    }

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID that is attached to the target.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     * 
     * @return The network interface ID that is attached to the target.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that is attached to the target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID that is attached to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     * 
     * @param networkLoadBalancerArn
     *        The Amazon Resource Name (ARN) of the Network Load Balancer.
     */

    public void setNetworkLoadBalancerArn(String networkLoadBalancerArn) {
        this.networkLoadBalancerArn = networkLoadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Network Load Balancer.
     */

    public String getNetworkLoadBalancerArn() {
        return this.networkLoadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     * </p>
     * 
     * @param networkLoadBalancerArn
     *        The Amazon Resource Name (ARN) of the Network Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withNetworkLoadBalancerArn(String networkLoadBalancerArn) {
        setNetworkLoadBalancerArn(networkLoadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * 
     * @param type
     *        The type of Traffic Mirror target.
     * @see TrafficMirrorTargetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * 
     * @return The type of Traffic Mirror target.
     * @see TrafficMirrorTargetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * 
     * @param type
     *        The type of Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorTargetType
     */

    public TrafficMirrorTarget withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of Traffic Mirror target.
     * </p>
     * 
     * @param type
     *        The type of Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorTargetType
     */

    public TrafficMirrorTarget withType(TrafficMirrorTargetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     * 
     * @param description
     *        Information about the Traffic Mirror target.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     * 
     * @return Information about the Traffic Mirror target.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the Traffic Mirror target.
     * </p>
     * 
     * @param description
     *        Information about the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     * 
     * @param ownerId
     *        The ID of the account that owns the Traffic Mirror target.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     * 
     * @return The ID of the account that owns the Traffic Mirror target.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror target.
     * </p>
     * 
     * @param ownerId
     *        The ID of the account that owns the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror target.
     * </p>
     * 
     * @return The tags assigned to the Traffic Mirror target.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror target.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror target.
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
     * The tags assigned to the Traffic Mirror target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withTags(Tag... tags) {
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
     * The tags assigned to the Traffic Mirror target.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorTarget withTags(java.util.Collection<Tag> tags) {
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
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: ").append(getTrafficMirrorTargetId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNetworkLoadBalancerArn() != null)
            sb.append("NetworkLoadBalancerArn: ").append(getNetworkLoadBalancerArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
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

        if (obj instanceof TrafficMirrorTarget == false)
            return false;
        TrafficMirrorTarget other = (TrafficMirrorTarget) obj;
        if (other.getTrafficMirrorTargetId() == null ^ this.getTrafficMirrorTargetId() == null)
            return false;
        if (other.getTrafficMirrorTargetId() != null && other.getTrafficMirrorTargetId().equals(this.getTrafficMirrorTargetId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkLoadBalancerArn() == null ^ this.getNetworkLoadBalancerArn() == null)
            return false;
        if (other.getNetworkLoadBalancerArn() != null && other.getNetworkLoadBalancerArn().equals(this.getNetworkLoadBalancerArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
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

        hashCode = prime * hashCode + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkLoadBalancerArn() == null) ? 0 : getNetworkLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TrafficMirrorTarget clone() {
        try {
            return (TrafficMirrorTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
