/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListAllowedNodeTypeUpdates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAllowedNodeTypeUpdatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list node types which you can use to scale up your cluster.
     * </p>
     */
    private java.util.List<String> scaleUpNodeTypes;
    /**
     * <p>
     * A list node types which you can use to scale down your cluster.
     * </p>
     */
    private java.util.List<String> scaleDownNodeTypes;

    /**
     * <p>
     * A list node types which you can use to scale up your cluster.
     * </p>
     * 
     * @return A list node types which you can use to scale up your cluster.
     */

    public java.util.List<String> getScaleUpNodeTypes() {
        return scaleUpNodeTypes;
    }

    /**
     * <p>
     * A list node types which you can use to scale up your cluster.
     * </p>
     * 
     * @param scaleUpNodeTypes
     *        A list node types which you can use to scale up your cluster.
     */

    public void setScaleUpNodeTypes(java.util.Collection<String> scaleUpNodeTypes) {
        if (scaleUpNodeTypes == null) {
            this.scaleUpNodeTypes = null;
            return;
        }

        this.scaleUpNodeTypes = new java.util.ArrayList<String>(scaleUpNodeTypes);
    }

    /**
     * <p>
     * A list node types which you can use to scale up your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScaleUpNodeTypes(java.util.Collection)} or {@link #withScaleUpNodeTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scaleUpNodeTypes
     *        A list node types which you can use to scale up your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeUpdatesResult withScaleUpNodeTypes(String... scaleUpNodeTypes) {
        if (this.scaleUpNodeTypes == null) {
            setScaleUpNodeTypes(new java.util.ArrayList<String>(scaleUpNodeTypes.length));
        }
        for (String ele : scaleUpNodeTypes) {
            this.scaleUpNodeTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list node types which you can use to scale up your cluster.
     * </p>
     * 
     * @param scaleUpNodeTypes
     *        A list node types which you can use to scale up your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeUpdatesResult withScaleUpNodeTypes(java.util.Collection<String> scaleUpNodeTypes) {
        setScaleUpNodeTypes(scaleUpNodeTypes);
        return this;
    }

    /**
     * <p>
     * A list node types which you can use to scale down your cluster.
     * </p>
     * 
     * @return A list node types which you can use to scale down your cluster.
     */

    public java.util.List<String> getScaleDownNodeTypes() {
        return scaleDownNodeTypes;
    }

    /**
     * <p>
     * A list node types which you can use to scale down your cluster.
     * </p>
     * 
     * @param scaleDownNodeTypes
     *        A list node types which you can use to scale down your cluster.
     */

    public void setScaleDownNodeTypes(java.util.Collection<String> scaleDownNodeTypes) {
        if (scaleDownNodeTypes == null) {
            this.scaleDownNodeTypes = null;
            return;
        }

        this.scaleDownNodeTypes = new java.util.ArrayList<String>(scaleDownNodeTypes);
    }

    /**
     * <p>
     * A list node types which you can use to scale down your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScaleDownNodeTypes(java.util.Collection)} or {@link #withScaleDownNodeTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param scaleDownNodeTypes
     *        A list node types which you can use to scale down your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeUpdatesResult withScaleDownNodeTypes(String... scaleDownNodeTypes) {
        if (this.scaleDownNodeTypes == null) {
            setScaleDownNodeTypes(new java.util.ArrayList<String>(scaleDownNodeTypes.length));
        }
        for (String ele : scaleDownNodeTypes) {
            this.scaleDownNodeTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list node types which you can use to scale down your cluster.
     * </p>
     * 
     * @param scaleDownNodeTypes
     *        A list node types which you can use to scale down your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeUpdatesResult withScaleDownNodeTypes(java.util.Collection<String> scaleDownNodeTypes) {
        setScaleDownNodeTypes(scaleDownNodeTypes);
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
        if (getScaleUpNodeTypes() != null)
            sb.append("ScaleUpNodeTypes: ").append(getScaleUpNodeTypes()).append(",");
        if (getScaleDownNodeTypes() != null)
            sb.append("ScaleDownNodeTypes: ").append(getScaleDownNodeTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAllowedNodeTypeUpdatesResult == false)
            return false;
        ListAllowedNodeTypeUpdatesResult other = (ListAllowedNodeTypeUpdatesResult) obj;
        if (other.getScaleUpNodeTypes() == null ^ this.getScaleUpNodeTypes() == null)
            return false;
        if (other.getScaleUpNodeTypes() != null && other.getScaleUpNodeTypes().equals(this.getScaleUpNodeTypes()) == false)
            return false;
        if (other.getScaleDownNodeTypes() == null ^ this.getScaleDownNodeTypes() == null)
            return false;
        if (other.getScaleDownNodeTypes() != null && other.getScaleDownNodeTypes().equals(this.getScaleDownNodeTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScaleUpNodeTypes() == null) ? 0 : getScaleUpNodeTypes().hashCode());
        hashCode = prime * hashCode + ((getScaleDownNodeTypes() == null) ? 0 : getScaleDownNodeTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListAllowedNodeTypeUpdatesResult clone() {
        try {
            return (ListAllowedNodeTypeUpdatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
