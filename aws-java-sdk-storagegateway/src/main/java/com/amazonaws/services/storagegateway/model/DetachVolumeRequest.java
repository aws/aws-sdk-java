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
 * <p>
 * AttachVolumeInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DetachVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the volume. The
     * default is <code>false</code>. If this value is set to <code>false</code>, you must manually disconnect the iSCSI
     * connection from the target volume.
     * </p>
     */
    private Boolean forceDetach;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVolumeRequest withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the volume. The
     * default is <code>false</code>. If this value is set to <code>false</code>, you must manually disconnect the iSCSI
     * connection from the target volume.
     * </p>
     * 
     * @param forceDetach
     *        Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the
     *        volume. The default is <code>false</code>. If this value is set to <code>false</code>, you must manually
     *        disconnect the iSCSI connection from the target volume.
     */

    public void setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the volume. The
     * default is <code>false</code>. If this value is set to <code>false</code>, you must manually disconnect the iSCSI
     * connection from the target volume.
     * </p>
     * 
     * @return Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the
     *         volume. The default is <code>false</code>. If this value is set to <code>false</code>, you must manually
     *         disconnect the iSCSI connection from the target volume.
     */

    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the volume. The
     * default is <code>false</code>. If this value is set to <code>false</code>, you must manually disconnect the iSCSI
     * connection from the target volume.
     * </p>
     * 
     * @param forceDetach
     *        Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the
     *        volume. The default is <code>false</code>. If this value is set to <code>false</code>, you must manually
     *        disconnect the iSCSI connection from the target volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVolumeRequest withForceDetach(Boolean forceDetach) {
        setForceDetach(forceDetach);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the volume. The
     * default is <code>false</code>. If this value is set to <code>false</code>, you must manually disconnect the iSCSI
     * connection from the target volume.
     * </p>
     * 
     * @return Set to <code>true</code> to forcibly remove the iSCSI connection of the target volume and detach the
     *         volume. The default is <code>false</code>. If this value is set to <code>false</code>, you must manually
     *         disconnect the iSCSI connection from the target volume.
     */

    public Boolean isForceDetach() {
        return this.forceDetach;
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getForceDetach() != null)
            sb.append("ForceDetach: ").append(getForceDetach());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachVolumeRequest == false)
            return false;
        DetachVolumeRequest other = (DetachVolumeRequest) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getForceDetach() == null ^ this.getForceDetach() == null)
            return false;
        if (other.getForceDetach() != null && other.getForceDetach().equals(this.getForceDetach()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getForceDetach() == null) ? 0 : getForceDetach().hashCode());
        return hashCode;
    }

    @Override
    public DetachVolumeRequest clone() {
        return (DetachVolumeRequest) super.clone();
    }

}
