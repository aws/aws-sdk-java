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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLicenseConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique ID of the configuration object to delete.
     * </p>
     */
    private String licenseConfigurationArn;

    /**
     * <p>
     * Unique ID of the configuration object to delete.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        Unique ID of the configuration object to delete.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * Unique ID of the configuration object to delete.
     * </p>
     * 
     * @return Unique ID of the configuration object to delete.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * Unique ID of the configuration object to delete.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        Unique ID of the configuration object to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLicenseConfigurationRequest withLicenseConfigurationArn(String licenseConfigurationArn) {
        setLicenseConfigurationArn(licenseConfigurationArn);
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
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: ").append(getLicenseConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLicenseConfigurationRequest == false)
            return false;
        DeleteLicenseConfigurationRequest other = (DeleteLicenseConfigurationRequest) obj;
        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLicenseConfigurationRequest clone() {
        return (DeleteLicenseConfigurationRequest) super.clone();
    }

}
