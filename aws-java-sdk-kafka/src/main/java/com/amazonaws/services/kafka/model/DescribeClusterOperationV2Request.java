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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeClusterOperationV2" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterOperationV2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ARN of the cluster operation to describe. */
    private String clusterOperationArn;

    /**
     * ARN of the cluster operation to describe.
     * 
     * @param clusterOperationArn
     *        ARN of the cluster operation to describe.
     */

    public void setClusterOperationArn(String clusterOperationArn) {
        this.clusterOperationArn = clusterOperationArn;
    }

    /**
     * ARN of the cluster operation to describe.
     * 
     * @return ARN of the cluster operation to describe.
     */

    public String getClusterOperationArn() {
        return this.clusterOperationArn;
    }

    /**
     * ARN of the cluster operation to describe.
     * 
     * @param clusterOperationArn
     *        ARN of the cluster operation to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterOperationV2Request withClusterOperationArn(String clusterOperationArn) {
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

        if (obj instanceof DescribeClusterOperationV2Request == false)
            return false;
        DescribeClusterOperationV2Request other = (DescribeClusterOperationV2Request) obj;
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

        hashCode = prime * hashCode + ((getClusterOperationArn() == null) ? 0 : getClusterOperationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterOperationV2Request clone() {
        return (DescribeClusterOperationV2Request) super.clone();
    }

}
