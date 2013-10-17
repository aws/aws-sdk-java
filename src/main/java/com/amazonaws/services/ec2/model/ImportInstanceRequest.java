/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportInstanceRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#importInstance(ImportInstanceRequest) ImportInstance operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#importInstance(ImportInstanceRequest)
 */
public class ImportInstanceRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ImportInstanceRequest> {

    private String description;

    private ImportInstanceLaunchSpecification launchSpecification;

    private com.amazonaws.internal.ListWithAutoConstructFlag<DiskImage> diskImages;

    private String platform;

    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportInstanceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the LaunchSpecification property for this object.
     *
     * @return The value of the LaunchSpecification property for this object.
     */
    public ImportInstanceLaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * Sets the value of the LaunchSpecification property for this object.
     *
     * @param launchSpecification The new value for the LaunchSpecification property for this object.
     */
    public void setLaunchSpecification(ImportInstanceLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * Sets the value of the LaunchSpecification property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification The new value for the LaunchSpecification property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportInstanceRequest withLaunchSpecification(ImportInstanceLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * Returns the value of the DiskImages property for this object.
     *
     * @return The value of the DiskImages property for this object.
     */
    public java.util.List<DiskImage> getDiskImages() {
        if (diskImages == null) {
              diskImages = new com.amazonaws.internal.ListWithAutoConstructFlag<DiskImage>();
              diskImages.setAutoConstruct(true);
        }
        return diskImages;
    }
    
    /**
     * Sets the value of the DiskImages property for this object.
     *
     * @param diskImages The new value for the DiskImages property for this object.
     */
    public void setDiskImages(java.util.Collection<DiskImage> diskImages) {
        if (diskImages == null) {
            this.diskImages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DiskImage> diskImagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DiskImage>(diskImages.size());
        diskImagesCopy.addAll(diskImages);
        this.diskImages = diskImagesCopy;
    }
    
    /**
     * Sets the value of the DiskImages property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskImages The new value for the DiskImages property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportInstanceRequest withDiskImages(DiskImage... diskImages) {
        if (getDiskImages() == null) setDiskImages(new java.util.ArrayList<DiskImage>(diskImages.length));
        for (DiskImage value : diskImages) {
            getDiskImages().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the DiskImages property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskImages The new value for the DiskImages property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportInstanceRequest withDiskImages(java.util.Collection<DiskImage> diskImages) {
        if (diskImages == null) {
            this.diskImages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DiskImage> diskImagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DiskImage>(diskImages.size());
            diskImagesCopy.addAll(diskImages);
            this.diskImages = diskImagesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Platform property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return The value of the Platform property for this object.
     *
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PlatformValues
     */
    public ImportInstanceRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }
    
    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PlatformValues
     */
    public ImportInstanceRequest withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ImportInstanceRequest> getDryRunRequest() {
        Request<ImportInstanceRequest> request = new ImportInstanceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getLaunchSpecification() != null) sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getDiskImages() != null) sb.append("DiskImages: " + getDiskImages() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode()); 
        hashCode = prime * hashCode + ((getDiskImages() == null) ? 0 : getDiskImages().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportInstanceRequest == false) return false;
        ImportInstanceRequest other = (ImportInstanceRequest)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null) return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false) return false; 
        if (other.getDiskImages() == null ^ this.getDiskImages() == null) return false;
        if (other.getDiskImages() != null && other.getDiskImages().equals(this.getDiskImages()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        return true;
    }
    
}
    