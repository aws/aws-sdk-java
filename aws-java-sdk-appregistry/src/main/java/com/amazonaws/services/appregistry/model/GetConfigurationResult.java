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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves <code>TagKey</code> configuration from an account.
     * </p>
     */
    private AppRegistryConfiguration configuration;

    /**
     * <p>
     * Retrieves <code>TagKey</code> configuration from an account.
     * </p>
     * 
     * @param configuration
     *        Retrieves <code>TagKey</code> configuration from an account.
     */

    public void setConfiguration(AppRegistryConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Retrieves <code>TagKey</code> configuration from an account.
     * </p>
     * 
     * @return Retrieves <code>TagKey</code> configuration from an account.
     */

    public AppRegistryConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Retrieves <code>TagKey</code> configuration from an account.
     * </p>
     * 
     * @param configuration
     *        Retrieves <code>TagKey</code> configuration from an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationResult withConfiguration(AppRegistryConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationResult == false)
            return false;
        GetConfigurationResult other = (GetConfigurationResult) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationResult clone() {
        try {
            return (GetConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
