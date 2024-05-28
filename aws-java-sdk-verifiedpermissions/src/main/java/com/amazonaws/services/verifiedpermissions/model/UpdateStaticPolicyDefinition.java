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
 * Contains information about an update to a static policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateStaticPolicyDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStaticPolicyDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the description to be added to or replaced on the static policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the Cedar policy language text to be added to or replaced on the static policy.
     * </p>
     * <important>
     * <p>
     * You can change only the following elements from the original content:
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
     * Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     * </important>
     */
    private String statement;

    /**
     * <p>
     * Specifies the description to be added to or replaced on the static policy.
     * </p>
     * 
     * @param description
     *        Specifies the description to be added to or replaced on the static policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies the description to be added to or replaced on the static policy.
     * </p>
     * 
     * @return Specifies the description to be added to or replaced on the static policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies the description to be added to or replaced on the static policy.
     * </p>
     * 
     * @param description
     *        Specifies the description to be added to or replaced on the static policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStaticPolicyDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the Cedar policy language text to be added to or replaced on the static policy.
     * </p>
     * <important>
     * <p>
     * You can change only the following elements from the original content:
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
     * Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     * </important>
     * 
     * @param statement
     *        Specifies the Cedar policy language text to be added to or replaced on the static policy.</p> <important>
     *        <p>
     *        You can change only the following elements from the original content:
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
     *        Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     *        </ul>
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * Specifies the Cedar policy language text to be added to or replaced on the static policy.
     * </p>
     * <important>
     * <p>
     * You can change only the following elements from the original content:
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
     * Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     * </important>
     * 
     * @return Specifies the Cedar policy language text to be added to or replaced on the static policy.</p> <important>
     *         <p>
     *         You can change only the following elements from the original content:
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
     *         Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     *         </ul>
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * Specifies the Cedar policy language text to be added to or replaced on the static policy.
     * </p>
     * <important>
     * <p>
     * You can change only the following elements from the original content:
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
     * Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     * </important>
     * 
     * @param statement
     *        Specifies the Cedar policy language text to be added to or replaced on the static policy.</p> <important>
     *        <p>
     *        You can change only the following elements from the original content:
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
     *        Changing from <code>StaticPolicy</code> to <code>TemplateLinkedPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The effect (<code>permit</code> or <code>forbid</code>) of the policy.
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
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStaticPolicyDefinition withStatement(String statement) {
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

        if (obj instanceof UpdateStaticPolicyDefinition == false)
            return false;
        UpdateStaticPolicyDefinition other = (UpdateStaticPolicyDefinition) obj;
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStaticPolicyDefinition clone() {
        try {
            return (UpdateStaticPolicyDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.UpdateStaticPolicyDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
