/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new version
     * for the secret, and this parameter specifies the unique identifier for the new version.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the value for
     * this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets
     * Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for the new version
     * and include the value in the request.
     * </p>
     * </note>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The description of the secret.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well as any
     * existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     * <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <important>
     * <p>
     * You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this operation
     * using credentials from the same Amazon Web Services account that owns the secret. If the secret is in a different
     * account, then you must use a customer managed key and provide the ARN of that KMS key in this field. The user
     * making the call must have permissions to both the secret and the KMS key in their respective accounts.
     * </p>
     * </important>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary
     * data in a file and then pass the contents of the file as a parameter.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * <p>
     * You can't access this parameter in the Secrets Manager console.
     * </p>
     */
    private java.nio.ByteBuffer secretBinary;
    /**
     * <p>
     * The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     */
    private String secretString;

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret.</p>
     *         <p>
     *         For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *         >Finding a secret from a partial ARN</a>.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new version
     * for the secret, and this parameter specifies the unique identifier for the new version.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the value for
     * this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets
     * Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for the new version
     * and include the value in the request.
     * </p>
     * </note>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new
     *        version for the secret, and this parameter specifies the unique identifier for the new version.</p> <note>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then
     *        you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the
     *        value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request
     *        to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself
     *        for the new version and include the value in the request.
     *        </p>
     *        </note>
     *        <p>
     *        This value becomes the <code>VersionId</code> of the new version.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new version
     * for the secret, and this parameter specifies the unique identifier for the new version.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the value for
     * this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets
     * Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for the new version
     * and include the value in the request.
     * </p>
     * </note>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @return If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new
     *         version for the secret, and this parameter specifies the unique identifier for the new version.</p>
     *         <note>
     *         <p>
     *         If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation,
     *         then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it
     *         as the value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP
     *         request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code>
     *         yourself for the new version and include the value in the request.
     *         </p>
     *         </note>
     *         <p>
     *         This value becomes the <code>VersionId</code> of the new version.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new version
     * for the secret, and this parameter specifies the unique identifier for the new version.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the value for
     * this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets
     * Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for the new version
     * and include the value in the request.
     * </p>
     * </note>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates a new
     *        version for the secret, and this parameter specifies the unique identifier for the new version.</p> <note>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then
     *        you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the
     *        value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request
     *        to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself
     *        for the new version and include the value in the request.
     *        </p>
     *        </note>
     *        <p>
     *        This value becomes the <code>VersionId</code> of the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The description of the secret.
     * </p>
     * 
     * @param description
     *        The description of the secret.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the secret.
     * </p>
     * 
     * @return The description of the secret.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the secret.
     * </p>
     * 
     * @param description
     *        The description of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well as any
     * existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     * <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <important>
     * <p>
     * You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this operation
     * using credentials from the same Amazon Web Services account that owns the secret. If the secret is in a different
     * account, then you must use a customer managed key and provide the ARN of that KMS key in this field. The user
     * making the call must have permissions to both the secret and the KMS key in their respective accounts.
     * </p>
     * </important>
     * 
     * @param kmsKeyId
     *        The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well
     *        as any existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     *        <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version"
     *        >Concepts: Version</a>.</p>
     *        <p>
     *        A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About aliases</a>.
     *        </p>
     *        <p>
     *        If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     *        <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager
     *        creates it for you automatically. All users and roles in the Amazon Web Services account automatically
     *        have access to use <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in
     *        a one-time significant delay in returning the result.
     *        </p>
     *        <important>
     *        <p>
     *        You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this
     *        operation using credentials from the same Amazon Web Services account that owns the secret. If the secret
     *        is in a different account, then you must use a customer managed key and provide the ARN of that KMS key in
     *        this field. The user making the call must have permissions to both the secret and the KMS key in their
     *        respective accounts.
     *        </p>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well as any
     * existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     * <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <important>
     * <p>
     * You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this operation
     * using credentials from the same Amazon Web Services account that owns the secret. If the secret is in a different
     * account, then you must use a customer managed key and provide the ARN of that KMS key in this field. The user
     * making the call must have permissions to both the secret and the KMS key in their respective accounts.
     * </p>
     * </important>
     * 
     * @return The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well
     *         as any existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     *         <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version"
     *         >Concepts: Version</a>.</p>
     *         <p>
     *         A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About aliases</a>.
     *         </p>
     *         <p>
     *         If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     *         <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager
     *         creates it for you automatically. All users and roles in the Amazon Web Services account automatically
     *         have access to use <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result
     *         in a one-time significant delay in returning the result.
     *         </p>
     *         <important>
     *         <p>
     *         You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this
     *         operation using credentials from the same Amazon Web Services account that owns the secret. If the secret
     *         is in a different account, then you must use a customer managed key and provide the ARN of that KMS key
     *         in this field. The user making the call must have permissions to both the secret and the KMS key in their
     *         respective accounts.
     *         </p>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well as any
     * existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     * <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version">Concepts:
     * Version</a>.
     * </p>
     * <p>
     * A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For
     * more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     * <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager creates
     * it for you automatically. All users and roles in the Amazon Web Services account automatically have access to use
     * <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in a one-time significant
     * delay in returning the result.
     * </p>
     * <important>
     * <p>
     * You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this operation
     * using credentials from the same Amazon Web Services account that owns the secret. If the secret is in a different
     * account, then you must use a customer managed key and provide the ARN of that KMS key in this field. The user
     * making the call must have permissions to both the secret and the KMS key in their respective accounts.
     * </p>
     * </important>
     * 
     * @param kmsKeyId
     *        The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt new secret versions as well
     *        as any existing versions with the staging labels <code>AWSCURRENT</code>, <code>AWSPENDING</code>, or
     *        <code>AWSPREVIOUS</code>. For more information about versions and staging labels, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/getting-started.html#term_version"
     *        >Concepts: Version</a>.</p>
     *        <p>
     *        A key alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About aliases</a>.
     *        </p>
     *        <p>
     *        If you set this to an empty string, Secrets Manager uses the Amazon Web Services managed key
     *        <code>aws/secretsmanager</code>. If this key doesn't already exist in your account, then Secrets Manager
     *        creates it for you automatically. All users and roles in the Amazon Web Services account automatically
     *        have access to use <code>aws/secretsmanager</code>. Creating <code>aws/secretsmanager</code> can result in
     *        a one-time significant delay in returning the result.
     *        </p>
     *        <important>
     *        <p>
     *        You can only use the Amazon Web Services managed key <code>aws/secretsmanager</code> if you call this
     *        operation using credentials from the same Amazon Web Services account that owns the secret. If the secret
     *        is in a different account, then you must use a customer managed key and provide the ARN of that KMS key in
     *        this field. The user making the call must have permissions to both the secret and the KMS key in their
     *        respective accounts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary
     * data in a file and then pass the contents of the file as a parameter.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * <p>
     * You can't access this parameter in the Secrets Manager console.
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
     *        The binary data to encrypt and store in the new version of the secret. We recommend that you store your
     *        binary data in a file and then pass the contents of the file as a parameter. </p>
     *        <p>
     *        Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     *        </p>
     *        <p>
     *        You can't access this parameter in the Secrets Manager console.
     */

    public void setSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary
     * data in a file and then pass the contents of the file as a parameter.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * <p>
     * You can't access this parameter in the Secrets Manager console.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The binary data to encrypt and store in the new version of the secret. We recommend that you store your
     *         binary data in a file and then pass the contents of the file as a parameter. </p>
     *         <p>
     *         Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     *         </p>
     *         <p>
     *         You can't access this parameter in the Secrets Manager console.
     */

    public java.nio.ByteBuffer getSecretBinary() {
        return this.secretBinary;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary
     * data in a file and then pass the contents of the file as a parameter.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * <p>
     * You can't access this parameter in the Secrets Manager console.
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
     *        The binary data to encrypt and store in the new version of the secret. We recommend that you store your
     *        binary data in a file and then pass the contents of the file as a parameter. </p>
     *        <p>
     *        Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     *        </p>
     *        <p>
     *        You can't access this parameter in the Secrets Manager console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretRequest withSecretBinary(java.nio.ByteBuffer secretBinary) {
        setSecretBinary(secretBinary);
        return this;
    }

    /**
     * <p>
     * The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * 
     * @param secretString
     *        The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure
     *        of key/value pairs for your secret value. </p>
     *        <p>
     *        Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     */

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>
     * The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * 
     * @return The text data to encrypt and store in the new version of the secret. We recommend you use a JSON
     *         structure of key/value pairs for your secret value. </p>
     *         <p>
     *         Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     */

    public String getSecretString() {
        return this.secretString;
    }

    /**
     * <p>
     * The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * </p>
     * 
     * @param secretString
     *        The text data to encrypt and store in the new version of the secret. We recommend you use a JSON structure
     *        of key/value pairs for your secret value. </p>
     *        <p>
     *        Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretRequest withSecretString(String secretString) {
        setSecretString(secretString);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSecretBinary() != null)
            sb.append("SecretBinary: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretString() != null)
            sb.append("SecretString: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecretRequest == false)
            return false;
        UpdateSecretRequest other = (UpdateSecretRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSecretBinary() == null ^ this.getSecretBinary() == null)
            return false;
        if (other.getSecretBinary() != null && other.getSecretBinary().equals(this.getSecretBinary()) == false)
            return false;
        if (other.getSecretString() == null ^ this.getSecretString() == null)
            return false;
        if (other.getSecretString() != null && other.getSecretString().equals(this.getSecretString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretBinary() == null) ? 0 : getSecretBinary().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecretRequest clone() {
        return (UpdateSecretRequest) super.clone();
    }

}
