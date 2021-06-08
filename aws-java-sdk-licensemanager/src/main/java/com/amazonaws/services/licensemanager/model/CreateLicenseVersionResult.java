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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLicenseVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * License ARN.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * New version of the license.
     * </p>
     */
    private String version;
    /**
     * <p>
     * License status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * License ARN.
     * </p>
     * 
     * @param licenseArn
     *        License ARN.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * License ARN.
     * </p>
     * 
     * @return License ARN.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * License ARN.
     * </p>
     * 
     * @param licenseArn
     *        License ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionResult withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * New version of the license.
     * </p>
     * 
     * @param version
     *        New version of the license.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * New version of the license.
     * </p>
     * 
     * @return New version of the license.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * New version of the license.
     * </p>
     * 
     * @param version
     *        New version of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @see LicenseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @return License status.
     * @see LicenseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseStatus
     */

    public CreateLicenseVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseStatus
     */

    public CreateLicenseVersionResult withStatus(LicenseStatus status) {
        this.status = status.toString();
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
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLicenseVersionResult == false)
            return false;
        CreateLicenseVersionResult other = (CreateLicenseVersionResult) obj;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateLicenseVersionResult clone() {
        try {
            return (CreateLicenseVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
