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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveEndpoints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the endpoints that you want to remove.
     * </p>
     */
    private java.util.List<EndpointIdentifier> endpointIdentifiers;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;

    /**
     * <p>
     * The identifiers of the endpoints that you want to remove.
     * </p>
     * 
     * @return The identifiers of the endpoints that you want to remove.
     */

    public java.util.List<EndpointIdentifier> getEndpointIdentifiers() {
        return endpointIdentifiers;
    }

    /**
     * <p>
     * The identifiers of the endpoints that you want to remove.
     * </p>
     * 
     * @param endpointIdentifiers
     *        The identifiers of the endpoints that you want to remove.
     */

    public void setEndpointIdentifiers(java.util.Collection<EndpointIdentifier> endpointIdentifiers) {
        if (endpointIdentifiers == null) {
            this.endpointIdentifiers = null;
            return;
        }

        this.endpointIdentifiers = new java.util.ArrayList<EndpointIdentifier>(endpointIdentifiers);
    }

    /**
     * <p>
     * The identifiers of the endpoints that you want to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointIdentifiers(java.util.Collection)} or {@link #withEndpointIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param endpointIdentifiers
     *        The identifiers of the endpoints that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveEndpointsRequest withEndpointIdentifiers(EndpointIdentifier... endpointIdentifiers) {
        if (this.endpointIdentifiers == null) {
            setEndpointIdentifiers(new java.util.ArrayList<EndpointIdentifier>(endpointIdentifiers.length));
        }
        for (EndpointIdentifier ele : endpointIdentifiers) {
            this.endpointIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the endpoints that you want to remove.
     * </p>
     * 
     * @param endpointIdentifiers
     *        The identifiers of the endpoints that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveEndpointsRequest withEndpointIdentifiers(java.util.Collection<EndpointIdentifier> endpointIdentifiers) {
        setEndpointIdentifiers(endpointIdentifiers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveEndpointsRequest withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
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
        if (getEndpointIdentifiers() != null)
            sb.append("EndpointIdentifiers: ").append(getEndpointIdentifiers()).append(",");
        if (getEndpointGroupArn() != null)
            sb.append("EndpointGroupArn: ").append(getEndpointGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveEndpointsRequest == false)
            return false;
        RemoveEndpointsRequest other = (RemoveEndpointsRequest) obj;
        if (other.getEndpointIdentifiers() == null ^ this.getEndpointIdentifiers() == null)
            return false;
        if (other.getEndpointIdentifiers() != null && other.getEndpointIdentifiers().equals(this.getEndpointIdentifiers()) == false)
            return false;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointIdentifiers() == null) ? 0 : getEndpointIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public RemoveEndpointsRequest clone() {
        return (RemoveEndpointsRequest) super.clone();
    }

}
