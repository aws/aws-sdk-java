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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow represents a flow in which AWS Glue components should be executed to complete a logical task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Workflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Workflow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     */
    private java.util.Map<String, String> defaultRunProperties;
    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     */
    private WorkflowRun lastRun;
    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     */
    private WorkflowGraph graph;

    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     * 
     * @param name
     *        The name of the workflow representing the flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     * 
     * @return The name of the workflow representing the flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     * 
     * @param name
     *        The name of the workflow representing the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @param description
     *        A description of the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @return A description of the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @param description
     *        A description of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     * 
     * @return A collection of properties to be used as part of each execution of the workflow.
     */

    public java.util.Map<String, String> getDefaultRunProperties() {
        return defaultRunProperties;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     * 
     * @param defaultRunProperties
     *        A collection of properties to be used as part of each execution of the workflow.
     */

    public void setDefaultRunProperties(java.util.Map<String, String> defaultRunProperties) {
        this.defaultRunProperties = defaultRunProperties;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the workflow.
     * </p>
     * 
     * @param defaultRunProperties
     *        A collection of properties to be used as part of each execution of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withDefaultRunProperties(java.util.Map<String, String> defaultRunProperties) {
        setDefaultRunProperties(defaultRunProperties);
        return this;
    }

    /**
     * Add a single DefaultRunProperties entry
     *
     * @see Workflow#withDefaultRunProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Workflow addDefaultRunPropertiesEntry(String key, String value) {
        if (null == this.defaultRunProperties) {
            this.defaultRunProperties = new java.util.HashMap<String, String>();
        }
        if (this.defaultRunProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultRunProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultRunProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow clearDefaultRunPropertiesEntries() {
        this.defaultRunProperties = null;
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     * 
     * @param createdOn
     *        The date and time when the workflow was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     * 
     * @return The date and time when the workflow was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     * 
     * @param createdOn
     *        The date and time when the workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when the workflow was last modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     * 
     * @return The date and time when the workflow was last modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when the workflow was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     * 
     * @param lastRun
     *        The information about the last execution of the workflow.
     */

    public void setLastRun(WorkflowRun lastRun) {
        this.lastRun = lastRun;
    }

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     * 
     * @return The information about the last execution of the workflow.
     */

    public WorkflowRun getLastRun() {
        return this.lastRun;
    }

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     * 
     * @param lastRun
     *        The information about the last execution of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withLastRun(WorkflowRun lastRun) {
        setLastRun(lastRun);
        return this;
    }

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     * 
     * @param graph
     *        The graph representing all the AWS Glue components that belong to the workflow as nodes and directed
     *        connections between them as edges.
     */

    public void setGraph(WorkflowGraph graph) {
        this.graph = graph;
    }

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     * 
     * @return The graph representing all the AWS Glue components that belong to the workflow as nodes and directed
     *         connections between them as edges.
     */

    public WorkflowGraph getGraph() {
        return this.graph;
    }

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     * 
     * @param graph
     *        The graph representing all the AWS Glue components that belong to the workflow as nodes and directed
     *        connections between them as edges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workflow withGraph(WorkflowGraph graph) {
        setGraph(graph);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultRunProperties() != null)
            sb.append("DefaultRunProperties: ").append(getDefaultRunProperties()).append(",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getLastRun() != null)
            sb.append("LastRun: ").append(getLastRun()).append(",");
        if (getGraph() != null)
            sb.append("Graph: ").append(getGraph());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workflow == false)
            return false;
        Workflow other = (Workflow) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultRunProperties() == null ^ this.getDefaultRunProperties() == null)
            return false;
        if (other.getDefaultRunProperties() != null && other.getDefaultRunProperties().equals(this.getDefaultRunProperties()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getLastRun() == null ^ this.getLastRun() == null)
            return false;
        if (other.getLastRun() != null && other.getLastRun().equals(this.getLastRun()) == false)
            return false;
        if (other.getGraph() == null ^ this.getGraph() == null)
            return false;
        if (other.getGraph() != null && other.getGraph().equals(this.getGraph()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultRunProperties() == null) ? 0 : getDefaultRunProperties().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getLastRun() == null) ? 0 : getLastRun().hashCode());
        hashCode = prime * hashCode + ((getGraph() == null) ? 0 : getGraph().hashCode());
        return hashCode;
    }

    @Override
    public Workflow clone() {
        try {
            return (Workflow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.WorkflowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
