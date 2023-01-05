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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the output configuration for the compiled model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobCompiledOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobCompiledOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     * </p>
     */
    private String s3OutputUri;

    /**
     * <p>
     * Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     * </p>
     * 
     * @param s3OutputUri
     *        Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     */

    public void setS3OutputUri(String s3OutputUri) {
        this.s3OutputUri = s3OutputUri;
    }

    /**
     * <p>
     * Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     * </p>
     * 
     * @return Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     */

    public String getS3OutputUri() {
        return this.s3OutputUri;
    }

    /**
     * <p>
     * Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     * </p>
     * 
     * @param s3OutputUri
     *        Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobCompiledOutputConfig withS3OutputUri(String s3OutputUri) {
        setS3OutputUri(s3OutputUri);
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
        if (getS3OutputUri() != null)
            sb.append("S3OutputUri: ").append(getS3OutputUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobCompiledOutputConfig == false)
            return false;
        RecommendationJobCompiledOutputConfig other = (RecommendationJobCompiledOutputConfig) obj;
        if (other.getS3OutputUri() == null ^ this.getS3OutputUri() == null)
            return false;
        if (other.getS3OutputUri() != null && other.getS3OutputUri().equals(this.getS3OutputUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputUri() == null) ? 0 : getS3OutputUri().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobCompiledOutputConfig clone() {
        try {
            return (RecommendationJobCompiledOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobCompiledOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
