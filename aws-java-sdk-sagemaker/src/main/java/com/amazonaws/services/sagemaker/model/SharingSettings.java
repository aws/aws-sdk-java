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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies options for sharing SageMaker Studio notebooks. These settings are specified as part of
 * <code>DefaultUserSettings</code> when the <code>CreateDomain</code> API is called, and as part of
 * <code>UserSettings</code> when the <code>CreateUserProfile</code> API is called. When <code>SharingSettings</code> is
 * not specified, notebook sharing isn't allowed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SharingSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to include the notebook cell output when sharing the notebook. The default is <code>Disabled</code>.
     * </p>
     */
    private String notebookOutputOption;
    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the shared
     * notebook snapshots.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management Service
     * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * </p>
     */
    private String s3KmsKeyId;

    /**
     * <p>
     * Whether to include the notebook cell output when sharing the notebook. The default is <code>Disabled</code>.
     * </p>
     * 
     * @param notebookOutputOption
     *        Whether to include the notebook cell output when sharing the notebook. The default is
     *        <code>Disabled</code>.
     * @see NotebookOutputOption
     */

    public void setNotebookOutputOption(String notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption;
    }

    /**
     * <p>
     * Whether to include the notebook cell output when sharing the notebook. The default is <code>Disabled</code>.
     * </p>
     * 
     * @return Whether to include the notebook cell output when sharing the notebook. The default is
     *         <code>Disabled</code>.
     * @see NotebookOutputOption
     */

    public String getNotebookOutputOption() {
        return this.notebookOutputOption;
    }

    /**
     * <p>
     * Whether to include the notebook cell output when sharing the notebook. The default is <code>Disabled</code>.
     * </p>
     * 
     * @param notebookOutputOption
     *        Whether to include the notebook cell output when sharing the notebook. The default is
     *        <code>Disabled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookOutputOption
     */

    public SharingSettings withNotebookOutputOption(String notebookOutputOption) {
        setNotebookOutputOption(notebookOutputOption);
        return this;
    }

    /**
     * <p>
     * Whether to include the notebook cell output when sharing the notebook. The default is <code>Disabled</code>.
     * </p>
     * 
     * @param notebookOutputOption
     *        Whether to include the notebook cell output when sharing the notebook. The default is
     *        <code>Disabled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookOutputOption
     */

    public SharingSettings withNotebookOutputOption(NotebookOutputOption notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption.toString();
        return this;
    }

    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the shared
     * notebook snapshots.
     * </p>
     * 
     * @param s3OutputPath
     *        When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the
     *        shared notebook snapshots.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the shared
     * notebook snapshots.
     * </p>
     * 
     * @return When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the
     *         shared notebook snapshots.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the shared
     * notebook snapshots.
     * </p>
     * 
     * @param s3OutputPath
     *        When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon S3 bucket used to store the
     *        shared notebook snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharingSettings withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management Service
     * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * </p>
     * 
     * @param s3KmsKeyId
     *        When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management
     *        Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     */

    public void setS3KmsKeyId(String s3KmsKeyId) {
        this.s3KmsKeyId = s3KmsKeyId;
    }

    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management Service
     * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * </p>
     * 
     * @return When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management
     *         Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     */

    public String getS3KmsKeyId() {
        return this.s3KmsKeyId;
    }

    /**
     * <p>
     * When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management Service
     * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * </p>
     * 
     * @param s3KmsKeyId
     *        When <code>NotebookOutputOption</code> is <code>Allowed</code>, the Amazon Web Services Key Management
     *        Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharingSettings withS3KmsKeyId(String s3KmsKeyId) {
        setS3KmsKeyId(s3KmsKeyId);
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
        if (getNotebookOutputOption() != null)
            sb.append("NotebookOutputOption: ").append(getNotebookOutputOption()).append(",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getS3KmsKeyId() != null)
            sb.append("S3KmsKeyId: ").append(getS3KmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharingSettings == false)
            return false;
        SharingSettings other = (SharingSettings) obj;
        if (other.getNotebookOutputOption() == null ^ this.getNotebookOutputOption() == null)
            return false;
        if (other.getNotebookOutputOption() != null && other.getNotebookOutputOption().equals(this.getNotebookOutputOption()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getS3KmsKeyId() == null ^ this.getS3KmsKeyId() == null)
            return false;
        if (other.getS3KmsKeyId() != null && other.getS3KmsKeyId().equals(this.getS3KmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookOutputOption() == null) ? 0 : getNotebookOutputOption().hashCode());
        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getS3KmsKeyId() == null) ? 0 : getS3KmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public SharingSettings clone() {
        try {
            return (SharingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SharingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
