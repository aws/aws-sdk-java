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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetWorkflows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetWorkflowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     */
    private Boolean includeGraph;

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * </p>
     * 
     * @return A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * </p>
     * 
     * @param names
     *        A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * </p>
     * 
     * @param names
     *        A list of workflow names, which may be the names returned from the <code>ListWorkflows</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include a graph when returning the workflow resource metadata.
     */

    public void setIncludeGraph(Boolean includeGraph) {
        this.includeGraph = includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @return Specifies whether to include a graph when returning the workflow resource metadata.
     */

    public Boolean getIncludeGraph() {
        return this.includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include a graph when returning the workflow resource metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetWorkflowsRequest withIncludeGraph(Boolean includeGraph) {
        setIncludeGraph(includeGraph);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource metadata.
     * </p>
     * 
     * @return Specifies whether to include a graph when returning the workflow resource metadata.
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
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

        if (obj instanceof BatchGetWorkflowsRequest == false)
            return false;
        BatchGetWorkflowsRequest other = (BatchGetWorkflowsRequest) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
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

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getIncludeGraph() == null) ? 0 : getIncludeGraph().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetWorkflowsRequest clone() {
        return (BatchGetWorkflowsRequest) super.clone();
    }

}
