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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment where you created the storage volume.
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
     * A description of the volume.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     */
    private KxNAS1Configuration nas1Configuration;

    /**
     * <p>
     * A unique identifier for the kdb environment where you created the storage volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment where you created the storage volume.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment where you created the storage volume.
     * </p>
     * 
     * @return A unique identifier for the kdb environment where you created the storage volume.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment where you created the storage volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment where you created the storage volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxVolumeRequest withEnvironmentId(String environmentId) {
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

    public UpdateKxVolumeRequest withVolumeName(String volumeName) {
        setVolumeName(volumeName);
        return this;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @return A description of the volume.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxVolumeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxVolumeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     * 
     * @param nas1Configuration
     *        Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     */

    public void setNas1Configuration(KxNAS1Configuration nas1Configuration) {
        this.nas1Configuration = nas1Configuration;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     * 
     * @return Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     */

    public KxNAS1Configuration getNas1Configuration() {
        return this.nas1Configuration;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     * 
     * @param nas1Configuration
     *        Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxVolumeRequest withNas1Configuration(KxNAS1Configuration nas1Configuration) {
        setNas1Configuration(nas1Configuration);
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
            sb.append("VolumeName: ").append(getVolumeName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getNas1Configuration() != null)
            sb.append("Nas1Configuration: ").append(getNas1Configuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKxVolumeRequest == false)
            return false;
        UpdateKxVolumeRequest other = (UpdateKxVolumeRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNas1Configuration() == null ^ this.getNas1Configuration() == null)
            return false;
        if (other.getNas1Configuration() != null && other.getNas1Configuration().equals(this.getNas1Configuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNas1Configuration() == null) ? 0 : getNas1Configuration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKxVolumeRequest clone() {
        return (UpdateKxVolumeRequest) super.clone();
    }

}
