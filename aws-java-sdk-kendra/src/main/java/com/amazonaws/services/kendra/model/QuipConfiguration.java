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
 * Provides the configuration information to connect to Quip as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/QuipConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuipConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this example
     * is "quipdomain".
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are required
     * to connect to your Quip. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accessToken—The token created in Quip. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * <code>TRUE</code> to index file comments.
     * </p>
     */
    private Boolean crawlFileComments;
    /**
     * <p>
     * <code>TRUE</code> to index the contents of chat rooms.
     * </p>
     */
    private Boolean crawlChatRooms;
    /**
     * <p>
     * <code>TRUE</code> to index attachments.
     * </p>
     */
    private Boolean crawlAttachments;
    /**
     * <p>
     * The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when you
     * access your folder in Quip. For example, <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The
     * folder ID in this example is "zlLuOVNSarTL".
     * </p>
     */
    private java.util.List<String> folderIds;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip threads
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> threadFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip messages
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> messageFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> attachmentFieldMappings;
    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Quip file system. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Quip file system. Files that match the
     * patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this example
     * is "quipdomain".
     * </p>
     * 
     * @param domain
     *        The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this
     *        example is "quipdomain".
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this example
     * is "quipdomain".
     * </p>
     * 
     * @return The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this
     *         example is "quipdomain".
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this example
     * is "quipdomain".
     * </p>
     * 
     * @param domain
     *        The Quip site domain. For example, <i>https://quip-company.quipdomain.com/browse</i>. The domain in this
     *        example is "quipdomain".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are required
     * to connect to your Quip. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accessToken—The token created in Quip. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are
     *        required to connect to your Quip. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        accessToken—The token created in Quip. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are required
     * to connect to your Quip. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accessToken—The token created in Quip. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are
     *         required to connect to your Quip. The secret must contain a JSON structure with the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         accessToken—The token created in Quip. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are required
     * to connect to your Quip. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accessToken—The token created in Quip. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are
     *        required to connect to your Quip. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        accessToken—The token created in Quip. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html">Using a Quip data source</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index file comments.
     * </p>
     * 
     * @param crawlFileComments
     *        <code>TRUE</code> to index file comments.
     */

    public void setCrawlFileComments(Boolean crawlFileComments) {
        this.crawlFileComments = crawlFileComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index file comments.
     * </p>
     * 
     * @return <code>TRUE</code> to index file comments.
     */

    public Boolean getCrawlFileComments() {
        return this.crawlFileComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index file comments.
     * </p>
     * 
     * @param crawlFileComments
     *        <code>TRUE</code> to index file comments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withCrawlFileComments(Boolean crawlFileComments) {
        setCrawlFileComments(crawlFileComments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index file comments.
     * </p>
     * 
     * @return <code>TRUE</code> to index file comments.
     */

    public Boolean isCrawlFileComments() {
        return this.crawlFileComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of chat rooms.
     * </p>
     * 
     * @param crawlChatRooms
     *        <code>TRUE</code> to index the contents of chat rooms.
     */

    public void setCrawlChatRooms(Boolean crawlChatRooms) {
        this.crawlChatRooms = crawlChatRooms;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of chat rooms.
     * </p>
     * 
     * @return <code>TRUE</code> to index the contents of chat rooms.
     */

    public Boolean getCrawlChatRooms() {
        return this.crawlChatRooms;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of chat rooms.
     * </p>
     * 
     * @param crawlChatRooms
     *        <code>TRUE</code> to index the contents of chat rooms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withCrawlChatRooms(Boolean crawlChatRooms) {
        setCrawlChatRooms(crawlChatRooms);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of chat rooms.
     * </p>
     * 
     * @return <code>TRUE</code> to index the contents of chat rooms.
     */

    public Boolean isCrawlChatRooms() {
        return this.crawlChatRooms;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to index attachments.
     */

    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments.
     * </p>
     * 
     * @return <code>TRUE</code> to index attachments.
     */

    public Boolean getCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to index attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        setCrawlAttachments(crawlAttachments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index attachments.
     * </p>
     * 
     * @return <code>TRUE</code> to index attachments.
     */

    public Boolean isCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when you
     * access your folder in Quip. For example, <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The
     * folder ID in this example is "zlLuOVNSarTL".
     * </p>
     * 
     * @return The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL
     *         when you access your folder in Quip. For example,
     *         <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The folder ID in this example is
     *         "zlLuOVNSarTL".
     */

    public java.util.List<String> getFolderIds() {
        return folderIds;
    }

    /**
     * <p>
     * The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when you
     * access your folder in Quip. For example, <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The
     * folder ID in this example is "zlLuOVNSarTL".
     * </p>
     * 
     * @param folderIds
     *        The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when
     *        you access your folder in Quip. For example,
     *        <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The folder ID in this example is
     *        "zlLuOVNSarTL".
     */

    public void setFolderIds(java.util.Collection<String> folderIds) {
        if (folderIds == null) {
            this.folderIds = null;
            return;
        }

        this.folderIds = new java.util.ArrayList<String>(folderIds);
    }

    /**
     * <p>
     * The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when you
     * access your folder in Quip. For example, <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The
     * folder ID in this example is "zlLuOVNSarTL".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFolderIds(java.util.Collection)} or {@link #withFolderIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param folderIds
     *        The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when
     *        you access your folder in Quip. For example,
     *        <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The folder ID in this example is
     *        "zlLuOVNSarTL".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withFolderIds(String... folderIds) {
        if (this.folderIds == null) {
            setFolderIds(new java.util.ArrayList<String>(folderIds.length));
        }
        for (String ele : folderIds) {
            this.folderIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when you
     * access your folder in Quip. For example, <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The
     * folder ID in this example is "zlLuOVNSarTL".
     * </p>
     * 
     * @param folderIds
     *        The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when
     *        you access your folder in Quip. For example,
     *        <i>https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name</i>. The folder ID in this example is
     *        "zlLuOVNSarTL".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withFolderIds(java.util.Collection<String> folderIds) {
        setFolderIds(folderIds);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip threads
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *         threads to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *         before you map to Quip fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Quip field names must exist in your Quip custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getThreadFieldMappings() {
        return threadFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip threads
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @param threadFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        threads to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     */

    public void setThreadFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> threadFieldMappings) {
        if (threadFieldMappings == null) {
            this.threadFieldMappings = null;
            return;
        }

        this.threadFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(threadFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip threads
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreadFieldMappings(java.util.Collection)} or {@link #withThreadFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param threadFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        threads to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withThreadFieldMappings(DataSourceToIndexFieldMapping... threadFieldMappings) {
        if (this.threadFieldMappings == null) {
            setThreadFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(threadFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : threadFieldMappings) {
            this.threadFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip threads
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @param threadFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        threads to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withThreadFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> threadFieldMappings) {
        setThreadFieldMappings(threadFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip messages
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *         messages to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to Quip fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Quip field names must exist in your Quip custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getMessageFieldMappings() {
        return messageFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip messages
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @param messageFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        messages to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     */

    public void setMessageFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> messageFieldMappings) {
        if (messageFieldMappings == null) {
            this.messageFieldMappings = null;
            return;
        }

        this.messageFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(messageFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip messages
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageFieldMappings(java.util.Collection)} or {@link #withMessageFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param messageFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        messages to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withMessageFieldMappings(DataSourceToIndexFieldMapping... messageFieldMappings) {
        if (this.messageFieldMappings == null) {
            setMessageFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(messageFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : messageFieldMappings) {
            this.messageFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip messages
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @param messageFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        messages to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withMessageFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> messageFieldMappings) {
        setMessageFieldMappings(messageFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *         attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to Quip fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Quip field names must exist in your Quip custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getAttachmentFieldMappings() {
        return attachmentFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     */

    public void setAttachmentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> attachmentFieldMappings) {
        if (attachmentFieldMappings == null) {
            this.attachmentFieldMappings = null;
            return;
        }

        this.attachmentFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(attachmentFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentFieldMappings(java.util.Collection)} or
     * {@link #withAttachmentFieldMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withAttachmentFieldMappings(DataSourceToIndexFieldMapping... attachmentFieldMappings) {
        if (this.attachmentFieldMappings == null) {
            setAttachmentFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(attachmentFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : attachmentFieldMappings) {
            this.attachmentFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to Quip fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Quip
     * field names must exist in your Quip custom metadata.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Quip
     *        attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to Quip fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Quip field names must exist in your Quip custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withAttachmentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> attachmentFieldMappings) {
        setAttachmentFieldMappings(attachmentFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Quip file system. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain files in your Quip file system. Files that match
     *         the patterns are included in the index. Files that don't match the patterns are excluded from the index.
     *         If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *         precedence, and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Quip file system. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Quip file system. Files that match
     *        the patterns are included in the index. Files that don't match the patterns are excluded from the index.
     *        If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence, and the file isn't included in the index.
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
     * A list of regular expression patterns to include certain files in your Quip file system. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Quip file system. Files that match
     *        the patterns are included in the index. Files that don't match the patterns are excluded from the index.
     *        If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence, and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns to include certain files in your Quip file system. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Quip file system. Files that match
     *        the patterns are included in the index. Files that don't match the patterns are excluded from the index.
     *        If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence, and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Quip file system. Files that match the
     * patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain files in your Quip file system. Files that match
     *         the patterns are excluded from the index. Files that don’t match the patterns are included in the index.
     *         If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *         precedence, and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Quip file system. Files that match the
     * patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Quip file system. Files that match
     *        the patterns are excluded from the index. Files that don’t match the patterns are included in the index.
     *        If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence, and the file isn't included in the index.
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
     * A list of regular expression patterns to exclude certain files in your Quip file system. Files that match the
     * patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Quip file system. Files that match
     *        the patterns are excluded from the index. Files that don’t match the patterns are included in the index.
     *        If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence, and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns to exclude certain files in your Quip file system. Files that match the
     * patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file
     * isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Quip file system. Files that match
     *        the patterns are excluded from the index. Files that don’t match the patterns are included in the index.
     *        If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence, and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuipConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getCrawlFileComments() != null)
            sb.append("CrawlFileComments: ").append(getCrawlFileComments()).append(",");
        if (getCrawlChatRooms() != null)
            sb.append("CrawlChatRooms: ").append(getCrawlChatRooms()).append(",");
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: ").append(getCrawlAttachments()).append(",");
        if (getFolderIds() != null)
            sb.append("FolderIds: ").append(getFolderIds()).append(",");
        if (getThreadFieldMappings() != null)
            sb.append("ThreadFieldMappings: ").append(getThreadFieldMappings()).append(",");
        if (getMessageFieldMappings() != null)
            sb.append("MessageFieldMappings: ").append(getMessageFieldMappings()).append(",");
        if (getAttachmentFieldMappings() != null)
            sb.append("AttachmentFieldMappings: ").append(getAttachmentFieldMappings()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuipConfiguration == false)
            return false;
        QuipConfiguration other = (QuipConfiguration) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getCrawlFileComments() == null ^ this.getCrawlFileComments() == null)
            return false;
        if (other.getCrawlFileComments() != null && other.getCrawlFileComments().equals(this.getCrawlFileComments()) == false)
            return false;
        if (other.getCrawlChatRooms() == null ^ this.getCrawlChatRooms() == null)
            return false;
        if (other.getCrawlChatRooms() != null && other.getCrawlChatRooms().equals(this.getCrawlChatRooms()) == false)
            return false;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getFolderIds() == null ^ this.getFolderIds() == null)
            return false;
        if (other.getFolderIds() != null && other.getFolderIds().equals(this.getFolderIds()) == false)
            return false;
        if (other.getThreadFieldMappings() == null ^ this.getThreadFieldMappings() == null)
            return false;
        if (other.getThreadFieldMappings() != null && other.getThreadFieldMappings().equals(this.getThreadFieldMappings()) == false)
            return false;
        if (other.getMessageFieldMappings() == null ^ this.getMessageFieldMappings() == null)
            return false;
        if (other.getMessageFieldMappings() != null && other.getMessageFieldMappings().equals(this.getMessageFieldMappings()) == false)
            return false;
        if (other.getAttachmentFieldMappings() == null ^ this.getAttachmentFieldMappings() == null)
            return false;
        if (other.getAttachmentFieldMappings() != null && other.getAttachmentFieldMappings().equals(this.getAttachmentFieldMappings()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getCrawlFileComments() == null) ? 0 : getCrawlFileComments().hashCode());
        hashCode = prime * hashCode + ((getCrawlChatRooms() == null) ? 0 : getCrawlChatRooms().hashCode());
        hashCode = prime * hashCode + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode + ((getFolderIds() == null) ? 0 : getFolderIds().hashCode());
        hashCode = prime * hashCode + ((getThreadFieldMappings() == null) ? 0 : getThreadFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getMessageFieldMappings() == null) ? 0 : getMessageFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getAttachmentFieldMappings() == null) ? 0 : getAttachmentFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public QuipConfiguration clone() {
        try {
            return (QuipConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.QuipConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
