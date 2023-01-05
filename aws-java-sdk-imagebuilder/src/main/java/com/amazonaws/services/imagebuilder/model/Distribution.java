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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the settings for a specific Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Distribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Distribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The specific AMI settings; for example, launch permissions or AMI tags.
     * </p>
     */
    private AmiDistributionConfiguration amiDistributionConfiguration;
    /**
     * <p>
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * </p>
     */
    private ContainerDistributionConfiguration containerDistributionConfiguration;
    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * </p>
     */
    private java.util.List<String> licenseConfigurationArns;
    /**
     * <p>
     * A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * </p>
     */
    private java.util.List<LaunchTemplateConfiguration> launchTemplateConfigurations;
    /**
     * <p>
     * Configure export settings to deliver disk images created from your image build, using a file format that is
     * compatible with your VMs in that Region.
     * </p>
     */
    private S3ExportConfiguration s3ExportConfiguration;
    /**
     * <p>
     * The Windows faster-launching configurations to use for AMI distribution.
     * </p>
     */
    private java.util.List<FastLaunchConfiguration> fastLaunchConfigurations;

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @param region
     *        The target Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @return The target Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @param region
     *        The target Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The specific AMI settings; for example, launch permissions or AMI tags.
     * </p>
     * 
     * @param amiDistributionConfiguration
     *        The specific AMI settings; for example, launch permissions or AMI tags.
     */

    public void setAmiDistributionConfiguration(AmiDistributionConfiguration amiDistributionConfiguration) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
    }

    /**
     * <p>
     * The specific AMI settings; for example, launch permissions or AMI tags.
     * </p>
     * 
     * @return The specific AMI settings; for example, launch permissions or AMI tags.
     */

    public AmiDistributionConfiguration getAmiDistributionConfiguration() {
        return this.amiDistributionConfiguration;
    }

    /**
     * <p>
     * The specific AMI settings; for example, launch permissions or AMI tags.
     * </p>
     * 
     * @param amiDistributionConfiguration
     *        The specific AMI settings; for example, launch permissions or AMI tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withAmiDistributionConfiguration(AmiDistributionConfiguration amiDistributionConfiguration) {
        setAmiDistributionConfiguration(amiDistributionConfiguration);
        return this;
    }

    /**
     * <p>
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * </p>
     * 
     * @param containerDistributionConfiguration
     *        Container distribution settings for encryption, licensing, and sharing in a specific Region.
     */

    public void setContainerDistributionConfiguration(ContainerDistributionConfiguration containerDistributionConfiguration) {
        this.containerDistributionConfiguration = containerDistributionConfiguration;
    }

    /**
     * <p>
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * </p>
     * 
     * @return Container distribution settings for encryption, licensing, and sharing in a specific Region.
     */

    public ContainerDistributionConfiguration getContainerDistributionConfiguration() {
        return this.containerDistributionConfiguration;
    }

    /**
     * <p>
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * </p>
     * 
     * @param containerDistributionConfiguration
     *        Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withContainerDistributionConfiguration(ContainerDistributionConfiguration containerDistributionConfiguration) {
        setContainerDistributionConfiguration(containerDistributionConfiguration);
        return this;
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * </p>
     * 
     * @return The License Manager Configuration to associate with the AMI in the specified Region.
     */

    public java.util.List<String> getLicenseConfigurationArns() {
        return licenseConfigurationArns;
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        The License Manager Configuration to associate with the AMI in the specified Region.
     */

    public void setLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
        if (licenseConfigurationArns == null) {
            this.licenseConfigurationArns = null;
            return;
        }

        this.licenseConfigurationArns = new java.util.ArrayList<String>(licenseConfigurationArns);
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurationArns(java.util.Collection)} or
     * {@link #withLicenseConfigurationArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        The License Manager Configuration to associate with the AMI in the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withLicenseConfigurationArns(String... licenseConfigurationArns) {
        if (this.licenseConfigurationArns == null) {
            setLicenseConfigurationArns(new java.util.ArrayList<String>(licenseConfigurationArns.length));
        }
        for (String ele : licenseConfigurationArns) {
            this.licenseConfigurationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        The License Manager Configuration to associate with the AMI in the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
        setLicenseConfigurationArns(licenseConfigurationArns);
        return this;
    }

    /**
     * <p>
     * A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * </p>
     * 
     * @return A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     */

    public java.util.List<LaunchTemplateConfiguration> getLaunchTemplateConfigurations() {
        return launchTemplateConfigurations;
    }

    /**
     * <p>
     * A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * </p>
     * 
     * @param launchTemplateConfigurations
     *        A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     */

    public void setLaunchTemplateConfigurations(java.util.Collection<LaunchTemplateConfiguration> launchTemplateConfigurations) {
        if (launchTemplateConfigurations == null) {
            this.launchTemplateConfigurations = null;
            return;
        }

        this.launchTemplateConfigurations = new java.util.ArrayList<LaunchTemplateConfiguration>(launchTemplateConfigurations);
    }

    /**
     * <p>
     * A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchTemplateConfigurations(java.util.Collection)} or
     * {@link #withLaunchTemplateConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchTemplateConfigurations
     *        A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withLaunchTemplateConfigurations(LaunchTemplateConfiguration... launchTemplateConfigurations) {
        if (this.launchTemplateConfigurations == null) {
            setLaunchTemplateConfigurations(new java.util.ArrayList<LaunchTemplateConfiguration>(launchTemplateConfigurations.length));
        }
        for (LaunchTemplateConfiguration ele : launchTemplateConfigurations) {
            this.launchTemplateConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * </p>
     * 
     * @param launchTemplateConfigurations
     *        A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withLaunchTemplateConfigurations(java.util.Collection<LaunchTemplateConfiguration> launchTemplateConfigurations) {
        setLaunchTemplateConfigurations(launchTemplateConfigurations);
        return this;
    }

    /**
     * <p>
     * Configure export settings to deliver disk images created from your image build, using a file format that is
     * compatible with your VMs in that Region.
     * </p>
     * 
     * @param s3ExportConfiguration
     *        Configure export settings to deliver disk images created from your image build, using a file format that
     *        is compatible with your VMs in that Region.
     */

    public void setS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
    }

    /**
     * <p>
     * Configure export settings to deliver disk images created from your image build, using a file format that is
     * compatible with your VMs in that Region.
     * </p>
     * 
     * @return Configure export settings to deliver disk images created from your image build, using a file format that
     *         is compatible with your VMs in that Region.
     */

    public S3ExportConfiguration getS3ExportConfiguration() {
        return this.s3ExportConfiguration;
    }

    /**
     * <p>
     * Configure export settings to deliver disk images created from your image build, using a file format that is
     * compatible with your VMs in that Region.
     * </p>
     * 
     * @param s3ExportConfiguration
     *        Configure export settings to deliver disk images created from your image build, using a file format that
     *        is compatible with your VMs in that Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        setS3ExportConfiguration(s3ExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The Windows faster-launching configurations to use for AMI distribution.
     * </p>
     * 
     * @return The Windows faster-launching configurations to use for AMI distribution.
     */

    public java.util.List<FastLaunchConfiguration> getFastLaunchConfigurations() {
        return fastLaunchConfigurations;
    }

    /**
     * <p>
     * The Windows faster-launching configurations to use for AMI distribution.
     * </p>
     * 
     * @param fastLaunchConfigurations
     *        The Windows faster-launching configurations to use for AMI distribution.
     */

    public void setFastLaunchConfigurations(java.util.Collection<FastLaunchConfiguration> fastLaunchConfigurations) {
        if (fastLaunchConfigurations == null) {
            this.fastLaunchConfigurations = null;
            return;
        }

        this.fastLaunchConfigurations = new java.util.ArrayList<FastLaunchConfiguration>(fastLaunchConfigurations);
    }

    /**
     * <p>
     * The Windows faster-launching configurations to use for AMI distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFastLaunchConfigurations(java.util.Collection)} or
     * {@link #withFastLaunchConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fastLaunchConfigurations
     *        The Windows faster-launching configurations to use for AMI distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withFastLaunchConfigurations(FastLaunchConfiguration... fastLaunchConfigurations) {
        if (this.fastLaunchConfigurations == null) {
            setFastLaunchConfigurations(new java.util.ArrayList<FastLaunchConfiguration>(fastLaunchConfigurations.length));
        }
        for (FastLaunchConfiguration ele : fastLaunchConfigurations) {
            this.fastLaunchConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Windows faster-launching configurations to use for AMI distribution.
     * </p>
     * 
     * @param fastLaunchConfigurations
     *        The Windows faster-launching configurations to use for AMI distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withFastLaunchConfigurations(java.util.Collection<FastLaunchConfiguration> fastLaunchConfigurations) {
        setFastLaunchConfigurations(fastLaunchConfigurations);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAmiDistributionConfiguration() != null)
            sb.append("AmiDistributionConfiguration: ").append(getAmiDistributionConfiguration()).append(",");
        if (getContainerDistributionConfiguration() != null)
            sb.append("ContainerDistributionConfiguration: ").append(getContainerDistributionConfiguration()).append(",");
        if (getLicenseConfigurationArns() != null)
            sb.append("LicenseConfigurationArns: ").append(getLicenseConfigurationArns()).append(",");
        if (getLaunchTemplateConfigurations() != null)
            sb.append("LaunchTemplateConfigurations: ").append(getLaunchTemplateConfigurations()).append(",");
        if (getS3ExportConfiguration() != null)
            sb.append("S3ExportConfiguration: ").append(getS3ExportConfiguration()).append(",");
        if (getFastLaunchConfigurations() != null)
            sb.append("FastLaunchConfigurations: ").append(getFastLaunchConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAmiDistributionConfiguration() == null ^ this.getAmiDistributionConfiguration() == null)
            return false;
        if (other.getAmiDistributionConfiguration() != null && other.getAmiDistributionConfiguration().equals(this.getAmiDistributionConfiguration()) == false)
            return false;
        if (other.getContainerDistributionConfiguration() == null ^ this.getContainerDistributionConfiguration() == null)
            return false;
        if (other.getContainerDistributionConfiguration() != null
                && other.getContainerDistributionConfiguration().equals(this.getContainerDistributionConfiguration()) == false)
            return false;
        if (other.getLicenseConfigurationArns() == null ^ this.getLicenseConfigurationArns() == null)
            return false;
        if (other.getLicenseConfigurationArns() != null && other.getLicenseConfigurationArns().equals(this.getLicenseConfigurationArns()) == false)
            return false;
        if (other.getLaunchTemplateConfigurations() == null ^ this.getLaunchTemplateConfigurations() == null)
            return false;
        if (other.getLaunchTemplateConfigurations() != null && other.getLaunchTemplateConfigurations().equals(this.getLaunchTemplateConfigurations()) == false)
            return false;
        if (other.getS3ExportConfiguration() == null ^ this.getS3ExportConfiguration() == null)
            return false;
        if (other.getS3ExportConfiguration() != null && other.getS3ExportConfiguration().equals(this.getS3ExportConfiguration()) == false)
            return false;
        if (other.getFastLaunchConfigurations() == null ^ this.getFastLaunchConfigurations() == null)
            return false;
        if (other.getFastLaunchConfigurations() != null && other.getFastLaunchConfigurations().equals(this.getFastLaunchConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAmiDistributionConfiguration() == null) ? 0 : getAmiDistributionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getContainerDistributionConfiguration() == null) ? 0 : getContainerDistributionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLicenseConfigurationArns() == null) ? 0 : getLicenseConfigurationArns().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateConfigurations() == null) ? 0 : getLaunchTemplateConfigurations().hashCode());
        hashCode = prime * hashCode + ((getS3ExportConfiguration() == null) ? 0 : getS3ExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFastLaunchConfigurations() == null) ? 0 : getFastLaunchConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public Distribution clone() {
        try {
            return (Distribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.DistributionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
