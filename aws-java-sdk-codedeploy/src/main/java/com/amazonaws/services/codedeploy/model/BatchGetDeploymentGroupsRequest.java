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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a BatchGetDeploymentGroups operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDeploymentGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentGroupNames;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentGroupsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     * 
     * @return The names of the deployment groups.
     */

    public java.util.List<String> getDeploymentGroupNames() {
        if (deploymentGroupNames == null) {
            deploymentGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentGroupNames;
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     * 
     * @param deploymentGroupNames
     *        The names of the deployment groups.
     */

    public void setDeploymentGroupNames(java.util.Collection<String> deploymentGroupNames) {
        if (deploymentGroupNames == null) {
            this.deploymentGroupNames = null;
            return;
        }

        this.deploymentGroupNames = new com.amazonaws.internal.SdkInternalList<String>(deploymentGroupNames);
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentGroupNames(java.util.Collection)} or {@link #withDeploymentGroupNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deploymentGroupNames
     *        The names of the deployment groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentGroupsRequest withDeploymentGroupNames(String... deploymentGroupNames) {
        if (this.deploymentGroupNames == null) {
            setDeploymentGroupNames(new com.amazonaws.internal.SdkInternalList<String>(deploymentGroupNames.length));
        }
        for (String ele : deploymentGroupNames) {
            this.deploymentGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     * 
     * @param deploymentGroupNames
     *        The names of the deployment groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentGroupsRequest withDeploymentGroupNames(java.util.Collection<String> deploymentGroupNames) {
        setDeploymentGroupNames(deploymentGroupNames);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDeploymentGroupNames() != null)
            sb.append("DeploymentGroupNames: ").append(getDeploymentGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentGroupsRequest == false)
            return false;
        BatchGetDeploymentGroupsRequest other = (BatchGetDeploymentGroupsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupNames() == null ^ this.getDeploymentGroupNames() == null)
            return false;
        if (other.getDeploymentGroupNames() != null && other.getDeploymentGroupNames().equals(this.getDeploymentGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupNames() == null) ? 0 : getDeploymentGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDeploymentGroupsRequest clone() {
        return (BatchGetDeploymentGroupsRequest) super.clone();
    }

}
