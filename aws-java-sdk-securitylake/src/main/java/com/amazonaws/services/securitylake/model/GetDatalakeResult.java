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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalake" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatalakeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves the Security Lake configuration object.
     * </p>
     */
    private java.util.Map<String, LakeConfigurationResponse> configurations;

    /**
     * <p>
     * Retrieves the Security Lake configuration object.
     * </p>
     * 
     * @return Retrieves the Security Lake configuration object.
     */

    public java.util.Map<String, LakeConfigurationResponse> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Retrieves the Security Lake configuration object.
     * </p>
     * 
     * @param configurations
     *        Retrieves the Security Lake configuration object.
     */

    public void setConfigurations(java.util.Map<String, LakeConfigurationResponse> configurations) {
        this.configurations = configurations;
    }

    /**
     * <p>
     * Retrieves the Security Lake configuration object.
     * </p>
     * 
     * @param configurations
     *        Retrieves the Security Lake configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeResult withConfigurations(java.util.Map<String, LakeConfigurationResponse> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * Add a single Configurations entry
     *
     * @see GetDatalakeResult#withConfigurations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeResult addConfigurationsEntry(String key, LakeConfigurationResponse value) {
        if (null == this.configurations) {
            this.configurations = new java.util.HashMap<String, LakeConfigurationResponse>();
        }
        if (this.configurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeResult clearConfigurationsEntries() {
        this.configurations = null;
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
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatalakeResult == false)
            return false;
        GetDatalakeResult other = (GetDatalakeResult) obj;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GetDatalakeResult clone() {
        try {
            return (GetDatalakeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
