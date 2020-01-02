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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/AssetDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetDetails implements Serializable, Cloneable, StructuredPojo {

    private S3SnapshotAsset s3SnapshotAsset;

    /**
     * @param s3SnapshotAsset
     */

    public void setS3SnapshotAsset(S3SnapshotAsset s3SnapshotAsset) {
        this.s3SnapshotAsset = s3SnapshotAsset;
    }

    /**
     * @return
     */

    public S3SnapshotAsset getS3SnapshotAsset() {
        return this.s3SnapshotAsset;
    }

    /**
     * @param s3SnapshotAsset
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDetails withS3SnapshotAsset(S3SnapshotAsset s3SnapshotAsset) {
        setS3SnapshotAsset(s3SnapshotAsset);
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
        if (getS3SnapshotAsset() != null)
            sb.append("S3SnapshotAsset: ").append(getS3SnapshotAsset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetDetails == false)
            return false;
        AssetDetails other = (AssetDetails) obj;
        if (other.getS3SnapshotAsset() == null ^ this.getS3SnapshotAsset() == null)
            return false;
        if (other.getS3SnapshotAsset() != null && other.getS3SnapshotAsset().equals(this.getS3SnapshotAsset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3SnapshotAsset() == null) ? 0 : getS3SnapshotAsset().hashCode());
        return hashCode;
    }

    @Override
    public AssetDetails clone() {
        try {
            return (AssetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.AssetDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
