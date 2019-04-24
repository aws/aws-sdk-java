/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about parameter usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ParameterHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of parameter used.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     */
    private String lastModifiedUser;
    /**
     * <p>
     * Information about the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The parameter value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Parameter names can include the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     */
    private String allowedPattern;
    /**
     * <p>
     * The parameter version.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * Labels assigned to the parameter version.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> labels;
    /**
     * <p>
     * The parameter tier.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * Information about the policies assigned to a parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterInlinePolicy> policies;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @return The type of parameter used.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public ParameterHistory withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @see ParameterType
     */

    public void setType(ParameterType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public ParameterHistory withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * 
     * @param keyId
     *        The ID of the query key used for this parameter.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * 
     * @return The ID of the query key used for this parameter.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * 
     * @param keyId
     *        The ID of the query key used for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date the parameter was last changed or updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * 
     * @return Date the parameter was last changed or updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date the parameter was last changed or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     * 
     * @param lastModifiedUser
     *        Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     */

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     */

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     * 
     * @param lastModifiedUser
     *        Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withLastModifiedUser(String lastModifiedUser) {
        setLastModifiedUser(lastModifiedUser);
        return this;
    }

    /**
     * <p>
     * Information about the parameter.
     * </p>
     * 
     * @param description
     *        Information about the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the parameter.
     * </p>
     * 
     * @return Information about the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the parameter.
     * </p>
     * 
     * @param description
     *        Information about the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @return The parameter value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Parameter names can include the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * 
     * @param allowedPattern
     *        Parameter names can include the following letters and symbols.</p>
     *        <p>
     *        a-zA-Z0-9_.-
     */

    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    /**
     * <p>
     * Parameter names can include the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * 
     * @return Parameter names can include the following letters and symbols.</p>
     *         <p>
     *         a-zA-Z0-9_.-
     */

    public String getAllowedPattern() {
        return this.allowedPattern;
    }

    /**
     * <p>
     * Parameter names can include the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * 
     * @param allowedPattern
     *        Parameter names can include the following letters and symbols.</p>
     *        <p>
     *        a-zA-Z0-9_.-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withAllowedPattern(String allowedPattern) {
        setAllowedPattern(allowedPattern);
        return this;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * 
     * @param version
     *        The parameter version.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * 
     * @return The parameter version.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * 
     * @param version
     *        The parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Labels assigned to the parameter version.
     * </p>
     * 
     * @return Labels assigned to the parameter version.
     */

    public java.util.List<String> getLabels() {
        if (labels == null) {
            labels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return labels;
    }

    /**
     * <p>
     * Labels assigned to the parameter version.
     * </p>
     * 
     * @param labels
     *        Labels assigned to the parameter version.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new com.amazonaws.internal.SdkInternalList<String>(labels);
    }

    /**
     * <p>
     * Labels assigned to the parameter version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Labels assigned to the parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new com.amazonaws.internal.SdkInternalList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Labels assigned to the parameter version.
     * </p>
     * 
     * @param labels
     *        Labels assigned to the parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * 
     * @param tier
     *        The parameter tier.
     * @see ParameterTier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * 
     * @return The parameter tier.
     * @see ParameterTier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * 
     * @param tier
     *        The parameter tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterTier
     */

    public ParameterHistory withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * 
     * @param tier
     *        The parameter tier.
     * @see ParameterTier
     */

    public void setTier(ParameterTier tier) {
        withTier(tier);
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * 
     * @param tier
     *        The parameter tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterTier
     */

    public ParameterHistory withTier(ParameterTier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * Information about the policies assigned to a parameter.
     * </p>
     * 
     * @return Information about the policies assigned to a parameter.
     */

    public java.util.List<ParameterInlinePolicy> getPolicies() {
        if (policies == null) {
            policies = new com.amazonaws.internal.SdkInternalList<ParameterInlinePolicy>();
        }
        return policies;
    }

    /**
     * <p>
     * Information about the policies assigned to a parameter.
     * </p>
     * 
     * @param policies
     *        Information about the policies assigned to a parameter.
     */

    public void setPolicies(java.util.Collection<ParameterInlinePolicy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new com.amazonaws.internal.SdkInternalList<ParameterInlinePolicy>(policies);
    }

    /**
     * <p>
     * Information about the policies assigned to a parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        Information about the policies assigned to a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withPolicies(ParameterInlinePolicy... policies) {
        if (this.policies == null) {
            setPolicies(new com.amazonaws.internal.SdkInternalList<ParameterInlinePolicy>(policies.length));
        }
        for (ParameterInlinePolicy ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the policies assigned to a parameter.
     * </p>
     * 
     * @param policies
     *        Information about the policies assigned to a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withPolicies(java.util.Collection<ParameterInlinePolicy> policies) {
        setPolicies(policies);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: ").append(getLastModifiedUser()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getAllowedPattern() != null)
            sb.append("AllowedPattern: ").append(getAllowedPattern()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterHistory == false)
            return false;
        ParameterHistory other = (ParameterHistory) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAllowedPattern() == null ^ this.getAllowedPattern() == null)
            return false;
        if (other.getAllowedPattern() != null && other.getAllowedPattern().equals(this.getAllowedPattern()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAllowedPattern() == null) ? 0 : getAllowedPattern().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public ParameterHistory clone() {
        try {
            return (ParameterHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ParameterHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
