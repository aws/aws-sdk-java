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
 * Provides the configuration information to connect to Microsoft SharePoint as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SharePointConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharePointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of Microsoft SharePoint that you use.
     * </p>
     */
    private String sharePointVersion;
    /**
     * <p>
     * The Microsoft SharePoint site URLs for the documents you want to index.
     * </p>
     */
    private java.util.List<String> urls;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password required to
     * connect to the SharePoint instance. If you use SharePoint Server, you also need to provide the sever domain name
     * as part of the credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>.
     * </p>
     * <p>
     * You can also provide OAuth authentication credentials of user name, password, client ID, and client secret. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a
     * SharePoint data source</a>.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * <code>TRUE</code> to index document attachments.
     * </p>
     */
    private Boolean crawlAttachments;
    /**
     * <p>
     * <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in SharePoint.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your SharePoint. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to SharePoint fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * SharePoint data source field names must exist in your SharePoint custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;
    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     */
    private String documentTitleFieldName;
    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     */
    private Boolean disableLocalGroups;
    /**
     * <p>
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint Server if
     * you require a secure SSL connection.
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
     * Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     * authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     * SharePoint Online.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy. You can
     * use this option for SharePoint Server.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication of user name and password. To store web proxy credentials, you use a secret in Secrets Manager.
     * </p>
     * <p>
     * It is recommended that you follow best security practices when configuring your web proxy. This includes setting
     * up throttling, setting up logging and monitoring, and applying security patches on a regular basis. If you use
     * your web proxy with multiple data sources, sync jobs that occur at the same time could strain the load on your
     * proxy. It is recommended you prepare your proxy beforehand for any security and load requirements.
     * </p>
     */
    private ProxyConfiguration proxyConfiguration;

    /**
     * <p>
     * The version of Microsoft SharePoint that you use.
     * </p>
     * 
     * @param sharePointVersion
     *        The version of Microsoft SharePoint that you use.
     * @see SharePointVersion
     */

    public void setSharePointVersion(String sharePointVersion) {
        this.sharePointVersion = sharePointVersion;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you use.
     * </p>
     * 
     * @return The version of Microsoft SharePoint that you use.
     * @see SharePointVersion
     */

    public String getSharePointVersion() {
        return this.sharePointVersion;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you use.
     * </p>
     * 
     * @param sharePointVersion
     *        The version of Microsoft SharePoint that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointVersion
     */

    public SharePointConfiguration withSharePointVersion(String sharePointVersion) {
        setSharePointVersion(sharePointVersion);
        return this;
    }

    /**
     * <p>
     * The version of Microsoft SharePoint that you use.
     * </p>
     * 
     * @param sharePointVersion
     *        The version of Microsoft SharePoint that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointVersion
     */

    public SharePointConfiguration withSharePointVersion(SharePointVersion sharePointVersion) {
        this.sharePointVersion = sharePointVersion.toString();
        return this;
    }

    /**
     * <p>
     * The Microsoft SharePoint site URLs for the documents you want to index.
     * </p>
     * 
     * @return The Microsoft SharePoint site URLs for the documents you want to index.
     */

    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * The Microsoft SharePoint site URLs for the documents you want to index.
     * </p>
     * 
     * @param urls
     *        The Microsoft SharePoint site URLs for the documents you want to index.
     */

    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * The Microsoft SharePoint site URLs for the documents you want to index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrls(java.util.Collection)} or {@link #withUrls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param urls
     *        The Microsoft SharePoint site URLs for the documents you want to index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withUrls(String... urls) {
        if (this.urls == null) {
            setUrls(new java.util.ArrayList<String>(urls.length));
        }
        for (String ele : urls) {
            this.urls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Microsoft SharePoint site URLs for the documents you want to index.
     * </p>
     * 
     * @param urls
     *        The Microsoft SharePoint site URLs for the documents you want to index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password required to
     * connect to the SharePoint instance. If you use SharePoint Server, you also need to provide the sever domain name
     * as part of the credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>.
     * </p>
     * <p>
     * You can also provide OAuth authentication credentials of user name, password, client ID, and client secret. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a
     * SharePoint data source</a>.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password
     *        required to connect to the SharePoint instance. If you use SharePoint Server, you also need to provide the
     *        sever domain name as part of the credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft
     *        SharePoint Data Source</a>.</p>
     *        <p>
     *        You can also provide OAuth authentication credentials of user name, password, client ID, and client
     *        secret. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a SharePoint data
     *        source</a>.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password required to
     * connect to the SharePoint instance. If you use SharePoint Server, you also need to provide the sever domain name
     * as part of the credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>.
     * </p>
     * <p>
     * You can also provide OAuth authentication credentials of user name, password, client ID, and client secret. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a
     * SharePoint data source</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password
     *         required to connect to the SharePoint instance. If you use SharePoint Server, you also need to provide
     *         the sever domain name as part of the credentials. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft
     *         SharePoint Data Source</a>.</p>
     *         <p>
     *         You can also provide OAuth authentication credentials of user name, password, client ID, and client
     *         secret. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a SharePoint data
     *         source</a>.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password required to
     * connect to the SharePoint instance. If you use SharePoint Server, you also need to provide the sever domain name
     * as part of the credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft SharePoint Data
     * Source</a>.
     * </p>
     * <p>
     * You can also provide OAuth authentication credentials of user name, password, client ID, and client secret. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a
     * SharePoint data source</a>.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password
     *        required to connect to the SharePoint instance. If you use SharePoint Server, you also need to provide the
     *        sever domain name as part of the credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a Microsoft
     *        SharePoint Data Source</a>.</p>
     *        <p>
     *        You can also provide OAuth authentication credentials of user name, password, client ID, and client
     *        secret. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html">Using a SharePoint data
     *        source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index document attachments.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to index document attachments.
     */

    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index document attachments.
     * </p>
     * 
     * @return <code>TRUE</code> to index document attachments.
     */

    public Boolean getCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to index document attachments.
     * </p>
     * 
     * @param crawlAttachments
     *        <code>TRUE</code> to index document attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        setCrawlAttachments(crawlAttachments);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to index document attachments.
     * </p>
     * 
     * @return <code>TRUE</code> to index document attachments.
     */

    public Boolean isCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in SharePoint.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the
     *        index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than
     *        to scan all of your documents in SharePoint.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in SharePoint.
     * </p>
     * 
     * @return <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the
     *         index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
     *         than to scan all of your documents in SharePoint.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in SharePoint.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the
     *        index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than
     *        to scan all of your documents in SharePoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in SharePoint.
     * </p>
     * 
     * @return <code>TRUE</code> to use the SharePoint change log to determine which documents require updating in the
     *         index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log
     *         than to scan all of your documents in SharePoint.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your SharePoint. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain documents in your SharePoint. Documents that
     *         match the patterns are included in the index. Documents that don't match the patterns are excluded from
     *         the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *         precedence and the document isn't included in the index.</p>
     *         <p>
     *         The regex applies to the display URL of the SharePoint document.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain documents in your SharePoint. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain documents in your SharePoint. Documents that
     *        match the patterns are included in the index. Documents that don't match the patterns are excluded from
     *        the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The regex applies to the display URL of the SharePoint document.
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
     * A list of regular expression patterns to include certain documents in your SharePoint. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain documents in your SharePoint. Documents that
     *        match the patterns are included in the index. Documents that don't match the patterns are excluded from
     *        the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The regex applies to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns to include certain documents in your SharePoint. Documents that match the
     * patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain documents in your SharePoint. Documents that
     *        match the patterns are included in the index. Documents that don't match the patterns are excluded from
     *        the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The regex applies to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that
     *         match the patterns are excluded from the index. Documents that don't match the patterns are included in
     *         the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *         precedence and the document isn't included in the index.</p>
     *         <p>
     *         The regex applies to the display URL of the SharePoint document.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that
     *        match the patterns are excluded from the index. Documents that don't match the patterns are included in
     *        the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The regex applies to the display URL of the SharePoint document.
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
     * A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that
     *        match the patterns are excluded from the index. Documents that don't match the patterns are included in
     *        the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The regex applies to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that match the
     * patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a
     * document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     * isn't included in the index.
     * </p>
     * <p>
     * The regex applies to the display URL of the SharePoint document.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that
     *        match the patterns are excluded from the index. Documents that don't match the patterns are included in
     *        the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *        precedence and the document isn't included in the index.</p>
     *        <p>
     *        The regex applies to the display URL of the SharePoint document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to SharePoint fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * SharePoint data source field names must exist in your SharePoint custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes
     *         or field names to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to SharePoint fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The SharePoint data source field names must exist in your SharePoint custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to SharePoint fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * SharePoint data source field names must exist in your SharePoint custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to SharePoint fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        SharePoint data source field names must exist in your SharePoint custom metadata.
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
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to SharePoint fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * SharePoint data source field names must exist in your SharePoint custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to SharePoint fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        SharePoint data source field names must exist in your SharePoint custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
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
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or field
     * names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to SharePoint fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     * SharePoint data source field names must exist in your SharePoint custom metadata.
     * </p>
     * 
     * @param fieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map SharePoint data source attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to SharePoint fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        SharePoint data source field names must exist in your SharePoint custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The Microsoft SharePoint attribute field that contains the title of the document.
     */

    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     * 
     * @return The Microsoft SharePoint attribute field that contains the title of the document.
     */

    public String getDocumentTitleFieldName() {
        return this.documentTitleFieldName;
    }

    /**
     * <p>
     * The Microsoft SharePoint attribute field that contains the title of the document.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The Microsoft SharePoint attribute field that contains the title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withDocumentTitleFieldName(String documentTitleFieldName) {
        setDocumentTitleFieldName(documentTitleFieldName);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @param disableLocalGroups
     *        <code>TRUE</code> to disable local groups information.
     */

    public void setDisableLocalGroups(Boolean disableLocalGroups) {
        this.disableLocalGroups = disableLocalGroups;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @return <code>TRUE</code> to disable local groups information.
     */

    public Boolean getDisableLocalGroups() {
        return this.disableLocalGroups;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @param disableLocalGroups
     *        <code>TRUE</code> to disable local groups information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withDisableLocalGroups(Boolean disableLocalGroups) {
        setDisableLocalGroups(disableLocalGroups);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to disable local groups information.
     * </p>
     * 
     * @return <code>TRUE</code> to disable local groups information.
     */

    public Boolean isDisableLocalGroups() {
        return this.disableLocalGroups;
    }

    /**
     * <p>
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint Server if
     * you require a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     * 
     * @param sslCertificateS3Path
     *        The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint
     *        Server if you require a secure SSL connection.</p>
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
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint Server if
     * you require a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     * 
     * @return The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint
     *         Server if you require a secure SSL connection.</p>
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
     * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint Server if
     * you require a secure SSL connection.
     * </p>
     * <p>
     * You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using
     * OpenSSL to create an X509 certificate, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign an X509
     * certificate</a>.
     * </p>
     * 
     * @param sslCertificateS3Path
     *        The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint
     *        Server if you require a secure SSL connection.</p>
     *        <p>
     *        You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of
     *        using OpenSSL to create an X509 certificate, see <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/configuring-https-ssl.html">Create and sign
     *        an X509 certificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withSslCertificateS3Path(S3Path sslCertificateS3Path) {
        setSslCertificateS3Path(sslCertificateS3Path);
        return this;
    }

    /**
     * <p>
     * Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     * authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     * SharePoint Online.
     * </p>
     * 
     * @param authenticationType
     *        Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     *        authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     *        SharePoint Online.
     * @see SharePointOnlineAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     * authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     * SharePoint Online.
     * </p>
     * 
     * @return Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     *         authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     *         SharePoint Online.
     * @see SharePointOnlineAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     * authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     * SharePoint Online.
     * </p>
     * 
     * @param authenticationType
     *        Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     *        authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     *        SharePoint Online.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointOnlineAuthenticationType
     */

    public SharePointConfiguration withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     * authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     * SharePoint Online.
     * </p>
     * 
     * @param authenticationType
     *        Whether you want to connect to SharePoint using basic authentication of user name and password, or OAuth
     *        authentication of user name, password, client ID, and client secret. You can use OAuth authentication for
     *        SharePoint Online.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointOnlineAuthenticationType
     */

    public SharePointConfiguration withAuthenticationType(SharePointOnlineAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy. You can
     * use this option for SharePoint Server.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication of user name and password. To store web proxy credentials, you use a secret in Secrets Manager.
     * </p>
     * <p>
     * It is recommended that you follow best security practices when configuring your web proxy. This includes setting
     * up throttling, setting up logging and monitoring, and applying security patches on a regular basis. If you use
     * your web proxy with multiple data sources, sync jobs that occur at the same time could strain the load on your
     * proxy. It is recommended you prepare your proxy beforehand for any security and load requirements.
     * </p>
     * 
     * @param proxyConfiguration
     *        Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy.
     *        You can use this option for SharePoint Server.</p>
     *        <p>
     *        You must provide the website host name and port number. For example, the host name of
     *        <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for
     *        HTTPS.
     *        </p>
     *        <p>
     *        Web proxy credentials are optional and you can use them to connect to a web proxy server that requires
     *        basic authentication of user name and password. To store web proxy credentials, you use a secret in
     *        Secrets Manager.
     *        </p>
     *        <p>
     *        It is recommended that you follow best security practices when configuring your web proxy. This includes
     *        setting up throttling, setting up logging and monitoring, and applying security patches on a regular
     *        basis. If you use your web proxy with multiple data sources, sync jobs that occur at the same time could
     *        strain the load on your proxy. It is recommended you prepare your proxy beforehand for any security and
     *        load requirements.
     */

    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * <p>
     * Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy. You can
     * use this option for SharePoint Server.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication of user name and password. To store web proxy credentials, you use a secret in Secrets Manager.
     * </p>
     * <p>
     * It is recommended that you follow best security practices when configuring your web proxy. This includes setting
     * up throttling, setting up logging and monitoring, and applying security patches on a regular basis. If you use
     * your web proxy with multiple data sources, sync jobs that occur at the same time could strain the load on your
     * proxy. It is recommended you prepare your proxy beforehand for any security and load requirements.
     * </p>
     * 
     * @return Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy.
     *         You can use this option for SharePoint Server.</p>
     *         <p>
     *         You must provide the website host name and port number. For example, the host name of
     *         <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for
     *         HTTPS.
     *         </p>
     *         <p>
     *         Web proxy credentials are optional and you can use them to connect to a web proxy server that requires
     *         basic authentication of user name and password. To store web proxy credentials, you use a secret in
     *         Secrets Manager.
     *         </p>
     *         <p>
     *         It is recommended that you follow best security practices when configuring your web proxy. This includes
     *         setting up throttling, setting up logging and monitoring, and applying security patches on a regular
     *         basis. If you use your web proxy with multiple data sources, sync jobs that occur at the same time could
     *         strain the load on your proxy. It is recommended you prepare your proxy beforehand for any security and
     *         load requirements.
     */

    public ProxyConfiguration getProxyConfiguration() {
        return this.proxyConfiguration;
    }

    /**
     * <p>
     * Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy. You can
     * use this option for SharePoint Server.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication of user name and password. To store web proxy credentials, you use a secret in Secrets Manager.
     * </p>
     * <p>
     * It is recommended that you follow best security practices when configuring your web proxy. This includes setting
     * up throttling, setting up logging and monitoring, and applying security patches on a regular basis. If you use
     * your web proxy with multiple data sources, sync jobs that occur at the same time could strain the load on your
     * proxy. It is recommended you prepare your proxy beforehand for any security and load requirements.
     * </p>
     * 
     * @param proxyConfiguration
     *        Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy.
     *        You can use this option for SharePoint Server.</p>
     *        <p>
     *        You must provide the website host name and port number. For example, the host name of
     *        <i>https://a.example.com/page1.html</i> is "a.example.com" and the port is 443, the standard port for
     *        HTTPS.
     *        </p>
     *        <p>
     *        Web proxy credentials are optional and you can use them to connect to a web proxy server that requires
     *        basic authentication of user name and password. To store web proxy credentials, you use a secret in
     *        Secrets Manager.
     *        </p>
     *        <p>
     *        It is recommended that you follow best security practices when configuring your web proxy. This includes
     *        setting up throttling, setting up logging and monitoring, and applying security patches on a regular
     *        basis. If you use your web proxy with multiple data sources, sync jobs that occur at the same time could
     *        strain the load on your proxy. It is recommended you prepare your proxy beforehand for any security and
     *        load requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointConfiguration withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
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
        if (getSharePointVersion() != null)
            sb.append("SharePointVersion: ").append(getSharePointVersion()).append(",");
        if (getUrls() != null)
            sb.append("Urls: ").append(getUrls()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: ").append(getCrawlAttachments()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings()).append(",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: ").append(getDocumentTitleFieldName()).append(",");
        if (getDisableLocalGroups() != null)
            sb.append("DisableLocalGroups: ").append(getDisableLocalGroups()).append(",");
        if (getSslCertificateS3Path() != null)
            sb.append("SslCertificateS3Path: ").append(getSslCertificateS3Path()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getProxyConfiguration() != null)
            sb.append("ProxyConfiguration: ").append(getProxyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharePointConfiguration == false)
            return false;
        SharePointConfiguration other = (SharePointConfiguration) obj;
        if (other.getSharePointVersion() == null ^ this.getSharePointVersion() == null)
            return false;
        if (other.getSharePointVersion() != null && other.getSharePointVersion().equals(this.getSharePointVersion()) == false)
            return false;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
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
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getDisableLocalGroups() == null ^ this.getDisableLocalGroups() == null)
            return false;
        if (other.getDisableLocalGroups() != null && other.getDisableLocalGroups().equals(this.getDisableLocalGroups()) == false)
            return false;
        if (other.getSslCertificateS3Path() == null ^ this.getSslCertificateS3Path() == null)
            return false;
        if (other.getSslCertificateS3Path() != null && other.getSslCertificateS3Path().equals(this.getSslCertificateS3Path()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getProxyConfiguration() == null ^ this.getProxyConfiguration() == null)
            return false;
        if (other.getProxyConfiguration() != null && other.getProxyConfiguration().equals(this.getProxyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSharePointVersion() == null) ? 0 : getSharePointVersion().hashCode());
        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName().hashCode());
        hashCode = prime * hashCode + ((getDisableLocalGroups() == null) ? 0 : getDisableLocalGroups().hashCode());
        hashCode = prime * hashCode + ((getSslCertificateS3Path() == null) ? 0 : getSslCertificateS3Path().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SharePointConfiguration clone() {
        try {
            return (SharePointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SharePointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
