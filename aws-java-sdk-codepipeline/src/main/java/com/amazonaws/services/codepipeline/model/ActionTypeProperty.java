/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents information about each property specified in the action configuration, such as the description and key
 * name that display for the customer using the action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypeProperty" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property name that is displayed to users.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Whether the configuration property is an optional value.
     * </p>
     */
    private Boolean optional;
    /**
     * <p>
     * Whether the configuration property is a key.
     * </p>
     */
    private Boolean key;
    /**
     * <p>
     * Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not saved
     * in CloudTrail logs for the action execution.
     * </p>
     */
    private Boolean noEcho;
    /**
     * <p>
     * Indicates that the property is used with polling. An action type can have up to one queryable property. If it has
     * one, that property must be both required and not secret.
     * </p>
     */
    private Boolean queryable;
    /**
     * <p>
     * The description of the property that is displayed to users.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The property name that is displayed to users.
     * </p>
     * 
     * @param name
     *        The property name that is displayed to users.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The property name that is displayed to users.
     * </p>
     * 
     * @return The property name that is displayed to users.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The property name that is displayed to users.
     * </p>
     * 
     * @param name
     *        The property name that is displayed to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeProperty withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Whether the configuration property is an optional value.
     * </p>
     * 
     * @param optional
     *        Whether the configuration property is an optional value.
     */

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * <p>
     * Whether the configuration property is an optional value.
     * </p>
     * 
     * @return Whether the configuration property is an optional value.
     */

    public Boolean getOptional() {
        return this.optional;
    }

    /**
     * <p>
     * Whether the configuration property is an optional value.
     * </p>
     * 
     * @param optional
     *        Whether the configuration property is an optional value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeProperty withOptional(Boolean optional) {
        setOptional(optional);
        return this;
    }

    /**
     * <p>
     * Whether the configuration property is an optional value.
     * </p>
     * 
     * @return Whether the configuration property is an optional value.
     */

    public Boolean isOptional() {
        return this.optional;
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

    public ActionTypeProperty withKey(Boolean key) {
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
     * Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not saved
     * in CloudTrail logs for the action execution.
     * </p>
     * 
     * @param noEcho
     *        Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not
     *        saved in CloudTrail logs for the action execution.
     */

    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    /**
     * <p>
     * Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not saved
     * in CloudTrail logs for the action execution.
     * </p>
     * 
     * @return Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is
     *         not saved in CloudTrail logs for the action execution.
     */

    public Boolean getNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not saved
     * in CloudTrail logs for the action execution.
     * </p>
     * 
     * @param noEcho
     *        Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not
     *        saved in CloudTrail logs for the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeProperty withNoEcho(Boolean noEcho) {
        setNoEcho(noEcho);
        return this;
    }

    /**
     * <p>
     * Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is not saved
     * in CloudTrail logs for the action execution.
     * </p>
     * 
     * @return Whether to omit the field value entered by the customer in the log. If <code>true</code>, the value is
     *         not saved in CloudTrail logs for the action execution.
     */

    public Boolean isNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * Indicates that the property is used with polling. An action type can have up to one queryable property. If it has
     * one, that property must be both required and not secret.
     * </p>
     * 
     * @param queryable
     *        Indicates that the property is used with polling. An action type can have up to one queryable property. If
     *        it has one, that property must be both required and not secret.
     */

    public void setQueryable(Boolean queryable) {
        this.queryable = queryable;
    }

    /**
     * <p>
     * Indicates that the property is used with polling. An action type can have up to one queryable property. If it has
     * one, that property must be both required and not secret.
     * </p>
     * 
     * @return Indicates that the property is used with polling. An action type can have up to one queryable property.
     *         If it has one, that property must be both required and not secret.
     */

    public Boolean getQueryable() {
        return this.queryable;
    }

    /**
     * <p>
     * Indicates that the property is used with polling. An action type can have up to one queryable property. If it has
     * one, that property must be both required and not secret.
     * </p>
     * 
     * @param queryable
     *        Indicates that the property is used with polling. An action type can have up to one queryable property. If
     *        it has one, that property must be both required and not secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeProperty withQueryable(Boolean queryable) {
        setQueryable(queryable);
        return this;
    }

    /**
     * <p>
     * Indicates that the property is used with polling. An action type can have up to one queryable property. If it has
     * one, that property must be both required and not secret.
     * </p>
     * 
     * @return Indicates that the property is used with polling. An action type can have up to one queryable property.
     *         If it has one, that property must be both required and not secret.
     */

    public Boolean isQueryable() {
        return this.queryable;
    }

    /**
     * <p>
     * The description of the property that is displayed to users.
     * </p>
     * 
     * @param description
     *        The description of the property that is displayed to users.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the property that is displayed to users.
     * </p>
     * 
     * @return The description of the property that is displayed to users.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the property that is displayed to users.
     * </p>
     * 
     * @param description
     *        The description of the property that is displayed to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeProperty withDescription(String description) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOptional() != null)
            sb.append("Optional: ").append(getOptional()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getNoEcho() != null)
            sb.append("NoEcho: ").append(getNoEcho()).append(",");
        if (getQueryable() != null)
            sb.append("Queryable: ").append(getQueryable()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypeProperty == false)
            return false;
        ActionTypeProperty other = (ActionTypeProperty) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOptional() == null ^ this.getOptional() == null)
            return false;
        if (other.getOptional() != null && other.getOptional().equals(this.getOptional()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getNoEcho() == null ^ this.getNoEcho() == null)
            return false;
        if (other.getNoEcho() != null && other.getNoEcho().equals(this.getNoEcho()) == false)
            return false;
        if (other.getQueryable() == null ^ this.getQueryable() == null)
            return false;
        if (other.getQueryable() != null && other.getQueryable().equals(this.getQueryable()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOptional() == null) ? 0 : getOptional().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getNoEcho() == null) ? 0 : getNoEcho().hashCode());
        hashCode = prime * hashCode + ((getQueryable() == null) ? 0 : getQueryable().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeProperty clone() {
        try {
            return (ActionTypeProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
