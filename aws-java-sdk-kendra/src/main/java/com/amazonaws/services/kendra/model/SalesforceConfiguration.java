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
 * Provides configuration information for connecting to a Salesforce data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SalesforceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     */
    private String serverUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Salesforce instance. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     */
    private java.util.List<SalesforceStandardObjectConfiguration> standardObjectConfigurations;
    /**
     * <p>
     * Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra
     * indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom
     * knowledge articles, but not both.
     * </p>
     */
    private SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration;
    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     */
    private SalesforceChatterFeedConfiguration chatterFeedConfiguration;
    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     * </p>
     */
    private Boolean crawlAttachments;
    /**
     * <p>
     * Provides configuration information for processing attachments to Salesforce standard objects.
     * </p>
     */
    private SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration;
    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     */
    private java.util.List<String> includeAttachmentFilePatterns;
    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     */
    private java.util.List<String> excludeAttachmentFilePatterns;

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * 
     * @param serverUrl
     *        The instance URL for the Salesforce site that you want to index.
     */

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * 
     * @return The instance URL for the Salesforce site that you want to index.
     */

    public String getServerUrl() {
        return this.serverUrl;
    }

    /**
     * <p>
     * The instance URL for the Salesforce site that you want to index.
     * </p>
     * 
     * @param serverUrl
     *        The instance URL for the Salesforce site that you want to index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withServerUrl(String serverUrl) {
        setServerUrl(serverUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Salesforce instance. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to
     *        connect to your Salesforce instance. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        consumerKey - The application public key generated when you created your Salesforce application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        consumerSecret - The application private key generated when you created your Salesforce application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password - The password associated with the user logging in to the Salesforce instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        securityToken - The token associated with the user account logging in to the Salesforce instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        username - The user name of the user logging in to the Salesforce instance.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Salesforce instance. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to
     *         connect to your Salesforce instance. The secret must contain a JSON structure with the following
     *         keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         consumerKey - The application public key generated when you created your Salesforce application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         consumerSecret - The application private key generated when you created your Salesforce application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         password - The password associated with the user logging in to the Salesforce instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         securityToken - The token associated with the user account logging in to the Salesforce instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         username - The user name of the user logging in to the Salesforce instance.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Salesforce instance. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerKey - The application public key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * consumerSecret - The application private key generated when you created your Salesforce application.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * securityToken - The token associated with the user account logging in to the Salesforce instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * username - The user name of the user logging in to the Salesforce instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to
     *        connect to your Salesforce instance. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        consumerKey - The application public key generated when you created your Salesforce application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        consumerSecret - The application private key generated when you created your Salesforce application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password - The password associated with the user logging in to the Salesforce instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        securityToken - The token associated with the user account logging in to the Salesforce instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        username - The user name of the user logging in to the Salesforce instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     * 
     * @return Specifies the Salesforce standard objects that Amazon Kendra indexes.
     */

    public java.util.List<SalesforceStandardObjectConfiguration> getStandardObjectConfigurations() {
        return standardObjectConfigurations;
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     * 
     * @param standardObjectConfigurations
     *        Specifies the Salesforce standard objects that Amazon Kendra indexes.
     */

    public void setStandardObjectConfigurations(java.util.Collection<SalesforceStandardObjectConfiguration> standardObjectConfigurations) {
        if (standardObjectConfigurations == null) {
            this.standardObjectConfigurations = null;
            return;
        }

        this.standardObjectConfigurations = new java.util.ArrayList<SalesforceStandardObjectConfiguration>(standardObjectConfigurations);
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardObjectConfigurations(java.util.Collection)} or
     * {@link #withStandardObjectConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param standardObjectConfigurations
     *        Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withStandardObjectConfigurations(SalesforceStandardObjectConfiguration... standardObjectConfigurations) {
        if (this.standardObjectConfigurations == null) {
            setStandardObjectConfigurations(new java.util.ArrayList<SalesforceStandardObjectConfiguration>(standardObjectConfigurations.length));
        }
        for (SalesforceStandardObjectConfiguration ele : standardObjectConfigurations) {
            this.standardObjectConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * </p>
     * 
     * @param standardObjectConfigurations
     *        Specifies the Salesforce standard objects that Amazon Kendra indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withStandardObjectConfigurations(java.util.Collection<SalesforceStandardObjectConfiguration> standardObjectConfigurations) {
        setStandardObjectConfigurations(standardObjectConfigurations);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra
     * indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom
     * knowledge articles, but not both.
     * </p>
     * 
     * @param knowledgeArticleConfiguration
     *        Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon
     *        Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom
     *        fields of custom knowledge articles, but not both.
     */

    public void setKnowledgeArticleConfiguration(SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra
     * indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom
     * knowledge articles, but not both.
     * </p>
     * 
     * @return Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon
     *         Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom
     *         fields of custom knowledge articles, but not both.
     */

    public SalesforceKnowledgeArticleConfiguration getKnowledgeArticleConfiguration() {
        return this.knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra
     * indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom
     * knowledge articles, but not both.
     * </p>
     * 
     * @param knowledgeArticleConfiguration
     *        Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon
     *        Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom
     *        fields of custom knowledge articles, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withKnowledgeArticleConfiguration(SalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        setKnowledgeArticleConfiguration(knowledgeArticleConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     * 
     * @param chatterFeedConfiguration
     *        Specifies configuration information for Salesforce chatter feeds.
     */

    public void setChatterFeedConfiguration(SalesforceChatterFeedConfiguration chatterFeedConfiguration) {
        this.chatterFeedConfiguration = chatterFeedConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     * 
     * @return Specifies configuration information for Salesforce chatter feeds.
     */

    public SalesforceChatterFeedConfiguration getChatterFeedConfiguration() {
        return this.chatterFeedConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for Salesforce chatter feeds.
     * </p>
     * 
     * @param chatterFeedConfiguration
     *        Specifies configuration information for Salesforce chatter feeds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withChatterFeedConfiguration(SalesforceChatterFeedConfiguration chatterFeedConfiguration) {
        setChatterFeedConfiguration(chatterFeedConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     * </p>
     * 
     * @param crawlAttachments
     *        Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     */

    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     * </p>
     * 
     * @return Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     */

    public Boolean getCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     * </p>
     * 
     * @param crawlAttachments
     *        Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        setCrawlAttachments(crawlAttachments);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     * </p>
     * 
     * @return Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     */

    public Boolean isCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * Provides configuration information for processing attachments to Salesforce standard objects.
     * </p>
     * 
     * @param standardObjectAttachmentConfiguration
     *        Provides configuration information for processing attachments to Salesforce standard objects.
     */

    public void setStandardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration) {
        this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for processing attachments to Salesforce standard objects.
     * </p>
     * 
     * @return Provides configuration information for processing attachments to Salesforce standard objects.
     */

    public SalesforceStandardObjectAttachmentConfiguration getStandardObjectAttachmentConfiguration() {
        return this.standardObjectAttachmentConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for processing attachments to Salesforce standard objects.
     * </p>
     * 
     * @param standardObjectAttachmentConfiguration
     *        Provides configuration information for processing attachments to Salesforce standard objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withStandardObjectAttachmentConfiguration(
            SalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration) {
        setStandardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * 
     * @return A list of regular expression patterns. Documents that match the patterns are included in the index.
     *         Documents that don't match the patterns are excluded from the index. If a document matches both an
     *         inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *         <p>
     *         The regex is applied to the name of the attached file.
     */

    public java.util.List<String> getIncludeAttachmentFilePatterns() {
        return includeAttachmentFilePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * 
     * @param includeAttachmentFilePatterns
     *        A list of regular expression patterns. Documents that match the patterns are included in the index.
     *        Documents that don't match the patterns are excluded from the index. If a document matches both an
     *        inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the name of the attached file.
     */

    public void setIncludeAttachmentFilePatterns(java.util.Collection<String> includeAttachmentFilePatterns) {
        if (includeAttachmentFilePatterns == null) {
            this.includeAttachmentFilePatterns = null;
            return;
        }

        this.includeAttachmentFilePatterns = new java.util.ArrayList<String>(includeAttachmentFilePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeAttachmentFilePatterns(java.util.Collection)} or
     * {@link #withIncludeAttachmentFilePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param includeAttachmentFilePatterns
     *        A list of regular expression patterns. Documents that match the patterns are included in the index.
     *        Documents that don't match the patterns are excluded from the index. If a document matches both an
     *        inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the name of the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withIncludeAttachmentFilePatterns(String... includeAttachmentFilePatterns) {
        if (this.includeAttachmentFilePatterns == null) {
            setIncludeAttachmentFilePatterns(new java.util.ArrayList<String>(includeAttachmentFilePatterns.length));
        }
        for (String ele : includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents
     * that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an
     * exclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * 
     * @param includeAttachmentFilePatterns
     *        A list of regular expression patterns. Documents that match the patterns are included in the index.
     *        Documents that don't match the patterns are excluded from the index. If a document matches both an
     *        inclusion pattern and an exclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the name of the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withIncludeAttachmentFilePatterns(java.util.Collection<String> includeAttachmentFilePatterns) {
        setIncludeAttachmentFilePatterns(includeAttachmentFilePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * 
     * @return A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *         Documents that don't match the patterns are included in the index. If a document matches both an
     *         exclusion pattern and an inclusion pattern, the document is not included in the index.</p>
     *         <p>
     *         The regex is applied to the name of the attached file.
     */

    public java.util.List<String> getExcludeAttachmentFilePatterns() {
        return excludeAttachmentFilePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * 
     * @param excludeAttachmentFilePatterns
     *        A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *        Documents that don't match the patterns are included in the index. If a document matches both an exclusion
     *        pattern and an inclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the name of the attached file.
     */

    public void setExcludeAttachmentFilePatterns(java.util.Collection<String> excludeAttachmentFilePatterns) {
        if (excludeAttachmentFilePatterns == null) {
            this.excludeAttachmentFilePatterns = null;
            return;
        }

        this.excludeAttachmentFilePatterns = new java.util.ArrayList<String>(excludeAttachmentFilePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeAttachmentFilePatterns(java.util.Collection)} or
     * {@link #withExcludeAttachmentFilePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludeAttachmentFilePatterns
     *        A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *        Documents that don't match the patterns are included in the index. If a document matches both an exclusion
     *        pattern and an inclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the name of the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withExcludeAttachmentFilePatterns(String... excludeAttachmentFilePatterns) {
        if (this.excludeAttachmentFilePatterns == null) {
            setExcludeAttachmentFilePatterns(new java.util.ArrayList<String>(excludeAttachmentFilePatterns.length));
        }
        for (String ele : excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents
     * that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     * </p>
     * <p>
     * The regex is applied to the name of the attached file.
     * </p>
     * 
     * @param excludeAttachmentFilePatterns
     *        A list of regular expression patterns. Documents that match the patterns are excluded from the index.
     *        Documents that don't match the patterns are included in the index. If a document matches both an exclusion
     *        pattern and an inclusion pattern, the document is not included in the index.</p>
     *        <p>
     *        The regex is applied to the name of the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConfiguration withExcludeAttachmentFilePatterns(java.util.Collection<String> excludeAttachmentFilePatterns) {
        setExcludeAttachmentFilePatterns(excludeAttachmentFilePatterns);
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
        if (getServerUrl() != null)
            sb.append("ServerUrl: ").append(getServerUrl()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getStandardObjectConfigurations() != null)
            sb.append("StandardObjectConfigurations: ").append(getStandardObjectConfigurations()).append(",");
        if (getKnowledgeArticleConfiguration() != null)
            sb.append("KnowledgeArticleConfiguration: ").append(getKnowledgeArticleConfiguration()).append(",");
        if (getChatterFeedConfiguration() != null)
            sb.append("ChatterFeedConfiguration: ").append(getChatterFeedConfiguration()).append(",");
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: ").append(getCrawlAttachments()).append(",");
        if (getStandardObjectAttachmentConfiguration() != null)
            sb.append("StandardObjectAttachmentConfiguration: ").append(getStandardObjectAttachmentConfiguration()).append(",");
        if (getIncludeAttachmentFilePatterns() != null)
            sb.append("IncludeAttachmentFilePatterns: ").append(getIncludeAttachmentFilePatterns()).append(",");
        if (getExcludeAttachmentFilePatterns() != null)
            sb.append("ExcludeAttachmentFilePatterns: ").append(getExcludeAttachmentFilePatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceConfiguration == false)
            return false;
        SalesforceConfiguration other = (SalesforceConfiguration) obj;
        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getStandardObjectConfigurations() == null ^ this.getStandardObjectConfigurations() == null)
            return false;
        if (other.getStandardObjectConfigurations() != null && other.getStandardObjectConfigurations().equals(this.getStandardObjectConfigurations()) == false)
            return false;
        if (other.getKnowledgeArticleConfiguration() == null ^ this.getKnowledgeArticleConfiguration() == null)
            return false;
        if (other.getKnowledgeArticleConfiguration() != null
                && other.getKnowledgeArticleConfiguration().equals(this.getKnowledgeArticleConfiguration()) == false)
            return false;
        if (other.getChatterFeedConfiguration() == null ^ this.getChatterFeedConfiguration() == null)
            return false;
        if (other.getChatterFeedConfiguration() != null && other.getChatterFeedConfiguration().equals(this.getChatterFeedConfiguration()) == false)
            return false;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getStandardObjectAttachmentConfiguration() == null ^ this.getStandardObjectAttachmentConfiguration() == null)
            return false;
        if (other.getStandardObjectAttachmentConfiguration() != null
                && other.getStandardObjectAttachmentConfiguration().equals(this.getStandardObjectAttachmentConfiguration()) == false)
            return false;
        if (other.getIncludeAttachmentFilePatterns() == null ^ this.getIncludeAttachmentFilePatterns() == null)
            return false;
        if (other.getIncludeAttachmentFilePatterns() != null
                && other.getIncludeAttachmentFilePatterns().equals(this.getIncludeAttachmentFilePatterns()) == false)
            return false;
        if (other.getExcludeAttachmentFilePatterns() == null ^ this.getExcludeAttachmentFilePatterns() == null)
            return false;
        if (other.getExcludeAttachmentFilePatterns() != null
                && other.getExcludeAttachmentFilePatterns().equals(this.getExcludeAttachmentFilePatterns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getStandardObjectConfigurations() == null) ? 0 : getStandardObjectConfigurations().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeArticleConfiguration() == null) ? 0 : getKnowledgeArticleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getChatterFeedConfiguration() == null) ? 0 : getChatterFeedConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode + ((getStandardObjectAttachmentConfiguration() == null) ? 0 : getStandardObjectAttachmentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIncludeAttachmentFilePatterns() == null) ? 0 : getIncludeAttachmentFilePatterns().hashCode());
        hashCode = prime * hashCode + ((getExcludeAttachmentFilePatterns() == null) ? 0 : getExcludeAttachmentFilePatterns().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceConfiguration clone() {
        try {
            return (SalesforceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SalesforceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
