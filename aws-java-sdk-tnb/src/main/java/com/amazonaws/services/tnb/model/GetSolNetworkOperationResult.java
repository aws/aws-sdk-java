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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkOperationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network operation ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Error related to this specific network operation occurrence.
     * </p>
     */
    private ProblemDetails error;
    /**
     * <p>
     * ID of this network operation occurrence.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Type of the operation represented by this occurrence.
     * </p>
     */
    private String lcmOperationType;
    /**
     * <p>
     * Metadata of this network operation occurrence.
     * </p>
     */
    private GetSolNetworkOperationMetadata metadata;
    /**
     * <p>
     * ID of the network operation instance.
     * </p>
     */
    private String nsInstanceId;
    /**
     * <p>
     * The state of the network operation.
     * </p>
     */
    private String operationState;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * All tasks associated with this operation occurrence.
     * </p>
     */
    private java.util.List<GetSolNetworkOperationTaskDetails> tasks;

    /**
     * <p>
     * Network operation ARN.
     * </p>
     * 
     * @param arn
     *        Network operation ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network operation ARN.
     * </p>
     * 
     * @return Network operation ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network operation ARN.
     * </p>
     * 
     * @param arn
     *        Network operation ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Error related to this specific network operation occurrence.
     * </p>
     * 
     * @param error
     *        Error related to this specific network operation occurrence.
     */

    public void setError(ProblemDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * Error related to this specific network operation occurrence.
     * </p>
     * 
     * @return Error related to this specific network operation occurrence.
     */

    public ProblemDetails getError() {
        return this.error;
    }

    /**
     * <p>
     * Error related to this specific network operation occurrence.
     * </p>
     * 
     * @param error
     *        Error related to this specific network operation occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withError(ProblemDetails error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * ID of this network operation occurrence.
     * </p>
     * 
     * @param id
     *        ID of this network operation occurrence.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of this network operation occurrence.
     * </p>
     * 
     * @return ID of this network operation occurrence.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of this network operation occurrence.
     * </p>
     * 
     * @param id
     *        ID of this network operation occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Type of the operation represented by this occurrence.
     * </p>
     * 
     * @param lcmOperationType
     *        Type of the operation represented by this occurrence.
     * @see LcmOperationType
     */

    public void setLcmOperationType(String lcmOperationType) {
        this.lcmOperationType = lcmOperationType;
    }

    /**
     * <p>
     * Type of the operation represented by this occurrence.
     * </p>
     * 
     * @return Type of the operation represented by this occurrence.
     * @see LcmOperationType
     */

    public String getLcmOperationType() {
        return this.lcmOperationType;
    }

    /**
     * <p>
     * Type of the operation represented by this occurrence.
     * </p>
     * 
     * @param lcmOperationType
     *        Type of the operation represented by this occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LcmOperationType
     */

    public GetSolNetworkOperationResult withLcmOperationType(String lcmOperationType) {
        setLcmOperationType(lcmOperationType);
        return this;
    }

    /**
     * <p>
     * Type of the operation represented by this occurrence.
     * </p>
     * 
     * @param lcmOperationType
     *        Type of the operation represented by this occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LcmOperationType
     */

    public GetSolNetworkOperationResult withLcmOperationType(LcmOperationType lcmOperationType) {
        this.lcmOperationType = lcmOperationType.toString();
        return this;
    }

    /**
     * <p>
     * Metadata of this network operation occurrence.
     * </p>
     * 
     * @param metadata
     *        Metadata of this network operation occurrence.
     */

    public void setMetadata(GetSolNetworkOperationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata of this network operation occurrence.
     * </p>
     * 
     * @return Metadata of this network operation occurrence.
     */

    public GetSolNetworkOperationMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata of this network operation occurrence.
     * </p>
     * 
     * @param metadata
     *        Metadata of this network operation occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withMetadata(GetSolNetworkOperationMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * ID of the network operation instance.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network operation instance.
     */

    public void setNsInstanceId(String nsInstanceId) {
        this.nsInstanceId = nsInstanceId;
    }

    /**
     * <p>
     * ID of the network operation instance.
     * </p>
     * 
     * @return ID of the network operation instance.
     */

    public String getNsInstanceId() {
        return this.nsInstanceId;
    }

    /**
     * <p>
     * ID of the network operation instance.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network operation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
        return this;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @param operationState
     *        The state of the network operation.
     * @see NsLcmOperationState
     */

    public void setOperationState(String operationState) {
        this.operationState = operationState;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @return The state of the network operation.
     * @see NsLcmOperationState
     */

    public String getOperationState() {
        return this.operationState;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @param operationState
     *        The state of the network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsLcmOperationState
     */

    public GetSolNetworkOperationResult withOperationState(String operationState) {
        setOperationState(operationState);
        return this;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @param operationState
     *        The state of the network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsLcmOperationState
     */

    public GetSolNetworkOperationResult withOperationState(NsLcmOperationState operationState) {
        this.operationState = operationState.toString();
        return this;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @return A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *         optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *         costs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSolNetworkOperationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult addTagsEntry(String key, String value) {
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

    public GetSolNetworkOperationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * All tasks associated with this operation occurrence.
     * </p>
     * 
     * @return All tasks associated with this operation occurrence.
     */

    public java.util.List<GetSolNetworkOperationTaskDetails> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * All tasks associated with this operation occurrence.
     * </p>
     * 
     * @param tasks
     *        All tasks associated with this operation occurrence.
     */

    public void setTasks(java.util.Collection<GetSolNetworkOperationTaskDetails> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<GetSolNetworkOperationTaskDetails>(tasks);
    }

    /**
     * <p>
     * All tasks associated with this operation occurrence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        All tasks associated with this operation occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withTasks(GetSolNetworkOperationTaskDetails... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<GetSolNetworkOperationTaskDetails>(tasks.length));
        }
        for (GetSolNetworkOperationTaskDetails ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All tasks associated with this operation occurrence.
     * </p>
     * 
     * @param tasks
     *        All tasks associated with this operation occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkOperationResult withTasks(java.util.Collection<GetSolNetworkOperationTaskDetails> tasks) {
        setTasks(tasks);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLcmOperationType() != null)
            sb.append("LcmOperationType: ").append(getLcmOperationType()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsInstanceId() != null)
            sb.append("NsInstanceId: ").append(getNsInstanceId()).append(",");
        if (getOperationState() != null)
            sb.append("OperationState: ").append(getOperationState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolNetworkOperationResult == false)
            return false;
        GetSolNetworkOperationResult other = (GetSolNetworkOperationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLcmOperationType() == null ^ this.getLcmOperationType() == null)
            return false;
        if (other.getLcmOperationType() != null && other.getLcmOperationType().equals(this.getLcmOperationType()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsInstanceId() == null ^ this.getNsInstanceId() == null)
            return false;
        if (other.getNsInstanceId() != null && other.getNsInstanceId().equals(this.getNsInstanceId()) == false)
            return false;
        if (other.getOperationState() == null ^ this.getOperationState() == null)
            return false;
        if (other.getOperationState() != null && other.getOperationState().equals(this.getOperationState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLcmOperationType() == null) ? 0 : getLcmOperationType().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceId() == null) ? 0 : getNsInstanceId().hashCode());
        hashCode = prime * hashCode + ((getOperationState() == null) ? 0 : getOperationState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        return hashCode;
    }

    @Override
    public GetSolNetworkOperationResult clone() {
        try {
            return (GetSolNetworkOperationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
