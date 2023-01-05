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
 * Indicates the setting of the location where the transcript is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TranscriptSourceSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptSourceSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     * </p>
     */
    private S3BucketTranscriptSource s3BucketTranscriptSource;

    /**
     * <p>
     * Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     * </p>
     * 
     * @param s3BucketTranscriptSource
     *        Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     */

    public void setS3BucketTranscriptSource(S3BucketTranscriptSource s3BucketTranscriptSource) {
        this.s3BucketTranscriptSource = s3BucketTranscriptSource;
    }

    /**
     * <p>
     * Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     * </p>
     * 
     * @return Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     */

    public S3BucketTranscriptSource getS3BucketTranscriptSource() {
        return this.s3BucketTranscriptSource;
    }

    /**
     * <p>
     * Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     * </p>
     * 
     * @param s3BucketTranscriptSource
     *        Indicates the setting of the Amazon S3 bucket where the transcript is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptSourceSetting withS3BucketTranscriptSource(S3BucketTranscriptSource s3BucketTranscriptSource) {
        setS3BucketTranscriptSource(s3BucketTranscriptSource);
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
        if (getS3BucketTranscriptSource() != null)
            sb.append("S3BucketTranscriptSource: ").append(getS3BucketTranscriptSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptSourceSetting == false)
            return false;
        TranscriptSourceSetting other = (TranscriptSourceSetting) obj;
        if (other.getS3BucketTranscriptSource() == null ^ this.getS3BucketTranscriptSource() == null)
            return false;
        if (other.getS3BucketTranscriptSource() != null && other.getS3BucketTranscriptSource().equals(this.getS3BucketTranscriptSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketTranscriptSource() == null) ? 0 : getS3BucketTranscriptSource().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptSourceSetting clone() {
        try {
            return (TranscriptSourceSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TranscriptSourceSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
