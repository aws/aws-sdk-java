/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request for this parameter. If you don't use
     * the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You only need to specify your own value if you are implementing your own retry logic and want to ensure that a
     * given secret is not created twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * <p>
     * Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures
     * and retries during the function's processing.
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
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation is
     * idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from the request then an error occurs because you cannot modify an
     * existing secret value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>SecretVersionId</code> of the new version.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
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
     * Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the
     *        friendly name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * 
     * @return Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or
     *         the friendly name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret that you want to rotate. You can specify either the Amazon Resource Name (ARN) or the
     *        friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request for this parameter. If you don't use
     * the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You only need to specify your own value if you are implementing your own retry logic and want to ensure that a
     * given secret is not created twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * <p>
     * Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures
     * and retries during the function's processing.
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
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation is
     * idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from the request then an error occurs because you cannot modify an
     * existing secret value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>SecretVersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     *        </p>
     *        <p>
     *        If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *        empty. The CLI or SDK generates a random UUID for you and includes that in the request for this parameter.
     *        If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint,
     *        then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value
     *        in the request.
     *        </p>
     *        <p>
     *        You only need to specify your own value if you are implementing your own retry logic and want to ensure
     *        that a given secret is not created twice. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *        within the specified secret.
     *        </p>
     *        <p>
     *        Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are
     *        failures and retries during the function's processing.
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
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation
     *        is idempotent).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from the request then an error occurs because you cannot
     *        modify an existing secret value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value becomes the <code>SecretVersionId</code> of the new version.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request for this parameter. If you don't use
     * the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You only need to specify your own value if you are implementing your own retry logic and want to ensure that a
     * given secret is not created twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * <p>
     * Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures
     * and retries during the function's processing.
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
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation is
     * idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from the request then an error occurs because you cannot modify an
     * existing secret value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>SecretVersionId</code> of the new version.
     * </p>
     * 
     * @return (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     *         </p>
     *         <p>
     *         If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *         empty. The CLI or SDK generates a random UUID for you and includes that in the request for this
     *         parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager
     *         service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and
     *         include that value in the request.
     *         </p>
     *         <p>
     *         You only need to specify your own value if you are implementing your own retry logic and want to ensure
     *         that a given secret is not created twice. We recommend that you generate a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *         within the specified secret.
     *         </p>
     *         <p>
     *         Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are
     *         failures and retries during the function's processing.
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
     *         If a version with this value already exists and that version's <code>SecretString</code> and
     *         <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation
     *         is idempotent).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a version with this value already exists and that version's <code>SecretString</code> and
     *         <code>SecretBinary</code> values are different from the request then an error occurs because you cannot
     *         modify an existing secret value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This value becomes the <code>SecretVersionId</code> of the new version.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request for this parameter. If you don't use
     * the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a
     * <code>ClientRequestToken</code> yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You only need to specify your own value if you are implementing your own retry logic and want to ensure that a
     * given secret is not created twice. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within
     * the specified secret.
     * </p>
     * <p>
     * Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures
     * and retries during the function's processing.
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
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation is
     * idempotent).
     * </p>
     * </li>
     * <li>
     * <p>
     * If a version with this value already exists and that version's <code>SecretString</code> and
     * <code>SecretBinary</code> values are different from the request then an error occurs because you cannot modify an
     * existing secret value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value becomes the <code>SecretVersionId</code> of the new version.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) Specifies a unique identifier for the new version of the secret that helps ensure idempotency.
     *        </p>
     *        <p>
     *        If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *        empty. The CLI or SDK generates a random UUID for you and includes that in the request for this parameter.
     *        If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint,
     *        then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value
     *        in the request.
     *        </p>
     *        <p>
     *        You only need to specify your own value if you are implementing your own retry logic and want to ensure
     *        that a given secret is not created twice. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness
     *        within the specified secret.
     *        </p>
     *        <p>
     *        Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are
     *        failures and retries during the function's processing.
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
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are the same as the request, then the request is ignored (the operation
     *        is idempotent).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a version with this value already exists and that version's <code>SecretString</code> and
     *        <code>SecretBinary</code> values are different from the request then an error occurs because you cannot
     *        modify an existing secret value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value becomes the <code>SecretVersionId</code> of the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
     * </p>
     * 
     * @param rotationLambdaARN
     *        (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
     */

    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>
     * (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
     * </p>
     * 
     * @return (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
     */

    public String getRotationLambdaARN() {
        return this.rotationLambdaARN;
    }

    /**
     * <p>
     * (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
     * </p>
     * 
     * @param rotationLambdaARN
     *        (Optional) Specifies the ARN of the Lambda function that can rotate the secret.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RotationRules: ").append(getRotationRules());
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
        return hashCode;
    }

    @Override
    public RotateSecretRequest clone() {
        return (RotateSecretRequest) super.clone();
    }

}
