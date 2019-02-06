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
 * Describes the configuration settings for the modified Reserved Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstancesConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * <note>
     * <p>
     * This is a required field for a request.
     * </p>
     * </note>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability Zone.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the modified Reserved Instances.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     * 
     * @return The Availability Zone for the modified Reserved Instances.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesConfiguration withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * <note>
     * <p>
     * This is a required field for a request.
     * </p>
     * </note>
     * 
     * @param instanceCount
     *        The number of modified Reserved Instances.</p> <note>
     *        <p>
     *        This is a required field for a request.
     *        </p>
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * <note>
     * <p>
     * This is a required field for a request.
     * </p>
     * </note>
     * 
     * @return The number of modified Reserved Instances.</p> <note>
     *         <p>
     *         This is a required field for a request.
     *         </p>
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * <note>
     * <p>
     * This is a required field for a request.
     * </p>
     * </note>
     * 
     * @param instanceCount
     *        The number of modified Reserved Instances.</p> <note>
     *        <p>
     *        This is a required field for a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesConfiguration withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @return The instance type for the modified Reserved Instances.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ReservedInstancesConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ReservedInstancesConfiguration withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     * </p>
     * 
     * @param platform
     *        The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     * </p>
     * 
     * @return The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     * </p>
     * 
     * @param platform
     *        The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesConfiguration withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability
     *        Zone.
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability Zone.
     * </p>
     * 
     * @return Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability
     *         Zone.
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability
     *        Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public ReservedInstancesConfiguration withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability
     *        Zone.
     * @see Scope
     */

    public void setScope(Scope scope) {
        withScope(scope);
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or instances in a specific Availability
     *        Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public ReservedInstancesConfiguration withScope(Scope scope) {
        this.scope = scope.toString();
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesConfiguration == false)
            return false;
        ReservedInstancesConfiguration other = (ReservedInstancesConfiguration) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesConfiguration clone() {
        try {
            return (ReservedInstancesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
