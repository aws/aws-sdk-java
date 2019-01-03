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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the DescribeEndpoint operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     * </p>
     * </li>
     * </ul>
     */
    private String endpointType;

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endpointType
     *        The endpoint type. Valid endpoint types include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     *        </p>
     *        </li>
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The endpoint type. Valid endpoint types include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     *         </p>
     *         </li>
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The endpoint type. Valid endpoint types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endpointType
     *        The endpoint type. Valid endpoint types include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:Data</code> - Returns a VeriSign signed data endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:Data-ATS</code> - Returns an ATS signed data endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:CredentialProvider</code> - Returns an AWS IoT credentials provider API endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iot:Jobs</code> - Returns an AWS IoT device management Jobs API endpoint.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
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
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointRequest == false)
            return false;
        DescribeEndpointRequest other = (DescribeEndpointRequest) obj;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointRequest clone() {
        return (DescribeEndpointRequest) super.clone();
    }

}
