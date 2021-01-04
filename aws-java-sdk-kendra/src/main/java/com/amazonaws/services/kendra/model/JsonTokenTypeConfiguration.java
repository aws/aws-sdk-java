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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the JSON token type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/JsonTokenTypeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonTokenTypeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name attribute field.
     * </p>
     */
    private String userNameAttributeField;
    /**
     * <p>
     * The group attribute field.
     * </p>
     */
    private String groupAttributeField;

    /**
     * <p>
     * The user name attribute field.
     * </p>
     * 
     * @param userNameAttributeField
     *        The user name attribute field.
     */

    public void setUserNameAttributeField(String userNameAttributeField) {
        this.userNameAttributeField = userNameAttributeField;
    }

    /**
     * <p>
     * The user name attribute field.
     * </p>
     * 
     * @return The user name attribute field.
     */

    public String getUserNameAttributeField() {
        return this.userNameAttributeField;
    }

    /**
     * <p>
     * The user name attribute field.
     * </p>
     * 
     * @param userNameAttributeField
     *        The user name attribute field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonTokenTypeConfiguration withUserNameAttributeField(String userNameAttributeField) {
        setUserNameAttributeField(userNameAttributeField);
        return this;
    }

    /**
     * <p>
     * The group attribute field.
     * </p>
     * 
     * @param groupAttributeField
     *        The group attribute field.
     */

    public void setGroupAttributeField(String groupAttributeField) {
        this.groupAttributeField = groupAttributeField;
    }

    /**
     * <p>
     * The group attribute field.
     * </p>
     * 
     * @return The group attribute field.
     */

    public String getGroupAttributeField() {
        return this.groupAttributeField;
    }

    /**
     * <p>
     * The group attribute field.
     * </p>
     * 
     * @param groupAttributeField
     *        The group attribute field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonTokenTypeConfiguration withGroupAttributeField(String groupAttributeField) {
        setGroupAttributeField(groupAttributeField);
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
        if (getUserNameAttributeField() != null)
            sb.append("UserNameAttributeField: ").append(getUserNameAttributeField()).append(",");
        if (getGroupAttributeField() != null)
            sb.append("GroupAttributeField: ").append(getGroupAttributeField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonTokenTypeConfiguration == false)
            return false;
        JsonTokenTypeConfiguration other = (JsonTokenTypeConfiguration) obj;
        if (other.getUserNameAttributeField() == null ^ this.getUserNameAttributeField() == null)
            return false;
        if (other.getUserNameAttributeField() != null && other.getUserNameAttributeField().equals(this.getUserNameAttributeField()) == false)
            return false;
        if (other.getGroupAttributeField() == null ^ this.getGroupAttributeField() == null)
            return false;
        if (other.getGroupAttributeField() != null && other.getGroupAttributeField().equals(this.getGroupAttributeField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserNameAttributeField() == null) ? 0 : getUserNameAttributeField().hashCode());
        hashCode = prime * hashCode + ((getGroupAttributeField() == null) ? 0 : getGroupAttributeField().hashCode());
        return hashCode;
    }

    @Override
    public JsonTokenTypeConfiguration clone() {
        try {
            return (JsonTokenTypeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.JsonTokenTypeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
