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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResumeWorkflowRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResumeWorkflowRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * A list of the node IDs for the nodes that were actually restarted.
     * </p>
     */
    private java.util.List<String> nodeIds;

    /**
     * <p>
     * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     * </p>
     * 
     * @param runId
     *        The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     * </p>
     * 
     * @return The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     * </p>
     * 
     * @param runId
     *        The new ID assigned to the resumed workflow run. Each resume of a workflow run will have a new run ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResumeWorkflowRunResult withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * A list of the node IDs for the nodes that were actually restarted.
     * </p>
     * 
     * @return A list of the node IDs for the nodes that were actually restarted.
     */

    public java.util.List<String> getNodeIds() {
        return nodeIds;
    }

    /**
     * <p>
     * A list of the node IDs for the nodes that were actually restarted.
     * </p>
     * 
     * @param nodeIds
     *        A list of the node IDs for the nodes that were actually restarted.
     */

    public void setNodeIds(java.util.Collection<String> nodeIds) {
        if (nodeIds == null) {
            this.nodeIds = null;
            return;
        }

        this.nodeIds = new java.util.ArrayList<String>(nodeIds);
    }

    /**
     * <p>
     * A list of the node IDs for the nodes that were actually restarted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeIds(java.util.Collection)} or {@link #withNodeIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param nodeIds
     *        A list of the node IDs for the nodes that were actually restarted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResumeWorkflowRunResult withNodeIds(String... nodeIds) {
        if (this.nodeIds == null) {
            setNodeIds(new java.util.ArrayList<String>(nodeIds.length));
        }
        for (String ele : nodeIds) {
            this.nodeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the node IDs for the nodes that were actually restarted.
     * </p>
     * 
     * @param nodeIds
     *        A list of the node IDs for the nodes that were actually restarted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResumeWorkflowRunResult withNodeIds(java.util.Collection<String> nodeIds) {
        setNodeIds(nodeIds);
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getNodeIds() != null)
            sb.append("NodeIds: ").append(getNodeIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResumeWorkflowRunResult == false)
            return false;
        ResumeWorkflowRunResult other = (ResumeWorkflowRunResult) obj;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getNodeIds() == null ^ this.getNodeIds() == null)
            return false;
        if (other.getNodeIds() != null && other.getNodeIds().equals(this.getNodeIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getNodeIds() == null) ? 0 : getNodeIds().hashCode());
        return hashCode;
    }

    @Override
    public ResumeWorkflowRunResult clone() {
        try {
            return (ResumeWorkflowRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
