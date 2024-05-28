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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains Cedar policy validation settings for the policy store. The validation mode determines which
 * validation failures that Cedar considers serious enough to block acceptance of a new or edited static policy or
 * policy template.
 * </p>
 * <p>
 * This data type is used as a request parameter in the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicyStore.html"
 * >CreatePolicyStore</a> and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore.html"
 * >UpdatePolicyStore</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ValidationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The validation mode currently configured for this policy store. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation errors are
     * reported by either service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all submitted
     * new or updated static policies and policy templates. Any that fail validation are rejected and Cedar doesn't
     * store them in the policy store.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects all
     * static policies and policy templates because there is no schema to validate against.
     * </p>
     * <p>
     * To submit a static policy or policy template without a schema, you must turn off validation.
     * </p>
     * </important>
     */
    private String mode;

    /**
     * <p>
     * The validation mode currently configured for this policy store. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation errors are
     * reported by either service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all submitted
     * new or updated static policies and policy templates. Any that fail validation are rejected and Cedar doesn't
     * store them in the policy store.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects all
     * static policies and policy templates because there is no schema to validate against.
     * </p>
     * <p>
     * To submit a static policy or policy template without a schema, you must turn off validation.
     * </p>
     * </important>
     * 
     * @param mode
     *        The validation mode currently configured for this policy store. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation
     *        errors are reported by either service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all
     *        submitted new or updated static policies and policy templates. Any that fail validation are rejected and
     *        Cedar doesn't store them in the policy store.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects
     *        all static policies and policy templates because there is no schema to validate against.
     *        </p>
     *        <p>
     *        To submit a static policy or policy template without a schema, you must turn off validation.
     *        </p>
     * @see ValidationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The validation mode currently configured for this policy store. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation errors are
     * reported by either service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all submitted
     * new or updated static policies and policy templates. Any that fail validation are rejected and Cedar doesn't
     * store them in the policy store.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects all
     * static policies and policy templates because there is no schema to validate against.
     * </p>
     * <p>
     * To submit a static policy or policy template without a schema, you must turn off validation.
     * </p>
     * </important>
     * 
     * @return The validation mode currently configured for this policy store. The valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation
     *         errors are reported by either service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all
     *         submitted new or updated static policies and policy templates. Any that fail validation are rejected and
     *         Cedar doesn't store them in the policy store.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects
     *         all static policies and policy templates because there is no schema to validate against.
     *         </p>
     *         <p>
     *         To submit a static policy or policy template without a schema, you must turn off validation.
     *         </p>
     * @see ValidationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The validation mode currently configured for this policy store. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation errors are
     * reported by either service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all submitted
     * new or updated static policies and policy templates. Any that fail validation are rejected and Cedar doesn't
     * store them in the policy store.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects all
     * static policies and policy templates because there is no schema to validate against.
     * </p>
     * <p>
     * To submit a static policy or policy template without a schema, you must turn off validation.
     * </p>
     * </important>
     * 
     * @param mode
     *        The validation mode currently configured for this policy store. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation
     *        errors are reported by either service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all
     *        submitted new or updated static policies and policy templates. Any that fail validation are rejected and
     *        Cedar doesn't store them in the policy store.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects
     *        all static policies and policy templates because there is no schema to validate against.
     *        </p>
     *        <p>
     *        To submit a static policy or policy template without a schema, you must turn off validation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationMode
     */

    public ValidationSettings withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The validation mode currently configured for this policy store. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation errors are
     * reported by either service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all submitted
     * new or updated static policies and policy templates. Any that fail validation are rejected and Cedar doesn't
     * store them in the policy store.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects all
     * static policies and policy templates because there is no schema to validate against.
     * </p>
     * <p>
     * To submit a static policy or policy template without a schema, you must turn off validation.
     * </p>
     * </important>
     * 
     * @param mode
     *        The validation mode currently configured for this policy store. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>OFF</b> – Neither Verified Permissions nor Cedar perform any validation on policies. No validation
     *        errors are reported by either service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>STRICT</b> – Requires a schema to be present in the policy store. Cedar performs validation on all
     *        submitted new or updated static policies and policy templates. Any that fail validation are rejected and
     *        Cedar doesn't store them in the policy store.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        If <code>Mode=STRICT</code> and the policy store doesn't contain a schema, Verified Permissions rejects
     *        all static policies and policy templates because there is no schema to validate against.
     *        </p>
     *        <p>
     *        To submit a static policy or policy template without a schema, you must turn off validation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationMode
     */

    public ValidationSettings withMode(ValidationMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationSettings == false)
            return false;
        ValidationSettings other = (ValidationSettings) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public ValidationSettings clone() {
        try {
            return (ValidationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.ValidationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
