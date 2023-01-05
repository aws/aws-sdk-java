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
import com.amazonaws.services.ec2.model.transform.DeleteIpamPoolRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIpamPoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteIpamPoolRequest> {

    /**
     * <p>
     * The ID of the pool to delete.
     * </p>
     */
    private String ipamPoolId;

    /**
     * <p>
     * The ID of the pool to delete.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the pool to delete.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the pool to delete.
     * </p>
     * 
     * @return The ID of the pool to delete.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the pool to delete.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the pool to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIpamPoolRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteIpamPoolRequest> getDryRunRequest() {
        Request<DeleteIpamPoolRequest> request = new DeleteIpamPoolRequestMarshaller().marshall(this);
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
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIpamPoolRequest == false)
            return false;
        DeleteIpamPoolRequest other = (DeleteIpamPoolRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIpamPoolRequest clone() {
        return (DeleteIpamPoolRequest) super.clone();
    }
}
