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
 * Details of a resource that is associated to an Firewall Manager resource set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/Resource" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource's universal resource indicator (URI).
     * </p>
     */
    private String uRI;
    /**
     * <p>
     * The Amazon Web Services account ID that the associated resource belongs to.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The resource's universal resource indicator (URI).
     * </p>
     * 
     * @param uRI
     *        The resource's universal resource indicator (URI).
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * The resource's universal resource indicator (URI).
     * </p>
     * 
     * @return The resource's universal resource indicator (URI).
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * The resource's universal resource indicator (URI).
     * </p>
     * 
     * @param uRI
     *        The resource's universal resource indicator (URI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withURI(String uRI) {
        setURI(uRI);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the associated resource belongs to.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that the associated resource belongs to.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the associated resource belongs to.
     * </p>
     * 
     * @return The Amazon Web Services account ID that the associated resource belongs to.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the associated resource belongs to.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that the associated resource belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withAccountId(String accountId) {
        setAccountId(accountId);
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
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
