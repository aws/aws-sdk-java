/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApiEnvironmentVariables"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGraphqlApiEnvironmentVariablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     * </p>
     * 
     * @return The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     * </p>
     * 
     * @param environmentVariables
     *        The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     * </p>
     * 
     * @param environmentVariables
     *        The payload containing each environmental variable in the <code>"key" : "value"</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGraphqlApiEnvironmentVariablesResult withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see GetGraphqlApiEnvironmentVariablesResult#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetGraphqlApiEnvironmentVariablesResult addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGraphqlApiEnvironmentVariablesResult clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
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
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGraphqlApiEnvironmentVariablesResult == false)
            return false;
        GetGraphqlApiEnvironmentVariablesResult other = (GetGraphqlApiEnvironmentVariablesResult) obj;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public GetGraphqlApiEnvironmentVariablesResult clone() {
        try {
            return (GetGraphqlApiEnvironmentVariablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
