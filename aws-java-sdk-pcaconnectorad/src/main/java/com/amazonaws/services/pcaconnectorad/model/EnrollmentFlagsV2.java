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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Template configurations for v2 template schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/EnrollmentFlagsV2" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnrollmentFlagsV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allow renewal using the same key.
     * </p>
     */
    private Boolean enableKeyReuseOnNtTokenKeysetStorageFull;
    /**
     * <p>
     * Include symmetric algorithms allowed by the subject.
     * </p>
     */
    private Boolean includeSymmetricAlgorithms;
    /**
     * <p>
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued
     * certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     * </p>
     */
    private Boolean noSecurityExtension;
    /**
     * <p>
     * Delete expired or revoked certificates instead of archiving them.
     * </p>
     */
    private Boolean removeInvalidCertificateFromPersonalStore;
    /**
     * <p>
     * Require user interaction when the subject is enrolled and the private key associated with the certificate is
     * used.
     * </p>
     */
    private Boolean userInteractionRequired;

    /**
     * <p>
     * Allow renewal using the same key.
     * </p>
     * 
     * @param enableKeyReuseOnNtTokenKeysetStorageFull
     *        Allow renewal using the same key.
     */

    public void setEnableKeyReuseOnNtTokenKeysetStorageFull(Boolean enableKeyReuseOnNtTokenKeysetStorageFull) {
        this.enableKeyReuseOnNtTokenKeysetStorageFull = enableKeyReuseOnNtTokenKeysetStorageFull;
    }

    /**
     * <p>
     * Allow renewal using the same key.
     * </p>
     * 
     * @return Allow renewal using the same key.
     */

    public Boolean getEnableKeyReuseOnNtTokenKeysetStorageFull() {
        return this.enableKeyReuseOnNtTokenKeysetStorageFull;
    }

    /**
     * <p>
     * Allow renewal using the same key.
     * </p>
     * 
     * @param enableKeyReuseOnNtTokenKeysetStorageFull
     *        Allow renewal using the same key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentFlagsV2 withEnableKeyReuseOnNtTokenKeysetStorageFull(Boolean enableKeyReuseOnNtTokenKeysetStorageFull) {
        setEnableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull);
        return this;
    }

    /**
     * <p>
     * Allow renewal using the same key.
     * </p>
     * 
     * @return Allow renewal using the same key.
     */

    public Boolean isEnableKeyReuseOnNtTokenKeysetStorageFull() {
        return this.enableKeyReuseOnNtTokenKeysetStorageFull;
    }

    /**
     * <p>
     * Include symmetric algorithms allowed by the subject.
     * </p>
     * 
     * @param includeSymmetricAlgorithms
     *        Include symmetric algorithms allowed by the subject.
     */

    public void setIncludeSymmetricAlgorithms(Boolean includeSymmetricAlgorithms) {
        this.includeSymmetricAlgorithms = includeSymmetricAlgorithms;
    }

    /**
     * <p>
     * Include symmetric algorithms allowed by the subject.
     * </p>
     * 
     * @return Include symmetric algorithms allowed by the subject.
     */

    public Boolean getIncludeSymmetricAlgorithms() {
        return this.includeSymmetricAlgorithms;
    }

    /**
     * <p>
     * Include symmetric algorithms allowed by the subject.
     * </p>
     * 
     * @param includeSymmetricAlgorithms
     *        Include symmetric algorithms allowed by the subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentFlagsV2 withIncludeSymmetricAlgorithms(Boolean includeSymmetricAlgorithms) {
        setIncludeSymmetricAlgorithms(includeSymmetricAlgorithms);
        return this;
    }

    /**
     * <p>
     * Include symmetric algorithms allowed by the subject.
     * </p>
     * 
     * @return Include symmetric algorithms allowed by the subject.
     */

    public Boolean isIncludeSymmetricAlgorithms() {
        return this.includeSymmetricAlgorithms;
    }

    /**
     * <p>
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued
     * certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     * </p>
     * 
     * @param noSecurityExtension
     *        This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     *        (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the
     *        issued certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     */

    public void setNoSecurityExtension(Boolean noSecurityExtension) {
        this.noSecurityExtension = noSecurityExtension;
    }

    /**
     * <p>
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued
     * certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     * </p>
     * 
     * @return This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     *         (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the
     *         issued certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     */

    public Boolean getNoSecurityExtension() {
        return this.noSecurityExtension;
    }

    /**
     * <p>
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued
     * certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     * </p>
     * 
     * @param noSecurityExtension
     *        This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     *        (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the
     *        issued certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentFlagsV2 withNoSecurityExtension(Boolean noSecurityExtension) {
        setNoSecurityExtension(noSecurityExtension);
        return this;
    }

    /**
     * <p>
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued
     * certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     * </p>
     * 
     * @return This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     *         (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the
     *         issued certificate. This addresses a Windows Kerberos elevation-of-privilege vulnerability.
     */

    public Boolean isNoSecurityExtension() {
        return this.noSecurityExtension;
    }

    /**
     * <p>
     * Delete expired or revoked certificates instead of archiving them.
     * </p>
     * 
     * @param removeInvalidCertificateFromPersonalStore
     *        Delete expired or revoked certificates instead of archiving them.
     */

    public void setRemoveInvalidCertificateFromPersonalStore(Boolean removeInvalidCertificateFromPersonalStore) {
        this.removeInvalidCertificateFromPersonalStore = removeInvalidCertificateFromPersonalStore;
    }

    /**
     * <p>
     * Delete expired or revoked certificates instead of archiving them.
     * </p>
     * 
     * @return Delete expired or revoked certificates instead of archiving them.
     */

    public Boolean getRemoveInvalidCertificateFromPersonalStore() {
        return this.removeInvalidCertificateFromPersonalStore;
    }

    /**
     * <p>
     * Delete expired or revoked certificates instead of archiving them.
     * </p>
     * 
     * @param removeInvalidCertificateFromPersonalStore
     *        Delete expired or revoked certificates instead of archiving them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentFlagsV2 withRemoveInvalidCertificateFromPersonalStore(Boolean removeInvalidCertificateFromPersonalStore) {
        setRemoveInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore);
        return this;
    }

    /**
     * <p>
     * Delete expired or revoked certificates instead of archiving them.
     * </p>
     * 
     * @return Delete expired or revoked certificates instead of archiving them.
     */

    public Boolean isRemoveInvalidCertificateFromPersonalStore() {
        return this.removeInvalidCertificateFromPersonalStore;
    }

    /**
     * <p>
     * Require user interaction when the subject is enrolled and the private key associated with the certificate is
     * used.
     * </p>
     * 
     * @param userInteractionRequired
     *        Require user interaction when the subject is enrolled and the private key associated with the certificate
     *        is used.
     */

    public void setUserInteractionRequired(Boolean userInteractionRequired) {
        this.userInteractionRequired = userInteractionRequired;
    }

    /**
     * <p>
     * Require user interaction when the subject is enrolled and the private key associated with the certificate is
     * used.
     * </p>
     * 
     * @return Require user interaction when the subject is enrolled and the private key associated with the certificate
     *         is used.
     */

    public Boolean getUserInteractionRequired() {
        return this.userInteractionRequired;
    }

    /**
     * <p>
     * Require user interaction when the subject is enrolled and the private key associated with the certificate is
     * used.
     * </p>
     * 
     * @param userInteractionRequired
     *        Require user interaction when the subject is enrolled and the private key associated with the certificate
     *        is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentFlagsV2 withUserInteractionRequired(Boolean userInteractionRequired) {
        setUserInteractionRequired(userInteractionRequired);
        return this;
    }

    /**
     * <p>
     * Require user interaction when the subject is enrolled and the private key associated with the certificate is
     * used.
     * </p>
     * 
     * @return Require user interaction when the subject is enrolled and the private key associated with the certificate
     *         is used.
     */

    public Boolean isUserInteractionRequired() {
        return this.userInteractionRequired;
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
        if (getEnableKeyReuseOnNtTokenKeysetStorageFull() != null)
            sb.append("EnableKeyReuseOnNtTokenKeysetStorageFull: ").append(getEnableKeyReuseOnNtTokenKeysetStorageFull()).append(",");
        if (getIncludeSymmetricAlgorithms() != null)
            sb.append("IncludeSymmetricAlgorithms: ").append(getIncludeSymmetricAlgorithms()).append(",");
        if (getNoSecurityExtension() != null)
            sb.append("NoSecurityExtension: ").append(getNoSecurityExtension()).append(",");
        if (getRemoveInvalidCertificateFromPersonalStore() != null)
            sb.append("RemoveInvalidCertificateFromPersonalStore: ").append(getRemoveInvalidCertificateFromPersonalStore()).append(",");
        if (getUserInteractionRequired() != null)
            sb.append("UserInteractionRequired: ").append(getUserInteractionRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnrollmentFlagsV2 == false)
            return false;
        EnrollmentFlagsV2 other = (EnrollmentFlagsV2) obj;
        if (other.getEnableKeyReuseOnNtTokenKeysetStorageFull() == null ^ this.getEnableKeyReuseOnNtTokenKeysetStorageFull() == null)
            return false;
        if (other.getEnableKeyReuseOnNtTokenKeysetStorageFull() != null
                && other.getEnableKeyReuseOnNtTokenKeysetStorageFull().equals(this.getEnableKeyReuseOnNtTokenKeysetStorageFull()) == false)
            return false;
        if (other.getIncludeSymmetricAlgorithms() == null ^ this.getIncludeSymmetricAlgorithms() == null)
            return false;
        if (other.getIncludeSymmetricAlgorithms() != null && other.getIncludeSymmetricAlgorithms().equals(this.getIncludeSymmetricAlgorithms()) == false)
            return false;
        if (other.getNoSecurityExtension() == null ^ this.getNoSecurityExtension() == null)
            return false;
        if (other.getNoSecurityExtension() != null && other.getNoSecurityExtension().equals(this.getNoSecurityExtension()) == false)
            return false;
        if (other.getRemoveInvalidCertificateFromPersonalStore() == null ^ this.getRemoveInvalidCertificateFromPersonalStore() == null)
            return false;
        if (other.getRemoveInvalidCertificateFromPersonalStore() != null
                && other.getRemoveInvalidCertificateFromPersonalStore().equals(this.getRemoveInvalidCertificateFromPersonalStore()) == false)
            return false;
        if (other.getUserInteractionRequired() == null ^ this.getUserInteractionRequired() == null)
            return false;
        if (other.getUserInteractionRequired() != null && other.getUserInteractionRequired().equals(this.getUserInteractionRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableKeyReuseOnNtTokenKeysetStorageFull() == null) ? 0 : getEnableKeyReuseOnNtTokenKeysetStorageFull().hashCode());
        hashCode = prime * hashCode + ((getIncludeSymmetricAlgorithms() == null) ? 0 : getIncludeSymmetricAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getNoSecurityExtension() == null) ? 0 : getNoSecurityExtension().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveInvalidCertificateFromPersonalStore() == null) ? 0 : getRemoveInvalidCertificateFromPersonalStore().hashCode());
        hashCode = prime * hashCode + ((getUserInteractionRequired() == null) ? 0 : getUserInteractionRequired().hashCode());
        return hashCode;
    }

    @Override
    public EnrollmentFlagsV2 clone() {
        try {
            return (EnrollmentFlagsV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.EnrollmentFlagsV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
