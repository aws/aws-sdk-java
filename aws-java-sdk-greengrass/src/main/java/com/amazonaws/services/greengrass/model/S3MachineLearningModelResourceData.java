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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Attributes that define an Amazon S3 machine learning resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/S3MachineLearningModelResourceData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3MachineLearningModelResourceData implements Serializable, Cloneable, StructuredPojo {

    /** The absolute local path of the resource inside the Lambda environment. */
    private String destinationPath;
    /** The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format. */
    private String s3Uri;

    /**
     * The absolute local path of the resource inside the Lambda environment.
     * 
     * @param destinationPath
     *        The absolute local path of the resource inside the Lambda environment.
     */

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    /**
     * The absolute local path of the resource inside the Lambda environment.
     * 
     * @return The absolute local path of the resource inside the Lambda environment.
     */

    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * The absolute local path of the resource inside the Lambda environment.
     * 
     * @param destinationPath
     *        The absolute local path of the resource inside the Lambda environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3MachineLearningModelResourceData withDestinationPath(String destinationPath) {
        setDestinationPath(destinationPath);
        return this;
    }

    /**
     * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
     * 
     * @param s3Uri
     *        The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
     * 
     * @return The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
     * 
     * @param s3Uri
     *        The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3MachineLearningModelResourceData withS3Uri(String s3Uri) {
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
        if (getDestinationPath() != null)
            sb.append("DestinationPath: ").append(getDestinationPath()).append(",");
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

        if (obj instanceof S3MachineLearningModelResourceData == false)
            return false;
        S3MachineLearningModelResourceData other = (S3MachineLearningModelResourceData) obj;
        if (other.getDestinationPath() == null ^ this.getDestinationPath() == null)
            return false;
        if (other.getDestinationPath() != null && other.getDestinationPath().equals(this.getDestinationPath()) == false)
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

        hashCode = prime * hashCode + ((getDestinationPath() == null) ? 0 : getDestinationPath().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public S3MachineLearningModelResourceData clone() {
        try {
            return (S3MachineLearningModelResourceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.S3MachineLearningModelResourceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
