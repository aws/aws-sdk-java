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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticLoadBalancers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticLoadBalancersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A stack ID. The action describes the stack's Elastic Load Balancing instances.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layerIds;

    /**
     * <p>
     * A stack ID. The action describes the stack's Elastic Load Balancing instances.
     * </p>
     * 
     * @param stackId
     *        A stack ID. The action describes the stack's Elastic Load Balancing instances.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * A stack ID. The action describes the stack's Elastic Load Balancing instances.
     * </p>
     * 
     * @return A stack ID. The action describes the stack's Elastic Load Balancing instances.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * A stack ID. The action describes the stack's Elastic Load Balancing instances.
     * </p>
     * 
     * @param stackId
     *        A stack ID. The action describes the stack's Elastic Load Balancing instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticLoadBalancersRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * </p>
     * 
     * @return A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * </p>
     * 
     * @param layerIds
     *        A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
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
     * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerIds(java.util.Collection)} or {@link #withLayerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerIds
     *        A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticLoadBalancersRequest withLayerIds(String... layerIds) {
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
     * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * </p>
     * 
     * @param layerIds
     *        A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticLoadBalancersRequest withLayerIds(java.util.Collection<String> layerIds) {
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
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

        if (obj instanceof DescribeElasticLoadBalancersRequest == false)
            return false;
        DescribeElasticLoadBalancersRequest other = (DescribeElasticLoadBalancersRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticLoadBalancersRequest clone() {
        return (DescribeElasticLoadBalancersRequest) super.clone();
    }

}
