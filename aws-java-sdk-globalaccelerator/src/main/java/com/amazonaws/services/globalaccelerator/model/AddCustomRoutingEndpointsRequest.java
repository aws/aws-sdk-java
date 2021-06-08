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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddCustomRoutingEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddCustomRoutingEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of endpoint objects to add to a custom routing accelerator.
     * </p>
     */
    private java.util.List<CustomRoutingEndpointConfiguration> endpointConfigurations;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
     * </p>
     */
    private String endpointGroupArn;

    /**
     * <p>
     * The list of endpoint objects to add to a custom routing accelerator.
     * </p>
     * 
     * @return The list of endpoint objects to add to a custom routing accelerator.
     */

    public java.util.List<CustomRoutingEndpointConfiguration> getEndpointConfigurations() {
        return endpointConfigurations;
    }

    /**
     * <p>
     * The list of endpoint objects to add to a custom routing accelerator.
     * </p>
     * 
     * @param endpointConfigurations
     *        The list of endpoint objects to add to a custom routing accelerator.
     */

    public void setEndpointConfigurations(java.util.Collection<CustomRoutingEndpointConfiguration> endpointConfigurations) {
        if (endpointConfigurations == null) {
            this.endpointConfigurations = null;
            return;
        }

        this.endpointConfigurations = new java.util.ArrayList<CustomRoutingEndpointConfiguration>(endpointConfigurations);
    }

    /**
     * <p>
     * The list of endpoint objects to add to a custom routing accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointConfigurations(java.util.Collection)} or
     * {@link #withEndpointConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param endpointConfigurations
     *        The list of endpoint objects to add to a custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomRoutingEndpointsRequest withEndpointConfigurations(CustomRoutingEndpointConfiguration... endpointConfigurations) {
        if (this.endpointConfigurations == null) {
            setEndpointConfigurations(new java.util.ArrayList<CustomRoutingEndpointConfiguration>(endpointConfigurations.length));
        }
        for (CustomRoutingEndpointConfiguration ele : endpointConfigurations) {
            this.endpointConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of endpoint objects to add to a custom routing accelerator.
     * </p>
     * 
     * @param endpointConfigurations
     *        The list of endpoint objects to add to a custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomRoutingEndpointsRequest withEndpointConfigurations(java.util.Collection<CustomRoutingEndpointConfiguration> endpointConfigurations) {
        setEndpointConfigurations(endpointConfigurations);
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

    public AddCustomRoutingEndpointsRequest withEndpointGroupArn(String endpointGroupArn) {
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
        if (getEndpointConfigurations() != null)
            sb.append("EndpointConfigurations: ").append(getEndpointConfigurations()).append(",");
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

        if (obj instanceof AddCustomRoutingEndpointsRequest == false)
            return false;
        AddCustomRoutingEndpointsRequest other = (AddCustomRoutingEndpointsRequest) obj;
        if (other.getEndpointConfigurations() == null ^ this.getEndpointConfigurations() == null)
            return false;
        if (other.getEndpointConfigurations() != null && other.getEndpointConfigurations().equals(this.getEndpointConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getEndpointConfigurations() == null) ? 0 : getEndpointConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public AddCustomRoutingEndpointsRequest clone() {
        return (AddCustomRoutingEndpointsRequest) super.clone();
    }

}
