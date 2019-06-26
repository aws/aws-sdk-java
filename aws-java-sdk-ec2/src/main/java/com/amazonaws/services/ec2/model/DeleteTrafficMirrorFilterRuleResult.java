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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrafficMirrorFilterRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     * 
     * @param trafficMirrorFilterRuleId
     *        The ID of the deleted Traffic Mirror rule.
     */

    public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     * 
     * @return The ID of the deleted Traffic Mirror rule.
     */

    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror rule.
     * </p>
     * 
     * @param trafficMirrorFilterRuleId
     *        The ID of the deleted Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrafficMirrorFilterRuleResult withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        setTrafficMirrorFilterRuleId(trafficMirrorFilterRuleId);
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

        if (obj instanceof DeleteTrafficMirrorFilterRuleResult == false)
            return false;
        DeleteTrafficMirrorFilterRuleResult other = (DeleteTrafficMirrorFilterRuleResult) obj;
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
    public DeleteTrafficMirrorFilterRuleResult clone() {
        try {
            return (DeleteTrafficMirrorFilterRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
