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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /** The ID of the deployment if you wish to redeploy a previous deployment. */
    private String deploymentId;
    /**
     * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are
     * valid.
     */
    private String deploymentType;
    /** The ID of the Greengrass group. */
    private String groupId;
    /** The ID of the group version to be deployed. */
    private String groupVersionId;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * The ID of the deployment if you wish to redeploy a previous deployment.
     * 
     * @param deploymentId
     *        The ID of the deployment if you wish to redeploy a previous deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * The ID of the deployment if you wish to redeploy a previous deployment.
     * 
     * @return The ID of the deployment if you wish to redeploy a previous deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * The ID of the deployment if you wish to redeploy a previous deployment.
     * 
     * @param deploymentId
     *        The ID of the deployment if you wish to redeploy a previous deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are
     * valid.
     * 
     * @param deploymentType
     *        The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment''
     *        are valid.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are
     * valid.
     * 
     * @return The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment''
     *         are valid.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are
     * valid.
     * 
     * @param deploymentType
     *        The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment''
     *        are valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public CreateDeploymentRequest withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are
     * valid.
     * 
     * @param deploymentType
     *        The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment''
     *        are valid.
     * @see DeploymentType
     */

    public void setDeploymentType(DeploymentType deploymentType) {
        withDeploymentType(deploymentType);
    }

    /**
     * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are
     * valid.
     * 
     * @param deploymentType
     *        The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment''
     *        are valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public CreateDeploymentRequest withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @return The ID of the Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * The ID of the group version to be deployed.
     * 
     * @param groupVersionId
     *        The ID of the group version to be deployed.
     */

    public void setGroupVersionId(String groupVersionId) {
        this.groupVersionId = groupVersionId;
    }

    /**
     * The ID of the group version to be deployed.
     * 
     * @return The ID of the group version to be deployed.
     */

    public String getGroupVersionId() {
        return this.groupVersionId;
    }

    /**
     * The ID of the group version to be deployed.
     * 
     * @param groupVersionId
     *        The ID of the group version to be deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withGroupVersionId(String groupVersionId) {
        setGroupVersionId(groupVersionId);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupVersionId() != null)
            sb.append("GroupVersionId: ").append(getGroupVersionId());
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
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupVersionId() == null ^ this.getGroupVersionId() == null)
            return false;
        if (other.getGroupVersionId() != null && other.getGroupVersionId().equals(this.getGroupVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupVersionId() == null) ? 0 : getGroupVersionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
