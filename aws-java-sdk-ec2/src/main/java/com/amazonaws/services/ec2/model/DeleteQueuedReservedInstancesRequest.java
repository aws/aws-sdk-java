/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteQueuedReservedInstancesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueuedReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteQueuedReservedInstancesRequest> {

    /**
     * <p>
     * The IDs of the Reserved Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> reservedInstancesIds;

    /**
     * <p>
     * The IDs of the Reserved Instances.
     * </p>
     * 
     * @return The IDs of the Reserved Instances.
     */

    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
            reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reservedInstancesIds;
    }

    /**
     * <p>
     * The IDs of the Reserved Instances.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of the Reserved Instances.
     */

    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesIds);
    }

    /**
     * <p>
     * The IDs of the Reserved Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesIds(java.util.Collection)} or {@link #withReservedInstancesIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of the Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (this.reservedInstancesIds == null) {
            setReservedInstancesIds(new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesIds.length));
        }
        for (String ele : reservedInstancesIds) {
            this.reservedInstancesIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Reserved Instances.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of the Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteQueuedReservedInstancesRequest> getDryRunRequest() {
        Request<DeleteQueuedReservedInstancesRequest> request = new DeleteQueuedReservedInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: ").append(getReservedInstancesIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteQueuedReservedInstancesRequest == false)
            return false;
        DeleteQueuedReservedInstancesRequest other = (DeleteQueuedReservedInstancesRequest) obj;
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteQueuedReservedInstancesRequest clone() {
        return (DeleteQueuedReservedInstancesRequest) super.clone();
    }
}
