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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the ListOutgoingCertificates operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutgoingCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     */
    private java.util.List<OutgoingCertificate> outgoingCertificates;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     * 
     * @return The certificates that are being transferred but not yet accepted.
     */

    public java.util.List<OutgoingCertificate> getOutgoingCertificates() {
        return outgoingCertificates;
    }

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     * 
     * @param outgoingCertificates
     *        The certificates that are being transferred but not yet accepted.
     */

    public void setOutgoingCertificates(java.util.Collection<OutgoingCertificate> outgoingCertificates) {
        if (outgoingCertificates == null) {
            this.outgoingCertificates = null;
            return;
        }

        this.outgoingCertificates = new java.util.ArrayList<OutgoingCertificate>(outgoingCertificates);
    }

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutgoingCertificates(java.util.Collection)} or {@link #withOutgoingCertificates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param outgoingCertificates
     *        The certificates that are being transferred but not yet accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingCertificatesResult withOutgoingCertificates(OutgoingCertificate... outgoingCertificates) {
        if (this.outgoingCertificates == null) {
            setOutgoingCertificates(new java.util.ArrayList<OutgoingCertificate>(outgoingCertificates.length));
        }
        for (OutgoingCertificate ele : outgoingCertificates) {
            this.outgoingCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The certificates that are being transferred but not yet accepted.
     * </p>
     * 
     * @param outgoingCertificates
     *        The certificates that are being transferred but not yet accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingCertificatesResult withOutgoingCertificates(java.util.Collection<OutgoingCertificate> outgoingCertificates) {
        setOutgoingCertificates(outgoingCertificates);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        The marker for the next set of results.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingCertificatesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getOutgoingCertificates() != null)
            sb.append("OutgoingCertificates: ").append(getOutgoingCertificates()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOutgoingCertificatesResult == false)
            return false;
        ListOutgoingCertificatesResult other = (ListOutgoingCertificatesResult) obj;
        if (other.getOutgoingCertificates() == null ^ this.getOutgoingCertificates() == null)
            return false;
        if (other.getOutgoingCertificates() != null && other.getOutgoingCertificates().equals(this.getOutgoingCertificates()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutgoingCertificates() == null) ? 0 : getOutgoingCertificates().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListOutgoingCertificatesResult clone() {
        try {
            return (ListOutgoingCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
