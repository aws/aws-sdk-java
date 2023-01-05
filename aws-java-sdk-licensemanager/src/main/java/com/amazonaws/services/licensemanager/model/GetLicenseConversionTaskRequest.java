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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConversionTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseConversionTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the license type conversion task to retrieve information on.
     * </p>
     */
    private String licenseConversionTaskId;

    /**
     * <p>
     * ID of the license type conversion task to retrieve information on.
     * </p>
     * 
     * @param licenseConversionTaskId
     *        ID of the license type conversion task to retrieve information on.
     */

    public void setLicenseConversionTaskId(String licenseConversionTaskId) {
        this.licenseConversionTaskId = licenseConversionTaskId;
    }

    /**
     * <p>
     * ID of the license type conversion task to retrieve information on.
     * </p>
     * 
     * @return ID of the license type conversion task to retrieve information on.
     */

    public String getLicenseConversionTaskId() {
        return this.licenseConversionTaskId;
    }

    /**
     * <p>
     * ID of the license type conversion task to retrieve information on.
     * </p>
     * 
     * @param licenseConversionTaskId
     *        ID of the license type conversion task to retrieve information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConversionTaskRequest withLicenseConversionTaskId(String licenseConversionTaskId) {
        setLicenseConversionTaskId(licenseConversionTaskId);
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
        if (getLicenseConversionTaskId() != null)
            sb.append("LicenseConversionTaskId: ").append(getLicenseConversionTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLicenseConversionTaskRequest == false)
            return false;
        GetLicenseConversionTaskRequest other = (GetLicenseConversionTaskRequest) obj;
        if (other.getLicenseConversionTaskId() == null ^ this.getLicenseConversionTaskId() == null)
            return false;
        if (other.getLicenseConversionTaskId() != null && other.getLicenseConversionTaskId().equals(this.getLicenseConversionTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConversionTaskId() == null) ? 0 : getLicenseConversionTaskId().hashCode());
        return hashCode;
    }

    @Override
    public GetLicenseConversionTaskRequest clone() {
        return (GetLicenseConversionTaskRequest) super.clone();
    }

}
