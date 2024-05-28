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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetRevocationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRevocationStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of the signature that validates the profile or job.
     * </p>
     */
    private java.util.Date signatureTimestamp;
    /**
     * <p>
     * The ID of a signing platform.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * The version of a signing profile.
     * </p>
     */
    private String profileVersionArn;
    /**
     * <p>
     * The ARN of a signing job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * A list of composite signed hashes that identify certificates.
     * </p>
     * <p>
     * A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined with a
     * parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     * </p>
     * <p>
     * The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     * </p>
     * <p>
     * <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     * </p>
     * <p>
     * <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     * </p>
     * <p>
     * <code>cat certificateHash.hex | tr -d '\n'</code>
     * </p>
     */
    private java.util.List<String> certificateHashes;

    /**
     * <p>
     * The timestamp of the signature that validates the profile or job.
     * </p>
     * 
     * @param signatureTimestamp
     *        The timestamp of the signature that validates the profile or job.
     */

    public void setSignatureTimestamp(java.util.Date signatureTimestamp) {
        this.signatureTimestamp = signatureTimestamp;
    }

    /**
     * <p>
     * The timestamp of the signature that validates the profile or job.
     * </p>
     * 
     * @return The timestamp of the signature that validates the profile or job.
     */

    public java.util.Date getSignatureTimestamp() {
        return this.signatureTimestamp;
    }

    /**
     * <p>
     * The timestamp of the signature that validates the profile or job.
     * </p>
     * 
     * @param signatureTimestamp
     *        The timestamp of the signature that validates the profile or job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusRequest withSignatureTimestamp(java.util.Date signatureTimestamp) {
        setSignatureTimestamp(signatureTimestamp);
        return this;
    }

    /**
     * <p>
     * The ID of a signing platform.
     * </p>
     * 
     * @param platformId
     *        The ID of a signing platform.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The ID of a signing platform.
     * </p>
     * 
     * @return The ID of a signing platform.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The ID of a signing platform.
     * </p>
     * 
     * @param platformId
     *        The ID of a signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusRequest withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * The version of a signing profile.
     * </p>
     * 
     * @param profileVersionArn
     *        The version of a signing profile.
     */

    public void setProfileVersionArn(String profileVersionArn) {
        this.profileVersionArn = profileVersionArn;
    }

    /**
     * <p>
     * The version of a signing profile.
     * </p>
     * 
     * @return The version of a signing profile.
     */

    public String getProfileVersionArn() {
        return this.profileVersionArn;
    }

    /**
     * <p>
     * The version of a signing profile.
     * </p>
     * 
     * @param profileVersionArn
     *        The version of a signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusRequest withProfileVersionArn(String profileVersionArn) {
        setProfileVersionArn(profileVersionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a signing job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of a signing job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of a signing job.
     * </p>
     * 
     * @return The ARN of a signing job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN of a signing job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of a signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusRequest withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * A list of composite signed hashes that identify certificates.
     * </p>
     * <p>
     * A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined with a
     * parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     * </p>
     * <p>
     * The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     * </p>
     * <p>
     * <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     * </p>
     * <p>
     * <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     * </p>
     * <p>
     * <code>cat certificateHash.hex | tr -d '\n'</code>
     * </p>
     * 
     * @return A list of composite signed hashes that identify certificates.</p>
     *         <p>
     *         A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined
     *         with a parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     *         </p>
     *         <p>
     *         The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     *         </p>
     *         <p>
     *         <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     *         </p>
     *         <p>
     *         <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     *         </p>
     *         <p>
     *         <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     *         </p>
     *         <p>
     *         <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     *         </p>
     *         <p>
     *         <code>cat certificateHash.hex | tr -d '\n'</code>
     */

    public java.util.List<String> getCertificateHashes() {
        return certificateHashes;
    }

    /**
     * <p>
     * A list of composite signed hashes that identify certificates.
     * </p>
     * <p>
     * A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined with a
     * parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     * </p>
     * <p>
     * The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     * </p>
     * <p>
     * <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     * </p>
     * <p>
     * <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     * </p>
     * <p>
     * <code>cat certificateHash.hex | tr -d '\n'</code>
     * </p>
     * 
     * @param certificateHashes
     *        A list of composite signed hashes that identify certificates.</p>
     *        <p>
     *        A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined
     *        with a parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     *        </p>
     *        <p>
     *        The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     *        </p>
     *        <p>
     *        <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     *        </p>
     *        <p>
     *        <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     *        </p>
     *        <p>
     *        <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     *        </p>
     *        <p>
     *        <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     *        </p>
     *        <p>
     *        <code>cat certificateHash.hex | tr -d '\n'</code>
     */

    public void setCertificateHashes(java.util.Collection<String> certificateHashes) {
        if (certificateHashes == null) {
            this.certificateHashes = null;
            return;
        }

        this.certificateHashes = new java.util.ArrayList<String>(certificateHashes);
    }

    /**
     * <p>
     * A list of composite signed hashes that identify certificates.
     * </p>
     * <p>
     * A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined with a
     * parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     * </p>
     * <p>
     * The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     * </p>
     * <p>
     * <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     * </p>
     * <p>
     * <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     * </p>
     * <p>
     * <code>cat certificateHash.hex | tr -d '\n'</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateHashes(java.util.Collection)} or {@link #withCertificateHashes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param certificateHashes
     *        A list of composite signed hashes that identify certificates.</p>
     *        <p>
     *        A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined
     *        with a parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     *        </p>
     *        <p>
     *        The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     *        </p>
     *        <p>
     *        <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     *        </p>
     *        <p>
     *        <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     *        </p>
     *        <p>
     *        <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     *        </p>
     *        <p>
     *        <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     *        </p>
     *        <p>
     *        <code>cat certificateHash.hex | tr -d '\n'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusRequest withCertificateHashes(String... certificateHashes) {
        if (this.certificateHashes == null) {
            setCertificateHashes(new java.util.ArrayList<String>(certificateHashes.length));
        }
        for (String ele : certificateHashes) {
            this.certificateHashes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of composite signed hashes that identify certificates.
     * </p>
     * <p>
     * A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined with a
     * parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     * </p>
     * <p>
     * The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     * </p>
     * <p>
     * <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     * </p>
     * <p>
     * <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     * </p>
     * <p>
     * <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     * </p>
     * <p>
     * <code>cat certificateHash.hex | tr -d '\n'</code>
     * </p>
     * 
     * @param certificateHashes
     *        A list of composite signed hashes that identify certificates.</p>
     *        <p>
     *        A certificate identifier consists of a subject certificate TBS hash (signed by the parent CA) combined
     *        with a parent CA TBS hash (signed by the parent CA’s CA). Root certificates are defined as their own CA.
     *        </p>
     *        <p>
     *        The following example shows how to calculate a hash for this parameter using OpenSSL commands:
     *        </p>
     *        <p>
     *        <code>openssl asn1parse -in childCert.pem -strparse 4 -out childCert.tbs</code>
     *        </p>
     *        <p>
     *        <code>openssl sha384 &lt; childCert.tbs -binary &gt; childCertTbsHash</code>
     *        </p>
     *        <p>
     *        <code>openssl asn1parse -in parentCert.pem -strparse 4 -out parentCert.tbs</code>
     *        </p>
     *        <p>
     *        <code>openssl sha384 &lt; parentCert.tbs -binary &gt; parentCertTbsHash xxd -p childCertTbsHash &gt; certificateHash.hex xxd -p parentCertTbsHash &gt;&gt; certificateHash.hex</code>
     *        </p>
     *        <p>
     *        <code>cat certificateHash.hex | tr -d '\n'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusRequest withCertificateHashes(java.util.Collection<String> certificateHashes) {
        setCertificateHashes(certificateHashes);
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
        if (getSignatureTimestamp() != null)
            sb.append("SignatureTimestamp: ").append(getSignatureTimestamp()).append(",");
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getProfileVersionArn() != null)
            sb.append("ProfileVersionArn: ").append(getProfileVersionArn()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getCertificateHashes() != null)
            sb.append("CertificateHashes: ").append(getCertificateHashes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRevocationStatusRequest == false)
            return false;
        GetRevocationStatusRequest other = (GetRevocationStatusRequest) obj;
        if (other.getSignatureTimestamp() == null ^ this.getSignatureTimestamp() == null)
            return false;
        if (other.getSignatureTimestamp() != null && other.getSignatureTimestamp().equals(this.getSignatureTimestamp()) == false)
            return false;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
            return false;
        if (other.getProfileVersionArn() == null ^ this.getProfileVersionArn() == null)
            return false;
        if (other.getProfileVersionArn() != null && other.getProfileVersionArn().equals(this.getProfileVersionArn()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getCertificateHashes() == null ^ this.getCertificateHashes() == null)
            return false;
        if (other.getCertificateHashes() != null && other.getCertificateHashes().equals(this.getCertificateHashes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignatureTimestamp() == null) ? 0 : getSignatureTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getProfileVersionArn() == null) ? 0 : getProfileVersionArn().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateHashes() == null) ? 0 : getCertificateHashes().hashCode());
        return hashCode;
    }

    @Override
    public GetRevocationStatusRequest clone() {
        return (GetRevocationStatusRequest) super.clone();
    }

}
