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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current account setting for a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Setting" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Setting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account resource name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current account setting for the resource name. If <code>enabled</code>, the resource receives the new Amazon
     * Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource receives the old
     * Amazon Resource Name (ARN) and resource identifier (ID) format.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * authenticated user is assumed.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The account resource name.
     * </p>
     * 
     * @param name
     *        The account resource name.
     * @see SettingName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The account resource name.
     * </p>
     * 
     * @return The account resource name.
     * @see SettingName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The account resource name.
     * </p>
     * 
     * @param name
     *        The account resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public Setting withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The account resource name.
     * </p>
     * 
     * @param name
     *        The account resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public Setting withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The current account setting for the resource name. If <code>enabled</code>, the resource receives the new Amazon
     * Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource receives the old
     * Amazon Resource Name (ARN) and resource identifier (ID) format.
     * </p>
     * 
     * @param value
     *        The current account setting for the resource name. If <code>enabled</code>, the resource receives the new
     *        Amazon Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource
     *        receives the old Amazon Resource Name (ARN) and resource identifier (ID) format.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current account setting for the resource name. If <code>enabled</code>, the resource receives the new Amazon
     * Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource receives the old
     * Amazon Resource Name (ARN) and resource identifier (ID) format.
     * </p>
     * 
     * @return The current account setting for the resource name. If <code>enabled</code>, the resource receives the new
     *         Amazon Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource
     *         receives the old Amazon Resource Name (ARN) and resource identifier (ID) format.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current account setting for the resource name. If <code>enabled</code>, the resource receives the new Amazon
     * Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource receives the old
     * Amazon Resource Name (ARN) and resource identifier (ID) format.
     * </p>
     * 
     * @param value
     *        The current account setting for the resource name. If <code>enabled</code>, the resource receives the new
     *        Amazon Resource Name (ARN) and resource identifier (ID) format. If <code>disabled</code>, the resource
     *        receives the old Amazon Resource Name (ARN) and resource identifier (ID) format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Setting withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * authenticated user is assumed.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted,
     *        the authenticated user is assumed.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * authenticated user is assumed.
     * </p>
     * 
     * @return The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted,
     *         the authenticated user is assumed.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * authenticated user is assumed.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted,
     *        the authenticated user is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Setting withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Setting == false)
            return false;
        Setting other = (Setting) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public Setting clone() {
        try {
            return (Setting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.SettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
