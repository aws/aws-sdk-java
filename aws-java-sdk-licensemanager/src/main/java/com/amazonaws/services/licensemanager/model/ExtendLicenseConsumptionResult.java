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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ExtendLicenseConsumption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendLicenseConsumptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * License consumption token.
     * </p>
     */
    private String licenseConsumptionToken;
    /**
     * <p>
     * Date and time at which the license consumption expires.
     * </p>
     */
    private String expiration;

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

    public ExtendLicenseConsumptionResult withLicenseConsumptionToken(String licenseConsumptionToken) {
        setLicenseConsumptionToken(licenseConsumptionToken);
        return this;
    }

    /**
     * <p>
     * Date and time at which the license consumption expires.
     * </p>
     * 
     * @param expiration
     *        Date and time at which the license consumption expires.
     */

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Date and time at which the license consumption expires.
     * </p>
     * 
     * @return Date and time at which the license consumption expires.
     */

    public String getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * Date and time at which the license consumption expires.
     * </p>
     * 
     * @param expiration
     *        Date and time at which the license consumption expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendLicenseConsumptionResult withExpiration(String expiration) {
        setExpiration(expiration);
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
        if (getLicenseConsumptionToken() != null)
            sb.append("LicenseConsumptionToken: ").append(getLicenseConsumptionToken()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendLicenseConsumptionResult == false)
            return false;
        ExtendLicenseConsumptionResult other = (ExtendLicenseConsumptionResult) obj;
        if (other.getLicenseConsumptionToken() == null ^ this.getLicenseConsumptionToken() == null)
            return false;
        if (other.getLicenseConsumptionToken() != null && other.getLicenseConsumptionToken().equals(this.getLicenseConsumptionToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConsumptionToken() == null) ? 0 : getLicenseConsumptionToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public ExtendLicenseConsumptionResult clone() {
        try {
            return (ExtendLicenseConsumptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
