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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the deployment pattern supported by a given workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     */
    private String deploymentPatternName;
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request, and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * The name of the deployment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The settings specified for the deployment. For more information on the specifications required for creating a
     * deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     */
    private java.util.Map<String, String> specifications;
    /**
     * <p>
     * The name of the workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     */
    private String workloadName;

    /**
     * <p>
     * The name of the deployment pattern supported by a given workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     * 
     * @param deploymentPatternName
     *        The name of the deployment pattern supported by a given workload. You can use the <a href=
     *        "https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     *        <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this
     *        parameter.
     */

    public void setDeploymentPatternName(String deploymentPatternName) {
        this.deploymentPatternName = deploymentPatternName;
    }

    /**
     * <p>
     * The name of the deployment pattern supported by a given workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     * 
     * @return The name of the deployment pattern supported by a given workload. You can use the <a
     *         href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html"
     *         > <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this
     *         parameter.
     */

    public String getDeploymentPatternName() {
        return this.deploymentPatternName;
    }

    /**
     * <p>
     * The name of the deployment pattern supported by a given workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     * 
     * @param deploymentPatternName
     *        The name of the deployment pattern supported by a given workload. You can use the <a href=
     *        "https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     *        <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDeploymentPatternName(String deploymentPatternName) {
        setDeploymentPatternName(deploymentPatternName);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request, and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the required permissions for the action, without actually making the request, and
     *        provides an error response. If you have the required permissions, the error response is
     *        <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request, and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @return Checks whether you have the required permissions for the action, without actually making the request, and
     *         provides an error response. If you have the required permissions, the error response is
     *         <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request, and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the required permissions for the action, without actually making the request, and
     *        provides an error response. If you have the required permissions, the error response is
     *        <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request, and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @return Checks whether you have the required permissions for the action, without actually making the request, and
     *         provides an error response. If you have the required permissions, the error response is
     *         <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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

    public CreateDeploymentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The settings specified for the deployment. For more information on the specifications required for creating a
     * deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     * 
     * @return The settings specified for the deployment. For more information on the specifications required for
     *         creating a deployment, see <a
     *         href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html"
     *         >Workload specifications</a>.
     */

    public java.util.Map<String, String> getSpecifications() {
        return specifications;
    }

    /**
     * <p>
     * The settings specified for the deployment. For more information on the specifications required for creating a
     * deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     * 
     * @param specifications
     *        The settings specified for the deployment. For more information on the specifications required for
     *        creating a deployment, see <a
     *        href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html"
     *        >Workload specifications</a>.
     */

    public void setSpecifications(java.util.Map<String, String> specifications) {
        this.specifications = specifications;
    }

    /**
     * <p>
     * The settings specified for the deployment. For more information on the specifications required for creating a
     * deployment, see <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html">Workload
     * specifications</a>.
     * </p>
     * 
     * @param specifications
     *        The settings specified for the deployment. For more information on the specifications required for
     *        creating a deployment, see <a
     *        href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications.html"
     *        >Workload specifications</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withSpecifications(java.util.Map<String, String> specifications) {
        setSpecifications(specifications);
        return this;
    }

    /**
     * Add a single Specifications entry
     *
     * @see CreateDeploymentRequest#withSpecifications
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest addSpecificationsEntry(String key, String value) {
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

    public CreateDeploymentRequest clearSpecificationsEntries() {
        this.specifications = null;
        return this;
    }

    /**
     * <p>
     * The name of the workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload. You can use the <a href=
     *        "https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     *        <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this
     *        parameter.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     * 
     * @return The name of the workload. You can use the <a
     *         href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html"
     *         > <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this
     *         parameter.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload. You can use the <a
     * href="https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     * <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this parameter.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload. You can use the <a href=
     *        "https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_ListWorkloadDeploymentPatterns.html">
     *        <code>ListWorkloadDeploymentPatterns</code> </a> operation to discover supported values for this
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withWorkloadName(String workloadName) {
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
        if (getDeploymentPatternName() != null)
            sb.append("DeploymentPatternName: ").append(getDeploymentPatternName()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSpecifications() != null)
            sb.append("Specifications: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getDeploymentPatternName() == null ^ this.getDeploymentPatternName() == null)
            return false;
        if (other.getDeploymentPatternName() != null && other.getDeploymentPatternName().equals(this.getDeploymentPatternName()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSpecifications() == null ^ this.getSpecifications() == null)
            return false;
        if (other.getSpecifications() != null && other.getSpecifications().equals(this.getSpecifications()) == false)
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

        hashCode = prime * hashCode + ((getDeploymentPatternName() == null) ? 0 : getDeploymentPatternName().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
