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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the public SSH host keys or the RDP certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/HostKeyAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostKeyAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SSH host key algorithm or the RDP certificate format.
     * </p>
     * <p>
     * For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     * <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     * </p>
     */
    private String algorithm;
    /**
     * <p>
     * The public SSH host key or the RDP certificate.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * The time that the SSH host key or RDP certificate was recorded by Lightsail.
     * </p>
     */
    private java.util.Date witnessedAt;
    /**
     * <p>
     * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-1 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-1 RDP fingerprint:
     * </p>
     * <p>
     * <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     * </p>
     * </li>
     * </ul>
     */
    private String fingerprintSHA1;
    /**
     * <p>
     * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-256 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-256 RDP fingerprint:
     * </p>
     * <p>
     * <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     * </p>
     * </li>
     * </ul>
     */
    private String fingerprintSHA256;
    /**
     * <p>
     * The returned RDP certificate is valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     */
    private java.util.Date notValidBefore;
    /**
     * <p>
     * The returned RDP certificate is not valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     */
    private java.util.Date notValidAfter;

    /**
     * <p>
     * The SSH host key algorithm or the RDP certificate format.
     * </p>
     * <p>
     * For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     * <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     * </p>
     * 
     * @param algorithm
     *        The SSH host key algorithm or the RDP certificate format.</p>
     *        <p>
     *        For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     *        <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * The SSH host key algorithm or the RDP certificate format.
     * </p>
     * <p>
     * For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     * <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     * </p>
     * 
     * @return The SSH host key algorithm or the RDP certificate format.</p>
     *         <p>
     *         For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     *         <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * The SSH host key algorithm or the RDP certificate format.
     * </p>
     * <p>
     * For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     * <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     * </p>
     * 
     * @param algorithm
     *        The SSH host key algorithm or the RDP certificate format.</p>
     *        <p>
     *        For SSH host keys, the algorithm may be <code>ssh-rsa</code>, <code>ecdsa-sha2-nistp256</code>,
     *        <code>ssh-ed25519</code>, etc. For RDP certificates, the algorithm is always <code>x509-cert</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * The public SSH host key or the RDP certificate.
     * </p>
     * 
     * @param publicKey
     *        The public SSH host key or the RDP certificate.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public SSH host key or the RDP certificate.
     * </p>
     * 
     * @return The public SSH host key or the RDP certificate.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public SSH host key or the RDP certificate.
     * </p>
     * 
     * @param publicKey
     *        The public SSH host key or the RDP certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The time that the SSH host key or RDP certificate was recorded by Lightsail.
     * </p>
     * 
     * @param witnessedAt
     *        The time that the SSH host key or RDP certificate was recorded by Lightsail.
     */

    public void setWitnessedAt(java.util.Date witnessedAt) {
        this.witnessedAt = witnessedAt;
    }

    /**
     * <p>
     * The time that the SSH host key or RDP certificate was recorded by Lightsail.
     * </p>
     * 
     * @return The time that the SSH host key or RDP certificate was recorded by Lightsail.
     */

    public java.util.Date getWitnessedAt() {
        return this.witnessedAt;
    }

    /**
     * <p>
     * The time that the SSH host key or RDP certificate was recorded by Lightsail.
     * </p>
     * 
     * @param witnessedAt
     *        The time that the SSH host key or RDP certificate was recorded by Lightsail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withWitnessedAt(java.util.Date witnessedAt) {
        setWitnessedAt(witnessedAt);
        return this;
    }

    /**
     * <p>
     * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-1 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-1 RDP fingerprint:
     * </p>
     * <p>
     * <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param fingerprintSHA1
     *        The SHA-1 fingerprint of the returned SSH host key or RDP certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of an SHA-1 SSH fingerprint:
     *        </p>
     *        <p>
     *        <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of an SHA-1 RDP fingerprint:
     *        </p>
     *        <p>
     *        <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     *        </p>
     *        </li>
     */

    public void setFingerprintSHA1(String fingerprintSHA1) {
        this.fingerprintSHA1 = fingerprintSHA1;
    }

    /**
     * <p>
     * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-1 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-1 RDP fingerprint:
     * </p>
     * <p>
     * <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The SHA-1 fingerprint of the returned SSH host key or RDP certificate.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Example of an SHA-1 SSH fingerprint:
     *         </p>
     *         <p>
     *         <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example of an SHA-1 RDP fingerprint:
     *         </p>
     *         <p>
     *         <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     *         </p>
     *         </li>
     */

    public String getFingerprintSHA1() {
        return this.fingerprintSHA1;
    }

    /**
     * <p>
     * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-1 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-1 RDP fingerprint:
     * </p>
     * <p>
     * <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param fingerprintSHA1
     *        The SHA-1 fingerprint of the returned SSH host key or RDP certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of an SHA-1 SSH fingerprint:
     *        </p>
     *        <p>
     *        <code>SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of an SHA-1 RDP fingerprint:
     *        </p>
     *        <p>
     *        <code>af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withFingerprintSHA1(String fingerprintSHA1) {
        setFingerprintSHA1(fingerprintSHA1);
        return this;
    }

    /**
     * <p>
     * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-256 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-256 RDP fingerprint:
     * </p>
     * <p>
     * <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param fingerprintSHA256
     *        The SHA-256 fingerprint of the returned SSH host key or RDP certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of an SHA-256 SSH fingerprint:
     *        </p>
     *        <p>
     *        <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of an SHA-256 RDP fingerprint:
     *        </p>
     *        <p>
     *        <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     *        </p>
     *        </li>
     */

    public void setFingerprintSHA256(String fingerprintSHA256) {
        this.fingerprintSHA256 = fingerprintSHA256;
    }

    /**
     * <p>
     * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-256 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-256 RDP fingerprint:
     * </p>
     * <p>
     * <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The SHA-256 fingerprint of the returned SSH host key or RDP certificate.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Example of an SHA-256 SSH fingerprint:
     *         </p>
     *         <p>
     *         <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example of an SHA-256 RDP fingerprint:
     *         </p>
     *         <p>
     *         <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     *         </p>
     *         </li>
     */

    public String getFingerprintSHA256() {
        return this.fingerprintSHA256;
    }

    /**
     * <p>
     * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example of an SHA-256 SSH fingerprint:
     * </p>
     * <p>
     * <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example of an SHA-256 RDP fingerprint:
     * </p>
     * <p>
     * <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param fingerprintSHA256
     *        The SHA-256 fingerprint of the returned SSH host key or RDP certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example of an SHA-256 SSH fingerprint:
     *        </p>
     *        <p>
     *        <code>SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example of an SHA-256 RDP fingerprint:
     *        </p>
     *        <p>
     *        <code>03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withFingerprintSHA256(String fingerprintSHA256) {
        setFingerprintSHA256(fingerprintSHA256);
        return this;
    }

    /**
     * <p>
     * The returned RDP certificate is valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     * 
     * @param notValidBefore
     *        The returned RDP certificate is valid after this point in time.</p>
     *        <p>
     *        This value is listed only for RDP certificates.
     */

    public void setNotValidBefore(java.util.Date notValidBefore) {
        this.notValidBefore = notValidBefore;
    }

    /**
     * <p>
     * The returned RDP certificate is valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     * 
     * @return The returned RDP certificate is valid after this point in time.</p>
     *         <p>
     *         This value is listed only for RDP certificates.
     */

    public java.util.Date getNotValidBefore() {
        return this.notValidBefore;
    }

    /**
     * <p>
     * The returned RDP certificate is valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     * 
     * @param notValidBefore
     *        The returned RDP certificate is valid after this point in time.</p>
     *        <p>
     *        This value is listed only for RDP certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withNotValidBefore(java.util.Date notValidBefore) {
        setNotValidBefore(notValidBefore);
        return this;
    }

    /**
     * <p>
     * The returned RDP certificate is not valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     * 
     * @param notValidAfter
     *        The returned RDP certificate is not valid after this point in time.</p>
     *        <p>
     *        This value is listed only for RDP certificates.
     */

    public void setNotValidAfter(java.util.Date notValidAfter) {
        this.notValidAfter = notValidAfter;
    }

    /**
     * <p>
     * The returned RDP certificate is not valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     * 
     * @return The returned RDP certificate is not valid after this point in time.</p>
     *         <p>
     *         This value is listed only for RDP certificates.
     */

    public java.util.Date getNotValidAfter() {
        return this.notValidAfter;
    }

    /**
     * <p>
     * The returned RDP certificate is not valid after this point in time.
     * </p>
     * <p>
     * This value is listed only for RDP certificates.
     * </p>
     * 
     * @param notValidAfter
     *        The returned RDP certificate is not valid after this point in time.</p>
     *        <p>
     *        This value is listed only for RDP certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostKeyAttributes withNotValidAfter(java.util.Date notValidAfter) {
        setNotValidAfter(notValidAfter);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getWitnessedAt() != null)
            sb.append("WitnessedAt: ").append(getWitnessedAt()).append(",");
        if (getFingerprintSHA1() != null)
            sb.append("FingerprintSHA1: ").append(getFingerprintSHA1()).append(",");
        if (getFingerprintSHA256() != null)
            sb.append("FingerprintSHA256: ").append(getFingerprintSHA256()).append(",");
        if (getNotValidBefore() != null)
            sb.append("NotValidBefore: ").append(getNotValidBefore()).append(",");
        if (getNotValidAfter() != null)
            sb.append("NotValidAfter: ").append(getNotValidAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostKeyAttributes == false)
            return false;
        HostKeyAttributes other = (HostKeyAttributes) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getWitnessedAt() == null ^ this.getWitnessedAt() == null)
            return false;
        if (other.getWitnessedAt() != null && other.getWitnessedAt().equals(this.getWitnessedAt()) == false)
            return false;
        if (other.getFingerprintSHA1() == null ^ this.getFingerprintSHA1() == null)
            return false;
        if (other.getFingerprintSHA1() != null && other.getFingerprintSHA1().equals(this.getFingerprintSHA1()) == false)
            return false;
        if (other.getFingerprintSHA256() == null ^ this.getFingerprintSHA256() == null)
            return false;
        if (other.getFingerprintSHA256() != null && other.getFingerprintSHA256().equals(this.getFingerprintSHA256()) == false)
            return false;
        if (other.getNotValidBefore() == null ^ this.getNotValidBefore() == null)
            return false;
        if (other.getNotValidBefore() != null && other.getNotValidBefore().equals(this.getNotValidBefore()) == false)
            return false;
        if (other.getNotValidAfter() == null ^ this.getNotValidAfter() == null)
            return false;
        if (other.getNotValidAfter() != null && other.getNotValidAfter().equals(this.getNotValidAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getWitnessedAt() == null) ? 0 : getWitnessedAt().hashCode());
        hashCode = prime * hashCode + ((getFingerprintSHA1() == null) ? 0 : getFingerprintSHA1().hashCode());
        hashCode = prime * hashCode + ((getFingerprintSHA256() == null) ? 0 : getFingerprintSHA256().hashCode());
        hashCode = prime * hashCode + ((getNotValidBefore() == null) ? 0 : getNotValidBefore().hashCode());
        hashCode = prime * hashCode + ((getNotValidAfter() == null) ? 0 : getNotValidAfter().hashCode());
        return hashCode;
    }

    @Override
    public HostKeyAttributes clone() {
        try {
            return (HostKeyAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.HostKeyAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
