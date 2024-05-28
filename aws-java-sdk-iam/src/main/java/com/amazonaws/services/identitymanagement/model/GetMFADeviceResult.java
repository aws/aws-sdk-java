/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetMFADevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMFADeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The date that a specified user's MFA device was first enabled.
     * </p>
     */
    private java.util.Date enableDate;
    /**
     * <p>
     * The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and FIDO
     * certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance Metadata Service
     * (MDS)</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> certifications;

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @return The friendly name identifying the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceResult withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     * 
     * @param serialNumber
     *        Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     * 
     * @return Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     * 
     * @param serialNumber
     *        Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceResult withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The date that a specified user's MFA device was first enabled.
     * </p>
     * 
     * @param enableDate
     *        The date that a specified user's MFA device was first enabled.
     */

    public void setEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
    }

    /**
     * <p>
     * The date that a specified user's MFA device was first enabled.
     * </p>
     * 
     * @return The date that a specified user's MFA device was first enabled.
     */

    public java.util.Date getEnableDate() {
        return this.enableDate;
    }

    /**
     * <p>
     * The date that a specified user's MFA device was first enabled.
     * </p>
     * 
     * @param enableDate
     *        The date that a specified user's MFA device was first enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceResult withEnableDate(java.util.Date enableDate) {
        setEnableDate(enableDate);
        return this;
    }

    /**
     * <p>
     * The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and FIDO
     * certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance Metadata Service
     * (MDS)</a>.
     * </p>
     * 
     * @return The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and
     *         FIDO certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance
     *         Metadata Service (MDS)</a>.
     */

    public java.util.Map<String, String> getCertifications() {
        if (certifications == null) {
            certifications = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return certifications;
    }

    /**
     * <p>
     * The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and FIDO
     * certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance Metadata Service
     * (MDS)</a>.
     * </p>
     * 
     * @param certifications
     *        The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and FIDO
     *        certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance Metadata
     *        Service (MDS)</a>.
     */

    public void setCertifications(java.util.Map<String, String> certifications) {
        this.certifications = certifications == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(certifications);
    }

    /**
     * <p>
     * The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and FIDO
     * certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance Metadata Service
     * (MDS)</a>.
     * </p>
     * 
     * @param certifications
     *        The certifications of a specified user's MFA device. We currently provide FIPS-140-2, FIPS-140-3, and FIDO
     *        certification levels obtained from <a href="https://fidoalliance.org/metadata/"> FIDO Alliance Metadata
     *        Service (MDS)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceResult withCertifications(java.util.Map<String, String> certifications) {
        setCertifications(certifications);
        return this;
    }

    /**
     * Add a single Certifications entry
     *
     * @see GetMFADeviceResult#withCertifications
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceResult addCertificationsEntry(String key, String value) {
        if (null == this.certifications) {
            this.certifications = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.certifications.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.certifications.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Certifications.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceResult clearCertificationsEntries() {
        this.certifications = null;
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getEnableDate() != null)
            sb.append("EnableDate: ").append(getEnableDate()).append(",");
        if (getCertifications() != null)
            sb.append("Certifications: ").append(getCertifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMFADeviceResult == false)
            return false;
        GetMFADeviceResult other = (GetMFADeviceResult) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getEnableDate() == null ^ this.getEnableDate() == null)
            return false;
        if (other.getEnableDate() != null && other.getEnableDate().equals(this.getEnableDate()) == false)
            return false;
        if (other.getCertifications() == null ^ this.getCertifications() == null)
            return false;
        if (other.getCertifications() != null && other.getCertifications().equals(this.getCertifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getEnableDate() == null) ? 0 : getEnableDate().hashCode());
        hashCode = prime * hashCode + ((getCertifications() == null) ? 0 : getCertifications().hashCode());
        return hashCode;
    }

    @Override
    public GetMFADeviceResult clone() {
        try {
            return (GetMFADeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
