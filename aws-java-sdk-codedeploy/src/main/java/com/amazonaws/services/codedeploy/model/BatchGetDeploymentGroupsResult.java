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

/**
 * <p>
 * Represents the output of a BatchGetDeploymentGroups operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDeploymentGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeploymentGroupInfo> deploymentGroupsInfo;
    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     * 
     * @return Information about the deployment groups.
     */

    public java.util.List<DeploymentGroupInfo> getDeploymentGroupsInfo() {
        if (deploymentGroupsInfo == null) {
            deploymentGroupsInfo = new com.amazonaws.internal.SdkInternalList<DeploymentGroupInfo>();
        }
        return deploymentGroupsInfo;
    }

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     * 
     * @param deploymentGroupsInfo
     *        Information about the deployment groups.
     */

    public void setDeploymentGroupsInfo(java.util.Collection<DeploymentGroupInfo> deploymentGroupsInfo) {
        if (deploymentGroupsInfo == null) {
            this.deploymentGroupsInfo = null;
            return;
        }

        this.deploymentGroupsInfo = new com.amazonaws.internal.SdkInternalList<DeploymentGroupInfo>(deploymentGroupsInfo);
    }

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentGroupsInfo(java.util.Collection)} or {@link #withDeploymentGroupsInfo(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deploymentGroupsInfo
     *        Information about the deployment groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentGroupsResult withDeploymentGroupsInfo(DeploymentGroupInfo... deploymentGroupsInfo) {
        if (this.deploymentGroupsInfo == null) {
            setDeploymentGroupsInfo(new com.amazonaws.internal.SdkInternalList<DeploymentGroupInfo>(deploymentGroupsInfo.length));
        }
        for (DeploymentGroupInfo ele : deploymentGroupsInfo) {
            this.deploymentGroupsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     * 
     * @param deploymentGroupsInfo
     *        Information about the deployment groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentGroupsResult withDeploymentGroupsInfo(java.util.Collection<DeploymentGroupInfo> deploymentGroupsInfo) {
        setDeploymentGroupsInfo(deploymentGroupsInfo);
        return this;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     * 
     * @param errorMessage
     *        Information about errors that might have occurred during the API call.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     * 
     * @return Information about errors that might have occurred during the API call.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     * 
     * @param errorMessage
     *        Information about errors that might have occurred during the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentGroupsResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getDeploymentGroupsInfo() != null)
            sb.append("DeploymentGroupsInfo: ").append(getDeploymentGroupsInfo()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentGroupsResult == false)
            return false;
        BatchGetDeploymentGroupsResult other = (BatchGetDeploymentGroupsResult) obj;
        if (other.getDeploymentGroupsInfo() == null ^ this.getDeploymentGroupsInfo() == null)
            return false;
        if (other.getDeploymentGroupsInfo() != null && other.getDeploymentGroupsInfo().equals(this.getDeploymentGroupsInfo()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentGroupsInfo() == null) ? 0 : getDeploymentGroupsInfo().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDeploymentGroupsResult clone() {
        try {
            return (BatchGetDeploymentGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
