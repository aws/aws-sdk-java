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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTraceSegmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string containing a JSON document defining one or more segments or subsegments.
     * </p>
     */
    private java.util.List<String> traceSegmentDocuments;

    /**
     * <p>
     * A string containing a JSON document defining one or more segments or subsegments.
     * </p>
     * 
     * @return A string containing a JSON document defining one or more segments or subsegments.
     */

    public java.util.List<String> getTraceSegmentDocuments() {
        return traceSegmentDocuments;
    }

    /**
     * <p>
     * A string containing a JSON document defining one or more segments or subsegments.
     * </p>
     * 
     * @param traceSegmentDocuments
     *        A string containing a JSON document defining one or more segments or subsegments.
     */

    public void setTraceSegmentDocuments(java.util.Collection<String> traceSegmentDocuments) {
        if (traceSegmentDocuments == null) {
            this.traceSegmentDocuments = null;
            return;
        }

        this.traceSegmentDocuments = new java.util.ArrayList<String>(traceSegmentDocuments);
    }

    /**
     * <p>
     * A string containing a JSON document defining one or more segments or subsegments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraceSegmentDocuments(java.util.Collection)} or
     * {@link #withTraceSegmentDocuments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param traceSegmentDocuments
     *        A string containing a JSON document defining one or more segments or subsegments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTraceSegmentsRequest withTraceSegmentDocuments(String... traceSegmentDocuments) {
        if (this.traceSegmentDocuments == null) {
            setTraceSegmentDocuments(new java.util.ArrayList<String>(traceSegmentDocuments.length));
        }
        for (String ele : traceSegmentDocuments) {
            this.traceSegmentDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string containing a JSON document defining one or more segments or subsegments.
     * </p>
     * 
     * @param traceSegmentDocuments
     *        A string containing a JSON document defining one or more segments or subsegments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTraceSegmentsRequest withTraceSegmentDocuments(java.util.Collection<String> traceSegmentDocuments) {
        setTraceSegmentDocuments(traceSegmentDocuments);
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
        if (getTraceSegmentDocuments() != null)
            sb.append("TraceSegmentDocuments: ").append(getTraceSegmentDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTraceSegmentsRequest == false)
            return false;
        PutTraceSegmentsRequest other = (PutTraceSegmentsRequest) obj;
        if (other.getTraceSegmentDocuments() == null ^ this.getTraceSegmentDocuments() == null)
            return false;
        if (other.getTraceSegmentDocuments() != null && other.getTraceSegmentDocuments().equals(this.getTraceSegmentDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTraceSegmentDocuments() == null) ? 0 : getTraceSegmentDocuments().hashCode());
        return hashCode;
    }

    @Override
    public PutTraceSegmentsRequest clone() {
        return (PutTraceSegmentsRequest) super.clone();
    }

}
