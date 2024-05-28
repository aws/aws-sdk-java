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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes workload data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/WorkloadDataSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadDataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of the workload data.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;

    /**
     * <p>
     * The display name of the workload data.
     * </p>
     * 
     * @param displayName
     *        The display name of the workload data.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the workload data.
     * </p>
     * 
     * @return The display name of the workload data.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the workload data.
     * </p>
     * 
     * @param displayName
     *        The display name of the workload data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDataSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @return The name of the workload.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDataSummary withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadDataSummary == false)
            return false;
        WorkloadDataSummary other = (WorkloadDataSummary) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadDataSummary clone() {
        try {
            return (WorkloadDataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.WorkloadDataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
