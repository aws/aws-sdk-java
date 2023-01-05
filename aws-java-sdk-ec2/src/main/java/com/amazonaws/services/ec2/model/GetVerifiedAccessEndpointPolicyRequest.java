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
import com.amazonaws.services.ec2.model.transform.GetVerifiedAccessEndpointPolicyRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVerifiedAccessEndpointPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetVerifiedAccessEndpointPolicyRequest> {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String verifiedAccessEndpointId;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     */

    public void setVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        this.verifiedAccessEndpointId = verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access endpoint.
     */

    public String getVerifiedAccessEndpointId() {
        return this.verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVerifiedAccessEndpointPolicyRequest withVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        setVerifiedAccessEndpointId(verifiedAccessEndpointId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetVerifiedAccessEndpointPolicyRequest> getDryRunRequest() {
        Request<GetVerifiedAccessEndpointPolicyRequest> request = new GetVerifiedAccessEndpointPolicyRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessEndpointId() != null)
            sb.append("VerifiedAccessEndpointId: ").append(getVerifiedAccessEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVerifiedAccessEndpointPolicyRequest == false)
            return false;
        GetVerifiedAccessEndpointPolicyRequest other = (GetVerifiedAccessEndpointPolicyRequest) obj;
        if (other.getVerifiedAccessEndpointId() == null ^ this.getVerifiedAccessEndpointId() == null)
            return false;
        if (other.getVerifiedAccessEndpointId() != null && other.getVerifiedAccessEndpointId().equals(this.getVerifiedAccessEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessEndpointId() == null) ? 0 : getVerifiedAccessEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public GetVerifiedAccessEndpointPolicyRequest clone() {
        return (GetVerifiedAccessEndpointPolicyRequest) super.clone();
    }
}
