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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameter information for key material import into Amazon Web Services Payment Cryptography using TR-31 or TR-34 or
 * RSA wrap and unwrap key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportKeyMaterial"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyMaterial implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     */
    private RootCertificatePublicKey rootCertificatePublicKey;
    /**
     * <p>
     * Parameter information for trusted public key certificate import.
     * </p>
     */
    private TrustedCertificatePublicKey trustedCertificatePublicKey;
    /**
     * <p>
     * Parameter information for key material import using symmetric TR-31 key exchange method.
     * </p>
     */
    private ImportTr31KeyBlock tr31KeyBlock;
    /**
     * <p>
     * Parameter information for key material import using the asymmetric TR-34 key exchange method.
     * </p>
     */
    private ImportTr34KeyBlock tr34KeyBlock;
    /**
     * <p>
     * Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     * </p>
     */
    private ImportKeyCryptogram keyCryptogram;

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     * 
     * @param rootCertificatePublicKey
     *        Parameter information for root public key certificate import.
     */

    public void setRootCertificatePublicKey(RootCertificatePublicKey rootCertificatePublicKey) {
        this.rootCertificatePublicKey = rootCertificatePublicKey;
    }

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     * 
     * @return Parameter information for root public key certificate import.
     */

    public RootCertificatePublicKey getRootCertificatePublicKey() {
        return this.rootCertificatePublicKey;
    }

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     * 
     * @param rootCertificatePublicKey
     *        Parameter information for root public key certificate import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterial withRootCertificatePublicKey(RootCertificatePublicKey rootCertificatePublicKey) {
        setRootCertificatePublicKey(rootCertificatePublicKey);
        return this;
    }

    /**
     * <p>
     * Parameter information for trusted public key certificate import.
     * </p>
     * 
     * @param trustedCertificatePublicKey
     *        Parameter information for trusted public key certificate import.
     */

    public void setTrustedCertificatePublicKey(TrustedCertificatePublicKey trustedCertificatePublicKey) {
        this.trustedCertificatePublicKey = trustedCertificatePublicKey;
    }

    /**
     * <p>
     * Parameter information for trusted public key certificate import.
     * </p>
     * 
     * @return Parameter information for trusted public key certificate import.
     */

    public TrustedCertificatePublicKey getTrustedCertificatePublicKey() {
        return this.trustedCertificatePublicKey;
    }

    /**
     * <p>
     * Parameter information for trusted public key certificate import.
     * </p>
     * 
     * @param trustedCertificatePublicKey
     *        Parameter information for trusted public key certificate import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterial withTrustedCertificatePublicKey(TrustedCertificatePublicKey trustedCertificatePublicKey) {
        setTrustedCertificatePublicKey(trustedCertificatePublicKey);
        return this;
    }

    /**
     * <p>
     * Parameter information for key material import using symmetric TR-31 key exchange method.
     * </p>
     * 
     * @param tr31KeyBlock
     *        Parameter information for key material import using symmetric TR-31 key exchange method.
     */

    public void setTr31KeyBlock(ImportTr31KeyBlock tr31KeyBlock) {
        this.tr31KeyBlock = tr31KeyBlock;
    }

    /**
     * <p>
     * Parameter information for key material import using symmetric TR-31 key exchange method.
     * </p>
     * 
     * @return Parameter information for key material import using symmetric TR-31 key exchange method.
     */

    public ImportTr31KeyBlock getTr31KeyBlock() {
        return this.tr31KeyBlock;
    }

    /**
     * <p>
     * Parameter information for key material import using symmetric TR-31 key exchange method.
     * </p>
     * 
     * @param tr31KeyBlock
     *        Parameter information for key material import using symmetric TR-31 key exchange method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterial withTr31KeyBlock(ImportTr31KeyBlock tr31KeyBlock) {
        setTr31KeyBlock(tr31KeyBlock);
        return this;
    }

    /**
     * <p>
     * Parameter information for key material import using the asymmetric TR-34 key exchange method.
     * </p>
     * 
     * @param tr34KeyBlock
     *        Parameter information for key material import using the asymmetric TR-34 key exchange method.
     */

    public void setTr34KeyBlock(ImportTr34KeyBlock tr34KeyBlock) {
        this.tr34KeyBlock = tr34KeyBlock;
    }

    /**
     * <p>
     * Parameter information for key material import using the asymmetric TR-34 key exchange method.
     * </p>
     * 
     * @return Parameter information for key material import using the asymmetric TR-34 key exchange method.
     */

    public ImportTr34KeyBlock getTr34KeyBlock() {
        return this.tr34KeyBlock;
    }

    /**
     * <p>
     * Parameter information for key material import using the asymmetric TR-34 key exchange method.
     * </p>
     * 
     * @param tr34KeyBlock
     *        Parameter information for key material import using the asymmetric TR-34 key exchange method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterial withTr34KeyBlock(ImportTr34KeyBlock tr34KeyBlock) {
        setTr34KeyBlock(tr34KeyBlock);
        return this;
    }

    /**
     * <p>
     * Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     * </p>
     * 
     * @param keyCryptogram
     *        Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     */

    public void setKeyCryptogram(ImportKeyCryptogram keyCryptogram) {
        this.keyCryptogram = keyCryptogram;
    }

    /**
     * <p>
     * Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     * </p>
     * 
     * @return Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     */

    public ImportKeyCryptogram getKeyCryptogram() {
        return this.keyCryptogram;
    }

    /**
     * <p>
     * Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     * </p>
     * 
     * @param keyCryptogram
     *        Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterial withKeyCryptogram(ImportKeyCryptogram keyCryptogram) {
        setKeyCryptogram(keyCryptogram);
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
        if (getRootCertificatePublicKey() != null)
            sb.append("RootCertificatePublicKey: ").append(getRootCertificatePublicKey()).append(",");
        if (getTrustedCertificatePublicKey() != null)
            sb.append("TrustedCertificatePublicKey: ").append(getTrustedCertificatePublicKey()).append(",");
        if (getTr31KeyBlock() != null)
            sb.append("Tr31KeyBlock: ").append(getTr31KeyBlock()).append(",");
        if (getTr34KeyBlock() != null)
            sb.append("Tr34KeyBlock: ").append(getTr34KeyBlock()).append(",");
        if (getKeyCryptogram() != null)
            sb.append("KeyCryptogram: ").append(getKeyCryptogram());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportKeyMaterial == false)
            return false;
        ImportKeyMaterial other = (ImportKeyMaterial) obj;
        if (other.getRootCertificatePublicKey() == null ^ this.getRootCertificatePublicKey() == null)
            return false;
        if (other.getRootCertificatePublicKey() != null && other.getRootCertificatePublicKey().equals(this.getRootCertificatePublicKey()) == false)
            return false;
        if (other.getTrustedCertificatePublicKey() == null ^ this.getTrustedCertificatePublicKey() == null)
            return false;
        if (other.getTrustedCertificatePublicKey() != null && other.getTrustedCertificatePublicKey().equals(this.getTrustedCertificatePublicKey()) == false)
            return false;
        if (other.getTr31KeyBlock() == null ^ this.getTr31KeyBlock() == null)
            return false;
        if (other.getTr31KeyBlock() != null && other.getTr31KeyBlock().equals(this.getTr31KeyBlock()) == false)
            return false;
        if (other.getTr34KeyBlock() == null ^ this.getTr34KeyBlock() == null)
            return false;
        if (other.getTr34KeyBlock() != null && other.getTr34KeyBlock().equals(this.getTr34KeyBlock()) == false)
            return false;
        if (other.getKeyCryptogram() == null ^ this.getKeyCryptogram() == null)
            return false;
        if (other.getKeyCryptogram() != null && other.getKeyCryptogram().equals(this.getKeyCryptogram()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRootCertificatePublicKey() == null) ? 0 : getRootCertificatePublicKey().hashCode());
        hashCode = prime * hashCode + ((getTrustedCertificatePublicKey() == null) ? 0 : getTrustedCertificatePublicKey().hashCode());
        hashCode = prime * hashCode + ((getTr31KeyBlock() == null) ? 0 : getTr31KeyBlock().hashCode());
        hashCode = prime * hashCode + ((getTr34KeyBlock() == null) ? 0 : getTr34KeyBlock().hashCode());
        hashCode = prime * hashCode + ((getKeyCryptogram() == null) ? 0 : getKeyCryptogram().hashCode());
        return hashCode;
    }

    @Override
    public ImportKeyMaterial clone() {
        try {
            return (ImportKeyMaterial) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ImportKeyMaterialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
