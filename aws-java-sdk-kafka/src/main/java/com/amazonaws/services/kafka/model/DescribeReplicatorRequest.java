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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeReplicator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be described.
     * </p>
     */
    private String replicatorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be described.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator to be described.
     */

    public void setReplicatorArn(String replicatorArn) {
        this.replicatorArn = replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicator to be described.
     */

    public String getReplicatorArn() {
        return this.replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be described.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorRequest withReplicatorArn(String replicatorArn) {
        setReplicatorArn(replicatorArn);
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
            sb.append("ReplicatorArn: ").append(getReplicatorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicatorRequest == false)
            return false;
        DescribeReplicatorRequest other = (DescribeReplicatorRequest) obj;
        if (other.getReplicatorArn() == null ^ this.getReplicatorArn() == null)
            return false;
        if (other.getReplicatorArn() != null && other.getReplicatorArn().equals(this.getReplicatorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicatorArn() == null) ? 0 : getReplicatorArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicatorRequest clone() {
        return (DescribeReplicatorRequest) super.clone();
    }

}
