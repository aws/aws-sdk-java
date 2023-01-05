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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSecretValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret to add a new version to.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * <p>
     * If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * A unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function processing. We recommend
     * that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to
     * ensure uniqueness within the specified secret.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new
     * version of the secret is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> or
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The operation
     * is idempotent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and the version of the <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * can't modify a secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. To use this parameter in the command-line
     * tools, we recommend that you store your binary data in a file and then pass the contents of the file as a
     * parameter.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * You can't access this value from the Secrets Manager console.
     * </p>
     */
    private java.nio.ByteBuffer secretBinary;
    /**
     * <p>
     * The text to encrypt and store in the new version of the secret.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     * </p>
     */
    private String secretString;
    /**
     * <p>
     * A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to track
     * versions of a secret through the rotation process.
     * </p>
     * <p>
     * If you specify a staging label that's already associated with a different version of the same secret, then
     * Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     * <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version.
     * </p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>
     * The ARN or name of the secret to add a new version to.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * <p>
     * If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to add a new version to.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     *        </p>
     *        <p>
     *        If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret to add a new version to.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * <p>
     * If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     * </p>
     * 
     * @return The ARN or name of the secret to add a new version to.</p>
     *         <p>
     *         For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *         >Finding a secret from a partial ARN</a>.
     *         </p>
     *         <p>
     *         If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret to add a new version to.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * <p>
     * If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to add a new version to.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     *        </p>
     *        <p>
     *        If the secret doesn't already exist, use <code>CreateSecret</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function processing. We recommend
     * that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to
     * ensure uniqueness within the specified secret.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new
     * version of the secret is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> or
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The operation
     * is idempotent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and the version of the <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * can't modify a secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the new version of the secret. </p> <note>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then
     *        you can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK
     *        and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     *        <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     *        </p>
     *        </note>
     *        <p>
     *        This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     *        duplicate versions if there are failures and retries during the Lambda rotation function processing. We
     *        recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *        within the specified secret.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a
     *        new version of the secret is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> or
     *        <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The
     *        operation is idempotent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and the version of the <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from those in the request, then the request fails because
     *        you can't modify a secret version. You can only create new versions to store new secret values.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value becomes the <code>VersionId</code> of the new version.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function processing. We recommend
     * that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to
     * ensure uniqueness within the specified secret.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new
     * version of the secret is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> or
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The operation
     * is idempotent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and the version of the <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * can't modify a secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @return A unique identifier for the new version of the secret. </p> <note>
     *         <p>
     *         If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation,
     *         then you can leave this parameter empty because they generate a random UUID for you. If you don't use the
     *         SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *         generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the
     *         request.
     *         </p>
     *         </note>
     *         <p>
     *         This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation
     *         of duplicate versions if there are failures and retries during the Lambda rotation function processing.
     *         We recommend that you generate a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *         within the specified secret.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a
     *         new version of the secret is created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a version with this value already exists and that version's <code>SecretString</code> or
     *         <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The
     *         operation is idempotent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a version with this value already exists and the version of the <code>SecretString</code> and
     *         <code>SecretBinary</code> values are different from those in the request, then the request fails because
     *         you can't modify a secret version. You can only create new versions to store new secret values.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This value becomes the <code>VersionId</code> of the new version.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you
     * can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function processing. We recommend
     * that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to
     * ensure uniqueness within the specified secret.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new
     * version of the secret is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> or
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The operation
     * is idempotent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and the version of the <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * can't modify a secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the new version of the secret. </p> <note>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then
     *        you can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK
     *        and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     *        <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     *        </p>
     *        </note>
     *        <p>
     *        This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     *        duplicate versions if there are failures and retries during the Lambda rotation function processing. We
     *        recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *        within the specified secret.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a
     *        new version of the secret is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> or
     *        <code>SecretBinary</code> values are the same as those in the request then the request is ignored. The
     *        operation is idempotent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and the version of the <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from those in the request, then the request fails because
     *        you can't modify a secret version. You can only create new versions to store new secret values.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value becomes the <code>VersionId</code> of the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. To use this parameter in the command-line
     * tools, we recommend that you store your binary data in a file and then pass the contents of the file as a
     * parameter.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * You can't access this value from the Secrets Manager console.
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
     *        The binary data to encrypt and store in the new version of the secret. To use this parameter in the
     *        command-line tools, we recommend that you store your binary data in a file and then pass the contents of
     *        the file as a parameter. </p>
     *        <p>
     *        You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     *        </p>
     *        <p>
     *        You can't access this value from the Secrets Manager console.
     */

    public void setSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. To use this parameter in the command-line
     * tools, we recommend that you store your binary data in a file and then pass the contents of the file as a
     * parameter.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * You can't access this value from the Secrets Manager console.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The binary data to encrypt and store in the new version of the secret. To use this parameter in the
     *         command-line tools, we recommend that you store your binary data in a file and then pass the contents of
     *         the file as a parameter. </p>
     *         <p>
     *         You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     *         </p>
     *         <p>
     *         You can't access this value from the Secrets Manager console.
     */

    public java.nio.ByteBuffer getSecretBinary() {
        return this.secretBinary;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. To use this parameter in the command-line
     * tools, we recommend that you store your binary data in a file and then pass the contents of the file as a
     * parameter.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * You can't access this value from the Secrets Manager console.
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
     *        The binary data to encrypt and store in the new version of the secret. To use this parameter in the
     *        command-line tools, we recommend that you store your binary data in a file and then pass the contents of
     *        the file as a parameter. </p>
     *        <p>
     *        You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     *        </p>
     *        <p>
     *        You can't access this value from the Secrets Manager console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withSecretBinary(java.nio.ByteBuffer secretBinary) {
        setSecretBinary(secretBinary);
        return this;
    }

    /**
     * <p>
     * The text to encrypt and store in the new version of the secret.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     * </p>
     * 
     * @param secretString
     *        The text to encrypt and store in the new version of the secret. </p>
     *        <p>
     *        You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     *        </p>
     *        <p>
     *        We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     */

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>
     * The text to encrypt and store in the new version of the secret.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     * </p>
     * 
     * @return The text to encrypt and store in the new version of the secret. </p>
     *         <p>
     *         You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     *         </p>
     *         <p>
     *         We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     */

    public String getSecretString() {
        return this.secretString;
    }

    /**
     * <p>
     * The text to encrypt and store in the new version of the secret.
     * </p>
     * <p>
     * You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     * </p>
     * <p>
     * We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     * </p>
     * 
     * @param secretString
     *        The text to encrypt and store in the new version of the secret. </p>
     *        <p>
     *        You must include <code>SecretBinary</code> or <code>SecretString</code>, but not both.
     *        </p>
     *        <p>
     *        We recommend you create the secret string as JSON key/value pairs, as shown in the example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withSecretString(String secretString) {
        setSecretString(secretString);
        return this;
    }

    /**
     * <p>
     * A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to track
     * versions of a secret through the rotation process.
     * </p>
     * <p>
     * If you specify a staging label that's already associated with a different version of the same secret, then
     * Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     * <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version.
     * </p>
     * 
     * @return A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to
     *         track versions of a secret through the rotation process.</p>
     *         <p>
     *         If you specify a staging label that's already associated with a different version of the same secret,
     *         then Secrets Manager removes the label from the other version and attaches it to this version. If you
     *         specify <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also
     *         moves the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed
     *         from.
     *         </p>
     *         <p>
     *         If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging
     *         label <code>AWSCURRENT</code> to this version.
     */

    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>
     * A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to track
     * versions of a secret through the rotation process.
     * </p>
     * <p>
     * If you specify a staging label that's already associated with a different version of the same secret, then
     * Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     * <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version.
     * </p>
     * 
     * @param versionStages
     *        A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to
     *        track versions of a secret through the rotation process.</p>
     *        <p>
     *        If you specify a staging label that's already associated with a different version of the same secret, then
     *        Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     *        <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves
     *        the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     *        </p>
     *        <p>
     *        If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging
     *        label <code>AWSCURRENT</code> to this version.
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
     * A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to track
     * versions of a secret through the rotation process.
     * </p>
     * <p>
     * If you specify a staging label that's already associated with a different version of the same secret, then
     * Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     * <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionStages(java.util.Collection)} or {@link #withVersionStages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionStages
     *        A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to
     *        track versions of a secret through the rotation process.</p>
     *        <p>
     *        If you specify a staging label that's already associated with a different version of the same secret, then
     *        Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     *        <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves
     *        the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     *        </p>
     *        <p>
     *        If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging
     *        label <code>AWSCURRENT</code> to this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withVersionStages(String... versionStages) {
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
     * A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to track
     * versions of a secret through the rotation process.
     * </p>
     * <p>
     * If you specify a staging label that's already associated with a different version of the same secret, then
     * Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     * <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves the
     * staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     * </p>
     * <p>
     * If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging label
     * <code>AWSCURRENT</code> to this version.
     * </p>
     * 
     * @param versionStages
     *        A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to
     *        track versions of a secret through the rotation process.</p>
     *        <p>
     *        If you specify a staging label that's already associated with a different version of the same secret, then
     *        Secrets Manager removes the label from the other version and attaches it to this version. If you specify
     *        <code>AWSCURRENT</code>, and it is already attached to another version, then Secrets Manager also moves
     *        the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.
     *        </p>
     *        <p>
     *        If you don't include <code>VersionStages</code>, then Secrets Manager automatically moves the staging
     *        label <code>AWSCURRENT</code> to this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
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
        if (getSecretBinary() != null)
            sb.append("SecretBinary: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretString() != null)
            sb.append("SecretString: ").append("***Sensitive Data Redacted***").append(",");
        if (getVersionStages() != null)
            sb.append("VersionStages: ").append(getVersionStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSecretValueRequest == false)
            return false;
        PutSecretValueRequest other = (PutSecretValueRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSecretBinary() == null) ? 0 : getSecretBinary().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        return hashCode;
    }

    @Override
    public PutSecretValueRequest clone() {
        return (PutSecretValueRequest) super.clone();
    }

}
