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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTapePools" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTapePoolsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom
     * tape pool ARN, the response lists all custom tape pools.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> poolARNs;
    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * An optional number limit for the tape pools in the list returned by this call.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom
     * tape pool ARN, the response lists all custom tape pools.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a
     *         custom tape pool ARN, the response lists all custom tape pools.
     */

    public java.util.List<String> getPoolARNs() {
        if (poolARNs == null) {
            poolARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return poolARNs;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom
     * tape pool ARN, the response lists all custom tape pools.
     * </p>
     * 
     * @param poolARNs
     *        The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a
     *        custom tape pool ARN, the response lists all custom tape pools.
     */

    public void setPoolARNs(java.util.Collection<String> poolARNs) {
        if (poolARNs == null) {
            this.poolARNs = null;
            return;
        }

        this.poolARNs = new com.amazonaws.internal.SdkInternalList<String>(poolARNs);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom
     * tape pool ARN, the response lists all custom tape pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoolARNs(java.util.Collection)} or {@link #withPoolARNs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param poolARNs
     *        The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a
     *        custom tape pool ARN, the response lists all custom tape pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsRequest withPoolARNs(String... poolARNs) {
        if (this.poolARNs == null) {
            setPoolARNs(new com.amazonaws.internal.SdkInternalList<String>(poolARNs.length));
        }
        for (String ele : poolARNs) {
            this.poolARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom
     * tape pool ARN, the response lists all custom tape pools.
     * </p>
     * 
     * @param poolARNs
     *        The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a
     *        custom tape pool ARN, the response lists all custom tape pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsRequest withPoolARNs(java.util.Collection<String> poolARNs) {
        setPoolARNs(poolARNs);
        return this;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools.
     * </p>
     * 
     * @param marker
     *        A string that indicates the position at which to begin the returned list of tape pools.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools.
     * </p>
     * 
     * @return A string that indicates the position at which to begin the returned list of tape pools.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list of tape pools.
     * </p>
     * 
     * @param marker
     *        A string that indicates the position at which to begin the returned list of tape pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * An optional number limit for the tape pools in the list returned by this call.
     * </p>
     * 
     * @param limit
     *        An optional number limit for the tape pools in the list returned by this call.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * An optional number limit for the tape pools in the list returned by this call.
     * </p>
     * 
     * @return An optional number limit for the tape pools in the list returned by this call.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * An optional number limit for the tape pools in the list returned by this call.
     * </p>
     * 
     * @param limit
     *        An optional number limit for the tape pools in the list returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTapePoolsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getPoolARNs() != null)
            sb.append("PoolARNs: ").append(getPoolARNs()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTapePoolsRequest == false)
            return false;
        ListTapePoolsRequest other = (ListTapePoolsRequest) obj;
        if (other.getPoolARNs() == null ^ this.getPoolARNs() == null)
            return false;
        if (other.getPoolARNs() != null && other.getPoolARNs().equals(this.getPoolARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolARNs() == null) ? 0 : getPoolARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListTapePoolsRequest clone() {
        return (ListTapePoolsRequest) super.clone();
    }

}
