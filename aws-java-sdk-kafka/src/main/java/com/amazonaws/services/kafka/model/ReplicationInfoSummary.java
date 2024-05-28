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
 * Summarized information of replication between clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ReplicationInfoSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationInfoSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     */
    private String sourceKafkaClusterAlias;
    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     */
    private String targetKafkaClusterAlias;

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     * 
     * @param sourceKafkaClusterAlias
     *        The alias of the source Kafka cluster.
     */

    public void setSourceKafkaClusterAlias(String sourceKafkaClusterAlias) {
        this.sourceKafkaClusterAlias = sourceKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     * 
     * @return The alias of the source Kafka cluster.
     */

    public String getSourceKafkaClusterAlias() {
        return this.sourceKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     * 
     * @param sourceKafkaClusterAlias
     *        The alias of the source Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfoSummary withSourceKafkaClusterAlias(String sourceKafkaClusterAlias) {
        setSourceKafkaClusterAlias(sourceKafkaClusterAlias);
        return this;
    }

    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     * 
     * @param targetKafkaClusterAlias
     *        The alias of the target Kafka cluster.
     */

    public void setTargetKafkaClusterAlias(String targetKafkaClusterAlias) {
        this.targetKafkaClusterAlias = targetKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     * 
     * @return The alias of the target Kafka cluster.
     */

    public String getTargetKafkaClusterAlias() {
        return this.targetKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     * 
     * @param targetKafkaClusterAlias
     *        The alias of the target Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfoSummary withTargetKafkaClusterAlias(String targetKafkaClusterAlias) {
        setTargetKafkaClusterAlias(targetKafkaClusterAlias);
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
        if (getSourceKafkaClusterAlias() != null)
            sb.append("SourceKafkaClusterAlias: ").append(getSourceKafkaClusterAlias()).append(",");
        if (getTargetKafkaClusterAlias() != null)
            sb.append("TargetKafkaClusterAlias: ").append(getTargetKafkaClusterAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationInfoSummary == false)
            return false;
        ReplicationInfoSummary other = (ReplicationInfoSummary) obj;
        if (other.getSourceKafkaClusterAlias() == null ^ this.getSourceKafkaClusterAlias() == null)
            return false;
        if (other.getSourceKafkaClusterAlias() != null && other.getSourceKafkaClusterAlias().equals(this.getSourceKafkaClusterAlias()) == false)
            return false;
        if (other.getTargetKafkaClusterAlias() == null ^ this.getTargetKafkaClusterAlias() == null)
            return false;
        if (other.getTargetKafkaClusterAlias() != null && other.getTargetKafkaClusterAlias().equals(this.getTargetKafkaClusterAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceKafkaClusterAlias() == null) ? 0 : getSourceKafkaClusterAlias().hashCode());
        hashCode = prime * hashCode + ((getTargetKafkaClusterAlias() == null) ? 0 : getTargetKafkaClusterAlias().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationInfoSummary clone() {
        try {
            return (ReplicationInfoSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ReplicationInfoSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
