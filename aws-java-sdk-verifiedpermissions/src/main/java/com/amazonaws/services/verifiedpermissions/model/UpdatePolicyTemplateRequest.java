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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to update.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the ID of the policy template that you want to update.
     * </p>
     */
    private String policyTemplateId;
    /**
     * <p>
     * Specifies a new description to apply to the policy template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies new statement content written in Cedar policy language to replace the current body of the policy
     * template.
     * </p>
     * <p>
     * You can change only the following elements of the policy body:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy template.
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
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy template.
     * </p>
     * </li>
     * </ul>
     */
    private String statement;

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to update.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy template that you want to update.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to update.
     * </p>
     * 
     * @return Specifies the ID of the policy store that contains the policy template that you want to update.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the policy template that you want to update.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the policy template that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyTemplateRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the policy template that you want to update.
     * </p>
     * 
     * @param policyTemplateId
     *        Specifies the ID of the policy template that you want to update.
     */

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * <p>
     * Specifies the ID of the policy template that you want to update.
     * </p>
     * 
     * @return Specifies the ID of the policy template that you want to update.
     */

    public String getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * <p>
     * Specifies the ID of the policy template that you want to update.
     * </p>
     * 
     * @param policyTemplateId
     *        Specifies the ID of the policy template that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyTemplateRequest withPolicyTemplateId(String policyTemplateId) {
        setPolicyTemplateId(policyTemplateId);
        return this;
    }

    /**
     * <p>
     * Specifies a new description to apply to the policy template.
     * </p>
     * 
     * @param description
     *        Specifies a new description to apply to the policy template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies a new description to apply to the policy template.
     * </p>
     * 
     * @return Specifies a new description to apply to the policy template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies a new description to apply to the policy template.
     * </p>
     * 
     * @param description
     *        Specifies a new description to apply to the policy template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies new statement content written in Cedar policy language to replace the current body of the policy
     * template.
     * </p>
     * <p>
     * You can change only the following elements of the policy body:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy template.
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
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy template.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statement
     *        Specifies new statement content written in Cedar policy language to replace the current body of the policy
     *        template.</p>
     *        <p>
     *        You can change only the following elements of the policy body:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>action</code> referenced by the policy template.
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
     *        The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>principal</code> referenced by the policy template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>resource</code> referenced by the policy template.
     *        </p>
     *        </li>
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * Specifies new statement content written in Cedar policy language to replace the current body of the policy
     * template.
     * </p>
     * <p>
     * You can change only the following elements of the policy body:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy template.
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
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy template.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies new statement content written in Cedar policy language to replace the current body of the
     *         policy template.</p>
     *         <p>
     *         You can change only the following elements of the policy body:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>action</code> referenced by the policy template.
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
     *         The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>principal</code> referenced by the policy template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>resource</code> referenced by the policy template.
     *         </p>
     *         </li>
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * Specifies new statement content written in Cedar policy language to replace the current body of the policy
     * template.
     * </p>
     * <p>
     * You can change only the following elements of the policy body:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>action</code> referenced by the policy template.
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
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>principal</code> referenced by the policy template.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>resource</code> referenced by the policy template.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statement
     *        Specifies new statement content written in Cedar policy language to replace the current body of the policy
     *        template.</p>
     *        <p>
     *        You can change only the following elements of the policy body:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>action</code> referenced by the policy template.
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
     *        The effect (<code>permit</code> or <code>forbid</code>) of the policy template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>principal</code> referenced by the policy template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>resource</code> referenced by the policy template.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyTemplateRequest withStatement(String statement) {
        setStatement(statement);
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
        if (getPolicyTemplateId() != null)
            sb.append("PolicyTemplateId: ").append(getPolicyTemplateId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatement() != null)
            sb.append("Statement: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyTemplateRequest == false)
            return false;
        UpdatePolicyTemplateRequest other = (UpdatePolicyTemplateRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPolicyTemplateId() == null ^ this.getPolicyTemplateId() == null)
            return false;
        if (other.getPolicyTemplateId() != null && other.getPolicyTemplateId().equals(this.getPolicyTemplateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplateId() == null) ? 0 : getPolicyTemplateId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyTemplateRequest clone() {
        return (UpdatePolicyTemplateRequest) super.clone();
    }

}
