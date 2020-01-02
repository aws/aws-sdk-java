/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the resources to deploy for a monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing job.
     * </p>
     */
    private MonitoringClusterConfig clusterConfig;

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing job.
     * </p>
     * 
     * @param clusterConfig
     *        The configuration for the cluster resources used to run the processing job.
     */

    public void setClusterConfig(MonitoringClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing job.
     * </p>
     * 
     * @return The configuration for the cluster resources used to run the processing job.
     */

    public MonitoringClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing job.
     * </p>
     * 
     * @param clusterConfig
     *        The configuration for the cluster resources used to run the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringResources withClusterConfig(MonitoringClusterConfig clusterConfig) {
        setClusterConfig(clusterConfig);
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
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringResources == false)
            return false;
        MonitoringResources other = (MonitoringResources) obj;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringResources clone() {
        try {
            return (MonitoringResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
