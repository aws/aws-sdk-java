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
import com.amazonaws.services.ec2.model.transform.DeleteVpnConnectionRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteVpnConnection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpnConnectionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteVpnConnectionRequest> {

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     */
    private String vpnConnectionId;

    /**
     * Default constructor for DeleteVpnConnectionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteVpnConnectionRequest() {
    }

    /**
     * Constructs a new DeleteVpnConnectionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     */
    public DeleteVpnConnectionRequest(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @return The ID of the VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpnConnectionRequest withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteVpnConnectionRequest> getDryRunRequest() {
        Request<DeleteVpnConnectionRequest> request = new DeleteVpnConnectionRequestMarshaller().marshall(this);
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpnConnectionRequest == false)
            return false;
        DeleteVpnConnectionRequest other = (DeleteVpnConnectionRequest) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpnConnectionRequest clone() {
        return (DeleteVpnConnectionRequest) super.clone();
    }
}
