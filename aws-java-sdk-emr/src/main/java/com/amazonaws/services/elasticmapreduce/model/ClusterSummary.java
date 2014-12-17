/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The summary description of the cluster.
 * </p>
 */
public class ClusterSummary implements Serializable {

    /**
     * The unique identifier for the cluster.
     */
    private String id;

    /**
     * The name of the cluster.
     */
    private String name;

    /**
     * The details about the current status of the cluster.
     */
    private ClusterStatus status;

    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     */
    private Integer normalizedInstanceHours;

    /**
     * The unique identifier for the cluster.
     *
     * @return The unique identifier for the cluster.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The unique identifier for the cluster.
     *
     * @param id The unique identifier for the cluster.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The unique identifier for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The unique identifier for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the cluster.
     *
     * @return The name of the cluster.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the cluster.
     *
     * @param name The name of the cluster.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The details about the current status of the cluster.
     *
     * @return The details about the current status of the cluster.
     */
    public ClusterStatus getStatus() {
        return status;
    }
    
    /**
     * The details about the current status of the cluster.
     *
     * @param status The details about the current status of the cluster.
     */
    public void setStatus(ClusterStatus status) {
        this.status = status;
    }
    
    /**
     * The details about the current status of the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The details about the current status of the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterSummary withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     *
     * @return An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented one time for every hour an
     *         m1.small instance runs. Larger instances are weighted more, so an EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     */
    public Integer getNormalizedInstanceHours() {
        return normalizedInstanceHours;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     *
     * @param normalizedInstanceHours An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented one time for every hour an
     *         m1.small instance runs. Larger instances are weighted more, so an EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     */
    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }
    
    /**
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented one time for every hour an
     * m1.small instance runs. Larger instances are weighted more, so an EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param normalizedInstanceHours An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented one time for every hour an
     *         m1.small instance runs. Larger instances are weighted more, so an EC2
     *         instance that is roughly four times more expensive would result in the
     *         normalized instance hours being incremented by four. This result is
     *         only an approximation and does not reflect the actual billing rate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterSummary withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getNormalizedInstanceHours() != null) sb.append("NormalizedInstanceHours: " + getNormalizedInstanceHours() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterSummary == false) return false;
        ClusterSummary other = (ClusterSummary)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null) return false;
        if (other.getNormalizedInstanceHours() != null && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false) return false; 
        return true;
    }
    
}
    