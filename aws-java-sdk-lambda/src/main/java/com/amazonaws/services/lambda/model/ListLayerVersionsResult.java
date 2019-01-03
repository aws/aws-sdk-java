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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLayerVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all versions.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A list of versions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LayerVersionsListItem> layerVersions;

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all versions.
     * </p>
     * 
     * @param nextMarker
     *        A pagination token returned when the response doesn't contain all versions.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all versions.
     * </p>
     * 
     * @return A pagination token returned when the response doesn't contain all versions.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A pagination token returned when the response doesn't contain all versions.
     * </p>
     * 
     * @param nextMarker
     *        A pagination token returned when the response doesn't contain all versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayerVersionsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A list of versions.
     * </p>
     * 
     * @return A list of versions.
     */

    public java.util.List<LayerVersionsListItem> getLayerVersions() {
        if (layerVersions == null) {
            layerVersions = new com.amazonaws.internal.SdkInternalList<LayerVersionsListItem>();
        }
        return layerVersions;
    }

    /**
     * <p>
     * A list of versions.
     * </p>
     * 
     * @param layerVersions
     *        A list of versions.
     */

    public void setLayerVersions(java.util.Collection<LayerVersionsListItem> layerVersions) {
        if (layerVersions == null) {
            this.layerVersions = null;
            return;
        }

        this.layerVersions = new com.amazonaws.internal.SdkInternalList<LayerVersionsListItem>(layerVersions);
    }

    /**
     * <p>
     * A list of versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerVersions(java.util.Collection)} or {@link #withLayerVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param layerVersions
     *        A list of versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayerVersionsResult withLayerVersions(LayerVersionsListItem... layerVersions) {
        if (this.layerVersions == null) {
            setLayerVersions(new com.amazonaws.internal.SdkInternalList<LayerVersionsListItem>(layerVersions.length));
        }
        for (LayerVersionsListItem ele : layerVersions) {
            this.layerVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of versions.
     * </p>
     * 
     * @param layerVersions
     *        A list of versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayerVersionsResult withLayerVersions(java.util.Collection<LayerVersionsListItem> layerVersions) {
        setLayerVersions(layerVersions);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getLayerVersions() != null)
            sb.append("LayerVersions: ").append(getLayerVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLayerVersionsResult == false)
            return false;
        ListLayerVersionsResult other = (ListLayerVersionsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getLayerVersions() == null ^ this.getLayerVersions() == null)
            return false;
        if (other.getLayerVersions() != null && other.getLayerVersions().equals(this.getLayerVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getLayerVersions() == null) ? 0 : getLayerVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListLayerVersionsResult clone() {
        try {
            return (ListLayerVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
