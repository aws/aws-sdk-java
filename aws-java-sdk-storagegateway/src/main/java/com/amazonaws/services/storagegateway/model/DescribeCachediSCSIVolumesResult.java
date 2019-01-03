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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCachediSCSIVolumes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCachediSCSIVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects where each object contains metadata about one cached volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CachediSCSIVolume> cachediSCSIVolumes;

    /**
     * <p>
     * An array of objects where each object contains metadata about one cached volume.
     * </p>
     * 
     * @return An array of objects where each object contains metadata about one cached volume.
     */

    public java.util.List<CachediSCSIVolume> getCachediSCSIVolumes() {
        if (cachediSCSIVolumes == null) {
            cachediSCSIVolumes = new com.amazonaws.internal.SdkInternalList<CachediSCSIVolume>();
        }
        return cachediSCSIVolumes;
    }

    /**
     * <p>
     * An array of objects where each object contains metadata about one cached volume.
     * </p>
     * 
     * @param cachediSCSIVolumes
     *        An array of objects where each object contains metadata about one cached volume.
     */

    public void setCachediSCSIVolumes(java.util.Collection<CachediSCSIVolume> cachediSCSIVolumes) {
        if (cachediSCSIVolumes == null) {
            this.cachediSCSIVolumes = null;
            return;
        }

        this.cachediSCSIVolumes = new com.amazonaws.internal.SdkInternalList<CachediSCSIVolume>(cachediSCSIVolumes);
    }

    /**
     * <p>
     * An array of objects where each object contains metadata about one cached volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCachediSCSIVolumes(java.util.Collection)} or {@link #withCachediSCSIVolumes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cachediSCSIVolumes
     *        An array of objects where each object contains metadata about one cached volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCachediSCSIVolumesResult withCachediSCSIVolumes(CachediSCSIVolume... cachediSCSIVolumes) {
        if (this.cachediSCSIVolumes == null) {
            setCachediSCSIVolumes(new com.amazonaws.internal.SdkInternalList<CachediSCSIVolume>(cachediSCSIVolumes.length));
        }
        for (CachediSCSIVolume ele : cachediSCSIVolumes) {
            this.cachediSCSIVolumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects where each object contains metadata about one cached volume.
     * </p>
     * 
     * @param cachediSCSIVolumes
     *        An array of objects where each object contains metadata about one cached volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCachediSCSIVolumesResult withCachediSCSIVolumes(java.util.Collection<CachediSCSIVolume> cachediSCSIVolumes) {
        setCachediSCSIVolumes(cachediSCSIVolumes);
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
        if (getCachediSCSIVolumes() != null)
            sb.append("CachediSCSIVolumes: ").append(getCachediSCSIVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCachediSCSIVolumesResult == false)
            return false;
        DescribeCachediSCSIVolumesResult other = (DescribeCachediSCSIVolumesResult) obj;
        if (other.getCachediSCSIVolumes() == null ^ this.getCachediSCSIVolumes() == null)
            return false;
        if (other.getCachediSCSIVolumes() != null && other.getCachediSCSIVolumes().equals(this.getCachediSCSIVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCachediSCSIVolumes() == null) ? 0 : getCachediSCSIVolumes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCachediSCSIVolumesResult clone() {
        try {
            return (DescribeCachediSCSIVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
