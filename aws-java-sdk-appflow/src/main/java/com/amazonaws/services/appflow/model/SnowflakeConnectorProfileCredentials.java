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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile credentials required when using Snowflake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SnowflakeConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password that corresponds to the user name.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileCredentials withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password that corresponds to the user name.
     * </p>
     * 
     * @param password
     *        The password that corresponds to the user name.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password that corresponds to the user name.
     * </p>
     * 
     * @return The password that corresponds to the user name.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password that corresponds to the user name.
     * </p>
     * 
     * @param password
     *        The password that corresponds to the user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileCredentials withPassword(String password) {
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

        if (obj instanceof SnowflakeConnectorProfileCredentials == false)
            return false;
        SnowflakeConnectorProfileCredentials other = (SnowflakeConnectorProfileCredentials) obj;
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
    public SnowflakeConnectorProfileCredentials clone() {
        try {
            return (SnowflakeConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SnowflakeConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
