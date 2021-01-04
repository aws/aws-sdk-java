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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveCustomRoutingEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveCustomRoutingEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud (VPC)
     * subnet IDs.
     * </p>
     */
    private java.util.List<String> endpointIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     * </p>
     */
    private String endpointGroupArn;

    /**
     * <p>
     * The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud (VPC)
     * subnet IDs.
     * </p>
     * 
     * @return The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud
     *         (VPC) subnet IDs.
     */

    public java.util.List<String> getEndpointIds() {
        return endpointIds;
    }

    /**
     * <p>
     * The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud (VPC)
     * subnet IDs.
     * </p>
     * 
     * @param endpointIds
     *        The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud
     *        (VPC) subnet IDs.
     */

    public void setEndpointIds(java.util.Collection<String> endpointIds) {
        if (endpointIds == null) {
            this.endpointIds = null;
            return;
        }

        this.endpointIds = new java.util.ArrayList<String>(endpointIds);
    }

    /**
     * <p>
     * The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud (VPC)
     * subnet IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointIds(java.util.Collection)} or {@link #withEndpointIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpointIds
     *        The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud
     *        (VPC) subnet IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveCustomRoutingEndpointsRequest withEndpointIds(String... endpointIds) {
        if (this.endpointIds == null) {
            setEndpointIds(new java.util.ArrayList<String>(endpointIds.length));
        }
        for (String ele : endpointIds) {
            this.endpointIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud (VPC)
     * subnet IDs.
     * </p>
     * 
     * @param endpointIds
     *        The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud
     *        (VPC) subnet IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveCustomRoutingEndpointsRequest withEndpointIds(java.util.Collection<String> endpointIds) {
        setEndpointIds(endpointIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveCustomRoutingEndpointsRequest withEndpointGroupArn(String endpointGroupArn) {
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
        if (getEndpointIds() != null)
            sb.append("EndpointIds: ").append(getEndpointIds()).append(",");
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

        if (obj instanceof RemoveCustomRoutingEndpointsRequest == false)
            return false;
        RemoveCustomRoutingEndpointsRequest other = (RemoveCustomRoutingEndpointsRequest) obj;
        if (other.getEndpointIds() == null ^ this.getEndpointIds() == null)
            return false;
        if (other.getEndpointIds() != null && other.getEndpointIds().equals(this.getEndpointIds()) == false)
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

        hashCode = prime * hashCode + ((getEndpointIds() == null) ? 0 : getEndpointIds().hashCode());
        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public RemoveCustomRoutingEndpointsRequest clone() {
        return (RemoveCustomRoutingEndpointsRequest) super.clone();
    }

}
