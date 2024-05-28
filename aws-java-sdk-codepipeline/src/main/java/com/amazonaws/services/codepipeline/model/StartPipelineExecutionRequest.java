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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>StartPipelineExecution</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StartPipelineExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartPipelineExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline to start.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list that overrides pipeline variables for a pipeline execution that's being started. Variable names must match
     * <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * </p>
     */
    private java.util.List<PipelineVariable> variables;
    /**
     * <p>
     * The system-generated unique ID used to identify a unique execution request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     * started. A source revision is the version with all the changes to your application code, or source artifact, for
     * the pipeline execution.
     * </p>
     */
    private java.util.List<SourceRevisionOverride> sourceRevisions;

    /**
     * <p>
     * The name of the pipeline to start.
     * </p>
     * 
     * @param name
     *        The name of the pipeline to start.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline to start.
     * </p>
     * 
     * @return The name of the pipeline to start.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline to start.
     * </p>
     * 
     * @param name
     *        The name of the pipeline to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list that overrides pipeline variables for a pipeline execution that's being started. Variable names must match
     * <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * </p>
     * 
     * @return A list that overrides pipeline variables for a pipeline execution that's being started. Variable names
     *         must match <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     */

    public java.util.List<PipelineVariable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A list that overrides pipeline variables for a pipeline execution that's being started. Variable names must match
     * <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * </p>
     * 
     * @param variables
     *        A list that overrides pipeline variables for a pipeline execution that's being started. Variable names
     *        must match <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     */

    public void setVariables(java.util.Collection<PipelineVariable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<PipelineVariable>(variables);
    }

    /**
     * <p>
     * A list that overrides pipeline variables for a pipeline execution that's being started. Variable names must match
     * <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        A list that overrides pipeline variables for a pipeline execution that's being started. Variable names
     *        must match <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withVariables(PipelineVariable... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<PipelineVariable>(variables.length));
        }
        for (PipelineVariable ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that overrides pipeline variables for a pipeline execution that's being started. Variable names must match
     * <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * </p>
     * 
     * @param variables
     *        A list that overrides pipeline variables for a pipeline execution that's being started. Variable names
     *        must match <code>[A-Za-z0-9@\-_]+</code>, and the values can be anything except an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withVariables(java.util.Collection<PipelineVariable> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The system-generated unique ID used to identify a unique execution request.
     * </p>
     * 
     * @param clientRequestToken
     *        The system-generated unique ID used to identify a unique execution request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The system-generated unique ID used to identify a unique execution request.
     * </p>
     * 
     * @return The system-generated unique ID used to identify a unique execution request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The system-generated unique ID used to identify a unique execution request.
     * </p>
     * 
     * @param clientRequestToken
     *        The system-generated unique ID used to identify a unique execution request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     * started. A source revision is the version with all the changes to your application code, or source artifact, for
     * the pipeline execution.
     * </p>
     * 
     * @return A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     *         started. A source revision is the version with all the changes to your application code, or source
     *         artifact, for the pipeline execution.
     */

    public java.util.List<SourceRevisionOverride> getSourceRevisions() {
        return sourceRevisions;
    }

    /**
     * <p>
     * A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     * started. A source revision is the version with all the changes to your application code, or source artifact, for
     * the pipeline execution.
     * </p>
     * 
     * @param sourceRevisions
     *        A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     *        started. A source revision is the version with all the changes to your application code, or source
     *        artifact, for the pipeline execution.
     */

    public void setSourceRevisions(java.util.Collection<SourceRevisionOverride> sourceRevisions) {
        if (sourceRevisions == null) {
            this.sourceRevisions = null;
            return;
        }

        this.sourceRevisions = new java.util.ArrayList<SourceRevisionOverride>(sourceRevisions);
    }

    /**
     * <p>
     * A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     * started. A source revision is the version with all the changes to your application code, or source artifact, for
     * the pipeline execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceRevisions(java.util.Collection)} or {@link #withSourceRevisions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceRevisions
     *        A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     *        started. A source revision is the version with all the changes to your application code, or source
     *        artifact, for the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withSourceRevisions(SourceRevisionOverride... sourceRevisions) {
        if (this.sourceRevisions == null) {
            setSourceRevisions(new java.util.ArrayList<SourceRevisionOverride>(sourceRevisions.length));
        }
        for (SourceRevisionOverride ele : sourceRevisions) {
            this.sourceRevisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     * started. A source revision is the version with all the changes to your application code, or source artifact, for
     * the pipeline execution.
     * </p>
     * 
     * @param sourceRevisions
     *        A list that allows you to specify, or override, the source revision for a pipeline execution that's being
     *        started. A source revision is the version with all the changes to your application code, or source
     *        artifact, for the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withSourceRevisions(java.util.Collection<SourceRevisionOverride> sourceRevisions) {
        setSourceRevisions(sourceRevisions);
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
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getSourceRevisions() != null)
            sb.append("SourceRevisions: ").append(getSourceRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartPipelineExecutionRequest == false)
            return false;
        StartPipelineExecutionRequest other = (StartPipelineExecutionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getSourceRevisions() == null ^ this.getSourceRevisions() == null)
            return false;
        if (other.getSourceRevisions() != null && other.getSourceRevisions().equals(this.getSourceRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSourceRevisions() == null) ? 0 : getSourceRevisions().hashCode());
        return hashCode;
    }

    @Override
    public StartPipelineExecutionRequest clone() {
        return (StartPipelineExecutionRequest) super.clone();
    }

}
