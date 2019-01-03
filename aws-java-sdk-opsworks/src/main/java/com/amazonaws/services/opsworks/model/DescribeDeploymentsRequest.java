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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID. If you include this parameter, the command returns a description of the commands associated with
     * the specified stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The app ID. If you include this parameter, the command returns a description of the commands associated with the
     * specified app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * An array of deployment IDs to be described. If you include this parameter, the command returns a description of
     * the specified deployments. Otherwise, it returns a description of every deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentIds;

    /**
     * <p>
     * The stack ID. If you include this parameter, the command returns a description of the commands associated with
     * the specified stack.
     * </p>
     * 
     * @param stackId
     *        The stack ID. If you include this parameter, the command returns a description of the commands associated
     *        with the specified stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID. If you include this parameter, the command returns a description of the commands associated with
     * the specified stack.
     * </p>
     * 
     * @return The stack ID. If you include this parameter, the command returns a description of the commands associated
     *         with the specified stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID. If you include this parameter, the command returns a description of the commands associated with
     * the specified stack.
     * </p>
     * 
     * @param stackId
     *        The stack ID. If you include this parameter, the command returns a description of the commands associated
     *        with the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeploymentsRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The app ID. If you include this parameter, the command returns a description of the commands associated with the
     * specified app.
     * </p>
     * 
     * @param appId
     *        The app ID. If you include this parameter, the command returns a description of the commands associated
     *        with the specified app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID. If you include this parameter, the command returns a description of the commands associated with the
     * specified app.
     * </p>
     * 
     * @return The app ID. If you include this parameter, the command returns a description of the commands associated
     *         with the specified app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID. If you include this parameter, the command returns a description of the commands associated with the
     * specified app.
     * </p>
     * 
     * @param appId
     *        The app ID. If you include this parameter, the command returns a description of the commands associated
     *        with the specified app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeploymentsRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * An array of deployment IDs to be described. If you include this parameter, the command returns a description of
     * the specified deployments. Otherwise, it returns a description of every deployment.
     * </p>
     * 
     * @return An array of deployment IDs to be described. If you include this parameter, the command returns a
     *         description of the specified deployments. Otherwise, it returns a description of every deployment.
     */

    public java.util.List<String> getDeploymentIds() {
        if (deploymentIds == null) {
            deploymentIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentIds;
    }

    /**
     * <p>
     * An array of deployment IDs to be described. If you include this parameter, the command returns a description of
     * the specified deployments. Otherwise, it returns a description of every deployment.
     * </p>
     * 
     * @param deploymentIds
     *        An array of deployment IDs to be described. If you include this parameter, the command returns a
     *        description of the specified deployments. Otherwise, it returns a description of every deployment.
     */

    public void setDeploymentIds(java.util.Collection<String> deploymentIds) {
        if (deploymentIds == null) {
            this.deploymentIds = null;
            return;
        }

        this.deploymentIds = new com.amazonaws.internal.SdkInternalList<String>(deploymentIds);
    }

    /**
     * <p>
     * An array of deployment IDs to be described. If you include this parameter, the command returns a description of
     * the specified deployments. Otherwise, it returns a description of every deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentIds(java.util.Collection)} or {@link #withDeploymentIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param deploymentIds
     *        An array of deployment IDs to be described. If you include this parameter, the command returns a
     *        description of the specified deployments. Otherwise, it returns a description of every deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeploymentsRequest withDeploymentIds(String... deploymentIds) {
        if (this.deploymentIds == null) {
            setDeploymentIds(new com.amazonaws.internal.SdkInternalList<String>(deploymentIds.length));
        }
        for (String ele : deploymentIds) {
            this.deploymentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of deployment IDs to be described. If you include this parameter, the command returns a description of
     * the specified deployments. Otherwise, it returns a description of every deployment.
     * </p>
     * 
     * @param deploymentIds
     *        An array of deployment IDs to be described. If you include this parameter, the command returns a
     *        description of the specified deployments. Otherwise, it returns a description of every deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeploymentsRequest withDeploymentIds(java.util.Collection<String> deploymentIds) {
        setDeploymentIds(deploymentIds);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getDeploymentIds() != null)
            sb.append("DeploymentIds: ").append(getDeploymentIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeploymentsRequest == false)
            return false;
        DescribeDeploymentsRequest other = (DescribeDeploymentsRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getDeploymentIds() == null ^ this.getDeploymentIds() == null)
            return false;
        if (other.getDeploymentIds() != null && other.getDeploymentIds().equals(this.getDeploymentIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentIds() == null) ? 0 : getDeploymentIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeploymentsRequest clone() {
        return (DescribeDeploymentsRequest) super.clone();
    }

}
