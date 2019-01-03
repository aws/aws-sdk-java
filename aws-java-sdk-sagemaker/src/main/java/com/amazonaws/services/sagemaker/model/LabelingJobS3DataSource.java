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
 * The Amazon S3 location of the input data objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobS3DataSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobS3DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data objects.
     * </p>
     */
    private String manifestS3Uri;

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data objects.
     * </p>
     * 
     * @param manifestS3Uri
     *        The Amazon S3 location of the manifest file that describes the input data objects.
     */

    public void setManifestS3Uri(String manifestS3Uri) {
        this.manifestS3Uri = manifestS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data objects.
     * </p>
     * 
     * @return The Amazon S3 location of the manifest file that describes the input data objects.
     */

    public String getManifestS3Uri() {
        return this.manifestS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data objects.
     * </p>
     * 
     * @param manifestS3Uri
     *        The Amazon S3 location of the manifest file that describes the input data objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobS3DataSource withManifestS3Uri(String manifestS3Uri) {
        setManifestS3Uri(manifestS3Uri);
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
        if (getManifestS3Uri() != null)
            sb.append("ManifestS3Uri: ").append(getManifestS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobS3DataSource == false)
            return false;
        LabelingJobS3DataSource other = (LabelingJobS3DataSource) obj;
        if (other.getManifestS3Uri() == null ^ this.getManifestS3Uri() == null)
            return false;
        if (other.getManifestS3Uri() != null && other.getManifestS3Uri().equals(this.getManifestS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestS3Uri() == null) ? 0 : getManifestS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobS3DataSource clone() {
        try {
            return (LabelingJobS3DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobS3DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
