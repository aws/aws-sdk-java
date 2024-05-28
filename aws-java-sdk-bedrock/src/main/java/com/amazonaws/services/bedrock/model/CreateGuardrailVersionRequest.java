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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrailVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGuardrailVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * A description of the guardrail version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail.
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @return The unique identifier of the guardrail.
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailVersionRequest withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * A description of the guardrail version.
     * </p>
     * 
     * @param description
     *        A description of the guardrail version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the guardrail version.
     * </p>
     * 
     * @return A description of the guardrail version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the guardrail version.
     * </p>
     * 
     * @param description
     *        A description of the guardrail version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this
     *        token matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this
     *         token matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon S3 User Guide</i>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than once. If this
     *        token matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGuardrailVersionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGuardrailVersionRequest == false)
            return false;
        CreateGuardrailVersionRequest other = (CreateGuardrailVersionRequest) obj;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateGuardrailVersionRequest clone() {
        return (CreateGuardrailVersionRequest) super.clone();
    }

}
