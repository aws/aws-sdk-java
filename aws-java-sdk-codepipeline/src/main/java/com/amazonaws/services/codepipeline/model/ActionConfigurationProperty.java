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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about an action configuration property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionConfigurationProperty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionConfigurationProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the action configuration property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Whether the configuration property is a required value.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * Whether the configuration property is a key.
     * </p>
     */
    private Boolean key;
    /**
     * <p>
     * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     * GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.
     * </p>
     * <p>
     * When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the
     * prior value of the secret.
     * </p>
     */
    private Boolean secret;
    /**
     * <p>
     * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an
     * action can have up to one queryable property. If it has one, that property must be both required and not secret.
     * </p>
     * <p>
     * If you create a pipeline with a custom action type, and that custom action contains a queryable property, the
     * value for that configuration property is subject to additional restrictions. The value must be less than or equal
     * to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
     * </p>
     */
    private Boolean queryable;
    /**
     * <p>
     * The description of the action configuration property that will be displayed to users.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the configuration property.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the action configuration property.
     * </p>
     * 
     * @param name
     *        The name of the action configuration property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the action configuration property.
     * </p>
     * 
     * @return The name of the action configuration property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the action configuration property.
     * </p>
     * 
     * @param name
     *        The name of the action configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfigurationProperty withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Whether the configuration property is a required value.
     * </p>
     * 
     * @param required
     *        Whether the configuration property is a required value.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Whether the configuration property is a required value.
     * </p>
     * 
     * @return Whether the configuration property is a required value.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Whether the configuration property is a required value.
     * </p>
     * 
     * @param required
     *        Whether the configuration property is a required value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfigurationProperty withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Whether the configuration property is a required value.
     * </p>
     * 
     * @return Whether the configuration property is a required value.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * Whether the configuration property is a key.
     * </p>
     * 
     * @param key
     *        Whether the configuration property is a key.
     */

    public void setKey(Boolean key) {
        this.key = key;
    }

    /**
     * <p>
     * Whether the configuration property is a key.
     * </p>
     * 
     * @return Whether the configuration property is a key.
     */

    public Boolean getKey() {
        return this.key;
    }

    /**
     * <p>
     * Whether the configuration property is a key.
     * </p>
     * 
     * @param key
     *        Whether the configuration property is a key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfigurationProperty withKey(Boolean key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Whether the configuration property is a key.
     * </p>
     * 
     * @return Whether the configuration property is a key.
     */

    public Boolean isKey() {
        return this.key;
    }

    /**
     * <p>
     * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     * GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.
     * </p>
     * <p>
     * When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the
     * prior value of the secret.
     * </p>
     * 
     * @param secret
     *        Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     *        GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.</p>
     *        <p>
     *        When updating a pipeline, passing * * * * * without changing any other values of the action will preserve
     *        the prior value of the secret.
     */

    public void setSecret(Boolean secret) {
        this.secret = secret;
    }

    /**
     * <p>
     * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     * GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.
     * </p>
     * <p>
     * When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the
     * prior value of the secret.
     * </p>
     * 
     * @return Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     *         GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.</p>
     *         <p>
     *         When updating a pipeline, passing * * * * * without changing any other values of the action will preserve
     *         the prior value of the secret.
     */

    public Boolean getSecret() {
        return this.secret;
    }

    /**
     * <p>
     * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     * GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.
     * </p>
     * <p>
     * When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the
     * prior value of the secret.
     * </p>
     * 
     * @param secret
     *        Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     *        GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.</p>
     *        <p>
     *        When updating a pipeline, passing * * * * * without changing any other values of the action will preserve
     *        the prior value of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfigurationProperty withSecret(Boolean secret) {
        setSecret(secret);
        return this;
    }

    /**
     * <p>
     * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     * GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.
     * </p>
     * <p>
     * When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the
     * prior value of the secret.
     * </p>
     * 
     * @return Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails,
     *         GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs.</p>
     *         <p>
     *         When updating a pipeline, passing * * * * * without changing any other values of the action will preserve
     *         the prior value of the secret.
     */

    public Boolean isSecret() {
        return this.secret;
    }

    /**
     * <p>
     * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an
     * action can have up to one queryable property. If it has one, that property must be both required and not secret.
     * </p>
     * <p>
     * If you create a pipeline with a custom action type, and that custom action contains a queryable property, the
     * value for that configuration property is subject to additional restrictions. The value must be less than or equal
     * to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
     * </p>
     * 
     * @param queryable
     *        Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action,
     *        an action can have up to one queryable property. If it has one, that property must be both required and
     *        not secret.</p>
     *        <p>
     *        If you create a pipeline with a custom action type, and that custom action contains a queryable property,
     *        the value for that configuration property is subject to additional restrictions. The value must be less
     *        than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores,
     *        and hyphens.
     */

    public void setQueryable(Boolean queryable) {
        this.queryable = queryable;
    }

    /**
     * <p>
     * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an
     * action can have up to one queryable property. If it has one, that property must be both required and not secret.
     * </p>
     * <p>
     * If you create a pipeline with a custom action type, and that custom action contains a queryable property, the
     * value for that configuration property is subject to additional restrictions. The value must be less than or equal
     * to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
     * </p>
     * 
     * @return Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action,
     *         an action can have up to one queryable property. If it has one, that property must be both required and
     *         not secret.</p>
     *         <p>
     *         If you create a pipeline with a custom action type, and that custom action contains a queryable property,
     *         the value for that configuration property is subject to additional restrictions. The value must be less
     *         than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores,
     *         and hyphens.
     */

    public Boolean getQueryable() {
        return this.queryable;
    }

    /**
     * <p>
     * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an
     * action can have up to one queryable property. If it has one, that property must be both required and not secret.
     * </p>
     * <p>
     * If you create a pipeline with a custom action type, and that custom action contains a queryable property, the
     * value for that configuration property is subject to additional restrictions. The value must be less than or equal
     * to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
     * </p>
     * 
     * @param queryable
     *        Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action,
     *        an action can have up to one queryable property. If it has one, that property must be both required and
     *        not secret.</p>
     *        <p>
     *        If you create a pipeline with a custom action type, and that custom action contains a queryable property,
     *        the value for that configuration property is subject to additional restrictions. The value must be less
     *        than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores,
     *        and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfigurationProperty withQueryable(Boolean queryable) {
        setQueryable(queryable);
        return this;
    }

    /**
     * <p>
     * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an
     * action can have up to one queryable property. If it has one, that property must be both required and not secret.
     * </p>
     * <p>
     * If you create a pipeline with a custom action type, and that custom action contains a queryable property, the
     * value for that configuration property is subject to additional restrictions. The value must be less than or equal
     * to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
     * </p>
     * 
     * @return Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action,
     *         an action can have up to one queryable property. If it has one, that property must be both required and
     *         not secret.</p>
     *         <p>
     *         If you create a pipeline with a custom action type, and that custom action contains a queryable property,
     *         the value for that configuration property is subject to additional restrictions. The value must be less
     *         than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores,
     *         and hyphens.
     */

    public Boolean isQueryable() {
        return this.queryable;
    }

    /**
     * <p>
     * The description of the action configuration property that will be displayed to users.
     * </p>
     * 
     * @param description
     *        The description of the action configuration property that will be displayed to users.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the action configuration property that will be displayed to users.
     * </p>
     * 
     * @return The description of the action configuration property that will be displayed to users.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the action configuration property that will be displayed to users.
     * </p>
     * 
     * @param description
     *        The description of the action configuration property that will be displayed to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfigurationProperty withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the configuration property.
     * </p>
     * 
     * @param type
     *        The type of the configuration property.
     * @see ActionConfigurationPropertyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the configuration property.
     * </p>
     * 
     * @return The type of the configuration property.
     * @see ActionConfigurationPropertyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the configuration property.
     * </p>
     * 
     * @param type
     *        The type of the configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionConfigurationPropertyType
     */

    public ActionConfigurationProperty withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the configuration property.
     * </p>
     * 
     * @param type
     *        The type of the configuration property.
     * @see ActionConfigurationPropertyType
     */

    public void setType(ActionConfigurationPropertyType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the configuration property.
     * </p>
     * 
     * @param type
     *        The type of the configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionConfigurationPropertyType
     */

    public ActionConfigurationProperty withType(ActionConfigurationPropertyType type) {
        this.type = type.toString();
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
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getSecret() != null)
            sb.append("Secret: ").append(getSecret()).append(",");
        if (getQueryable() != null)
            sb.append("Queryable: ").append(getQueryable()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionConfigurationProperty == false)
            return false;
        ActionConfigurationProperty other = (ActionConfigurationProperty) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getSecret() == null ^ this.getSecret() == null)
            return false;
        if (other.getSecret() != null && other.getSecret().equals(this.getSecret()) == false)
            return false;
        if (other.getQueryable() == null ^ this.getQueryable() == null)
            return false;
        if (other.getQueryable() != null && other.getQueryable().equals(this.getQueryable()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getSecret() == null) ? 0 : getSecret().hashCode());
        hashCode = prime * hashCode + ((getQueryable() == null) ? 0 : getQueryable().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ActionConfigurationProperty clone() {
        try {
            return (ActionConfigurationProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionConfigurationPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
