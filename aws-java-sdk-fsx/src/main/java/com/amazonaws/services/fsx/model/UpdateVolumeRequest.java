/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The configuration of the ONTAP volume that you are updating.
     * </p>
     */
    private UpdateOntapVolumeConfiguration ontapConfiguration;
    /**
     * <p>
     * The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child volume names
     * must be unique among their parent volume's children. The name of the volume is part of the mount string for the
     * OpenZFS volume.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration of the OpenZFS volume that you are updating.
     * </p>
     */
    private UpdateOpenZFSVolumeConfiguration openZFSConfiguration;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     * </p>
     * 
     * @return The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that you want to update, in the format <code>fsvol-0123456789abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The configuration of the ONTAP volume that you are updating.
     * </p>
     * 
     * @param ontapConfiguration
     *        The configuration of the ONTAP volume that you are updating.
     */

    public void setOntapConfiguration(UpdateOntapVolumeConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * <p>
     * The configuration of the ONTAP volume that you are updating.
     * </p>
     * 
     * @return The configuration of the ONTAP volume that you are updating.
     */

    public UpdateOntapVolumeConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * <p>
     * The configuration of the ONTAP volume that you are updating.
     * </p>
     * 
     * @param ontapConfiguration
     *        The configuration of the ONTAP volume that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withOntapConfiguration(UpdateOntapVolumeConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child volume names
     * must be unique among their parent volume's children. The name of the volume is part of the mount string for the
     * OpenZFS volume.
     * </p>
     * 
     * @param name
     *        The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child
     *        volume names must be unique among their parent volume's children. The name of the volume is part of the
     *        mount string for the OpenZFS volume.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child volume names
     * must be unique among their parent volume's children. The name of the volume is part of the mount string for the
     * OpenZFS volume.
     * </p>
     * 
     * @return The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child
     *         volume names must be unique among their parent volume's children. The name of the volume is part of the
     *         mount string for the OpenZFS volume.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child volume names
     * must be unique among their parent volume's children. The name of the volume is part of the mount string for the
     * OpenZFS volume.
     * </p>
     * 
     * @param name
     *        The name of the OpenZFS volume. OpenZFS root volumes are automatically named <code>FSX</code>. Child
     *        volume names must be unique among their parent volume's children. The name of the volume is part of the
     *        mount string for the OpenZFS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration of the OpenZFS volume that you are updating.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration of the OpenZFS volume that you are updating.
     */

    public void setOpenZFSConfiguration(UpdateOpenZFSVolumeConfiguration openZFSConfiguration) {
        this.openZFSConfiguration = openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration of the OpenZFS volume that you are updating.
     * </p>
     * 
     * @return The configuration of the OpenZFS volume that you are updating.
     */

    public UpdateOpenZFSVolumeConfiguration getOpenZFSConfiguration() {
        return this.openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration of the OpenZFS volume that you are updating.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration of the OpenZFS volume that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withOpenZFSConfiguration(UpdateOpenZFSVolumeConfiguration openZFSConfiguration) {
        setOpenZFSConfiguration(openZFSConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOpenZFSConfiguration() != null)
            sb.append("OpenZFSConfiguration: ").append(getOpenZFSConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVolumeRequest == false)
            return false;
        UpdateVolumeRequest other = (UpdateVolumeRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOpenZFSConfiguration() == null ^ this.getOpenZFSConfiguration() == null)
            return false;
        if (other.getOpenZFSConfiguration() != null && other.getOpenZFSConfiguration().equals(this.getOpenZFSConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOpenZFSConfiguration() == null) ? 0 : getOpenZFSConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVolumeRequest clone() {
        return (UpdateVolumeRequest) super.clone();
    }

}
