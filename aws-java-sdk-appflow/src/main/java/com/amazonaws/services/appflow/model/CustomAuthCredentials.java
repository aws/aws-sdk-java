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
 * The custom credentials required for custom authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomAuthCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAuthCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The custom authentication type that the connector uses.
     * </p>
     */
    private String customAuthenticationType;
    /**
     * <p>
     * A map that holds custom authentication credentials.
     * </p>
     */
    private java.util.Map<String, String> credentialsMap;

    /**
     * <p>
     * The custom authentication type that the connector uses.
     * </p>
     * 
     * @param customAuthenticationType
     *        The custom authentication type that the connector uses.
     */

    public void setCustomAuthenticationType(String customAuthenticationType) {
        this.customAuthenticationType = customAuthenticationType;
    }

    /**
     * <p>
     * The custom authentication type that the connector uses.
     * </p>
     * 
     * @return The custom authentication type that the connector uses.
     */

    public String getCustomAuthenticationType() {
        return this.customAuthenticationType;
    }

    /**
     * <p>
     * The custom authentication type that the connector uses.
     * </p>
     * 
     * @param customAuthenticationType
     *        The custom authentication type that the connector uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthCredentials withCustomAuthenticationType(String customAuthenticationType) {
        setCustomAuthenticationType(customAuthenticationType);
        return this;
    }

    /**
     * <p>
     * A map that holds custom authentication credentials.
     * </p>
     * 
     * @return A map that holds custom authentication credentials.
     */

    public java.util.Map<String, String> getCredentialsMap() {
        return credentialsMap;
    }

    /**
     * <p>
     * A map that holds custom authentication credentials.
     * </p>
     * 
     * @param credentialsMap
     *        A map that holds custom authentication credentials.
     */

    public void setCredentialsMap(java.util.Map<String, String> credentialsMap) {
        this.credentialsMap = credentialsMap;
    }

    /**
     * <p>
     * A map that holds custom authentication credentials.
     * </p>
     * 
     * @param credentialsMap
     *        A map that holds custom authentication credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthCredentials withCredentialsMap(java.util.Map<String, String> credentialsMap) {
        setCredentialsMap(credentialsMap);
        return this;
    }

    /**
     * Add a single CredentialsMap entry
     *
     * @see CustomAuthCredentials#withCredentialsMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthCredentials addCredentialsMapEntry(String key, String value) {
        if (null == this.credentialsMap) {
            this.credentialsMap = new java.util.HashMap<String, String>();
        }
        if (this.credentialsMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.credentialsMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CredentialsMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthCredentials clearCredentialsMapEntries() {
        this.credentialsMap = null;
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
        if (getCustomAuthenticationType() != null)
            sb.append("CustomAuthenticationType: ").append(getCustomAuthenticationType()).append(",");
        if (getCredentialsMap() != null)
            sb.append("CredentialsMap: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAuthCredentials == false)
            return false;
        CustomAuthCredentials other = (CustomAuthCredentials) obj;
        if (other.getCustomAuthenticationType() == null ^ this.getCustomAuthenticationType() == null)
            return false;
        if (other.getCustomAuthenticationType() != null && other.getCustomAuthenticationType().equals(this.getCustomAuthenticationType()) == false)
            return false;
        if (other.getCredentialsMap() == null ^ this.getCredentialsMap() == null)
            return false;
        if (other.getCredentialsMap() != null && other.getCredentialsMap().equals(this.getCredentialsMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomAuthenticationType() == null) ? 0 : getCustomAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getCredentialsMap() == null) ? 0 : getCredentialsMap().hashCode());
        return hashCode;
    }

    @Override
    public CustomAuthCredentials clone() {
        try {
            return (CustomAuthCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomAuthCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
