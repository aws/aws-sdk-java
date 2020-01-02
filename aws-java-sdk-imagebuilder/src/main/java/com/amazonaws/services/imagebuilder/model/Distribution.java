/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Distribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Distribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * </p>
     */
    private String region;
    /**
     * <p>
     * </p>
     */
    private AmiDistributionConfiguration amiDistributionConfiguration;
    /**
     * <p>
     * </p>
     */
    private java.util.List<String> licenseConfigurationArns;

    /**
     * <p>
     * </p>
     * 
     * @param region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * </p>
     * 
     * @param region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param amiDistributionConfiguration
     */

    public void setAmiDistributionConfiguration(AmiDistributionConfiguration amiDistributionConfiguration) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public AmiDistributionConfiguration getAmiDistributionConfiguration() {
        return this.amiDistributionConfiguration;
    }

    /**
     * <p>
     * </p>
     * 
     * @param amiDistributionConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withAmiDistributionConfiguration(AmiDistributionConfiguration amiDistributionConfiguration) {
        setAmiDistributionConfiguration(amiDistributionConfiguration);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.List<String> getLicenseConfigurationArns() {
        return licenseConfigurationArns;
    }

    /**
     * <p>
     * </p>
     * 
     * @param licenseConfigurationArns
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
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurationArns(java.util.Collection)} or
     * {@link #withLicenseConfigurationArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurationArns
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
     * </p>
     * 
     * @param licenseConfigurationArns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
        setLicenseConfigurationArns(licenseConfigurationArns);
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
        if (getLicenseConfigurationArns() != null)
            sb.append("LicenseConfigurationArns: ").append(getLicenseConfigurationArns());
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
        if (other.getLicenseConfigurationArns() == null ^ this.getLicenseConfigurationArns() == null)
            return false;
        if (other.getLicenseConfigurationArns() != null && other.getLicenseConfigurationArns().equals(this.getLicenseConfigurationArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAmiDistributionConfiguration() == null) ? 0 : getAmiDistributionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLicenseConfigurationArns() == null) ? 0 : getLicenseConfigurationArns().hashCode());
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
