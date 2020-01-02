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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBrokerCountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     */
    private String clusterOperationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerCountResult withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     * 
     * @param clusterOperationArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster operation.
     *        </p>
     */

    public void setClusterOperationArn(String clusterOperationArn) {
        this.clusterOperationArn = clusterOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster operation.
     *         </p>
     */

    public String getClusterOperationArn() {
        return this.clusterOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     * 
     * @param clusterOperationArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerCountResult withClusterOperationArn(String clusterOperationArn) {
        setClusterOperationArn(clusterOperationArn);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterOperationArn() != null)
            sb.append("ClusterOperationArn: ").append(getClusterOperationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBrokerCountResult == false)
            return false;
        UpdateBrokerCountResult other = (UpdateBrokerCountResult) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterOperationArn() == null ^ this.getClusterOperationArn() == null)
            return false;
        if (other.getClusterOperationArn() != null && other.getClusterOperationArn().equals(this.getClusterOperationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterOperationArn() == null) ? 0 : getClusterOperationArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBrokerCountResult clone() {
        try {
            return (UpdateBrokerCountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
