/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the license configuration that this generator reports on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ReportContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * </p>
     */
    private java.util.List<String> licenseConfigurationArns;

    /**
     * <p>
     * Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * </p>
     * 
     * @return Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     */

    public java.util.List<String> getLicenseConfigurationArns() {
        return licenseConfigurationArns;
    }

    /**
     * <p>
     * Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        Amazon Resource Number (ARN) of the license configuration that this generator reports on.
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
     * Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurationArns(java.util.Collection)} or
     * {@link #withLicenseConfigurationArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportContext withLicenseConfigurationArns(String... licenseConfigurationArns) {
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
     * Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        Amazon Resource Number (ARN) of the license configuration that this generator reports on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportContext withLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
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

        if (obj instanceof ReportContext == false)
            return false;
        ReportContext other = (ReportContext) obj;
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

        hashCode = prime * hashCode + ((getLicenseConfigurationArns() == null) ? 0 : getLicenseConfigurationArns().hashCode());
        return hashCode;
    }

    @Override
    public ReportContext clone() {
        try {
            return (ReportContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ReportContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
