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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The credentials that you can use to connect to cluster endpoints. Credentials consist of a username and a password.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/Credentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The username and password that you use to connect to cluster endpoints.
     * </p>
     */
    private UsernamePassword usernamePassword;

    /**
     * <p>
     * The username and password that you use to connect to cluster endpoints.
     * </p>
     * 
     * @param usernamePassword
     *        The username and password that you use to connect to cluster endpoints.
     */

    public void setUsernamePassword(UsernamePassword usernamePassword) {
        this.usernamePassword = usernamePassword;
    }

    /**
     * <p>
     * The username and password that you use to connect to cluster endpoints.
     * </p>
     * 
     * @return The username and password that you use to connect to cluster endpoints.
     */

    public UsernamePassword getUsernamePassword() {
        return this.usernamePassword;
    }

    /**
     * <p>
     * The username and password that you use to connect to cluster endpoints.
     * </p>
     * 
     * @param usernamePassword
     *        The username and password that you use to connect to cluster endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withUsernamePassword(UsernamePassword usernamePassword) {
        setUsernamePassword(usernamePassword);
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
        if (getUsernamePassword() != null)
            sb.append("UsernamePassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credentials == false)
            return false;
        Credentials other = (Credentials) obj;
        if (other.getUsernamePassword() == null ^ this.getUsernamePassword() == null)
            return false;
        if (other.getUsernamePassword() != null && other.getUsernamePassword().equals(this.getUsernamePassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsernamePassword() == null) ? 0 : getUsernamePassword().hashCode());
        return hashCode;
    }

    @Override
    public Credentials clone() {
        try {
            return (Credentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.CredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
