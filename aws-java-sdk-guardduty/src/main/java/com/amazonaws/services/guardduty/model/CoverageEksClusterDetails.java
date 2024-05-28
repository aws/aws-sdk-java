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
 * Information about the EKS cluster that has a coverage status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageEksClusterDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageEksClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the EKS cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     * </p>
     */
    private Long coveredNodes;
    /**
     * <p>
     * Represents all the nodes within the EKS cluster in your account.
     * </p>
     */
    private Long compatibleNodes;
    /**
     * <p>
     * Information about the installed EKS add-on.
     * </p>
     */
    private AddonDetails addonDetails;
    /**
     * <p>
     * Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.
     * </p>
     * <p>
     * <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     * </p>
     * <p>
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     * GuardDuty agent for this resource.
     * </p>
     */
    private String managementType;

    /**
     * <p>
     * Name of the EKS cluster.
     * </p>
     * 
     * @param clusterName
     *        Name of the EKS cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * Name of the EKS cluster.
     * </p>
     * 
     * @return Name of the EKS cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * Name of the EKS cluster.
     * </p>
     * 
     * @param clusterName
     *        Name of the EKS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEksClusterDetails withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     * </p>
     * 
     * @param coveredNodes
     *        Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     */

    public void setCoveredNodes(Long coveredNodes) {
        this.coveredNodes = coveredNodes;
    }

    /**
     * <p>
     * Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     * </p>
     * 
     * @return Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     */

    public Long getCoveredNodes() {
        return this.coveredNodes;
    }

    /**
     * <p>
     * Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     * </p>
     * 
     * @param coveredNodes
     *        Represents the nodes within the EKS cluster that have a <code>HEALTHY</code> coverage status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEksClusterDetails withCoveredNodes(Long coveredNodes) {
        setCoveredNodes(coveredNodes);
        return this;
    }

    /**
     * <p>
     * Represents all the nodes within the EKS cluster in your account.
     * </p>
     * 
     * @param compatibleNodes
     *        Represents all the nodes within the EKS cluster in your account.
     */

    public void setCompatibleNodes(Long compatibleNodes) {
        this.compatibleNodes = compatibleNodes;
    }

    /**
     * <p>
     * Represents all the nodes within the EKS cluster in your account.
     * </p>
     * 
     * @return Represents all the nodes within the EKS cluster in your account.
     */

    public Long getCompatibleNodes() {
        return this.compatibleNodes;
    }

    /**
     * <p>
     * Represents all the nodes within the EKS cluster in your account.
     * </p>
     * 
     * @param compatibleNodes
     *        Represents all the nodes within the EKS cluster in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEksClusterDetails withCompatibleNodes(Long compatibleNodes) {
        setCompatibleNodes(compatibleNodes);
        return this;
    }

    /**
     * <p>
     * Information about the installed EKS add-on.
     * </p>
     * 
     * @param addonDetails
     *        Information about the installed EKS add-on.
     */

    public void setAddonDetails(AddonDetails addonDetails) {
        this.addonDetails = addonDetails;
    }

    /**
     * <p>
     * Information about the installed EKS add-on.
     * </p>
     * 
     * @return Information about the installed EKS add-on.
     */

    public AddonDetails getAddonDetails() {
        return this.addonDetails;
    }

    /**
     * <p>
     * Information about the installed EKS add-on.
     * </p>
     * 
     * @param addonDetails
     *        Information about the installed EKS add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEksClusterDetails withAddonDetails(AddonDetails addonDetails) {
        setAddonDetails(addonDetails);
        return this;
    }

    /**
     * <p>
     * Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.
     * </p>
     * <p>
     * <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     * </p>
     * <p>
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     * GuardDuty agent for this resource.
     * </p>
     * 
     * @param managementType
     *        Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.</p>
     *        <p>
     *        <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     *        </p>
     *        <p>
     *        <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     *        GuardDuty agent for this resource.
     * @see ManagementType
     */

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    /**
     * <p>
     * Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.
     * </p>
     * <p>
     * <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     * </p>
     * <p>
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     * GuardDuty agent for this resource.
     * </p>
     * 
     * @return Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.</p>
     *         <p>
     *         <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     *         </p>
     *         <p>
     *         <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS
     *         add-on GuardDuty agent for this resource.
     * @see ManagementType
     */

    public String getManagementType() {
        return this.managementType;
    }

    /**
     * <p>
     * Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.
     * </p>
     * <p>
     * <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     * </p>
     * <p>
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     * GuardDuty agent for this resource.
     * </p>
     * 
     * @param managementType
     *        Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.</p>
     *        <p>
     *        <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     *        </p>
     *        <p>
     *        <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     *        GuardDuty agent for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagementType
     */

    public CoverageEksClusterDetails withManagementType(String managementType) {
        setManagementType(managementType);
        return this;
    }

    /**
     * <p>
     * Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.
     * </p>
     * <p>
     * <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     * </p>
     * <p>
     * <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     * GuardDuty agent for this resource.
     * </p>
     * 
     * @param managementType
     *        Indicates how the Amazon EKS add-on GuardDuty agent is managed for this EKS cluster.</p>
     *        <p>
     *        <code>AUTO_MANAGED</code> indicates GuardDuty deploys and manages updates for this resource.
     *        </p>
     *        <p>
     *        <code>MANUAL</code> indicates that you are responsible to deploy, update, and manage the Amazon EKS add-on
     *        GuardDuty agent for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagementType
     */

    public CoverageEksClusterDetails withManagementType(ManagementType managementType) {
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getCoveredNodes() != null)
            sb.append("CoveredNodes: ").append(getCoveredNodes()).append(",");
        if (getCompatibleNodes() != null)
            sb.append("CompatibleNodes: ").append(getCompatibleNodes()).append(",");
        if (getAddonDetails() != null)
            sb.append("AddonDetails: ").append(getAddonDetails()).append(",");
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

        if (obj instanceof CoverageEksClusterDetails == false)
            return false;
        CoverageEksClusterDetails other = (CoverageEksClusterDetails) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCoveredNodes() == null ^ this.getCoveredNodes() == null)
            return false;
        if (other.getCoveredNodes() != null && other.getCoveredNodes().equals(this.getCoveredNodes()) == false)
            return false;
        if (other.getCompatibleNodes() == null ^ this.getCompatibleNodes() == null)
            return false;
        if (other.getCompatibleNodes() != null && other.getCompatibleNodes().equals(this.getCompatibleNodes()) == false)
            return false;
        if (other.getAddonDetails() == null ^ this.getAddonDetails() == null)
            return false;
        if (other.getAddonDetails() != null && other.getAddonDetails().equals(this.getAddonDetails()) == false)
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

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCoveredNodes() == null) ? 0 : getCoveredNodes().hashCode());
        hashCode = prime * hashCode + ((getCompatibleNodes() == null) ? 0 : getCompatibleNodes().hashCode());
        hashCode = prime * hashCode + ((getAddonDetails() == null) ? 0 : getAddonDetails().hashCode());
        hashCode = prime * hashCode + ((getManagementType() == null) ? 0 : getManagementType().hashCode());
        return hashCode;
    }

    @Override
    public CoverageEksClusterDetails clone() {
        try {
            return (CoverageEksClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageEksClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
