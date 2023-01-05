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
 * The connector-specific profile credentials required when using SAPOData.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SAPODataConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAPODataConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SAPOData basic authentication credentials.
     * </p>
     */
    private BasicAuthCredentials basicAuthCredentials;
    /**
     * <p>
     * The SAPOData OAuth type authentication credentials.
     * </p>
     */
    private OAuthCredentials oAuthCredentials;

    /**
     * <p>
     * The SAPOData basic authentication credentials.
     * </p>
     * 
     * @param basicAuthCredentials
     *        The SAPOData basic authentication credentials.
     */

    public void setBasicAuthCredentials(BasicAuthCredentials basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The SAPOData basic authentication credentials.
     * </p>
     * 
     * @return The SAPOData basic authentication credentials.
     */

    public BasicAuthCredentials getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * The SAPOData basic authentication credentials.
     * </p>
     * 
     * @param basicAuthCredentials
     *        The SAPOData basic authentication credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileCredentials withBasicAuthCredentials(BasicAuthCredentials basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * The SAPOData OAuth type authentication credentials.
     * </p>
     * 
     * @param oAuthCredentials
     *        The SAPOData OAuth type authentication credentials.
     */

    public void setOAuthCredentials(OAuthCredentials oAuthCredentials) {
        this.oAuthCredentials = oAuthCredentials;
    }

    /**
     * <p>
     * The SAPOData OAuth type authentication credentials.
     * </p>
     * 
     * @return The SAPOData OAuth type authentication credentials.
     */

    public OAuthCredentials getOAuthCredentials() {
        return this.oAuthCredentials;
    }

    /**
     * <p>
     * The SAPOData OAuth type authentication credentials.
     * </p>
     * 
     * @param oAuthCredentials
     *        The SAPOData OAuth type authentication credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileCredentials withOAuthCredentials(OAuthCredentials oAuthCredentials) {
        setOAuthCredentials(oAuthCredentials);
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
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getOAuthCredentials() != null)
            sb.append("OAuthCredentials: ").append(getOAuthCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAPODataConnectorProfileCredentials == false)
            return false;
        SAPODataConnectorProfileCredentials other = (SAPODataConnectorProfileCredentials) obj;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getOAuthCredentials() == null ^ this.getOAuthCredentials() == null)
            return false;
        if (other.getOAuthCredentials() != null && other.getOAuthCredentials().equals(this.getOAuthCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getOAuthCredentials() == null) ? 0 : getOAuthCredentials().hashCode());
        return hashCode;
    }

    @Override
    public SAPODataConnectorProfileCredentials clone() {
        try {
            return (SAPODataConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SAPODataConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
