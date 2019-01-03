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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportInstanceRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ImportInstance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ImportInstanceRequest> {

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The disk image.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DiskImage> diskImages;
    /**
     * <p>
     * The launch specification.
     * </p>
     */
    private ImportInstanceLaunchSpecification launchSpecification;
    /**
     * <p>
     * The instance operating system.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     * 
     * @param description
     *        A description for the instance being imported.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     * 
     * @return A description for the instance being imported.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     * 
     * @param description
     *        A description for the instance being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * 
     * @return The disk image.
     */

    public java.util.List<DiskImage> getDiskImages() {
        if (diskImages == null) {
            diskImages = new com.amazonaws.internal.SdkInternalList<DiskImage>();
        }
        return diskImages;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * 
     * @param diskImages
     *        The disk image.
     */

    public void setDiskImages(java.util.Collection<DiskImage> diskImages) {
        if (diskImages == null) {
            this.diskImages = null;
            return;
        }

        this.diskImages = new com.amazonaws.internal.SdkInternalList<DiskImage>(diskImages);
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskImages(java.util.Collection)} or {@link #withDiskImages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param diskImages
     *        The disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceRequest withDiskImages(DiskImage... diskImages) {
        if (this.diskImages == null) {
            setDiskImages(new com.amazonaws.internal.SdkInternalList<DiskImage>(diskImages.length));
        }
        for (DiskImage ele : diskImages) {
            this.diskImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * 
     * @param diskImages
     *        The disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceRequest withDiskImages(java.util.Collection<DiskImage> diskImages) {
        setDiskImages(diskImages);
        return this;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * 
     * @param launchSpecification
     *        The launch specification.
     */

    public void setLaunchSpecification(ImportInstanceLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * 
     * @return The launch specification.
     */

    public ImportInstanceLaunchSpecification getLaunchSpecification() {
        return this.launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * 
     * @param launchSpecification
     *        The launch specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceRequest withLaunchSpecification(ImportInstanceLaunchSpecification launchSpecification) {
        setLaunchSpecification(launchSpecification);
        return this;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @see PlatformValues
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @return The instance operating system.
     * @see PlatformValues
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public ImportInstanceRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @see PlatformValues
     */

    public void setPlatform(PlatformValues platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public ImportInstanceRequest withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ImportInstanceRequest> getDryRunRequest() {
        Request<ImportInstanceRequest> request = new ImportInstanceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiskImages() != null)
            sb.append("DiskImages: ").append(getDiskImages()).append(",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: ").append(getLaunchSpecification()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceRequest == false)
            return false;
        ImportInstanceRequest other = (ImportInstanceRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiskImages() == null ^ this.getDiskImages() == null)
            return false;
        if (other.getDiskImages() != null && other.getDiskImages().equals(this.getDiskImages()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiskImages() == null) ? 0 : getDiskImages().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstanceRequest clone() {
        return (ImportInstanceRequest) super.clone();
    }
}
