/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     */
    private String iotJobId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     */
    private String iotJobArn;

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @return The ID of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobId
     *        The ID of the AWS IoT job that applies the deployment to target devices.
     */

    public void setIotJobId(String iotJobId) {
        this.iotJobId = iotJobId;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @return The ID of the AWS IoT job that applies the deployment to target devices.
     */

    public String getIotJobId() {
        return this.iotJobId;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobId
     *        The ID of the AWS IoT job that applies the deployment to target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult withIotJobId(String iotJobId) {
        setIotJobId(iotJobId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT job that applies the deployment to target devices.
     */

    public void setIotJobArn(String iotJobArn) {
        this.iotJobArn = iotJobArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         AWS IoT job that applies the deployment to target devices.
     */

    public String getIotJobArn() {
        return this.iotJobArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT job that applies the deployment to target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult withIotJobArn(String iotJobArn) {
        setIotJobArn(iotJobArn);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getIotJobId() != null)
            sb.append("IotJobId: ").append(getIotJobId()).append(",");
        if (getIotJobArn() != null)
            sb.append("IotJobArn: ").append(getIotJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentResult == false)
            return false;
        CreateDeploymentResult other = (CreateDeploymentResult) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getIotJobId() == null ^ this.getIotJobId() == null)
            return false;
        if (other.getIotJobId() != null && other.getIotJobId().equals(this.getIotJobId()) == false)
            return false;
        if (other.getIotJobArn() == null ^ this.getIotJobArn() == null)
            return false;
        if (other.getIotJobArn() != null && other.getIotJobArn().equals(this.getIotJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getIotJobId() == null) ? 0 : getIotJobId().hashCode());
        hashCode = prime * hashCode + ((getIotJobArn() == null) ? 0 : getIotJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentResult clone() {
        try {
            return (CreateDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
