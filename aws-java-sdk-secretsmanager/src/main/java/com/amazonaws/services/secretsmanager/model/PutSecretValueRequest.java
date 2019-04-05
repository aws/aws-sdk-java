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
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret. The secret must already exist.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     */
    private String secretId;
    /**
     * <p>
     * (Optional) Specifies a unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function's processing. We
     * recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     * value to ensure uniqueness within the specified secret.
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
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation
     * is idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request then the request fails because you
     * cannot modify an existing secret version. You can only create new versions to store new secret values.
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
     * (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this
     * parameter in the command-line tools, we recommend that you store your binary data in a file and then use the
     * appropriate technique for your tool to pass the contents of the file as a parameter. Either
     * <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * This parameter is not accessible if the secret using the Secrets Manager console.
     * </p>
     * <p/>
     */
    private java.nio.ByteBuffer secretBinary;
    /**
     * <p>
     * (Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either
     * <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret
     * text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a
     * JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For information on how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     * </p>
     * <p>
     * If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to
     * avoid confusion with the double quotes required in the JSON text.
     * </p>
     */
    private String secretString;
    /**
     * <p>
     * (Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging
     * labels are used to track the versions through the rotation process by the Lambda rotation function.
     * </p>
     * <p>
     * A staging label must be unique to a single version of the secret. If you specify a staging label that's already
     * associated with a different version of the same secret then that staging label is automatically removed from the
     * other version and attached to this version.
     * </p>
     * <p>
     * If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging
     * label <code>AWSCURRENT</code> to this new version.
     * </p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret. The secret must already exist.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource
     *        Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret. The secret must already exist.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @return Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource
     *         Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note>
     *         <p>
     *         If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *         ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *         adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *         uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by
     *         six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use
     *         that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a
     *         complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you
     *         don’t create secret names that end with a hyphen followed by six characters.
     *         </p>
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret. The secret must already exist.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource
     *        Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies a unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function's processing. We
     * recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     * value to ensure uniqueness within the specified secret.
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
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation
     * is idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request then the request fails because you
     * cannot modify an existing secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) Specifies a unique identifier for the new version of the secret. </p> <note>
     *        <p>
     *        If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *        empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use
     *        the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *        generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the
     *        request.
     *        </p>
     *        </note>
     *        <p>
     *        This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     *        duplicate versions if there are failures and retries during the Lambda rotation function's processing. We
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
     *        <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the
     *        operation is idempotent).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from those in the request then the request fails because
     *        you cannot modify an existing secret version. You can only create new versions to store new secret values.
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
     * (Optional) Specifies a unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function's processing. We
     * recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     * value to ensure uniqueness within the specified secret.
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
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation
     * is idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request then the request fails because you
     * cannot modify an existing secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @return (Optional) Specifies a unique identifier for the new version of the secret. </p> <note>
     *         <p>
     *         If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *         empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use
     *         the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *         generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the
     *         request.
     *         </p>
     *         </note>
     *         <p>
     *         This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation
     *         of duplicate versions if there are failures and retries during the Lambda rotation function's processing.
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
     *         <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the
     *         operation is idempotent).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a version with this value already exists and that version's <code>SecretString</code> and
     *         <code>SecretBinary</code> values are different from those in the request then the request fails because
     *         you cannot modify an existing secret version. You can only create new versions to store new secret
     *         values.
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
     * (Optional) Specifies a unique identifier for the new version of the secret.
     * </p>
     * <note>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * </note>
     * <p>
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during the Lambda rotation function's processing. We
     * recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     * value to ensure uniqueness within the specified secret.
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
     * <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation
     * is idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request then the request fails because you
     * cannot modify an existing secret version. You can only create new versions to store new secret values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) Specifies a unique identifier for the new version of the secret. </p> <note>
     *        <p>
     *        If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *        empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use
     *        the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *        generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the
     *        request.
     *        </p>
     *        </note>
     *        <p>
     *        This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     *        duplicate versions if there are failures and retries during the Lambda rotation function's processing. We
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
     *        <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the
     *        operation is idempotent).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from those in the request then the request fails because
     *        you cannot modify an existing secret version. You can only create new versions to store new secret values.
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
     * (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this
     * parameter in the command-line tools, we recommend that you store your binary data in a file and then use the
     * appropriate technique for your tool to pass the contents of the file as a parameter. Either
     * <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * This parameter is not accessible if the secret using the Secrets Manager console.
     * </p>
     * <p/>
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
     *        (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To
     *        use this parameter in the command-line tools, we recommend that you store your binary data in a file and
     *        then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either
     *        <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both
     *        be empty.</p>
     *        <p>
     *        This parameter is not accessible if the secret using the Secrets Manager console.
     *        </p>
     */

    public void setSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
    }

    /**
     * <p>
     * (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this
     * parameter in the command-line tools, we recommend that you store your binary data in a file and then use the
     * appropriate technique for your tool to pass the contents of the file as a parameter. Either
     * <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * This parameter is not accessible if the secret using the Secrets Manager console.
     * </p>
     * <p/>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To
     *         use this parameter in the command-line tools, we recommend that you store your binary data in a file and
     *         then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either
     *         <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both
     *         be empty.</p>
     *         <p>
     *         This parameter is not accessible if the secret using the Secrets Manager console.
     *         </p>
     */

    public java.nio.ByteBuffer getSecretBinary() {
        return this.secretBinary;
    }

    /**
     * <p>
     * (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this
     * parameter in the command-line tools, we recommend that you store your binary data in a file and then use the
     * appropriate technique for your tool to pass the contents of the file as a parameter. Either
     * <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * This parameter is not accessible if the secret using the Secrets Manager console.
     * </p>
     * <p/>
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
     *        (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To
     *        use this parameter in the command-line tools, we recommend that you store your binary data in a file and
     *        then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either
     *        <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both
     *        be empty.</p>
     *        <p>
     *        This parameter is not accessible if the secret using the Secrets Manager console.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withSecretBinary(java.nio.ByteBuffer secretBinary) {
        setSecretBinary(secretBinary);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either
     * <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret
     * text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a
     * JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For information on how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     * </p>
     * <p>
     * If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to
     * avoid confusion with the double quotes required in the JSON text.
     * </p>
     * 
     * @param secretString
     *        (Optional) Specifies text data that you want to encrypt and store in this new version of the secret.
     *        Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot
     *        both be empty.</p>
     *        <p>
     *        If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected
     *        secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the
     *        information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to
     *        parse.
     *        </p>
     *        <p>
     *        For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *        pairs. For information on how to format a JSON parameter for the various command line tool environments,
     *        see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     *        </p>
     *        <p>
     *        If your command-line tool or SDK requires quotation marks around the parameter, you should use single
     *        quotes to avoid confusion with the double quotes required in the JSON text.
     */

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>
     * (Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either
     * <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret
     * text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a
     * JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For information on how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     * </p>
     * <p>
     * If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to
     * avoid confusion with the double quotes required in the JSON text.
     * </p>
     * 
     * @return (Optional) Specifies text data that you want to encrypt and store in this new version of the secret.
     *         Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They
     *         cannot both be empty.</p>
     *         <p>
     *         If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected
     *         secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the
     *         information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to
     *         parse.
     *         </p>
     *         <p>
     *         For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *         pairs. For information on how to format a JSON parameter for the various command line tool environments,
     *         see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *         JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     *         </p>
     *         <p>
     *         If your command-line tool or SDK requires quotation marks around the parameter, you should use single
     *         quotes to avoid confusion with the double quotes required in the JSON text.
     */

    public String getSecretString() {
        return this.secretString;
    }

    /**
     * <p>
     * (Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either
     * <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be
     * empty.
     * </p>
     * <p>
     * If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret
     * text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a
     * JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For information on how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     * </p>
     * <p>
     * If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to
     * avoid confusion with the double quotes required in the JSON text.
     * </p>
     * 
     * @param secretString
     *        (Optional) Specifies text data that you want to encrypt and store in this new version of the secret.
     *        Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot
     *        both be empty.</p>
     *        <p>
     *        If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected
     *        secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the
     *        information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to
     *        parse.
     *        </p>
     *        <p>
     *        For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *        pairs. For information on how to format a JSON parameter for the various command line tool environments,
     *        see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code>
     *        </p>
     *        <p>
     *        If your command-line tool or SDK requires quotation marks around the parameter, you should use single
     *        quotes to avoid confusion with the double quotes required in the JSON text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueRequest withSecretString(String secretString) {
        setSecretString(secretString);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging
     * labels are used to track the versions through the rotation process by the Lambda rotation function.
     * </p>
     * <p>
     * A staging label must be unique to a single version of the secret. If you specify a staging label that's already
     * associated with a different version of the same secret then that staging label is automatically removed from the
     * other version and attached to this version.
     * </p>
     * <p>
     * If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging
     * label <code>AWSCURRENT</code> to this new version.
     * </p>
     * 
     * @return (Optional) Specifies a list of staging labels that are attached to this version of the secret. These
     *         staging labels are used to track the versions through the rotation process by the Lambda rotation
     *         function.</p>
     *         <p>
     *         A staging label must be unique to a single version of the secret. If you specify a staging label that's
     *         already associated with a different version of the same secret then that staging label is automatically
     *         removed from the other version and attached to this version.
     *         </p>
     *         <p>
     *         If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the
     *         staging label <code>AWSCURRENT</code> to this new version.
     */

    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>
     * (Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging
     * labels are used to track the versions through the rotation process by the Lambda rotation function.
     * </p>
     * <p>
     * A staging label must be unique to a single version of the secret. If you specify a staging label that's already
     * associated with a different version of the same secret then that staging label is automatically removed from the
     * other version and attached to this version.
     * </p>
     * <p>
     * If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging
     * label <code>AWSCURRENT</code> to this new version.
     * </p>
     * 
     * @param versionStages
     *        (Optional) Specifies a list of staging labels that are attached to this version of the secret. These
     *        staging labels are used to track the versions through the rotation process by the Lambda rotation
     *        function.</p>
     *        <p>
     *        A staging label must be unique to a single version of the secret. If you specify a staging label that's
     *        already associated with a different version of the same secret then that staging label is automatically
     *        removed from the other version and attached to this version.
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the
     *        staging label <code>AWSCURRENT</code> to this new version.
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
     * (Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging
     * labels are used to track the versions through the rotation process by the Lambda rotation function.
     * </p>
     * <p>
     * A staging label must be unique to a single version of the secret. If you specify a staging label that's already
     * associated with a different version of the same secret then that staging label is automatically removed from the
     * other version and attached to this version.
     * </p>
     * <p>
     * If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging
     * label <code>AWSCURRENT</code> to this new version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionStages(java.util.Collection)} or {@link #withVersionStages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionStages
     *        (Optional) Specifies a list of staging labels that are attached to this version of the secret. These
     *        staging labels are used to track the versions through the rotation process by the Lambda rotation
     *        function.</p>
     *        <p>
     *        A staging label must be unique to a single version of the secret. If you specify a staging label that's
     *        already associated with a different version of the same secret then that staging label is automatically
     *        removed from the other version and attached to this version.
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the
     *        staging label <code>AWSCURRENT</code> to this new version.
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
     * (Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging
     * labels are used to track the versions through the rotation process by the Lambda rotation function.
     * </p>
     * <p>
     * A staging label must be unique to a single version of the secret. If you specify a staging label that's already
     * associated with a different version of the same secret then that staging label is automatically removed from the
     * other version and attached to this version.
     * </p>
     * <p>
     * If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging
     * label <code>AWSCURRENT</code> to this new version.
     * </p>
     * 
     * @param versionStages
     *        (Optional) Specifies a list of staging labels that are attached to this version of the secret. These
     *        staging labels are used to track the versions through the rotation process by the Lambda rotation
     *        function.</p>
     *        <p>
     *        A staging label must be unique to a single version of the secret. If you specify a staging label that's
     *        already associated with a different version of the same secret then that staging label is automatically
     *        removed from the other version and attached to this version.
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the
     *        staging label <code>AWSCURRENT</code> to this new version.
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
