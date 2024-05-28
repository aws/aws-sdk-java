/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeClusterOperationV2" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterOperationV2Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Cluster operation information
     * </p>
     */
    private ClusterOperationV2 clusterOperationInfo;

    /**
     * <p>
     * Cluster operation information
     * </p>
     * 
     * @param clusterOperationInfo
     *        <p>
     *        Cluster operation information
     *        </p>
     */

    public void setClusterOperationInfo(ClusterOperationV2 clusterOperationInfo) {
        this.clusterOperationInfo = clusterOperationInfo;
    }

    /**
     * <p>
     * Cluster operation information
     * </p>
     * 
     * @return <p>
     *         Cluster operation information
     *         </p>
     */

    public ClusterOperationV2 getClusterOperationInfo() {
        return this.clusterOperationInfo;
    }

    /**
     * <p>
     * Cluster operation information
     * </p>
     * 
     * @param clusterOperationInfo
     *        <p>
     *        Cluster operation information
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterOperationV2Result withClusterOperationInfo(ClusterOperationV2 clusterOperationInfo) {
        setClusterOperationInfo(clusterOperationInfo);
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
        if (getClusterOperationInfo() != null)
            sb.append("ClusterOperationInfo: ").append(getClusterOperationInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterOperationV2Result == false)
            return false;
        DescribeClusterOperationV2Result other = (DescribeClusterOperationV2Result) obj;
        if (other.getClusterOperationInfo() == null ^ this.getClusterOperationInfo() == null)
            return false;
        if (other.getClusterOperationInfo() != null && other.getClusterOperationInfo().equals(this.getClusterOperationInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterOperationInfo() == null) ? 0 : getClusterOperationInfo().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterOperationV2Result clone() {
        try {
            return (DescribeClusterOperationV2Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
