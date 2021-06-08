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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckInLicense" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckInLicenseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * License consumption token.
     * </p>
     */
    private String licenseConsumptionToken;
    /**
     * <p>
     * License beneficiary.
     * </p>
     */
    private String beneficiary;

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

    public CheckInLicenseRequest withLicenseConsumptionToken(String licenseConsumptionToken) {
        setLicenseConsumptionToken(licenseConsumptionToken);
        return this;
    }

    /**
     * <p>
     * License beneficiary.
     * </p>
     * 
     * @param beneficiary
     *        License beneficiary.
     */

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * <p>
     * License beneficiary.
     * </p>
     * 
     * @return License beneficiary.
     */

    public String getBeneficiary() {
        return this.beneficiary;
    }

    /**
     * <p>
     * License beneficiary.
     * </p>
     * 
     * @param beneficiary
     *        License beneficiary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckInLicenseRequest withBeneficiary(String beneficiary) {
        setBeneficiary(beneficiary);
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
        if (getBeneficiary() != null)
            sb.append("Beneficiary: ").append(getBeneficiary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckInLicenseRequest == false)
            return false;
        CheckInLicenseRequest other = (CheckInLicenseRequest) obj;
        if (other.getLicenseConsumptionToken() == null ^ this.getLicenseConsumptionToken() == null)
            return false;
        if (other.getLicenseConsumptionToken() != null && other.getLicenseConsumptionToken().equals(this.getLicenseConsumptionToken()) == false)
            return false;
        if (other.getBeneficiary() == null ^ this.getBeneficiary() == null)
            return false;
        if (other.getBeneficiary() != null && other.getBeneficiary().equals(this.getBeneficiary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConsumptionToken() == null) ? 0 : getLicenseConsumptionToken().hashCode());
        hashCode = prime * hashCode + ((getBeneficiary() == null) ? 0 : getBeneficiary().hashCode());
        return hashCode;
    }

    @Override
    public CheckInLicenseRequest clone() {
        return (CheckInLicenseRequest) super.clone();
    }

}
