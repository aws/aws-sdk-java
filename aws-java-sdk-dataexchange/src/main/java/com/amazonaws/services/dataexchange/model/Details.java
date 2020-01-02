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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/Details" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Details implements Serializable, Cloneable, StructuredPojo {

    private ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails;

    private java.util.List<AssetSourceEntry> importAssetsFromS3JobErrorDetails;

    /**
     * @param importAssetFromSignedUrlJobErrorDetails
     */

    public void setImportAssetFromSignedUrlJobErrorDetails(ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails) {
        this.importAssetFromSignedUrlJobErrorDetails = importAssetFromSignedUrlJobErrorDetails;
    }

    /**
     * @return
     */

    public ImportAssetFromSignedUrlJobErrorDetails getImportAssetFromSignedUrlJobErrorDetails() {
        return this.importAssetFromSignedUrlJobErrorDetails;
    }

    /**
     * @param importAssetFromSignedUrlJobErrorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Details withImportAssetFromSignedUrlJobErrorDetails(ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails) {
        setImportAssetFromSignedUrlJobErrorDetails(importAssetFromSignedUrlJobErrorDetails);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<AssetSourceEntry> getImportAssetsFromS3JobErrorDetails() {
        return importAssetsFromS3JobErrorDetails;
    }

    /**
     * @param importAssetsFromS3JobErrorDetails
     */

    public void setImportAssetsFromS3JobErrorDetails(java.util.Collection<AssetSourceEntry> importAssetsFromS3JobErrorDetails) {
        if (importAssetsFromS3JobErrorDetails == null) {
            this.importAssetsFromS3JobErrorDetails = null;
            return;
        }

        this.importAssetsFromS3JobErrorDetails = new java.util.ArrayList<AssetSourceEntry>(importAssetsFromS3JobErrorDetails);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportAssetsFromS3JobErrorDetails(java.util.Collection)} or
     * {@link #withImportAssetsFromS3JobErrorDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param importAssetsFromS3JobErrorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Details withImportAssetsFromS3JobErrorDetails(AssetSourceEntry... importAssetsFromS3JobErrorDetails) {
        if (this.importAssetsFromS3JobErrorDetails == null) {
            setImportAssetsFromS3JobErrorDetails(new java.util.ArrayList<AssetSourceEntry>(importAssetsFromS3JobErrorDetails.length));
        }
        for (AssetSourceEntry ele : importAssetsFromS3JobErrorDetails) {
            this.importAssetsFromS3JobErrorDetails.add(ele);
        }
        return this;
    }

    /**
     * @param importAssetsFromS3JobErrorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Details withImportAssetsFromS3JobErrorDetails(java.util.Collection<AssetSourceEntry> importAssetsFromS3JobErrorDetails) {
        setImportAssetsFromS3JobErrorDetails(importAssetsFromS3JobErrorDetails);
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
        if (getImportAssetFromSignedUrlJobErrorDetails() != null)
            sb.append("ImportAssetFromSignedUrlJobErrorDetails: ").append(getImportAssetFromSignedUrlJobErrorDetails()).append(",");
        if (getImportAssetsFromS3JobErrorDetails() != null)
            sb.append("ImportAssetsFromS3JobErrorDetails: ").append(getImportAssetsFromS3JobErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Details == false)
            return false;
        Details other = (Details) obj;
        if (other.getImportAssetFromSignedUrlJobErrorDetails() == null ^ this.getImportAssetFromSignedUrlJobErrorDetails() == null)
            return false;
        if (other.getImportAssetFromSignedUrlJobErrorDetails() != null
                && other.getImportAssetFromSignedUrlJobErrorDetails().equals(this.getImportAssetFromSignedUrlJobErrorDetails()) == false)
            return false;
        if (other.getImportAssetsFromS3JobErrorDetails() == null ^ this.getImportAssetsFromS3JobErrorDetails() == null)
            return false;
        if (other.getImportAssetsFromS3JobErrorDetails() != null
                && other.getImportAssetsFromS3JobErrorDetails().equals(this.getImportAssetsFromS3JobErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportAssetFromSignedUrlJobErrorDetails() == null) ? 0 : getImportAssetFromSignedUrlJobErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getImportAssetsFromS3JobErrorDetails() == null) ? 0 : getImportAssetsFromS3JobErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public Details clone() {
        try {
            return (Details) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.DetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
