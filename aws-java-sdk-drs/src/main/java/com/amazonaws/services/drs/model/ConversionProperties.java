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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of a conversion job
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ConversionProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the snapshot being converted was taken
     * </p>
     */
    private String dataTimestamp;
    /**
     * <p>
     * Whether the volume being converted uses UEFI or not
     * </p>
     */
    private Boolean forceUefi;
    /**
     * <p>
     * The root volume name of a conversion job
     * </p>
     */
    private String rootVolumeName;
    /**
     * <p>
     * A mapping between the volumes being converted and the converted snapshot ids
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> volumeToConversionMap;
    /**
     * <p>
     * A mapping between the volumes and their sizes
     * </p>
     */
    private java.util.Map<String, Long> volumeToVolumeSize;

    /**
     * <p>
     * The timestamp of when the snapshot being converted was taken
     * </p>
     * 
     * @param dataTimestamp
     *        The timestamp of when the snapshot being converted was taken
     */

    public void setDataTimestamp(String dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the snapshot being converted was taken
     * </p>
     * 
     * @return The timestamp of when the snapshot being converted was taken
     */

    public String getDataTimestamp() {
        return this.dataTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the snapshot being converted was taken
     * </p>
     * 
     * @param dataTimestamp
     *        The timestamp of when the snapshot being converted was taken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties withDataTimestamp(String dataTimestamp) {
        setDataTimestamp(dataTimestamp);
        return this;
    }

    /**
     * <p>
     * Whether the volume being converted uses UEFI or not
     * </p>
     * 
     * @param forceUefi
     *        Whether the volume being converted uses UEFI or not
     */

    public void setForceUefi(Boolean forceUefi) {
        this.forceUefi = forceUefi;
    }

    /**
     * <p>
     * Whether the volume being converted uses UEFI or not
     * </p>
     * 
     * @return Whether the volume being converted uses UEFI or not
     */

    public Boolean getForceUefi() {
        return this.forceUefi;
    }

    /**
     * <p>
     * Whether the volume being converted uses UEFI or not
     * </p>
     * 
     * @param forceUefi
     *        Whether the volume being converted uses UEFI or not
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties withForceUefi(Boolean forceUefi) {
        setForceUefi(forceUefi);
        return this;
    }

    /**
     * <p>
     * Whether the volume being converted uses UEFI or not
     * </p>
     * 
     * @return Whether the volume being converted uses UEFI or not
     */

    public Boolean isForceUefi() {
        return this.forceUefi;
    }

    /**
     * <p>
     * The root volume name of a conversion job
     * </p>
     * 
     * @param rootVolumeName
     *        The root volume name of a conversion job
     */

    public void setRootVolumeName(String rootVolumeName) {
        this.rootVolumeName = rootVolumeName;
    }

    /**
     * <p>
     * The root volume name of a conversion job
     * </p>
     * 
     * @return The root volume name of a conversion job
     */

    public String getRootVolumeName() {
        return this.rootVolumeName;
    }

    /**
     * <p>
     * The root volume name of a conversion job
     * </p>
     * 
     * @param rootVolumeName
     *        The root volume name of a conversion job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties withRootVolumeName(String rootVolumeName) {
        setRootVolumeName(rootVolumeName);
        return this;
    }

    /**
     * <p>
     * A mapping between the volumes being converted and the converted snapshot ids
     * </p>
     * 
     * @return A mapping between the volumes being converted and the converted snapshot ids
     */

    public java.util.Map<String, java.util.Map<String, String>> getVolumeToConversionMap() {
        return volumeToConversionMap;
    }

    /**
     * <p>
     * A mapping between the volumes being converted and the converted snapshot ids
     * </p>
     * 
     * @param volumeToConversionMap
     *        A mapping between the volumes being converted and the converted snapshot ids
     */

    public void setVolumeToConversionMap(java.util.Map<String, java.util.Map<String, String>> volumeToConversionMap) {
        this.volumeToConversionMap = volumeToConversionMap;
    }

    /**
     * <p>
     * A mapping between the volumes being converted and the converted snapshot ids
     * </p>
     * 
     * @param volumeToConversionMap
     *        A mapping between the volumes being converted and the converted snapshot ids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties withVolumeToConversionMap(java.util.Map<String, java.util.Map<String, String>> volumeToConversionMap) {
        setVolumeToConversionMap(volumeToConversionMap);
        return this;
    }

    /**
     * Add a single VolumeToConversionMap entry
     *
     * @see ConversionProperties#withVolumeToConversionMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties addVolumeToConversionMapEntry(String key, java.util.Map<String, String> value) {
        if (null == this.volumeToConversionMap) {
            this.volumeToConversionMap = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.volumeToConversionMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.volumeToConversionMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VolumeToConversionMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties clearVolumeToConversionMapEntries() {
        this.volumeToConversionMap = null;
        return this;
    }

    /**
     * <p>
     * A mapping between the volumes and their sizes
     * </p>
     * 
     * @return A mapping between the volumes and their sizes
     */

    public java.util.Map<String, Long> getVolumeToVolumeSize() {
        return volumeToVolumeSize;
    }

    /**
     * <p>
     * A mapping between the volumes and their sizes
     * </p>
     * 
     * @param volumeToVolumeSize
     *        A mapping between the volumes and their sizes
     */

    public void setVolumeToVolumeSize(java.util.Map<String, Long> volumeToVolumeSize) {
        this.volumeToVolumeSize = volumeToVolumeSize;
    }

    /**
     * <p>
     * A mapping between the volumes and their sizes
     * </p>
     * 
     * @param volumeToVolumeSize
     *        A mapping between the volumes and their sizes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties withVolumeToVolumeSize(java.util.Map<String, Long> volumeToVolumeSize) {
        setVolumeToVolumeSize(volumeToVolumeSize);
        return this;
    }

    /**
     * Add a single VolumeToVolumeSize entry
     *
     * @see ConversionProperties#withVolumeToVolumeSize
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties addVolumeToVolumeSizeEntry(String key, Long value) {
        if (null == this.volumeToVolumeSize) {
            this.volumeToVolumeSize = new java.util.HashMap<String, Long>();
        }
        if (this.volumeToVolumeSize.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.volumeToVolumeSize.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VolumeToVolumeSize.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionProperties clearVolumeToVolumeSizeEntries() {
        this.volumeToVolumeSize = null;
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
        if (getDataTimestamp() != null)
            sb.append("DataTimestamp: ").append(getDataTimestamp()).append(",");
        if (getForceUefi() != null)
            sb.append("ForceUefi: ").append(getForceUefi()).append(",");
        if (getRootVolumeName() != null)
            sb.append("RootVolumeName: ").append(getRootVolumeName()).append(",");
        if (getVolumeToConversionMap() != null)
            sb.append("VolumeToConversionMap: ").append(getVolumeToConversionMap()).append(",");
        if (getVolumeToVolumeSize() != null)
            sb.append("VolumeToVolumeSize: ").append(getVolumeToVolumeSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversionProperties == false)
            return false;
        ConversionProperties other = (ConversionProperties) obj;
        if (other.getDataTimestamp() == null ^ this.getDataTimestamp() == null)
            return false;
        if (other.getDataTimestamp() != null && other.getDataTimestamp().equals(this.getDataTimestamp()) == false)
            return false;
        if (other.getForceUefi() == null ^ this.getForceUefi() == null)
            return false;
        if (other.getForceUefi() != null && other.getForceUefi().equals(this.getForceUefi()) == false)
            return false;
        if (other.getRootVolumeName() == null ^ this.getRootVolumeName() == null)
            return false;
        if (other.getRootVolumeName() != null && other.getRootVolumeName().equals(this.getRootVolumeName()) == false)
            return false;
        if (other.getVolumeToConversionMap() == null ^ this.getVolumeToConversionMap() == null)
            return false;
        if (other.getVolumeToConversionMap() != null && other.getVolumeToConversionMap().equals(this.getVolumeToConversionMap()) == false)
            return false;
        if (other.getVolumeToVolumeSize() == null ^ this.getVolumeToVolumeSize() == null)
            return false;
        if (other.getVolumeToVolumeSize() != null && other.getVolumeToVolumeSize().equals(this.getVolumeToVolumeSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataTimestamp() == null) ? 0 : getDataTimestamp().hashCode());
        hashCode = prime * hashCode + ((getForceUefi() == null) ? 0 : getForceUefi().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeName() == null) ? 0 : getRootVolumeName().hashCode());
        hashCode = prime * hashCode + ((getVolumeToConversionMap() == null) ? 0 : getVolumeToConversionMap().hashCode());
        hashCode = prime * hashCode + ((getVolumeToVolumeSize() == null) ? 0 : getVolumeToVolumeSize().hashCode());
        return hashCode;
    }

    @Override
    public ConversionProperties clone() {
        try {
            return (ConversionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.ConversionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
