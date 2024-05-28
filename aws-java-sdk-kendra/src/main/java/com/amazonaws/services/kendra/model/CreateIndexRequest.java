/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the index.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended for
     * development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once you set the
     * edition for an index, it can't be changed.
     * </p>
     * <p>
     * The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     * <code>ENTERPRISE_EDITION</code>.
     * </p>
     * <p>
     * For more information on quota limits for Enterprise and Developer editions, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     */
    private String edition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and metrics.
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles
     * for Amazon Kendra</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * A description for the index.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The user token configuration.
     * </p>
     */
    private java.util.List<UserTokenConfiguration> userTokenConfigurations;
    /**
     * <p>
     * The user context policy.
     * </p>
     * <dl>
     * <dt>ATTRIBUTE_FILTER</dt>
     * <dd>
     * <p>
     * All indexed content is searchable and displayable for all users. If you want to filter search results on user
     * context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or you can
     * provide user and group information in <code>UserContext</code>.
     * </p>
     * </dd>
     * <dt>USER_TOKEN</dt>
     * <dd>
     * <p>
     * Enables token-based user access control to filter search results on user context. All documents with no access
     * control and all documents accessible to the user will be searchable and displayable.
     * </p>
     * </dd>
     * </dl>
     */
    private String userContextPolicy;
    /**
     * <p>
     * Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     * >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     */
    private UserGroupResolutionConfiguration userGroupResolutionConfiguration;

    /**
     * <p>
     * A name for the index.
     * </p>
     * 
     * @param name
     *        A name for the index.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the index.
     * </p>
     * 
     * @return A name for the index.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the index.
     * </p>
     * 
     * @param name
     *        A name for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended for
     * development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once you set the
     * edition for an index, it can't be changed.
     * </p>
     * <p>
     * The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     * <code>ENTERPRISE_EDITION</code>.
     * </p>
     * <p>
     * For more information on quota limits for Enterprise and Developer editions, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @param edition
     *        The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended
     *        for development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once
     *        you set the edition for an index, it can't be changed.</p>
     *        <p>
     *        The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     *        <code>ENTERPRISE_EDITION</code>.
     *        </p>
     *        <p>
     *        For more information on quota limits for Enterprise and Developer editions, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * @see IndexEdition
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended for
     * development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once you set the
     * edition for an index, it can't be changed.
     * </p>
     * <p>
     * The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     * <code>ENTERPRISE_EDITION</code>.
     * </p>
     * <p>
     * For more information on quota limits for Enterprise and Developer editions, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @return The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes
     *         intended for development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for
     *         production. Once you set the edition for an index, it can't be changed.</p>
     *         <p>
     *         The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     *         <code>ENTERPRISE_EDITION</code>.
     *         </p>
     *         <p>
     *         For more information on quota limits for Enterprise and Developer editions, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * @see IndexEdition
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended for
     * development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once you set the
     * edition for an index, it can't be changed.
     * </p>
     * <p>
     * The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     * <code>ENTERPRISE_EDITION</code>.
     * </p>
     * <p>
     * For more information on quota limits for Enterprise and Developer editions, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @param edition
     *        The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended
     *        for development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once
     *        you set the edition for an index, it can't be changed.</p>
     *        <p>
     *        The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     *        <code>ENTERPRISE_EDITION</code>.
     *        </p>
     *        <p>
     *        For more information on quota limits for Enterprise and Developer editions, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexEdition
     */

    public CreateIndexRequest withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended for
     * development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once you set the
     * edition for an index, it can't be changed.
     * </p>
     * <p>
     * The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     * <code>ENTERPRISE_EDITION</code>.
     * </p>
     * <p>
     * For more information on quota limits for Enterprise and Developer editions, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @param edition
     *        The Amazon Kendra edition to use for the index. Choose <code>DEVELOPER_EDITION</code> for indexes intended
     *        for development, testing, or proof of concept. Use <code>ENTERPRISE_EDITION</code> for production. Once
     *        you set the edition for an index, it can't be changed.</p>
     *        <p>
     *        The <code>Edition</code> parameter is optional. If you don't supply a value, the default is
     *        <code>ENTERPRISE_EDITION</code>.
     *        </p>
     *        <p>
     *        For more information on quota limits for Enterprise and Developer editions, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexEdition
     */

    public CreateIndexRequest withEdition(IndexEdition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and metrics.
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles
     * for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and
     *        metrics. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and metrics.
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles
     * for Amazon Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and
     *         metrics. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles for Amazon
     *         Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and metrics.
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles
     * for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access your Amazon CloudWatch logs and
     *        metrics. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM access roles for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra.
     *        Amazon Kendra doesn't support asymmetric CMKs.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     * 
     * @return The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon
     *         Kendra. Amazon Kendra doesn't support asymmetric CMKs.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The identifier of the KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra.
     *        Amazon Kendra doesn't support asymmetric CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * 
     * @param description
     *        A description for the index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * 
     * @return A description for the index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * 
     * @param description
     *        A description for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create an index. Multiple calls to the
     *        <code>CreateIndex</code> API with the same client token will create only one index.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     * 
     * @return A token that you provide to identify the request to create an index. Multiple calls to the
     *         <code>CreateIndex</code> API with the same client token will create only one index.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create an index. Multiple calls to the
     *        <code>CreateIndex</code> API with the same client token will create only one index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *         access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *         the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *        access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *        the following symbols: _ . : / = + - @.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *        access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *        the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *        access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *        the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The user token configuration.
     * </p>
     * 
     * @return The user token configuration.
     */

    public java.util.List<UserTokenConfiguration> getUserTokenConfigurations() {
        return userTokenConfigurations;
    }

    /**
     * <p>
     * The user token configuration.
     * </p>
     * 
     * @param userTokenConfigurations
     *        The user token configuration.
     */

    public void setUserTokenConfigurations(java.util.Collection<UserTokenConfiguration> userTokenConfigurations) {
        if (userTokenConfigurations == null) {
            this.userTokenConfigurations = null;
            return;
        }

        this.userTokenConfigurations = new java.util.ArrayList<UserTokenConfiguration>(userTokenConfigurations);
    }

    /**
     * <p>
     * The user token configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserTokenConfigurations(java.util.Collection)} or
     * {@link #withUserTokenConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userTokenConfigurations
     *        The user token configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withUserTokenConfigurations(UserTokenConfiguration... userTokenConfigurations) {
        if (this.userTokenConfigurations == null) {
            setUserTokenConfigurations(new java.util.ArrayList<UserTokenConfiguration>(userTokenConfigurations.length));
        }
        for (UserTokenConfiguration ele : userTokenConfigurations) {
            this.userTokenConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user token configuration.
     * </p>
     * 
     * @param userTokenConfigurations
     *        The user token configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withUserTokenConfigurations(java.util.Collection<UserTokenConfiguration> userTokenConfigurations) {
        setUserTokenConfigurations(userTokenConfigurations);
        return this;
    }

    /**
     * <p>
     * The user context policy.
     * </p>
     * <dl>
     * <dt>ATTRIBUTE_FILTER</dt>
     * <dd>
     * <p>
     * All indexed content is searchable and displayable for all users. If you want to filter search results on user
     * context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or you can
     * provide user and group information in <code>UserContext</code>.
     * </p>
     * </dd>
     * <dt>USER_TOKEN</dt>
     * <dd>
     * <p>
     * Enables token-based user access control to filter search results on user context. All documents with no access
     * control and all documents accessible to the user will be searchable and displayable.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param userContextPolicy
     *        The user context policy.</p>
     *        <dl>
     *        <dt>ATTRIBUTE_FILTER</dt>
     *        <dd>
     *        <p>
     *        All indexed content is searchable and displayable for all users. If you want to filter search results on
     *        user context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or
     *        you can provide user and group information in <code>UserContext</code>.
     *        </p>
     *        </dd>
     *        <dt>USER_TOKEN</dt>
     *        <dd>
     *        <p>
     *        Enables token-based user access control to filter search results on user context. All documents with no
     *        access control and all documents accessible to the user will be searchable and displayable.
     *        </p>
     *        </dd>
     * @see UserContextPolicy
     */

    public void setUserContextPolicy(String userContextPolicy) {
        this.userContextPolicy = userContextPolicy;
    }

    /**
     * <p>
     * The user context policy.
     * </p>
     * <dl>
     * <dt>ATTRIBUTE_FILTER</dt>
     * <dd>
     * <p>
     * All indexed content is searchable and displayable for all users. If you want to filter search results on user
     * context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or you can
     * provide user and group information in <code>UserContext</code>.
     * </p>
     * </dd>
     * <dt>USER_TOKEN</dt>
     * <dd>
     * <p>
     * Enables token-based user access control to filter search results on user context. All documents with no access
     * control and all documents accessible to the user will be searchable and displayable.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The user context policy.</p>
     *         <dl>
     *         <dt>ATTRIBUTE_FILTER</dt>
     *         <dd>
     *         <p>
     *         All indexed content is searchable and displayable for all users. If you want to filter search results on
     *         user context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or
     *         you can provide user and group information in <code>UserContext</code>.
     *         </p>
     *         </dd>
     *         <dt>USER_TOKEN</dt>
     *         <dd>
     *         <p>
     *         Enables token-based user access control to filter search results on user context. All documents with no
     *         access control and all documents accessible to the user will be searchable and displayable.
     *         </p>
     *         </dd>
     * @see UserContextPolicy
     */

    public String getUserContextPolicy() {
        return this.userContextPolicy;
    }

    /**
     * <p>
     * The user context policy.
     * </p>
     * <dl>
     * <dt>ATTRIBUTE_FILTER</dt>
     * <dd>
     * <p>
     * All indexed content is searchable and displayable for all users. If you want to filter search results on user
     * context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or you can
     * provide user and group information in <code>UserContext</code>.
     * </p>
     * </dd>
     * <dt>USER_TOKEN</dt>
     * <dd>
     * <p>
     * Enables token-based user access control to filter search results on user context. All documents with no access
     * control and all documents accessible to the user will be searchable and displayable.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param userContextPolicy
     *        The user context policy.</p>
     *        <dl>
     *        <dt>ATTRIBUTE_FILTER</dt>
     *        <dd>
     *        <p>
     *        All indexed content is searchable and displayable for all users. If you want to filter search results on
     *        user context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or
     *        you can provide user and group information in <code>UserContext</code>.
     *        </p>
     *        </dd>
     *        <dt>USER_TOKEN</dt>
     *        <dd>
     *        <p>
     *        Enables token-based user access control to filter search results on user context. All documents with no
     *        access control and all documents accessible to the user will be searchable and displayable.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserContextPolicy
     */

    public CreateIndexRequest withUserContextPolicy(String userContextPolicy) {
        setUserContextPolicy(userContextPolicy);
        return this;
    }

    /**
     * <p>
     * The user context policy.
     * </p>
     * <dl>
     * <dt>ATTRIBUTE_FILTER</dt>
     * <dd>
     * <p>
     * All indexed content is searchable and displayable for all users. If you want to filter search results on user
     * context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or you can
     * provide user and group information in <code>UserContext</code>.
     * </p>
     * </dd>
     * <dt>USER_TOKEN</dt>
     * <dd>
     * <p>
     * Enables token-based user access control to filter search results on user context. All documents with no access
     * control and all documents accessible to the user will be searchable and displayable.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param userContextPolicy
     *        The user context policy.</p>
     *        <dl>
     *        <dt>ATTRIBUTE_FILTER</dt>
     *        <dd>
     *        <p>
     *        All indexed content is searchable and displayable for all users. If you want to filter search results on
     *        user context, you can use the attribute filters of <code>_user_id</code> and <code>_group_ids</code> or
     *        you can provide user and group information in <code>UserContext</code>.
     *        </p>
     *        </dd>
     *        <dt>USER_TOKEN</dt>
     *        <dd>
     *        <p>
     *        Enables token-based user access control to filter search results on user context. All documents with no
     *        access control and all documents accessible to the user will be searchable and displayable.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserContextPolicy
     */

    public CreateIndexRequest withUserContextPolicy(UserContextPolicy userContextPolicy) {
        this.userContextPolicy = userContextPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     * >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param userGroupResolutionConfiguration
     *        Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     *        >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results are
     *        filtered based on the user or their group access to documents.
     */

    public void setUserGroupResolutionConfiguration(UserGroupResolutionConfiguration userGroupResolutionConfiguration) {
        this.userGroupResolutionConfiguration = userGroupResolutionConfiguration;
    }

    /**
     * <p>
     * Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     * >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     * 
     * @return Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     *         >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results
     *         are filtered based on the user or their group access to documents.
     */

    public UserGroupResolutionConfiguration getUserGroupResolutionConfiguration() {
        return this.userGroupResolutionConfiguration;
    }

    /**
     * <p>
     * Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     * >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param userGroupResolutionConfiguration
     *        Gets users and groups from IAM Identity Center identity source. To configure this, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html"
     *        >UserGroupResolutionConfiguration</a>. This is useful for user context filtering, where search results are
     *        filtered based on the user or their group access to documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withUserGroupResolutionConfiguration(UserGroupResolutionConfiguration userGroupResolutionConfiguration) {
        setUserGroupResolutionConfiguration(userGroupResolutionConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEdition() != null)
            sb.append("Edition: ").append(getEdition()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUserTokenConfigurations() != null)
            sb.append("UserTokenConfigurations: ").append(getUserTokenConfigurations()).append(",");
        if (getUserContextPolicy() != null)
            sb.append("UserContextPolicy: ").append(getUserContextPolicy()).append(",");
        if (getUserGroupResolutionConfiguration() != null)
            sb.append("UserGroupResolutionConfiguration: ").append(getUserGroupResolutionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIndexRequest == false)
            return false;
        CreateIndexRequest other = (CreateIndexRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserTokenConfigurations() == null ^ this.getUserTokenConfigurations() == null)
            return false;
        if (other.getUserTokenConfigurations() != null && other.getUserTokenConfigurations().equals(this.getUserTokenConfigurations()) == false)
            return false;
        if (other.getUserContextPolicy() == null ^ this.getUserContextPolicy() == null)
            return false;
        if (other.getUserContextPolicy() != null && other.getUserContextPolicy().equals(this.getUserContextPolicy()) == false)
            return false;
        if (other.getUserGroupResolutionConfiguration() == null ^ this.getUserGroupResolutionConfiguration() == null)
            return false;
        if (other.getUserGroupResolutionConfiguration() != null
                && other.getUserGroupResolutionConfiguration().equals(this.getUserGroupResolutionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserTokenConfigurations() == null) ? 0 : getUserTokenConfigurations().hashCode());
        hashCode = prime * hashCode + ((getUserContextPolicy() == null) ? 0 : getUserContextPolicy().hashCode());
        hashCode = prime * hashCode + ((getUserGroupResolutionConfiguration() == null) ? 0 : getUserGroupResolutionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateIndexRequest clone() {
        return (CreateIndexRequest) super.clone();
    }

}
