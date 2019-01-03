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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an on-premises instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/InstanceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     */
    private String iamSessionArn;
    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     */
    private String iamUserArn;
    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     */
    private java.util.Date registerTime;
    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
     * </p>
     */
    private java.util.Date deregisterTime;
    /**
     * <p>
     * The tags currently associated with the on-premises instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     * 
     * @param instanceName
     *        The name of the on-premises instance.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     * 
     * @return The name of the on-premises instance.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     * 
     * @param instanceName
     *        The name of the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     * 
     * @param iamSessionArn
     *        The ARN of the IAM session associated with the on-premises instance.
     */

    public void setIamSessionArn(String iamSessionArn) {
        this.iamSessionArn = iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     * 
     * @return The ARN of the IAM session associated with the on-premises instance.
     */

    public String getIamSessionArn() {
        return this.iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     * 
     * @param iamSessionArn
     *        The ARN of the IAM session associated with the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withIamSessionArn(String iamSessionArn) {
        setIamSessionArn(iamSessionArn);
        return this;
    }

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     * 
     * @param iamUserArn
     *        The IAM user ARN associated with the on-premises instance.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     * 
     * @return The IAM user ARN associated with the on-premises instance.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     * 
     * @param iamUserArn
     *        The IAM user ARN associated with the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the on-premises instance.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     * 
     * @return The ARN of the on-premises instance.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     * 
     * @param registerTime
     *        The time at which the on-premises instance was registered.
     */

    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     * 
     * @return The time at which the on-premises instance was registered.
     */

    public java.util.Date getRegisterTime() {
        return this.registerTime;
    }

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     * 
     * @param registerTime
     *        The time at which the on-premises instance was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withRegisterTime(java.util.Date registerTime) {
        setRegisterTime(registerTime);
        return this;
    }

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
     * </p>
     * 
     * @param deregisterTime
     *        If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
     */

    public void setDeregisterTime(java.util.Date deregisterTime) {
        this.deregisterTime = deregisterTime;
    }

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
     * </p>
     * 
     * @return If the on-premises instance was deregistered, the time at which the on-premises instance was
     *         deregistered.
     */

    public java.util.Date getDeregisterTime() {
        return this.deregisterTime;
    }

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
     * </p>
     * 
     * @param deregisterTime
     *        If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withDeregisterTime(java.util.Date deregisterTime) {
        setDeregisterTime(deregisterTime);
        return this;
    }

    /**
     * <p>
     * The tags currently associated with the on-premises instance.
     * </p>
     * 
     * @return The tags currently associated with the on-premises instance.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags currently associated with the on-premises instance.
     * </p>
     * 
     * @param tags
     *        The tags currently associated with the on-premises instance.
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
     * The tags currently associated with the on-premises instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags currently associated with the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withTags(Tag... tags) {
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
     * The tags currently associated with the on-premises instance.
     * </p>
     * 
     * @param tags
     *        The tags currently associated with the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInfo withTags(java.util.Collection<Tag> tags) {
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getIamSessionArn() != null)
            sb.append("IamSessionArn: ").append(getIamSessionArn()).append(",");
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getRegisterTime() != null)
            sb.append("RegisterTime: ").append(getRegisterTime()).append(",");
        if (getDeregisterTime() != null)
            sb.append("DeregisterTime: ").append(getDeregisterTime()).append(",");
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

        if (obj instanceof InstanceInfo == false)
            return false;
        InstanceInfo other = (InstanceInfo) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getIamSessionArn() == null ^ this.getIamSessionArn() == null)
            return false;
        if (other.getIamSessionArn() != null && other.getIamSessionArn().equals(this.getIamSessionArn()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getRegisterTime() == null ^ this.getRegisterTime() == null)
            return false;
        if (other.getRegisterTime() != null && other.getRegisterTime().equals(this.getRegisterTime()) == false)
            return false;
        if (other.getDeregisterTime() == null ^ this.getDeregisterTime() == null)
            return false;
        if (other.getDeregisterTime() != null && other.getDeregisterTime().equals(this.getDeregisterTime()) == false)
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

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamSessionArn() == null) ? 0 : getIamSessionArn().hashCode());
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        hashCode = prime * hashCode + ((getDeregisterTime() == null) ? 0 : getDeregisterTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InstanceInfo clone() {
        try {
            return (InstanceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.InstanceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
