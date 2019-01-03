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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeStorediSCSIVolumes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorediSCSIVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<StorediSCSIVolume> storediSCSIVolumes;

    /**
     * @return
     */

    public java.util.List<StorediSCSIVolume> getStorediSCSIVolumes() {
        if (storediSCSIVolumes == null) {
            storediSCSIVolumes = new com.amazonaws.internal.SdkInternalList<StorediSCSIVolume>();
        }
        return storediSCSIVolumes;
    }

    /**
     * @param storediSCSIVolumes
     */

    public void setStorediSCSIVolumes(java.util.Collection<StorediSCSIVolume> storediSCSIVolumes) {
        if (storediSCSIVolumes == null) {
            this.storediSCSIVolumes = null;
            return;
        }

        this.storediSCSIVolumes = new com.amazonaws.internal.SdkInternalList<StorediSCSIVolume>(storediSCSIVolumes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorediSCSIVolumes(java.util.Collection)} or {@link #withStorediSCSIVolumes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param storediSCSIVolumes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorediSCSIVolumesResult withStorediSCSIVolumes(StorediSCSIVolume... storediSCSIVolumes) {
        if (this.storediSCSIVolumes == null) {
            setStorediSCSIVolumes(new com.amazonaws.internal.SdkInternalList<StorediSCSIVolume>(storediSCSIVolumes.length));
        }
        for (StorediSCSIVolume ele : storediSCSIVolumes) {
            this.storediSCSIVolumes.add(ele);
        }
        return this;
    }

    /**
     * @param storediSCSIVolumes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorediSCSIVolumesResult withStorediSCSIVolumes(java.util.Collection<StorediSCSIVolume> storediSCSIVolumes) {
        setStorediSCSIVolumes(storediSCSIVolumes);
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
        if (getStorediSCSIVolumes() != null)
            sb.append("StorediSCSIVolumes: ").append(getStorediSCSIVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorediSCSIVolumesResult == false)
            return false;
        DescribeStorediSCSIVolumesResult other = (DescribeStorediSCSIVolumesResult) obj;
        if (other.getStorediSCSIVolumes() == null ^ this.getStorediSCSIVolumes() == null)
            return false;
        if (other.getStorediSCSIVolumes() != null && other.getStorediSCSIVolumes().equals(this.getStorediSCSIVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorediSCSIVolumes() == null) ? 0 : getStorediSCSIVolumes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorediSCSIVolumesResult clone() {
        try {
            return (DescribeStorediSCSIVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
