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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Input for Update Workload Share
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkloadShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkloadShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String workloadId;

    private WorkloadShare workloadShare;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadShareResult withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param workloadShare
     */

    public void setWorkloadShare(WorkloadShare workloadShare) {
        this.workloadShare = workloadShare;
    }

    /**
     * @return
     */

    public WorkloadShare getWorkloadShare() {
        return this.workloadShare;
    }

    /**
     * @param workloadShare
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadShareResult withWorkloadShare(WorkloadShare workloadShare) {
        setWorkloadShare(workloadShare);
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
        if (getWorkloadShare() != null)
            sb.append("WorkloadShare: ").append(getWorkloadShare());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkloadShareResult == false)
            return false;
        UpdateWorkloadShareResult other = (UpdateWorkloadShareResult) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadShare() == null ^ this.getWorkloadShare() == null)
            return false;
        if (other.getWorkloadShare() != null && other.getWorkloadShare().equals(this.getWorkloadShare()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadShare() == null) ? 0 : getWorkloadShare().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkloadShareResult clone() {
        try {
            return (UpdateWorkloadShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
