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
 * Contains information about the Amazon EC2 instance runtime coverage details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageEc2InstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageEc2InstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type of the Amazon EC2 instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * Information about the installed security agent.
     * </p>
     */
    private AgentDetails agentDetails;
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
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty security agent
     * updates for this resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
     * </p>
     * </note>
     */
    private String managementType;

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     * 
     * @param instanceId
     *        The Amazon EC2 instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     * 
     * @return The Amazon EC2 instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance ID.
     * </p>
     * 
     * @param instanceId
     *        The Amazon EC2 instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEc2InstanceDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type of the Amazon EC2 instance.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the Amazon EC2 instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the Amazon EC2 instance.
     * </p>
     * 
     * @return The instance type of the Amazon EC2 instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the Amazon EC2 instance.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEc2InstanceDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     * </p>
     * 
     * @param clusterArn
     *        The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     * </p>
     * 
     * @return The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     * </p>
     * 
     * @param clusterArn
     *        The cluster ARN of the Amazon ECS cluster running on the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEc2InstanceDetails withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * Information about the installed security agent.
     * </p>
     * 
     * @param agentDetails
     *        Information about the installed security agent.
     */

    public void setAgentDetails(AgentDetails agentDetails) {
        this.agentDetails = agentDetails;
    }

    /**
     * <p>
     * Information about the installed security agent.
     * </p>
     * 
     * @return Information about the installed security agent.
     */

    public AgentDetails getAgentDetails() {
        return this.agentDetails;
    }

    /**
     * <p>
     * Information about the installed security agent.
     * </p>
     * 
     * @param agentDetails
     *        Information about the installed security agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEc2InstanceDetails withAgentDetails(AgentDetails agentDetails) {
        setAgentDetails(agentDetails);
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
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty security agent
     * updates for this resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
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
     *        <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty
     *        security agent updates for this resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
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
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty security agent
     * updates for this resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
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
     *         <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty
     *         security agent updates for this resource.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
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
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty security agent
     * updates for this resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
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
     *        <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty
     *        security agent updates for this resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagementType
     */

    public CoverageEc2InstanceDetails withManagementType(String managementType) {
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
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty security agent
     * updates for this resource.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
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
     *        <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the GuardDuty
     *        security agent updates for this resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>DISABLED</code> status doesn't apply to Amazon EC2 instances and Amazon EKS clusters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagementType
     */

    public CoverageEc2InstanceDetails withManagementType(ManagementType managementType) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getAgentDetails() != null)
            sb.append("AgentDetails: ").append(getAgentDetails()).append(",");
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

        if (obj instanceof CoverageEc2InstanceDetails == false)
            return false;
        CoverageEc2InstanceDetails other = (CoverageEc2InstanceDetails) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getAgentDetails() == null ^ this.getAgentDetails() == null)
            return false;
        if (other.getAgentDetails() != null && other.getAgentDetails().equals(this.getAgentDetails()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getAgentDetails() == null) ? 0 : getAgentDetails().hashCode());
        hashCode = prime * hashCode + ((getManagementType() == null) ? 0 : getManagementType().hashCode());
        return hashCode;
    }

    @Override
    public CoverageEc2InstanceDetails clone() {
        try {
            return (CoverageEc2InstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageEc2InstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
