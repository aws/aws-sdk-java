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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrafficMirrorSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deleted Traffic Mirror session.
     * </p>
     */
    private String trafficMirrorSessionId;

    /**
     * <p>
     * The ID of the deleted Traffic Mirror session.
     * </p>
     * 
     * @param trafficMirrorSessionId
     *        The ID of the deleted Traffic Mirror session.
     */

    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror session.
     * </p>
     * 
     * @return The ID of the deleted Traffic Mirror session.
     */

    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID of the deleted Traffic Mirror session.
     * </p>
     * 
     * @param trafficMirrorSessionId
     *        The ID of the deleted Traffic Mirror session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrafficMirrorSessionResult withTrafficMirrorSessionId(String trafficMirrorSessionId) {
        setTrafficMirrorSessionId(trafficMirrorSessionId);
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
        if (getTrafficMirrorSessionId() != null)
            sb.append("TrafficMirrorSessionId: ").append(getTrafficMirrorSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficMirrorSessionResult == false)
            return false;
        DeleteTrafficMirrorSessionResult other = (DeleteTrafficMirrorSessionResult) obj;
        if (other.getTrafficMirrorSessionId() == null ^ this.getTrafficMirrorSessionId() == null)
            return false;
        if (other.getTrafficMirrorSessionId() != null && other.getTrafficMirrorSessionId().equals(this.getTrafficMirrorSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorSessionId() == null) ? 0 : getTrafficMirrorSessionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTrafficMirrorSessionResult clone() {
        try {
            return (DeleteTrafficMirrorSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
