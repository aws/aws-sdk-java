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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateWorkload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkloadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workload.
     * </p>
     */
    private String workloadId;
    /**
     * <p>
     * The configuration settings of the workload. The value is the escaped JSON of the configuration.
     * </p>
     */
    private WorkloadConfiguration workloadConfiguration;

    /**
     * <p>
     * The ID of the workload.
     * </p>
     * 
     * @param workloadId
     *        The ID of the workload.
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * <p>
     * The ID of the workload.
     * </p>
     * 
     * @return The ID of the workload.
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * <p>
     * The ID of the workload.
     * </p>
     * 
     * @param workloadId
     *        The ID of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadResult withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * <p>
     * The configuration settings of the workload. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @param workloadConfiguration
     *        The configuration settings of the workload. The value is the escaped JSON of the configuration.
     */

    public void setWorkloadConfiguration(WorkloadConfiguration workloadConfiguration) {
        this.workloadConfiguration = workloadConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the workload. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @return The configuration settings of the workload. The value is the escaped JSON of the configuration.
     */

    public WorkloadConfiguration getWorkloadConfiguration() {
        return this.workloadConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the workload. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @param workloadConfiguration
     *        The configuration settings of the workload. The value is the escaped JSON of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadResult withWorkloadConfiguration(WorkloadConfiguration workloadConfiguration) {
        setWorkloadConfiguration(workloadConfiguration);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadConfiguration() != null)
            sb.append("WorkloadConfiguration: ").append(getWorkloadConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkloadResult == false)
            return false;
        UpdateWorkloadResult other = (UpdateWorkloadResult) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadConfiguration() == null ^ this.getWorkloadConfiguration() == null)
            return false;
        if (other.getWorkloadConfiguration() != null && other.getWorkloadConfiguration().equals(this.getWorkloadConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadConfiguration() == null) ? 0 : getWorkloadConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkloadResult clone() {
        try {
            return (UpdateWorkloadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
