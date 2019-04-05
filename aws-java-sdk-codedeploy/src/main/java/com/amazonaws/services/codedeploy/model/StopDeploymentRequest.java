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
 * Represents the input of a StopDeployment operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/StopDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the
     * previous version of the application revision.
     * </p>
     */
    private Boolean autoRollbackEnabled;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the
     * previous version of the application revision.
     * </p>
     * 
     * @param autoRollbackEnabled
     *        Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to
     *        the previous version of the application revision.
     */

    public void setAutoRollbackEnabled(Boolean autoRollbackEnabled) {
        this.autoRollbackEnabled = autoRollbackEnabled;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the
     * previous version of the application revision.
     * </p>
     * 
     * @return Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back
     *         to the previous version of the application revision.
     */

    public Boolean getAutoRollbackEnabled() {
        return this.autoRollbackEnabled;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the
     * previous version of the application revision.
     * </p>
     * 
     * @param autoRollbackEnabled
     *        Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to
     *        the previous version of the application revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentRequest withAutoRollbackEnabled(Boolean autoRollbackEnabled) {
        setAutoRollbackEnabled(autoRollbackEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the
     * previous version of the application revision.
     * </p>
     * 
     * @return Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back
     *         to the previous version of the application revision.
     */

    public Boolean isAutoRollbackEnabled() {
        return this.autoRollbackEnabled;
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
        if (getAutoRollbackEnabled() != null)
            sb.append("AutoRollbackEnabled: ").append(getAutoRollbackEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDeploymentRequest == false)
            return false;
        StopDeploymentRequest other = (StopDeploymentRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getAutoRollbackEnabled() == null ^ this.getAutoRollbackEnabled() == null)
            return false;
        if (other.getAutoRollbackEnabled() != null && other.getAutoRollbackEnabled().equals(this.getAutoRollbackEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackEnabled() == null) ? 0 : getAutoRollbackEnabled().hashCode());
        return hashCode;
    }

    @Override
    public StopDeploymentRequest clone() {
        return (StopDeploymentRequest) super.clone();
    }

}
