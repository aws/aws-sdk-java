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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Modify the size or configurations of an instance group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceGroupModifyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroupModifyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     */
    private String instanceGroupId;
    /**
     * <p>
     * Target size for the instance group.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eC2InstanceIdsToTerminate;
    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     */
    private ShrinkPolicy shrinkPolicy;
    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;

    /**
     * Default constructor for InstanceGroupModifyConfig object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public InstanceGroupModifyConfig() {
    }

    /**
     * Constructs a new InstanceGroupModifyConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param instanceGroupId
     *        Unique ID of the instance group to expand or shrink.
     * @param instanceCount
     *        Target size for the instance group.
     */
    public InstanceGroupModifyConfig(String instanceGroupId, Integer instanceCount) {
        setInstanceGroupId(instanceGroupId);
        setInstanceCount(instanceCount);
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * 
     * @param instanceGroupId
     *        Unique ID of the instance group to expand or shrink.
     */

    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * 
     * @return Unique ID of the instance group to expand or shrink.
     */

    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * 
     * @param instanceGroupId
     *        Unique ID of the instance group to expand or shrink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
        return this;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Target size for the instance group.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * 
     * @return Target size for the instance group.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Target size for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * 
     * @return The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return
     *         to its original requested size.
     */

    public java.util.List<String> getEC2InstanceIdsToTerminate() {
        if (eC2InstanceIdsToTerminate == null) {
            eC2InstanceIdsToTerminate = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eC2InstanceIdsToTerminate;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * 
     * @param eC2InstanceIdsToTerminate
     *        The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to
     *        its original requested size.
     */

    public void setEC2InstanceIdsToTerminate(java.util.Collection<String> eC2InstanceIdsToTerminate) {
        if (eC2InstanceIdsToTerminate == null) {
            this.eC2InstanceIdsToTerminate = null;
            return;
        }

        this.eC2InstanceIdsToTerminate = new com.amazonaws.internal.SdkInternalList<String>(eC2InstanceIdsToTerminate);
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2InstanceIdsToTerminate(java.util.Collection)} or
     * {@link #withEC2InstanceIdsToTerminate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eC2InstanceIdsToTerminate
     *        The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to
     *        its original requested size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withEC2InstanceIdsToTerminate(String... eC2InstanceIdsToTerminate) {
        if (this.eC2InstanceIdsToTerminate == null) {
            setEC2InstanceIdsToTerminate(new com.amazonaws.internal.SdkInternalList<String>(eC2InstanceIdsToTerminate.length));
        }
        for (String ele : eC2InstanceIdsToTerminate) {
            this.eC2InstanceIdsToTerminate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * 
     * @param eC2InstanceIdsToTerminate
     *        The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to
     *        its original requested size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withEC2InstanceIdsToTerminate(java.util.Collection<String> eC2InstanceIdsToTerminate) {
        setEC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate);
        return this;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * 
     * @param shrinkPolicy
     *        Policy for customizing shrink operations.
     */

    public void setShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * 
     * @return Policy for customizing shrink operations.
     */

    public ShrinkPolicy getShrinkPolicy() {
        return this.shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * 
     * @param shrinkPolicy
     *        Policy for customizing shrink operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        setShrinkPolicy(shrinkPolicy);
        return this;
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     * 
     * @return A list of new or modified configurations to apply for an instance group.
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     * 
     * @param configurations
     *        A list of new or modified configurations to apply for an instance group.
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        A list of new or modified configurations to apply for an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     * 
     * @param configurations
     *        A list of new or modified configurations to apply for an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupModifyConfig withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
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
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: ").append(getInstanceGroupId()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getEC2InstanceIdsToTerminate() != null)
            sb.append("EC2InstanceIdsToTerminate: ").append(getEC2InstanceIdsToTerminate()).append(",");
        if (getShrinkPolicy() != null)
            sb.append("ShrinkPolicy: ").append(getShrinkPolicy()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupModifyConfig == false)
            return false;
        InstanceGroupModifyConfig other = (InstanceGroupModifyConfig) obj;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getEC2InstanceIdsToTerminate() == null ^ this.getEC2InstanceIdsToTerminate() == null)
            return false;
        if (other.getEC2InstanceIdsToTerminate() != null && other.getEC2InstanceIdsToTerminate().equals(this.getEC2InstanceIdsToTerminate()) == false)
            return false;
        if (other.getShrinkPolicy() == null ^ this.getShrinkPolicy() == null)
            return false;
        if (other.getShrinkPolicy() != null && other.getShrinkPolicy().equals(this.getShrinkPolicy()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getEC2InstanceIdsToTerminate() == null) ? 0 : getEC2InstanceIdsToTerminate().hashCode());
        hashCode = prime * hashCode + ((getShrinkPolicy() == null) ? 0 : getShrinkPolicy().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroupModifyConfig clone() {
        try {
            return (InstanceGroupModifyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceGroupModifyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
