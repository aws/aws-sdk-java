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
import com.amazonaws.services.ec2.model.transform.DeleteIpamScopeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIpamScopeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteIpamScopeRequest> {

    /**
     * <p>
     * The ID of the scope to delete.
     * </p>
     */
    private String ipamScopeId;

    /**
     * <p>
     * The ID of the scope to delete.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope to delete.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope to delete.
     * </p>
     * 
     * @return The ID of the scope to delete.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope to delete.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIpamScopeRequest withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteIpamScopeRequest> getDryRunRequest() {
        Request<DeleteIpamScopeRequest> request = new DeleteIpamScopeRequestMarshaller().marshall(this);
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
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIpamScopeRequest == false)
            return false;
        DeleteIpamScopeRequest other = (DeleteIpamScopeRequest) obj;
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIpamScopeRequest clone() {
        return (DeleteIpamScopeRequest) super.clone();
    }
}
