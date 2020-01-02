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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for DeleteMultiplexRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMultiplexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the multiplex. */
    private String multiplexId;

    /**
     * The ID of the multiplex.
     * 
     * @param multiplexId
     *        The ID of the multiplex.
     */

    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * The ID of the multiplex.
     * 
     * @return The ID of the multiplex.
     */

    public String getMultiplexId() {
        return this.multiplexId;
    }

    /**
     * The ID of the multiplex.
     * 
     * @param multiplexId
     *        The ID of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMultiplexRequest withMultiplexId(String multiplexId) {
        setMultiplexId(multiplexId);
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
        if (getMultiplexId() != null)
            sb.append("MultiplexId: ").append(getMultiplexId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMultiplexRequest == false)
            return false;
        DeleteMultiplexRequest other = (DeleteMultiplexRequest) obj;
        if (other.getMultiplexId() == null ^ this.getMultiplexId() == null)
            return false;
        if (other.getMultiplexId() != null && other.getMultiplexId().equals(this.getMultiplexId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiplexId() == null) ? 0 : getMultiplexId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMultiplexRequest clone() {
        return (DeleteMultiplexRequest) super.clone();
    }

}
