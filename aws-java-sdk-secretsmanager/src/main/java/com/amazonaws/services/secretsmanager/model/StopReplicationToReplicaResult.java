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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopReplicationToReplicaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     * </p>
     * 
     * @param aRN
     *        Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     * </p>
     * 
     * @return Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     * </p>
     * 
     * @param aRN
     *        Response <code>StopReplicationToReplica</code> of a secret, based on the <code>ARN,</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopReplicationToReplicaResult withARN(String aRN) {
        setARN(aRN);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopReplicationToReplicaResult == false)
            return false;
        StopReplicationToReplicaResult other = (StopReplicationToReplicaResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public StopReplicationToReplicaResult clone() {
        try {
            return (StopReplicationToReplicaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
