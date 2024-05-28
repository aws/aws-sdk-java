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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyStore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the validation setting for this policy store.
     * </p>
     * <p>
     * Currently, the only valid and required value is <code>Mode</code>.
     * </p>
     * <important>
     * <p>
     * We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema doesn't exist,
     * then <code>STRICT</code> mode causes any policy to fail validation, and Verified Permissions rejects the policy.
     * You can turn off validation by using the <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a> again to turn validation back on.
     * </p>
     * </important>
     */
    private ValidationSettings validationSettings;
    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>ConflictException</code> error.
     *        </p>
     *        <p>
     *        Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next
     *        request with the same parameters performs the operation again regardless of the value of
     *        <code>ClientToken</code>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This
     *         lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>ConflictException</code> error.
     *         </p>
     *         <p>
     *         Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next
     *         request with the same parameters performs the operation again regardless of the value of
     *         <code>ClientToken</code>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>ConflictException</code> error.
     *        </p>
     *        <p>
     *        Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next
     *        request with the same parameters performs the operation again regardless of the value of
     *        <code>ClientToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyStoreRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the validation setting for this policy store.
     * </p>
     * <p>
     * Currently, the only valid and required value is <code>Mode</code>.
     * </p>
     * <important>
     * <p>
     * We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema doesn't exist,
     * then <code>STRICT</code> mode causes any policy to fail validation, and Verified Permissions rejects the policy.
     * You can turn off validation by using the <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a> again to turn validation back on.
     * </p>
     * </important>
     * 
     * @param validationSettings
     *        Specifies the validation setting for this policy store.</p>
     *        <p>
     *        Currently, the only valid and required value is <code>Mode</code>.
     *        </p>
     *        <important>
     *        <p>
     *        We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema doesn't
     *        exist, then <code>STRICT</code> mode causes any policy to fail validation, and Verified Permissions
     *        rejects the policy. You can turn off validation by using the <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     *        >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     *        >UpdatePolicyStore</a> again to turn validation back on.
     *        </p>
     */

    public void setValidationSettings(ValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
    }

    /**
     * <p>
     * Specifies the validation setting for this policy store.
     * </p>
     * <p>
     * Currently, the only valid and required value is <code>Mode</code>.
     * </p>
     * <important>
     * <p>
     * We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema doesn't exist,
     * then <code>STRICT</code> mode causes any policy to fail validation, and Verified Permissions rejects the policy.
     * You can turn off validation by using the <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a> again to turn validation back on.
     * </p>
     * </important>
     * 
     * @return Specifies the validation setting for this policy store.</p>
     *         <p>
     *         Currently, the only valid and required value is <code>Mode</code>.
     *         </p>
     *         <important>
     *         <p>
     *         We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema
     *         doesn't exist, then <code>STRICT</code> mode causes any policy to fail validation, and Verified
     *         Permissions rejects the policy. You can turn off validation by using the <a
     *         href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     *         >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     *         href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     *         >UpdatePolicyStore</a> again to turn validation back on.
     *         </p>
     */

    public ValidationSettings getValidationSettings() {
        return this.validationSettings;
    }

    /**
     * <p>
     * Specifies the validation setting for this policy store.
     * </p>
     * <p>
     * Currently, the only valid and required value is <code>Mode</code>.
     * </p>
     * <important>
     * <p>
     * We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema doesn't exist,
     * then <code>STRICT</code> mode causes any policy to fail validation, and Verified Permissions rejects the policy.
     * You can turn off validation by using the <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     * >UpdatePolicyStore</a> again to turn validation back on.
     * </p>
     * </important>
     * 
     * @param validationSettings
     *        Specifies the validation setting for this policy store.</p>
     *        <p>
     *        Currently, the only valid and required value is <code>Mode</code>.
     *        </p>
     *        <important>
     *        <p>
     *        We recommend that you turn on <code>STRICT</code> mode only after you define a schema. If a schema doesn't
     *        exist, then <code>STRICT</code> mode causes any policy to fail validation, and Verified Permissions
     *        rejects the policy. You can turn off validation by using the <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     *        >UpdatePolicyStore</a>. Then, when you have a schema defined, use <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore"
     *        >UpdatePolicyStore</a> again to turn validation back on.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyStoreRequest withValidationSettings(ValidationSettings validationSettings) {
        setValidationSettings(validationSettings);
        return this;
    }

    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     * 
     * @param description
     *        Descriptive text that you can provide to help with identification of the current policy store.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     * 
     * @return Descriptive text that you can provide to help with identification of the current policy store.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive text that you can provide to help with identification of the current policy store.
     * </p>
     * 
     * @param description
     *        Descriptive text that you can provide to help with identification of the current policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyStoreRequest withDescription(String description) {
        setDescription(description);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getValidationSettings() != null)
            sb.append("ValidationSettings: ").append(getValidationSettings()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyStoreRequest == false)
            return false;
        CreatePolicyStoreRequest other = (CreatePolicyStoreRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getValidationSettings() == null ^ this.getValidationSettings() == null)
            return false;
        if (other.getValidationSettings() != null && other.getValidationSettings().equals(this.getValidationSettings()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getValidationSettings() == null) ? 0 : getValidationSettings().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyStoreRequest clone() {
        return (CreatePolicyStoreRequest) super.clone();
    }

}
