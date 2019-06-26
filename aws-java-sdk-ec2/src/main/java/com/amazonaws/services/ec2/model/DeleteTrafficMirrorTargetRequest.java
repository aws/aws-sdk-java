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
import com.amazonaws.services.ec2.model.transform.DeleteTrafficMirrorTargetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrafficMirrorTargetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteTrafficMirrorTargetRequest> {

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     */
    private String trafficMirrorTargetId;

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The ID of the Traffic Mirror target.
     */

    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @return The ID of the Traffic Mirror target.
     */

    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * 
     * @param trafficMirrorTargetId
     *        The ID of the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrafficMirrorTargetRequest withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        setTrafficMirrorTargetId(trafficMirrorTargetId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteTrafficMirrorTargetRequest> getDryRunRequest() {
        Request<DeleteTrafficMirrorTargetRequest> request = new DeleteTrafficMirrorTargetRequestMarshaller().marshall(this);
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
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: ").append(getTrafficMirrorTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficMirrorTargetRequest == false)
            return false;
        DeleteTrafficMirrorTargetRequest other = (DeleteTrafficMirrorTargetRequest) obj;
        if (other.getTrafficMirrorTargetId() == null ^ this.getTrafficMirrorTargetId() == null)
            return false;
        if (other.getTrafficMirrorTargetId() != null && other.getTrafficMirrorTargetId().equals(this.getTrafficMirrorTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTrafficMirrorTargetRequest clone() {
        return (DeleteTrafficMirrorTargetRequest) super.clone();
    }
}
