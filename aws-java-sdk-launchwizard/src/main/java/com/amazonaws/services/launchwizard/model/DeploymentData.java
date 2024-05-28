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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data associated with a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeploymentData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the deployment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time the deployment was deleted.
     * </p>
     */
    private java.util.Date deletedAt;
    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the deployment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The pattern name of the deployment.
     * </p>
     */
    private String patternName;
    /**
     * <p>
     * The resource group of the deployment.
     * </p>
     */
    private String resourceGroup;
    /**
     * <p>
     * The specifications of the deployment. For more information on specifications for each deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     */
    private java.util.Map<String, String> specifications;
    /**
     * <p>
     * The status of the deployment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;

    /**
     * <p>
     * The time the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The time the deployment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time the deployment was created.
     * </p>
     * 
     * @return The time the deployment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The time the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time the deployment was deleted.
     * </p>
     * 
     * @param deletedAt
     *        The time the deployment was deleted.
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * The time the deployment was deleted.
     * </p>
     * 
     * @return The time the deployment was deleted.
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * The time the deployment was deleted.
     * </p>
     * 
     * @param deletedAt
     *        The time the deployment was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withDeletedAt(java.util.Date deletedAt) {
        setDeletedAt(deletedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param id
     *        The ID of the deployment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @return The ID of the deployment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param id
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * 
     * @param name
     *        The name of the deployment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * 
     * @return The name of the deployment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * 
     * @param name
     *        The name of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The pattern name of the deployment.
     * </p>
     * 
     * @param patternName
     *        The pattern name of the deployment.
     */

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    /**
     * <p>
     * The pattern name of the deployment.
     * </p>
     * 
     * @return The pattern name of the deployment.
     */

    public String getPatternName() {
        return this.patternName;
    }

    /**
     * <p>
     * The pattern name of the deployment.
     * </p>
     * 
     * @param patternName
     *        The pattern name of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withPatternName(String patternName) {
        setPatternName(patternName);
        return this;
    }

    /**
     * <p>
     * The resource group of the deployment.
     * </p>
     * 
     * @param resourceGroup
     *        The resource group of the deployment.
     */

    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * <p>
     * The resource group of the deployment.
     * </p>
     * 
     * @return The resource group of the deployment.
     */

    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * <p>
     * The resource group of the deployment.
     * </p>
     * 
     * @param resourceGroup
     *        The resource group of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withResourceGroup(String resourceGroup) {
        setResourceGroup(resourceGroup);
        return this;
    }

    /**
     * <p>
     * The specifications of the deployment. For more information on specifications for each deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     * 
     * @return The specifications of the deployment. For more information on specifications for each deployment, see <a
     *         href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">
     *         Workload specifications</a>.
     */

    public java.util.Map<String, String> getSpecifications() {
        return specifications;
    }

    /**
     * <p>
     * The specifications of the deployment. For more information on specifications for each deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     * 
     * @param specifications
     *        The specifications of the deployment. For more information on specifications for each deployment, see <a
     *        href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">
     *        Workload specifications</a>.
     */

    public void setSpecifications(java.util.Map<String, String> specifications) {
        this.specifications = specifications;
    }

    /**
     * <p>
     * The specifications of the deployment. For more information on specifications for each deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     * 
     * @param specifications
     *        The specifications of the deployment. For more information on specifications for each deployment, see <a
     *        href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">
     *        Workload specifications</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withSpecifications(java.util.Map<String, String> specifications) {
        setSpecifications(specifications);
        return this;
    }

    /**
     * Add a single Specifications entry
     *
     * @see DeploymentData#withSpecifications
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData addSpecificationsEntry(String key, String value) {
        if (null == this.specifications) {
            this.specifications = new java.util.HashMap<String, String>();
        }
        if (this.specifications.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.specifications.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Specifications.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData clearSpecificationsEntries() {
        this.specifications = null;
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param status
     *        The status of the deployment.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @return The status of the deployment.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param status
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param status
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentData withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @return The name of the workload.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentData withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeletedAt() != null)
            sb.append("DeletedAt: ").append(getDeletedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPatternName() != null)
            sb.append("PatternName: ").append(getPatternName()).append(",");
        if (getResourceGroup() != null)
            sb.append("ResourceGroup: ").append(getResourceGroup()).append(",");
        if (getSpecifications() != null)
            sb.append("Specifications: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentData == false)
            return false;
        DeploymentData other = (DeploymentData) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeletedAt() == null ^ this.getDeletedAt() == null)
            return false;
        if (other.getDeletedAt() != null && other.getDeletedAt().equals(this.getDeletedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPatternName() == null ^ this.getPatternName() == null)
            return false;
        if (other.getPatternName() != null && other.getPatternName().equals(this.getPatternName()) == false)
            return false;
        if (other.getResourceGroup() == null ^ this.getResourceGroup() == null)
            return false;
        if (other.getResourceGroup() != null && other.getResourceGroup().equals(this.getResourceGroup()) == false)
            return false;
        if (other.getSpecifications() == null ^ this.getSpecifications() == null)
            return false;
        if (other.getSpecifications() != null && other.getSpecifications().equals(this.getSpecifications()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPatternName() == null) ? 0 : getPatternName().hashCode());
        hashCode = prime * hashCode + ((getResourceGroup() == null) ? 0 : getResourceGroup().hashCode());
        hashCode = prime * hashCode + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentData clone() {
        try {
            return (DeploymentData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.DeploymentDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
