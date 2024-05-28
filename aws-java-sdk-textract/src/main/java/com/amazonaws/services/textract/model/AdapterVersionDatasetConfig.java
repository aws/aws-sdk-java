/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dataset configuration options for a given version of an adapter. Can include an Amazon S3 bucket if specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AdapterVersionDatasetConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdapterVersionDatasetConfig implements Serializable, Cloneable, StructuredPojo {

    private S3Object manifestS3Object;

    /**
     * @param manifestS3Object
     */

    public void setManifestS3Object(S3Object manifestS3Object) {
        this.manifestS3Object = manifestS3Object;
    }

    /**
     * @return
     */

    public S3Object getManifestS3Object() {
        return this.manifestS3Object;
    }

    /**
     * @param manifestS3Object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionDatasetConfig withManifestS3Object(S3Object manifestS3Object) {
        setManifestS3Object(manifestS3Object);
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
        if (getManifestS3Object() != null)
            sb.append("ManifestS3Object: ").append(getManifestS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterVersionDatasetConfig == false)
            return false;
        AdapterVersionDatasetConfig other = (AdapterVersionDatasetConfig) obj;
        if (other.getManifestS3Object() == null ^ this.getManifestS3Object() == null)
            return false;
        if (other.getManifestS3Object() != null && other.getManifestS3Object().equals(this.getManifestS3Object()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestS3Object() == null) ? 0 : getManifestS3Object().hashCode());
        return hashCode;
    }

    @Override
    public AdapterVersionDatasetConfig clone() {
        try {
            return (AdapterVersionDatasetConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.AdapterVersionDatasetConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
