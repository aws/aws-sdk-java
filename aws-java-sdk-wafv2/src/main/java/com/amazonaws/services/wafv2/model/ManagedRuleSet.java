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
 * A set of rules that is managed by Amazon Web Services and Amazon Web Services Marketplace sellers to provide
 * versioned managed rule groups for customers of WAF.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleSet implements Serializable, Cloneable, StructuredPojo {

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
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * A description of the set that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The versions of this managed rule set that are available for use by customers.
     * </p>
     */
    private java.util.Map<String, ManagedRuleSetVersion> publishedVersions;
    /**
     * <p>
     * The version that you would like your customers to use.
     * </p>
     */
    private String recommendedVersion;
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

    public ManagedRuleSet withName(String name) {
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

    public ManagedRuleSet withId(String id) {
        setId(id);
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

    public ManagedRuleSet withARN(String aRN) {
        setARN(aRN);
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

    public ManagedRuleSet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The versions of this managed rule set that are available for use by customers.
     * </p>
     * 
     * @return The versions of this managed rule set that are available for use by customers.
     */

    public java.util.Map<String, ManagedRuleSetVersion> getPublishedVersions() {
        return publishedVersions;
    }

    /**
     * <p>
     * The versions of this managed rule set that are available for use by customers.
     * </p>
     * 
     * @param publishedVersions
     *        The versions of this managed rule set that are available for use by customers.
     */

    public void setPublishedVersions(java.util.Map<String, ManagedRuleSetVersion> publishedVersions) {
        this.publishedVersions = publishedVersions;
    }

    /**
     * <p>
     * The versions of this managed rule set that are available for use by customers.
     * </p>
     * 
     * @param publishedVersions
     *        The versions of this managed rule set that are available for use by customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSet withPublishedVersions(java.util.Map<String, ManagedRuleSetVersion> publishedVersions) {
        setPublishedVersions(publishedVersions);
        return this;
    }

    /**
     * Add a single PublishedVersions entry
     *
     * @see ManagedRuleSet#withPublishedVersions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSet addPublishedVersionsEntry(String key, ManagedRuleSetVersion value) {
        if (null == this.publishedVersions) {
            this.publishedVersions = new java.util.HashMap<String, ManagedRuleSetVersion>();
        }
        if (this.publishedVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.publishedVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PublishedVersions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSet clearPublishedVersionsEntries() {
        this.publishedVersions = null;
        return this;
    }

    /**
     * <p>
     * The version that you would like your customers to use.
     * </p>
     * 
     * @param recommendedVersion
     *        The version that you would like your customers to use.
     */

    public void setRecommendedVersion(String recommendedVersion) {
        this.recommendedVersion = recommendedVersion;
    }

    /**
     * <p>
     * The version that you would like your customers to use.
     * </p>
     * 
     * @return The version that you would like your customers to use.
     */

    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    /**
     * <p>
     * The version that you would like your customers to use.
     * </p>
     * 
     * @param recommendedVersion
     *        The version that you would like your customers to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSet withRecommendedVersion(String recommendedVersion) {
        setRecommendedVersion(recommendedVersion);
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

    public ManagedRuleSet withLabelNamespace(String labelNamespace) {
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPublishedVersions() != null)
            sb.append("PublishedVersions: ").append(getPublishedVersions()).append(",");
        if (getRecommendedVersion() != null)
            sb.append("RecommendedVersion: ").append(getRecommendedVersion()).append(",");
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

        if (obj instanceof ManagedRuleSet == false)
            return false;
        ManagedRuleSet other = (ManagedRuleSet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPublishedVersions() == null ^ this.getPublishedVersions() == null)
            return false;
        if (other.getPublishedVersions() != null && other.getPublishedVersions().equals(this.getPublishedVersions()) == false)
            return false;
        if (other.getRecommendedVersion() == null ^ this.getRecommendedVersion() == null)
            return false;
        if (other.getRecommendedVersion() != null && other.getRecommendedVersion().equals(this.getRecommendedVersion()) == false)
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
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPublishedVersions() == null) ? 0 : getPublishedVersions().hashCode());
        hashCode = prime * hashCode + ((getRecommendedVersion() == null) ? 0 : getRecommendedVersion().hashCode());
        hashCode = prime * hashCode + ((getLabelNamespace() == null) ? 0 : getLabelNamespace().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleSet clone() {
        try {
            return (ManagedRuleSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
