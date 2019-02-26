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
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTapesOutput$Marker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTapesOutput$VolumeInfos</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTapes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTapesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<TapeInfo> tapeInfos;
    /**
     * <p>
     * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your
     * next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in
     * the response body.
     * </p>
     */
    private String marker;

    /**
     * @return
     */

    public java.util.List<TapeInfo> getTapeInfos() {
        if (tapeInfos == null) {
            tapeInfos = new com.amazonaws.internal.SdkInternalList<TapeInfo>();
        }
        return tapeInfos;
    }

    /**
     * @param tapeInfos
     */

    public void setTapeInfos(java.util.Collection<TapeInfo> tapeInfos) {
        if (tapeInfos == null) {
            this.tapeInfos = null;
            return;
        }

        this.tapeInfos = new com.amazonaws.internal.SdkInternalList<TapeInfo>(tapeInfos);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTapeInfos(java.util.Collection)} or {@link #withTapeInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tapeInfos
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapesResult withTapeInfos(TapeInfo... tapeInfos) {
        if (this.tapeInfos == null) {
            setTapeInfos(new com.amazonaws.internal.SdkInternalList<TapeInfo>(tapeInfos.length));
        }
        for (TapeInfo ele : tapeInfos) {
            this.tapeInfos.add(ele);
        }
        return this;
    }

    /**
     * @param tapeInfos
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapesResult withTapeInfos(java.util.Collection<TapeInfo> tapeInfos) {
        setTapeInfos(tapeInfos);
        return this;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your
     * next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in
     * the response body.
     * </p>
     * 
     * @param marker
     *        A string that indicates the position at which to begin returning the next list of tapes. Use the marker in
     *        your next request to continue pagination of tapes. If there are no more tapes to list, this element does
     *        not appear in the response body.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your
     * next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in
     * the response body.
     * </p>
     * 
     * @return A string that indicates the position at which to begin returning the next list of tapes. Use the marker
     *         in your next request to continue pagination of tapes. If there are no more tapes to list, this element
     *         does not appear in the response body.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your
     * next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in
     * the response body.
     * </p>
     * 
     * @param marker
     *        A string that indicates the position at which to begin returning the next list of tapes. Use the marker in
     *        your next request to continue pagination of tapes. If there are no more tapes to list, this element does
     *        not appear in the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapesResult withMarker(String marker) {
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
        if (getTapeInfos() != null)
            sb.append("TapeInfos: ").append(getTapeInfos()).append(",");
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

        if (obj instanceof ListTapesResult == false)
            return false;
        ListTapesResult other = (ListTapesResult) obj;
        if (other.getTapeInfos() == null ^ this.getTapeInfos() == null)
            return false;
        if (other.getTapeInfos() != null && other.getTapeInfos().equals(this.getTapeInfos()) == false)
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

        hashCode = prime * hashCode + ((getTapeInfos() == null) ? 0 : getTapeInfos().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListTapesResult clone() {
        try {
            return (ListTapesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
