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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeResourceScan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceScanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     * .
     * </p>
     */
    private String resourceScanId;
    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     */
    private Double percentageCompleted;
    /**
     * <p>
     * The list of resource types for the specified scan. Resource types are only available for scans with a
     * <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The number of resources that were listed. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     */
    private Integer resourcesScanned;
    /**
     * <p>
     * The number of resources that were read. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * <note>
     * <p>
     * This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     * </p>
     * </note>
     */
    private Integer resourcesRead;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     * .
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan. The format is
     *        <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     *        <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     *        .
     */

    public void setResourceScanId(String resourceScanId) {
        this.resourceScanId = resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource scan. The format is
     *         <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     *         <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     *         .
     */

    public String getResourceScanId() {
        return this.resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     * .
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan. The format is
     *        <code>arn:${Partition}:cloudformation:${Region}:${Account}:resourceScan/${Id}</code>. An example is
     *        <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:resourceScan/<i>f5b490f7-7ed4-428a-aa06-31ff25db0772</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withResourceScanId(String resourceScanId) {
        setResourceScanId(resourceScanId);
        return this;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Status of the resource scan.</p>
     *        <dl>
     *        <dt>INPROGRESS</dt>
     *        <dd>
     *        <p>
     *        The resource scan is still in progress.
     *        </p>
     *        </dd>
     *        <dt>COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The resource scan is complete.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has expired.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has failed.
     *        </p>
     *        </dd>
     * @see ResourceScanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Status of the resource scan.</p>
     *         <dl>
     *         <dt>INPROGRESS</dt>
     *         <dd>
     *         <p>
     *         The resource scan is still in progress.
     *         </p>
     *         </dd>
     *         <dt>COMPLETE</dt>
     *         <dd>
     *         <p>
     *         The resource scan is complete.
     *         </p>
     *         </dd>
     *         <dt>EXPIRED</dt>
     *         <dd>
     *         <p>
     *         The resource scan has expired.
     *         </p>
     *         </dd>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         The resource scan has failed.
     *         </p>
     *         </dd>
     * @see ResourceScanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Status of the resource scan.</p>
     *        <dl>
     *        <dt>INPROGRESS</dt>
     *        <dd>
     *        <p>
     *        The resource scan is still in progress.
     *        </p>
     *        </dd>
     *        <dt>COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The resource scan is complete.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has expired.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanStatus
     */

    public DescribeResourceScanResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the resource scan.
     * </p>
     * <dl>
     * <dt>INPROGRESS</dt>
     * <dd>
     * <p>
     * The resource scan is still in progress.
     * </p>
     * </dd>
     * <dt>COMPLETE</dt>
     * <dd>
     * <p>
     * The resource scan is complete.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The resource scan has expired.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The resource scan has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Status of the resource scan.</p>
     *        <dl>
     *        <dt>INPROGRESS</dt>
     *        <dd>
     *        <p>
     *        The resource scan is still in progress.
     *        </p>
     *        </dd>
     *        <dt>COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The resource scan is complete.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has expired.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The resource scan has failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanStatus
     */

    public DescribeResourceScanResult withStatus(ResourceScanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     * 
     * @param statusReason
     *        The reason for the resource scan status, providing more information if a failure happened.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     * 
     * @return The reason for the resource scan status, providing more information if a failure happened.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the resource scan status, providing more information if a failure happened.
     * </p>
     * 
     * @param statusReason
     *        The reason for the resource scan status, providing more information if a failure happened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     * 
     * @param startTime
     *        The time that the resource scan was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     * 
     * @return The time that the resource scan was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the resource scan was started.
     * </p>
     * 
     * @param startTime
     *        The time that the resource scan was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     * 
     * @param endTime
     *        The time that the resource scan was finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     * 
     * @return The time that the resource scan was finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the resource scan was finished.
     * </p>
     * 
     * @param endTime
     *        The time that the resource scan was finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     * 
     * @param percentageCompleted
     *        The percentage of the resource scan that has been completed.
     */

    public void setPercentageCompleted(Double percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     * 
     * @return The percentage of the resource scan that has been completed.
     */

    public Double getPercentageCompleted() {
        return this.percentageCompleted;
    }

    /**
     * <p>
     * The percentage of the resource scan that has been completed.
     * </p>
     * 
     * @param percentageCompleted
     *        The percentage of the resource scan that has been completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withPercentageCompleted(Double percentageCompleted) {
        setPercentageCompleted(percentageCompleted);
        return this;
    }

    /**
     * <p>
     * The list of resource types for the specified scan. Resource types are only available for scans with a
     * <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * </p>
     * 
     * @return The list of resource types for the specified scan. Resource types are only available for scans with a
     *         <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The list of resource types for the specified scan. Resource types are only available for scans with a
     * <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types for the specified scan. Resource types are only available for scans with a
     *        <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * The list of resource types for the specified scan. Resource types are only available for scans with a
     * <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types for the specified scan. Resource types are only available for scans with a
     *        <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resource types for the specified scan. Resource types are only available for scans with a
     * <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types for the specified scan. Resource types are only available for scans with a
     *        <code>Status</code> set to <code>COMPLETE</code> or <code>FAILED </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The number of resources that were listed. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * 
     * @param resourcesScanned
     *        The number of resources that were listed. This is only available for scans with a <code>Status</code> set
     *        to <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     */

    public void setResourcesScanned(Integer resourcesScanned) {
        this.resourcesScanned = resourcesScanned;
    }

    /**
     * <p>
     * The number of resources that were listed. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * 
     * @return The number of resources that were listed. This is only available for scans with a <code>Status</code> set
     *         to <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     */

    public Integer getResourcesScanned() {
        return this.resourcesScanned;
    }

    /**
     * <p>
     * The number of resources that were listed. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * 
     * @param resourcesScanned
     *        The number of resources that were listed. This is only available for scans with a <code>Status</code> set
     *        to <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withResourcesScanned(Integer resourcesScanned) {
        setResourcesScanned(resourcesScanned);
        return this;
    }

    /**
     * <p>
     * The number of resources that were read. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * <note>
     * <p>
     * This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     * </p>
     * </note>
     * 
     * @param resourcesRead
     *        The number of resources that were read. This is only available for scans with a <code>Status</code> set to
     *        <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.</p> <note>
     *        <p>
     *        This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     *        </p>
     */

    public void setResourcesRead(Integer resourcesRead) {
        this.resourcesRead = resourcesRead;
    }

    /**
     * <p>
     * The number of resources that were read. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * <note>
     * <p>
     * This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     * </p>
     * </note>
     * 
     * @return The number of resources that were read. This is only available for scans with a <code>Status</code> set
     *         to <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.</p> <note>
     *         <p>
     *         This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     *         </p>
     */

    public Integer getResourcesRead() {
        return this.resourcesRead;
    }

    /**
     * <p>
     * The number of resources that were read. This is only available for scans with a <code>Status</code> set to
     * <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.
     * </p>
     * <note>
     * <p>
     * This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     * </p>
     * </note>
     * 
     * @param resourcesRead
     *        The number of resources that were read. This is only available for scans with a <code>Status</code> set to
     *        <code>COMPLETE</code>, <code>EXPIRED</code>, or <code>FAILED </code>.</p> <note>
     *        <p>
     *        This field may be 0 if the resource scan failed with a <code>ResourceScanLimitExceededException</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceScanResult withResourcesRead(Integer resourcesRead) {
        setResourcesRead(resourcesRead);
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
        if (getResourceScanId() != null)
            sb.append("ResourceScanId: ").append(getResourceScanId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPercentageCompleted() != null)
            sb.append("PercentageCompleted: ").append(getPercentageCompleted()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getResourcesScanned() != null)
            sb.append("ResourcesScanned: ").append(getResourcesScanned()).append(",");
        if (getResourcesRead() != null)
            sb.append("ResourcesRead: ").append(getResourcesRead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceScanResult == false)
            return false;
        DescribeResourceScanResult other = (DescribeResourceScanResult) obj;
        if (other.getResourceScanId() == null ^ this.getResourceScanId() == null)
            return false;
        if (other.getResourceScanId() != null && other.getResourceScanId().equals(this.getResourceScanId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPercentageCompleted() == null ^ this.getPercentageCompleted() == null)
            return false;
        if (other.getPercentageCompleted() != null && other.getPercentageCompleted().equals(this.getPercentageCompleted()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getResourcesScanned() == null ^ this.getResourcesScanned() == null)
            return false;
        if (other.getResourcesScanned() != null && other.getResourcesScanned().equals(this.getResourcesScanned()) == false)
            return false;
        if (other.getResourcesRead() == null ^ this.getResourcesRead() == null)
            return false;
        if (other.getResourcesRead() != null && other.getResourcesRead().equals(this.getResourcesRead()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceScanId() == null) ? 0 : getResourceScanId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPercentageCompleted() == null) ? 0 : getPercentageCompleted().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getResourcesScanned() == null) ? 0 : getResourcesScanned().hashCode());
        hashCode = prime * hashCode + ((getResourcesRead() == null) ? 0 : getResourcesRead().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceScanResult clone() {
        try {
            return (DescribeResourceScanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
