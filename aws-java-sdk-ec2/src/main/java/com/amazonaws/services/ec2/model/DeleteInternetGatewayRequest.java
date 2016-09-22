/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteInternetGatewayRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteInternetGateway.
 * </p>
 */
public class DeleteInternetGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteInternetGatewayRequest> {

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     */
    private String internetGatewayId;

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     * 
     * @param internetGatewayId
     *        The ID of the Internet gateway.
     */

    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     * 
     * @return The ID of the Internet gateway.
     */

    public String getInternetGatewayId() {
        return this.internetGatewayId;
    }

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     * 
     * @param internetGatewayId
     *        The ID of the Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInternetGatewayRequest withInternetGatewayId(String internetGatewayId) {
        setInternetGatewayId(internetGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteInternetGatewayRequest> getDryRunRequest() {
        Request<DeleteInternetGatewayRequest> request = new DeleteInternetGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInternetGatewayId() != null)
            sb.append("InternetGatewayId: " + getInternetGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInternetGatewayRequest == false)
            return false;
        DeleteInternetGatewayRequest other = (DeleteInternetGatewayRequest) obj;
        if (other.getInternetGatewayId() == null ^ this.getInternetGatewayId() == null)
            return false;
        if (other.getInternetGatewayId() != null && other.getInternetGatewayId().equals(this.getInternetGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInternetGatewayId() == null) ? 0 : getInternetGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInternetGatewayRequest clone() {
        return (DeleteInternetGatewayRequest) super.clone();
    }
}
