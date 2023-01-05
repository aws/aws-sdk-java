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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The basic auth credentials required for basic authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/BasicAuthCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BasicAuthCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The username to use to connect to a resource.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password to use to connect to a resource.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The username to use to connect to a resource.
     * </p>
     * 
     * @param username
     *        The username to use to connect to a resource.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username to use to connect to a resource.
     * </p>
     * 
     * @return The username to use to connect to a resource.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username to use to connect to a resource.
     * </p>
     * 
     * @param username
     *        The username to use to connect to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicAuthCredentials withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password to use to connect to a resource.
     * </p>
     * 
     * @param password
     *        The password to use to connect to a resource.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password to use to connect to a resource.
     * </p>
     * 
     * @return The password to use to connect to a resource.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password to use to connect to a resource.
     * </p>
     * 
     * @param password
     *        The password to use to connect to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicAuthCredentials withPassword(String password) {
        setPassword(password);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BasicAuthCredentials == false)
            return false;
        BasicAuthCredentials other = (BasicAuthCredentials) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public BasicAuthCredentials clone() {
        try {
            return (BasicAuthCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.BasicAuthCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
