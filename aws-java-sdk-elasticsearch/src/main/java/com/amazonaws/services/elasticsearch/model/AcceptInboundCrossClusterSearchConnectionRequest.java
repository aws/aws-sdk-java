/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>AcceptInboundCrossClusterSearchConnection</a></code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptInboundCrossClusterSearchConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the inbound connection that you want to accept.
     * </p>
     */
    private String crossClusterSearchConnectionId;

    /**
     * <p>
     * The id of the inbound connection that you want to accept.
     * </p>
     * 
     * @param crossClusterSearchConnectionId
     *        The id of the inbound connection that you want to accept.
     */

    public void setCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * The id of the inbound connection that you want to accept.
     * </p>
     * 
     * @return The id of the inbound connection that you want to accept.
     */

    public String getCrossClusterSearchConnectionId() {
        return this.crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * The id of the inbound connection that you want to accept.
     * </p>
     * 
     * @param crossClusterSearchConnectionId
     *        The id of the inbound connection that you want to accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInboundCrossClusterSearchConnectionRequest withCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        setCrossClusterSearchConnectionId(crossClusterSearchConnectionId);
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
        if (getCrossClusterSearchConnectionId() != null)
            sb.append("CrossClusterSearchConnectionId: ").append(getCrossClusterSearchConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInboundCrossClusterSearchConnectionRequest == false)
            return false;
        AcceptInboundCrossClusterSearchConnectionRequest other = (AcceptInboundCrossClusterSearchConnectionRequest) obj;
        if (other.getCrossClusterSearchConnectionId() == null ^ this.getCrossClusterSearchConnectionId() == null)
            return false;
        if (other.getCrossClusterSearchConnectionId() != null
                && other.getCrossClusterSearchConnectionId().equals(this.getCrossClusterSearchConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrossClusterSearchConnectionId() == null) ? 0 : getCrossClusterSearchConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptInboundCrossClusterSearchConnectionRequest clone() {
        return (AcceptInboundCrossClusterSearchConnectionRequest) super.clone();
    }

}
