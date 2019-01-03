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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information for a certificate revocation list (CRL). Your private certificate authority (CA)
 * creates base CRLs. Delta CRLs are not supported. You can enable CRLs for your new or an existing private CA by
 * setting the <b>Enabled</b> parameter to <code>true</code>. Your private CA writes CRLs to an S3 bucket that you
 * specify in the <b>S3BucketName</b> parameter. You can hide the name of your bucket by specifying a value for the
 * <b>CustomCname</b> parameter. Your private CA copies the CNAME or the S3 bucket name to the <b>CRL Distribution
 * Points</b> extension of each certificate it issues. Your S3 bucket policy must give write permission to ACM PCA.
 * </p>
 * <p>
 * Your private CA uses the value in the <b>ExpirationInDays</b> parameter to calculate the <b>nextUpdate</b> field in
 * the CRL. The CRL is refreshed at 1/2 the age of next update or when a certificate is revoked. When a certificate is
 * revoked, it is recorded in the next CRL that is generated and in the next audit report. Only time valid certificates
 * are listed in the CRL. Expired certificates are not included.
 * </p>
 * <p>
 * CRLs contain the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Version</b>: The current version number defined in RFC 5280 is V2. The integer value is 0x1.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Signature Algorithm</b>: The name of the algorithm used to sign the CRL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Issuer</b>: The X.500 distinguished name of your private CA that issued the CRL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Last Update</b>: The issue date and time of this CRL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Next Update</b>: The day and time by which the next CRL will be issued.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Revoked Certificates</b>: List of revoked certificates. Each list item contains the following information.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Serial Number</b>: The serial number, in hexadecimal format, of the revoked certificate.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Revocation Date</b>: Date and time the certificate was revoked.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>CRL Entry Extensions</b>: Optional extensions for the CRL entry.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>X509v3 CRL Reason Code</b>: Reason the certificate was revoked.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>CRL Extensions</b>: Optional extensions for the CRL.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>X509v3 Authority Key Identifier</b>: Identifies the public key associated with the private key used to sign the
 * certificate.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>X509v3 CRL Number:</b>: Decimal sequence number for the CRL.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Signature Algorithm</b>: Algorithm used by your private CA to sign the CRL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Signature Value</b>: Signature computed over the CRL.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Certificate revocation lists created by ACM PCA are DER-encoded. You can use the following OpenSSL command to list a
 * CRL.
 * </p>
 * <p>
 * <code>openssl crl -inform DER -text -in <i>crl_path</i> -noout</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CrlConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to
     * enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a> operation or for
     * an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Number of days until a certificate expires.
     * </p>
     */
    private Integer expirationInDays;
    /**
     * <p>
     * Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an alias for
     * the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
     * </p>
     */
    private String customCname;
    /**
     * <p>
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b> argument,
     * the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the issued certificate.
     * You can change the name of your bucket by calling the <a>UpdateCertificateAuthority</a> operation. You must
     * specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to
     * enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a> operation or for
     * an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     * </p>
     * 
     * @param enabled
     *        Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this
     *        value to enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a>
     *        operation or for an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to
     * enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a> operation or for
     * an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     * </p>
     * 
     * @return Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this
     *         value to enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a>
     *         operation or for an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to
     * enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a> operation or for
     * an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     * </p>
     * 
     * @param enabled
     *        Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this
     *        value to enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a>
     *        operation or for an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to
     * enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a> operation or for
     * an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     * </p>
     * 
     * @return Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this
     *         value to enable certificate revocation for a new CA when you call the <a>CreateCertificateAuthority</a>
     *         operation or for an existing CA when you call the <a>UpdateCertificateAuthority</a> operation.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Number of days until a certificate expires.
     * </p>
     * 
     * @param expirationInDays
     *        Number of days until a certificate expires.
     */

    public void setExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * <p>
     * Number of days until a certificate expires.
     * </p>
     * 
     * @return Number of days until a certificate expires.
     */

    public Integer getExpirationInDays() {
        return this.expirationInDays;
    }

    /**
     * <p>
     * Number of days until a certificate expires.
     * </p>
     * 
     * @param expirationInDays
     *        Number of days until a certificate expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlConfiguration withExpirationInDays(Integer expirationInDays) {
        setExpirationInDays(expirationInDays);
        return this;
    }

    /**
     * <p>
     * Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an alias for
     * the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
     * </p>
     * 
     * @param customCname
     *        Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an
     *        alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be
     *        public.
     */

    public void setCustomCname(String customCname) {
        this.customCname = customCname;
    }

    /**
     * <p>
     * Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an alias for
     * the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
     * </p>
     * 
     * @return Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an
     *         alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be
     *         public.
     */

    public String getCustomCname() {
        return this.customCname;
    }

    /**
     * <p>
     * Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an alias for
     * the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
     * </p>
     * 
     * @param customCname
     *        Name inserted into the certificate <b>CRL Distribution Points</b> extension that enables the use of an
     *        alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be
     *        public.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlConfiguration withCustomCname(String customCname) {
        setCustomCname(customCname);
        return this;
    }

    /**
     * <p>
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b> argument,
     * the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the issued certificate.
     * You can change the name of your bucket by calling the <a>UpdateCertificateAuthority</a> operation. You must
     * specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
     * </p>
     * 
     * @param s3BucketName
     *        Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b>
     *        argument, the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the
     *        issued certificate. You can change the name of your bucket by calling the
     *        <a>UpdateCertificateAuthority</a> operation. You must specify a bucket policy that allows ACM PCA to write
     *        the CRL to your bucket.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b> argument,
     * the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the issued certificate.
     * You can change the name of your bucket by calling the <a>UpdateCertificateAuthority</a> operation. You must
     * specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
     * </p>
     * 
     * @return Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b>
     *         argument, the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the
     *         issued certificate. You can change the name of your bucket by calling the
     *         <a>UpdateCertificateAuthority</a> operation. You must specify a bucket policy that allows ACM PCA to
     *         write the CRL to your bucket.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b> argument,
     * the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the issued certificate.
     * You can change the name of your bucket by calling the <a>UpdateCertificateAuthority</a> operation. You must
     * specify a bucket policy that allows ACM PCA to write the CRL to your bucket.
     * </p>
     * 
     * @param s3BucketName
     *        Name of the S3 bucket that contains the CRL. If you do not provide a value for the <b>CustomCname</b>
     *        argument, the name of your S3 bucket is placed into the <b>CRL Distribution Points</b> extension of the
     *        issued certificate. You can change the name of your bucket by calling the
     *        <a>UpdateCertificateAuthority</a> operation. You must specify a bucket policy that allows ACM PCA to write
     *        the CRL to your bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrlConfiguration withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getExpirationInDays() != null)
            sb.append("ExpirationInDays: ").append(getExpirationInDays()).append(",");
        if (getCustomCname() != null)
            sb.append("CustomCname: ").append(getCustomCname()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrlConfiguration == false)
            return false;
        CrlConfiguration other = (CrlConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getExpirationInDays() == null ^ this.getExpirationInDays() == null)
            return false;
        if (other.getExpirationInDays() != null && other.getExpirationInDays().equals(this.getExpirationInDays()) == false)
            return false;
        if (other.getCustomCname() == null ^ this.getCustomCname() == null)
            return false;
        if (other.getCustomCname() != null && other.getCustomCname().equals(this.getCustomCname()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getExpirationInDays() == null) ? 0 : getExpirationInDays().hashCode());
        hashCode = prime * hashCode + ((getCustomCname() == null) ? 0 : getCustomCname().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        return hashCode;
    }

    @Override
    public CrlConfiguration clone() {
        try {
            return (CrlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CrlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
