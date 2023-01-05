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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeletePublicIpv4PoolRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePublicIpv4PoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeletePublicIpv4PoolRequest> {

    /**
     * <p>
     * The ID of the public IPv4 pool you want to delete.
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The ID of the public IPv4 pool you want to delete.
     * </p>
     * 
     * @param poolId
     *        The ID of the public IPv4 pool you want to delete.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool you want to delete.
     * </p>
     * 
     * @return The ID of the public IPv4 pool you want to delete.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool you want to delete.
     * </p>
     * 
     * @param poolId
     *        The ID of the public IPv4 pool you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePublicIpv4PoolRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeletePublicIpv4PoolRequest> getDryRunRequest() {
        Request<DeletePublicIpv4PoolRequest> request = new DeletePublicIpv4PoolRequestMarshaller().marshall(this);
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePublicIpv4PoolRequest == false)
            return false;
        DeletePublicIpv4PoolRequest other = (DeletePublicIpv4PoolRequest) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePublicIpv4PoolRequest clone() {
        return (DeletePublicIpv4PoolRequest) super.clone();
    }
}
