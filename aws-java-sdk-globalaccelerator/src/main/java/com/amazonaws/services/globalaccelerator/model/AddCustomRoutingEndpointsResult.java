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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddCustomRoutingEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddCustomRoutingEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoint objects added to the custom routing accelerator.
     * </p>
     */
    private java.util.List<CustomRoutingEndpointDescription> endpointDescriptions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     * </p>
     */
    private String endpointGroupArn;

    /**
     * <p>
     * The endpoint objects added to the custom routing accelerator.
     * </p>
     * 
     * @return The endpoint objects added to the custom routing accelerator.
     */

    public java.util.List<CustomRoutingEndpointDescription> getEndpointDescriptions() {
        return endpointDescriptions;
    }

    /**
     * <p>
     * The endpoint objects added to the custom routing accelerator.
     * </p>
     * 
     * @param endpointDescriptions
     *        The endpoint objects added to the custom routing accelerator.
     */

    public void setEndpointDescriptions(java.util.Collection<CustomRoutingEndpointDescription> endpointDescriptions) {
        if (endpointDescriptions == null) {
            this.endpointDescriptions = null;
            return;
        }

        this.endpointDescriptions = new java.util.ArrayList<CustomRoutingEndpointDescription>(endpointDescriptions);
    }

    /**
     * <p>
     * The endpoint objects added to the custom routing accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointDescriptions(java.util.Collection)} or {@link #withEndpointDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param endpointDescriptions
     *        The endpoint objects added to the custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomRoutingEndpointsResult withEndpointDescriptions(CustomRoutingEndpointDescription... endpointDescriptions) {
        if (this.endpointDescriptions == null) {
            setEndpointDescriptions(new java.util.ArrayList<CustomRoutingEndpointDescription>(endpointDescriptions.length));
        }
        for (CustomRoutingEndpointDescription ele : endpointDescriptions) {
            this.endpointDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The endpoint objects added to the custom routing accelerator.
     * </p>
     * 
     * @param endpointDescriptions
     *        The endpoint objects added to the custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomRoutingEndpointsResult withEndpointDescriptions(java.util.Collection<CustomRoutingEndpointDescription> endpointDescriptions) {
        setEndpointDescriptions(endpointDescriptions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomRoutingEndpointsResult withEndpointGroupArn(String endpointGroupArn) {
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
        if (getEndpointDescriptions() != null)
            sb.append("EndpointDescriptions: ").append(getEndpointDescriptions()).append(",");
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

        if (obj instanceof AddCustomRoutingEndpointsResult == false)
            return false;
        AddCustomRoutingEndpointsResult other = (AddCustomRoutingEndpointsResult) obj;
        if (other.getEndpointDescriptions() == null ^ this.getEndpointDescriptions() == null)
            return false;
        if (other.getEndpointDescriptions() != null && other.getEndpointDescriptions().equals(this.getEndpointDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getEndpointDescriptions() == null) ? 0 : getEndpointDescriptions().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public AddCustomRoutingEndpointsResult clone() {
        try {
            return (AddCustomRoutingEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
