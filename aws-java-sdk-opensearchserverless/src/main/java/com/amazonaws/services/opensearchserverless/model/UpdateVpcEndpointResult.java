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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the updated VPC endpoint.
     * </p>
     */
    private UpdateVpcEndpointDetail updateVpcEndpointDetail;

    /**
     * <p>
     * Details about the updated VPC endpoint.
     * </p>
     * 
     * @param updateVpcEndpointDetail
     *        Details about the updated VPC endpoint.
     */

    public void setUpdateVpcEndpointDetail(UpdateVpcEndpointDetail updateVpcEndpointDetail) {
        this.updateVpcEndpointDetail = updateVpcEndpointDetail;
    }

    /**
     * <p>
     * Details about the updated VPC endpoint.
     * </p>
     * 
     * @return Details about the updated VPC endpoint.
     */

    public UpdateVpcEndpointDetail getUpdateVpcEndpointDetail() {
        return this.updateVpcEndpointDetail;
    }

    /**
     * <p>
     * Details about the updated VPC endpoint.
     * </p>
     * 
     * @param updateVpcEndpointDetail
     *        Details about the updated VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointResult withUpdateVpcEndpointDetail(UpdateVpcEndpointDetail updateVpcEndpointDetail) {
        setUpdateVpcEndpointDetail(updateVpcEndpointDetail);
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
        if (getUpdateVpcEndpointDetail() != null)
            sb.append("UpdateVpcEndpointDetail: ").append(getUpdateVpcEndpointDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcEndpointResult == false)
            return false;
        UpdateVpcEndpointResult other = (UpdateVpcEndpointResult) obj;
        if (other.getUpdateVpcEndpointDetail() == null ^ this.getUpdateVpcEndpointDetail() == null)
            return false;
        if (other.getUpdateVpcEndpointDetail() != null && other.getUpdateVpcEndpointDetail().equals(this.getUpdateVpcEndpointDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateVpcEndpointDetail() == null) ? 0 : getUpdateVpcEndpointDetail().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcEndpointResult clone() {
        try {
            return (UpdateVpcEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
