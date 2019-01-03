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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLoadBasedAutoScaling"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBasedAutoScalingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of layer IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layerIds;

    /**
     * <p>
     * An array of layer IDs.
     * </p>
     * 
     * @return An array of layer IDs.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * An array of layer IDs.
     * </p>
     * 
     * @param layerIds
     *        An array of layer IDs.
     */

    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }

        this.layerIds = new com.amazonaws.internal.SdkInternalList<String>(layerIds);
    }

    /**
     * <p>
     * An array of layer IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerIds(java.util.Collection)} or {@link #withLayerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerIds
     *        An array of layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBasedAutoScalingRequest withLayerIds(String... layerIds) {
        if (this.layerIds == null) {
            setLayerIds(new com.amazonaws.internal.SdkInternalList<String>(layerIds.length));
        }
        for (String ele : layerIds) {
            this.layerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of layer IDs.
     * </p>
     * 
     * @param layerIds
     *        An array of layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBasedAutoScalingRequest withLayerIds(java.util.Collection<String> layerIds) {
        setLayerIds(layerIds);
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
        if (getLayerIds() != null)
            sb.append("LayerIds: ").append(getLayerIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBasedAutoScalingRequest == false)
            return false;
        DescribeLoadBasedAutoScalingRequest other = (DescribeLoadBasedAutoScalingRequest) obj;
        if (other.getLayerIds() == null ^ this.getLayerIds() == null)
            return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBasedAutoScalingRequest clone() {
        return (DescribeLoadBasedAutoScalingRequest) super.clone();
    }

}
