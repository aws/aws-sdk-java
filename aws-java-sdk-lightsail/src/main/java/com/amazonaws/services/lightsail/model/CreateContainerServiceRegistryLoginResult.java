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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceRegistryLogin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerServiceRegistryLoginResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object that describes the log in information for the container service registry of your Lightsail account.
     * </p>
     */
    private ContainerServiceRegistryLogin registryLogin;

    /**
     * <p>
     * An object that describes the log in information for the container service registry of your Lightsail account.
     * </p>
     * 
     * @param registryLogin
     *        An object that describes the log in information for the container service registry of your Lightsail
     *        account.
     */

    public void setRegistryLogin(ContainerServiceRegistryLogin registryLogin) {
        this.registryLogin = registryLogin;
    }

    /**
     * <p>
     * An object that describes the log in information for the container service registry of your Lightsail account.
     * </p>
     * 
     * @return An object that describes the log in information for the container service registry of your Lightsail
     *         account.
     */

    public ContainerServiceRegistryLogin getRegistryLogin() {
        return this.registryLogin;
    }

    /**
     * <p>
     * An object that describes the log in information for the container service registry of your Lightsail account.
     * </p>
     * 
     * @param registryLogin
     *        An object that describes the log in information for the container service registry of your Lightsail
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceRegistryLoginResult withRegistryLogin(ContainerServiceRegistryLogin registryLogin) {
        setRegistryLogin(registryLogin);
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
        if (getRegistryLogin() != null)
            sb.append("RegistryLogin: ").append(getRegistryLogin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerServiceRegistryLoginResult == false)
            return false;
        CreateContainerServiceRegistryLoginResult other = (CreateContainerServiceRegistryLoginResult) obj;
        if (other.getRegistryLogin() == null ^ this.getRegistryLogin() == null)
            return false;
        if (other.getRegistryLogin() != null && other.getRegistryLogin().equals(this.getRegistryLogin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryLogin() == null) ? 0 : getRegistryLogin().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerServiceRegistryLoginResult clone() {
        try {
            return (CreateContainerServiceRegistryLoginResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
