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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource in the organization that's available to be associated with a Firewall Manager resource set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DiscoveredResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoveredResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The universal resource identifier (URI) of the discovered resource.
     * </p>
     */
    private String uRI;
    /**
     * <p>
     * The Amazon Web Services account ID associated with the discovered resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The type of the discovered resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the discovered resource.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The universal resource identifier (URI) of the discovered resource.
     * </p>
     * 
     * @param uRI
     *        The universal resource identifier (URI) of the discovered resource.
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * The universal resource identifier (URI) of the discovered resource.
     * </p>
     * 
     * @return The universal resource identifier (URI) of the discovered resource.
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * The universal resource identifier (URI) of the discovered resource.
     * </p>
     * 
     * @param uRI
     *        The universal resource identifier (URI) of the discovered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveredResource withURI(String uRI) {
        setURI(uRI);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the discovered resource.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID associated with the discovered resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the discovered resource.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the discovered resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the discovered resource.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID associated with the discovered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveredResource withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The type of the discovered resource.
     * </p>
     * 
     * @param type
     *        The type of the discovered resource.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the discovered resource.
     * </p>
     * 
     * @return The type of the discovered resource.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the discovered resource.
     * </p>
     * 
     * @param type
     *        The type of the discovered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveredResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the discovered resource.
     * </p>
     * 
     * @param name
     *        The name of the discovered resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the discovered resource.
     * </p>
     * 
     * @return The name of the discovered resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the discovered resource.
     * </p>
     * 
     * @param name
     *        The name of the discovered resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveredResource withName(String name) {
        setName(name);
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
        if (getURI() != null)
            sb.append("URI: ").append(getURI()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoveredResource == false)
            return false;
        DiscoveredResource other = (DiscoveredResource) obj;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DiscoveredResource clone() {
        try {
            return (DiscoveredResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.DiscoveredResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
