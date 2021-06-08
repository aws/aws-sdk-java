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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTapePools" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTapePoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there are no
     * custom tape pools, the <code>PoolInfos</code> is an empty array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PoolInfo> poolInfos;
    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools. Use the marker in your
     * next request to continue pagination of tape pools. If there are no more tape pools to list, this element does not
     * appear in the response body.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there are no
     * custom tape pools, the <code>PoolInfos</code> is an empty array.
     * </p>
     * 
     * @return An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If
     *         there are no custom tape pools, the <code>PoolInfos</code> is an empty array.
     */

    public java.util.List<PoolInfo> getPoolInfos() {
        if (poolInfos == null) {
            poolInfos = new com.amazonaws.internal.SdkInternalList<PoolInfo>();
        }
        return poolInfos;
    }

    /**
     * <p>
     * An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there are no
     * custom tape pools, the <code>PoolInfos</code> is an empty array.
     * </p>
     * 
     * @param poolInfos
     *        An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there
     *        are no custom tape pools, the <code>PoolInfos</code> is an empty array.
     */

    public void setPoolInfos(java.util.Collection<PoolInfo> poolInfos) {
        if (poolInfos == null) {
            this.poolInfos = null;
            return;
        }

        this.poolInfos = new com.amazonaws.internal.SdkInternalList<PoolInfo>(poolInfos);
    }

    /**
     * <p>
     * An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there are no
     * custom tape pools, the <code>PoolInfos</code> is an empty array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoolInfos(java.util.Collection)} or {@link #withPoolInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param poolInfos
     *        An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there
     *        are no custom tape pools, the <code>PoolInfos</code> is an empty array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsResult withPoolInfos(PoolInfo... poolInfos) {
        if (this.poolInfos == null) {
            setPoolInfos(new com.amazonaws.internal.SdkInternalList<PoolInfo>(poolInfos.length));
        }
        for (PoolInfo ele : poolInfos) {
            this.poolInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there are no
     * custom tape pools, the <code>PoolInfos</code> is an empty array.
     * </p>
     * 
     * @param poolInfos
     *        An array of <code>PoolInfo</code> objects, where each object describes a single custom tape pool. If there
     *        are no custom tape pools, the <code>PoolInfos</code> is an empty array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsResult withPoolInfos(java.util.Collection<PoolInfo> poolInfos) {
        setPoolInfos(poolInfos);
        return this;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools. Use the marker in your
     * next request to continue pagination of tape pools. If there are no more tape pools to list, this element does not
     * appear in the response body.
     * </p>
     * 
     * @param marker
     *        A string that indicates the position at which to begin the returned list of tape pools. Use the marker in
     *        your next request to continue pagination of tape pools. If there are no more tape pools to list, this
     *        element does not appear in the response body.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools. Use the marker in your
     * next request to continue pagination of tape pools. If there are no more tape pools to list, this element does not
     * appear in the response body.
     * </p>
     * 
     * @return A string that indicates the position at which to begin the returned list of tape pools. Use the marker in
     *         your next request to continue pagination of tape pools. If there are no more tape pools to list, this
     *         element does not appear in the response body.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools. Use the marker in your
     * next request to continue pagination of tape pools. If there are no more tape pools to list, this element does not
     * appear in the response body.
     * </p>
     * 
     * @param marker
     *        A string that indicates the position at which to begin the returned list of tape pools. Use the marker in
     *        your next request to continue pagination of tape pools. If there are no more tape pools to list, this
     *        element does not appear in the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsResult withMarker(String marker) {
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
        if (getPoolInfos() != null)
            sb.append("PoolInfos: ").append(getPoolInfos()).append(",");
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

        if (obj instanceof ListTapePoolsResult == false)
            return false;
        ListTapePoolsResult other = (ListTapePoolsResult) obj;
        if (other.getPoolInfos() == null ^ this.getPoolInfos() == null)
            return false;
        if (other.getPoolInfos() != null && other.getPoolInfos().equals(this.getPoolInfos()) == false)
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

        hashCode = prime * hashCode + ((getPoolInfos() == null) ? 0 : getPoolInfos().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListTapePoolsResult clone() {
        try {
            return (ListTapePoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
