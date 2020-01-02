/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeNodegroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodegroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of your node group.
     * </p>
     */
    private Nodegroup nodegroup;

    /**
     * <p>
     * The full description of your node group.
     * </p>
     * 
     * @param nodegroup
     *        The full description of your node group.
     */

    public void setNodegroup(Nodegroup nodegroup) {
        this.nodegroup = nodegroup;
    }

    /**
     * <p>
     * The full description of your node group.
     * </p>
     * 
     * @return The full description of your node group.
     */

    public Nodegroup getNodegroup() {
        return this.nodegroup;
    }

    /**
     * <p>
     * The full description of your node group.
     * </p>
     * 
     * @param nodegroup
     *        The full description of your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodegroupResult withNodegroup(Nodegroup nodegroup) {
        setNodegroup(nodegroup);
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
        if (getNodegroup() != null)
            sb.append("Nodegroup: ").append(getNodegroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodegroupResult == false)
            return false;
        DescribeNodegroupResult other = (DescribeNodegroupResult) obj;
        if (other.getNodegroup() == null ^ this.getNodegroup() == null)
            return false;
        if (other.getNodegroup() != null && other.getNodegroup().equals(this.getNodegroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodegroup() == null) ? 0 : getNodegroup().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodegroupResult clone() {
        try {
            return (DescribeNodegroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
