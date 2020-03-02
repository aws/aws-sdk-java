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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/StartSimulationJobBatch" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSimulationJobBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The batch policy.
     * </p>
     */
    private BatchPolicy batchPolicy;
    /**
     * <p>
     * A list of simulation job requests to create in the batch.
     * </p>
     */
    private java.util.List<SimulationJobRequest> createSimulationJobRequests;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The batch policy.
     * </p>
     * 
     * @param batchPolicy
     *        The batch policy.
     */

    public void setBatchPolicy(BatchPolicy batchPolicy) {
        this.batchPolicy = batchPolicy;
    }

    /**
     * <p>
     * The batch policy.
     * </p>
     * 
     * @return The batch policy.
     */

    public BatchPolicy getBatchPolicy() {
        return this.batchPolicy;
    }

    /**
     * <p>
     * The batch policy.
     * </p>
     * 
     * @param batchPolicy
     *        The batch policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest withBatchPolicy(BatchPolicy batchPolicy) {
        setBatchPolicy(batchPolicy);
        return this;
    }

    /**
     * <p>
     * A list of simulation job requests to create in the batch.
     * </p>
     * 
     * @return A list of simulation job requests to create in the batch.
     */

    public java.util.List<SimulationJobRequest> getCreateSimulationJobRequests() {
        return createSimulationJobRequests;
    }

    /**
     * <p>
     * A list of simulation job requests to create in the batch.
     * </p>
     * 
     * @param createSimulationJobRequests
     *        A list of simulation job requests to create in the batch.
     */

    public void setCreateSimulationJobRequests(java.util.Collection<SimulationJobRequest> createSimulationJobRequests) {
        if (createSimulationJobRequests == null) {
            this.createSimulationJobRequests = null;
            return;
        }

        this.createSimulationJobRequests = new java.util.ArrayList<SimulationJobRequest>(createSimulationJobRequests);
    }

    /**
     * <p>
     * A list of simulation job requests to create in the batch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateSimulationJobRequests(java.util.Collection)} or
     * {@link #withCreateSimulationJobRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createSimulationJobRequests
     *        A list of simulation job requests to create in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest withCreateSimulationJobRequests(SimulationJobRequest... createSimulationJobRequests) {
        if (this.createSimulationJobRequests == null) {
            setCreateSimulationJobRequests(new java.util.ArrayList<SimulationJobRequest>(createSimulationJobRequests.length));
        }
        for (SimulationJobRequest ele : createSimulationJobRequests) {
            this.createSimulationJobRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of simulation job requests to create in the batch.
     * </p>
     * 
     * @param createSimulationJobRequests
     *        A list of simulation job requests to create in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest withCreateSimulationJobRequests(java.util.Collection<SimulationJobRequest> createSimulationJobRequests) {
        setCreateSimulationJobRequests(createSimulationJobRequests);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the deployment job batch.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the deployment job batch.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job batch.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the deployment job batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartSimulationJobBatchRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSimulationJobBatchRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getBatchPolicy() != null)
            sb.append("BatchPolicy: ").append(getBatchPolicy()).append(",");
        if (getCreateSimulationJobRequests() != null)
            sb.append("CreateSimulationJobRequests: ").append(getCreateSimulationJobRequests()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSimulationJobBatchRequest == false)
            return false;
        StartSimulationJobBatchRequest other = (StartSimulationJobBatchRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getBatchPolicy() == null ^ this.getBatchPolicy() == null)
            return false;
        if (other.getBatchPolicy() != null && other.getBatchPolicy().equals(this.getBatchPolicy()) == false)
            return false;
        if (other.getCreateSimulationJobRequests() == null ^ this.getCreateSimulationJobRequests() == null)
            return false;
        if (other.getCreateSimulationJobRequests() != null && other.getCreateSimulationJobRequests().equals(this.getCreateSimulationJobRequests()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getBatchPolicy() == null) ? 0 : getBatchPolicy().hashCode());
        hashCode = prime * hashCode + ((getCreateSimulationJobRequests() == null) ? 0 : getCreateSimulationJobRequests().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartSimulationJobBatchRequest clone() {
        return (StartSimulationJobBatchRequest) super.clone();
    }

}
