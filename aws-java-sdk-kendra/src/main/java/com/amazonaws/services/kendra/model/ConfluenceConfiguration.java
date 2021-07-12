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
 * Provides configuration information for data sources that connect to Confluence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConfluenceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of your Confluence instance. Use the full URL of the server. For example,
     * <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     * <code>https://192.168.1.113/</code>.
     * </p>
     */
    private String serverUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Confluence server. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username - The user name or email address of a user with administrative privileges for the Confluence server.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Confluence server.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * Specifies the version of the Confluence installation that you are connecting to.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Specifies configuration information for indexing Confluence spaces.
     * </p>
     */
    private ConfluenceSpaceConfiguration spaceConfiguration;
    /**
     * <p>
     * Specifies configuration information for indexing Confluence pages.
     * </p>
     */
    private ConfluencePageConfiguration pageConfiguration;
    /**
     * <p>
     * Specifies configuration information for indexing Confluence blogs.
     * </p>
     */
    private ConfluenceBlogConfiguration blogConfiguration;
    /**
     * <p>
     * Specifies configuration information for indexing attachments to Confluence blogs and pages.
     * </p>
     */
    private ConfluenceAttachmentConfiguration attachmentConfiguration;
    /**
     * <p>
     * Specifies the information for connecting to an Amazon VPC.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index.
     * Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and
     * an exclusion pattern, the item isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the
     * index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern
     * and an inclusion pattern, the item isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;

    /**
     * <p>
     * The URL of your Confluence instance. Use the full URL of the server. For example,
     * <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     * <code>https://192.168.1.113/</code>.
     * </p>
     * 
     * @param serverUrl
     *        The URL of your Confluence instance. Use the full URL of the server. For example,
     *        <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     *        <code>https://192.168.1.113/</code>.
     */

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * <p>
     * The URL of your Confluence instance. Use the full URL of the server. For example,
     * <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     * <code>https://192.168.1.113/</code>.
     * </p>
     * 
     * @return The URL of your Confluence instance. Use the full URL of the server. For example,
     *         <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     *         <code>https://192.168.1.113/</code>.
     */

    public String getServerUrl() {
        return this.serverUrl;
    }

    /**
     * <p>
     * The URL of your Confluence instance. Use the full URL of the server. For example,
     * <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     * <code>https://192.168.1.113/</code>.
     * </p>
     * 
     * @param serverUrl
     *        The URL of your Confluence instance. Use the full URL of the server. For example,
     *        <code>https://server.example.com:port/</code>. You can also use an IP address, for example,
     *        <code>https://192.168.1.113/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withServerUrl(String serverUrl) {
        setServerUrl(serverUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Confluence server. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username - The user name or email address of a user with administrative privileges for the Confluence server.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Confluence server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to
     *        connect to your Confluence server. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        username - The user name or email address of a user with administrative privileges for the Confluence
     *        server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password - The password associated with the user logging in to the Confluence server.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Confluence server. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username - The user name or email address of a user with administrative privileges for the Confluence server.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Confluence server.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to
     *         connect to your Confluence server. The secret must contain a JSON structure with the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         username - The user name or email address of a user with administrative privileges for the Confluence
     *         server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         password - The password associated with the user logging in to the Confluence server.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect
     * to your Confluence server. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * username - The user name or email address of a user with administrative privileges for the Confluence server.
     * </p>
     * </li>
     * <li>
     * <p>
     * password - The password associated with the user logging in to the Confluence server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to
     *        connect to your Confluence server. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        username - The user name or email address of a user with administrative privileges for the Confluence
     *        server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        password - The password associated with the user logging in to the Confluence server.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * Specifies the version of the Confluence installation that you are connecting to.
     * </p>
     * 
     * @param version
     *        Specifies the version of the Confluence installation that you are connecting to.
     * @see ConfluenceVersion
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Specifies the version of the Confluence installation that you are connecting to.
     * </p>
     * 
     * @return Specifies the version of the Confluence installation that you are connecting to.
     * @see ConfluenceVersion
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Specifies the version of the Confluence installation that you are connecting to.
     * </p>
     * 
     * @param version
     *        Specifies the version of the Confluence installation that you are connecting to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluenceVersion
     */

    public ConfluenceConfiguration withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Specifies the version of the Confluence installation that you are connecting to.
     * </p>
     * 
     * @param version
     *        Specifies the version of the Confluence installation that you are connecting to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluenceVersion
     */

    public ConfluenceConfiguration withVersion(ConfluenceVersion version) {
        this.version = version.toString();
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence spaces.
     * </p>
     * 
     * @param spaceConfiguration
     *        Specifies configuration information for indexing Confluence spaces.
     */

    public void setSpaceConfiguration(ConfluenceSpaceConfiguration spaceConfiguration) {
        this.spaceConfiguration = spaceConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence spaces.
     * </p>
     * 
     * @return Specifies configuration information for indexing Confluence spaces.
     */

    public ConfluenceSpaceConfiguration getSpaceConfiguration() {
        return this.spaceConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence spaces.
     * </p>
     * 
     * @param spaceConfiguration
     *        Specifies configuration information for indexing Confluence spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withSpaceConfiguration(ConfluenceSpaceConfiguration spaceConfiguration) {
        setSpaceConfiguration(spaceConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence pages.
     * </p>
     * 
     * @param pageConfiguration
     *        Specifies configuration information for indexing Confluence pages.
     */

    public void setPageConfiguration(ConfluencePageConfiguration pageConfiguration) {
        this.pageConfiguration = pageConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence pages.
     * </p>
     * 
     * @return Specifies configuration information for indexing Confluence pages.
     */

    public ConfluencePageConfiguration getPageConfiguration() {
        return this.pageConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence pages.
     * </p>
     * 
     * @param pageConfiguration
     *        Specifies configuration information for indexing Confluence pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withPageConfiguration(ConfluencePageConfiguration pageConfiguration) {
        setPageConfiguration(pageConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence blogs.
     * </p>
     * 
     * @param blogConfiguration
     *        Specifies configuration information for indexing Confluence blogs.
     */

    public void setBlogConfiguration(ConfluenceBlogConfiguration blogConfiguration) {
        this.blogConfiguration = blogConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence blogs.
     * </p>
     * 
     * @return Specifies configuration information for indexing Confluence blogs.
     */

    public ConfluenceBlogConfiguration getBlogConfiguration() {
        return this.blogConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing Confluence blogs.
     * </p>
     * 
     * @param blogConfiguration
     *        Specifies configuration information for indexing Confluence blogs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withBlogConfiguration(ConfluenceBlogConfiguration blogConfiguration) {
        setBlogConfiguration(blogConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for indexing attachments to Confluence blogs and pages.
     * </p>
     * 
     * @param attachmentConfiguration
     *        Specifies configuration information for indexing attachments to Confluence blogs and pages.
     */

    public void setAttachmentConfiguration(ConfluenceAttachmentConfiguration attachmentConfiguration) {
        this.attachmentConfiguration = attachmentConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing attachments to Confluence blogs and pages.
     * </p>
     * 
     * @return Specifies configuration information for indexing attachments to Confluence blogs and pages.
     */

    public ConfluenceAttachmentConfiguration getAttachmentConfiguration() {
        return this.attachmentConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for indexing attachments to Confluence blogs and pages.
     * </p>
     * 
     * @param attachmentConfiguration
     *        Specifies configuration information for indexing attachments to Confluence blogs and pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withAttachmentConfiguration(ConfluenceAttachmentConfiguration attachmentConfiguration) {
        setAttachmentConfiguration(attachmentConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the information for connecting to an Amazon VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        Specifies the information for connecting to an Amazon VPC.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Specifies the information for connecting to an Amazon VPC.
     * </p>
     * 
     * @return Specifies the information for connecting to an Amazon VPC.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Specifies the information for connecting to an Amazon VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        Specifies the information for connecting to an Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index.
     * Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and
     * an exclusion pattern, the item isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern
     *         can apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included
     *         in the index. Items that don't match the pattern are excluded from the index. If an item matches both an
     *         inclusion pattern and an exclusion pattern, the item isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index.
     * Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and
     * an exclusion pattern, the item isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern
     *        can apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in
     *        the index. Items that don't match the pattern are excluded from the index. If an item matches both an
     *        inclusion pattern and an exclusion pattern, the item isn't included in the index.
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
     * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index.
     * Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and
     * an exclusion pattern, the item isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern
     *        can apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in
     *        the index. Items that don't match the pattern are excluded from the index. If an item matches both an
     *        inclusion pattern and an exclusion pattern, the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withInclusionPatterns(String... inclusionPatterns) {
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
     * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index.
     * Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and
     * an exclusion pattern, the item isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern
     *        can apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in
     *        the index. Items that don't match the pattern are excluded from the index. If an item matches both an
     *        inclusion pattern and an exclusion pattern, the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the
     * index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern
     * and an inclusion pattern, the item isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern
     *         can apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded
     *         from the index. Items that don't match the pattern are included in the index. If a item matches both an
     *         exclusion pattern and an inclusion pattern, the item isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the
     * index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern
     * and an inclusion pattern, the item isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern
     *        can apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded
     *        from the index. Items that don't match the pattern are included in the index. If a item matches both an
     *        exclusion pattern and an inclusion pattern, the item isn't included in the index.
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
     * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the
     * index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern
     * and an inclusion pattern, the item isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern
     *        can apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded
     *        from the index. Items that don't match the pattern are included in the index. If a item matches both an
     *        exclusion pattern and an inclusion pattern, the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withExclusionPatterns(String... exclusionPatterns) {
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
     * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can
     * apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the
     * index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern
     * and an inclusion pattern, the item isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern
     *        can apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded
     *        from the index. Items that don't match the pattern are included in the index. If a item matches both an
     *        exclusion pattern and an inclusion pattern, the item isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getSpaceConfiguration() != null)
            sb.append("SpaceConfiguration: ").append(getSpaceConfiguration()).append(",");
        if (getPageConfiguration() != null)
            sb.append("PageConfiguration: ").append(getPageConfiguration()).append(",");
        if (getBlogConfiguration() != null)
            sb.append("BlogConfiguration: ").append(getBlogConfiguration()).append(",");
        if (getAttachmentConfiguration() != null)
            sb.append("AttachmentConfiguration: ").append(getAttachmentConfiguration()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfluenceConfiguration == false)
            return false;
        ConfluenceConfiguration other = (ConfluenceConfiguration) obj;
        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSpaceConfiguration() == null ^ this.getSpaceConfiguration() == null)
            return false;
        if (other.getSpaceConfiguration() != null && other.getSpaceConfiguration().equals(this.getSpaceConfiguration()) == false)
            return false;
        if (other.getPageConfiguration() == null ^ this.getPageConfiguration() == null)
            return false;
        if (other.getPageConfiguration() != null && other.getPageConfiguration().equals(this.getPageConfiguration()) == false)
            return false;
        if (other.getBlogConfiguration() == null ^ this.getBlogConfiguration() == null)
            return false;
        if (other.getBlogConfiguration() != null && other.getBlogConfiguration().equals(this.getBlogConfiguration()) == false)
            return false;
        if (other.getAttachmentConfiguration() == null ^ this.getAttachmentConfiguration() == null)
            return false;
        if (other.getAttachmentConfiguration() != null && other.getAttachmentConfiguration().equals(this.getAttachmentConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSpaceConfiguration() == null) ? 0 : getSpaceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPageConfiguration() == null) ? 0 : getPageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBlogConfiguration() == null) ? 0 : getBlogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAttachmentConfiguration() == null) ? 0 : getAttachmentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        return hashCode;
    }

    @Override
    public ConfluenceConfiguration clone() {
        try {
            return (ConfluenceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConfluenceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
