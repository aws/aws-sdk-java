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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ExtendLicenseConsumption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendLicenseConsumptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * License consumption token.
     * </p>
     */
    private String licenseConsumptionToken;
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request. Provides an
     * error response if you do not have the required permissions.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * License consumption token.
     * </p>
     * 
     * @param licenseConsumptionToken
     *        License consumption token.
     */

    public void setLicenseConsumptionToken(String licenseConsumptionToken) {
        this.licenseConsumptionToken = licenseConsumptionToken;
    }

    /**
     * <p>
     * License consumption token.
     * </p>
     * 
     * @return License consumption token.
     */

    public String getLicenseConsumptionToken() {
        return this.licenseConsumptionToken;
    }

    /**
     * <p>
     * License consumption token.
     * </p>
     * 
     * @param licenseConsumptionToken
     *        License consumption token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendLicenseConsumptionRequest withLicenseConsumptionToken(String licenseConsumptionToken) {
        setLicenseConsumptionToken(licenseConsumptionToken);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request. Provides an
     * error response if you do not have the required permissions.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the required permissions for the action, without actually making the request.
     *        Provides an error response if you do not have the required permissions.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request. Provides an
     * error response if you do not have the required permissions.
     * </p>
     * 
     * @return Checks whether you have the required permissions for the action, without actually making the request.
     *         Provides an error response if you do not have the required permissions.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request. Provides an
     * error response if you do not have the required permissions.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the required permissions for the action, without actually making the request.
     *        Provides an error response if you do not have the required permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendLicenseConsumptionRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without actually making the request. Provides an
     * error response if you do not have the required permissions.
     * </p>
     * 
     * @return Checks whether you have the required permissions for the action, without actually making the request.
     *         Provides an error response if you do not have the required permissions.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getLicenseConsumptionToken() != null)
            sb.append("LicenseConsumptionToken: ").append(getLicenseConsumptionToken()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendLicenseConsumptionRequest == false)
            return false;
        ExtendLicenseConsumptionRequest other = (ExtendLicenseConsumptionRequest) obj;
        if (other.getLicenseConsumptionToken() == null ^ this.getLicenseConsumptionToken() == null)
            return false;
        if (other.getLicenseConsumptionToken() != null && other.getLicenseConsumptionToken().equals(this.getLicenseConsumptionToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConsumptionToken() == null) ? 0 : getLicenseConsumptionToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public ExtendLicenseConsumptionRequest clone() {
        return (ExtendLicenseConsumptionRequest) super.clone();
    }

}
