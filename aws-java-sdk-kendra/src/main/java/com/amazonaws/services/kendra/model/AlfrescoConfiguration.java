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
 * Provides the configuration information to connect to Alfresco as your data source.
 * </p>
 * <note>
 * <p>
 * Alfresco data source connector is currently in preview mode. Basic authentication is currently supported. If you
 * would like to use Alfresco connector in production, contact <a href="http://aws.amazon.com/contact-us/">Support</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AlfrescoConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlfrescoConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     * </p>
     */
    private String siteUrl;
    /**
     * <p>
     * The identifier of the Alfresco site. For example, <i>my-site</i>.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Alfresco data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The user name of the Alfresco account.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Alfresco account.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you require
     * a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     */
    private S3Path sslCertificateS3Path;
    /**
     * <p>
     * <code>TRUE</code> to index shared files.
     * </p>
     */
    private Boolean crawlSystemFolders;
    /**
     * <p>
     * <code>TRUE</code> to index comments of blogs and other content.
     * </p>
     */
    private Boolean crawlComments;
    /**
     * <p>
     * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
     * </p>
     */
    private java.util.List<String> entityFilter;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco
     * document libraries to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> documentLibraryFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco blogs
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> blogFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco wikis
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> wikiFieldMappings;
    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Alfresco data source. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that match the
     * patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more information,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     * </p>
     * 
     * @param siteUrl
     *        The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     */

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    /**
     * <p>
     * The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     * </p>
     * 
     * @return The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     */

    public String getSiteUrl() {
        return this.siteUrl;
    }

    /**
     * <p>
     * The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     * </p>
     * 
     * @param siteUrl
     *        The URL of the Alfresco site. For example, <i>https://hostname:8080</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withSiteUrl(String siteUrl) {
        setSiteUrl(siteUrl);
        return this;
    }

    /**
     * <p>
     * The identifier of the Alfresco site. For example, <i>my-site</i>.
     * </p>
     * 
     * @param siteId
     *        The identifier of the Alfresco site. For example, <i>my-site</i>.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The identifier of the Alfresco site. For example, <i>my-site</i>.
     * </p>
     * 
     * @return The identifier of the Alfresco site. For example, <i>my-site</i>.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The identifier of the Alfresco site. For example, <i>my-site</i>.
     * </p>
     * 
     * @param siteId
     *        The identifier of the Alfresco site. For example, <i>my-site</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Alfresco data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The user name of the Alfresco account.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Alfresco account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Alfresco data source. The secret must contain a JSON structure with the following
     *        keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        username—The user name of the Alfresco account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password—The password of the Alfresco account.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Alfresco data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The user name of the Alfresco account.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Alfresco account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *         connect to your Alfresco data source. The secret must contain a JSON structure with the following
     *         keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         username—The user name of the Alfresco account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         password—The password of the Alfresco account.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your Alfresco data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username—The user name of the Alfresco account.
     * </p>
     * </li>
     * <li>
     * <p>
     * password—The password of the Alfresco account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your Alfresco data source. The secret must contain a JSON structure with the following
     *        keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        username—The user name of the Alfresco account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password—The password of the Alfresco account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you require
     * a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     * 
     * @param sslCertificateS3Path
     *        The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you
     *        require a secure SSL connection.</p>
     *        <p>
     *        You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of
     *        using OpenSSL to create an X509 certificate, see <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign
     *        an X509 certificate</a>.
     */

    public void setSslCertificateS3Path(S3Path sslCertificateS3Path) {
        this.sslCertificateS3Path = sslCertificateS3Path;
    }

    /**
     * <p>
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you require
     * a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     * 
     * @return The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you
     *         require a secure SSL connection.</p>
     *         <p>
     *         You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of
     *         using OpenSSL to create an X509 certificate, see <a
     *         href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign
     *         an X509 certificate</a>.
     */

    public S3Path getSslCertificateS3Path() {
        return this.sslCertificateS3Path;
    }

    /**
     * <p>
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you require
     * a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     * 
     * @param sslCertificateS3Path
     *        The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you
     *        require a secure SSL connection.</p>
     *        <p>
     *        You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of
     *        using OpenSSL to create an X509 certificate, see <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign
     *        an X509 certificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withSslCertificateS3Path(S3Path sslCertificateS3Path) {
        setSslCertificateS3Path(sslCertificateS3Path);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index shared files.
     * </p>
     * 
     * @param crawlSystemFolders
     *        <code>TRUE</code> to index shared files.
     */

    public void setCrawlSystemFolders(Boolean crawlSystemFolders) {
        this.crawlSystemFolders = crawlSystemFolders;
    }

    /**
     * <p>
     * <code>TRUE</code> to index shared files.
     * </p>
     * 
     * @return <code>TRUE</code> to index shared files.
     */

    public Boolean getCrawlSystemFolders() {
        return this.crawlSystemFolders;
    }

    /**
     * <p>
     * <code>TRUE</code> to index shared files.
     * </p>
     * 
     * @param crawlSystemFolders
     *        <code>TRUE</code> to index shared files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withCrawlSystemFolders(Boolean crawlSystemFolders) {
        setCrawlSystemFolders(crawlSystemFolders);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index shared files.
     * </p>
     * 
     * @return <code>TRUE</code> to index shared files.
     */

    public Boolean isCrawlSystemFolders() {
        return this.crawlSystemFolders;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments of blogs and other content.
     * </p>
     * 
     * @param crawlComments
     *        <code>TRUE</code> to index comments of blogs and other content.
     */

    public void setCrawlComments(Boolean crawlComments) {
        this.crawlComments = crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments of blogs and other content.
     * </p>
     * 
     * @return <code>TRUE</code> to index comments of blogs and other content.
     */

    public Boolean getCrawlComments() {
        return this.crawlComments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments of blogs and other content.
     * </p>
     * 
     * @param crawlComments
     *        <code>TRUE</code> to index comments of blogs and other content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withCrawlComments(Boolean crawlComments) {
        setCrawlComments(crawlComments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index comments of blogs and other content.
     * </p>
     * 
     * @return <code>TRUE</code> to index comments of blogs and other content.
     */

    public Boolean isCrawlComments() {
        return this.crawlComments;
    }

    /**
     * <p>
     * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
     * </p>
     * 
     * @return Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these
     *         options.
     * @see AlfrescoEntity
     */

    public java.util.List<String> getEntityFilter() {
        return entityFilter;
    }

    /**
     * <p>
     * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
     * </p>
     * 
     * @param entityFilter
     *        Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these
     *        options.
     * @see AlfrescoEntity
     */

    public void setEntityFilter(java.util.Collection<String> entityFilter) {
        if (entityFilter == null) {
            this.entityFilter = null;
            return;
        }

        this.entityFilter = new java.util.ArrayList<String>(entityFilter);
    }

    /**
     * <p>
     * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityFilter(java.util.Collection)} or {@link #withEntityFilter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityFilter
     *        Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlfrescoEntity
     */

    public AlfrescoConfiguration withEntityFilter(String... entityFilter) {
        if (this.entityFilter == null) {
            setEntityFilter(new java.util.ArrayList<String>(entityFilter.length));
        }
        for (String ele : entityFilter) {
            this.entityFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
     * </p>
     * 
     * @param entityFilter
     *        Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlfrescoEntity
     */

    public AlfrescoConfiguration withEntityFilter(java.util.Collection<String> entityFilter) {
        setEntityFilter(entityFilter);
        return this;
    }

    /**
     * <p>
     * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
     * </p>
     * 
     * @param entityFilter
     *        Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlfrescoEntity
     */

    public AlfrescoConfiguration withEntityFilter(AlfrescoEntity... entityFilter) {
        java.util.ArrayList<String> entityFilterCopy = new java.util.ArrayList<String>(entityFilter.length);
        for (AlfrescoEntity value : entityFilter) {
            entityFilterCopy.add(value.toString());
        }
        if (getEntityFilter() == null) {
            setEntityFilter(entityFilterCopy);
        } else {
            getEntityFilter().addAll(entityFilterCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco
     * document libraries to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *         Alfresco document libraries to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Alfresco data source field names must exist in your Alfresco custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getDocumentLibraryFieldMappings() {
        return documentLibraryFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco
     * document libraries to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @param documentLibraryFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco document libraries to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     */

    public void setDocumentLibraryFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> documentLibraryFieldMappings) {
        if (documentLibraryFieldMappings == null) {
            this.documentLibraryFieldMappings = null;
            return;
        }

        this.documentLibraryFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(documentLibraryFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco
     * document libraries to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentLibraryFieldMappings(java.util.Collection)} or
     * {@link #withDocumentLibraryFieldMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param documentLibraryFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco document libraries to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withDocumentLibraryFieldMappings(DataSourceToIndexFieldMapping... documentLibraryFieldMappings) {
        if (this.documentLibraryFieldMappings == null) {
            setDocumentLibraryFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(documentLibraryFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : documentLibraryFieldMappings) {
            this.documentLibraryFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco
     * document libraries to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @param documentLibraryFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco document libraries to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withDocumentLibraryFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> documentLibraryFieldMappings) {
        setDocumentLibraryFieldMappings(documentLibraryFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco blogs
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *         Alfresco blogs to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Alfresco data source field names must exist in your Alfresco custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getBlogFieldMappings() {
        return blogFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco blogs
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @param blogFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco blogs to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     */

    public void setBlogFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> blogFieldMappings) {
        if (blogFieldMappings == null) {
            this.blogFieldMappings = null;
            return;
        }

        this.blogFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(blogFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco blogs
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlogFieldMappings(java.util.Collection)} or {@link #withBlogFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param blogFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco blogs to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withBlogFieldMappings(DataSourceToIndexFieldMapping... blogFieldMappings) {
        if (this.blogFieldMappings == null) {
            setBlogFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(blogFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : blogFieldMappings) {
            this.blogFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco blogs
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @param blogFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco blogs to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withBlogFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> blogFieldMappings) {
        setBlogFieldMappings(blogFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco wikis
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *         Alfresco wikis to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Alfresco data source field names must exist in your Alfresco custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getWikiFieldMappings() {
        return wikiFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco wikis
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @param wikiFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco wikis to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     */

    public void setWikiFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> wikiFieldMappings) {
        if (wikiFieldMappings == null) {
            this.wikiFieldMappings = null;
            return;
        }

        this.wikiFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(wikiFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco wikis
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWikiFieldMappings(java.util.Collection)} or {@link #withWikiFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param wikiFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco wikis to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withWikiFieldMappings(DataSourceToIndexFieldMapping... wikiFieldMappings) {
        if (this.wikiFieldMappings == null) {
            setWikiFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(wikiFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : wikiFieldMappings) {
            this.wikiFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of Alfresco wikis
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to Alfresco fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>. The
     * Alfresco data source field names must exist in your Alfresco custom metadata.
     * </p>
     * 
     * @param wikiFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of
     *        Alfresco wikis to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to Alfresco fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Alfresco data source field names must exist in your Alfresco custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withWikiFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> wikiFieldMappings) {
        setWikiFieldMappings(wikiFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Alfresco data source. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain files in your Alfresco data source. Files that
     *         match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *         index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *         precedence and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain files in your Alfresco data source. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Alfresco data source. Files that
     *        match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *        index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
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
     * A list of regular expression patterns to include certain files in your Alfresco data source. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Alfresco data source. Files that
     *        match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *        index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns to include certain files in your Alfresco data source. Files that match the
     * patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain files in your Alfresco data source. Files that
     *        match the patterns are included in the index. Files that don't match the patterns are excluded from the
     *        index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that match the
     * patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that
     *         match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *         index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *         precedence and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that match the
     * patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that
     *        match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *        index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
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
     * A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that match the
     * patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that
     *        match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *        index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that match the
     * patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file
     * matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file
     * isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that
     *        match the patterns are excluded from the index. Files that don't match the patterns are included in the
     *        index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     *        precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more information,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more information,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more information,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlfrescoConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
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
        if (getSiteUrl() != null)
            sb.append("SiteUrl: ").append(getSiteUrl()).append(",");
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSslCertificateS3Path() != null)
            sb.append("SslCertificateS3Path: ").append(getSslCertificateS3Path()).append(",");
        if (getCrawlSystemFolders() != null)
            sb.append("CrawlSystemFolders: ").append(getCrawlSystemFolders()).append(",");
        if (getCrawlComments() != null)
            sb.append("CrawlComments: ").append(getCrawlComments()).append(",");
        if (getEntityFilter() != null)
            sb.append("EntityFilter: ").append(getEntityFilter()).append(",");
        if (getDocumentLibraryFieldMappings() != null)
            sb.append("DocumentLibraryFieldMappings: ").append(getDocumentLibraryFieldMappings()).append(",");
        if (getBlogFieldMappings() != null)
            sb.append("BlogFieldMappings: ").append(getBlogFieldMappings()).append(",");
        if (getWikiFieldMappings() != null)
            sb.append("WikiFieldMappings: ").append(getWikiFieldMappings()).append(",");
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

        if (obj instanceof AlfrescoConfiguration == false)
            return false;
        AlfrescoConfiguration other = (AlfrescoConfiguration) obj;
        if (other.getSiteUrl() == null ^ this.getSiteUrl() == null)
            return false;
        if (other.getSiteUrl() != null && other.getSiteUrl().equals(this.getSiteUrl()) == false)
            return false;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSslCertificateS3Path() == null ^ this.getSslCertificateS3Path() == null)
            return false;
        if (other.getSslCertificateS3Path() != null && other.getSslCertificateS3Path().equals(this.getSslCertificateS3Path()) == false)
            return false;
        if (other.getCrawlSystemFolders() == null ^ this.getCrawlSystemFolders() == null)
            return false;
        if (other.getCrawlSystemFolders() != null && other.getCrawlSystemFolders().equals(this.getCrawlSystemFolders()) == false)
            return false;
        if (other.getCrawlComments() == null ^ this.getCrawlComments() == null)
            return false;
        if (other.getCrawlComments() != null && other.getCrawlComments().equals(this.getCrawlComments()) == false)
            return false;
        if (other.getEntityFilter() == null ^ this.getEntityFilter() == null)
            return false;
        if (other.getEntityFilter() != null && other.getEntityFilter().equals(this.getEntityFilter()) == false)
            return false;
        if (other.getDocumentLibraryFieldMappings() == null ^ this.getDocumentLibraryFieldMappings() == null)
            return false;
        if (other.getDocumentLibraryFieldMappings() != null && other.getDocumentLibraryFieldMappings().equals(this.getDocumentLibraryFieldMappings()) == false)
            return false;
        if (other.getBlogFieldMappings() == null ^ this.getBlogFieldMappings() == null)
            return false;
        if (other.getBlogFieldMappings() != null && other.getBlogFieldMappings().equals(this.getBlogFieldMappings()) == false)
            return false;
        if (other.getWikiFieldMappings() == null ^ this.getWikiFieldMappings() == null)
            return false;
        if (other.getWikiFieldMappings() != null && other.getWikiFieldMappings().equals(this.getWikiFieldMappings()) == false)
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

        hashCode = prime * hashCode + ((getSiteUrl() == null) ? 0 : getSiteUrl().hashCode());
        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSslCertificateS3Path() == null) ? 0 : getSslCertificateS3Path().hashCode());
        hashCode = prime * hashCode + ((getCrawlSystemFolders() == null) ? 0 : getCrawlSystemFolders().hashCode());
        hashCode = prime * hashCode + ((getCrawlComments() == null) ? 0 : getCrawlComments().hashCode());
        hashCode = prime * hashCode + ((getEntityFilter() == null) ? 0 : getEntityFilter().hashCode());
        hashCode = prime * hashCode + ((getDocumentLibraryFieldMappings() == null) ? 0 : getDocumentLibraryFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getBlogFieldMappings() == null) ? 0 : getBlogFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getWikiFieldMappings() == null) ? 0 : getWikiFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AlfrescoConfiguration clone() {
        try {
            return (AlfrescoConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AlfrescoConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
