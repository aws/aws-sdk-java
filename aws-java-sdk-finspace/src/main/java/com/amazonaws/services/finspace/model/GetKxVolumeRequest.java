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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     */
    private String volumeName;

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxVolumeRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @param volumeName
     *        A unique identifier for the volume.
     */

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @return A unique identifier for the volume.
     */

    public String getVolumeName() {
        return this.volumeName;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @param volumeName
     *        A unique identifier for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxVolumeRequest withVolumeName(String volumeName) {
        setVolumeName(volumeName);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getVolumeName() != null)
            sb.append("VolumeName: ").append(getVolumeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKxVolumeRequest == false)
            return false;
        GetKxVolumeRequest other = (GetKxVolumeRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        return hashCode;
    }

    @Override
    public GetKxVolumeRequest clone() {
        return (GetKxVolumeRequest) super.clone();
    }

}
