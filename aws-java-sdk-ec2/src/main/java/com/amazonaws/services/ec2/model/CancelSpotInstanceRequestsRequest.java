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
import com.amazonaws.services.ec2.model.transform.CancelSpotInstanceRequestsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelSpotInstanceRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CancelSpotInstanceRequestsRequest> {

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> spotInstanceRequestIds;

    /**
     * Default constructor for CancelSpotInstanceRequestsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CancelSpotInstanceRequestsRequest() {
    }

    /**
     * Constructs a new CancelSpotInstanceRequestsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     */
    public CancelSpotInstanceRequestsRequest(java.util.List<String> spotInstanceRequestIds) {
        setSpotInstanceRequestIds(spotInstanceRequestIds);
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * 
     * @return One or more Spot Instance request IDs.
     */

    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
            spotInstanceRequestIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return spotInstanceRequestIds;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     */

    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
            return;
        }

        this.spotInstanceRequestIds = new com.amazonaws.internal.SdkInternalList<String>(spotInstanceRequestIds);
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotInstanceRequestIds(java.util.Collection)} or
     * {@link #withSpotInstanceRequestIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        if (this.spotInstanceRequestIds == null) {
            setSpotInstanceRequestIds(new com.amazonaws.internal.SdkInternalList<String>(spotInstanceRequestIds.length));
        }
        for (String ele : spotInstanceRequestIds) {
            this.spotInstanceRequestIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        setSpotInstanceRequestIds(spotInstanceRequestIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelSpotInstanceRequestsRequest> getDryRunRequest() {
        Request<CancelSpotInstanceRequestsRequest> request = new CancelSpotInstanceRequestsRequestMarshaller().marshall(this);
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
        if (getSpotInstanceRequestIds() != null)
            sb.append("SpotInstanceRequestIds: ").append(getSpotInstanceRequestIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotInstanceRequestsRequest == false)
            return false;
        CancelSpotInstanceRequestsRequest other = (CancelSpotInstanceRequestsRequest) obj;
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null)
            return false;
        if (other.getSpotInstanceRequestIds() != null && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpotInstanceRequestIds() == null) ? 0 : getSpotInstanceRequestIds().hashCode());
        return hashCode;
    }

    @Override
    public CancelSpotInstanceRequestsRequest clone() {
        return (CancelSpotInstanceRequestsRequest) super.clone();
    }
}
