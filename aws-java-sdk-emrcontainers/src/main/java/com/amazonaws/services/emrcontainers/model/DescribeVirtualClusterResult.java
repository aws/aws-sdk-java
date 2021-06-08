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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeVirtualCluster"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVirtualClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output displays information about the specified virtual cluster.
     * </p>
     */
    private VirtualCluster virtualCluster;

    /**
     * <p>
     * This output displays information about the specified virtual cluster.
     * </p>
     * 
     * @param virtualCluster
     *        This output displays information about the specified virtual cluster.
     */

    public void setVirtualCluster(VirtualCluster virtualCluster) {
        this.virtualCluster = virtualCluster;
    }

    /**
     * <p>
     * This output displays information about the specified virtual cluster.
     * </p>
     * 
     * @return This output displays information about the specified virtual cluster.
     */

    public VirtualCluster getVirtualCluster() {
        return this.virtualCluster;
    }

    /**
     * <p>
     * This output displays information about the specified virtual cluster.
     * </p>
     * 
     * @param virtualCluster
     *        This output displays information about the specified virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualClusterResult withVirtualCluster(VirtualCluster virtualCluster) {
        setVirtualCluster(virtualCluster);
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
        if (getVirtualCluster() != null)
            sb.append("VirtualCluster: ").append(getVirtualCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualClusterResult == false)
            return false;
        DescribeVirtualClusterResult other = (DescribeVirtualClusterResult) obj;
        if (other.getVirtualCluster() == null ^ this.getVirtualCluster() == null)
            return false;
        if (other.getVirtualCluster() != null && other.getVirtualCluster().equals(this.getVirtualCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualCluster() == null) ? 0 : getVirtualCluster().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVirtualClusterResult clone() {
        try {
            return (DescribeVirtualClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
