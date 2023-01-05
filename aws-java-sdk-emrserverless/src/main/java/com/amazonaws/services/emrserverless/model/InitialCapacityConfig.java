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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The initial capacity configuration per worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/InitialCapacityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitialCapacityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of workers in the initial capacity configuration.
     * </p>
     */
    private Long workerCount;
    /**
     * <p>
     * The resource configuration of the initial capacity configuration.
     * </p>
     */
    private WorkerResourceConfig workerConfiguration;

    /**
     * <p>
     * The number of workers in the initial capacity configuration.
     * </p>
     * 
     * @param workerCount
     *        The number of workers in the initial capacity configuration.
     */

    public void setWorkerCount(Long workerCount) {
        this.workerCount = workerCount;
    }

    /**
     * <p>
     * The number of workers in the initial capacity configuration.
     * </p>
     * 
     * @return The number of workers in the initial capacity configuration.
     */

    public Long getWorkerCount() {
        return this.workerCount;
    }

    /**
     * <p>
     * The number of workers in the initial capacity configuration.
     * </p>
     * 
     * @param workerCount
     *        The number of workers in the initial capacity configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitialCapacityConfig withWorkerCount(Long workerCount) {
        setWorkerCount(workerCount);
        return this;
    }

    /**
     * <p>
     * The resource configuration of the initial capacity configuration.
     * </p>
     * 
     * @param workerConfiguration
     *        The resource configuration of the initial capacity configuration.
     */

    public void setWorkerConfiguration(WorkerResourceConfig workerConfiguration) {
        this.workerConfiguration = workerConfiguration;
    }

    /**
     * <p>
     * The resource configuration of the initial capacity configuration.
     * </p>
     * 
     * @return The resource configuration of the initial capacity configuration.
     */

    public WorkerResourceConfig getWorkerConfiguration() {
        return this.workerConfiguration;
    }

    /**
     * <p>
     * The resource configuration of the initial capacity configuration.
     * </p>
     * 
     * @param workerConfiguration
     *        The resource configuration of the initial capacity configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitialCapacityConfig withWorkerConfiguration(WorkerResourceConfig workerConfiguration) {
        setWorkerConfiguration(workerConfiguration);
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
        if (getWorkerCount() != null)
            sb.append("WorkerCount: ").append(getWorkerCount()).append(",");
        if (getWorkerConfiguration() != null)
            sb.append("WorkerConfiguration: ").append(getWorkerConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitialCapacityConfig == false)
            return false;
        InitialCapacityConfig other = (InitialCapacityConfig) obj;
        if (other.getWorkerCount() == null ^ this.getWorkerCount() == null)
            return false;
        if (other.getWorkerCount() != null && other.getWorkerCount().equals(this.getWorkerCount()) == false)
            return false;
        if (other.getWorkerConfiguration() == null ^ this.getWorkerConfiguration() == null)
            return false;
        if (other.getWorkerConfiguration() != null && other.getWorkerConfiguration().equals(this.getWorkerConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerCount() == null) ? 0 : getWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getWorkerConfiguration() == null) ? 0 : getWorkerConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public InitialCapacityConfig clone() {
        try {
            return (InitialCapacityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.InitialCapacityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
