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
 * Defines the attributes of the private key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/PrivateKeyAttributesV4"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateKeyAttributesV4 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the algorithm used to generate the private key.
     * </p>
     */
    private String algorithm;
    /**
     * <p>
     * Defines the cryptographic providers used to generate the private key.
     * </p>
     */
    private java.util.List<String> cryptoProviders;
    /**
     * <p>
     * Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * </p>
     */
    private String keySpec;
    /**
     * <p>
     * The key usage property defines the purpose of the private key contained in the certificate. You can specify
     * specific purposes using property flags or all by using property type ALL.
     * </p>
     */
    private KeyUsageProperty keyUsageProperty;
    /**
     * <p>
     * Set the minimum key length of the private key.
     * </p>
     */
    private Integer minimalKeyLength;

    /**
     * <p>
     * Defines the algorithm used to generate the private key.
     * </p>
     * 
     * @param algorithm
     *        Defines the algorithm used to generate the private key.
     * @see PrivateKeyAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * Defines the algorithm used to generate the private key.
     * </p>
     * 
     * @return Defines the algorithm used to generate the private key.
     * @see PrivateKeyAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * Defines the algorithm used to generate the private key.
     * </p>
     * 
     * @param algorithm
     *        Defines the algorithm used to generate the private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivateKeyAlgorithm
     */

    public PrivateKeyAttributesV4 withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * Defines the algorithm used to generate the private key.
     * </p>
     * 
     * @param algorithm
     *        Defines the algorithm used to generate the private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivateKeyAlgorithm
     */

    public PrivateKeyAttributesV4 withAlgorithm(PrivateKeyAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * <p>
     * Defines the cryptographic providers used to generate the private key.
     * </p>
     * 
     * @return Defines the cryptographic providers used to generate the private key.
     */

    public java.util.List<String> getCryptoProviders() {
        return cryptoProviders;
    }

    /**
     * <p>
     * Defines the cryptographic providers used to generate the private key.
     * </p>
     * 
     * @param cryptoProviders
     *        Defines the cryptographic providers used to generate the private key.
     */

    public void setCryptoProviders(java.util.Collection<String> cryptoProviders) {
        if (cryptoProviders == null) {
            this.cryptoProviders = null;
            return;
        }

        this.cryptoProviders = new java.util.ArrayList<String>(cryptoProviders);
    }

    /**
     * <p>
     * Defines the cryptographic providers used to generate the private key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCryptoProviders(java.util.Collection)} or {@link #withCryptoProviders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cryptoProviders
     *        Defines the cryptographic providers used to generate the private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyAttributesV4 withCryptoProviders(String... cryptoProviders) {
        if (this.cryptoProviders == null) {
            setCryptoProviders(new java.util.ArrayList<String>(cryptoProviders.length));
        }
        for (String ele : cryptoProviders) {
            this.cryptoProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the cryptographic providers used to generate the private key.
     * </p>
     * 
     * @param cryptoProviders
     *        Defines the cryptographic providers used to generate the private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyAttributesV4 withCryptoProviders(java.util.Collection<String> cryptoProviders) {
        setCryptoProviders(cryptoProviders);
        return this;
    }

    /**
     * <p>
     * Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * </p>
     * 
     * @param keySpec
     *        Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * @see KeySpec
     */

    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * </p>
     * 
     * @return Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * @see KeySpec
     */

    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * <p>
     * Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * </p>
     * 
     * @param keySpec
     *        Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeySpec
     */

    public PrivateKeyAttributesV4 withKeySpec(String keySpec) {
        setKeySpec(keySpec);
        return this;
    }

    /**
     * <p>
     * Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * </p>
     * 
     * @param keySpec
     *        Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeySpec
     */

    public PrivateKeyAttributesV4 withKeySpec(KeySpec keySpec) {
        this.keySpec = keySpec.toString();
        return this;
    }

    /**
     * <p>
     * The key usage property defines the purpose of the private key contained in the certificate. You can specify
     * specific purposes using property flags or all by using property type ALL.
     * </p>
     * 
     * @param keyUsageProperty
     *        The key usage property defines the purpose of the private key contained in the certificate. You can
     *        specify specific purposes using property flags or all by using property type ALL.
     */

    public void setKeyUsageProperty(KeyUsageProperty keyUsageProperty) {
        this.keyUsageProperty = keyUsageProperty;
    }

    /**
     * <p>
     * The key usage property defines the purpose of the private key contained in the certificate. You can specify
     * specific purposes using property flags or all by using property type ALL.
     * </p>
     * 
     * @return The key usage property defines the purpose of the private key contained in the certificate. You can
     *         specify specific purposes using property flags or all by using property type ALL.
     */

    public KeyUsageProperty getKeyUsageProperty() {
        return this.keyUsageProperty;
    }

    /**
     * <p>
     * The key usage property defines the purpose of the private key contained in the certificate. You can specify
     * specific purposes using property flags or all by using property type ALL.
     * </p>
     * 
     * @param keyUsageProperty
     *        The key usage property defines the purpose of the private key contained in the certificate. You can
     *        specify specific purposes using property flags or all by using property type ALL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyAttributesV4 withKeyUsageProperty(KeyUsageProperty keyUsageProperty) {
        setKeyUsageProperty(keyUsageProperty);
        return this;
    }

    /**
     * <p>
     * Set the minimum key length of the private key.
     * </p>
     * 
     * @param minimalKeyLength
     *        Set the minimum key length of the private key.
     */

    public void setMinimalKeyLength(Integer minimalKeyLength) {
        this.minimalKeyLength = minimalKeyLength;
    }

    /**
     * <p>
     * Set the minimum key length of the private key.
     * </p>
     * 
     * @return Set the minimum key length of the private key.
     */

    public Integer getMinimalKeyLength() {
        return this.minimalKeyLength;
    }

    /**
     * <p>
     * Set the minimum key length of the private key.
     * </p>
     * 
     * @param minimalKeyLength
     *        Set the minimum key length of the private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateKeyAttributesV4 withMinimalKeyLength(Integer minimalKeyLength) {
        setMinimalKeyLength(minimalKeyLength);
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
        if (getCryptoProviders() != null)
            sb.append("CryptoProviders: ").append(getCryptoProviders()).append(",");
        if (getKeySpec() != null)
            sb.append("KeySpec: ").append(getKeySpec()).append(",");
        if (getKeyUsageProperty() != null)
            sb.append("KeyUsageProperty: ").append(getKeyUsageProperty()).append(",");
        if (getMinimalKeyLength() != null)
            sb.append("MinimalKeyLength: ").append(getMinimalKeyLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateKeyAttributesV4 == false)
            return false;
        PrivateKeyAttributesV4 other = (PrivateKeyAttributesV4) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getCryptoProviders() == null ^ this.getCryptoProviders() == null)
            return false;
        if (other.getCryptoProviders() != null && other.getCryptoProviders().equals(this.getCryptoProviders()) == false)
            return false;
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false)
            return false;
        if (other.getKeyUsageProperty() == null ^ this.getKeyUsageProperty() == null)
            return false;
        if (other.getKeyUsageProperty() != null && other.getKeyUsageProperty().equals(this.getKeyUsageProperty()) == false)
            return false;
        if (other.getMinimalKeyLength() == null ^ this.getMinimalKeyLength() == null)
            return false;
        if (other.getMinimalKeyLength() != null && other.getMinimalKeyLength().equals(this.getMinimalKeyLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getCryptoProviders() == null) ? 0 : getCryptoProviders().hashCode());
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime * hashCode + ((getKeyUsageProperty() == null) ? 0 : getKeyUsageProperty().hashCode());
        hashCode = prime * hashCode + ((getMinimalKeyLength() == null) ? 0 : getMinimalKeyLength().hashCode());
        return hashCode;
    }

    @Override
    public PrivateKeyAttributesV4 clone() {
        try {
            return (PrivateKeyAttributesV4) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.PrivateKeyAttributesV4Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
