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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchGetAttachedFileMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAttachedFileMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     */
    private java.util.List<AttachedFile> files;
    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     */
    private java.util.List<AttachedFileError> errors;

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     * 
     * @return List of attached files that were successfully retrieved.
     */

    public java.util.List<AttachedFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     * 
     * @param files
     *        List of attached files that were successfully retrieved.
     */

    public void setFiles(java.util.Collection<AttachedFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<AttachedFile>(files);
    }

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        List of attached files that were successfully retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataResult withFiles(AttachedFile... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<AttachedFile>(files.length));
        }
        for (AttachedFile ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of attached files that were successfully retrieved.
     * </p>
     * 
     * @param files
     *        List of attached files that were successfully retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataResult withFiles(java.util.Collection<AttachedFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     * 
     * @return List of errors of attached files that could not be retrieved.
     */

    public java.util.List<AttachedFileError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     * 
     * @param errors
     *        List of errors of attached files that could not be retrieved.
     */

    public void setErrors(java.util.Collection<AttachedFileError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AttachedFileError>(errors);
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        List of errors of attached files that could not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataResult withErrors(AttachedFileError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<AttachedFileError>(errors.length));
        }
        for (AttachedFileError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of errors of attached files that could not be retrieved.
     * </p>
     * 
     * @param errors
     *        List of errors of attached files that could not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAttachedFileMetadataResult withErrors(java.util.Collection<AttachedFileError> errors) {
        setErrors(errors);
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
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAttachedFileMetadataResult == false)
            return false;
        BatchGetAttachedFileMetadataResult other = (BatchGetAttachedFileMetadataResult) obj;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAttachedFileMetadataResult clone() {
        try {
            return (BatchGetAttachedFileMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
