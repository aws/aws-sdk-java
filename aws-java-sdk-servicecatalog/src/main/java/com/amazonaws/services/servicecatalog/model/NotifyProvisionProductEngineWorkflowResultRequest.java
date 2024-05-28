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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/NotifyProvisionProductEngineWorkflowResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyProvisionProductEngineWorkflowResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     * Terraform product provisioning workflow starts.
     * </p>
     */
    private String workflowToken;
    /**
     * <p>
     * The identifier of the record.
     * </p>
     */
    private String recordId;
    /**
     * <p>
     * The status of the provisioning engine execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason why the provisioning engine execution failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The ID for the provisioned product resources that are part of a resource group.
     * </p>
     */
    private EngineWorkflowResourceIdentifier resourceIdentifier;
    /**
     * <p>
     * The output of the provisioning engine execution.
     * </p>
     */
    private java.util.List<RecordOutput> outputs;
    /**
     * <p>
     * The idempotency token that identifies the provisioning engine execution.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     * Terraform product provisioning workflow starts.
     * </p>
     * 
     * @param workflowToken
     *        The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     *        Terraform product provisioning workflow starts.
     */

    public void setWorkflowToken(String workflowToken) {
        this.workflowToken = workflowToken;
    }

    /**
     * <p>
     * The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     * Terraform product provisioning workflow starts.
     * </p>
     * 
     * @return The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     *         Terraform product provisioning workflow starts.
     */

    public String getWorkflowToken() {
        return this.workflowToken;
    }

    /**
     * <p>
     * The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     * Terraform product provisioning workflow starts.
     * </p>
     * 
     * @param workflowToken
     *        The encrypted contents of the provisioning engine execution payload that Service Catalog sends after the
     *        Terraform product provisioning workflow starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withWorkflowToken(String workflowToken) {
        setWorkflowToken(workflowToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the record.
     */

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @return The identifier of the record.
     */

    public String getRecordId() {
        return this.recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withRecordId(String recordId) {
        setRecordId(recordId);
        return this;
    }

    /**
     * <p>
     * The status of the provisioning engine execution.
     * </p>
     * 
     * @param status
     *        The status of the provisioning engine execution.
     * @see EngineWorkflowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the provisioning engine execution.
     * </p>
     * 
     * @return The status of the provisioning engine execution.
     * @see EngineWorkflowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the provisioning engine execution.
     * </p>
     * 
     * @param status
     *        The status of the provisioning engine execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineWorkflowStatus
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the provisioning engine execution.
     * </p>
     * 
     * @param status
     *        The status of the provisioning engine execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineWorkflowStatus
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withStatus(EngineWorkflowStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the provisioning engine execution failed.
     * </p>
     * 
     * @param failureReason
     *        The reason why the provisioning engine execution failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the provisioning engine execution failed.
     * </p>
     * 
     * @return The reason why the provisioning engine execution failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the provisioning engine execution failed.
     * </p>
     * 
     * @param failureReason
     *        The reason why the provisioning engine execution failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The ID for the provisioned product resources that are part of a resource group.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ID for the provisioned product resources that are part of a resource group.
     */

    public void setResourceIdentifier(EngineWorkflowResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ID for the provisioned product resources that are part of a resource group.
     * </p>
     * 
     * @return The ID for the provisioned product resources that are part of a resource group.
     */

    public EngineWorkflowResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ID for the provisioned product resources that are part of a resource group.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ID for the provisioned product resources that are part of a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withResourceIdentifier(EngineWorkflowResourceIdentifier resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The output of the provisioning engine execution.
     * </p>
     * 
     * @return The output of the provisioning engine execution.
     */

    public java.util.List<RecordOutput> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The output of the provisioning engine execution.
     * </p>
     * 
     * @param outputs
     *        The output of the provisioning engine execution.
     */

    public void setOutputs(java.util.Collection<RecordOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<RecordOutput>(outputs);
    }

    /**
     * <p>
     * The output of the provisioning engine execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The output of the provisioning engine execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withOutputs(RecordOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<RecordOutput>(outputs.length));
        }
        for (RecordOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output of the provisioning engine execution.
     * </p>
     * 
     * @param outputs
     *        The output of the provisioning engine execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withOutputs(java.util.Collection<RecordOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The idempotency token that identifies the provisioning engine execution.
     * </p>
     * 
     * @param idempotencyToken
     *        The idempotency token that identifies the provisioning engine execution.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * The idempotency token that identifies the provisioning engine execution.
     * </p>
     * 
     * @return The idempotency token that identifies the provisioning engine execution.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * The idempotency token that identifies the provisioning engine execution.
     * </p>
     * 
     * @param idempotencyToken
     *        The idempotency token that identifies the provisioning engine execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyProvisionProductEngineWorkflowResultRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getWorkflowToken() != null)
            sb.append("WorkflowToken: ").append(getWorkflowToken()).append(",");
        if (getRecordId() != null)
            sb.append("RecordId: ").append(getRecordId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyProvisionProductEngineWorkflowResultRequest == false)
            return false;
        NotifyProvisionProductEngineWorkflowResultRequest other = (NotifyProvisionProductEngineWorkflowResultRequest) obj;
        if (other.getWorkflowToken() == null ^ this.getWorkflowToken() == null)
            return false;
        if (other.getWorkflowToken() != null && other.getWorkflowToken().equals(this.getWorkflowToken()) == false)
            return false;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowToken() == null) ? 0 : getWorkflowToken().hashCode());
        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public NotifyProvisionProductEngineWorkflowResultRequest clone() {
        return (NotifyProvisionProductEngineWorkflowResultRequest) super.clone();
    }

}
