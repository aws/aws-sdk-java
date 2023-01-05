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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to Amazon WorkDocs as your data source.
 * </p>
 * <p>
 * Amazon WorkDocs connector is available in Oregon, North Virginia, Sydney, Singapore and Ireland regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/WorkDocsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkDocsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the directory corresponding to your Amazon WorkDocs site repository.
     * </p>
     * <p>
     * You can find the organization ID in the <a href="https://console.aws.amazon.com/directoryservicev2/">Directory
     * Service</a> by going to <b>Active Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has
     * an ID, which is the organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service
     * console and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * <code>TRUE</code> to include comments on documents in your index. Including comments in your index means each
     * comment is a document that can be searched on.
     * </p>
     * <p>
     * The default is set to <code>FALSE</code>.
     * </p>
     */
    private Boolean crawlComments;
    /**
     * <p>
     * <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in the
     * index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in Amazon WorkDocs.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are included in the index. Files that don't match the patterns are excluded from the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are excluded from the index. Files that don’t match the patterns are included in the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source attributes or
     * field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Amazon WorkDocs fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The identifier of the directory corresponding to your Amazon WorkDocs site repository.
     * </p>
     * <p>
     * You can find the organization ID in the <a href="https://console.aws.amazon.com/directoryservicev2/">Directory
     * Service</a> by going to <b>Active Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has
     * an ID, which is the organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service
     * console and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the directory corresponding to your Amazon WorkDocs site repository.</p>
     *        <p>
     *        You can find the organization ID in the <a
     *        href="https://console.aws.amazon.com/directoryservicev2/">Directory Service</a> by going to <b>Active
     *        Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has an ID, which is the
     *        organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service console and
     *        enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the directory corresponding to your Amazon WorkDocs site repository.
     * </p>
     * <p>
     * You can find the organization ID in the <a href="https://console.aws.amazon.com/directoryservicev2/">Directory
     * Service</a> by going to <b>Active Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has
     * an ID, which is the organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service
     * console and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     * </p>
     * 
     * @return The identifier of the directory corresponding to your Amazon WorkDocs site repository.</p>
     *         <p>
     *         You can find the organization ID in the <a
     *         href="https://console.aws.amazon.com/directoryservicev2/">Directory Service</a> by going to <b>Active
     *         Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has an ID, which is the
     *         organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service console and
     *         enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of the directory corresponding to your Amazon WorkDocs site repository.
     * </p>
     * <p>
     * You can find the organization ID in the <a href="https://console.aws.amazon.com/directoryservicev2/">Directory
     * Service</a> by going to <b>Active Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has
     * an ID, which is the organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service
     * console and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the directory corresponding to your Amazon WorkDocs site repository.</p>
     *        <p>
     *        You can find the organization ID in the <a
     *        href="https://console.aws.amazon.com/directoryservicev2/">Directory Service</a> by going to <b>Active
     *        Directory</b>, then <b>Directories</b>. Your Amazon WorkDocs site directory has an ID, which is the
     *        organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service console and
     *        enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include comments on documents in your index. Including comments in your index means each
     * comment is a document that can be searched on.
     * </p>
     * <p>
     * The default is set to <code>FALSE</code>.
     * </p>
     * 
     * @param crawlComments
     *        <code>TRUE</code> to include comments on documents in your index. Including comments in your index means
     *        each comment is a document that can be searched on.</p>
     *        <p>
     *        The default is set to <code>FALSE</code>.
     */

    public void setCrawlComments(Boolean crawlComments) {
        this.crawlComments = crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include comments on documents in your index. Including comments in your index means each
     * comment is a document that can be searched on.
     * </p>
     * <p>
     * The default is set to <code>FALSE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to include comments on documents in your index. Including comments in your index means
     *         each comment is a document that can be searched on.</p>
     *         <p>
     *         The default is set to <code>FALSE</code>.
     */

    public Boolean getCrawlComments() {
        return this.crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to include comments on documents in your index. Including comments in your index means each
     * comment is a document that can be searched on.
     * </p>
     * <p>
     * The default is set to <code>FALSE</code>.
     * </p>
     * 
     * @param crawlComments
     *        <code>TRUE</code> to include comments on documents in your index. Including comments in your index means
     *        each comment is a document that can be searched on.</p>
     *        <p>
     *        The default is set to <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withCrawlComments(Boolean crawlComments) {
        setCrawlComments(crawlComments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include comments on documents in your index. Including comments in your index means each
     * comment is a document that can be searched on.
     * </p>
     * <p>
     * The default is set to <code>FALSE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to include comments on documents in your index. Including comments in your index means
     *         each comment is a document that can be searched on.</p>
     *         <p>
     *         The default is set to <code>FALSE</code>.
     */

    public Boolean isCrawlComments() {
        return this.crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in the
     * index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in Amazon WorkDocs.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in
     *        the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
     *        than to scan all of your documents in Amazon WorkDocs.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in the
     * index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in Amazon WorkDocs.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in
     *         the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
     *         than to scan all of your documents in Amazon WorkDocs.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in the
     * index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in Amazon WorkDocs.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in
     *        the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
     *        than to scan all of your documents in Amazon WorkDocs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in the
     * index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in Amazon WorkDocs.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Amazon WorkDocs change log to determine which documents require updating in
     *         the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
     *         than to scan all of your documents in Amazon WorkDocs.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are included in the index. Files that don't match the patterns are excluded from the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository.
     *         Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *         from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *         precedence and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are included in the index. Files that don't match the patterns are excluded from the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository.
     *        Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *        from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     */

    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are included in the index. Files that don't match the patterns are excluded from the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository.
     *        Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *        from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (this.inclusionPatterns == null) {
            setInclusionPatterns(new java.util.ArrayList<String>(inclusionPatterns.length));
        }
        for (String ele : inclusionPatterns) {
            this.inclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are included in the index. Files that don't match the patterns are excluded from the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository.
     *        Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     *        from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are excluded from the index. Files that don’t match the patterns are included in the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository.
     *         Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *         included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *         takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are excluded from the index. Files that don’t match the patterns are included in the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository.
     *        Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *        included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *        takes precedence and the file isn't included in the index.
     */

    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are excluded from the index. Files that don’t match the patterns are included in the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository.
     *        Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *        included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *        takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (this.exclusionPatterns == null) {
            setExclusionPatterns(new java.util.ArrayList<String>(exclusionPatterns.length));
        }
        for (String ele : exclusionPatterns) {
            this.exclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository. Files
     * that match the patterns are excluded from the index. Files that don’t match the patterns are included in the
     * index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     * file isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository.
     *        Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     *        included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern
     *        takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source attributes or
     * field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Amazon WorkDocs fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source
     *         attributes or field names to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to Amazon WorkDocs fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Amazon WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source attributes or
     * field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Amazon WorkDocs fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source
     *        attributes or field names to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Amazon WorkDocs fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Amazon WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
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
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source attributes or
     * field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Amazon WorkDocs fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source
     *        attributes or field names to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Amazon WorkDocs fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Amazon WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
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
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source attributes or
     * field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Amazon WorkDocs fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Amazon
     * WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map Amazon WorkDocs data source
     *        attributes or field names to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Amazon WorkDocs fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Amazon WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkDocsConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getCrawlComments() != null)
            sb.append("CrawlComments: ").append(getCrawlComments()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkDocsConfiguration == false)
            return false;
        WorkDocsConfiguration other = (WorkDocsConfiguration) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getCrawlComments() == null ^ this.getCrawlComments() == null)
            return false;
        if (other.getCrawlComments() != null && other.getCrawlComments().equals(this.getCrawlComments()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getCrawlComments() == null) ? 0 : getCrawlComments().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public WorkDocsConfiguration clone() {
        try {
            return (WorkDocsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.WorkDocsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
