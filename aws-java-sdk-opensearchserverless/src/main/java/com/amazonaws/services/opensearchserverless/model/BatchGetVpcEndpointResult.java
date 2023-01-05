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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetVpcEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetVpcEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the specified VPC endpoint.
     * </p>
     */
    private java.util.List<VpcEndpointDetail> vpcEndpointDetails;
    /**
     * <p>
     * Error information for a failed request.
     * </p>
     */
    private java.util.List<VpcEndpointErrorDetail> vpcEndpointErrorDetails;

    /**
     * <p>
     * Details about the specified VPC endpoint.
     * </p>
     * 
     * @return Details about the specified VPC endpoint.
     */

    public java.util.List<VpcEndpointDetail> getVpcEndpointDetails() {
        return vpcEndpointDetails;
    }

    /**
     * <p>
     * Details about the specified VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointDetails
     *        Details about the specified VPC endpoint.
     */

    public void setVpcEndpointDetails(java.util.Collection<VpcEndpointDetail> vpcEndpointDetails) {
        if (vpcEndpointDetails == null) {
            this.vpcEndpointDetails = null;
            return;
        }

        this.vpcEndpointDetails = new java.util.ArrayList<VpcEndpointDetail>(vpcEndpointDetails);
    }

    /**
     * <p>
     * Details about the specified VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointDetails(java.util.Collection)} or {@link #withVpcEndpointDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcEndpointDetails
     *        Details about the specified VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVpcEndpointResult withVpcEndpointDetails(VpcEndpointDetail... vpcEndpointDetails) {
        if (this.vpcEndpointDetails == null) {
            setVpcEndpointDetails(new java.util.ArrayList<VpcEndpointDetail>(vpcEndpointDetails.length));
        }
        for (VpcEndpointDetail ele : vpcEndpointDetails) {
            this.vpcEndpointDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the specified VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointDetails
     *        Details about the specified VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVpcEndpointResult withVpcEndpointDetails(java.util.Collection<VpcEndpointDetail> vpcEndpointDetails) {
        setVpcEndpointDetails(vpcEndpointDetails);
        return this;
    }

    /**
     * <p>
     * Error information for a failed request.
     * </p>
     * 
     * @return Error information for a failed request.
     */

    public java.util.List<VpcEndpointErrorDetail> getVpcEndpointErrorDetails() {
        return vpcEndpointErrorDetails;
    }

    /**
     * <p>
     * Error information for a failed request.
     * </p>
     * 
     * @param vpcEndpointErrorDetails
     *        Error information for a failed request.
     */

    public void setVpcEndpointErrorDetails(java.util.Collection<VpcEndpointErrorDetail> vpcEndpointErrorDetails) {
        if (vpcEndpointErrorDetails == null) {
            this.vpcEndpointErrorDetails = null;
            return;
        }

        this.vpcEndpointErrorDetails = new java.util.ArrayList<VpcEndpointErrorDetail>(vpcEndpointErrorDetails);
    }

    /**
     * <p>
     * Error information for a failed request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointErrorDetails(java.util.Collection)} or
     * {@link #withVpcEndpointErrorDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcEndpointErrorDetails
     *        Error information for a failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVpcEndpointResult withVpcEndpointErrorDetails(VpcEndpointErrorDetail... vpcEndpointErrorDetails) {
        if (this.vpcEndpointErrorDetails == null) {
            setVpcEndpointErrorDetails(new java.util.ArrayList<VpcEndpointErrorDetail>(vpcEndpointErrorDetails.length));
        }
        for (VpcEndpointErrorDetail ele : vpcEndpointErrorDetails) {
            this.vpcEndpointErrorDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error information for a failed request.
     * </p>
     * 
     * @param vpcEndpointErrorDetails
     *        Error information for a failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVpcEndpointResult withVpcEndpointErrorDetails(java.util.Collection<VpcEndpointErrorDetail> vpcEndpointErrorDetails) {
        setVpcEndpointErrorDetails(vpcEndpointErrorDetails);
        return this;
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
        if (getVpcEndpointDetails() != null)
            sb.append("VpcEndpointDetails: ").append(getVpcEndpointDetails()).append(",");
        if (getVpcEndpointErrorDetails() != null)
            sb.append("VpcEndpointErrorDetails: ").append(getVpcEndpointErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetVpcEndpointResult == false)
            return false;
        BatchGetVpcEndpointResult other = (BatchGetVpcEndpointResult) obj;
        if (other.getVpcEndpointDetails() == null ^ this.getVpcEndpointDetails() == null)
            return false;
        if (other.getVpcEndpointDetails() != null && other.getVpcEndpointDetails().equals(this.getVpcEndpointDetails()) == false)
            return false;
        if (other.getVpcEndpointErrorDetails() == null ^ this.getVpcEndpointErrorDetails() == null)
            return false;
        if (other.getVpcEndpointErrorDetails() != null && other.getVpcEndpointErrorDetails().equals(this.getVpcEndpointErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointDetails() == null) ? 0 : getVpcEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointErrorDetails() == null) ? 0 : getVpcEndpointErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetVpcEndpointResult clone() {
        try {
            return (BatchGetVpcEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
