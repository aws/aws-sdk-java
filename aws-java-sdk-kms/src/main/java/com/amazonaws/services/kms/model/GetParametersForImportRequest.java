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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetParametersForImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
     * Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String wrappingAlgorithm;
    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
     * </p>
     */
    private String wrappingKeySpec;

    /**
     * <p>
     * The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     *        <code>EXTERNAL</code>.</p>
     *        <p>
     *        Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     *         <code>EXTERNAL</code>.</p>
     *         <p>
     *         Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be
     *        <code>EXTERNAL</code>.</p>
     *        <p>
     *        Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
     * Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *        >Encrypt the Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see AlgorithmSpec
     */

    public void setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
     * Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *         >Encrypt the Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see AlgorithmSpec
     */

    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
     * Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *        >Encrypt the Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmSpec
     */

    public GetParametersForImportRequest withWrappingAlgorithm(String wrappingAlgorithm) {
        setWrappingAlgorithm(wrappingAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
     * Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *        >Encrypt the Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see AlgorithmSpec
     */

    public void setWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        withWrappingAlgorithm(wrappingAlgorithm);
    }

    /**
     * <p>
     * The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
     * Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html"
     *        >Encrypt the Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmSpec
     */

    public GetParametersForImportRequest withWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are
     *        supported.
     * @see WrappingKeySpec
     */

    public void setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
     * </p>
     * 
     * @return The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are
     *         supported.
     * @see WrappingKeySpec
     */

    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public GetParametersForImportRequest withWrappingKeySpec(String wrappingKeySpec) {
        setWrappingKeySpec(wrappingKeySpec);
        return this;
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are
     *        supported.
     * @see WrappingKeySpec
     */

    public void setWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        withWrappingKeySpec(wrappingKeySpec);
    }

    /**
     * <p>
     * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public GetParametersForImportRequest withWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getWrappingAlgorithm() != null)
            sb.append("WrappingAlgorithm: ").append(getWrappingAlgorithm()).append(",");
        if (getWrappingKeySpec() != null)
            sb.append("WrappingKeySpec: ").append(getWrappingKeySpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportRequest == false)
            return false;
        GetParametersForImportRequest other = (GetParametersForImportRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getWrappingAlgorithm() == null ^ this.getWrappingAlgorithm() == null)
            return false;
        if (other.getWrappingAlgorithm() != null && other.getWrappingAlgorithm().equals(this.getWrappingAlgorithm()) == false)
            return false;
        if (other.getWrappingKeySpec() == null ^ this.getWrappingKeySpec() == null)
            return false;
        if (other.getWrappingKeySpec() != null && other.getWrappingKeySpec().equals(this.getWrappingKeySpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getWrappingAlgorithm() == null) ? 0 : getWrappingAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeySpec() == null) ? 0 : getWrappingKeySpec().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForImportRequest clone() {
        return (GetParametersForImportRequest) super.clone();
    }

}
