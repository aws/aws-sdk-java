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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the Basic authorization parameters to use for the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/CreateConnectionBasicAuthRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionBasicAuthRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password associated with the user name to use for Basic authorization.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     * 
     * @param username
     *        The user name to use for Basic authorization.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     * 
     * @return The user name to use for Basic authorization.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     * 
     * @param username
     *        The user name to use for Basic authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionBasicAuthRequestParameters withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password associated with the user name to use for Basic authorization.
     * </p>
     * 
     * @param password
     *        The password associated with the user name to use for Basic authorization.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password associated with the user name to use for Basic authorization.
     * </p>
     * 
     * @return The password associated with the user name to use for Basic authorization.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password associated with the user name to use for Basic authorization.
     * </p>
     * 
     * @param password
     *        The password associated with the user name to use for Basic authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionBasicAuthRequestParameters withPassword(String password) {
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
            sb.append("Password: ").append(getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionBasicAuthRequestParameters == false)
            return false;
        CreateConnectionBasicAuthRequestParameters other = (CreateConnectionBasicAuthRequestParameters) obj;
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
    public CreateConnectionBasicAuthRequestParameters clone() {
        try {
            return (CreateConnectionBasicAuthRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.CreateConnectionBasicAuthRequestParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
