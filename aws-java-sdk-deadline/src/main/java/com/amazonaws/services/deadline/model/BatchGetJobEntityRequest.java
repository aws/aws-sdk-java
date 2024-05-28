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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BatchGetJobEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetJobEntityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The job identifiers to include within the job entity batch details.
     * </p>
     */
    private java.util.List<JobEntityIdentifiersUnion> identifiers;
    /**
     * <p>
     * The worker ID of the worker containing the job details to get.
     * </p>
     */
    private String workerId;

    /**
     * <p>
     * The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to
     *        fetch job details.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     * 
     * @return The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to
     *         fetch job details.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the worker that's fetching job details. The worker must have an assignment on a job to
     *        fetch job details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to
     *        fetch job details.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     * 
     * @return The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to
     *         fetch job details.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to fetch job
     * details.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID of the worker that's fetching job details. The worker must have an assignment on a job to
     *        fetch job details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The job identifiers to include within the job entity batch details.
     * </p>
     * 
     * @return The job identifiers to include within the job entity batch details.
     */

    public java.util.List<JobEntityIdentifiersUnion> getIdentifiers() {
        return identifiers;
    }

    /**
     * <p>
     * The job identifiers to include within the job entity batch details.
     * </p>
     * 
     * @param identifiers
     *        The job identifiers to include within the job entity batch details.
     */

    public void setIdentifiers(java.util.Collection<JobEntityIdentifiersUnion> identifiers) {
        if (identifiers == null) {
            this.identifiers = null;
            return;
        }

        this.identifiers = new java.util.ArrayList<JobEntityIdentifiersUnion>(identifiers);
    }

    /**
     * <p>
     * The job identifiers to include within the job entity batch details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentifiers(java.util.Collection)} or {@link #withIdentifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identifiers
     *        The job identifiers to include within the job entity batch details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityRequest withIdentifiers(JobEntityIdentifiersUnion... identifiers) {
        if (this.identifiers == null) {
            setIdentifiers(new java.util.ArrayList<JobEntityIdentifiersUnion>(identifiers.length));
        }
        for (JobEntityIdentifiersUnion ele : identifiers) {
            this.identifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The job identifiers to include within the job entity batch details.
     * </p>
     * 
     * @param identifiers
     *        The job identifiers to include within the job entity batch details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityRequest withIdentifiers(java.util.Collection<JobEntityIdentifiersUnion> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    /**
     * <p>
     * The worker ID of the worker containing the job details to get.
     * </p>
     * 
     * @param workerId
     *        The worker ID of the worker containing the job details to get.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The worker ID of the worker containing the job details to get.
     * </p>
     * 
     * @return The worker ID of the worker containing the job details to get.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The worker ID of the worker containing the job details to get.
     * </p>
     * 
     * @param workerId
     *        The worker ID of the worker containing the job details to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getIdentifiers() != null)
            sb.append("Identifiers: ").append(getIdentifiers()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetJobEntityRequest == false)
            return false;
        BatchGetJobEntityRequest other = (BatchGetJobEntityRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getIdentifiers() == null ^ this.getIdentifiers() == null)
            return false;
        if (other.getIdentifiers() != null && other.getIdentifiers().equals(this.getIdentifiers()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getIdentifiers() == null) ? 0 : getIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetJobEntityRequest clone() {
        return (BatchGetJobEntityRequest) super.clone();
    }

}
