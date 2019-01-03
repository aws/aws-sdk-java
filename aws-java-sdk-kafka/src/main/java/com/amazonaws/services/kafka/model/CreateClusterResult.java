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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the MSK cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster.
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
     *        The Amazon Resource Name (ARN) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterResult withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The name of the MSK cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the MSK cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the MSK cluster.
     * </p>
     * 
     * @return The name of the MSK cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the MSK cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterResult withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @param state
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @see ClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @return The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @see ClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @param state
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public CreateClusterResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @param state
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public CreateClusterResult withState(ClusterState state) {
        this.state = state.toString();
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterResult == false)
            return false;
        CreateClusterResult other = (CreateClusterResult) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterResult clone() {
        try {
            return (CreateClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
