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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that allows you to choose how you want to update the databases on a cluster. Depending on the
 * option you choose, you can reduce the time it takes to update the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDeploymentConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDeploymentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of deployment that you want on a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process with
     * updated configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_RESTART – This option updates the cluster without stopping the running q process. It is only available for
     * <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update configuration
     * on a cluster.
     * </p>
     * <p>
     * With this deployment mode, you cannot update the <code>initializationScript</code> and
     * <code>commandLineArguments</code> parameters.
     * </p>
     * </li>
     * </ul>
     */
    private String deploymentStrategy;

    /**
     * <p>
     * The type of deployment that you want on a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process with
     * updated configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_RESTART – This option updates the cluster without stopping the running q process. It is only available for
     * <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update configuration
     * on a cluster.
     * </p>
     * <p>
     * With this deployment mode, you cannot update the <code>initializationScript</code> and
     * <code>commandLineArguments</code> parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStrategy
     *        The type of deployment that you want on a cluster. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process
     *        with updated configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_RESTART – This option updates the cluster without stopping the running q process. It is only available
     *        for <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update
     *        configuration on a cluster.
     *        </p>
     *        <p>
     *        With this deployment mode, you cannot update the <code>initializationScript</code> and
     *        <code>commandLineArguments</code> parameters.
     *        </p>
     *        </li>
     * @see KxDeploymentStrategy
     */

    public void setDeploymentStrategy(String deploymentStrategy) {
        this.deploymentStrategy = deploymentStrategy;
    }

    /**
     * <p>
     * The type of deployment that you want on a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process with
     * updated configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_RESTART – This option updates the cluster without stopping the running q process. It is only available for
     * <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update configuration
     * on a cluster.
     * </p>
     * <p>
     * With this deployment mode, you cannot update the <code>initializationScript</code> and
     * <code>commandLineArguments</code> parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of deployment that you want on a cluster. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process
     *         with updated configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NO_RESTART – This option updates the cluster without stopping the running q process. It is only available
     *         for <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update
     *         configuration on a cluster.
     *         </p>
     *         <p>
     *         With this deployment mode, you cannot update the <code>initializationScript</code> and
     *         <code>commandLineArguments</code> parameters.
     *         </p>
     *         </li>
     * @see KxDeploymentStrategy
     */

    public String getDeploymentStrategy() {
        return this.deploymentStrategy;
    }

    /**
     * <p>
     * The type of deployment that you want on a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process with
     * updated configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_RESTART – This option updates the cluster without stopping the running q process. It is only available for
     * <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update configuration
     * on a cluster.
     * </p>
     * <p>
     * With this deployment mode, you cannot update the <code>initializationScript</code> and
     * <code>commandLineArguments</code> parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStrategy
     *        The type of deployment that you want on a cluster. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process
     *        with updated configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_RESTART – This option updates the cluster without stopping the running q process. It is only available
     *        for <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update
     *        configuration on a cluster.
     *        </p>
     *        <p>
     *        With this deployment mode, you cannot update the <code>initializationScript</code> and
     *        <code>commandLineArguments</code> parameters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxDeploymentStrategy
     */

    public KxDeploymentConfiguration withDeploymentStrategy(String deploymentStrategy) {
        setDeploymentStrategy(deploymentStrategy);
        return this;
    }

    /**
     * <p>
     * The type of deployment that you want on a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process with
     * updated configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_RESTART – This option updates the cluster without stopping the running q process. It is only available for
     * <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update configuration
     * on a cluster.
     * </p>
     * <p>
     * With this deployment mode, you cannot update the <code>initializationScript</code> and
     * <code>commandLineArguments</code> parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStrategy
     *        The type of deployment that you want on a cluster. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ROLLING – This options updates the cluster by stopping the exiting q process and starting a new q process
     *        with updated configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_RESTART – This option updates the cluster without stopping the running q process. It is only available
     *        for <code>HDB</code> type cluster. This option is quicker as it reduces the turn around time to update
     *        configuration on a cluster.
     *        </p>
     *        <p>
     *        With this deployment mode, you cannot update the <code>initializationScript</code> and
     *        <code>commandLineArguments</code> parameters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxDeploymentStrategy
     */

    public KxDeploymentConfiguration withDeploymentStrategy(KxDeploymentStrategy deploymentStrategy) {
        this.deploymentStrategy = deploymentStrategy.toString();
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
        if (getDeploymentStrategy() != null)
            sb.append("DeploymentStrategy: ").append(getDeploymentStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDeploymentConfiguration == false)
            return false;
        KxDeploymentConfiguration other = (KxDeploymentConfiguration) obj;
        if (other.getDeploymentStrategy() == null ^ this.getDeploymentStrategy() == null)
            return false;
        if (other.getDeploymentStrategy() != null && other.getDeploymentStrategy().equals(this.getDeploymentStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentStrategy() == null) ? 0 : getDeploymentStrategy().hashCode());
        return hashCode;
    }

    @Override
    public KxDeploymentConfiguration clone() {
        try {
            return (KxDeploymentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDeploymentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
