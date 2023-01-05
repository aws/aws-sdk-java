/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration containing output file information for a batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/OutputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     * job/fraudster registration job.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code> extension. For
     * example, if the input file name is <code>input-file.json</code> and the output folder path is
     * <code>s3://output-bucket/output-folder</code>, the full output file path is
     * <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     * job/fraudster registration job.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     *        job/fraudster registration job.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     * job/fraudster registration job.
     * </p>
     * 
     * @return The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     *         job/fraudster registration job.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     * job/fraudster registration job.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment
     *        job/fraudster registration job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDataConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code> extension. For
     * example, if the input file name is <code>input-file.json</code> and the output folder path is
     * <code>s3://output-bucket/output-folder</code>, the full output file path is
     * <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     * </p>
     * 
     * @param s3Uri
     *        The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code>
     *        extension. For example, if the input file name is <code>input-file.json</code> and the output folder path
     *        is <code>s3://output-bucket/output-folder</code>, the full output file path is
     *        <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code> extension. For
     * example, if the input file name is <code>input-file.json</code> and the output folder path is
     * <code>s3://output-bucket/output-folder</code>, the full output file path is
     * <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     * </p>
     * 
     * @return The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code>
     *         extension. For example, if the input file name is <code>input-file.json</code> and the output folder path
     *         is <code>s3://output-bucket/output-folder</code>, the full output file path is
     *         <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code> extension. For
     * example, if the input file name is <code>input-file.json</code> and the output folder path is
     * <code>s3://output-bucket/output-folder</code>, the full output file path is
     * <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     * </p>
     * 
     * @param s3Uri
     *        The S3 path of the folder where Voice ID writes the job output file. It has a <code>*.out</code>
     *        extension. For example, if the input file name is <code>input-file.json</code> and the output folder path
     *        is <code>s3://output-bucket/output-folder</code>, the full output file path is
     *        <code>s3://output-bucket/output-folder/job-Id/input-file.json.out</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDataConfig == false)
            return false;
        OutputDataConfig other = (OutputDataConfig) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public OutputDataConfig clone() {
        try {
            return (OutputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.OutputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
