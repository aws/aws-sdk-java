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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The endpoint configuration to indicate the types of endpoints an API (<a>RestApi</a>) or its custom domain name
 * (<a>DomainName</a>) has.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     * edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the endpoint type is
     * <code>PRIVATE</code>.
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     * edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the endpoint type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @return A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     *         edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional
     *         API and its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the
     *         endpoint type is <code>PRIVATE</code>.
     * @see EndpointType
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     * edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the endpoint type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @param types
     *        A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     *        edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional
     *        API and its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the
     *        endpoint type is <code>PRIVATE</code>.
     * @see EndpointType
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     * edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the endpoint type is
     * <code>PRIVATE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     *        edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional
     *        API and its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the
     *        endpoint type is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public EndpointConfiguration withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     * edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the endpoint type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @param types
     *        A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     *        edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional
     *        API and its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the
     *        endpoint type is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public EndpointConfiguration withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     * edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the endpoint type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @param types
     *        A list of endpoint types of an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>). For an
     *        edge-optimized API and its custom domain name, the endpoint type is <code>"EDGE"</code>. For a regional
     *        API and its custom domain name, the endpoint type is <code>REGIONAL</code>. For a private API, the
     *        endpoint type is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public EndpointConfiguration withTypes(EndpointType... types) {
        java.util.ArrayList<String> typesCopy = new java.util.ArrayList<String>(types.length);
        for (EndpointType value : types) {
            typesCopy.add(value.toString());
        }
        if (getTypes() == null) {
            setTypes(typesCopy);
        } else {
            getTypes().addAll(typesCopy);
        }
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
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointConfiguration == false)
            return false;
        EndpointConfiguration other = (EndpointConfiguration) obj;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        return hashCode;
    }

    @Override
    public EndpointConfiguration clone() {
        try {
            return (EndpointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.EndpointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
