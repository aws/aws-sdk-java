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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data sink of the configuration object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ConcatenationSink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConcatenationSink implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of data sink in the configuration object.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The configuration settings for an Amazon S3 bucket sink.
     * </p>
     */
    private S3BucketSinkConfiguration s3BucketSinkConfiguration;

    /**
     * <p>
     * The type of data sink in the configuration object.
     * </p>
     * 
     * @param type
     *        The type of data sink in the configuration object.
     * @see ConcatenationSinkType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data sink in the configuration object.
     * </p>
     * 
     * @return The type of data sink in the configuration object.
     * @see ConcatenationSinkType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data sink in the configuration object.
     * </p>
     * 
     * @param type
     *        The type of data sink in the configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConcatenationSinkType
     */

    public ConcatenationSink withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data sink in the configuration object.
     * </p>
     * 
     * @param type
     *        The type of data sink in the configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConcatenationSinkType
     */

    public ConcatenationSink withType(ConcatenationSinkType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings for an Amazon S3 bucket sink.
     * </p>
     * 
     * @param s3BucketSinkConfiguration
     *        The configuration settings for an Amazon S3 bucket sink.
     */

    public void setS3BucketSinkConfiguration(S3BucketSinkConfiguration s3BucketSinkConfiguration) {
        this.s3BucketSinkConfiguration = s3BucketSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an Amazon S3 bucket sink.
     * </p>
     * 
     * @return The configuration settings for an Amazon S3 bucket sink.
     */

    public S3BucketSinkConfiguration getS3BucketSinkConfiguration() {
        return this.s3BucketSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an Amazon S3 bucket sink.
     * </p>
     * 
     * @param s3BucketSinkConfiguration
     *        The configuration settings for an Amazon S3 bucket sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConcatenationSink withS3BucketSinkConfiguration(S3BucketSinkConfiguration s3BucketSinkConfiguration) {
        setS3BucketSinkConfiguration(s3BucketSinkConfiguration);
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
        if (getS3BucketSinkConfiguration() != null)
            sb.append("S3BucketSinkConfiguration: ").append(getS3BucketSinkConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConcatenationSink == false)
            return false;
        ConcatenationSink other = (ConcatenationSink) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getS3BucketSinkConfiguration() == null ^ this.getS3BucketSinkConfiguration() == null)
            return false;
        if (other.getS3BucketSinkConfiguration() != null && other.getS3BucketSinkConfiguration().equals(this.getS3BucketSinkConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getS3BucketSinkConfiguration() == null) ? 0 : getS3BucketSinkConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ConcatenationSink clone() {
        try {
            return (ConcatenationSink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.ConcatenationSinkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
