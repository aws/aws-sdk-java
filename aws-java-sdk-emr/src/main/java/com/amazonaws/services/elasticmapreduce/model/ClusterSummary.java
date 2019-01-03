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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary description of the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ClusterSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     */
    private ClusterStatus status;
    /**
     * <p>
     * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     */
    private Integer normalizedInstanceHours;

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cluster.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * 
     * @return The unique identifier for the cluster.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the cluster.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     * 
     * @param status
     *        The details about the current status of the cluster.
     */

    public void setStatus(ClusterStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     * 
     * @return The details about the current status of the cluster.
     */

    public ClusterStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The details about the current status of the cluster.
     * </p>
     * 
     * @param status
     *        The details about the current status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSummary withStatus(ClusterStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @param normalizedInstanceHours
     *        An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one
     *        time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that
     *        is roughly four times more expensive would result in the normalized instance hours being incremented by
     *        four. This result is only an approximation and does not reflect the actual billing rate.
     */

    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @return An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one
     *         time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance
     *         that is roughly four times more expensive would result in the normalized instance hours being incremented
     *         by four. This result is only an approximation and does not reflect the actual billing rate.
     */

    public Integer getNormalizedInstanceHours() {
        return this.normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time
     * for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly
     * four times more expensive would result in the normalized instance hours being incremented by four. This result is
     * only an approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @param normalizedInstanceHours
     *        An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one
     *        time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that
     *        is roughly four times more expensive would result in the normalized instance hours being incremented by
     *        four. This result is only an approximation and does not reflect the actual billing rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSummary withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        setNormalizedInstanceHours(normalizedInstanceHours);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNormalizedInstanceHours() != null)
            sb.append("NormalizedInstanceHours: ").append(getNormalizedInstanceHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSummary == false)
            return false;
        ClusterSummary other = (ClusterSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null)
            return false;
        if (other.getNormalizedInstanceHours() != null && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false)
            return false;
        return true;
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
    public ClusterSummary clone() {
        try {
            return (ClusterSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ClusterSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
