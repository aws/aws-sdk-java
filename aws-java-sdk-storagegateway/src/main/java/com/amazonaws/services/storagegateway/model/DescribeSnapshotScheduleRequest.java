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
 * A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSnapshotSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     */
    private String volumeARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of
     *        gateway volumes.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of
     *         gateway volumes.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of
     *        gateway volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleRequest withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
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
            sb.append("VolumeARN: ").append(getVolumeARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotScheduleRequest == false)
            return false;
        DescribeSnapshotScheduleRequest other = (DescribeSnapshotScheduleRequest) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotScheduleRequest clone() {
        return (DescribeSnapshotScheduleRequest) super.clone();
    }

}
