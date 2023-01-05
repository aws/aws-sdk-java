/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CPU and memory recommendations for a container within the tasks of your Amazon ECS service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ContainerRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The recommended memory size configurations for the container.
     * </p>
     */
    private MemorySizeConfiguration memorySizeConfiguration;
    /**
     * <p>
     * The recommended number of CPU units reserved for the container.
     * </p>
     */
    private Integer cpu;

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecommendation withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The recommended memory size configurations for the container.
     * </p>
     * 
     * @param memorySizeConfiguration
     *        The recommended memory size configurations for the container.
     */

    public void setMemorySizeConfiguration(MemorySizeConfiguration memorySizeConfiguration) {
        this.memorySizeConfiguration = memorySizeConfiguration;
    }

    /**
     * <p>
     * The recommended memory size configurations for the container.
     * </p>
     * 
     * @return The recommended memory size configurations for the container.
     */

    public MemorySizeConfiguration getMemorySizeConfiguration() {
        return this.memorySizeConfiguration;
    }

    /**
     * <p>
     * The recommended memory size configurations for the container.
     * </p>
     * 
     * @param memorySizeConfiguration
     *        The recommended memory size configurations for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecommendation withMemorySizeConfiguration(MemorySizeConfiguration memorySizeConfiguration) {
        setMemorySizeConfiguration(memorySizeConfiguration);
        return this;
    }

    /**
     * <p>
     * The recommended number of CPU units reserved for the container.
     * </p>
     * 
     * @param cpu
     *        The recommended number of CPU units reserved for the container.
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The recommended number of CPU units reserved for the container.
     * </p>
     * 
     * @return The recommended number of CPU units reserved for the container.
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The recommended number of CPU units reserved for the container.
     * </p>
     * 
     * @param cpu
     *        The recommended number of CPU units reserved for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecommendation withCpu(Integer cpu) {
        setCpu(cpu);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getMemorySizeConfiguration() != null)
            sb.append("MemorySizeConfiguration: ").append(getMemorySizeConfiguration()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerRecommendation == false)
            return false;
        ContainerRecommendation other = (ContainerRecommendation) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getMemorySizeConfiguration() == null ^ this.getMemorySizeConfiguration() == null)
            return false;
        if (other.getMemorySizeConfiguration() != null && other.getMemorySizeConfiguration().equals(this.getMemorySizeConfiguration()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getMemorySizeConfiguration() == null) ? 0 : getMemorySizeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        return hashCode;
    }

    @Override
    public ContainerRecommendation clone() {
        try {
            return (ContainerRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ContainerRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
