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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateCachediSCSIVolume"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCachediSCSIVolumeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to
     * connect to the target.
     * </p>
     */
    private String targetARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the configured volume.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured volume.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the configured volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeResult withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to
     * connect to the target.
     * </p>
     * 
     * @param targetARN
     *        The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use
     *        to connect to the target.
     */

    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to
     * connect to the target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can
     *         use to connect to the target.
     */

    public String getTargetARN() {
        return this.targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to
     * connect to the target.
     * </p>
     * 
     * @param targetARN
     *        The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use
     *        to connect to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCachediSCSIVolumeResult withTargetARN(String targetARN) {
        setTargetARN(targetARN);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getTargetARN() != null)
            sb.append("TargetARN: ").append(getTargetARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCachediSCSIVolumeResult == false)
            return false;
        CreateCachediSCSIVolumeResult other = (CreateCachediSCSIVolumeResult) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        return hashCode;
    }

    @Override
    public CreateCachediSCSIVolumeResult clone() {
        try {
            return (CreateCachediSCSIVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
