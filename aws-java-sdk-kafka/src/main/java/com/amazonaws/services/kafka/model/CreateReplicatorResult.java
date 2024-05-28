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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateReplicator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     */
    private String replicatorArn;
    /**
     * <p>
     * Name of the replicator provided by the customer.
     * </p>
     */
    private String replicatorName;
    /**
     * <p>
     * State of the replicator.
     * </p>
     */
    private String replicatorState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator.
     */

    public void setReplicatorArn(String replicatorArn) {
        this.replicatorArn = replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicator.
     */

    public String getReplicatorArn() {
        return this.replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorResult withReplicatorArn(String replicatorArn) {
        setReplicatorArn(replicatorArn);
        return this;
    }

    /**
     * <p>
     * Name of the replicator provided by the customer.
     * </p>
     * 
     * @param replicatorName
     *        Name of the replicator provided by the customer.
     */

    public void setReplicatorName(String replicatorName) {
        this.replicatorName = replicatorName;
    }

    /**
     * <p>
     * Name of the replicator provided by the customer.
     * </p>
     * 
     * @return Name of the replicator provided by the customer.
     */

    public String getReplicatorName() {
        return this.replicatorName;
    }

    /**
     * <p>
     * Name of the replicator provided by the customer.
     * </p>
     * 
     * @param replicatorName
     *        Name of the replicator provided by the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorResult withReplicatorName(String replicatorName) {
        setReplicatorName(replicatorName);
        return this;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @param replicatorState
     *        State of the replicator.
     * @see ReplicatorState
     */

    public void setReplicatorState(String replicatorState) {
        this.replicatorState = replicatorState;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @return State of the replicator.
     * @see ReplicatorState
     */

    public String getReplicatorState() {
        return this.replicatorState;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @param replicatorState
     *        State of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicatorState
     */

    public CreateReplicatorResult withReplicatorState(String replicatorState) {
        setReplicatorState(replicatorState);
        return this;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @param replicatorState
     *        State of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicatorState
     */

    public CreateReplicatorResult withReplicatorState(ReplicatorState replicatorState) {
        this.replicatorState = replicatorState.toString();
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
        if (getReplicatorArn() != null)
            sb.append("ReplicatorArn: ").append(getReplicatorArn()).append(",");
        if (getReplicatorName() != null)
            sb.append("ReplicatorName: ").append(getReplicatorName()).append(",");
        if (getReplicatorState() != null)
            sb.append("ReplicatorState: ").append(getReplicatorState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicatorResult == false)
            return false;
        CreateReplicatorResult other = (CreateReplicatorResult) obj;
        if (other.getReplicatorArn() == null ^ this.getReplicatorArn() == null)
            return false;
        if (other.getReplicatorArn() != null && other.getReplicatorArn().equals(this.getReplicatorArn()) == false)
            return false;
        if (other.getReplicatorName() == null ^ this.getReplicatorName() == null)
            return false;
        if (other.getReplicatorName() != null && other.getReplicatorName().equals(this.getReplicatorName()) == false)
            return false;
        if (other.getReplicatorState() == null ^ this.getReplicatorState() == null)
            return false;
        if (other.getReplicatorState() != null && other.getReplicatorState().equals(this.getReplicatorState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicatorArn() == null) ? 0 : getReplicatorArn().hashCode());
        hashCode = prime * hashCode + ((getReplicatorName() == null) ? 0 : getReplicatorName().hashCode());
        hashCode = prime * hashCode + ((getReplicatorState() == null) ? 0 : getReplicatorState().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicatorResult clone() {
        try {
            return (CreateReplicatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
