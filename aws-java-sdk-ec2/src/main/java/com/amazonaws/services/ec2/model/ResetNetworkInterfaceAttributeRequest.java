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
import com.amazonaws.services.ec2.model.transform.ResetNetworkInterfaceAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ResetNetworkInterfaceAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ResetNetworkInterfaceAttributeRequest> {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The source/destination checking attribute. Resets the value to <code>true</code>.
     * </p>
     */
    private String sourceDestCheck;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The source/destination checking attribute. Resets the value to <code>true</code>.
     * </p>
     * 
     * @param sourceDestCheck
     *        The source/destination checking attribute. Resets the value to <code>true</code>.
     */

    public void setSourceDestCheck(String sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * The source/destination checking attribute. Resets the value to <code>true</code>.
     * </p>
     * 
     * @return The source/destination checking attribute. Resets the value to <code>true</code>.
     */

    public String getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * The source/destination checking attribute. Resets the value to <code>true</code>.
     * </p>
     * 
     * @param sourceDestCheck
     *        The source/destination checking attribute. Resets the value to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetNetworkInterfaceAttributeRequest withSourceDestCheck(String sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ResetNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<ResetNetworkInterfaceAttributeRequest> request = new ResetNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: ").append(getSourceDestCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetNetworkInterfaceAttributeRequest == false)
            return false;
        ResetNetworkInterfaceAttributeRequest other = (ResetNetworkInterfaceAttributeRequest) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        return hashCode;
    }

    @Override
    public ResetNetworkInterfaceAttributeRequest clone() {
        return (ResetNetworkInterfaceAttributeRequest) super.clone();
    }
}
