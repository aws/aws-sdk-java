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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeploymentConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     */
    private Integer concurrentDeploymentPercentage;
    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     */
    private Integer failureThresholdPercentage;

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     * 
     * @param concurrentDeploymentPercentage
     *        The percentage of robots receiving the deployment at the same time.
     */

    public void setConcurrentDeploymentPercentage(Integer concurrentDeploymentPercentage) {
        this.concurrentDeploymentPercentage = concurrentDeploymentPercentage;
    }

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     * 
     * @return The percentage of robots receiving the deployment at the same time.
     */

    public Integer getConcurrentDeploymentPercentage() {
        return this.concurrentDeploymentPercentage;
    }

    /**
     * <p>
     * The percentage of robots receiving the deployment at the same time.
     * </p>
     * 
     * @param concurrentDeploymentPercentage
     *        The percentage of robots receiving the deployment at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withConcurrentDeploymentPercentage(Integer concurrentDeploymentPercentage) {
        setConcurrentDeploymentPercentage(concurrentDeploymentPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     * 
     * @param failureThresholdPercentage
     *        The percentage of deployments that need to fail before stopping deployment.
     */

    public void setFailureThresholdPercentage(Integer failureThresholdPercentage) {
        this.failureThresholdPercentage = failureThresholdPercentage;
    }

    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     * 
     * @return The percentage of deployments that need to fail before stopping deployment.
     */

    public Integer getFailureThresholdPercentage() {
        return this.failureThresholdPercentage;
    }

    /**
     * <p>
     * The percentage of deployments that need to fail before stopping deployment.
     * </p>
     * 
     * @param failureThresholdPercentage
     *        The percentage of deployments that need to fail before stopping deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfig withFailureThresholdPercentage(Integer failureThresholdPercentage) {
        setFailureThresholdPercentage(failureThresholdPercentage);
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
        if (getConcurrentDeploymentPercentage() != null)
            sb.append("ConcurrentDeploymentPercentage: ").append(getConcurrentDeploymentPercentage()).append(",");
        if (getFailureThresholdPercentage() != null)
            sb.append("FailureThresholdPercentage: ").append(getFailureThresholdPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfig == false)
            return false;
        DeploymentConfig other = (DeploymentConfig) obj;
        if (other.getConcurrentDeploymentPercentage() == null ^ this.getConcurrentDeploymentPercentage() == null)
            return false;
        if (other.getConcurrentDeploymentPercentage() != null
                && other.getConcurrentDeploymentPercentage().equals(this.getConcurrentDeploymentPercentage()) == false)
            return false;
        if (other.getFailureThresholdPercentage() == null ^ this.getFailureThresholdPercentage() == null)
            return false;
        if (other.getFailureThresholdPercentage() != null && other.getFailureThresholdPercentage().equals(this.getFailureThresholdPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConcurrentDeploymentPercentage() == null) ? 0 : getConcurrentDeploymentPercentage().hashCode());
        hashCode = prime * hashCode + ((getFailureThresholdPercentage() == null) ? 0 : getFailureThresholdPercentage().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfig clone() {
        try {
            return (DeploymentConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.DeploymentConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
