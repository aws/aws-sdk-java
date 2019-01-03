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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an Amazon Inspector application. This data type is used as the response element in the
 * <a>DescribeAssessmentTargets</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssessmentTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN that specifies the Amazon Inspector assessment target.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the Amazon Inspector assessment target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN that specifies the resource group that is associated with the assessment target.
     * </p>
     */
    private String resourceGroupArn;
    /**
     * <p>
     * The time at which the assessment target is created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which <a>UpdateAssessmentTarget</a> is called.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN that specifies the Amazon Inspector assessment target.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the Amazon Inspector assessment target.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN that specifies the Amazon Inspector assessment target.
     * </p>
     * 
     * @return The ARN that specifies the Amazon Inspector assessment target.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN that specifies the Amazon Inspector assessment target.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the Amazon Inspector assessment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Inspector assessment target.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Inspector assessment target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Inspector assessment target.
     * </p>
     * 
     * @return The name of the Amazon Inspector assessment target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Inspector assessment target.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Inspector assessment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN that specifies the resource group that is associated with the assessment target.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN that specifies the resource group that is associated with the assessment target.
     */

    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN that specifies the resource group that is associated with the assessment target.
     * </p>
     * 
     * @return The ARN that specifies the resource group that is associated with the assessment target.
     */

    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN that specifies the resource group that is associated with the assessment target.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN that specifies the resource group that is associated with the assessment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withResourceGroupArn(String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
        return this;
    }

    /**
     * <p>
     * The time at which the assessment target is created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the assessment target is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the assessment target is created.
     * </p>
     * 
     * @return The time at which the assessment target is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the assessment target is created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the assessment target is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which <a>UpdateAssessmentTarget</a> is called.
     * </p>
     * 
     * @param updatedAt
     *        The time at which <a>UpdateAssessmentTarget</a> is called.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which <a>UpdateAssessmentTarget</a> is called.
     * </p>
     * 
     * @return The time at which <a>UpdateAssessmentTarget</a> is called.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which <a>UpdateAssessmentTarget</a> is called.
     * </p>
     * 
     * @param updatedAt
     *        The time at which <a>UpdateAssessmentTarget</a> is called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: ").append(getResourceGroupArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentTarget == false)
            return false;
        AssessmentTarget other = (AssessmentTarget) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceGroupArn() == null ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null && other.getResourceGroupArn().equals(this.getResourceGroupArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentTarget clone() {
        try {
            return (AssessmentTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssessmentTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
