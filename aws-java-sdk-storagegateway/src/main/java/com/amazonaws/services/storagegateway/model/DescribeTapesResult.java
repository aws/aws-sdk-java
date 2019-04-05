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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeTapesOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTapesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tape> tapes;
    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of
     * results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results to be retrieved.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     * 
     * @return An array of virtual tape descriptions.
     */

    public java.util.List<Tape> getTapes() {
        if (tapes == null) {
            tapes = new com.amazonaws.internal.SdkInternalList<Tape>();
        }
        return tapes;
    }

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     * 
     * @param tapes
     *        An array of virtual tape descriptions.
     */

    public void setTapes(java.util.Collection<Tape> tapes) {
        if (tapes == null) {
            this.tapes = null;
            return;
        }

        this.tapes = new com.amazonaws.internal.SdkInternalList<Tape>(tapes);
    }

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapes(java.util.Collection)} or {@link #withTapes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tapes
     *        An array of virtual tape descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesResult withTapes(Tape... tapes) {
        if (this.tapes == null) {
            setTapes(new com.amazonaws.internal.SdkInternalList<Tape>(tapes.length));
        }
        for (Tape ele : tapes) {
            this.tapes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of virtual tape descriptions.
     * </p>
     * 
     * @param tapes
     *        An array of virtual tape descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesResult withTapes(java.util.Collection<Tape> tapes) {
        setTapes(tapes);
        return this;
    }

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of
     * results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results to be retrieved.
     * </p>
     * 
     * @param marker
     *        An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of
     *        results.</p>
     *        <p>
     *        If a response does not contain a marker, then there are no more results to be retrieved.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of
     * results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results to be retrieved.
     * </p>
     * 
     * @return An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page
     *         of results.</p>
     *         <p>
     *         If a response does not contain a marker, then there are no more results to be retrieved.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of
     * results.
     * </p>
     * <p>
     * If a response does not contain a marker, then there are no more results to be retrieved.
     * </p>
     * 
     * @param marker
     *        An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of
     *        results.</p>
     *        <p>
     *        If a response does not contain a marker, then there are no more results to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTapesResult withMarker(String marker) {
        setMarker(marker);
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
        if (getTapes() != null)
            sb.append("Tapes: ").append(getTapes()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapesResult == false)
            return false;
        DescribeTapesResult other = (DescribeTapesResult) obj;
        if (other.getTapes() == null ^ this.getTapes() == null)
            return false;
        if (other.getTapes() != null && other.getTapes().equals(this.getTapes()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapes() == null) ? 0 : getTapes().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTapesResult clone() {
        try {
            return (DescribeTapesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
