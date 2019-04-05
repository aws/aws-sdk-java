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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeRecoveryPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVolumeRecoveryPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeRecoveryPointInfo> volumeRecoveryPointInfos;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumeRecoveryPointsResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     * 
     * @return An array of <a>VolumeRecoveryPointInfo</a> objects.
     */

    public java.util.List<VolumeRecoveryPointInfo> getVolumeRecoveryPointInfos() {
        if (volumeRecoveryPointInfos == null) {
            volumeRecoveryPointInfos = new com.amazonaws.internal.SdkInternalList<VolumeRecoveryPointInfo>();
        }
        return volumeRecoveryPointInfos;
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     * 
     * @param volumeRecoveryPointInfos
     *        An array of <a>VolumeRecoveryPointInfo</a> objects.
     */

    public void setVolumeRecoveryPointInfos(java.util.Collection<VolumeRecoveryPointInfo> volumeRecoveryPointInfos) {
        if (volumeRecoveryPointInfos == null) {
            this.volumeRecoveryPointInfos = null;
            return;
        }

        this.volumeRecoveryPointInfos = new com.amazonaws.internal.SdkInternalList<VolumeRecoveryPointInfo>(volumeRecoveryPointInfos);
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeRecoveryPointInfos(java.util.Collection)} or
     * {@link #withVolumeRecoveryPointInfos(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param volumeRecoveryPointInfos
     *        An array of <a>VolumeRecoveryPointInfo</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumeRecoveryPointsResult withVolumeRecoveryPointInfos(VolumeRecoveryPointInfo... volumeRecoveryPointInfos) {
        if (this.volumeRecoveryPointInfos == null) {
            setVolumeRecoveryPointInfos(new com.amazonaws.internal.SdkInternalList<VolumeRecoveryPointInfo>(volumeRecoveryPointInfos.length));
        }
        for (VolumeRecoveryPointInfo ele : volumeRecoveryPointInfos) {
            this.volumeRecoveryPointInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     * 
     * @param volumeRecoveryPointInfos
     *        An array of <a>VolumeRecoveryPointInfo</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumeRecoveryPointsResult withVolumeRecoveryPointInfos(java.util.Collection<VolumeRecoveryPointInfo> volumeRecoveryPointInfos) {
        setVolumeRecoveryPointInfos(volumeRecoveryPointInfos);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getVolumeRecoveryPointInfos() != null)
            sb.append("VolumeRecoveryPointInfos: ").append(getVolumeRecoveryPointInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVolumeRecoveryPointsResult == false)
            return false;
        ListVolumeRecoveryPointsResult other = (ListVolumeRecoveryPointsResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVolumeRecoveryPointInfos() == null ^ this.getVolumeRecoveryPointInfos() == null)
            return false;
        if (other.getVolumeRecoveryPointInfos() != null && other.getVolumeRecoveryPointInfos().equals(this.getVolumeRecoveryPointInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeRecoveryPointInfos() == null) ? 0 : getVolumeRecoveryPointInfos().hashCode());
        return hashCode;
    }

    @Override
    public ListVolumeRecoveryPointsResult clone() {
        try {
            return (ListVolumeRecoveryPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
