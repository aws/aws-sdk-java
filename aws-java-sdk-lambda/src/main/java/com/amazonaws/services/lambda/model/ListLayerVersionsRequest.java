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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLayerVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A runtime identifier. For example, <code>go1.x</code>.
     * </p>
     */
    private String compatibleRuntime;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     */
    private String layerName;
    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of versions to return.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * A runtime identifier. For example, <code>go1.x</code>.
     * </p>
     * 
     * @param compatibleRuntime
     *        A runtime identifier. For example, <code>go1.x</code>.
     * @see Runtime
     */

    public void setCompatibleRuntime(String compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
    }

    /**
     * <p>
     * A runtime identifier. For example, <code>go1.x</code>.
     * </p>
     * 
     * @return A runtime identifier. For example, <code>go1.x</code>.
     * @see Runtime
     */

    public String getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    /**
     * <p>
     * A runtime identifier. For example, <code>go1.x</code>.
     * </p>
     * 
     * @param compatibleRuntime
     *        A runtime identifier. For example, <code>go1.x</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public ListLayerVersionsRequest withCompatibleRuntime(String compatibleRuntime) {
        setCompatibleRuntime(compatibleRuntime);
        return this;
    }

    /**
     * <p>
     * A runtime identifier. For example, <code>go1.x</code>.
     * </p>
     * 
     * @param compatibleRuntime
     *        A runtime identifier. For example, <code>go1.x</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public ListLayerVersionsRequest withCompatibleRuntime(Runtime compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime.toString();
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     */

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the layer.
     */

    public String getLayerName() {
        return this.layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayerVersionsRequest withLayerName(String layerName) {
        setLayerName(layerName);
        return this;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @param marker
     *        A pagination token returned by a previous call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @return A pagination token returned by a previous call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @param marker
     *        A pagination token returned by a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayerVersionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of versions to return.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of versions to return.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of versions to return.
     * </p>
     * 
     * @return The maximum number of versions to return.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of versions to return.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of versions to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayerVersionsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getCompatibleRuntime() != null)
            sb.append("CompatibleRuntime: ").append(getCompatibleRuntime()).append(",");
        if (getLayerName() != null)
            sb.append("LayerName: ").append(getLayerName()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLayerVersionsRequest == false)
            return false;
        ListLayerVersionsRequest other = (ListLayerVersionsRequest) obj;
        if (other.getCompatibleRuntime() == null ^ this.getCompatibleRuntime() == null)
            return false;
        if (other.getCompatibleRuntime() != null && other.getCompatibleRuntime().equals(this.getCompatibleRuntime()) == false)
            return false;
        if (other.getLayerName() == null ^ this.getLayerName() == null)
            return false;
        if (other.getLayerName() != null && other.getLayerName().equals(this.getLayerName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleRuntime() == null) ? 0 : getCompatibleRuntime().hashCode());
        hashCode = prime * hashCode + ((getLayerName() == null) ? 0 : getLayerName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListLayerVersionsRequest clone() {
        return (ListLayerVersionsRequest) super.clone();
    }

}
