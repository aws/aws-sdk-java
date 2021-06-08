/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines configuration for syncing a Salesforce chatter feed. The contents of the object comes from the Salesforce
 * FeedItem table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SalesforceChatterFeedConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceChatterFeedConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this is the
     * <code>Body</code> column.
     * </p>
     */
    private String documentDataFieldName;
    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     * typically the <code>Title</code> column.
     * </p>
     */
    private String documentTitleFieldName;
    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;
    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code> only
     * documents from users who have an active account are indexed. When you specify <code>STANDARD_USER</code> only
     * documents for Salesforce standard users are documented. You can specify both.
     * </p>
     */
    private java.util.List<String> includeFilterTypes;

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this is the
     * <code>Body</code> column.
     * </p>
     * 
     * @param documentDataFieldName
     *        The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this
     *        is the <code>Body</code> column.
     */

    public void setDocumentDataFieldName(String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this is the
     * <code>Body</code> column.
     * </p>
     * 
     * @return The name of the column in the Salesforce FeedItem table that contains the content to index. Typically
     *         this is the <code>Body</code> column.
     */

    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this is the
     * <code>Body</code> column.
     * </p>
     * 
     * @param documentDataFieldName
     *        The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this
     *        is the <code>Body</code> column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceChatterFeedConfiguration withDocumentDataFieldName(String documentDataFieldName) {
        setDocumentDataFieldName(documentDataFieldName);
        return this;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     * typically the <code>Title</code> column.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     *        typically the <code>Title</code> column.
     */

    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     * typically the <code>Title</code> column.
     * </p>
     * 
     * @return The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     *         typically the <code>Title</code> column.
     */

    public String getDocumentTitleFieldName() {
        return this.documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     * typically the <code>Title</code> column.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The name of the column in the Salesforce FeedItem table that contains the title of the document. This is
     *        typically the <code>Title</code> column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceChatterFeedConfiguration withDocumentTitleFieldName(String documentTitleFieldName) {
        setDocumentTitleFieldName(documentTitleFieldName);
        return this;
    }

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * </p>
     * 
     * @return Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * </p>
     * 
     * @param fieldMappings
     *        Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceChatterFeedConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * </p>
     * 
     * @param fieldMappings
     *        Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceChatterFeedConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code> only
     * documents from users who have an active account are indexed. When you specify <code>STANDARD_USER</code> only
     * documents for Salesforce standard users are documented. You can specify both.
     * </p>
     * 
     * @return Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code>
     *         only documents from users who have an active account are indexed. When you specify
     *         <code>STANDARD_USER</code> only documents for Salesforce standard users are documented. You can specify
     *         both.
     * @see SalesforceChatterFeedIncludeFilterType
     */

    public java.util.List<String> getIncludeFilterTypes() {
        return includeFilterTypes;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code> only
     * documents from users who have an active account are indexed. When you specify <code>STANDARD_USER</code> only
     * documents for Salesforce standard users are documented. You can specify both.
     * </p>
     * 
     * @param includeFilterTypes
     *        Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code>
     *        only documents from users who have an active account are indexed. When you specify
     *        <code>STANDARD_USER</code> only documents for Salesforce standard users are documented. You can specify
     *        both.
     * @see SalesforceChatterFeedIncludeFilterType
     */

    public void setIncludeFilterTypes(java.util.Collection<String> includeFilterTypes) {
        if (includeFilterTypes == null) {
            this.includeFilterTypes = null;
            return;
        }

        this.includeFilterTypes = new java.util.ArrayList<String>(includeFilterTypes);
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code> only
     * documents from users who have an active account are indexed. When you specify <code>STANDARD_USER</code> only
     * documents for Salesforce standard users are documented. You can specify both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeFilterTypes(java.util.Collection)} or {@link #withIncludeFilterTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param includeFilterTypes
     *        Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code>
     *        only documents from users who have an active account are indexed. When you specify
     *        <code>STANDARD_USER</code> only documents for Salesforce standard users are documented. You can specify
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceChatterFeedIncludeFilterType
     */

    public SalesforceChatterFeedConfiguration withIncludeFilterTypes(String... includeFilterTypes) {
        if (this.includeFilterTypes == null) {
            setIncludeFilterTypes(new java.util.ArrayList<String>(includeFilterTypes.length));
        }
        for (String ele : includeFilterTypes) {
            this.includeFilterTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code> only
     * documents from users who have an active account are indexed. When you specify <code>STANDARD_USER</code> only
     * documents for Salesforce standard users are documented. You can specify both.
     * </p>
     * 
     * @param includeFilterTypes
     *        Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code>
     *        only documents from users who have an active account are indexed. When you specify
     *        <code>STANDARD_USER</code> only documents for Salesforce standard users are documented. You can specify
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceChatterFeedIncludeFilterType
     */

    public SalesforceChatterFeedConfiguration withIncludeFilterTypes(java.util.Collection<String> includeFilterTypes) {
        setIncludeFilterTypes(includeFilterTypes);
        return this;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code> only
     * documents from users who have an active account are indexed. When you specify <code>STANDARD_USER</code> only
     * documents for Salesforce standard users are documented. You can specify both.
     * </p>
     * 
     * @param includeFilterTypes
     *        Filters the documents in the feed based on status of the user. When you specify <code>ACTIVE_USERS</code>
     *        only documents from users who have an active account are indexed. When you specify
     *        <code>STANDARD_USER</code> only documents for Salesforce standard users are documented. You can specify
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceChatterFeedIncludeFilterType
     */

    public SalesforceChatterFeedConfiguration withIncludeFilterTypes(SalesforceChatterFeedIncludeFilterType... includeFilterTypes) {
        java.util.ArrayList<String> includeFilterTypesCopy = new java.util.ArrayList<String>(includeFilterTypes.length);
        for (SalesforceChatterFeedIncludeFilterType value : includeFilterTypes) {
            includeFilterTypesCopy.add(value.toString());
        }
        if (getIncludeFilterTypes() == null) {
            setIncludeFilterTypes(includeFilterTypesCopy);
        } else {
            getIncludeFilterTypes().addAll(includeFilterTypesCopy);
        }
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
        if (getDocumentDataFieldName() != null)
            sb.append("DocumentDataFieldName: ").append(getDocumentDataFieldName()).append(",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: ").append(getDocumentTitleFieldName()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings()).append(",");
        if (getIncludeFilterTypes() != null)
            sb.append("IncludeFilterTypes: ").append(getIncludeFilterTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceChatterFeedConfiguration == false)
            return false;
        SalesforceChatterFeedConfiguration other = (SalesforceChatterFeedConfiguration) obj;
        if (other.getDocumentDataFieldName() == null ^ this.getDocumentDataFieldName() == null)
            return false;
        if (other.getDocumentDataFieldName() != null && other.getDocumentDataFieldName().equals(this.getDocumentDataFieldName()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getIncludeFilterTypes() == null ^ this.getIncludeFilterTypes() == null)
            return false;
        if (other.getIncludeFilterTypes() != null && other.getIncludeFilterTypes().equals(this.getIncludeFilterTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentDataFieldName() == null) ? 0 : getDocumentDataFieldName().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getIncludeFilterTypes() == null) ? 0 : getIncludeFilterTypes().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceChatterFeedConfiguration clone() {
        try {
            return (SalesforceChatterFeedConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SalesforceChatterFeedConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
