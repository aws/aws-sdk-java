/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteTrafficMirrorFilterRuleRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrafficMirrorFilterRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteTrafficMirrorFilterRuleRequest> {

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficMirrorFilterRuleId
     *        The ID of the Traffic Mirror rule.
     */

    public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * 
     * @return The ID of the Traffic Mirror rule.
     */

    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficMirrorFilterRuleId
     *        The ID of the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrafficMirrorFilterRuleRequest withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        setTrafficMirrorFilterRuleId(trafficMirrorFilterRuleId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteTrafficMirrorFilterRuleRequest> getDryRunRequest() {
        Request<DeleteTrafficMirrorFilterRuleRequest> request = new DeleteTrafficMirrorFilterRuleRequestMarshaller().marshall(this);
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
        if (getTrafficMirrorFilterRuleId() != null)
            sb.append("TrafficMirrorFilterRuleId: ").append(getTrafficMirrorFilterRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficMirrorFilterRuleRequest == false)
            return false;
        DeleteTrafficMirrorFilterRuleRequest other = (DeleteTrafficMirrorFilterRuleRequest) obj;
        if (other.getTrafficMirrorFilterRuleId() == null ^ this.getTrafficMirrorFilterRuleId() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleId() != null && other.getTrafficMirrorFilterRuleId().equals(this.getTrafficMirrorFilterRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilterRuleId() == null) ? 0 : getTrafficMirrorFilterRuleId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTrafficMirrorFilterRuleRequest clone() {
        return (DeleteTrafficMirrorFilterRuleRequest) super.clone();
    }
}
