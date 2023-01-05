/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An integration in list of integrations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListIntegrationItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntegrationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A map in which each key is an event type from an external application such as Segment or Shopify, and each value
     * is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the following event types:
     * <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>, <code>ShopifyUpdateCustomers</code>,
     * <code>ShopifyCreateDraftOrders</code>, <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>,
     * and <code>ShopifyUpdatedOrders</code>.
     * </p>
     */
    private java.util.Map<String, String> objectTypeNames;
    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     * ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     * </p>
     */
    private Boolean isUnstructured;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @return The URI of the S3 bucket or any other type of data source.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the domain was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @return The timestamp of when the domain was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the domain was most recently edited.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @return The timestamp of when the domain was most recently edited.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the domain was most recently edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ListIntegrationItem#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A map in which each key is an event type from an external application such as Segment or Shopify, and each value
     * is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the following event types:
     * <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>, <code>ShopifyUpdateCustomers</code>,
     * <code>ShopifyCreateDraftOrders</code>, <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>,
     * and <code>ShopifyUpdatedOrders</code>.
     * </p>
     * 
     * @return A map in which each key is an event type from an external application such as Segment or Shopify, and
     *         each value is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the
     *         following event types: <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>,
     *         <code>ShopifyUpdateCustomers</code>, <code>ShopifyCreateDraftOrders</code>,
     *         <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>, and
     *         <code>ShopifyUpdatedOrders</code>.
     */

    public java.util.Map<String, String> getObjectTypeNames() {
        return objectTypeNames;
    }

    /**
     * <p>
     * A map in which each key is an event type from an external application such as Segment or Shopify, and each value
     * is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the following event types:
     * <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>, <code>ShopifyUpdateCustomers</code>,
     * <code>ShopifyCreateDraftOrders</code>, <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>,
     * and <code>ShopifyUpdatedOrders</code>.
     * </p>
     * 
     * @param objectTypeNames
     *        A map in which each key is an event type from an external application such as Segment or Shopify, and each
     *        value is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the following
     *        event types: <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>,
     *        <code>ShopifyUpdateCustomers</code>, <code>ShopifyCreateDraftOrders</code>,
     *        <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>, and
     *        <code>ShopifyUpdatedOrders</code>.
     */

    public void setObjectTypeNames(java.util.Map<String, String> objectTypeNames) {
        this.objectTypeNames = objectTypeNames;
    }

    /**
     * <p>
     * A map in which each key is an event type from an external application such as Segment or Shopify, and each value
     * is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the following event types:
     * <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>, <code>ShopifyUpdateCustomers</code>,
     * <code>ShopifyCreateDraftOrders</code>, <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>,
     * and <code>ShopifyUpdatedOrders</code>.
     * </p>
     * 
     * @param objectTypeNames
     *        A map in which each key is an event type from an external application such as Segment or Shopify, and each
     *        value is an <code>ObjectTypeName</code> (template) used to ingest the event. It supports the following
     *        event types: <code>SegmentIdentify</code>, <code>ShopifyCreateCustomers</code>,
     *        <code>ShopifyUpdateCustomers</code>, <code>ShopifyCreateDraftOrders</code>,
     *        <code>ShopifyUpdateDraftOrders</code>, <code>ShopifyCreateOrders</code>, and
     *        <code>ShopifyUpdatedOrders</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withObjectTypeNames(java.util.Map<String, String> objectTypeNames) {
        setObjectTypeNames(objectTypeNames);
        return this;
    }

    /**
     * Add a single ObjectTypeNames entry
     *
     * @see ListIntegrationItem#withObjectTypeNames
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem addObjectTypeNamesEntry(String key, String value) {
        if (null == this.objectTypeNames) {
            this.objectTypeNames = new java.util.HashMap<String, String>();
        }
        if (this.objectTypeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.objectTypeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ObjectTypeNames.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem clearObjectTypeNamesEntries() {
        this.objectTypeNames = null;
        return this;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        Unique identifier for the workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @return Unique identifier for the workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        Unique identifier for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     * ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     * </p>
     * 
     * @param isUnstructured
     *        Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     *        ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     */

    public void setIsUnstructured(Boolean isUnstructured) {
        this.isUnstructured = isUnstructured;
    }

    /**
     * <p>
     * Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     * ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     * </p>
     * 
     * @return Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     *         ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     */

    public Boolean getIsUnstructured() {
        return this.isUnstructured;
    }

    /**
     * <p>
     * Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     * ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     * </p>
     * 
     * @param isUnstructured
     *        Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     *        ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationItem withIsUnstructured(Boolean isUnstructured) {
        setIsUnstructured(isUnstructured);
        return this;
    }

    /**
     * <p>
     * Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     * ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     * </p>
     * 
     * @return Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with
     *         ObjectTypeName equals _unstructured via API/CLI in flowDefinition
     */

    public Boolean isUnstructured() {
        return this.isUnstructured;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getObjectTypeNames() != null)
            sb.append("ObjectTypeNames: ").append(getObjectTypeNames()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getIsUnstructured() != null)
            sb.append("IsUnstructured: ").append(getIsUnstructured());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIntegrationItem == false)
            return false;
        ListIntegrationItem other = (ListIntegrationItem) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getObjectTypeNames() == null ^ this.getObjectTypeNames() == null)
            return false;
        if (other.getObjectTypeNames() != null && other.getObjectTypeNames().equals(this.getObjectTypeNames()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getIsUnstructured() == null ^ this.getIsUnstructured() == null)
            return false;
        if (other.getIsUnstructured() != null && other.getIsUnstructured().equals(this.getIsUnstructured()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeNames() == null) ? 0 : getObjectTypeNames().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getIsUnstructured() == null) ? 0 : getIsUnstructured().hashCode());
        return hashCode;
    }

    @Override
    public ListIntegrationItem clone() {
        try {
            return (ListIntegrationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ListIntegrationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
