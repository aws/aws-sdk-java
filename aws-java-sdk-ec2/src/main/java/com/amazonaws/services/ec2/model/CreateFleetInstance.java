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
 * Describes the instances that were launched by the fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFleetInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     */
    private LaunchTemplateAndOverridesResponse launchTemplateAndOverrides;
    /**
     * <p>
     * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * </p>
     */
    private String lifecycle;
    /**
     * <p>
     * The IDs of the instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     * 
     * @param launchTemplateAndOverrides
     *        The launch templates and overrides that were used for launching the instances. Any parameters that you
     *        specify in the Overrides override the same parameters in the launch template.
     */

    public void setLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponse launchTemplateAndOverrides) {
        this.launchTemplateAndOverrides = launchTemplateAndOverrides;
    }

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     * 
     * @return The launch templates and overrides that were used for launching the instances. Any parameters that you
     *         specify in the Overrides override the same parameters in the launch template.
     */

    public LaunchTemplateAndOverridesResponse getLaunchTemplateAndOverrides() {
        return this.launchTemplateAndOverrides;
    }

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     * 
     * @param launchTemplateAndOverrides
     *        The launch templates and overrides that were used for launching the instances. Any parameters that you
     *        specify in the Overrides override the same parameters in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetInstance withLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponse launchTemplateAndOverrides) {
        setLaunchTemplateAndOverrides(launchTemplateAndOverrides);
        return this;
    }

    /**
     * <p>
     * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @param lifecycle
     *        Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * @see InstanceLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @return Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * @see InstanceLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @param lifecycle
     *        Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceLifecycle
     */

    public CreateFleetInstance withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @param lifecycle
     *        Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceLifecycle
     */

    public CreateFleetInstance withLifecycle(InstanceLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * 
     * @return The IDs of the instances.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetInstance withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetInstance withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public CreateFleetInstance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public CreateFleetInstance withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise blank.
     * @see PlatformValues
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @return The value is <code>Windows</code> for Windows instances; otherwise blank.
     * @see PlatformValues
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public CreateFleetInstance withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public CreateFleetInstance withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
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
        if (getLaunchTemplateAndOverrides() != null)
            sb.append("LaunchTemplateAndOverrides: ").append(getLaunchTemplateAndOverrides()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetInstance == false)
            return false;
        CreateFleetInstance other = (CreateFleetInstance) obj;
        if (other.getLaunchTemplateAndOverrides() == null ^ this.getLaunchTemplateAndOverrides() == null)
            return false;
        if (other.getLaunchTemplateAndOverrides() != null && other.getLaunchTemplateAndOverrides().equals(this.getLaunchTemplateAndOverrides()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateAndOverrides() == null) ? 0 : getLaunchTemplateAndOverrides().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetInstance clone() {
        try {
            return (CreateFleetInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
