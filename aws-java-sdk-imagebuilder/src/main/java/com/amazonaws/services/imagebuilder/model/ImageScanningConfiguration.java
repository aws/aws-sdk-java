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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains settings for Image Builder image resource and container image scans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanningConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon Inspector
     * runs against the build instance when you create a new image.
     * </p>
     */
    private Boolean imageScanningEnabled;
    /**
     * <p>
     * Contains Amazon ECR settings for vulnerability scans.
     * </p>
     */
    private EcrConfiguration ecrConfiguration;

    /**
     * <p>
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon Inspector
     * runs against the build instance when you create a new image.
     * </p>
     * 
     * @param imageScanningEnabled
     *        A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon
     *        Inspector runs against the build instance when you create a new image.
     */

    public void setImageScanningEnabled(Boolean imageScanningEnabled) {
        this.imageScanningEnabled = imageScanningEnabled;
    }

    /**
     * <p>
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon Inspector
     * runs against the build instance when you create a new image.
     * </p>
     * 
     * @return A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon
     *         Inspector runs against the build instance when you create a new image.
     */

    public Boolean getImageScanningEnabled() {
        return this.imageScanningEnabled;
    }

    /**
     * <p>
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon Inspector
     * runs against the build instance when you create a new image.
     * </p>
     * 
     * @param imageScanningEnabled
     *        A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon
     *        Inspector runs against the build instance when you create a new image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanningConfiguration withImageScanningEnabled(Boolean imageScanningEnabled) {
        setImageScanningEnabled(imageScanningEnabled);
        return this;
    }

    /**
     * <p>
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon Inspector
     * runs against the build instance when you create a new image.
     * </p>
     * 
     * @return A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans that Amazon
     *         Inspector runs against the build instance when you create a new image.
     */

    public Boolean isImageScanningEnabled() {
        return this.imageScanningEnabled;
    }

    /**
     * <p>
     * Contains Amazon ECR settings for vulnerability scans.
     * </p>
     * 
     * @param ecrConfiguration
     *        Contains Amazon ECR settings for vulnerability scans.
     */

    public void setEcrConfiguration(EcrConfiguration ecrConfiguration) {
        this.ecrConfiguration = ecrConfiguration;
    }

    /**
     * <p>
     * Contains Amazon ECR settings for vulnerability scans.
     * </p>
     * 
     * @return Contains Amazon ECR settings for vulnerability scans.
     */

    public EcrConfiguration getEcrConfiguration() {
        return this.ecrConfiguration;
    }

    /**
     * <p>
     * Contains Amazon ECR settings for vulnerability scans.
     * </p>
     * 
     * @param ecrConfiguration
     *        Contains Amazon ECR settings for vulnerability scans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanningConfiguration withEcrConfiguration(EcrConfiguration ecrConfiguration) {
        setEcrConfiguration(ecrConfiguration);
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
        if (getImageScanningEnabled() != null)
            sb.append("ImageScanningEnabled: ").append(getImageScanningEnabled()).append(",");
        if (getEcrConfiguration() != null)
            sb.append("EcrConfiguration: ").append(getEcrConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanningConfiguration == false)
            return false;
        ImageScanningConfiguration other = (ImageScanningConfiguration) obj;
        if (other.getImageScanningEnabled() == null ^ this.getImageScanningEnabled() == null)
            return false;
        if (other.getImageScanningEnabled() != null && other.getImageScanningEnabled().equals(this.getImageScanningEnabled()) == false)
            return false;
        if (other.getEcrConfiguration() == null ^ this.getEcrConfiguration() == null)
            return false;
        if (other.getEcrConfiguration() != null && other.getEcrConfiguration().equals(this.getEcrConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageScanningEnabled() == null) ? 0 : getImageScanningEnabled().hashCode());
        hashCode = prime * hashCode + ((getEcrConfiguration() == null) ? 0 : getEcrConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanningConfiguration clone() {
        try {
            return (ImageScanningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageScanningConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
