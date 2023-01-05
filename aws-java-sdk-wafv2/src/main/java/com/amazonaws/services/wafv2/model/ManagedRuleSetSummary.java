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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * High-level information for a managed rule set.
 * </p>
 * <note>
 * <p>
 * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
 * Services Marketplace sellers.
 * </p>
 * <p>
 * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
 * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
 * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleSetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description of the set that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     */
    private String lockToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The label namespace prefix for the managed rule groups that are offered to customers from this managed rule set.
     * All labels that are added by rules in the managed rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     */
    private String labelNamespace;

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     * 
     * @param name
     *        The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.</p>
     *        <p>
     *        This name is assigned to the corresponding managed rule group, which your customers can access and use.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     * 
     * @return The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.</p>
     *         <p>
     *         This name is assigned to the corresponding managed rule group, which your customers can access and use.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.
     * </p>
     * <p>
     * This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * </p>
     * 
     * @param name
     *        The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set.</p>
     *        <p>
     *        This name is assigned to the corresponding managed rule group, which your customers can access and use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     *        <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     * 
     * @return A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     *         <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     * <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the managed rule set. The ID is returned in the responses to commands like
     *        <code>list</code>. You provide it to operations like <code>get</code> and <code>update</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A description of the set that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the set that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the set that helps with identification.
     * </p>
     * 
     * @return A description of the set that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the set that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the set that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *         requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *         associated with the token, you provide the token to operations like <code>update</code> and
     *         <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *         last retrieved it. If a change has been made, the update fails with a
     *         <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetSummary withLockToken(String lockToken) {
        setLockToken(lockToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetSummary withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The label namespace prefix for the managed rule groups that are offered to customers from this managed rule set.
     * All labels that are added by rules in the managed rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelNamespace
     *        The label namespace prefix for the managed rule groups that are offered to customers from this managed
     *        rule set. All labels that are added by rules in the managed rule group have this prefix. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for a managed rule group is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     *        qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined
     *        and the label from the rule, separated by a colon:
     *        </p>
     *        <p>
     *        <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *        </p>
     *        </li>
     */

    public void setLabelNamespace(String labelNamespace) {
        this.labelNamespace = labelNamespace;
    }

    /**
     * <p>
     * The label namespace prefix for the managed rule groups that are offered to customers from this managed rule set.
     * All labels that are added by rules in the managed rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The label namespace prefix for the managed rule groups that are offered to customers from this managed
     *         rule set. All labels that are added by rules in the managed rule group have this prefix. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The syntax for the label namespace prefix for a managed rule group is the following:
     *         </p>
     *         <p>
     *         <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A
     *         fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is
     *         defined and the label from the rule, separated by a colon:
     *         </p>
     *         <p>
     *         <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *         </p>
     *         </li>
     */

    public String getLabelNamespace() {
        return this.labelNamespace;
    }

    /**
     * <p>
     * The label namespace prefix for the managed rule groups that are offered to customers from this managed rule set.
     * All labels that are added by rules in the managed rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelNamespace
     *        The label namespace prefix for the managed rule groups that are offered to customers from this managed
     *        rule set. All labels that are added by rules in the managed rule group have this prefix. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for a managed rule group is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     *        qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined
     *        and the label from the rule, separated by a colon:
     *        </p>
     *        <p>
     *        <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetSummary withLabelNamespace(String labelNamespace) {
        setLabelNamespace(labelNamespace);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getLabelNamespace() != null)
            sb.append("LabelNamespace: ").append(getLabelNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleSetSummary == false)
            return false;
        ManagedRuleSetSummary other = (ManagedRuleSetSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getLabelNamespace() == null ^ this.getLabelNamespace() == null)
            return false;
        if (other.getLabelNamespace() != null && other.getLabelNamespace().equals(this.getLabelNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getLabelNamespace() == null) ? 0 : getLabelNamespace().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleSetSummary clone() {
        try {
            return (ManagedRuleSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
