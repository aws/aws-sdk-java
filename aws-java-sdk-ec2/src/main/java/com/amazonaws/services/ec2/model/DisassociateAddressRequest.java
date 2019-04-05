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
import com.amazonaws.services.ec2.model.transform.DisassociateAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DisassociateAddressRequest> {

    /**
     * <p>
     * [EC2-VPC] The association ID. Required for EC2-VPC.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     */
    private String publicIp;

    /**
     * Default constructor for DisassociateAddressRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DisassociateAddressRequest() {
    }

    /**
     * Constructs a new DisassociateAddressRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param publicIp
     *        [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     */
    public DisassociateAddressRequest(String publicIp) {
        setPublicIp(publicIp);
    }

    /**
     * <p>
     * [EC2-VPC] The association ID. Required for EC2-VPC.
     * </p>
     * 
     * @param associationId
     *        [EC2-VPC] The association ID. Required for EC2-VPC.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * [EC2-VPC] The association ID. Required for EC2-VPC.
     * </p>
     * 
     * @return [EC2-VPC] The association ID. Required for EC2-VPC.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * [EC2-VPC] The association ID. Required for EC2-VPC.
     * </p>
     * 
     * @param associationId
     *        [EC2-VPC] The association ID. Required for EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAddressRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * 
     * @param publicIp
     *        [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * 
     * @return [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * 
     * @param publicIp
     *        [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAddressRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisassociateAddressRequest> getDryRunRequest() {
        Request<DisassociateAddressRequest> request = new DisassociateAddressRequestMarshaller().marshall(this);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateAddressRequest == false)
            return false;
        DisassociateAddressRequest other = (DisassociateAddressRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateAddressRequest clone() {
        return (DisassociateAddressRequest) super.clone();
    }
}
