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
import com.amazonaws.services.ec2.model.transform.ReleaseHostsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ReleaseHostsRequest> {

    /**
     * <p>
     * The IDs of the Dedicated Hosts to release.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIds;

    /**
     * <p>
     * The IDs of the Dedicated Hosts to release.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts to release.
     */

    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
            hostIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIds;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to release.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts to release.
     */

    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }

        this.hostIds = new com.amazonaws.internal.SdkInternalList<String>(hostIds);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to release.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIds(java.util.Collection)} or {@link #withHostIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts to release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseHostsRequest withHostIds(String... hostIds) {
        if (this.hostIds == null) {
            setHostIds(new com.amazonaws.internal.SdkInternalList<String>(hostIds.length));
        }
        for (String ele : hostIds) {
            this.hostIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts to release.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts to release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReleaseHostsRequest> getDryRunRequest() {
        Request<ReleaseHostsRequest> request = new ReleaseHostsRequestMarshaller().marshall(this);
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
        if (getHostIds() != null)
            sb.append("HostIds: ").append(getHostIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseHostsRequest == false)
            return false;
        ReleaseHostsRequest other = (ReleaseHostsRequest) obj;
        if (other.getHostIds() == null ^ this.getHostIds() == null)
            return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseHostsRequest clone() {
        return (ReleaseHostsRequest) super.clone();
    }
}
