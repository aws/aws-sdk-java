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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the DescribeEndpoint operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoint. The format of the endpoint is as follows: <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     * </p>
     */
    private String endpointAddress;

    /**
     * <p>
     * The endpoint. The format of the endpoint is as follows: <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     * </p>
     * 
     * @param endpointAddress
     *        The endpoint. The format of the endpoint is as follows: <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     */

    public void setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
    }

    /**
     * <p>
     * The endpoint. The format of the endpoint is as follows: <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     * </p>
     * 
     * @return The endpoint. The format of the endpoint is as follows:
     *         <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     */

    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    /**
     * <p>
     * The endpoint. The format of the endpoint is as follows: <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     * </p>
     * 
     * @param endpointAddress
     *        The endpoint. The format of the endpoint is as follows: <i>identifier</i>.iot.<i>region</i>.amazonaws.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEndpointAddress(String endpointAddress) {
        setEndpointAddress(endpointAddress);
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
        if (getEndpointAddress() != null)
            sb.append("EndpointAddress: ").append(getEndpointAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointResult == false)
            return false;
        DescribeEndpointResult other = (DescribeEndpointResult) obj;
        if (other.getEndpointAddress() == null ^ this.getEndpointAddress() == null)
            return false;
        if (other.getEndpointAddress() != null && other.getEndpointAddress().equals(this.getEndpointAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointAddress() == null) ? 0 : getEndpointAddress().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointResult clone() {
        try {
            return (DescribeEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
