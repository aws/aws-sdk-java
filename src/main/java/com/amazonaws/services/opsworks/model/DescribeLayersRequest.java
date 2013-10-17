/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeLayers(DescribeLayersRequest) DescribeLayers operation}.
 * <p>
 * Requests a description of one or more layers in a specified stack.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeLayers(DescribeLayersRequest)
 */
public class DescribeLayersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * An array of layer IDs that specify the layers to be described. If you
     * omit this parameter, <code>DescribeLayers</code> returns a description
     * of every layer in the specified stack.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIds;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLayersRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * An array of layer IDs that specify the layers to be described. If you
     * omit this parameter, <code>DescribeLayers</code> returns a description
     * of every layer in the specified stack.
     *
     * @return An array of layer IDs that specify the layers to be described. If you
     *         omit this parameter, <code>DescribeLayers</code> returns a description
     *         of every layer in the specified stack.
     */
    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
              layerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              layerIds.setAutoConstruct(true);
        }
        return layerIds;
    }
    
    /**
     * An array of layer IDs that specify the layers to be described. If you
     * omit this parameter, <code>DescribeLayers</code> returns a description
     * of every layer in the specified stack.
     *
     * @param layerIds An array of layer IDs that specify the layers to be described. If you
     *         omit this parameter, <code>DescribeLayers</code> returns a description
     *         of every layer in the specified stack.
     */
    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(layerIds.size());
        layerIdsCopy.addAll(layerIds);
        this.layerIds = layerIdsCopy;
    }
    
    /**
     * An array of layer IDs that specify the layers to be described. If you
     * omit this parameter, <code>DescribeLayers</code> returns a description
     * of every layer in the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array of layer IDs that specify the layers to be described. If you
     *         omit this parameter, <code>DescribeLayers</code> returns a description
     *         of every layer in the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLayersRequest withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of layer IDs that specify the layers to be described. If you
     * omit this parameter, <code>DescribeLayers</code> returns a description
     * of every layer in the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array of layer IDs that specify the layers to be described. If you
     *         omit this parameter, <code>DescribeLayers</code> returns a description
     *         of every layer in the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLayersRequest withLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(layerIds.size());
            layerIdsCopy.addAll(layerIds);
            this.layerIds = layerIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLayersRequest == false) return false;
        DescribeLayersRequest other = (DescribeLayersRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        return true;
    }
    
}
    