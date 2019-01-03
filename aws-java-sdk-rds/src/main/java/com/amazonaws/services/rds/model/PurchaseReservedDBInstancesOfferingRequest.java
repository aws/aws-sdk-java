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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PurchaseReservedDBInstancesOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedDBInstancesOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     */
    private String reservedDBInstancesOfferingId;
    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     */
    private String reservedDBInstanceId;
    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer dBInstanceCount;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for PurchaseReservedDBInstancesOfferingRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating it.
     */
    public PurchaseReservedDBInstancesOfferingRequest() {
    }

    /**
     * Constructs a new PurchaseReservedDBInstancesOfferingRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param reservedDBInstancesOfferingId
     *        The ID of the Reserved DB instance offering to purchase.</p>
     *        <p>
     *        Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public PurchaseReservedDBInstancesOfferingRequest(String reservedDBInstancesOfferingId) {
        setReservedDBInstancesOfferingId(reservedDBInstancesOfferingId);
    }

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     * 
     * @param reservedDBInstancesOfferingId
     *        The ID of the Reserved DB instance offering to purchase.</p>
     *        <p>
     *        Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     */

    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     * 
     * @return The ID of the Reserved DB instance offering to purchase.</p>
     *         <p>
     *         Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     */

    public String getReservedDBInstancesOfferingId() {
        return this.reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     * 
     * @param reservedDBInstancesOfferingId
     *        The ID of the Reserved DB instance offering to purchase.</p>
     *        <p>
     *        Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        setReservedDBInstancesOfferingId(reservedDBInstancesOfferingId);
        return this;
    }

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     * 
     * @param reservedDBInstanceId
     *        Customer-specified identifier to track this reservation.</p>
     *        <p>
     *        Example: myreservationID
     */

    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     * 
     * @return Customer-specified identifier to track this reservation.</p>
     *         <p>
     *         Example: myreservationID
     */

    public String getReservedDBInstanceId() {
        return this.reservedDBInstanceId;
    }

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     * 
     * @param reservedDBInstanceId
     *        Customer-specified identifier to track this reservation.</p>
     *        <p>
     *        Example: myreservationID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        setReservedDBInstanceId(reservedDBInstanceId);
        return this;
    }

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param dBInstanceCount
     *        The number of instances to reserve.</p>
     *        <p>
     *        Default: <code>1</code>
     */

    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @return The number of instances to reserve.</p>
     *         <p>
     *         Default: <code>1</code>
     */

    public Integer getDBInstanceCount() {
        return this.dBInstanceCount;
    }

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param dBInstanceCount
     *        The number of instances to reserve.</p>
     *        <p>
     *        Default: <code>1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedDBInstancesOfferingRequest withDBInstanceCount(Integer dBInstanceCount) {
        setDBInstanceCount(dBInstanceCount);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedDBInstancesOfferingRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedDBInstancesOfferingRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: ").append(getReservedDBInstancesOfferingId()).append(",");
        if (getReservedDBInstanceId() != null)
            sb.append("ReservedDBInstanceId: ").append(getReservedDBInstanceId()).append(",");
        if (getDBInstanceCount() != null)
            sb.append("DBInstanceCount: ").append(getDBInstanceCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedDBInstancesOfferingRequest == false)
            return false;
        PurchaseReservedDBInstancesOfferingRequest other = (PurchaseReservedDBInstancesOfferingRequest) obj;
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null)
            return false;
        if (other.getReservedDBInstanceId() != null && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false)
            return false;
        if (other.getDBInstanceCount() == null ^ this.getDBInstanceCount() == null)
            return false;
        if (other.getDBInstanceCount() != null && other.getDBInstanceCount().equals(this.getDBInstanceCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceCount() == null) ? 0 : getDBInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedDBInstancesOfferingRequest clone() {
        return (PurchaseReservedDBInstancesOfferingRequest) super.clone();
    }

}
