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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxScalingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxScalingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     */
    private String scalingGroupName;
    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     */
    private String hostType;
    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you want to create the scaling group.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, where you want to create the scaling group.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you want to create the scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     */

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @return A unique identifier for the kdb scaling group.
     */

    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest withScalingGroupName(String scalingGroupName) {
        setScalingGroupName(scalingGroupName);
        return this;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param hostType
     *        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *        placed.</p>
     *        <p>
     *        You can add one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     *        </p>
     *        </li>
     */

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *         placed.</p>
     *         <p>
     *         You can add one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     *         </p>
     *         </li>
     */

    public String getHostType() {
        return this.hostType;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param hostType
     *        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *        placed.</p>
     *        <p>
     *        You can add one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest withHostType(String hostType) {
        setHostType(hostType);
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @return The identifier of the availability zones.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     * </p>
     * 
     * @return A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the scaling group. You can add up to 50 tags to a scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKxScalingGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupRequest addTagsEntry(String key, String value) {
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

    public CreateKxScalingGroupRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getScalingGroupName() != null)
            sb.append("ScalingGroupName: ").append(getScalingGroupName()).append(",");
        if (getHostType() != null)
            sb.append("HostType: ").append(getHostType()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
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

        if (obj instanceof CreateKxScalingGroupRequest == false)
            return false;
        CreateKxScalingGroupRequest other = (CreateKxScalingGroupRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getScalingGroupName() == null ^ this.getScalingGroupName() == null)
            return false;
        if (other.getScalingGroupName() != null && other.getScalingGroupName().equals(this.getScalingGroupName()) == false)
            return false;
        if (other.getHostType() == null ^ this.getHostType() == null)
            return false;
        if (other.getHostType() != null && other.getHostType().equals(this.getHostType()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getScalingGroupName() == null) ? 0 : getScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostType() == null) ? 0 : getHostType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxScalingGroupRequest clone() {
        return (CreateKxScalingGroupRequest) super.clone();
    }

}
