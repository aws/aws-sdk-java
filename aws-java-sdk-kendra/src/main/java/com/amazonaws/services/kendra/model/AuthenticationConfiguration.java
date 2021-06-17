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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to websites that require user authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AuthenticationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of configuration information that's required to connect to and crawl a website host using basic
     * authentication credentials.
     * </p>
     * <p>
     * The list includes the name and port number of the website host.
     * </p>
     */
    private java.util.List<BasicAuthenticationConfiguration> basicAuthentication;

    /**
     * <p>
     * The list of configuration information that's required to connect to and crawl a website host using basic
     * authentication credentials.
     * </p>
     * <p>
     * The list includes the name and port number of the website host.
     * </p>
     * 
     * @return The list of configuration information that's required to connect to and crawl a website host using basic
     *         authentication credentials.</p>
     *         <p>
     *         The list includes the name and port number of the website host.
     */

    public java.util.List<BasicAuthenticationConfiguration> getBasicAuthentication() {
        return basicAuthentication;
    }

    /**
     * <p>
     * The list of configuration information that's required to connect to and crawl a website host using basic
     * authentication credentials.
     * </p>
     * <p>
     * The list includes the name and port number of the website host.
     * </p>
     * 
     * @param basicAuthentication
     *        The list of configuration information that's required to connect to and crawl a website host using basic
     *        authentication credentials.</p>
     *        <p>
     *        The list includes the name and port number of the website host.
     */

    public void setBasicAuthentication(java.util.Collection<BasicAuthenticationConfiguration> basicAuthentication) {
        if (basicAuthentication == null) {
            this.basicAuthentication = null;
            return;
        }

        this.basicAuthentication = new java.util.ArrayList<BasicAuthenticationConfiguration>(basicAuthentication);
    }

    /**
     * <p>
     * The list of configuration information that's required to connect to and crawl a website host using basic
     * authentication credentials.
     * </p>
     * <p>
     * The list includes the name and port number of the website host.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBasicAuthentication(java.util.Collection)} or {@link #withBasicAuthentication(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param basicAuthentication
     *        The list of configuration information that's required to connect to and crawl a website host using basic
     *        authentication credentials.</p>
     *        <p>
     *        The list includes the name and port number of the website host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withBasicAuthentication(BasicAuthenticationConfiguration... basicAuthentication) {
        if (this.basicAuthentication == null) {
            setBasicAuthentication(new java.util.ArrayList<BasicAuthenticationConfiguration>(basicAuthentication.length));
        }
        for (BasicAuthenticationConfiguration ele : basicAuthentication) {
            this.basicAuthentication.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of configuration information that's required to connect to and crawl a website host using basic
     * authentication credentials.
     * </p>
     * <p>
     * The list includes the name and port number of the website host.
     * </p>
     * 
     * @param basicAuthentication
     *        The list of configuration information that's required to connect to and crawl a website host using basic
     *        authentication credentials.</p>
     *        <p>
     *        The list includes the name and port number of the website host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withBasicAuthentication(java.util.Collection<BasicAuthenticationConfiguration> basicAuthentication) {
        setBasicAuthentication(basicAuthentication);
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
        if (getBasicAuthentication() != null)
            sb.append("BasicAuthentication: ").append(getBasicAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationConfiguration == false)
            return false;
        AuthenticationConfiguration other = (AuthenticationConfiguration) obj;
        if (other.getBasicAuthentication() == null ^ this.getBasicAuthentication() == null)
            return false;
        if (other.getBasicAuthentication() != null && other.getBasicAuthentication().equals(this.getBasicAuthentication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasicAuthentication() == null) ? 0 : getBasicAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationConfiguration clone() {
        try {
            return (AuthenticationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AuthenticationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
