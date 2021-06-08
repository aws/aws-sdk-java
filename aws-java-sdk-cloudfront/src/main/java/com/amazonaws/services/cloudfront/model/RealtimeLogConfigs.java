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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of real-time log configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/RealtimeLogConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeLogConfigs implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of real-time log configurations requested.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * Contains the list of real-time log configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RealtimeLogConfig> items;
    /**
     * <p>
     * A flag that indicates whether there are more real-time log configurations than are contained in this list.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * This parameter indicates where this list of real-time log configurations begins. This list includes real-time log
     * configurations that occur after the marker.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing real-time log
     * configurations where you left off.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The maximum number of real-time log configurations requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of real-time log configurations requested.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of real-time log configurations requested.
     * </p>
     * 
     * @return The maximum number of real-time log configurations requested.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of real-time log configurations requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of real-time log configurations requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfigs withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * Contains the list of real-time log configurations.
     * </p>
     * 
     * @return Contains the list of real-time log configurations.
     */

    public java.util.List<RealtimeLogConfig> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<RealtimeLogConfig>();
        }
        return items;
    }

    /**
     * <p>
     * Contains the list of real-time log configurations.
     * </p>
     * 
     * @param items
     *        Contains the list of real-time log configurations.
     */

    public void setItems(java.util.Collection<RealtimeLogConfig> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<RealtimeLogConfig>(items);
    }

    /**
     * <p>
     * Contains the list of real-time log configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Contains the list of real-time log configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfigs withItems(RealtimeLogConfig... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<RealtimeLogConfig>(items.length));
        }
        for (RealtimeLogConfig ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the list of real-time log configurations.
     * </p>
     * 
     * @param items
     *        Contains the list of real-time log configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfigs withItems(java.util.Collection<RealtimeLogConfig> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more real-time log configurations than are contained in this list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more real-time log configurations than are contained in this list.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more real-time log configurations than are contained in this list.
     * </p>
     * 
     * @return A flag that indicates whether there are more real-time log configurations than are contained in this
     *         list.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more real-time log configurations than are contained in this list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more real-time log configurations than are contained in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfigs withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more real-time log configurations than are contained in this list.
     * </p>
     * 
     * @return A flag that indicates whether there are more real-time log configurations than are contained in this
     *         list.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * This parameter indicates where this list of real-time log configurations begins. This list includes real-time log
     * configurations that occur after the marker.
     * </p>
     * 
     * @param marker
     *        This parameter indicates where this list of real-time log configurations begins. This list includes
     *        real-time log configurations that occur after the marker.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * This parameter indicates where this list of real-time log configurations begins. This list includes real-time log
     * configurations that occur after the marker.
     * </p>
     * 
     * @return This parameter indicates where this list of real-time log configurations begins. This list includes
     *         real-time log configurations that occur after the marker.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * This parameter indicates where this list of real-time log configurations begins. This list includes real-time log
     * configurations that occur after the marker.
     * </p>
     * 
     * @param marker
     *        This parameter indicates where this list of real-time log configurations begins. This list includes
     *        real-time log configurations that occur after the marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfigs withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing real-time log
     * configurations where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *        real-time log configurations where you left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing real-time log
     * configurations where you left off.
     * </p>
     * 
     * @return If there are more items in the list than are in this response, this element is present. It contains the
     *         value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *         real-time log configurations where you left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing real-time log
     * configurations where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *        real-time log configurations where you left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfigs withNextMarker(String nextMarker) {
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
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
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

        if (obj instanceof RealtimeLogConfigs == false)
            return false;
        RealtimeLogConfigs other = (RealtimeLogConfigs) obj;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public RealtimeLogConfigs clone() {
        try {
            return (RealtimeLogConfigs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
