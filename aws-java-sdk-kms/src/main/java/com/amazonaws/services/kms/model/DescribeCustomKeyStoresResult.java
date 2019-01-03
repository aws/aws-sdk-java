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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DescribeCustomKeyStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomKeyStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains metadata about each custom key store.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomKeyStoresListEntry> customKeyStores;
    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this value is true, the list in this
     * response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response
     * to the <code>Marker</code> parameter in a subsequent request.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * Contains metadata about each custom key store.
     * </p>
     * 
     * @return Contains metadata about each custom key store.
     */

    public java.util.List<CustomKeyStoresListEntry> getCustomKeyStores() {
        if (customKeyStores == null) {
            customKeyStores = new com.amazonaws.internal.SdkInternalList<CustomKeyStoresListEntry>();
        }
        return customKeyStores;
    }

    /**
     * <p>
     * Contains metadata about each custom key store.
     * </p>
     * 
     * @param customKeyStores
     *        Contains metadata about each custom key store.
     */

    public void setCustomKeyStores(java.util.Collection<CustomKeyStoresListEntry> customKeyStores) {
        if (customKeyStores == null) {
            this.customKeyStores = null;
            return;
        }

        this.customKeyStores = new com.amazonaws.internal.SdkInternalList<CustomKeyStoresListEntry>(customKeyStores);
    }

    /**
     * <p>
     * Contains metadata about each custom key store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomKeyStores(java.util.Collection)} or {@link #withCustomKeyStores(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customKeyStores
     *        Contains metadata about each custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresResult withCustomKeyStores(CustomKeyStoresListEntry... customKeyStores) {
        if (this.customKeyStores == null) {
            setCustomKeyStores(new com.amazonaws.internal.SdkInternalList<CustomKeyStoresListEntry>(customKeyStores.length));
        }
        for (CustomKeyStoresListEntry ele : customKeyStores) {
            this.customKeyStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains metadata about each custom key store.
     * </p>
     * 
     * @param customKeyStores
     *        Contains metadata about each custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresResult withCustomKeyStores(java.util.Collection<CustomKeyStoresListEntry> customKeyStores) {
        setCustomKeyStores(customKeyStores);
        return this;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @param nextMarker
     *        When <code>Truncated</code> is true, this element is present and contains the value to use for the
     *        <code>Marker</code> parameter in a subsequent request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @return When <code>Truncated</code> is true, this element is present and contains the value to use for the
     *         <code>Marker</code> parameter in a subsequent request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @param nextMarker
     *        When <code>Truncated</code> is true, this element is present and contains the value to use for the
     *        <code>Marker</code> parameter in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this value is true, the list in this
     * response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response
     * to the <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @param truncated
     *        A flag that indicates whether there are more items in the list. When this value is true, the list in this
     *        response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this
     *        response to the <code>Marker</code> parameter in a subsequent request.
     */

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this value is true, the list in this
     * response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response
     * to the <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @return A flag that indicates whether there are more items in the list. When this value is true, the list in this
     *         response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this
     *         response to the <code>Marker</code> parameter in a subsequent request.
     */

    public Boolean getTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this value is true, the list in this
     * response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response
     * to the <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @param truncated
     *        A flag that indicates whether there are more items in the list. When this value is true, the list in this
     *        response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this
     *        response to the <code>Marker</code> parameter in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresResult withTruncated(Boolean truncated) {
        setTruncated(truncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. When this value is true, the list in this
     * response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response
     * to the <code>Marker</code> parameter in a subsequent request.
     * </p>
     * 
     * @return A flag that indicates whether there are more items in the list. When this value is true, the list in this
     *         response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this
     *         response to the <code>Marker</code> parameter in a subsequent request.
     */

    public Boolean isTruncated() {
        return this.truncated;
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
        if (getCustomKeyStores() != null)
            sb.append("CustomKeyStores: ").append(getCustomKeyStores()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getTruncated() != null)
            sb.append("Truncated: ").append(getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomKeyStoresResult == false)
            return false;
        DescribeCustomKeyStoresResult other = (DescribeCustomKeyStoresResult) obj;
        if (other.getCustomKeyStores() == null ^ this.getCustomKeyStores() == null)
            return false;
        if (other.getCustomKeyStores() != null && other.getCustomKeyStores().equals(this.getCustomKeyStores()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomKeyStores() == null) ? 0 : getCustomKeyStores().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomKeyStoresResult clone() {
        try {
            return (DescribeCustomKeyStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
