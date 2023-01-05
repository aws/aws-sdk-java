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
 * Provides the configuration information to connect to Box as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BoxConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoxConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console
     * settings or when you create an app in Box and download your authentication credentials. For example,
     * <i>801234567</i>.
     * </p>
     */
    private String enterpriseId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Box platform. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * publicKeyId—The identifier of the public key contained within an identity certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * privateKey—A set of characters that make up an encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * passphrase—A set of characters that act like a password.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You create an application in Box to generate the keys or credentials required for the secret. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box data
     * source</a>.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log than
     * to scan all of your documents.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * <code>TRUE</code> to index comments.
     * </p>
     */
    private Boolean crawlComments;
    /**
     * <p>
     * <code>TRUE</code> to index the contents of tasks.
     * </p>
     */
    private Boolean crawlTasks;
    /**
     * <p>
     * <code>TRUE</code> to index web links.
     * </p>
     */
    private Boolean crawlWebLinks;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box files to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fileFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box tasks to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> taskFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box comments
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> commentFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web links
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> webLinkFieldMappings;
    /**
     * <p>
     * A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     * folders that match the patterns are included in the index. Files and folders that don't match the patterns are
     * excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion
     * pattern takes precedence and the file or folder isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain files and folders from your Box platform. Files and
     * folders that match the patterns are excluded from the index.Files and folders that don't match the patterns are
     * included in the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the file or folder isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console
     * settings or when you create an app in Box and download your authentication credentials. For example,
     * <i>801234567</i>.
     * </p>
     * 
     * @param enterpriseId
     *        The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console
     *        settings or when you create an app in Box and download your authentication credentials. For example,
     *        <i>801234567</i>.
     */

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * <p>
     * The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console
     * settings or when you create an app in Box and download your authentication credentials. For example,
     * <i>801234567</i>.
     * </p>
     * 
     * @return The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer
     *         Console settings or when you create an app in Box and download your authentication credentials. For
     *         example, <i>801234567</i>.
     */

    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * <p>
     * The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console
     * settings or when you create an app in Box and download your authentication credentials. For example,
     * <i>801234567</i>.
     * </p>
     * 
     * @param enterpriseId
     *        The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console
     *        settings or when you create an app in Box and download your authentication credentials. For example,
     *        <i>801234567</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withEnterpriseId(String enterpriseId) {
        setEnterpriseId(enterpriseId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Box platform. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * publicKeyId—The identifier of the public key contained within an identity certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * privateKey—A set of characters that make up an encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * passphrase—A set of characters that act like a password.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You create an application in Box to generate the keys or credentials required for the secret. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box data
     * source</a>.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Box platform. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        publicKeyId—The identifier of the public key contained within an identity certificate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        privateKey—A set of characters that make up an encryption key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        passphrase—A set of characters that act like a password.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You create an application in Box to generate the keys or credentials required for the secret. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box
     *        data source</a>.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Box platform. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * publicKeyId—The identifier of the public key contained within an identity certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * privateKey—A set of characters that make up an encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * passphrase—A set of characters that act like a password.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You create an application in Box to generate the keys or credentials required for the secret. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box data
     * source</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *         connect to your Box platform. The secret must contain a JSON structure with the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         publicKeyId—The identifier of the public key contained within an identity certificate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         privateKey—A set of characters that make up an encryption key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         passphrase—A set of characters that act like a password.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You create an application in Box to generate the keys or credentials required for the secret. For more
     *         information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box
     *         data source</a>.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Box platform. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     * </p>
     * </li>
     * <li>
     * <p>
     * publicKeyId—The identifier of the public key contained within an identity certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * privateKey—A set of characters that make up an encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * passphrase—A set of characters that act like a password.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You create an application in Box to generate the keys or credentials required for the secret. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box data
     * source</a>.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Box platform. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        clientID—The identifier of the client OAuth 2.0 authentication application created in Box.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        publicKeyId—The identifier of the public key contained within an identity certificate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        privateKey—A set of characters that make up an encryption key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        passphrase—A set of characters that act like a password.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You create an application in Box to generate the keys or credentials required for the secret. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html">Using a Box
     *        data source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log than
     * to scan all of your documents.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *        Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log
     *        than to scan all of your documents.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log than
     * to scan all of your documents.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *         Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change
     *         log than to scan all of your documents.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log than
     * to scan all of your documents.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *        Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log
     *        than to scan all of your documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     * Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log than
     * to scan all of your documents.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Slack change log to determine which documents require updating in the index.
     *         Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change
     *         log than to scan all of your documents.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments.
     * </p>
     * 
     * @param crawlComments
     *        <code>TRUE</code> to index comments.
     */

    public void setCrawlComments(Boolean crawlComments) {
        this.crawlComments = crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments.
     * </p>
     * 
     * @return <code>TRUE</code> to index comments.
     */

    public Boolean getCrawlComments() {
        return this.crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments.
     * </p>
     * 
     * @param crawlComments
     *        <code>TRUE</code> to index comments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withCrawlComments(Boolean crawlComments) {
        setCrawlComments(crawlComments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments.
     * </p>
     * 
     * @return <code>TRUE</code> to index comments.
     */

    public Boolean isCrawlComments() {
        return this.crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of tasks.
     * </p>
     * 
     * @param crawlTasks
     *        <code>TRUE</code> to index the contents of tasks.
     */

    public void setCrawlTasks(Boolean crawlTasks) {
        this.crawlTasks = crawlTasks;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of tasks.
     * </p>
     * 
     * @return <code>TRUE</code> to index the contents of tasks.
     */

    public Boolean getCrawlTasks() {
        return this.crawlTasks;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of tasks.
     * </p>
     * 
     * @param crawlTasks
     *        <code>TRUE</code> to index the contents of tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withCrawlTasks(Boolean crawlTasks) {
        setCrawlTasks(crawlTasks);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index the contents of tasks.
     * </p>
     * 
     * @return <code>TRUE</code> to index the contents of tasks.
     */

    public Boolean isCrawlTasks() {
        return this.crawlTasks;
    }

    /**
     * <p>
     * <code>TRUE</code> to index web links.
     * </p>
     * 
     * @param crawlWebLinks
     *        <code>TRUE</code> to index web links.
     */

    public void setCrawlWebLinks(Boolean crawlWebLinks) {
        this.crawlWebLinks = crawlWebLinks;
    }

    /**
     * <p>
     * <code>TRUE</code> to index web links.
     * </p>
     * 
     * @return <code>TRUE</code> to index web links.
     */

    public Boolean getCrawlWebLinks() {
        return this.crawlWebLinks;
    }

    /**
     * <p>
     * <code>TRUE</code> to index web links.
     * </p>
     * 
     * @param crawlWebLinks
     *        <code>TRUE</code> to index web links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withCrawlWebLinks(Boolean crawlWebLinks) {
        setCrawlWebLinks(crawlWebLinks);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index web links.
     * </p>
     * 
     * @return <code>TRUE</code> to index web links.
     */

    public Boolean isCrawlWebLinks() {
        return this.crawlWebLinks;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box files to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *         files to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *         before you map to Box fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Box field names must exist in your Box custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFileFieldMappings() {
        return fileFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box files to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param fileFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        files to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     */

    public void setFileFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fileFieldMappings) {
        if (fileFieldMappings == null) {
            this.fileFieldMappings = null;
            return;
        }

        this.fileFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fileFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box files to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileFieldMappings(java.util.Collection)} or {@link #withFileFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fileFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        files to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withFileFieldMappings(DataSourceToIndexFieldMapping... fileFieldMappings) {
        if (this.fileFieldMappings == null) {
            setFileFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fileFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fileFieldMappings) {
            this.fileFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box files to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param fileFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        files to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withFileFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fileFieldMappings) {
        setFileFieldMappings(fileFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box tasks to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *         tasks to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *         before you map to Box fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Box field names must exist in your Box custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getTaskFieldMappings() {
        return taskFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box tasks to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param taskFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        tasks to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     */

    public void setTaskFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> taskFieldMappings) {
        if (taskFieldMappings == null) {
            this.taskFieldMappings = null;
            return;
        }

        this.taskFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(taskFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box tasks to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskFieldMappings(java.util.Collection)} or {@link #withTaskFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param taskFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        tasks to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withTaskFieldMappings(DataSourceToIndexFieldMapping... taskFieldMappings) {
        if (this.taskFieldMappings == null) {
            setTaskFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(taskFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : taskFieldMappings) {
            this.taskFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box tasks to
     * Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map to
     * Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param taskFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        tasks to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withTaskFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> taskFieldMappings) {
        setTaskFieldMappings(taskFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box comments
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *         comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to Box fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Box field names must exist in your Box custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getCommentFieldMappings() {
        return commentFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box comments
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param commentFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     */

    public void setCommentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> commentFieldMappings) {
        if (commentFieldMappings == null) {
            this.commentFieldMappings = null;
            return;
        }

        this.commentFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(commentFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box comments
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommentFieldMappings(java.util.Collection)} or {@link #withCommentFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param commentFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withCommentFieldMappings(DataSourceToIndexFieldMapping... commentFieldMappings) {
        if (this.commentFieldMappings == null) {
            setCommentFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(commentFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : commentFieldMappings) {
            this.commentFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box comments
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param commentFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *        comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withCommentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> commentFieldMappings) {
        setCommentFieldMappings(commentFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web links
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box
     *         web links to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to Box fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The Box field names must exist in your Box custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getWebLinkFieldMappings() {
        return webLinkFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web links
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param webLinkFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web
     *        links to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     */

    public void setWebLinkFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> webLinkFieldMappings) {
        if (webLinkFieldMappings == null) {
            this.webLinkFieldMappings = null;
            return;
        }

        this.webLinkFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(webLinkFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web links
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWebLinkFieldMappings(java.util.Collection)} or {@link #withWebLinkFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param webLinkFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web
     *        links to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withWebLinkFieldMappings(DataSourceToIndexFieldMapping... webLinkFieldMappings) {
        if (this.webLinkFieldMappings == null) {
            setWebLinkFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(webLinkFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : webLinkFieldMappings) {
            this.webLinkFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web links
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Box fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The Box
     * field names must exist in your Box custom metadata.
     * </p>
     * 
     * @param webLinkFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Box web
     *        links to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to Box fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        Box field names must exist in your Box custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withWebLinkFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> webLinkFieldMappings) {
        setWebLinkFieldMappings(webLinkFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     * folders that match the patterns are included in the index. Files and folders that don't match the patterns are
     * excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion
     * pattern takes precedence and the file or folder isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain files and folders in your Box platform. Files
     *         and folders that match the patterns are included in the index. Files and folders that don't match the
     *         patterns are excluded from the index. If a file or folder matches both an inclusion and exclusion
     *         pattern, the exclusion pattern takes precedence and the file or folder isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     * folders that match the patterns are included in the index. Files and folders that don't match the patterns are
     * excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion
     * pattern takes precedence and the file or folder isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     *        folders that match the patterns are included in the index. Files and folders that don't match the patterns
     *        are excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file or folder isn't included in the index.
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
     * A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     * folders that match the patterns are included in the index. Files and folders that don't match the patterns are
     * excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion
     * pattern takes precedence and the file or folder isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     *        folders that match the patterns are included in the index. Files and folders that don't match the patterns
     *        are excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file or folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     * folders that match the patterns are included in the index. Files and folders that don't match the patterns are
     * excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion
     * pattern takes precedence and the file or folder isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files and folders in your Box platform. Files and
     *        folders that match the patterns are included in the index. Files and folders that don't match the patterns
     *        are excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file or folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files and folders from your Box platform. Files and
     * folders that match the patterns are excluded from the index.Files and folders that don't match the patterns are
     * included in the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the file or folder isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain files and folders from your Box platform. Files
     *         and folders that match the patterns are excluded from the index.Files and folders that don't match the
     *         patterns are included in the index. If a file or folder matches both an inclusion and exclusion pattern,
     *         the exclusion pattern takes precedence and the file or folder isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files and folders from your Box platform. Files and
     * folders that match the patterns are excluded from the index.Files and folders that don't match the patterns are
     * included in the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the file or folder isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files and folders from your Box platform. Files
     *        and folders that match the patterns are excluded from the index.Files and folders that don't match the
     *        patterns are included in the index. If a file or folder matches both an inclusion and exclusion pattern,
     *        the exclusion pattern takes precedence and the file or folder isn't included in the index.
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
     * A list of regular expression patterns to exclude certain files and folders from your Box platform. Files and
     * folders that match the patterns are excluded from the index.Files and folders that don't match the patterns are
     * included in the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the file or folder isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files and folders from your Box platform. Files
     *        and folders that match the patterns are excluded from the index.Files and folders that don't match the
     *        patterns are included in the index. If a file or folder matches both an inclusion and exclusion pattern,
     *        the exclusion pattern takes precedence and the file or folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns to exclude certain files and folders from your Box platform. Files and
     * folders that match the patterns are excluded from the index.Files and folders that don't match the patterns are
     * included in the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern
     * takes precedence and the file or folder isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files and folders from your Box platform. Files
     *        and folders that match the patterns are excluded from the index.Files and folders that don't match the
     *        patterns are included in the index. If a file or folder matches both an inclusion and exclusion pattern,
     *        the exclusion pattern takes precedence and the file or folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @return Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon VPC to connect to your Box. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
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
        if (getEnterpriseId() != null)
            sb.append("EnterpriseId: ").append(getEnterpriseId()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getCrawlComments() != null)
            sb.append("CrawlComments: ").append(getCrawlComments()).append(",");
        if (getCrawlTasks() != null)
            sb.append("CrawlTasks: ").append(getCrawlTasks()).append(",");
        if (getCrawlWebLinks() != null)
            sb.append("CrawlWebLinks: ").append(getCrawlWebLinks()).append(",");
        if (getFileFieldMappings() != null)
            sb.append("FileFieldMappings: ").append(getFileFieldMappings()).append(",");
        if (getTaskFieldMappings() != null)
            sb.append("TaskFieldMappings: ").append(getTaskFieldMappings()).append(",");
        if (getCommentFieldMappings() != null)
            sb.append("CommentFieldMappings: ").append(getCommentFieldMappings()).append(",");
        if (getWebLinkFieldMappings() != null)
            sb.append("WebLinkFieldMappings: ").append(getWebLinkFieldMappings()).append(",");
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

        if (obj instanceof BoxConfiguration == false)
            return false;
        BoxConfiguration other = (BoxConfiguration) obj;
        if (other.getEnterpriseId() == null ^ this.getEnterpriseId() == null)
            return false;
        if (other.getEnterpriseId() != null && other.getEnterpriseId().equals(this.getEnterpriseId()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getCrawlComments() == null ^ this.getCrawlComments() == null)
            return false;
        if (other.getCrawlComments() != null && other.getCrawlComments().equals(this.getCrawlComments()) == false)
            return false;
        if (other.getCrawlTasks() == null ^ this.getCrawlTasks() == null)
            return false;
        if (other.getCrawlTasks() != null && other.getCrawlTasks().equals(this.getCrawlTasks()) == false)
            return false;
        if (other.getCrawlWebLinks() == null ^ this.getCrawlWebLinks() == null)
            return false;
        if (other.getCrawlWebLinks() != null && other.getCrawlWebLinks().equals(this.getCrawlWebLinks()) == false)
            return false;
        if (other.getFileFieldMappings() == null ^ this.getFileFieldMappings() == null)
            return false;
        if (other.getFileFieldMappings() != null && other.getFileFieldMappings().equals(this.getFileFieldMappings()) == false)
            return false;
        if (other.getTaskFieldMappings() == null ^ this.getTaskFieldMappings() == null)
            return false;
        if (other.getTaskFieldMappings() != null && other.getTaskFieldMappings().equals(this.getTaskFieldMappings()) == false)
            return false;
        if (other.getCommentFieldMappings() == null ^ this.getCommentFieldMappings() == null)
            return false;
        if (other.getCommentFieldMappings() != null && other.getCommentFieldMappings().equals(this.getCommentFieldMappings()) == false)
            return false;
        if (other.getWebLinkFieldMappings() == null ^ this.getWebLinkFieldMappings() == null)
            return false;
        if (other.getWebLinkFieldMappings() != null && other.getWebLinkFieldMappings().equals(this.getWebLinkFieldMappings()) == false)
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

        hashCode = prime * hashCode + ((getEnterpriseId() == null) ? 0 : getEnterpriseId().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getCrawlComments() == null) ? 0 : getCrawlComments().hashCode());
        hashCode = prime * hashCode + ((getCrawlTasks() == null) ? 0 : getCrawlTasks().hashCode());
        hashCode = prime * hashCode + ((getCrawlWebLinks() == null) ? 0 : getCrawlWebLinks().hashCode());
        hashCode = prime * hashCode + ((getFileFieldMappings() == null) ? 0 : getFileFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getTaskFieldMappings() == null) ? 0 : getTaskFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getCommentFieldMappings() == null) ? 0 : getCommentFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getWebLinkFieldMappings() == null) ? 0 : getWebLinkFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public BoxConfiguration clone() {
        try {
            return (BoxConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.BoxConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
