/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the location that is configured for storing model artifacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelArtifacts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     */
    private String s3ModelArtifacts;

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * 
     * @param s3ModelArtifacts
     *        The path of the S3 object that contains the model artifacts. For example,
     *        <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     */

    public void setS3ModelArtifacts(String s3ModelArtifacts) {
        this.s3ModelArtifacts = s3ModelArtifacts;
    }

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * 
     * @return The path of the S3 object that contains the model artifacts. For example,
     *         <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     */

    public String getS3ModelArtifacts() {
        return this.s3ModelArtifacts;
    }

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * 
     * @param s3ModelArtifacts
     *        The path of the S3 object that contains the model artifacts. For example,
     *        <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelArtifacts withS3ModelArtifacts(String s3ModelArtifacts) {
        setS3ModelArtifacts(s3ModelArtifacts);
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
        if (getS3ModelArtifacts() != null)
            sb.append("S3ModelArtifacts: ").append(getS3ModelArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelArtifacts == false)
            return false;
        ModelArtifacts other = (ModelArtifacts) obj;
        if (other.getS3ModelArtifacts() == null ^ this.getS3ModelArtifacts() == null)
            return false;
        if (other.getS3ModelArtifacts() != null && other.getS3ModelArtifacts().equals(this.getS3ModelArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ModelArtifacts() == null) ? 0 : getS3ModelArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public ModelArtifacts clone() {
        try {
            return (ModelArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelArtifactsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
