/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> CreateStorediSCSIVolumeOutput$TargetARN </li>
 * <li> CreateStorediSCSIVolumeOutput$VolumeARN </li>
 * <li> CreateStorediSCSIVolumeOutput$VolumeSizeInBytes </li>
 * 
 * </ul>
 */
public class CreateStorediSCSIVolumeResult {

    /**
     * The Amazon Resource Name (ARN) of the configured volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The size of the volume in bytes.
     */
    private Long volumeSizeInBytes;

    /**
     * he Amazon Resource Name (ARN) of the volume target that includes the
     * iSCSI name that initiators can use to connect to the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * The Amazon Resource Name (ARN) of the configured volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the configured volume.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the configured volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the configured volume.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the configured volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the configured volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The size of the volume in bytes.
     *
     * @return The size of the volume in bytes.
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }
    
    /**
     * The size of the volume in bytes.
     *
     * @param volumeSizeInBytes The size of the volume in bytes.
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }
    
    /**
     * The size of the volume in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSizeInBytes The size of the volume in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeResult withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }
    
    
    /**
     * he Amazon Resource Name (ARN) of the volume target that includes the
     * iSCSI name that initiators can use to connect to the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return he Amazon Resource Name (ARN) of the volume target that includes the
     *         iSCSI name that initiators can use to connect to the target.
     */
    public String getTargetARN() {
        return targetARN;
    }
    
    /**
     * he Amazon Resource Name (ARN) of the volume target that includes the
     * iSCSI name that initiators can use to connect to the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN he Amazon Resource Name (ARN) of the volume target that includes the
     *         iSCSI name that initiators can use to connect to the target.
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }
    
    /**
     * he Amazon Resource Name (ARN) of the volume target that includes the
     * iSCSI name that initiators can use to connect to the target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN he Amazon Resource Name (ARN) of the volume target that includes the
     *         iSCSI name that initiators can use to connect to the target.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStorediSCSIVolumeResult withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (volumeARN != null) sb.append("VolumeARN: " + volumeARN + ", ");
        if (volumeSizeInBytes != null) sb.append("VolumeSizeInBytes: " + volumeSizeInBytes + ", ");
        if (targetARN != null) sb.append("TargetARN: " + targetARN + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateStorediSCSIVolumeResult == false) return false;
        CreateStorediSCSIVolumeResult other = (CreateStorediSCSIVolumeResult)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null) return false;
        if (other.getVolumeSizeInBytes() != null && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false) return false; 
        if (other.getTargetARN() == null ^ this.getTargetARN() == null) return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false) return false; 
        return true;
    }
    
}
    