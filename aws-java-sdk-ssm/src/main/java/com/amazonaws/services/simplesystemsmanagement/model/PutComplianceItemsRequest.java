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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutComplianceItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutComplianceItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the instance ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or
     * Custom:<code>string</code>.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type of execution (for example,
     * <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     */
    private ComplianceExecutionSummary executionSummary;
    /**
     * <p>
     * Information about the compliance as defined by the resource type. For example, for a patch compliance type,
     * <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ComplianceItemEntry> items;
    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten
     * or ignored. If the content hashes match, the request to put compliance information is ignored.
     * </p>
     */
    private String itemContentHash;

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the instance ID.
     * </p>
     * 
     * @param resourceId
     *        Specify an ID for this resource. For a managed instance, this is the instance ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the instance ID.
     * </p>
     * 
     * @return Specify an ID for this resource. For a managed instance, this is the instance ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specify an ID for this resource. For a managed instance, this is the instance ID.
     * </p>
     * 
     * @param resourceId
     *        Specify an ID for this resource. For a managed instance, this is the instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     * 
     * @param resourceType
     *        Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     * 
     * @return Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * </p>
     * 
     * @param resourceType
     *        Specify the type of resource. <code>ManagedInstance</code> is currently the only supported resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or
     * Custom:<code>string</code>.
     * </p>
     * 
     * @param complianceType
     *        Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or
     *        Custom:<code>string</code>.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or
     * Custom:<code>string</code>.
     * </p>
     * 
     * @return Specify the compliance type. For example, specify Association (for a State Manager association), Patch,
     *         or Custom:<code>string</code>.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or
     * Custom:<code>string</code>.
     * </p>
     * 
     * @param complianceType
     *        Specify the compliance type. For example, specify Association (for a State Manager association), Patch, or
     *        Custom:<code>string</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type of execution (for example,
     * <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * 
     * @param executionSummary
     *        A summary of the call execution that includes an execution ID, the type of execution (for example,
     *        <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the
     *        following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     */

    public void setExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type of execution (for example,
     * <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * 
     * @return A summary of the call execution that includes an execution ID, the type of execution (for example,
     *         <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the
     *         following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     */

    public ComplianceExecutionSummary getExecutionSummary() {
        return this.executionSummary;
    }

    /**
     * <p>
     * A summary of the call execution that includes an execution ID, the type of execution (for example,
     * <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * </p>
     * 
     * @param executionSummary
     *        A summary of the call execution that includes an execution ID, the type of execution (for example,
     *        <code>Command</code>), and the date/time of the execution using a datetime object that is saved in the
     *        following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withExecutionSummary(ComplianceExecutionSummary executionSummary) {
        setExecutionSummary(executionSummary);
        return this;
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For example, for a patch compliance type,
     * <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * </p>
     * 
     * @return Information about the compliance as defined by the resource type. For example, for a patch compliance
     *         type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     */

    public java.util.List<ComplianceItemEntry> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<ComplianceItemEntry>();
        }
        return items;
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For example, for a patch compliance type,
     * <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * </p>
     * 
     * @param items
     *        Information about the compliance as defined by the resource type. For example, for a patch compliance
     *        type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     */

    public void setItems(java.util.Collection<ComplianceItemEntry> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<ComplianceItemEntry>(items);
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For example, for a patch compliance type,
     * <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Information about the compliance as defined by the resource type. For example, for a patch compliance
     *        type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withItems(ComplianceItemEntry... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<ComplianceItemEntry>(items.length));
        }
        for (ComplianceItemEntry ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the compliance as defined by the resource type. For example, for a patch compliance type,
     * <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * </p>
     * 
     * @param items
     *        Information about the compliance as defined by the resource type. For example, for a patch compliance
     *        type, <code>Items</code> includes information about the PatchSeverity, Classification, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withItems(java.util.Collection<ComplianceItemEntry> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten
     * or ignored. If the content hashes match, the request to put compliance information is ignored.
     * </p>
     * 
     * @param itemContentHash
     *        MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be
     *        overwritten or ignored. If the content hashes match, the request to put compliance information is ignored.
     */

    public void setItemContentHash(String itemContentHash) {
        this.itemContentHash = itemContentHash;
    }

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten
     * or ignored. If the content hashes match, the request to put compliance information is ignored.
     * </p>
     * 
     * @return MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be
     *         overwritten or ignored. If the content hashes match, the request to put compliance information is
     *         ignored.
     */

    public String getItemContentHash() {
        return this.itemContentHash;
    }

    /**
     * <p>
     * MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be overwritten
     * or ignored. If the content hashes match, the request to put compliance information is ignored.
     * </p>
     * 
     * @param itemContentHash
     *        MD5 or SHA-256 content hash. The content hash is used to determine if existing information should be
     *        overwritten or ignored. If the content hashes match, the request to put compliance information is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComplianceItemsRequest withItemContentHash(String itemContentHash) {
        setItemContentHash(itemContentHash);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getExecutionSummary() != null)
            sb.append("ExecutionSummary: ").append(getExecutionSummary()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getItemContentHash() != null)
            sb.append("ItemContentHash: ").append(getItemContentHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutComplianceItemsRequest == false)
            return false;
        PutComplianceItemsRequest other = (PutComplianceItemsRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null)
            return false;
        if (other.getExecutionSummary() != null && other.getExecutionSummary().equals(this.getExecutionSummary()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getItemContentHash() == null ^ this.getItemContentHash() == null)
            return false;
        if (other.getItemContentHash() != null && other.getItemContentHash().equals(this.getItemContentHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getItemContentHash() == null) ? 0 : getItemContentHash().hashCode());
        return hashCode;
    }

    @Override
    public PutComplianceItemsRequest clone() {
        return (PutComplianceItemsRequest) super.clone();
    }

}
