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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the endpoints for the API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayEndpointConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayEndpointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of endpoint types for the REST API.
     * </p>
     * <p>
     * For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type is
     * <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * A list of endpoint types for the REST API.
     * </p>
     * <p>
     * For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type is
     * <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     * 
     * @return A list of endpoint types for the REST API.</p>
     *         <p>
     *         For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type
     *         is <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * A list of endpoint types for the REST API.
     * </p>
     * <p>
     * For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type is
     * <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     * 
     * @param types
     *        A list of endpoint types for the REST API.</p>
     *        <p>
     *        For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type
     *        is <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
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
     * A list of endpoint types for the REST API.
     * </p>
     * <p>
     * For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type is
     * <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        A list of endpoint types for the REST API.</p>
     *        <p>
     *        For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type
     *        is <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayEndpointConfiguration withTypes(String... types) {
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
     * A list of endpoint types for the REST API.
     * </p>
     * <p>
     * For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type is
     * <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     * 
     * @param types
     *        A list of endpoint types for the REST API.</p>
     *        <p>
     *        For an edge-optimized API, the endpoint type is <code>EDGE</code>. For a Regional API, the endpoint type
     *        is <code>REGIONAL</code>. For a private API, the endpoint type is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayEndpointConfiguration withTypes(java.util.Collection<String> types) {
        setTypes(types);
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

        if (obj instanceof AwsApiGatewayEndpointConfiguration == false)
            return false;
        AwsApiGatewayEndpointConfiguration other = (AwsApiGatewayEndpointConfiguration) obj;
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
    public AwsApiGatewayEndpointConfiguration clone() {
        try {
            return (AwsApiGatewayEndpointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayEndpointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
