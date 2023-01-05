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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CreateSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * <p>
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     * </p>
     * <p>
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and
     * unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen and
     * six random characters after the secret name at the end of the ARN.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an initial
     * version for the secret, and this parameter specifies the unique identifier for the new version.
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
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during a rotation. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness of your
     * versions within the specified secret.
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
     * If a version with this value already exists and the version <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
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
     * The description of the secret.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the secret. An
     * alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * To use a KMS key in a different account, use the key ARN or the alias ARN.
     * </p>
     * <p>
     * If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If that key
     * doesn't yet exist, then Secrets Manager creates it for you automatically the first time it encrypts the secret
     * value.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary
     * data in a file and then pass the contents of the file as a parameter.
     * </p>
     * <p>
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * This parameter is not available in the Secrets Manager console.
     * </p>
     */
    private java.nio.ByteBuffer secretBinary;
    /**
     * <p>
     * The text data to encrypt and store in this new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret text
     * in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON
     * structure of key/value pairs that a Lambda rotation function can parse.
     * </p>
     */
    private String secretString;
    /**
     * <p>
     * A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string, for
     * example:
     * </p>
     * <p>
     * <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     * </p>
     * <p>
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one with key
     * "abc".
     * </p>
     * <p>
     * If you check tags in permissions policies as part of your security strategy, then adding or removing a tag can
     * change permissions. If the completion of this operation would result in you losing your permissions for this
     * secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code> error. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     * >Control access to secrets using tags</a> and <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     * >Limit access to identities with tags that match secrets' tags</a>.
     * </p>
     * <p>
     * For information about how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of Regions and KMS keys to replicate secrets.
     * </p>
     */
    private java.util.List<ReplicaRegionType> addReplicaRegions;
    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     */
    private Boolean forceOverwriteReplicaSecret;

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * <p>
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     * </p>
     * <p>
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and
     * unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen and
     * six random characters after the secret name at the end of the ARN.
     * </p>
     * 
     * @param name
     *        The name of the new secret.</p>
     *        <p>
     *        The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     *        </p>
     *        <p>
     *        Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and
     *        unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen
     *        and six random characters after the secret name at the end of the ARN.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * <p>
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     * </p>
     * <p>
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and
     * unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen and
     * six random characters after the secret name at the end of the ARN.
     * </p>
     * 
     * @return The name of the new secret.</p>
     *         <p>
     *         The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     *         </p>
     *         <p>
     *         Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion
     *         and unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a
     *         hyphen and six random characters after the secret name at the end of the ARN.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new secret.
     * </p>
     * <p>
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     * </p>
     * <p>
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and
     * unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen and
     * six random characters after the secret name at the end of the ARN.
     * </p>
     * 
     * @param name
     *        The name of the new secret.</p>
     *        <p>
     *        The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@-
     *        </p>
     *        <p>
     *        Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and
     *        unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen
     *        and six random characters after the secret name at the end of the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an initial
     * version for the secret, and this parameter specifies the unique identifier for the new version.
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
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during a rotation. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness of your
     * versions within the specified secret.
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
     * If a version with this value already exists and the version <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an
     *        initial version for the secret, and this parameter specifies the unique identifier for the new version.
     *        </p> <note>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then
     *        you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the
     *        value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request
     *        to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself
     *        for the new version and include the value in the request.
     *        </p>
     *        </note>
     *        <p>
     *        This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     *        duplicate versions if there are failures and retries during a rotation. We recommend that you generate a
     *        <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure
     *        uniqueness of your versions within the specified secret.
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
     *        If a version with this value already exists and the version <code>SecretString</code> and
     *        <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from those in the request, then the request fails because
     *        you cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
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
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an initial
     * version for the secret, and this parameter specifies the unique identifier for the new version.
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
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during a rotation. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness of your
     * versions within the specified secret.
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
     * If a version with this value already exists and the version <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @return If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an
     *         initial version for the secret, and this parameter specifies the unique identifier for the new version.
     *         </p> <note>
     *         <p>
     *         If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation,
     *         then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it
     *         as the value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP
     *         request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code>
     *         yourself for the new version and include the value in the request.
     *         </p>
     *         </note>
     *         <p>
     *         This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation
     *         of duplicate versions if there are failures and retries during a rotation. We recommend that you generate
     *         a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure
     *         uniqueness of your versions within the specified secret.
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
     *         If a version with this value already exists and the version <code>SecretString</code> and
     *         <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a version with this value already exists and that version's <code>SecretString</code> and
     *         <code>SecretBinary</code> values are different from those in the request, then the request fails because
     *         you cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
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
     * If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an initial
     * version for the secret, and this parameter specifies the unique identifier for the new version.
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
     * This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     * duplicate versions if there are failures and retries during a rotation. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness of your
     * versions within the specified secret.
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
     * If a version with this value already exists and the version <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from those in the request, then the request fails because you
     * cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        If you include <code>SecretString</code> or <code>SecretBinary</code>, then Secrets Manager creates an
     *        initial version for the secret, and this parameter specifies the unique identifier for the new version.
     *        </p> <note>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then
     *        you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the
     *        value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request
     *        to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself
     *        for the new version and include the value in the request.
     *        </p>
     *        </note>
     *        <p>
     *        This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of
     *        duplicate versions if there are failures and retries during a rotation. We recommend that you generate a
     *        <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure
     *        uniqueness of your versions within the specified secret.
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
     *        If a version with this value already exists and the version <code>SecretString</code> and
     *        <code>SecretBinary</code> values are the same as those in the request, then the request is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from those in the request, then the request fails because
     *        you cannot modify an existing version. Instead, use <a>PutSecretValue</a> to create a new version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value becomes the <code>VersionId</code> of the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withClientRequestToken(String clientRequestToken) {
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

    public CreateSecretRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the secret. An
     * alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * To use a KMS key in a different account, use the key ARN or the alias ARN.
     * </p>
     * <p>
     * If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If that key
     * doesn't yet exist, then Secrets Manager creates it for you automatically the first time it encrypts the secret
     * value.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the
     *        secret. An alias is always prefixed by <code>alias/</code>, for example
     *        <code>alias/aws/secretsmanager</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About aliases</a>.</p>
     *        <p>
     *        To use a KMS key in a different account, use the key ARN or the alias ARN.
     *        </p>
     *        <p>
     *        If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If
     *        that key doesn't yet exist, then Secrets Manager creates it for you automatically the first time it
     *        encrypts the secret value.
     *        </p>
     *        <p>
     *        If the secret is in a different Amazon Web Services account from the credentials calling the API, then you
     *        can't use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer
     *        managed KMS key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the secret. An
     * alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * To use a KMS key in a different account, use the key ARN or the alias ARN.
     * </p>
     * <p>
     * If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If that key
     * doesn't yet exist, then Secrets Manager creates it for you automatically the first time it encrypts the secret
     * value.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     * 
     * @return The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the
     *         secret. An alias is always prefixed by <code>alias/</code>, for example
     *         <code>alias/aws/secretsmanager</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About aliases</a>.</p>
     *         <p>
     *         To use a KMS key in a different account, use the key ARN or the alias ARN.
     *         </p>
     *         <p>
     *         If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If
     *         that key doesn't yet exist, then Secrets Manager creates it for you automatically the first time it
     *         encrypts the secret value.
     *         </p>
     *         <p>
     *         If the secret is in a different Amazon Web Services account from the credentials calling the API, then
     *         you can't use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a
     *         customer managed KMS key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the secret. An
     * alias is always prefixed by <code>alias/</code>, for example <code>alias/aws/secretsmanager</code>. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About
     * aliases</a>.
     * </p>
     * <p>
     * To use a KMS key in a different account, use the key ARN or the alias ARN.
     * </p>
     * <p>
     * If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If that key
     * doesn't yet exist, then Secrets Manager creates it for you automatically the first time it encrypts the secret
     * value.
     * </p>
     * <p>
     * If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't
     * use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer managed KMS
     * key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the
     *        secret. An alias is always prefixed by <code>alias/</code>, for example
     *        <code>alias/aws/secretsmanager</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html">About aliases</a>.</p>
     *        <p>
     *        To use a KMS key in a different account, use the key ARN or the alias ARN.
     *        </p>
     *        <p>
     *        If you don't specify this value, then Secrets Manager uses the key <code>aws/secretsmanager</code>. If
     *        that key doesn't yet exist, then Secrets Manager creates it for you automatically the first time it
     *        encrypts the secret value.
     *        </p>
     *        <p>
     *        If the secret is in a different Amazon Web Services account from the credentials calling the API, then you
     *        can't use <code>aws/secretsmanager</code> to encrypt the secret, and you must create and use a customer
     *        managed KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary
     * data in a file and then pass the contents of the file as a parameter.
     * </p>
     * <p>
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * This parameter is not available in the Secrets Manager console.
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
     *        binary data in a file and then pass the contents of the file as a parameter.</p>
     *        <p>
     *        Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     *        </p>
     *        <p>
     *        This parameter is not available in the Secrets Manager console.
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
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * This parameter is not available in the Secrets Manager console.
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
     *         binary data in a file and then pass the contents of the file as a parameter.</p>
     *         <p>
     *         Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     *         </p>
     *         <p>
     *         This parameter is not available in the Secrets Manager console.
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
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * This parameter is not available in the Secrets Manager console.
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
     *        binary data in a file and then pass the contents of the file as a parameter.</p>
     *        <p>
     *        Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     *        </p>
     *        <p>
     *        This parameter is not available in the Secrets Manager console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withSecretBinary(java.nio.ByteBuffer secretBinary) {
        setSecretBinary(secretBinary);
        return this;
    }

    /**
     * <p>
     * The text data to encrypt and store in this new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret text
     * in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON
     * structure of key/value pairs that a Lambda rotation function can parse.
     * </p>
     * 
     * @param secretString
     *        The text data to encrypt and store in this new version of the secret. We recommend you use a JSON
     *        structure of key/value pairs for your secret value.</p>
     *        <p>
     *        Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     *        </p>
     *        <p>
     *        If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret
     *        text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information
     *        as a JSON structure of key/value pairs that a Lambda rotation function can parse.
     */

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>
     * The text data to encrypt and store in this new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret text
     * in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON
     * structure of key/value pairs that a Lambda rotation function can parse.
     * </p>
     * 
     * @return The text data to encrypt and store in this new version of the secret. We recommend you use a JSON
     *         structure of key/value pairs for your secret value.</p>
     *         <p>
     *         Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     *         </p>
     *         <p>
     *         If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected
     *         secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the
     *         information as a JSON structure of key/value pairs that a Lambda rotation function can parse.
     */

    public String getSecretString() {
        return this.secretString;
    }

    /**
     * <p>
     * The text data to encrypt and store in this new version of the secret. We recommend you use a JSON structure of
     * key/value pairs for your secret value.
     * </p>
     * <p>
     * Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     * </p>
     * <p>
     * If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret text
     * in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON
     * structure of key/value pairs that a Lambda rotation function can parse.
     * </p>
     * 
     * @param secretString
     *        The text data to encrypt and store in this new version of the secret. We recommend you use a JSON
     *        structure of key/value pairs for your secret value.</p>
     *        <p>
     *        Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both.
     *        </p>
     *        <p>
     *        If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret
     *        text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information
     *        as a JSON structure of key/value pairs that a Lambda rotation function can parse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withSecretString(String secretString) {
        setSecretString(secretString);
        return this;
    }

    /**
     * <p>
     * A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string, for
     * example:
     * </p>
     * <p>
     * <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     * </p>
     * <p>
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one with key
     * "abc".
     * </p>
     * <p>
     * If you check tags in permissions policies as part of your security strategy, then adding or removing a tag can
     * change permissions. If the completion of this operation would result in you losing your permissions for this
     * secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code> error. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     * >Control access to secrets using tags</a> and <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     * >Limit access to identities with tags that match secrets' tags</a>.
     * </p>
     * <p>
     * For information about how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text
     *         string, for example:</p>
     *         <p>
     *         <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     *         </p>
     *         <p>
     *         Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one
     *         with key "abc".
     *         </p>
     *         <p>
     *         If you check tags in permissions policies as part of your security strategy, then adding or removing a
     *         tag can change permissions. If the completion of this operation would result in you losing your
     *         permissions for this secret, then Secrets Manager blocks the operation and returns an
     *         <code>Access Denied</code> error. For more information, see <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     *         >Control access to secrets using tags</a> and <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     *         >Limit access to identities with tags that match secrets' tags</a>.
     *         </p>
     *         <p>
     *         For information about how to format a JSON parameter for the various command line tool environments, see
     *         <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *         JSON for Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter,
     *         you should use single quotes to avoid confusion with the double quotes required in the JSON text.
     *         </p>
     *         <p>
     *         The following restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per secret: 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 127 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 255 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves
     *         it for Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with
     *         this prefix do not count against your tags per secret limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use your tagging schema across multiple services and resources, other services might have
     *         restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers
     *         representable in UTF-8, plus the following special characters: + - = . _ : / @.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string, for
     * example:
     * </p>
     * <p>
     * <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     * </p>
     * <p>
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one with key
     * "abc".
     * </p>
     * <p>
     * If you check tags in permissions policies as part of your security strategy, then adding or removing a tag can
     * change permissions. If the completion of this operation would result in you losing your permissions for this
     * secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code> error. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     * >Control access to secrets using tags</a> and <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     * >Limit access to identities with tags that match secrets' tags</a>.
     * </p>
     * <p>
     * For information about how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string,
     *        for example:</p>
     *        <p>
     *        <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     *        </p>
     *        <p>
     *        Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one
     *        with key "abc".
     *        </p>
     *        <p>
     *        If you check tags in permissions policies as part of your security strategy, then adding or removing a tag
     *        can change permissions. If the completion of this operation would result in you losing your permissions
     *        for this secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code>
     *        error. For more information, see <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     *        >Control access to secrets using tags</a> and <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     *        >Limit access to identities with tags that match secrets' tags</a>.
     *        </p>
     *        <p>
     *        For information about how to format a JSON parameter for the various command line tool environments, see
     *        <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter,
     *        you should use single quotes to avoid confusion with the double quotes required in the JSON text.
     *        </p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per secret: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 127 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 255 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves
     *        it for Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with
     *        this prefix do not count against your tags per secret limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use your tagging schema across multiple services and resources, other services might have
     *        restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers
     *        representable in UTF-8, plus the following special characters: + - = . _ : / @.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string, for
     * example:
     * </p>
     * <p>
     * <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     * </p>
     * <p>
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one with key
     * "abc".
     * </p>
     * <p>
     * If you check tags in permissions policies as part of your security strategy, then adding or removing a tag can
     * change permissions. If the completion of this operation would result in you losing your permissions for this
     * secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code> error. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     * >Control access to secrets using tags</a> and <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     * >Limit access to identities with tags that match secrets' tags</a>.
     * </p>
     * <p>
     * For information about how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string,
     *        for example:</p>
     *        <p>
     *        <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     *        </p>
     *        <p>
     *        Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one
     *        with key "abc".
     *        </p>
     *        <p>
     *        If you check tags in permissions policies as part of your security strategy, then adding or removing a tag
     *        can change permissions. If the completion of this operation would result in you losing your permissions
     *        for this secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code>
     *        error. For more information, see <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     *        >Control access to secrets using tags</a> and <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     *        >Limit access to identities with tags that match secrets' tags</a>.
     *        </p>
     *        <p>
     *        For information about how to format a JSON parameter for the various command line tool environments, see
     *        <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter,
     *        you should use single quotes to avoid confusion with the double quotes required in the JSON text.
     *        </p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per secret: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 127 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 255 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves
     *        it for Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with
     *        this prefix do not count against your tags per secret limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use your tagging schema across multiple services and resources, other services might have
     *        restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers
     *        representable in UTF-8, plus the following special characters: + - = . _ : / @.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string, for
     * example:
     * </p>
     * <p>
     * <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     * </p>
     * <p>
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one with key
     * "abc".
     * </p>
     * <p>
     * If you check tags in permissions policies as part of your security strategy, then adding or removing a tag can
     * change permissions. If the completion of this operation would result in you losing your permissions for this
     * secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code> error. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     * >Control access to secrets using tags</a> and <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     * >Limit access to identities with tags that match secrets' tags</a>.
     * </p>
     * <p>
     * For information about how to format a JSON parameter for the various command line tool environments, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter, you should use
     * single quotes to avoid confusion with the double quotes required in the JSON text.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per secret: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 127 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 255 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves it for
     * Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do
     * not count against your tags per secret limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use your tagging schema across multiple services and resources, other services might have restrictions on
     * allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the
     * following special characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string,
     *        for example:</p>
     *        <p>
     *        <code>[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]</code>
     *        </p>
     *        <p>
     *        Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one
     *        with key "abc".
     *        </p>
     *        <p>
     *        If you check tags in permissions policies as part of your security strategy, then adding or removing a tag
     *        can change permissions. If the completion of this operation would result in you losing your permissions
     *        for this secret, then Secrets Manager blocks the operation and returns an <code>Access Denied</code>
     *        error. For more information, see <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac"
     *        >Control access to secrets using tags</a> and <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2"
     *        >Limit access to identities with tags that match secrets' tags</a>.
     *        </p>
     *        <p>
     *        For information about how to format a JSON parameter for the various command line tool environments, see
     *        <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a>. If your command-line tool or SDK requires quotation marks around the parameter,
     *        you should use single quotes to avoid confusion with the double quotes required in the JSON text.
     *        </p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per secret: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 127 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 255 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use the <code>aws:</code> prefix in your tag names or values because Amazon Web Services reserves
     *        it for Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with
     *        this prefix do not count against your tags per secret limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use your tagging schema across multiple services and resources, other services might have
     *        restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers
     *        representable in UTF-8, plus the following special characters: + - = . _ : / @.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of Regions and KMS keys to replicate secrets.
     * </p>
     * 
     * @return A list of Regions and KMS keys to replicate secrets.
     */

    public java.util.List<ReplicaRegionType> getAddReplicaRegions() {
        return addReplicaRegions;
    }

    /**
     * <p>
     * A list of Regions and KMS keys to replicate secrets.
     * </p>
     * 
     * @param addReplicaRegions
     *        A list of Regions and KMS keys to replicate secrets.
     */

    public void setAddReplicaRegions(java.util.Collection<ReplicaRegionType> addReplicaRegions) {
        if (addReplicaRegions == null) {
            this.addReplicaRegions = null;
            return;
        }

        this.addReplicaRegions = new java.util.ArrayList<ReplicaRegionType>(addReplicaRegions);
    }

    /**
     * <p>
     * A list of Regions and KMS keys to replicate secrets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddReplicaRegions(java.util.Collection)} or {@link #withAddReplicaRegions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param addReplicaRegions
     *        A list of Regions and KMS keys to replicate secrets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withAddReplicaRegions(ReplicaRegionType... addReplicaRegions) {
        if (this.addReplicaRegions == null) {
            setAddReplicaRegions(new java.util.ArrayList<ReplicaRegionType>(addReplicaRegions.length));
        }
        for (ReplicaRegionType ele : addReplicaRegions) {
            this.addReplicaRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Regions and KMS keys to replicate secrets.
     * </p>
     * 
     * @param addReplicaRegions
     *        A list of Regions and KMS keys to replicate secrets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withAddReplicaRegions(java.util.Collection<ReplicaRegionType> addReplicaRegions) {
        setAddReplicaRegions(addReplicaRegions);
        return this;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @param forceOverwriteReplicaSecret
     *        Specifies whether to overwrite a secret with the same name in the destination Region.
     */

    public void setForceOverwriteReplicaSecret(Boolean forceOverwriteReplicaSecret) {
        this.forceOverwriteReplicaSecret = forceOverwriteReplicaSecret;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @return Specifies whether to overwrite a secret with the same name in the destination Region.
     */

    public Boolean getForceOverwriteReplicaSecret() {
        return this.forceOverwriteReplicaSecret;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @param forceOverwriteReplicaSecret
     *        Specifies whether to overwrite a secret with the same name in the destination Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecretRequest withForceOverwriteReplicaSecret(Boolean forceOverwriteReplicaSecret) {
        setForceOverwriteReplicaSecret(forceOverwriteReplicaSecret);
        return this;
    }

    /**
     * <p>
     * Specifies whether to overwrite a secret with the same name in the destination Region.
     * </p>
     * 
     * @return Specifies whether to overwrite a secret with the same name in the destination Region.
     */

    public Boolean isForceOverwriteReplicaSecret() {
        return this.forceOverwriteReplicaSecret;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSecretBinary() != null)
            sb.append("SecretBinary: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretString() != null)
            sb.append("SecretString: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAddReplicaRegions() != null)
            sb.append("AddReplicaRegions: ").append(getAddReplicaRegions()).append(",");
        if (getForceOverwriteReplicaSecret() != null)
            sb.append("ForceOverwriteReplicaSecret: ").append(getForceOverwriteReplicaSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecretRequest == false)
            return false;
        CreateSecretRequest other = (CreateSecretRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAddReplicaRegions() == null ^ this.getAddReplicaRegions() == null)
            return false;
        if (other.getAddReplicaRegions() != null && other.getAddReplicaRegions().equals(this.getAddReplicaRegions()) == false)
            return false;
        if (other.getForceOverwriteReplicaSecret() == null ^ this.getForceOverwriteReplicaSecret() == null)
            return false;
        if (other.getForceOverwriteReplicaSecret() != null && other.getForceOverwriteReplicaSecret().equals(this.getForceOverwriteReplicaSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretBinary() == null) ? 0 : getSecretBinary().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAddReplicaRegions() == null) ? 0 : getAddReplicaRegions().hashCode());
        hashCode = prime * hashCode + ((getForceOverwriteReplicaSecret() == null) ? 0 : getForceOverwriteReplicaSecret().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecretRequest clone() {
        return (CreateSecretRequest) super.clone();
    }

}
