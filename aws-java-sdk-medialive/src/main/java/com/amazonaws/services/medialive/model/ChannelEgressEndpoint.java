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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for ChannelEgressEndpoint
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ChannelEgressEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelEgressEndpoint implements Serializable, Cloneable, StructuredPojo {

    /** Public IP of where a channel's output comes from */
    private String sourceIp;

    /**
     * Public IP of where a channel's output comes from
     * 
     * @param sourceIp
     *        Public IP of where a channel's output comes from
     */

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * Public IP of where a channel's output comes from
     * 
     * @return Public IP of where a channel's output comes from
     */

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * Public IP of where a channel's output comes from
     * 
     * @param sourceIp
     *        Public IP of where a channel's output comes from
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelEgressEndpoint withSourceIp(String sourceIp) {
        setSourceIp(sourceIp);
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
        if (getSourceIp() != null)
            sb.append("SourceIp: ").append(getSourceIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelEgressEndpoint == false)
            return false;
        ChannelEgressEndpoint other = (ChannelEgressEndpoint) obj;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        return hashCode;
    }

    @Override
    public ChannelEgressEndpoint clone() {
        try {
            return (ChannelEgressEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ChannelEgressEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
