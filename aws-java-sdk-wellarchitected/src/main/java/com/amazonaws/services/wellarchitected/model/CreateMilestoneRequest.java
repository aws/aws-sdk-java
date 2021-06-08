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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for milestone creation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateMilestone" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMilestoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String milestoneName;

    private String clientRequestToken;

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

    public CreateMilestoneRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param milestoneName
     */

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    /**
     * @return
     */

    public String getMilestoneName() {
        return this.milestoneName;
    }

    /**
     * @param milestoneName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMilestoneRequest withMilestoneName(String milestoneName) {
        setMilestoneName(milestoneName);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMilestoneRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getMilestoneName() != null)
            sb.append("MilestoneName: ").append(getMilestoneName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMilestoneRequest == false)
            return false;
        CreateMilestoneRequest other = (CreateMilestoneRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getMilestoneName() == null ^ this.getMilestoneName() == null)
            return false;
        if (other.getMilestoneName() != null && other.getMilestoneName().equals(this.getMilestoneName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getMilestoneName() == null) ? 0 : getMilestoneName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateMilestoneRequest clone() {
        return (CreateMilestoneRequest) super.clone();
    }

}
