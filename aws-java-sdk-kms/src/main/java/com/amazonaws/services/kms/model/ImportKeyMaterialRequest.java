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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ImportKeyMaterial" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyMaterialRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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
     * The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must
     * be from the same response that contained the public key that you used to encrypt the key material.
     * </p>
     */
    private java.nio.ByteBuffer importToken;
    /**
     * <p>
     * The encrypted key material to import. It must be encrypted with the public key that you received in the response
     * to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you specified in that
     * request.
     * </p>
     */
    private java.nio.ByteBuffer encryptedKeyMaterial;
    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. You must omit this parameter when the <code>ExpirationModel</code>
     * parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it is required.
     * </p>
     */
    private java.util.Date validTo;
    /**
     * <p>
     * Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you
     * must include the <code>ValidTo</code> parameter. When this parameter is set to
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * </p>
     */
    private String expirationModel;

    /**
     * <p>
     * The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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
     *        The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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
     * The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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
     * @return The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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
     * The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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
     *        The identifier of the CMK to import the key material into. The CMK's <code>Origin</code> must be
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

    public ImportKeyMaterialRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must
     * be from the same response that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param importToken
     *        The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It
     *        must be from the same response that contained the public key that you used to encrypt the key material.
     */

    public void setImportToken(java.nio.ByteBuffer importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must
     * be from the same response that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The import token that you received in the response to a previous <a>GetParametersForImport</a> request.
     *         It must be from the same response that contained the public key that you used to encrypt the key
     *         material.
     */

    public java.nio.ByteBuffer getImportToken() {
        return this.importToken;
    }

    /**
     * <p>
     * The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must
     * be from the same response that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param importToken
     *        The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It
     *        must be from the same response that contained the public key that you used to encrypt the key material.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterialRequest withImportToken(java.nio.ByteBuffer importToken) {
        setImportToken(importToken);
        return this;
    }

    /**
     * <p>
     * The encrypted key material to import. It must be encrypted with the public key that you received in the response
     * to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you specified in that
     * request.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param encryptedKeyMaterial
     *        The encrypted key material to import. It must be encrypted with the public key that you received in the
     *        response to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you
     *        specified in that request.
     */

    public void setEncryptedKeyMaterial(java.nio.ByteBuffer encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
    }

    /**
     * <p>
     * The encrypted key material to import. It must be encrypted with the public key that you received in the response
     * to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you specified in that
     * request.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The encrypted key material to import. It must be encrypted with the public key that you received in the
     *         response to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you
     *         specified in that request.
     */

    public java.nio.ByteBuffer getEncryptedKeyMaterial() {
        return this.encryptedKeyMaterial;
    }

    /**
     * <p>
     * The encrypted key material to import. It must be encrypted with the public key that you received in the response
     * to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you specified in that
     * request.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param encryptedKeyMaterial
     *        The encrypted key material to import. It must be encrypted with the public key that you received in the
     *        response to a previous <a>GetParametersForImport</a> request, using the wrapping algorithm that you
     *        specified in that request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterialRequest withEncryptedKeyMaterial(java.nio.ByteBuffer encryptedKeyMaterial) {
        setEncryptedKeyMaterial(encryptedKeyMaterial);
        return this;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. You must omit this parameter when the <code>ExpirationModel</code>
     * parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it is required.
     * </p>
     * 
     * @param validTo
     *        The time at which the imported key material expires. When the key material expires, AWS KMS deletes the
     *        key material and the CMK becomes unusable. You must omit this parameter when the
     *        <code>ExpirationModel</code> parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it
     *        is required.
     */

    public void setValidTo(java.util.Date validTo) {
        this.validTo = validTo;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. You must omit this parameter when the <code>ExpirationModel</code>
     * parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it is required.
     * </p>
     * 
     * @return The time at which the imported key material expires. When the key material expires, AWS KMS deletes the
     *         key material and the CMK becomes unusable. You must omit this parameter when the
     *         <code>ExpirationModel</code> parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it
     *         is required.
     */

    public java.util.Date getValidTo() {
        return this.validTo;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. You must omit this parameter when the <code>ExpirationModel</code>
     * parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it is required.
     * </p>
     * 
     * @param validTo
     *        The time at which the imported key material expires. When the key material expires, AWS KMS deletes the
     *        key material and the CMK becomes unusable. You must omit this parameter when the
     *        <code>ExpirationModel</code> parameter is set to <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>. Otherwise it
     *        is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyMaterialRequest withValidTo(java.util.Date validTo) {
        setValidTo(validTo);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you
     * must include the <code>ValidTo</code> parameter. When this parameter is set to
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which
     *        case you must include the <code>ValidTo</code> parameter. When this parameter is set to
     *        <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * @see ExpirationModelType
     */

    public void setExpirationModel(String expirationModel) {
        this.expirationModel = expirationModel;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you
     * must include the <code>ValidTo</code> parameter. When this parameter is set to
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * </p>
     * 
     * @return Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which
     *         case you must include the <code>ValidTo</code> parameter. When this parameter is set to
     *         <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * @see ExpirationModelType
     */

    public String getExpirationModel() {
        return this.expirationModel;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you
     * must include the <code>ValidTo</code> parameter. When this parameter is set to
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which
     *        case you must include the <code>ValidTo</code> parameter. When this parameter is set to
     *        <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationModelType
     */

    public ImportKeyMaterialRequest withExpirationModel(String expirationModel) {
        setExpirationModel(expirationModel);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you
     * must include the <code>ValidTo</code> parameter. When this parameter is set to
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which
     *        case you must include the <code>ValidTo</code> parameter. When this parameter is set to
     *        <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * @see ExpirationModelType
     */

    public void setExpirationModel(ExpirationModelType expirationModel) {
        withExpirationModel(expirationModel);
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which case you
     * must include the <code>ValidTo</code> parameter. When this parameter is set to
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the key material expires. The default is <code>KEY_MATERIAL_EXPIRES</code>, in which
     *        case you must include the <code>ValidTo</code> parameter. When this parameter is set to
     *        <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationModelType
     */

    public ImportKeyMaterialRequest withExpirationModel(ExpirationModelType expirationModel) {
        this.expirationModel = expirationModel.toString();
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
        if (getImportToken() != null)
            sb.append("ImportToken: ").append(getImportToken()).append(",");
        if (getEncryptedKeyMaterial() != null)
            sb.append("EncryptedKeyMaterial: ").append(getEncryptedKeyMaterial()).append(",");
        if (getValidTo() != null)
            sb.append("ValidTo: ").append(getValidTo()).append(",");
        if (getExpirationModel() != null)
            sb.append("ExpirationModel: ").append(getExpirationModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportKeyMaterialRequest == false)
            return false;
        ImportKeyMaterialRequest other = (ImportKeyMaterialRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null && other.getImportToken().equals(this.getImportToken()) == false)
            return false;
        if (other.getEncryptedKeyMaterial() == null ^ this.getEncryptedKeyMaterial() == null)
            return false;
        if (other.getEncryptedKeyMaterial() != null && other.getEncryptedKeyMaterial().equals(this.getEncryptedKeyMaterial()) == false)
            return false;
        if (other.getValidTo() == null ^ this.getValidTo() == null)
            return false;
        if (other.getValidTo() != null && other.getValidTo().equals(this.getValidTo()) == false)
            return false;
        if (other.getExpirationModel() == null ^ this.getExpirationModel() == null)
            return false;
        if (other.getExpirationModel() != null && other.getExpirationModel().equals(this.getExpirationModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode + ((getEncryptedKeyMaterial() == null) ? 0 : getEncryptedKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getValidTo() == null) ? 0 : getValidTo().hashCode());
        hashCode = prime * hashCode + ((getExpirationModel() == null) ? 0 : getExpirationModel().hashCode());
        return hashCode;
    }

    @Override
    public ImportKeyMaterialRequest clone() {
        return (ImportKeyMaterialRequest) super.clone();
    }

}
