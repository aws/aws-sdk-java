/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an app's environment variable.
 * </p>
 */
public class EnvironmentVariable implements Serializable {

    /**
     * (Required) The environment variable's name, which can consist of up to
     * 64 characters and must be specified. The name can contain upper- and
     * lowercase letters, numbers, and underscores (_), but it must start
     * with a letter or underscore.
     */
    private String key;

    /**
     * (Optional) The environment variable's value, which can be left empty.
     * If you specify a value, it can contain up to 256 characters, which
     * must all be printable.
     */
    private String value;

    /**
     * (Optional) Whether the variable's value will be returned by the
     * <a>DescribeApps</a> action. To conceal an environment variable's
     * value, set <code>Secure</code> to <code>true</code>.
     * <code>DescribeApps</code> then returns <code>**Filtered**</code>
     * instead of the actual value. The default value for <code>Secure</code>
     * is <code>false</code>.
     */
    private Boolean secure;

    /**
     * (Required) The environment variable's name, which can consist of up to
     * 64 characters and must be specified. The name can contain upper- and
     * lowercase letters, numbers, and underscores (_), but it must start
     * with a letter or underscore.
     *
     * @return (Required) The environment variable's name, which can consist of up to
     *         64 characters and must be specified. The name can contain upper- and
     *         lowercase letters, numbers, and underscores (_), but it must start
     *         with a letter or underscore.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * (Required) The environment variable's name, which can consist of up to
     * 64 characters and must be specified. The name can contain upper- and
     * lowercase letters, numbers, and underscores (_), but it must start
     * with a letter or underscore.
     *
     * @param key (Required) The environment variable's name, which can consist of up to
     *         64 characters and must be specified. The name can contain upper- and
     *         lowercase letters, numbers, and underscores (_), but it must start
     *         with a letter or underscore.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * (Required) The environment variable's name, which can consist of up to
     * 64 characters and must be specified. The name can contain upper- and
     * lowercase letters, numbers, and underscores (_), but it must start
     * with a letter or underscore.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key (Required) The environment variable's name, which can consist of up to
     *         64 characters and must be specified. The name can contain upper- and
     *         lowercase letters, numbers, and underscores (_), but it must start
     *         with a letter or underscore.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnvironmentVariable withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * (Optional) The environment variable's value, which can be left empty.
     * If you specify a value, it can contain up to 256 characters, which
     * must all be printable.
     *
     * @return (Optional) The environment variable's value, which can be left empty.
     *         If you specify a value, it can contain up to 256 characters, which
     *         must all be printable.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * (Optional) The environment variable's value, which can be left empty.
     * If you specify a value, it can contain up to 256 characters, which
     * must all be printable.
     *
     * @param value (Optional) The environment variable's value, which can be left empty.
     *         If you specify a value, it can contain up to 256 characters, which
     *         must all be printable.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * (Optional) The environment variable's value, which can be left empty.
     * If you specify a value, it can contain up to 256 characters, which
     * must all be printable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value (Optional) The environment variable's value, which can be left empty.
     *         If you specify a value, it can contain up to 256 characters, which
     *         must all be printable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnvironmentVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * (Optional) Whether the variable's value will be returned by the
     * <a>DescribeApps</a> action. To conceal an environment variable's
     * value, set <code>Secure</code> to <code>true</code>.
     * <code>DescribeApps</code> then returns <code>**Filtered**</code>
     * instead of the actual value. The default value for <code>Secure</code>
     * is <code>false</code>.
     *
     * @return (Optional) Whether the variable's value will be returned by the
     *         <a>DescribeApps</a> action. To conceal an environment variable's
     *         value, set <code>Secure</code> to <code>true</code>.
     *         <code>DescribeApps</code> then returns <code>**Filtered**</code>
     *         instead of the actual value. The default value for <code>Secure</code>
     *         is <code>false</code>.
     */
    public Boolean isSecure() {
        return secure;
    }
    
    /**
     * (Optional) Whether the variable's value will be returned by the
     * <a>DescribeApps</a> action. To conceal an environment variable's
     * value, set <code>Secure</code> to <code>true</code>.
     * <code>DescribeApps</code> then returns <code>**Filtered**</code>
     * instead of the actual value. The default value for <code>Secure</code>
     * is <code>false</code>.
     *
     * @param secure (Optional) Whether the variable's value will be returned by the
     *         <a>DescribeApps</a> action. To conceal an environment variable's
     *         value, set <code>Secure</code> to <code>true</code>.
     *         <code>DescribeApps</code> then returns <code>**Filtered**</code>
     *         instead of the actual value. The default value for <code>Secure</code>
     *         is <code>false</code>.
     */
    public void setSecure(Boolean secure) {
        this.secure = secure;
    }
    
    /**
     * (Optional) Whether the variable's value will be returned by the
     * <a>DescribeApps</a> action. To conceal an environment variable's
     * value, set <code>Secure</code> to <code>true</code>.
     * <code>DescribeApps</code> then returns <code>**Filtered**</code>
     * instead of the actual value. The default value for <code>Secure</code>
     * is <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secure (Optional) Whether the variable's value will be returned by the
     *         <a>DescribeApps</a> action. To conceal an environment variable's
     *         value, set <code>Secure</code> to <code>true</code>.
     *         <code>DescribeApps</code> then returns <code>**Filtered**</code>
     *         instead of the actual value. The default value for <code>Secure</code>
     *         is <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnvironmentVariable withSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    /**
     * (Optional) Whether the variable's value will be returned by the
     * <a>DescribeApps</a> action. To conceal an environment variable's
     * value, set <code>Secure</code> to <code>true</code>.
     * <code>DescribeApps</code> then returns <code>**Filtered**</code>
     * instead of the actual value. The default value for <code>Secure</code>
     * is <code>false</code>.
     *
     * @return (Optional) Whether the variable's value will be returned by the
     *         <a>DescribeApps</a> action. To conceal an environment variable's
     *         value, set <code>Secure</code> to <code>true</code>.
     *         <code>DescribeApps</code> then returns <code>**Filtered**</code>
     *         instead of the actual value. The default value for <code>Secure</code>
     *         is <code>false</code>.
     */
    public Boolean getSecure() {
        return secure;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (isSecure() != null) sb.append("Secure: " + isSecure() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isSecure() == null) ? 0 : isSecure().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnvironmentVariable == false) return false;
        EnvironmentVariable other = (EnvironmentVariable)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isSecure() == null ^ this.isSecure() == null) return false;
        if (other.isSecure() != null && other.isSecure().equals(this.isSecure()) == false) return false; 
        return true;
    }
    
}
    