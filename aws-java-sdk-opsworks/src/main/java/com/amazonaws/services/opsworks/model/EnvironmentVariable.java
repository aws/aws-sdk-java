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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an app's environment variable.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/EnvironmentVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentVariable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (Required) The environment variable's name, which can consist of up to 64 characters and must be specified. The
     * name can contain upper- and lowercase letters, numbers, and underscores (_), but it must start with a letter or
     * underscore.
     * </p>
     */
    private String key;
    /**
     * <p>
     * (Optional) The environment variable's value, which can be left empty. If you specify a value, it can contain up
     * to 256 characters, which must all be printable.
     * </p>
     */
    private String value;
    /**
     * <p>
     * (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     * environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     * returns <code>*****FILTERED*****</code> instead of the actual value. The default value for <code>Secure</code> is
     * <code>false</code>.
     * </p>
     */
    private Boolean secure;

    /**
     * <p>
     * (Required) The environment variable's name, which can consist of up to 64 characters and must be specified. The
     * name can contain upper- and lowercase letters, numbers, and underscores (_), but it must start with a letter or
     * underscore.
     * </p>
     * 
     * @param key
     *        (Required) The environment variable's name, which can consist of up to 64 characters and must be
     *        specified. The name can contain upper- and lowercase letters, numbers, and underscores (_), but it must
     *        start with a letter or underscore.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * (Required) The environment variable's name, which can consist of up to 64 characters and must be specified. The
     * name can contain upper- and lowercase letters, numbers, and underscores (_), but it must start with a letter or
     * underscore.
     * </p>
     * 
     * @return (Required) The environment variable's name, which can consist of up to 64 characters and must be
     *         specified. The name can contain upper- and lowercase letters, numbers, and underscores (_), but it must
     *         start with a letter or underscore.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * (Required) The environment variable's name, which can consist of up to 64 characters and must be specified. The
     * name can contain upper- and lowercase letters, numbers, and underscores (_), but it must start with a letter or
     * underscore.
     * </p>
     * 
     * @param key
     *        (Required) The environment variable's name, which can consist of up to 64 characters and must be
     *        specified. The name can contain upper- and lowercase letters, numbers, and underscores (_), but it must
     *        start with a letter or underscore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * (Optional) The environment variable's value, which can be left empty. If you specify a value, it can contain up
     * to 256 characters, which must all be printable.
     * </p>
     * 
     * @param value
     *        (Optional) The environment variable's value, which can be left empty. If you specify a value, it can
     *        contain up to 256 characters, which must all be printable.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * (Optional) The environment variable's value, which can be left empty. If you specify a value, it can contain up
     * to 256 characters, which must all be printable.
     * </p>
     * 
     * @return (Optional) The environment variable's value, which can be left empty. If you specify a value, it can
     *         contain up to 256 characters, which must all be printable.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * (Optional) The environment variable's value, which can be left empty. If you specify a value, it can contain up
     * to 256 characters, which must all be printable.
     * </p>
     * 
     * @param value
     *        (Optional) The environment variable's value, which can be left empty. If you specify a value, it can
     *        contain up to 256 characters, which must all be printable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     * environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     * returns <code>*****FILTERED*****</code> instead of the actual value. The default value for <code>Secure</code> is
     * <code>false</code>.
     * </p>
     * 
     * @param secure
     *        (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     *        environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     *        returns <code>*****FILTERED*****</code> instead of the actual value. The default value for
     *        <code>Secure</code> is <code>false</code>.
     */

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    /**
     * <p>
     * (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     * environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     * returns <code>*****FILTERED*****</code> instead of the actual value. The default value for <code>Secure</code> is
     * <code>false</code>.
     * </p>
     * 
     * @return (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     *         environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code>
     *         then returns <code>*****FILTERED*****</code> instead of the actual value. The default value for
     *         <code>Secure</code> is <code>false</code>.
     */

    public Boolean getSecure() {
        return this.secure;
    }

    /**
     * <p>
     * (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     * environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     * returns <code>*****FILTERED*****</code> instead of the actual value. The default value for <code>Secure</code> is
     * <code>false</code>.
     * </p>
     * 
     * @param secure
     *        (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     *        environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     *        returns <code>*****FILTERED*****</code> instead of the actual value. The default value for
     *        <code>Secure</code> is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withSecure(Boolean secure) {
        setSecure(secure);
        return this;
    }

    /**
     * <p>
     * (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     * environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code> then
     * returns <code>*****FILTERED*****</code> instead of the actual value. The default value for <code>Secure</code> is
     * <code>false</code>.
     * </p>
     * 
     * @return (Optional) Whether the variable's value will be returned by the <a>DescribeApps</a> action. To conceal an
     *         environment variable's value, set <code>Secure</code> to <code>true</code>. <code>DescribeApps</code>
     *         then returns <code>*****FILTERED*****</code> instead of the actual value. The default value for
     *         <code>Secure</code> is <code>false</code>.
     */

    public Boolean isSecure() {
        return this.secure;
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSecure() != null)
            sb.append("Secure: ").append(getSecure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentVariable == false)
            return false;
        EnvironmentVariable other = (EnvironmentVariable) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSecure() == null ^ this.getSecure() == null)
            return false;
        if (other.getSecure() != null && other.getSecure().equals(this.getSecure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSecure() == null) ? 0 : getSecure().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentVariable clone() {
        try {
            return (EnvironmentVariable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.EnvironmentVariableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
