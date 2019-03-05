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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCachediSCSIVolumes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCachediSCSIVolumesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the
     * specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> volumeARNs;

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the
     * specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a gateway.
     * </p>
     * 
     * @return An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All
     *         of the specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for
     *         a gateway.
     */

    public java.util.List<String> getVolumeARNs() {
        if (volumeARNs == null) {
            volumeARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return volumeARNs;
    }

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the
     * specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a gateway.
     * </p>
     * 
     * @param volumeARNs
     *        An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of
     *        the specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     *        gateway.
     */

    public void setVolumeARNs(java.util.Collection<String> volumeARNs) {
        if (volumeARNs == null) {
            this.volumeARNs = null;
            return;
        }

        this.volumeARNs = new com.amazonaws.internal.SdkInternalList<String>(volumeARNs);
    }

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the
     * specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeARNs(java.util.Collection)} or {@link #withVolumeARNs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeARNs
     *        An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of
     *        the specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     *        gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCachediSCSIVolumesRequest withVolumeARNs(String... volumeARNs) {
        if (this.volumeARNs == null) {
            setVolumeARNs(new com.amazonaws.internal.SdkInternalList<String>(volumeARNs.length));
        }
        for (String ele : volumeARNs) {
            this.volumeARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the
     * specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a gateway.
     * </p>
     * 
     * @param volumeARNs
     *        An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of
     *        the specified cached volumes must from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     *        gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCachediSCSIVolumesRequest withVolumeARNs(java.util.Collection<String> volumeARNs) {
        setVolumeARNs(volumeARNs);
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
        if (getVolumeARNs() != null)
            sb.append("VolumeARNs: ").append(getVolumeARNs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCachediSCSIVolumesRequest == false)
            return false;
        DescribeCachediSCSIVolumesRequest other = (DescribeCachediSCSIVolumesRequest) obj;
        if (other.getVolumeARNs() == null ^ this.getVolumeARNs() == null)
            return false;
        if (other.getVolumeARNs() != null && other.getVolumeARNs().equals(this.getVolumeARNs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARNs() == null) ? 0 : getVolumeARNs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCachediSCSIVolumesRequest clone() {
        return (DescribeCachediSCSIVolumesRequest) super.clone();
    }

}
