/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SendCommandRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /** Required. The instance IDs where the command should execute. */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * Required. The name of the SSM document to execute. This can be an SSM
     * public document or a custom document.
     */
    private String documentName;
    /**
     * If this time is reached and the command has not already started
     * executing, it will not execute.
     */
    private Integer timeoutSeconds;
    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     */
    private String comment;
    /**
     * The required and optional parameters specified in the SSM document being
     * executed.
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * The name of the S3 bucket where command execution responses should be
     * stored.
     */
    private String outputS3BucketName;
    /**
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     */
    private String outputS3KeyPrefix;

    /**
     * Required. The instance IDs where the command should execute.
     * 
     * @return Required. The instance IDs where the command should execute.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * Required. The instance IDs where the command should execute.
     * 
     * @param instanceIds
     *        Required. The instance IDs where the command should execute.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(
                instanceIds);
    }

    /**
     * Required. The instance IDs where the command should execute.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceIds(java.util.Collection)} or
     * {@link #withInstanceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceIds
     *        Required. The instance IDs where the command should execute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(
                    instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * Required. The instance IDs where the command should execute.
     * 
     * @param instanceIds
     *        Required. The instance IDs where the command should execute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withInstanceIds(
            java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * Required. The name of the SSM document to execute. This can be an SSM
     * public document or a custom document.
     * 
     * @param documentName
     *        Required. The name of the SSM document to execute. This can be an
     *        SSM public document or a custom document.
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * Required. The name of the SSM document to execute. This can be an SSM
     * public document or a custom document.
     * 
     * @return Required. The name of the SSM document to execute. This can be an
     *         SSM public document or a custom document.
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Required. The name of the SSM document to execute. This can be an SSM
     * public document or a custom document.
     * 
     * @param documentName
     *        Required. The name of the SSM document to execute. This can be an
     *        SSM public document or a custom document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * If this time is reached and the command has not already started
     * executing, it will not execute.
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started
     *        executing, it will not execute.
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * If this time is reached and the command has not already started
     * executing, it will not execute.
     * 
     * @return If this time is reached and the command has not already started
     *         executing, it will not execute.
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * If this time is reached and the command has not already started
     * executing, it will not execute.
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started
     *        executing, it will not execute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
        return this;
    }

    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * 
     * @param comment
     *        User-specified information about the command, such as a brief
     *        description of what the command should do.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * 
     * @return User-specified information about the command, such as a brief
     *         description of what the command should do.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * 
     * @param comment
     *        User-specified information about the command, such as a brief
     *        description of what the command should do.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * The required and optional parameters specified in the SSM document being
     * executed.
     * 
     * @return The required and optional parameters specified in the SSM
     *         document being executed.
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * The required and optional parameters specified in the SSM document being
     * executed.
     * 
     * @param parameters
     *        The required and optional parameters specified in the SSM document
     *        being executed.
     */
    public void setParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * The required and optional parameters specified in the SSM document being
     * executed.
     * 
     * @param parameters
     *        The required and optional parameters specified in the SSM document
     *        being executed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public SendCommandRequest addParametersEntry(String key,
            java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters. &lt;p> Returns a reference
     * to this object so that method calls can be chained together.
     */
    public SendCommandRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket where command execution responses should
     *        be stored.
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * 
     * @return The name of the S3 bucket where command execution responses
     *         should be stored.
     */
    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket where command execution responses should
     *        be stored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * 
     * @param outputS3KeyPrefix
     *        The directory structure within the S3 bucket where the responses
     *        should be stored.
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * 
     * @return The directory structure within the S3 bucket where the responses
     *         should be stored.
     */
    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * 
     * @param outputS3KeyPrefix
     *        The directory structure within the S3 bucket where the responses
     *        should be stored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: " + getTimeoutSeconds() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCommandRequest == false)
            return false;
        SendCommandRequest other = (SendCommandRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getTimeoutSeconds() == null
                ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null
                && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputS3BucketName() == null
                ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null
                && other.getOutputS3BucketName().equals(
                        this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null
                ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null
                && other.getOutputS3KeyPrefix().equals(
                        this.getOutputS3KeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputS3BucketName() == null) ? 0
                        : getOutputS3BucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0
                        : getOutputS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public SendCommandRequest clone() {
        return (SendCommandRequest) super.clone();
    }
}