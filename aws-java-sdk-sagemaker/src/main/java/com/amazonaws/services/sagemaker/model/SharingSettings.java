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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sharing settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SharingSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The notebook output option.
     * </p>
     */
    private String notebookOutputOption;
    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     */
    private String s3KmsKeyId;

    /**
     * <p>
     * The notebook output option.
     * </p>
     * 
     * @param notebookOutputOption
     *        The notebook output option.
     * @see NotebookOutputOption
     */

    public void setNotebookOutputOption(String notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption;
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * 
     * @return The notebook output option.
     * @see NotebookOutputOption
     */

    public String getNotebookOutputOption() {
        return this.notebookOutputOption;
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * 
     * @param notebookOutputOption
     *        The notebook output option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookOutputOption
     */

    public SharingSettings withNotebookOutputOption(String notebookOutputOption) {
        setNotebookOutputOption(notebookOutputOption);
        return this;
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * 
     * @param notebookOutputOption
     *        The notebook output option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookOutputOption
     */

    public SharingSettings withNotebookOutputOption(NotebookOutputOption notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 output path.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * 
     * @return The Amazon S3 output path.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 output path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharingSettings withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @param s3KmsKeyId
     *        The AWS Key Management Service encryption key ID.
     */

    public void setS3KmsKeyId(String s3KmsKeyId) {
        this.s3KmsKeyId = s3KmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @return The AWS Key Management Service encryption key ID.
     */

    public String getS3KmsKeyId() {
        return this.s3KmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @param s3KmsKeyId
     *        The AWS Key Management Service encryption key ID.
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
