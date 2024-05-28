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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/StartNotebookExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNotebookExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     * </p>
     */
    private String editorId;
    /**
     * <p>
     * The path and file name of the notebook file for this execution, relative to the path specified for the Amazon EMR
     * Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when you create an Amazon
     * EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code> (the <code>EditorID</code> of
     * this request), and you specify a <code>RelativePath</code> of
     * <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook execution
     * is
     * <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     * .
     * </p>
     */
    private String relativePath;
    /**
     * <p>
     * An optional name for the notebook execution.
     * </p>
     */
    private String notebookExecutionName;
    /**
     * <p>
     * Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     * </p>
     */
    private String notebookParams;
    /**
     * <p>
     * Specifies the execution engine (cluster) that runs the notebook execution.
     * </p>
     */
    private ExecutionEngineConfig executionEngine;
    /**
     * <p>
     * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for the
     * notebook execution.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     * notebook execution.
     * </p>
     */
    private String notebookInstanceSecurityGroupId;
    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon S3 location for the notebook execution input.
     * </p>
     */
    private NotebookS3LocationFromInput notebookS3Location;
    /**
     * <p>
     * The Amazon S3 location for the notebook execution output.
     * </p>
     */
    private OutputNotebookS3LocationFromInput outputNotebookS3Location;
    /**
     * <p>
     * The output format for the notebook execution.
     * </p>
     */
    private String outputNotebookFormat;
    /**
     * <p>
     * The environment variables associated with the notebook execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> environmentVariables;

    /**
     * <p>
     * The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     */

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    /**
     * <p>
     * The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     * </p>
     * 
     * @return The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     */

    public String getEditorId() {
        return this.editorId;
    }

    /**
     * <p>
     * The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique identifier of the Amazon EMR Notebook to use for notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withEditorId(String editorId) {
        setEditorId(editorId);
        return this;
    }

    /**
     * <p>
     * The path and file name of the notebook file for this execution, relative to the path specified for the Amazon EMR
     * Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when you create an Amazon
     * EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code> (the <code>EditorID</code> of
     * this request), and you specify a <code>RelativePath</code> of
     * <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook execution
     * is
     * <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     * .
     * </p>
     * 
     * @param relativePath
     *        The path and file name of the notebook file for this execution, relative to the path specified for the
     *        Amazon EMR Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when you
     *        create an Amazon EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code> (the
     *        <code>EditorID</code> of this request), and you specify a <code>RelativePath</code> of
     *        <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook
     *        execution is
     *        <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     *        .
     */

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The path and file name of the notebook file for this execution, relative to the path specified for the Amazon EMR
     * Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when you create an Amazon
     * EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code> (the <code>EditorID</code> of
     * this request), and you specify a <code>RelativePath</code> of
     * <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook execution
     * is
     * <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     * .
     * </p>
     * 
     * @return The path and file name of the notebook file for this execution, relative to the path specified for the
     *         Amazon EMR Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when
     *         you create an Amazon EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code>
     *         (the <code>EditorID</code> of this request), and you specify a <code>RelativePath</code> of
     *         <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook
     *         execution is
     *         <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     *         .
     */

    public String getRelativePath() {
        return this.relativePath;
    }

    /**
     * <p>
     * The path and file name of the notebook file for this execution, relative to the path specified for the Amazon EMR
     * Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when you create an Amazon
     * EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code> (the <code>EditorID</code> of
     * this request), and you specify a <code>RelativePath</code> of
     * <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook execution
     * is
     * <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     * .
     * </p>
     * 
     * @param relativePath
     *        The path and file name of the notebook file for this execution, relative to the path specified for the
     *        Amazon EMR Notebook. For example, if you specify a path of <code>s3://MyBucket/MyNotebooks</code> when you
     *        create an Amazon EMR Notebook for a notebook with an ID of <code>e-ABCDEFGHIJK1234567890ABCD</code> (the
     *        <code>EditorID</code> of this request), and you specify a <code>RelativePath</code> of
     *        <code>my_notebook_executions/notebook_execution.ipynb</code>, the location of the file for the notebook
     *        execution is
     *        <code>s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withRelativePath(String relativePath) {
        setRelativePath(relativePath);
        return this;
    }

    /**
     * <p>
     * An optional name for the notebook execution.
     * </p>
     * 
     * @param notebookExecutionName
     *        An optional name for the notebook execution.
     */

    public void setNotebookExecutionName(String notebookExecutionName) {
        this.notebookExecutionName = notebookExecutionName;
    }

    /**
     * <p>
     * An optional name for the notebook execution.
     * </p>
     * 
     * @return An optional name for the notebook execution.
     */

    public String getNotebookExecutionName() {
        return this.notebookExecutionName;
    }

    /**
     * <p>
     * An optional name for the notebook execution.
     * </p>
     * 
     * @param notebookExecutionName
     *        An optional name for the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withNotebookExecutionName(String notebookExecutionName) {
        setNotebookExecutionName(notebookExecutionName);
        return this;
    }

    /**
     * <p>
     * Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     * </p>
     * 
     * @param notebookParams
     *        Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     */

    public void setNotebookParams(String notebookParams) {
        this.notebookParams = notebookParams;
    }

    /**
     * <p>
     * Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     * </p>
     * 
     * @return Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     */

    public String getNotebookParams() {
        return this.notebookParams;
    }

    /**
     * <p>
     * Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     * </p>
     * 
     * @param notebookParams
     *        Input parameters in JSON format passed to the Amazon EMR Notebook at runtime for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withNotebookParams(String notebookParams) {
        setNotebookParams(notebookParams);
        return this;
    }

    /**
     * <p>
     * Specifies the execution engine (cluster) that runs the notebook execution.
     * </p>
     * 
     * @param executionEngine
     *        Specifies the execution engine (cluster) that runs the notebook execution.
     */

    public void setExecutionEngine(ExecutionEngineConfig executionEngine) {
        this.executionEngine = executionEngine;
    }

    /**
     * <p>
     * Specifies the execution engine (cluster) that runs the notebook execution.
     * </p>
     * 
     * @return Specifies the execution engine (cluster) that runs the notebook execution.
     */

    public ExecutionEngineConfig getExecutionEngine() {
        return this.executionEngine;
    }

    /**
     * <p>
     * Specifies the execution engine (cluster) that runs the notebook execution.
     * </p>
     * 
     * @param executionEngine
     *        Specifies the execution engine (cluster) that runs the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withExecutionEngine(ExecutionEngineConfig executionEngine) {
        setExecutionEngine(executionEngine);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for the
     * notebook execution.
     * </p>
     * 
     * @param serviceRole
     *        The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for
     *        the notebook execution.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for the
     * notebook execution.
     * </p>
     * 
     * @return The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for
     *         the notebook execution.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for the
     * notebook execution.
     * </p>
     * 
     * @param serviceRole
     *        The name or ARN of the IAM role that is used as the service role for Amazon EMR (the Amazon EMR role) for
     *        the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     * notebook execution.
     * </p>
     * 
     * @param notebookInstanceSecurityGroupId
     *        The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     *        notebook execution.
     */

    public void setNotebookInstanceSecurityGroupId(String notebookInstanceSecurityGroupId) {
        this.notebookInstanceSecurityGroupId = notebookInstanceSecurityGroupId;
    }

    /**
     * <p>
     * The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     * notebook execution.
     * </p>
     * 
     * @return The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     *         notebook execution.
     */

    public String getNotebookInstanceSecurityGroupId() {
        return this.notebookInstanceSecurityGroupId;
    }

    /**
     * <p>
     * The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     * notebook execution.
     * </p>
     * 
     * @param notebookInstanceSecurityGroupId
     *        The unique identifier of the Amazon EC2 security group to associate with the Amazon EMR Notebook for this
     *        notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withNotebookInstanceSecurityGroupId(String notebookInstanceSecurityGroupId) {
        setNotebookInstanceSecurityGroupId(notebookInstanceSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @return A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist
     *         of a required key string with a maximum of 128 characters and an optional value string with a maximum of
     *         256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of
     *        a required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     *        characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of
     *        a required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of
     *        a required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location for the notebook execution input.
     * </p>
     * 
     * @param notebookS3Location
     *        The Amazon S3 location for the notebook execution input.
     */

    public void setNotebookS3Location(NotebookS3LocationFromInput notebookS3Location) {
        this.notebookS3Location = notebookS3Location;
    }

    /**
     * <p>
     * The Amazon S3 location for the notebook execution input.
     * </p>
     * 
     * @return The Amazon S3 location for the notebook execution input.
     */

    public NotebookS3LocationFromInput getNotebookS3Location() {
        return this.notebookS3Location;
    }

    /**
     * <p>
     * The Amazon S3 location for the notebook execution input.
     * </p>
     * 
     * @param notebookS3Location
     *        The Amazon S3 location for the notebook execution input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withNotebookS3Location(NotebookS3LocationFromInput notebookS3Location) {
        setNotebookS3Location(notebookS3Location);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location for the notebook execution output.
     * </p>
     * 
     * @param outputNotebookS3Location
     *        The Amazon S3 location for the notebook execution output.
     */

    public void setOutputNotebookS3Location(OutputNotebookS3LocationFromInput outputNotebookS3Location) {
        this.outputNotebookS3Location = outputNotebookS3Location;
    }

    /**
     * <p>
     * The Amazon S3 location for the notebook execution output.
     * </p>
     * 
     * @return The Amazon S3 location for the notebook execution output.
     */

    public OutputNotebookS3LocationFromInput getOutputNotebookS3Location() {
        return this.outputNotebookS3Location;
    }

    /**
     * <p>
     * The Amazon S3 location for the notebook execution output.
     * </p>
     * 
     * @param outputNotebookS3Location
     *        The Amazon S3 location for the notebook execution output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withOutputNotebookS3Location(OutputNotebookS3LocationFromInput outputNotebookS3Location) {
        setOutputNotebookS3Location(outputNotebookS3Location);
        return this;
    }

    /**
     * <p>
     * The output format for the notebook execution.
     * </p>
     * 
     * @param outputNotebookFormat
     *        The output format for the notebook execution.
     * @see OutputNotebookFormat
     */

    public void setOutputNotebookFormat(String outputNotebookFormat) {
        this.outputNotebookFormat = outputNotebookFormat;
    }

    /**
     * <p>
     * The output format for the notebook execution.
     * </p>
     * 
     * @return The output format for the notebook execution.
     * @see OutputNotebookFormat
     */

    public String getOutputNotebookFormat() {
        return this.outputNotebookFormat;
    }

    /**
     * <p>
     * The output format for the notebook execution.
     * </p>
     * 
     * @param outputNotebookFormat
     *        The output format for the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputNotebookFormat
     */

    public StartNotebookExecutionRequest withOutputNotebookFormat(String outputNotebookFormat) {
        setOutputNotebookFormat(outputNotebookFormat);
        return this;
    }

    /**
     * <p>
     * The output format for the notebook execution.
     * </p>
     * 
     * @param outputNotebookFormat
     *        The output format for the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputNotebookFormat
     */

    public StartNotebookExecutionRequest withOutputNotebookFormat(OutputNotebookFormat outputNotebookFormat) {
        this.outputNotebookFormat = outputNotebookFormat.toString();
        return this;
    }

    /**
     * <p>
     * The environment variables associated with the notebook execution.
     * </p>
     * 
     * @return The environment variables associated with the notebook execution.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        if (environmentVariables == null) {
            environmentVariables = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables associated with the notebook execution.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables associated with the notebook execution.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(environmentVariables);
    }

    /**
     * <p>
     * The environment variables associated with the notebook execution.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables associated with the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see StartNotebookExecutionRequest#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNotebookExecutionRequest clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
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
        if (getEditorId() != null)
            sb.append("EditorId: ").append(getEditorId()).append(",");
        if (getRelativePath() != null)
            sb.append("RelativePath: ").append(getRelativePath()).append(",");
        if (getNotebookExecutionName() != null)
            sb.append("NotebookExecutionName: ").append(getNotebookExecutionName()).append(",");
        if (getNotebookParams() != null)
            sb.append("NotebookParams: ").append(getNotebookParams()).append(",");
        if (getExecutionEngine() != null)
            sb.append("ExecutionEngine: ").append(getExecutionEngine()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getNotebookInstanceSecurityGroupId() != null)
            sb.append("NotebookInstanceSecurityGroupId: ").append(getNotebookInstanceSecurityGroupId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNotebookS3Location() != null)
            sb.append("NotebookS3Location: ").append(getNotebookS3Location()).append(",");
        if (getOutputNotebookS3Location() != null)
            sb.append("OutputNotebookS3Location: ").append(getOutputNotebookS3Location()).append(",");
        if (getOutputNotebookFormat() != null)
            sb.append("OutputNotebookFormat: ").append(getOutputNotebookFormat()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartNotebookExecutionRequest == false)
            return false;
        StartNotebookExecutionRequest other = (StartNotebookExecutionRequest) obj;
        if (other.getEditorId() == null ^ this.getEditorId() == null)
            return false;
        if (other.getEditorId() != null && other.getEditorId().equals(this.getEditorId()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        if (other.getNotebookExecutionName() == null ^ this.getNotebookExecutionName() == null)
            return false;
        if (other.getNotebookExecutionName() != null && other.getNotebookExecutionName().equals(this.getNotebookExecutionName()) == false)
            return false;
        if (other.getNotebookParams() == null ^ this.getNotebookParams() == null)
            return false;
        if (other.getNotebookParams() != null && other.getNotebookParams().equals(this.getNotebookParams()) == false)
            return false;
        if (other.getExecutionEngine() == null ^ this.getExecutionEngine() == null)
            return false;
        if (other.getExecutionEngine() != null && other.getExecutionEngine().equals(this.getExecutionEngine()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getNotebookInstanceSecurityGroupId() == null ^ this.getNotebookInstanceSecurityGroupId() == null)
            return false;
        if (other.getNotebookInstanceSecurityGroupId() != null
                && other.getNotebookInstanceSecurityGroupId().equals(this.getNotebookInstanceSecurityGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotebookS3Location() == null ^ this.getNotebookS3Location() == null)
            return false;
        if (other.getNotebookS3Location() != null && other.getNotebookS3Location().equals(this.getNotebookS3Location()) == false)
            return false;
        if (other.getOutputNotebookS3Location() == null ^ this.getOutputNotebookS3Location() == null)
            return false;
        if (other.getOutputNotebookS3Location() != null && other.getOutputNotebookS3Location().equals(this.getOutputNotebookS3Location()) == false)
            return false;
        if (other.getOutputNotebookFormat() == null ^ this.getOutputNotebookFormat() == null)
            return false;
        if (other.getOutputNotebookFormat() != null && other.getOutputNotebookFormat().equals(this.getOutputNotebookFormat()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEditorId() == null) ? 0 : getEditorId().hashCode());
        hashCode = prime * hashCode + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        hashCode = prime * hashCode + ((getNotebookExecutionName() == null) ? 0 : getNotebookExecutionName().hashCode());
        hashCode = prime * hashCode + ((getNotebookParams() == null) ? 0 : getNotebookParams().hashCode());
        hashCode = prime * hashCode + ((getExecutionEngine() == null) ? 0 : getExecutionEngine().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceSecurityGroupId() == null) ? 0 : getNotebookInstanceSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNotebookS3Location() == null) ? 0 : getNotebookS3Location().hashCode());
        hashCode = prime * hashCode + ((getOutputNotebookS3Location() == null) ? 0 : getOutputNotebookS3Location().hashCode());
        hashCode = prime * hashCode + ((getOutputNotebookFormat() == null) ? 0 : getOutputNotebookFormat().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public StartNotebookExecutionRequest clone() {
        return (StartNotebookExecutionRequest) super.clone();
    }

}
