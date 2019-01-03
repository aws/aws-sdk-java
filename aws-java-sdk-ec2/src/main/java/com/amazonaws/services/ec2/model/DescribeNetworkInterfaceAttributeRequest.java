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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfaceAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeNetworkInterfaceAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNetworkInterfaceAttributeRequest> {

    /**
     * <p>
     * The attribute of the network interface. This parameter is required.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The attribute of the network interface. This parameter is required.
     * </p>
     * 
     * @param attribute
     *        The attribute of the network interface. This parameter is required.
     * @see NetworkInterfaceAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute of the network interface. This parameter is required.
     * </p>
     * 
     * @return The attribute of the network interface. This parameter is required.
     * @see NetworkInterfaceAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute of the network interface. This parameter is required.
     * </p>
     * 
     * @param attribute
     *        The attribute of the network interface. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceAttribute
     */

    public DescribeNetworkInterfaceAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute of the network interface. This parameter is required.
     * </p>
     * 
     * @param attribute
     *        The attribute of the network interface. This parameter is required.
     * @see NetworkInterfaceAttribute
     */

    public void setAttribute(NetworkInterfaceAttribute attribute) {
        withAttribute(attribute);
    }

    /**
     * <p>
     * The attribute of the network interface. This parameter is required.
     * </p>
     * 
     * @param attribute
     *        The attribute of the network interface. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceAttribute
     */

    public DescribeNetworkInterfaceAttributeRequest withAttribute(NetworkInterfaceAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfaceAttributeRequest> request = new DescribeNetworkInterfaceAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNetworkInterfaceAttributeRequest == false)
            return false;
        DescribeNetworkInterfaceAttributeRequest other = (DescribeNetworkInterfaceAttributeRequest) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInterfaceAttributeRequest clone() {
        return (DescribeNetworkInterfaceAttributeRequest) super.clone();
    }
}
