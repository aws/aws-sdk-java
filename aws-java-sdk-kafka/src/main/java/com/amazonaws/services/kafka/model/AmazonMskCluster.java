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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of an Amazon MSK Cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/AmazonMskCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMskCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     * </p>
     */
    private String mskClusterArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     * </p>
     * 
     * @param mskClusterArn
     *        The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     */

    public void setMskClusterArn(String mskClusterArn) {
        this.mskClusterArn = mskClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     */

    public String getMskClusterArn() {
        return this.mskClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     * </p>
     * 
     * @param mskClusterArn
     *        The Amazon Resource Name (ARN) of an Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonMskCluster withMskClusterArn(String mskClusterArn) {
        setMskClusterArn(mskClusterArn);
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
        if (getMskClusterArn() != null)
            sb.append("MskClusterArn: ").append(getMskClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonMskCluster == false)
            return false;
        AmazonMskCluster other = (AmazonMskCluster) obj;
        if (other.getMskClusterArn() == null ^ this.getMskClusterArn() == null)
            return false;
        if (other.getMskClusterArn() != null && other.getMskClusterArn().equals(this.getMskClusterArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMskClusterArn() == null) ? 0 : getMskClusterArn().hashCode());
        return hashCode;
    }

    @Override
    public AmazonMskCluster clone() {
        try {
            return (AmazonMskCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.AmazonMskClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
