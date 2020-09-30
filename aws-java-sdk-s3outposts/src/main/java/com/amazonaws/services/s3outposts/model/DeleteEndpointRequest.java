/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/DeleteEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the end point.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     */
    private String outpostId;

    /**
     * <p>
     * The ID of the end point.
     * </p>
     * 
     * @param endpointId
     *        The ID of the end point.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The ID of the end point.
     * </p>
     * 
     * @return The ID of the end point.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The ID of the end point.
     * </p>
     * 
     * @param endpointId
     *        The ID of the end point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEndpointRequest withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the AWS Outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @return The ID of the AWS Outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the AWS Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEndpointRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
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
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEndpointRequest == false)
            return false;
        DeleteEndpointRequest other = (DeleteEndpointRequest) obj;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEndpointRequest clone() {
        return (DeleteEndpointRequest) super.clone();
    }

}
