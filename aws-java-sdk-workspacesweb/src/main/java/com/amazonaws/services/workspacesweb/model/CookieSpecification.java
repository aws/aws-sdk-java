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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a single cookie or set of cookies in an end user's browser.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CookieSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CookieSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain of the cookie.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the cookie.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path of the cookie.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The domain of the cookie.
     * </p>
     * 
     * @param domain
     *        The domain of the cookie.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of the cookie.
     * </p>
     * 
     * @return The domain of the cookie.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of the cookie.
     * </p>
     * 
     * @param domain
     *        The domain of the cookie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSpecification withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the cookie.
     * </p>
     * 
     * @param name
     *        The name of the cookie.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cookie.
     * </p>
     * 
     * @return The name of the cookie.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cookie.
     * </p>
     * 
     * @param name
     *        The name of the cookie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSpecification withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path of the cookie.
     * </p>
     * 
     * @param path
     *        The path of the cookie.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the cookie.
     * </p>
     * 
     * @return The path of the cookie.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the cookie.
     * </p>
     * 
     * @param path
     *        The path of the cookie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieSpecification withPath(String path) {
        setPath(path);
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
        if (getDomain() != null)
            sb.append("Domain: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getPath() != null)
            sb.append("Path: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CookieSpecification == false)
            return false;
        CookieSpecification other = (CookieSpecification) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public CookieSpecification clone() {
        try {
            return (CookieSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.CookieSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
