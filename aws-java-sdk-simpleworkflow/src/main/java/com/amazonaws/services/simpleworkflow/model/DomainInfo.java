/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains general information about a domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DomainInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the domain. This name is unique within the account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the domain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     * registering types and creating new workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You should
     * not create new workflow executions in this domain.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The description of the domain provided through <a>RegisterDomain</a>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the domain. This name is unique within the account.
     * </p>
     * 
     * @param name
     *        The name of the domain. This name is unique within the account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. This name is unique within the account.
     * </p>
     * 
     * @return The name of the domain. This name is unique within the account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain. This name is unique within the account.
     * </p>
     * 
     * @param name
     *        The name of the domain. This name is unique within the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the domain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     * registering types and creating new workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You should
     * not create new workflow executions in this domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the domain:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     *        registering types and creating new workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You
     *        should not create new workflow executions in this domain.
     *        </p>
     *        </li>
     * @see RegistrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the domain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     * registering types and creating new workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You should
     * not create new workflow executions in this domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the domain:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     *         registering types and creating new workflow executions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use.
     *         You should not create new workflow executions in this domain.
     *         </p>
     *         </li>
     * @see RegistrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the domain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     * registering types and creating new workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You should
     * not create new workflow executions in this domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the domain:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     *        registering types and creating new workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You
     *        should not create new workflow executions in this domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public DomainInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the domain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     * registering types and creating new workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You should
     * not create new workflow executions in this domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the domain:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     *        registering types and creating new workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You
     *        should not create new workflow executions in this domain.
     *        </p>
     *        </li>
     * @see RegistrationStatus
     */

    public void setStatus(RegistrationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the domain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     * registering types and creating new workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You should
     * not create new workflow executions in this domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the domain:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The domain is properly registered and available. You can use this domain for
     *        registering types and creating new workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The domain was deprecated using <a>DeprecateDomain</a>, but is still in use. You
     *        should not create new workflow executions in this domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public DomainInfo withStatus(RegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the domain provided through <a>RegisterDomain</a>.
     * </p>
     * 
     * @param description
     *        The description of the domain provided through <a>RegisterDomain</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the domain provided through <a>RegisterDomain</a>.
     * </p>
     * 
     * @return The description of the domain provided through <a>RegisterDomain</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the domain provided through <a>RegisterDomain</a>.
     * </p>
     * 
     * @param description
     *        The description of the domain provided through <a>RegisterDomain</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainInfo withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainInfo == false)
            return false;
        DomainInfo other = (DomainInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public DomainInfo clone() {
        try {
            return (DomainInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.DomainInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
