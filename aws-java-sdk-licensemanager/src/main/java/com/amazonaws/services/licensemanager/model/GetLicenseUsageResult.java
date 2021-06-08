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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseUsage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * License usage details.
     * </p>
     */
    private LicenseUsage licenseUsage;

    /**
     * <p>
     * License usage details.
     * </p>
     * 
     * @param licenseUsage
     *        License usage details.
     */

    public void setLicenseUsage(LicenseUsage licenseUsage) {
        this.licenseUsage = licenseUsage;
    }

    /**
     * <p>
     * License usage details.
     * </p>
     * 
     * @return License usage details.
     */

    public LicenseUsage getLicenseUsage() {
        return this.licenseUsage;
    }

    /**
     * <p>
     * License usage details.
     * </p>
     * 
     * @param licenseUsage
     *        License usage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseUsageResult withLicenseUsage(LicenseUsage licenseUsage) {
        setLicenseUsage(licenseUsage);
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
        if (getLicenseUsage() != null)
            sb.append("LicenseUsage: ").append(getLicenseUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLicenseUsageResult == false)
            return false;
        GetLicenseUsageResult other = (GetLicenseUsageResult) obj;
        if (other.getLicenseUsage() == null ^ this.getLicenseUsage() == null)
            return false;
        if (other.getLicenseUsage() != null && other.getLicenseUsage().equals(this.getLicenseUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseUsage() == null) ? 0 : getLicenseUsage().hashCode());
        return hashCode;
    }

    @Override
    public GetLicenseUsageResult clone() {
        try {
            return (GetLicenseUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
