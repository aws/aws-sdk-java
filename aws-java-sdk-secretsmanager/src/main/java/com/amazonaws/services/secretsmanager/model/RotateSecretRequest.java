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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotateSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret to rotate.
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
     * A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses this
     * value to prevent the accidental creation of duplicate versions if there are failures and retries during rotation.
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then you can
     * leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request for
     * this parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that
     * value in the request.
     * </p>
     * <p>
     * You only need to specify this value if you implement your own retry logic and you want to ensure that Secrets
     * Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The ARN of the Lambda rotation function that can rotate the secret.
     * </p>
     */
    private String rotationLambdaARN;
    /**
     * <p>
     * A structure that defines the rotation configuration for this secret.
     * </p>
     */
    private RotationRulesType rotationRules;
    /**
     * <p>
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The rotation
     * schedule is defined in <a>RotateSecretRequest$RotationRules</a>.
     * </p>
     * <p>
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     * <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an <code>AWSPENDING</code>
     * version of the secret and then removes it.
     * </p>
     * <p>
     * If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     * </p>
     */
    private Boolean rotateImmediately;

    /**
     * <p>
     * The ARN or name of the secret to rotate.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to rotate.</p>
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
     * The ARN or name of the secret to rotate.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret to rotate.</p>
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
     * The ARN or name of the secret to rotate.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to rotate.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses this
     * value to prevent the accidental creation of duplicate versions if there are failures and retries during rotation.
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then you can
     * leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request for
     * this parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that
     * value in the request.
     * </p>
     * <p>
     * You only need to specify this value if you implement your own retry logic and you want to ensure that Secrets
     * Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses
     *        this value to prevent the accidental creation of duplicate versions if there are failures and retries
     *        during rotation. This value becomes the <code>VersionId</code> of the new version.</p>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then
     *        you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in
     *        the request for this parameter. If you don't use the SDK and instead generate a raw HTTP request to the
     *        Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for
     *        new versions and include that value in the request.
     *        </p>
     *        <p>
     *        You only need to specify this value if you implement your own retry logic and you want to ensure that
     *        Secrets Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *        within the specified secret.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses this
     * value to prevent the accidental creation of duplicate versions if there are failures and retries during rotation.
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then you can
     * leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request for
     * this parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that
     * value in the request.
     * </p>
     * <p>
     * You only need to specify this value if you implement your own retry logic and you want to ensure that Secrets
     * Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * 
     * @return A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses
     *         this value to prevent the accidental creation of duplicate versions if there are failures and retries
     *         during rotation. This value becomes the <code>VersionId</code> of the new version.</p>
     *         <p>
     *         If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then
     *         you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in
     *         the request for this parameter. If you don't use the SDK and instead generate a raw HTTP request to the
     *         Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for
     *         new versions and include that value in the request.
     *         </p>
     *         <p>
     *         You only need to specify this value if you implement your own retry logic and you want to ensure that
     *         Secrets Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *         within the specified secret.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses this
     * value to prevent the accidental creation of duplicate versions if there are failures and retries during rotation.
     * This value becomes the <code>VersionId</code> of the new version.
     * </p>
     * <p>
     * If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then you can
     * leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request for
     * this parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that
     * value in the request.
     * </p>
     * <p>
     * You only need to specify this value if you implement your own retry logic and you want to ensure that Secrets
     * Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses
     *        this value to prevent the accidental creation of duplicate versions if there are failures and retries
     *        during rotation. This value becomes the <code>VersionId</code> of the new version.</p>
     *        <p>
     *        If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then
     *        you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in
     *        the request for this parameter. If you don't use the SDK and instead generate a raw HTTP request to the
     *        Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for
     *        new versions and include that value in the request.
     *        </p>
     *        <p>
     *        You only need to specify this value if you implement your own retry logic and you want to ensure that
     *        Secrets Manager doesn't attempt to create a secret version twice. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *        within the specified secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda rotation function that can rotate the secret.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of the Lambda rotation function that can rotate the secret.
     */

    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of the Lambda rotation function that can rotate the secret.
     * </p>
     * 
     * @return The ARN of the Lambda rotation function that can rotate the secret.
     */

    public String getRotationLambdaARN() {
        return this.rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of the Lambda rotation function that can rotate the secret.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of the Lambda rotation function that can rotate the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withRotationLambdaARN(String rotationLambdaARN) {
        setRotationLambdaARN(rotationLambdaARN);
        return this;
    }

    /**
     * <p>
     * A structure that defines the rotation configuration for this secret.
     * </p>
     * 
     * @param rotationRules
     *        A structure that defines the rotation configuration for this secret.
     */

    public void setRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>
     * A structure that defines the rotation configuration for this secret.
     * </p>
     * 
     * @return A structure that defines the rotation configuration for this secret.
     */

    public RotationRulesType getRotationRules() {
        return this.rotationRules;
    }

    /**
     * <p>
     * A structure that defines the rotation configuration for this secret.
     * </p>
     * 
     * @param rotationRules
     *        A structure that defines the rotation configuration for this secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withRotationRules(RotationRulesType rotationRules) {
        setRotationRules(rotationRules);
        return this;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The rotation
     * schedule is defined in <a>RotateSecretRequest$RotationRules</a>.
     * </p>
     * <p>
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     * <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an <code>AWSPENDING</code>
     * version of the secret and then removes it.
     * </p>
     * <p>
     * If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     * </p>
     * 
     * @param rotateImmediately
     *        Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The
     *        rotation schedule is defined in <a>RotateSecretRequest$RotationRules</a>.</p>
     *        <p>
     *        If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running
     *        the <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     *        <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an
     *        <code>AWSPENDING</code> version of the secret and then removes it.
     *        </p>
     *        <p>
     *        If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     */

    public void setRotateImmediately(Boolean rotateImmediately) {
        this.rotateImmediately = rotateImmediately;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The rotation
     * schedule is defined in <a>RotateSecretRequest$RotationRules</a>.
     * </p>
     * <p>
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     * <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an <code>AWSPENDING</code>
     * version of the secret and then removes it.
     * </p>
     * <p>
     * If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     * </p>
     * 
     * @return Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The
     *         rotation schedule is defined in <a>RotateSecretRequest$RotationRules</a>.</p>
     *         <p>
     *         If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running
     *         the <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     *         <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an
     *         <code>AWSPENDING</code> version of the secret and then removes it.
     *         </p>
     *         <p>
     *         If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     */

    public Boolean getRotateImmediately() {
        return this.rotateImmediately;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The rotation
     * schedule is defined in <a>RotateSecretRequest$RotationRules</a>.
     * </p>
     * <p>
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     * <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an <code>AWSPENDING</code>
     * version of the secret and then removes it.
     * </p>
     * <p>
     * If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     * </p>
     * 
     * @param rotateImmediately
     *        Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The
     *        rotation schedule is defined in <a>RotateSecretRequest$RotationRules</a>.</p>
     *        <p>
     *        If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running
     *        the <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     *        <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an
     *        <code>AWSPENDING</code> version of the secret and then removes it.
     *        </p>
     *        <p>
     *        If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withRotateImmediately(Boolean rotateImmediately) {
        setRotateImmediately(rotateImmediately);
        return this;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The rotation
     * schedule is defined in <a>RotateSecretRequest$RotationRules</a>.
     * </p>
     * <p>
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running the <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     * <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an <code>AWSPENDING</code>
     * version of the secret and then removes it.
     * </p>
     * <p>
     * If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     * </p>
     * 
     * @return Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The
     *         rotation schedule is defined in <a>RotateSecretRequest$RotationRules</a>.</p>
     *         <p>
     *         If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running
     *         the <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">
     *         <code>testSecret</code> step</a> of the Lambda rotation function. The test creates an
     *         <code>AWSPENDING</code> version of the secret and then removes it.
     *         </p>
     *         <p>
     *         If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
     */

    public Boolean isRotateImmediately() {
        return this.rotateImmediately;
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
        if (getRotationLambdaARN() != null)
            sb.append("RotationLambdaARN: ").append(getRotationLambdaARN()).append(",");
        if (getRotationRules() != null)
            sb.append("RotationRules: ").append(getRotationRules()).append(",");
        if (getRotateImmediately() != null)
            sb.append("RotateImmediately: ").append(getRotateImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotateSecretRequest == false)
            return false;
        RotateSecretRequest other = (RotateSecretRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getRotationLambdaARN() == null ^ this.getRotationLambdaARN() == null)
            return false;
        if (other.getRotationLambdaARN() != null && other.getRotationLambdaARN().equals(this.getRotationLambdaARN()) == false)
            return false;
        if (other.getRotationRules() == null ^ this.getRotationRules() == null)
            return false;
        if (other.getRotationRules() != null && other.getRotationRules().equals(this.getRotationRules()) == false)
            return false;
        if (other.getRotateImmediately() == null ^ this.getRotateImmediately() == null)
            return false;
        if (other.getRotateImmediately() != null && other.getRotateImmediately().equals(this.getRotateImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getRotationLambdaARN() == null) ? 0 : getRotationLambdaARN().hashCode());
        hashCode = prime * hashCode + ((getRotationRules() == null) ? 0 : getRotationRules().hashCode());
        hashCode = prime * hashCode + ((getRotateImmediately() == null) ? 0 : getRotateImmediately().hashCode());
        return hashCode;
    }

    @Override
    public RotateSecretRequest clone() {
        return (RotateSecretRequest) super.clone();
    }

}
