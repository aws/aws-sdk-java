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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataRepositoryTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     */
    private String type;
    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The
     * default path is the file system root directory.
     * </p>
     */
    private java.util.List<String> paths;

    private String fileSystemId;
    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport
     * provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter.
     * </p>
     */
    private CompletionReport report;

    private String clientRequestToken;

    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * 
     * @param type
     *        Specifies the type of data repository task to create.
     * @see DataRepositoryTaskType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * 
     * @return Specifies the type of data repository task to create.
     * @see DataRepositoryTaskType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * 
     * @param type
     *        Specifies the type of data repository task to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskType
     */

    public CreateDataRepositoryTaskRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * 
     * @param type
     *        Specifies the type of data repository task to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskType
     */

    public CreateDataRepositoryTaskRequest withType(DataRepositoryTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The
     * default path is the file system root directory.
     * </p>
     * 
     * @return (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is
     *         processed. The default path is the file system root directory.
     */

    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The
     * default path is the file system root directory.
     * </p>
     * 
     * @param paths
     *        (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is
     *        processed. The default path is the file system root directory.
     */

    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The
     * default path is the file system root directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPaths(java.util.Collection)} or {@link #withPaths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param paths
     *        (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is
     *        processed. The default path is the file system root directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withPaths(String... paths) {
        if (this.paths == null) {
            setPaths(new java.util.ArrayList<String>(paths.length));
        }
        for (String ele : paths) {
            this.paths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The
     * default path is the file system root directory.
     * </p>
     * 
     * @param paths
     *        (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is
     *        processed. The default path is the file system root directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * @param fileSystemId
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * @return
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @param fileSystemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport
     * provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter.
     * </p>
     * 
     * @param report
     *        Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A
     *        CompletionReport provides a detailed report on the files that Amazon FSx processed that meet the criteria
     *        specified by the <code>Scope</code> parameter.
     */

    public void setReport(CompletionReport report) {
        this.report = report;
    }

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport
     * provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter.
     * </p>
     * 
     * @return Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A
     *         CompletionReport provides a detailed report on the files that Amazon FSx processed that meet the criteria
     *         specified by the <code>Scope</code> parameter.
     */

    public CompletionReport getReport() {
        return this.report;
    }

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport
     * provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter.
     * </p>
     * 
     * @param report
     *        Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A
     *        CompletionReport provides a detailed report on the files that Amazon FSx processed that meet the criteria
     *        specified by the <code>Scope</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withReport(CompletionReport report) {
        setReport(report);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPaths() != null)
            sb.append("Paths: ").append(getPaths()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getReport() != null)
            sb.append("Report: ").append(getReport()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateDataRepositoryTaskRequest == false)
            return false;
        CreateDataRepositoryTaskRequest other = (CreateDataRepositoryTaskRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataRepositoryTaskRequest clone() {
        return (CreateDataRepositoryTaskRequest) super.clone();
    }

}
