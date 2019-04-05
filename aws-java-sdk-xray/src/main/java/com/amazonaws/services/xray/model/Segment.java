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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A segment from a trace that has been ingested by the X-Ray service. The segment can be compiled from documents
 * uploaded with <a>PutTraceSegments</a>, or an <code>inferred</code> segment for a downstream service, generated from a
 * subsegment sent by the service that called it.
 * </p>
 * <p>
 * For the full segment document schema, see <a
 * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">AWS X-Ray Segment
 * Documents</a> in the <i>AWS X-Ray Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Segment" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Segment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The segment's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The segment document.
     * </p>
     */
    private String document;

    /**
     * <p>
     * The segment's ID.
     * </p>
     * 
     * @param id
     *        The segment's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The segment's ID.
     * </p>
     * 
     * @return The segment's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The segment's ID.
     * </p>
     * 
     * @param id
     *        The segment's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The segment document.
     * </p>
     * 
     * @param document
     *        The segment document.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The segment document.
     * </p>
     * 
     * @return The segment document.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The segment document.
     * </p>
     * 
     * @param document
     *        The segment document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withDocument(String document) {
        setDocument(document);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Segment == false)
            return false;
        Segment other = (Segment) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public Segment clone() {
        try {
            return (Segment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.SegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
