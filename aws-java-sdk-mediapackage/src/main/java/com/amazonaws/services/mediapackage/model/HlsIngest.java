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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An HTTP Live Streaming (HLS) ingest resource configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/HlsIngest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsIngest implements Serializable, Cloneable, StructuredPojo {

    /** A list of endpoints to which the source stream should be sent. */
    private java.util.List<IngestEndpoint> ingestEndpoints;

    /**
     * A list of endpoints to which the source stream should be sent.
     * 
     * @return A list of endpoints to which the source stream should be sent.
     */

    public java.util.List<IngestEndpoint> getIngestEndpoints() {
        return ingestEndpoints;
    }

    /**
     * A list of endpoints to which the source stream should be sent.
     * 
     * @param ingestEndpoints
     *        A list of endpoints to which the source stream should be sent.
     */

    public void setIngestEndpoints(java.util.Collection<IngestEndpoint> ingestEndpoints) {
        if (ingestEndpoints == null) {
            this.ingestEndpoints = null;
            return;
        }

        this.ingestEndpoints = new java.util.ArrayList<IngestEndpoint>(ingestEndpoints);
    }

    /**
     * A list of endpoints to which the source stream should be sent.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngestEndpoints(java.util.Collection)} or {@link #withIngestEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ingestEndpoints
     *        A list of endpoints to which the source stream should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsIngest withIngestEndpoints(IngestEndpoint... ingestEndpoints) {
        if (this.ingestEndpoints == null) {
            setIngestEndpoints(new java.util.ArrayList<IngestEndpoint>(ingestEndpoints.length));
        }
        for (IngestEndpoint ele : ingestEndpoints) {
            this.ingestEndpoints.add(ele);
        }
        return this;
    }

    /**
     * A list of endpoints to which the source stream should be sent.
     * 
     * @param ingestEndpoints
     *        A list of endpoints to which the source stream should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsIngest withIngestEndpoints(java.util.Collection<IngestEndpoint> ingestEndpoints) {
        setIngestEndpoints(ingestEndpoints);
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
        if (getIngestEndpoints() != null)
            sb.append("IngestEndpoints: ").append(getIngestEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsIngest == false)
            return false;
        HlsIngest other = (HlsIngest) obj;
        if (other.getIngestEndpoints() == null ^ this.getIngestEndpoints() == null)
            return false;
        if (other.getIngestEndpoints() != null && other.getIngestEndpoints().equals(this.getIngestEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIngestEndpoints() == null) ? 0 : getIngestEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public HlsIngest clone() {
        try {
            return (HlsIngest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.HlsIngestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
