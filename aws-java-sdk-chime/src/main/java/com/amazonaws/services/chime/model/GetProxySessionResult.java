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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetProxySession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProxySessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The proxy session details.
     * </p>
     */
    private ProxySession proxySession;

    /**
     * <p>
     * The proxy session details.
     * </p>
     * 
     * @param proxySession
     *        The proxy session details.
     */

    public void setProxySession(ProxySession proxySession) {
        this.proxySession = proxySession;
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * 
     * @return The proxy session details.
     */

    public ProxySession getProxySession() {
        return this.proxySession;
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * 
     * @param proxySession
     *        The proxy session details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProxySessionResult withProxySession(ProxySession proxySession) {
        setProxySession(proxySession);
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
        if (getProxySession() != null)
            sb.append("ProxySession: ").append(getProxySession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProxySessionResult == false)
            return false;
        GetProxySessionResult other = (GetProxySessionResult) obj;
        if (other.getProxySession() == null ^ this.getProxySession() == null)
            return false;
        if (other.getProxySession() != null && other.getProxySession().equals(this.getProxySession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProxySession() == null) ? 0 : getProxySession().hashCode());
        return hashCode;
    }

    @Override
    public GetProxySessionResult clone() {
        try {
            return (GetProxySessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
