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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response parameters to the <code><a>DeleteVpcEndpoint</a></code> operation. Contains the summarized
 * detail of the VPC Endpoint being deleted.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     * <code>DELETE_FAILED</code>).
     * </p>
     */
    private VpcEndpointSummary vpcEndpointSummary;

    /**
     * <p>
     * Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     * <code>DELETE_FAILED</code>).
     * </p>
     * 
     * @param vpcEndpointSummary
     *        Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     *        <code>DELETE_FAILED</code>).
     */

    public void setVpcEndpointSummary(VpcEndpointSummary vpcEndpointSummary) {
        this.vpcEndpointSummary = vpcEndpointSummary;
    }

    /**
     * <p>
     * Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     * <code>DELETE_FAILED</code>).
     * </p>
     * 
     * @return Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     *         <code>DELETE_FAILED</code>).
     */

    public VpcEndpointSummary getVpcEndpointSummary() {
        return this.vpcEndpointSummary;
    }

    /**
     * <p>
     * Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     * <code>DELETE_FAILED</code>).
     * </p>
     * 
     * @param vpcEndpointSummary
     *        Information about the deleted endpoint, including its current status (<code>DELETING</code> or
     *        <code>DELETE_FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointResult withVpcEndpointSummary(VpcEndpointSummary vpcEndpointSummary) {
        setVpcEndpointSummary(vpcEndpointSummary);
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
        if (getVpcEndpointSummary() != null)
            sb.append("VpcEndpointSummary: ").append(getVpcEndpointSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcEndpointResult == false)
            return false;
        DeleteVpcEndpointResult other = (DeleteVpcEndpointResult) obj;
        if (other.getVpcEndpointSummary() == null ^ this.getVpcEndpointSummary() == null)
            return false;
        if (other.getVpcEndpointSummary() != null && other.getVpcEndpointSummary().equals(this.getVpcEndpointSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointSummary() == null) ? 0 : getVpcEndpointSummary().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcEndpointResult clone() {
        try {
            return (DeleteVpcEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
