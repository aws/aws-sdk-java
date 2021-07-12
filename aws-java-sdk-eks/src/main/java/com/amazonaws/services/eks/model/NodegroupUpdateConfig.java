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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The node group update configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/NodegroupUpdateConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodegroupUpdateConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This
     * value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum number is 100.
     * </p>
     */
    private Integer maxUnavailable;
    /**
     * <p>
     * The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in
     * parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to have a value.
     * </p>
     */
    private Integer maxUnavailablePercentage;

    /**
     * <p>
     * The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This
     * value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum number is 100.
     * </p>
     * 
     * @param maxUnavailable
     *        The maximum number of nodes unavailable at once during a version update. Nodes will be updated in
     *        parallel. This value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum
     *        number is 100.
     */

    public void setMaxUnavailable(Integer maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * <p>
     * The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This
     * value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum number is 100.
     * </p>
     * 
     * @return The maximum number of nodes unavailable at once during a version update. Nodes will be updated in
     *         parallel. This value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum
     *         number is 100.
     */

    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    /**
     * <p>
     * The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This
     * value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum number is 100.
     * </p>
     * 
     * @param maxUnavailable
     *        The maximum number of nodes unavailable at once during a version update. Nodes will be updated in
     *        parallel. This value or <code>maxUnavailablePercentage</code> is required to have a value.The maximum
     *        number is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupUpdateConfig withMaxUnavailable(Integer maxUnavailable) {
        setMaxUnavailable(maxUnavailable);
        return this;
    }

    /**
     * <p>
     * The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in
     * parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to have a value.
     * </p>
     * 
     * @param maxUnavailablePercentage
     *        The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be
     *        updated in parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to
     *        have a value.
     */

    public void setMaxUnavailablePercentage(Integer maxUnavailablePercentage) {
        this.maxUnavailablePercentage = maxUnavailablePercentage;
    }

    /**
     * <p>
     * The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in
     * parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to have a value.
     * </p>
     * 
     * @return The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be
     *         updated in parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to
     *         have a value.
     */

    public Integer getMaxUnavailablePercentage() {
        return this.maxUnavailablePercentage;
    }

    /**
     * <p>
     * The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in
     * parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to have a value.
     * </p>
     * 
     * @param maxUnavailablePercentage
     *        The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be
     *        updated in parallel, up to 100 nodes at once. This value or <code>maxUnavailable</code> is required to
     *        have a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupUpdateConfig withMaxUnavailablePercentage(Integer maxUnavailablePercentage) {
        setMaxUnavailablePercentage(maxUnavailablePercentage);
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
        if (getMaxUnavailable() != null)
            sb.append("MaxUnavailable: ").append(getMaxUnavailable()).append(",");
        if (getMaxUnavailablePercentage() != null)
            sb.append("MaxUnavailablePercentage: ").append(getMaxUnavailablePercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodegroupUpdateConfig == false)
            return false;
        NodegroupUpdateConfig other = (NodegroupUpdateConfig) obj;
        if (other.getMaxUnavailable() == null ^ this.getMaxUnavailable() == null)
            return false;
        if (other.getMaxUnavailable() != null && other.getMaxUnavailable().equals(this.getMaxUnavailable()) == false)
            return false;
        if (other.getMaxUnavailablePercentage() == null ^ this.getMaxUnavailablePercentage() == null)
            return false;
        if (other.getMaxUnavailablePercentage() != null && other.getMaxUnavailablePercentage().equals(this.getMaxUnavailablePercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxUnavailable() == null) ? 0 : getMaxUnavailable().hashCode());
        hashCode = prime * hashCode + ((getMaxUnavailablePercentage() == null) ? 0 : getMaxUnavailablePercentage().hashCode());
        return hashCode;
    }

    @Override
    public NodegroupUpdateConfig clone() {
        try {
            return (NodegroupUpdateConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.NodegroupUpdateConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
