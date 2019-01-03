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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesModificationsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeReservedInstancesModifications.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesModificationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeReservedInstancesModificationsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token for the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-date</code> - The time when the modification request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>effective-date</code> - The time when the modification becomes effective.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part of the
     * modification request. This ID is only available when the status of the modification is <code>fulfilled</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the new
     * Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-type</code> - The instance type of the new Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     * Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-modification-id</code> - The ID of the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     * <code>fulfilled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-date</code> - The time when the modification request was last updated.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * IDs for the submitted modification request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> reservedInstancesModificationIds;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token for the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-date</code> - The time when the modification request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>effective-date</code> - The time when the modification becomes effective.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part of the
     * modification request. This ID is only available when the status of the modification is <code>fulfilled</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the new
     * Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-type</code> - The instance type of the new Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     * Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-modification-id</code> - The ID of the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     * <code>fulfilled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-date</code> - The time when the modification request was last updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>client-token</code> - The idempotency token for the modification request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-date</code> - The time when the modification request was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>effective-date</code> - The time when the modification becomes effective.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as
     *         part of the modification request. This ID is only available when the status of the modification is
     *         <code>fulfilled</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the
     *         new Reserved Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved
     *         Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modification-result.target-configuration.instance-type</code> - The instance type of the new
     *         Reserved Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     *         Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-modification-id</code> - The ID of the modification request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code>
     *         | <code>fulfilled</code> | <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-message</code> - The reason for the status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>update-date</code> - The time when the modification request was last updated.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token for the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-date</code> - The time when the modification request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>effective-date</code> - The time when the modification becomes effective.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part of the
     * modification request. This ID is only available when the status of the modification is <code>fulfilled</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the new
     * Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-type</code> - The instance type of the new Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     * Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-modification-id</code> - The ID of the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     * <code>fulfilled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-date</code> - The time when the modification request was last updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token for the modification request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-date</code> - The time when the modification request was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>effective-date</code> - The time when the modification becomes effective.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part
     *        of the modification request. This ID is only available when the status of the modification is
     *        <code>fulfilled</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the
     *        new Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved
     *        Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.instance-type</code> - The instance type of the new
     *        Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     *        Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-modification-id</code> - The ID of the modification request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     *        <code>fulfilled</code> | <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The reason for the status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-date</code> - The time when the modification request was last updated.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token for the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-date</code> - The time when the modification request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>effective-date</code> - The time when the modification becomes effective.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part of the
     * modification request. This ID is only available when the status of the modification is <code>fulfilled</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the new
     * Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-type</code> - The instance type of the new Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     * Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-modification-id</code> - The ID of the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     * <code>fulfilled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-date</code> - The time when the modification request was last updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token for the modification request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-date</code> - The time when the modification request was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>effective-date</code> - The time when the modification becomes effective.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part
     *        of the modification request. This ID is only available when the status of the modification is
     *        <code>fulfilled</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the
     *        new Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved
     *        Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.instance-type</code> - The instance type of the new
     *        Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     *        Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-modification-id</code> - The ID of the modification request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     *        <code>fulfilled</code> | <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The reason for the status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-date</code> - The time when the modification request was last updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token for the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-date</code> - The time when the modification request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>effective-date</code> - The time when the modification becomes effective.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part of the
     * modification request. This ID is only available when the status of the modification is <code>fulfilled</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the new
     * Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.instance-type</code> - The instance type of the new Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     * Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-modification-id</code> - The ID of the modification request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     * <code>fulfilled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-date</code> - The time when the modification request was last updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token for the modification request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-date</code> - The time when the modification request was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>effective-date</code> - The time when the modification becomes effective.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.reserved-instances-id</code> - The ID for the Reserved Instances created as part
     *        of the modification request. This ID is only available when the status of the modification is
     *        <code>fulfilled</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.availability-zone</code> - The Availability Zone for the
     *        new Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.instance-count </code> - The number of new Reserved
     *        Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.instance-type</code> - The instance type of the new
     *        Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modification-result.target-configuration.platform</code> - The network platform of the new Reserved
     *        Instances (<code>EC2-Classic</code> | <code>EC2-VPC</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instances modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-modification-id</code> - The ID of the modification request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the Reserved Instances modification request (<code>processing</code> |
     *        <code>fulfilled</code> | <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The reason for the status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-date</code> - The time when the modification request was last updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * IDs for the submitted modification request.
     * </p>
     * 
     * @return IDs for the submitted modification request.
     */

    public java.util.List<String> getReservedInstancesModificationIds() {
        if (reservedInstancesModificationIds == null) {
            reservedInstancesModificationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reservedInstancesModificationIds;
    }

    /**
     * <p>
     * IDs for the submitted modification request.
     * </p>
     * 
     * @param reservedInstancesModificationIds
     *        IDs for the submitted modification request.
     */

    public void setReservedInstancesModificationIds(java.util.Collection<String> reservedInstancesModificationIds) {
        if (reservedInstancesModificationIds == null) {
            this.reservedInstancesModificationIds = null;
            return;
        }

        this.reservedInstancesModificationIds = new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesModificationIds);
    }

    /**
     * <p>
     * IDs for the submitted modification request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesModificationIds(java.util.Collection)} or
     * {@link #withReservedInstancesModificationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesModificationIds
     *        IDs for the submitted modification request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsRequest withReservedInstancesModificationIds(String... reservedInstancesModificationIds) {
        if (this.reservedInstancesModificationIds == null) {
            setReservedInstancesModificationIds(new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesModificationIds.length));
        }
        for (String ele : reservedInstancesModificationIds) {
            this.reservedInstancesModificationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IDs for the submitted modification request.
     * </p>
     * 
     * @param reservedInstancesModificationIds
     *        IDs for the submitted modification request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsRequest withReservedInstancesModificationIds(java.util.Collection<String> reservedInstancesModificationIds) {
        setReservedInstancesModificationIds(reservedInstancesModificationIds);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesModificationsRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesModificationsRequest> request = new DescribeReservedInstancesModificationsRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getReservedInstancesModificationIds() != null)
            sb.append("ReservedInstancesModificationIds: ").append(getReservedInstancesModificationIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesModificationsRequest == false)
            return false;
        DescribeReservedInstancesModificationsRequest other = (DescribeReservedInstancesModificationsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getReservedInstancesModificationIds() == null ^ this.getReservedInstancesModificationIds() == null)
            return false;
        if (other.getReservedInstancesModificationIds() != null
                && other.getReservedInstancesModificationIds().equals(this.getReservedInstancesModificationIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesModificationIds() == null) ? 0 : getReservedInstancesModificationIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesModificationsRequest clone() {
        return (DescribeReservedInstancesModificationsRequest) super.clone();
    }
}
