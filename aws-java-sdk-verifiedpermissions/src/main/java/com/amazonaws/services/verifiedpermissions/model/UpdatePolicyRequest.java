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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to update.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the ID of the policy that you want to update. To find this value, you can use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     * >ListPolicies</a>.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * Specifies the updated policy content that you want to replace on the specified policy. The content must be valid
     * Cedar policy language text.
     * </p>
     * <p>
     * You can change only the following elements from the policy definition:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You <b>can't</b> change the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Changing from <code>static</code> to <code>templateLinked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy.
     * </p>
     * </li>
     * </ul>
     */
    private UpdatePolicyDefinition definition;

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to update.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy that you want to update.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to update.
     * </p>
     * 
     * @return Specifies the ID of the policy store that contains the policy that you want to update.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy that you want to update.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the policy that you want to update. To find this value, you can use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     * >ListPolicies</a>.
     * </p>
     * 
     * @param policyId
     *        Specifies the ID of the policy that you want to update. To find this value, you can use <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     *        >ListPolicies</a>.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * Specifies the ID of the policy that you want to update. To find this value, you can use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     * >ListPolicies</a>.
     * </p>
     * 
     * @return Specifies the ID of the policy that you want to update. To find this value, you can use <a
     *         href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     *         >ListPolicies</a>.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * Specifies the ID of the policy that you want to update. To find this value, you can use <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     * >ListPolicies</a>.
     * </p>
     * 
     * @param policyId
     *        Specifies the ID of the policy that you want to update. To find this value, you can use <a
     *        href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html"
     *        >ListPolicies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * Specifies the updated policy content that you want to replace on the specified policy. The content must be valid
     * Cedar policy language text.
     * </p>
     * <p>
     * You can change only the following elements from the policy definition:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You <b>can't</b> change the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Changing from <code>static</code> to <code>templateLinked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param definition
     *        Specifies the updated policy content that you want to replace on the specified policy. The content must be
     *        valid Cedar policy language text.</p>
     *        <p>
     *        You can change only the following elements from the policy definition:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>action</code> referenced by the policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You <b>can't</b> change the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Changing from <code>static</code> to <code>templateLinked</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>principal</code> referenced by the policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>resource</code> referenced by the policy.
     *        </p>
     *        </li>
     */

    public void setDefinition(UpdatePolicyDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Specifies the updated policy content that you want to replace on the specified policy. The content must be valid
     * Cedar policy language text.
     * </p>
     * <p>
     * You can change only the following elements from the policy definition:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You <b>can't</b> change the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Changing from <code>static</code> to <code>templateLinked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the updated policy content that you want to replace on the specified policy. The content must
     *         be valid Cedar policy language text.</p>
     *         <p>
     *         You can change only the following elements from the policy definition:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>action</code> referenced by the policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You <b>can't</b> change the following elements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Changing from <code>static</code> to <code>templateLinked</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>principal</code> referenced by the policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>resource</code> referenced by the policy.
     *         </p>
     *         </li>
     */

    public UpdatePolicyDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Specifies the updated policy content that you want to replace on the specified policy. The content must be valid
     * Cedar policy language text.
     * </p>
     * <p>
     * You can change only the following elements from the policy definition:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You <b>can't</b> change the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Changing from <code>static</code> to <code>templateLinked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param definition
     *        Specifies the updated policy content that you want to replace on the specified policy. The content must be
     *        valid Cedar policy language text.</p>
     *        <p>
     *        You can change only the following elements from the policy definition:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>action</code> referenced by the policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Any conditional clauses, such as <code>when</code> or <code>unless</code> clauses.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You <b>can't</b> change the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Changing from <code>static</code> to <code>templateLinked</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Changing the effect of the policy from <code>permit</code> or <code>forbid</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>principal</code> referenced by the policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>resource</code> referenced by the policy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withDefinition(UpdatePolicyDefinition definition) {
        setDefinition(definition);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyRequest == false)
            return false;
        UpdatePolicyRequest other = (UpdatePolicyRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyRequest clone() {
        return (UpdatePolicyRequest) super.clone();
    }

}
