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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecretValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of this version of the secret.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as binary data in the form of
     * a byte array. The response parameter represents the binary data as a <a
     * href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.
     * </p>
     * <p>
     * This parameter is not used if the secret is created by the Secrets Manager console.
     * </p>
     * <p>
     * If you store custom information in this field of the secret, then you must code your Lambda rotation function to
     * parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.
     * </p>
     */
    private java.nio.ByteBuffer secretBinary;
    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as a string.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter
     * contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda
     * rotation function knows how to parse.
     * </p>
     * <p>
     * If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     * <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret
     * type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.
     * </p>
     */
    private String secretString;
    /**
     * <p>
     * A list of all of the staging labels currently attached to this version of the secret.
     * </p>
     */
    private java.util.List<String> versionStages;
    /**
     * <p>
     * The date and time that this version of the secret was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @return The ARN of the secret.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @return The friendly name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of this version of the secret.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of this version of the secret.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The unique identifier of this version of the secret.
     * </p>
     * 
     * @return The unique identifier of this version of the secret.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The unique identifier of this version of the secret.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of this version of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as binary data in the form of
     * a byte array. The response parameter represents the binary data as a <a
     * href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.
     * </p>
     * <p>
     * This parameter is not used if the secret is created by the Secrets Manager console.
     * </p>
     * <p>
     * If you store custom information in this field of the secret, then you must code your Lambda rotation function to
     * parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.
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
     * @param secretBinary
     *        The decrypted part of the protected secret information that was originally provided as binary data in the
     *        form of a byte array. The response parameter represents the binary data as a <a
     *        href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p>
     *        <p>
     *        This parameter is not used if the secret is created by the Secrets Manager console.
     *        </p>
     *        <p>
     *        If you store custom information in this field of the secret, then you must code your Lambda rotation
     *        function to parse and interpret whatever you store in the <code>SecretString</code> or
     *        <code>SecretBinary</code> fields.
     */

    public void setSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
    }

    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as binary data in the form of
     * a byte array. The response parameter represents the binary data as a <a
     * href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.
     * </p>
     * <p>
     * This parameter is not used if the secret is created by the Secrets Manager console.
     * </p>
     * <p>
     * If you store custom information in this field of the secret, then you must code your Lambda rotation function to
     * parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The decrypted part of the protected secret information that was originally provided as binary data in the
     *         form of a byte array. The response parameter represents the binary data as a <a
     *         href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p>
     *         <p>
     *         This parameter is not used if the secret is created by the Secrets Manager console.
     *         </p>
     *         <p>
     *         If you store custom information in this field of the secret, then you must code your Lambda rotation
     *         function to parse and interpret whatever you store in the <code>SecretString</code> or
     *         <code>SecretBinary</code> fields.
     */

    public java.nio.ByteBuffer getSecretBinary() {
        return this.secretBinary;
    }

    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as binary data in the form of
     * a byte array. The response parameter represents the binary data as a <a
     * href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.
     * </p>
     * <p>
     * This parameter is not used if the secret is created by the Secrets Manager console.
     * </p>
     * <p>
     * If you store custom information in this field of the secret, then you must code your Lambda rotation function to
     * parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.
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
     * @param secretBinary
     *        The decrypted part of the protected secret information that was originally provided as binary data in the
     *        form of a byte array. The response parameter represents the binary data as a <a
     *        href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p>
     *        <p>
     *        This parameter is not used if the secret is created by the Secrets Manager console.
     *        </p>
     *        <p>
     *        If you store custom information in this field of the secret, then you must code your Lambda rotation
     *        function to parse and interpret whatever you store in the <code>SecretString</code> or
     *        <code>SecretBinary</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withSecretBinary(java.nio.ByteBuffer secretBinary) {
        setSecretBinary(secretBinary);
        return this;
    }

    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as a string.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter
     * contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda
     * rotation function knows how to parse.
     * </p>
     * <p>
     * If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     * <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret
     * type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.
     * </p>
     * 
     * @param secretString
     *        The decrypted part of the protected secret information that was originally provided as a string.</p>
     *        <p>
     *        If you create this secret by using the Secrets Manager console then only the <code>SecretString</code>
     *        parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs
     *        that the Lambda rotation function knows how to parse.
     *        </p>
     *        <p>
     *        If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     *        <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other
     *        secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret
     *        those values.
     */

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as a string.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter
     * contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda
     * rotation function knows how to parse.
     * </p>
     * <p>
     * If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     * <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret
     * type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.
     * </p>
     * 
     * @return The decrypted part of the protected secret information that was originally provided as a string.</p>
     *         <p>
     *         If you create this secret by using the Secrets Manager console then only the <code>SecretString</code>
     *         parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs
     *         that the Lambda rotation function knows how to parse.
     *         </p>
     *         <p>
     *         If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     *         <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other
     *         secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret
     *         those values.
     */

    public String getSecretString() {
        return this.secretString;
    }

    /**
     * <p>
     * The decrypted part of the protected secret information that was originally provided as a string.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter
     * contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda
     * rotation function knows how to parse.
     * </p>
     * <p>
     * If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     * <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret
     * type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.
     * </p>
     * 
     * @param secretString
     *        The decrypted part of the protected secret information that was originally provided as a string.</p>
     *        <p>
     *        If you create this secret by using the Secrets Manager console then only the <code>SecretString</code>
     *        parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs
     *        that the Lambda rotation function knows how to parse.
     *        </p>
     *        <p>
     *        If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or
     *        <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other
     *        secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret
     *        those values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withSecretString(String secretString) {
        setSecretString(secretString);
        return this;
    }

    /**
     * <p>
     * A list of all of the staging labels currently attached to this version of the secret.
     * </p>
     * 
     * @return A list of all of the staging labels currently attached to this version of the secret.
     */

    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>
     * A list of all of the staging labels currently attached to this version of the secret.
     * </p>
     * 
     * @param versionStages
     *        A list of all of the staging labels currently attached to this version of the secret.
     */

    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>
     * A list of all of the staging labels currently attached to this version of the secret.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionStages(java.util.Collection)} or {@link #withVersionStages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionStages
     *        A list of all of the staging labels currently attached to this version of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withVersionStages(String... versionStages) {
        if (this.versionStages == null) {
            setVersionStages(new java.util.ArrayList<String>(versionStages.length));
        }
        for (String ele : versionStages) {
            this.versionStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all of the staging labels currently attached to this version of the secret.
     * </p>
     * 
     * @param versionStages
     *        A list of all of the staging labels currently attached to this version of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
        return this;
    }

    /**
     * <p>
     * The date and time that this version of the secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that this version of the secret was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that this version of the secret was created.
     * </p>
     * 
     * @return The date and time that this version of the secret was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time that this version of the secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that this version of the secret was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getSecretBinary() != null)
            sb.append("SecretBinary: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretString() != null)
            sb.append("SecretString: ").append("***Sensitive Data Redacted***").append(",");
        if (getVersionStages() != null)
            sb.append("VersionStages: ").append(getVersionStages()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecretValueResult == false)
            return false;
        GetSecretValueResult other = (GetSecretValueResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getSecretBinary() == null ^ this.getSecretBinary() == null)
            return false;
        if (other.getSecretBinary() != null && other.getSecretBinary().equals(this.getSecretBinary()) == false)
            return false;
        if (other.getSecretString() == null ^ this.getSecretString() == null)
            return false;
        if (other.getSecretString() != null && other.getSecretString().equals(this.getSecretString()) == false)
            return false;
        if (other.getVersionStages() == null ^ this.getVersionStages() == null)
            return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getSecretBinary() == null) ? 0 : getSecretBinary().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetSecretValueResult clone() {
        try {
            return (GetSecretValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
