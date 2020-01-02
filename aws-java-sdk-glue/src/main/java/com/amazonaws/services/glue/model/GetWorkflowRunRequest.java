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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the workflow being run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the workflow run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     */
    private Boolean includeGraph;

    /**
     * <p>
     * Name of the workflow being run.
     * </p>
     * 
     * @param name
     *        Name of the workflow being run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow being run.
     * </p>
     * 
     * @return Name of the workflow being run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the workflow being run.
     * </p>
     * 
     * @param name
     *        Name of the workflow being run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the workflow run.
     * </p>
     * 
     * @param runId
     *        The ID of the workflow run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The ID of the workflow run.
     * </p>
     * 
     * @return The ID of the workflow run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The ID of the workflow run.
     * </p>
     * 
     * @param runId
     *        The ID of the workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunRequest withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include the workflow graph in response or not.
     */

    public void setIncludeGraph(Boolean includeGraph) {
        this.includeGraph = includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @return Specifies whether to include the workflow graph in response or not.
     */

    public Boolean getIncludeGraph() {
        return this.includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include the workflow graph in response or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunRequest withIncludeGraph(Boolean includeGraph) {
        setIncludeGraph(includeGraph);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @return Specifies whether to include the workflow graph in response or not.
     */

    public Boolean isIncludeGraph() {
        return this.includeGraph;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getIncludeGraph() != null)
            sb.append("IncludeGraph: ").append(getIncludeGraph());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowRunRequest == false)
            return false;
        GetWorkflowRunRequest other = (GetWorkflowRunRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getIncludeGraph() == null ^ this.getIncludeGraph() == null)
            return false;
        if (other.getIncludeGraph() != null && other.getIncludeGraph().equals(this.getIncludeGraph()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getIncludeGraph() == null) ? 0 : getIncludeGraph().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowRunRequest clone() {
        return (GetWorkflowRunRequest) super.clone();
    }

}
