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
import com.amazonaws.services.ec2.model.transform.DisassociateIpamResourceDiscoveryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateIpamResourceDiscoveryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisassociateIpamResourceDiscoveryRequest> {

    /**
     * <p>
     * A resource discovery association ID.
     * </p>
     */
    private String ipamResourceDiscoveryAssociationId;

    /**
     * <p>
     * A resource discovery association ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociationId
     *        A resource discovery association ID.
     */

    public void setIpamResourceDiscoveryAssociationId(String ipamResourceDiscoveryAssociationId) {
        this.ipamResourceDiscoveryAssociationId = ipamResourceDiscoveryAssociationId;
    }

    /**
     * <p>
     * A resource discovery association ID.
     * </p>
     * 
     * @return A resource discovery association ID.
     */

    public String getIpamResourceDiscoveryAssociationId() {
        return this.ipamResourceDiscoveryAssociationId;
    }

    /**
     * <p>
     * A resource discovery association ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociationId
     *        A resource discovery association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateIpamResourceDiscoveryRequest withIpamResourceDiscoveryAssociationId(String ipamResourceDiscoveryAssociationId) {
        setIpamResourceDiscoveryAssociationId(ipamResourceDiscoveryAssociationId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisassociateIpamResourceDiscoveryRequest> getDryRunRequest() {
        Request<DisassociateIpamResourceDiscoveryRequest> request = new DisassociateIpamResourceDiscoveryRequestMarshaller().marshall(this);
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
        if (getIpamResourceDiscoveryAssociationId() != null)
            sb.append("IpamResourceDiscoveryAssociationId: ").append(getIpamResourceDiscoveryAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateIpamResourceDiscoveryRequest == false)
            return false;
        DisassociateIpamResourceDiscoveryRequest other = (DisassociateIpamResourceDiscoveryRequest) obj;
        if (other.getIpamResourceDiscoveryAssociationId() == null ^ this.getIpamResourceDiscoveryAssociationId() == null)
            return false;
        if (other.getIpamResourceDiscoveryAssociationId() != null
                && other.getIpamResourceDiscoveryAssociationId().equals(this.getIpamResourceDiscoveryAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryAssociationId() == null) ? 0 : getIpamResourceDiscoveryAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateIpamResourceDiscoveryRequest clone() {
        return (DisassociateIpamResourceDiscoveryRequest) super.clone();
    }
}
