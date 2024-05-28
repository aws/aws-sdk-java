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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The estimated monthly savings after you adjust the configurations of your instances running on the inferred workload
 * types to the recommended configurations. If the <code>inferredWorkloadTypes</code> list contains multiple entries,
 * then the savings are the sum of the monthly savings from instances that run the exact combination of the inferred
 * workload types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/InferredWorkloadSaving"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferredWorkloadSaving implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The applications that might be running on the instance as inferred by Compute Optimizer.
     * </p>
     * <p>
     * Compute Optimizer can infer if one of the following applications might be running on the instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memcached</code> - Infers that Memcached might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NGINX</code> - Infers that NGINX might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redis</code> - Infers that Redis might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Kafka</code> - Infers that Kafka might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> inferredWorkloadTypes;
    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     * recommendations for a given resource. This is based on the On-Demand instance pricing.
     * </p>
     */
    private EstimatedMonthlySavings estimatedMonthlySavings;

    /**
     * <p>
     * The applications that might be running on the instance as inferred by Compute Optimizer.
     * </p>
     * <p>
     * Compute Optimizer can infer if one of the following applications might be running on the instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memcached</code> - Infers that Memcached might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NGINX</code> - Infers that NGINX might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redis</code> - Infers that Redis might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Kafka</code> - Infers that Kafka might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The applications that might be running on the instance as inferred by Compute Optimizer.</p>
     *         <p>
     *         Compute Optimizer can infer if one of the following applications might be running on the instance:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Memcached</code> - Infers that Memcached might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NGINX</code> - Infers that NGINX might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Redis</code> - Infers that Redis might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Kafka</code> - Infers that Kafka might be running on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     *         </p>
     *         </li>
     * @see InferredWorkloadType
     */

    public java.util.List<String> getInferredWorkloadTypes() {
        return inferredWorkloadTypes;
    }

    /**
     * <p>
     * The applications that might be running on the instance as inferred by Compute Optimizer.
     * </p>
     * <p>
     * Compute Optimizer can infer if one of the following applications might be running on the instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memcached</code> - Infers that Memcached might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NGINX</code> - Infers that NGINX might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redis</code> - Infers that Redis might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Kafka</code> - Infers that Kafka might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferredWorkloadTypes
     *        The applications that might be running on the instance as inferred by Compute Optimizer.</p>
     *        <p>
     *        Compute Optimizer can infer if one of the following applications might be running on the instance:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memcached</code> - Infers that Memcached might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NGINX</code> - Infers that NGINX might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Redis</code> - Infers that Redis might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Kafka</code> - Infers that Kafka might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     *        </p>
     *        </li>
     * @see InferredWorkloadType
     */

    public void setInferredWorkloadTypes(java.util.Collection<String> inferredWorkloadTypes) {
        if (inferredWorkloadTypes == null) {
            this.inferredWorkloadTypes = null;
            return;
        }

        this.inferredWorkloadTypes = new java.util.ArrayList<String>(inferredWorkloadTypes);
    }

    /**
     * <p>
     * The applications that might be running on the instance as inferred by Compute Optimizer.
     * </p>
     * <p>
     * Compute Optimizer can infer if one of the following applications might be running on the instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memcached</code> - Infers that Memcached might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NGINX</code> - Infers that NGINX might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redis</code> - Infers that Redis might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Kafka</code> - Infers that Kafka might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferredWorkloadTypes(java.util.Collection)} or
     * {@link #withInferredWorkloadTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The applications that might be running on the instance as inferred by Compute Optimizer.</p>
     *        <p>
     *        Compute Optimizer can infer if one of the following applications might be running on the instance:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memcached</code> - Infers that Memcached might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NGINX</code> - Infers that NGINX might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Redis</code> - Infers that Redis might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Kafka</code> - Infers that Kafka might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadType
     */

    public InferredWorkloadSaving withInferredWorkloadTypes(String... inferredWorkloadTypes) {
        if (this.inferredWorkloadTypes == null) {
            setInferredWorkloadTypes(new java.util.ArrayList<String>(inferredWorkloadTypes.length));
        }
        for (String ele : inferredWorkloadTypes) {
            this.inferredWorkloadTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The applications that might be running on the instance as inferred by Compute Optimizer.
     * </p>
     * <p>
     * Compute Optimizer can infer if one of the following applications might be running on the instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memcached</code> - Infers that Memcached might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NGINX</code> - Infers that NGINX might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redis</code> - Infers that Redis might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Kafka</code> - Infers that Kafka might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferredWorkloadTypes
     *        The applications that might be running on the instance as inferred by Compute Optimizer.</p>
     *        <p>
     *        Compute Optimizer can infer if one of the following applications might be running on the instance:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memcached</code> - Infers that Memcached might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NGINX</code> - Infers that NGINX might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Redis</code> - Infers that Redis might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Kafka</code> - Infers that Kafka might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadType
     */

    public InferredWorkloadSaving withInferredWorkloadTypes(java.util.Collection<String> inferredWorkloadTypes) {
        setInferredWorkloadTypes(inferredWorkloadTypes);
        return this;
    }

    /**
     * <p>
     * The applications that might be running on the instance as inferred by Compute Optimizer.
     * </p>
     * <p>
     * Compute Optimizer can infer if one of the following applications might be running on the instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memcached</code> - Infers that Memcached might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NGINX</code> - Infers that NGINX might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redis</code> - Infers that Redis might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Kafka</code> - Infers that Kafka might be running on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferredWorkloadTypes
     *        The applications that might be running on the instance as inferred by Compute Optimizer.</p>
     *        <p>
     *        Compute Optimizer can infer if one of the following applications might be running on the instance:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AmazonEmr</code> - Infers that Amazon EMR might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheCassandra</code> - Infers that Apache Cassandra might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApacheHadoop</code> - Infers that Apache Hadoop might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memcached</code> - Infers that Memcached might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NGINX</code> - Infers that NGINX might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PostgreSql</code> - Infers that PostgreSQL might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Redis</code> - Infers that Redis might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Kafka</code> - Infers that Kafka might be running on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SQLServer</code> - Infers that SQLServer might be running on the instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadType
     */

    public InferredWorkloadSaving withInferredWorkloadTypes(InferredWorkloadType... inferredWorkloadTypes) {
        java.util.ArrayList<String> inferredWorkloadTypesCopy = new java.util.ArrayList<String>(inferredWorkloadTypes.length);
        for (InferredWorkloadType value : inferredWorkloadTypes) {
            inferredWorkloadTypesCopy.add(value.toString());
        }
        if (getInferredWorkloadTypes() == null) {
            setInferredWorkloadTypes(inferredWorkloadTypesCopy);
        } else {
            getInferredWorkloadTypes().addAll(inferredWorkloadTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     * recommendations for a given resource. This is based on the On-Demand instance pricing.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     *        recommendations for a given resource. This is based on the On-Demand instance pricing.
     */

    public void setEstimatedMonthlySavings(EstimatedMonthlySavings estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     * recommendations for a given resource. This is based on the On-Demand instance pricing.
     * </p>
     * 
     * @return An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     *         recommendations for a given resource. This is based on the On-Demand instance pricing.
     */

    public EstimatedMonthlySavings getEstimatedMonthlySavings() {
        return this.estimatedMonthlySavings;
    }

    /**
     * <p>
     * An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     * recommendations for a given resource. This is based on the On-Demand instance pricing.
     * </p>
     * 
     * @param estimatedMonthlySavings
     *        An object that describes the estimated monthly savings amount possible by adopting Compute Optimizer
     *        recommendations for a given resource. This is based on the On-Demand instance pricing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferredWorkloadSaving withEstimatedMonthlySavings(EstimatedMonthlySavings estimatedMonthlySavings) {
        setEstimatedMonthlySavings(estimatedMonthlySavings);
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
        if (getInferredWorkloadTypes() != null)
            sb.append("InferredWorkloadTypes: ").append(getInferredWorkloadTypes()).append(",");
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: ").append(getEstimatedMonthlySavings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferredWorkloadSaving == false)
            return false;
        InferredWorkloadSaving other = (InferredWorkloadSaving) obj;
        if (other.getInferredWorkloadTypes() == null ^ this.getInferredWorkloadTypes() == null)
            return false;
        if (other.getInferredWorkloadTypes() != null && other.getInferredWorkloadTypes().equals(this.getInferredWorkloadTypes()) == false)
            return false;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferredWorkloadTypes() == null) ? 0 : getInferredWorkloadTypes().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings().hashCode());
        return hashCode;
    }

    @Override
    public InferredWorkloadSaving clone() {
        try {
            return (InferredWorkloadSaving) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.InferredWorkloadSavingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
