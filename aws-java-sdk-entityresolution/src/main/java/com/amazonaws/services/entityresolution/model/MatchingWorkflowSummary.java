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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of <code>MatchingWorkflowSummary</code> objects, each of which contain the fields <code>WorkflowName</code>,
 * <code>WorkflowArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/MatchingWorkflowSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingWorkflowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The method that has been specified for data matching, either using matching provided by Entity Resolution or
     * through a provider service.
     * </p>
     */
    private String resolutionType;
    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     */
    private String workflowArn;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String workflowName;

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the workflow was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     * 
     * @return The timestamp of when the workflow was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingWorkflowSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The method that has been specified for data matching, either using matching provided by Entity Resolution or
     * through a provider service.
     * </p>
     * 
     * @param resolutionType
     *        The method that has been specified for data matching, either using matching provided by Entity Resolution
     *        or through a provider service.
     * @see ResolutionType
     */

    public void setResolutionType(String resolutionType) {
        this.resolutionType = resolutionType;
    }

    /**
     * <p>
     * The method that has been specified for data matching, either using matching provided by Entity Resolution or
     * through a provider service.
     * </p>
     * 
     * @return The method that has been specified for data matching, either using matching provided by Entity Resolution
     *         or through a provider service.
     * @see ResolutionType
     */

    public String getResolutionType() {
        return this.resolutionType;
    }

    /**
     * <p>
     * The method that has been specified for data matching, either using matching provided by Entity Resolution or
     * through a provider service.
     * </p>
     * 
     * @param resolutionType
     *        The method that has been specified for data matching, either using matching provided by Entity Resolution
     *        or through a provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionType
     */

    public MatchingWorkflowSummary withResolutionType(String resolutionType) {
        setResolutionType(resolutionType);
        return this;
    }

    /**
     * <p>
     * The method that has been specified for data matching, either using matching provided by Entity Resolution or
     * through a provider service.
     * </p>
     * 
     * @param resolutionType
     *        The method that has been specified for data matching, either using matching provided by Entity Resolution
     *        or through a provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionType
     */

    public MatchingWorkflowSummary withResolutionType(ResolutionType resolutionType) {
        this.resolutionType = resolutionType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the workflow was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     * 
     * @return The timestamp of when the workflow was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the workflow was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the workflow was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingWorkflowSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     * 
     * @param workflowArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     */

    public void setWorkflowArn(String workflowArn) {
        this.workflowArn = workflowArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     */

    public String getWorkflowArn() {
        return this.workflowArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * </p>
     * 
     * @param workflowArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>MatchingWorkflow</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingWorkflowSummary withWorkflowArn(String workflowArn) {
        setWorkflowArn(workflowArn);
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     */

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingWorkflowSummary withWorkflowName(String workflowName) {
        setWorkflowName(workflowName);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getResolutionType() != null)
            sb.append("ResolutionType: ").append(getResolutionType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getWorkflowArn() != null)
            sb.append("WorkflowArn: ").append(getWorkflowArn()).append(",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: ").append(getWorkflowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchingWorkflowSummary == false)
            return false;
        MatchingWorkflowSummary other = (MatchingWorkflowSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getResolutionType() == null ^ this.getResolutionType() == null)
            return false;
        if (other.getResolutionType() != null && other.getResolutionType().equals(this.getResolutionType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getWorkflowArn() == null ^ this.getWorkflowArn() == null)
            return false;
        if (other.getWorkflowArn() != null && other.getWorkflowArn().equals(this.getWorkflowArn()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getResolutionType() == null) ? 0 : getResolutionType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getWorkflowArn() == null) ? 0 : getWorkflowArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        return hashCode;
    }

    @Override
    public MatchingWorkflowSummary clone() {
        try {
            return (MatchingWorkflowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.MatchingWorkflowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
