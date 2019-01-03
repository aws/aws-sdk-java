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
import com.amazonaws.services.ec2.model.transform.DetachClassicLinkVpcRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachClassicLinkVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DetachClassicLinkVpcRequest> {

    /**
     * <p>
     * The ID of the instance to unlink from the VPC.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of the VPC to which the instance is linked.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the instance to unlink from the VPC.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to unlink from the VPC.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to unlink from the VPC.
     * </p>
     * 
     * @return The ID of the instance to unlink from the VPC.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance to unlink from the VPC.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to unlink from the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachClassicLinkVpcRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to which the instance is linked.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to which the instance is linked.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the instance is linked.
     * </p>
     * 
     * @return The ID of the VPC to which the instance is linked.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the instance is linked.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to which the instance is linked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachClassicLinkVpcRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DetachClassicLinkVpcRequest> getDryRunRequest() {
        Request<DetachClassicLinkVpcRequest> request = new DetachClassicLinkVpcRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachClassicLinkVpcRequest == false)
            return false;
        DetachClassicLinkVpcRequest other = (DetachClassicLinkVpcRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public DetachClassicLinkVpcRequest clone() {
        return (DetachClassicLinkVpcRequest) super.clone();
    }
}
