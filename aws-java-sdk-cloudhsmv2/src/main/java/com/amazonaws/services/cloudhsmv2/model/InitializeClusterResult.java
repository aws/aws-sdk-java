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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitializeClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     */
    private String stateMessage;

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @param state
     *        The cluster's state.
     * @see ClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @return The cluster's state.
     * @see ClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @param state
     *        The cluster's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public InitializeClusterResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @param state
     *        The cluster's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public InitializeClusterResult withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     * 
     * @param stateMessage
     *        A description of the cluster's state.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     * 
     * @return A description of the cluster's state.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     * 
     * @param stateMessage
     *        A description of the cluster's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitializeClusterResult withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitializeClusterResult == false)
            return false;
        InitializeClusterResult other = (InitializeClusterResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        return hashCode;
    }

    @Override
    public InitializeClusterResult clone() {
        try {
            return (InitializeClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
