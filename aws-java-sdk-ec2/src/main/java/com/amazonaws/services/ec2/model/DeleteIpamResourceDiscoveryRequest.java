/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteIpamResourceDiscoveryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIpamResourceDiscoveryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteIpamResourceDiscoveryRequest> {

    /**
     * <p>
     * The IPAM resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;

    /**
     * <p>
     * The IPAM resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        The IPAM resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * The IPAM resource discovery ID.
     * </p>
     * 
     * @return The IPAM resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * The IPAM resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        The IPAM resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIpamResourceDiscoveryRequest withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteIpamResourceDiscoveryRequest> getDryRunRequest() {
        Request<DeleteIpamResourceDiscoveryRequest> request = new DeleteIpamResourceDiscoveryRequestMarshaller().marshall(this);
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
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIpamResourceDiscoveryRequest == false)
            return false;
        DeleteIpamResourceDiscoveryRequest other = (DeleteIpamResourceDiscoveryRequest) obj;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIpamResourceDiscoveryRequest clone() {
        return (DeleteIpamResourceDiscoveryRequest) super.clone();
    }
}
