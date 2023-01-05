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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/S3BucketTranscriptSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketTranscriptSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bucket containing the transcript and the associated metadata.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The object that contains a path format that will be applied when Amazon Lex reads the transcript file in the
     * bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon S3 bucket.
     * </p>
     */
    private PathFormat pathFormat;
    /**
     * <p>
     * The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * </p>
     */
    private String transcriptFormat;
    /**
     * <p>
     * The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3 bucket.
     * Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on the filter you
     * provide.
     * </p>
     */
    private TranscriptFilter transcriptFilter;
    /**
     * <p>
     * The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your bucket is
     * encrypted using a customer managed KMS key.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the bucket containing the transcript and the associated metadata.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the bucket containing the transcript and the associated metadata.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the bucket containing the transcript and the associated metadata.
     * </p>
     * 
     * @return The name of the bucket containing the transcript and the associated metadata.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the bucket containing the transcript and the associated metadata.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the bucket containing the transcript and the associated metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketTranscriptSource withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The object that contains a path format that will be applied when Amazon Lex reads the transcript file in the
     * bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon S3 bucket.
     * </p>
     * 
     * @param pathFormat
     *        The object that contains a path format that will be applied when Amazon Lex reads the transcript file in
     *        the bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon
     *        S3 bucket.
     */

    public void setPathFormat(PathFormat pathFormat) {
        this.pathFormat = pathFormat;
    }

    /**
     * <p>
     * The object that contains a path format that will be applied when Amazon Lex reads the transcript file in the
     * bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon S3 bucket.
     * </p>
     * 
     * @return The object that contains a path format that will be applied when Amazon Lex reads the transcript file in
     *         the bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon
     *         S3 bucket.
     */

    public PathFormat getPathFormat() {
        return this.pathFormat;
    }

    /**
     * <p>
     * The object that contains a path format that will be applied when Amazon Lex reads the transcript file in the
     * bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon S3 bucket.
     * </p>
     * 
     * @param pathFormat
     *        The object that contains a path format that will be applied when Amazon Lex reads the transcript file in
     *        the bucket you provide. Specify this object if you only want Lex to read a subset of files in your Amazon
     *        S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketTranscriptSource withPathFormat(PathFormat pathFormat) {
        setPathFormat(pathFormat);
        return this;
    }

    /**
     * <p>
     * The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * </p>
     * 
     * @param transcriptFormat
     *        The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * @see TranscriptFormat
     */

    public void setTranscriptFormat(String transcriptFormat) {
        this.transcriptFormat = transcriptFormat;
    }

    /**
     * <p>
     * The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * </p>
     * 
     * @return The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * @see TranscriptFormat
     */

    public String getTranscriptFormat() {
        return this.transcriptFormat;
    }

    /**
     * <p>
     * The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * </p>
     * 
     * @param transcriptFormat
     *        The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptFormat
     */

    public S3BucketTranscriptSource withTranscriptFormat(String transcriptFormat) {
        setTranscriptFormat(transcriptFormat);
        return this;
    }

    /**
     * <p>
     * The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * </p>
     * 
     * @param transcriptFormat
     *        The format of the transcript content. Currently, Genie only supports the Amazon Lex transcript format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptFormat
     */

    public S3BucketTranscriptSource withTranscriptFormat(TranscriptFormat transcriptFormat) {
        this.transcriptFormat = transcriptFormat.toString();
        return this;
    }

    /**
     * <p>
     * The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3 bucket.
     * Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on the filter you
     * provide.
     * </p>
     * 
     * @param transcriptFilter
     *        The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3
     *        bucket. Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on
     *        the filter you provide.
     */

    public void setTranscriptFilter(TranscriptFilter transcriptFilter) {
        this.transcriptFilter = transcriptFilter;
    }

    /**
     * <p>
     * The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3 bucket.
     * Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on the filter you
     * provide.
     * </p>
     * 
     * @return The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3
     *         bucket. Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on
     *         the filter you provide.
     */

    public TranscriptFilter getTranscriptFilter() {
        return this.transcriptFilter;
    }

    /**
     * <p>
     * The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3 bucket.
     * Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on the filter you
     * provide.
     * </p>
     * 
     * @param transcriptFilter
     *        The object that contains the filter which will be applied when Amazon Lex reads through the Amazon S3
     *        bucket. Specify this object if you want Amazon Lex to read only a subset of the Amazon S3 bucket based on
     *        the filter you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketTranscriptSource withTranscriptFilter(TranscriptFilter transcriptFilter) {
        setTranscriptFilter(transcriptFilter);
        return this;
    }

    /**
     * <p>
     * The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your bucket is
     * encrypted using a customer managed KMS key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your
     *        bucket is encrypted using a customer managed KMS key.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your bucket is
     * encrypted using a customer managed KMS key.
     * </p>
     * 
     * @return The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your
     *         bucket is encrypted using a customer managed KMS key.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your bucket is
     * encrypted using a customer managed KMS key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key that customer use to encrypt their Amazon S3 bucket. Only use this field if your
     *        bucket is encrypted using a customer managed KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketTranscriptSource withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getPathFormat() != null)
            sb.append("PathFormat: ").append(getPathFormat()).append(",");
        if (getTranscriptFormat() != null)
            sb.append("TranscriptFormat: ").append(getTranscriptFormat()).append(",");
        if (getTranscriptFilter() != null)
            sb.append("TranscriptFilter: ").append(getTranscriptFilter()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketTranscriptSource == false)
            return false;
        S3BucketTranscriptSource other = (S3BucketTranscriptSource) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getPathFormat() == null ^ this.getPathFormat() == null)
            return false;
        if (other.getPathFormat() != null && other.getPathFormat().equals(this.getPathFormat()) == false)
            return false;
        if (other.getTranscriptFormat() == null ^ this.getTranscriptFormat() == null)
            return false;
        if (other.getTranscriptFormat() != null && other.getTranscriptFormat().equals(this.getTranscriptFormat()) == false)
            return false;
        if (other.getTranscriptFilter() == null ^ this.getTranscriptFilter() == null)
            return false;
        if (other.getTranscriptFilter() != null && other.getTranscriptFilter().equals(this.getTranscriptFilter()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getPathFormat() == null) ? 0 : getPathFormat().hashCode());
        hashCode = prime * hashCode + ((getTranscriptFormat() == null) ? 0 : getTranscriptFormat().hashCode());
        hashCode = prime * hashCode + ((getTranscriptFilter() == null) ? 0 : getTranscriptFilter().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketTranscriptSource clone() {
        try {
            return (S3BucketTranscriptSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.S3BucketTranscriptSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
