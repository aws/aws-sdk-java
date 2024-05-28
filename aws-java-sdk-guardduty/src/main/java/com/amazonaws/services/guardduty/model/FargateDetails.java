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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about Amazon Web Services Fargate details associated with an Amazon ECS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FargateDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FargateDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * </p>
     */
    private java.util.List<String> issues;
    /**
     * <p>
     * Indicates how the GuardDuty security agent is managed for this resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     * resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only) woprkloads.
     * </p>
     * </note>
     */
    private String managementType;

    /**
     * <p>
     * Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * </p>
     * 
     * @return Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     */

    public java.util.List<String> getIssues() {
        return issues;
    }

    /**
     * <p>
     * Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * </p>
     * 
     * @param issues
     *        Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     */

    public void setIssues(java.util.Collection<String> issues) {
        if (issues == null) {
            this.issues = null;
            return;
        }

        this.issues = new java.util.ArrayList<String>(issues);
    }

    /**
     * <p>
     * Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssues(java.util.Collection)} or {@link #withIssues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param issues
     *        Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateDetails withIssues(String... issues) {
        if (this.issues == null) {
            setIssues(new java.util.ArrayList<String>(issues.length));
        }
        for (String ele : issues) {
            this.issues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * </p>
     * 
     * @param issues
     *        Runtime coverage issues identified for the resource running on Amazon Web Services Fargate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateDetails withIssues(java.util.Collection<String> issues) {
        setIssues(issues);
        return this;
    }

    /**
     * <p>
     * Indicates how the GuardDuty security agent is managed for this resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     * resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only) woprkloads.
     * </p>
     * </note>
     * 
     * @param managementType
     *        Indicates how the GuardDuty security agent is managed for this resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     *        resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only)
     *        woprkloads.
     *        </p>
     * @see ManagementType
     */

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    /**
     * <p>
     * Indicates how the GuardDuty security agent is managed for this resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     * resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only) woprkloads.
     * </p>
     * </note>
     * 
     * @return Indicates how the GuardDuty security agent is managed for this resource.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     *         resource.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only)
     *         woprkloads.
     *         </p>
     * @see ManagementType
     */

    public String getManagementType() {
        return this.managementType;
    }

    /**
     * <p>
     * Indicates how the GuardDuty security agent is managed for this resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     * resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only) woprkloads.
     * </p>
     * </note>
     * 
     * @param managementType
     *        Indicates how the GuardDuty security agent is managed for this resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     *        resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only)
     *        woprkloads.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagementType
     */

    public FargateDetails withManagementType(String managementType) {
        setManagementType(managementType);
        return this;
    }

    /**
     * <p>
     * Indicates how the GuardDuty security agent is managed for this resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     * resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only) woprkloads.
     * </p>
     * </note>
     * 
     * @param managementType
     *        Indicates how the GuardDuty security agent is managed for this resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTO_MANAGED</code> indicates that GuardDuty deploys and manages updates for this resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> indicates that the deployment of the GuardDuty security agent is disabled for this
     *        resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>MANUAL</code> status doesn't apply to the Amazon Web Services Fargate (Amazon ECS only)
     *        woprkloads.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagementType
     */

    public FargateDetails withManagementType(ManagementType managementType) {
        this.managementType = managementType.toString();
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
        if (getIssues() != null)
            sb.append("Issues: ").append(getIssues()).append(",");
        if (getManagementType() != null)
            sb.append("ManagementType: ").append(getManagementType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FargateDetails == false)
            return false;
        FargateDetails other = (FargateDetails) obj;
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        if (other.getManagementType() == null ^ this.getManagementType() == null)
            return false;
        if (other.getManagementType() != null && other.getManagementType().equals(this.getManagementType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        hashCode = prime * hashCode + ((getManagementType() == null) ? 0 : getManagementType().hashCode());
        return hashCode;
    }

    @Override
    public FargateDetails clone() {
        try {
            return (FargateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FargateDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
