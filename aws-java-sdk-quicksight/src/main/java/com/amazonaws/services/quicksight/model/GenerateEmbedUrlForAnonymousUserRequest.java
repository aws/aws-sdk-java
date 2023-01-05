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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GenerateEmbedUrlForAnonymousUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateEmbedUrlForAnonymousUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     */
    private Long sessionLifetimeInMinutes;
    /**
     * <p>
     * The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an Amazon
     * QuickSight custom namespace, set this to <code>default</code>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The session tags used for row-level security. Before you use this parameter, make sure that you have configured
     * the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code> parameter so that session
     * tags can be used to provide row-level security.
     * </p>
     * <p>
     * These are not the tags used for the Amazon Web Services resource tagging feature. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<SessionTag> sessionTags;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access during
     * the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the list of
     * dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass up to 25
     * dashboard ARNs in each API call.
     * </p>
     */
    private java.util.List<String> authorizedResourceArns;
    /**
     * <p>
     * The configuration of the experience that you are embedding.
     * </p>
     */
    private AnonymousUserEmbeddingExperienceConfiguration experienceConfiguration;
    /**
     * <p>
     * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This
     * optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon
     * QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to
     * three domains or subdomains in each API call.
     * </p>
     * <p>
     * To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     * <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * </p>
     */
    private java.util.List<String> allowedDomains;

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @return The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     */

    public void setSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     * 
     * @return How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     */

    public Long getSessionLifetimeInMinutes() {
        return this.sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        setSessionLifetimeInMinutes(sessionLifetimeInMinutes);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an Amazon
     * QuickSight custom namespace, set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an
     *        Amazon QuickSight custom namespace, set this to <code>default</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an Amazon
     * QuickSight custom namespace, set this to <code>default</code>.
     * </p>
     * 
     * @return The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an
     *         Amazon QuickSight custom namespace, set this to <code>default</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an Amazon
     * QuickSight custom namespace, set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an
     *        Amazon QuickSight custom namespace, set this to <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The session tags used for row-level security. Before you use this parameter, make sure that you have configured
     * the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code> parameter so that session
     * tags can be used to provide row-level security.
     * </p>
     * <p>
     * These are not the tags used for the Amazon Web Services resource tagging feature. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The session tags used for row-level security. Before you use this parameter, make sure that you have
     *         configured the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code>
     *         parameter so that session tags can be used to provide row-level security.</p>
     *         <p>
     *         These are not the tags used for the Amazon Web Services resource tagging feature. For more information,
     *         see <a href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using
     *         Row-Level Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<SessionTag> getSessionTags() {
        return sessionTags;
    }

    /**
     * <p>
     * The session tags used for row-level security. Before you use this parameter, make sure that you have configured
     * the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code> parameter so that session
     * tags can be used to provide row-level security.
     * </p>
     * <p>
     * These are not the tags used for the Amazon Web Services resource tagging feature. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param sessionTags
     *        The session tags used for row-level security. Before you use this parameter, make sure that you have
     *        configured the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code>
     *        parameter so that session tags can be used to provide row-level security.</p>
     *        <p>
     *        These are not the tags used for the Amazon Web Services resource tagging feature. For more information,
     *        see <a href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using
     *        Row-Level Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setSessionTags(java.util.Collection<SessionTag> sessionTags) {
        if (sessionTags == null) {
            this.sessionTags = null;
            return;
        }

        this.sessionTags = new java.util.ArrayList<SessionTag>(sessionTags);
    }

    /**
     * <p>
     * The session tags used for row-level security. Before you use this parameter, make sure that you have configured
     * the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code> parameter so that session
     * tags can be used to provide row-level security.
     * </p>
     * <p>
     * These are not the tags used for the Amazon Web Services resource tagging feature. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessionTags(java.util.Collection)} or {@link #withSessionTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sessionTags
     *        The session tags used for row-level security. Before you use this parameter, make sure that you have
     *        configured the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code>
     *        parameter so that session tags can be used to provide row-level security.</p>
     *        <p>
     *        These are not the tags used for the Amazon Web Services resource tagging feature. For more information,
     *        see <a href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using
     *        Row-Level Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withSessionTags(SessionTag... sessionTags) {
        if (this.sessionTags == null) {
            setSessionTags(new java.util.ArrayList<SessionTag>(sessionTags.length));
        }
        for (SessionTag ele : sessionTags) {
            this.sessionTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The session tags used for row-level security. Before you use this parameter, make sure that you have configured
     * the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code> parameter so that session
     * tags can be used to provide row-level security.
     * </p>
     * <p>
     * These are not the tags used for the Amazon Web Services resource tagging feature. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param sessionTags
     *        The session tags used for row-level security. Before you use this parameter, make sure that you have
     *        configured the relevant datasets using the <code>DataSet$RowLevelPermissionTagConfiguration</code>
     *        parameter so that session tags can be used to provide row-level security.</p>
     *        <p>
     *        These are not the tags used for the Amazon Web Services resource tagging feature. For more information,
     *        see <a href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using
     *        Row-Level Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withSessionTags(java.util.Collection<SessionTag> sessionTags) {
        setSessionTags(sessionTags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access during
     * the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the list of
     * dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass up to 25
     * dashboard ARNs in each API call.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to
     *         access during the lifetime of the session. If you choose <code>Dashboard</code> embedding experience,
     *         pass the list of dashboard ARNs in the account that you want the user to be able to view. Currently, you
     *         can pass up to 25 dashboard ARNs in each API call.
     */

    public java.util.List<String> getAuthorizedResourceArns() {
        return authorizedResourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access during
     * the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the list of
     * dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass up to 25
     * dashboard ARNs in each API call.
     * </p>
     * 
     * @param authorizedResourceArns
     *        The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access
     *        during the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the
     *        list of dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass
     *        up to 25 dashboard ARNs in each API call.
     */

    public void setAuthorizedResourceArns(java.util.Collection<String> authorizedResourceArns) {
        if (authorizedResourceArns == null) {
            this.authorizedResourceArns = null;
            return;
        }

        this.authorizedResourceArns = new java.util.ArrayList<String>(authorizedResourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access during
     * the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the list of
     * dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass up to 25
     * dashboard ARNs in each API call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedResourceArns(java.util.Collection)} or
     * {@link #withAuthorizedResourceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authorizedResourceArns
     *        The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access
     *        during the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the
     *        list of dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass
     *        up to 25 dashboard ARNs in each API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withAuthorizedResourceArns(String... authorizedResourceArns) {
        if (this.authorizedResourceArns == null) {
            setAuthorizedResourceArns(new java.util.ArrayList<String>(authorizedResourceArns.length));
        }
        for (String ele : authorizedResourceArns) {
            this.authorizedResourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access during
     * the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the list of
     * dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass up to 25
     * dashboard ARNs in each API call.
     * </p>
     * 
     * @param authorizedResourceArns
     *        The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access
     *        during the lifetime of the session. If you choose <code>Dashboard</code> embedding experience, pass the
     *        list of dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass
     *        up to 25 dashboard ARNs in each API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withAuthorizedResourceArns(java.util.Collection<String> authorizedResourceArns) {
        setAuthorizedResourceArns(authorizedResourceArns);
        return this;
    }

    /**
     * <p>
     * The configuration of the experience that you are embedding.
     * </p>
     * 
     * @param experienceConfiguration
     *        The configuration of the experience that you are embedding.
     */

    public void setExperienceConfiguration(AnonymousUserEmbeddingExperienceConfiguration experienceConfiguration) {
        this.experienceConfiguration = experienceConfiguration;
    }

    /**
     * <p>
     * The configuration of the experience that you are embedding.
     * </p>
     * 
     * @return The configuration of the experience that you are embedding.
     */

    public AnonymousUserEmbeddingExperienceConfiguration getExperienceConfiguration() {
        return this.experienceConfiguration;
    }

    /**
     * <p>
     * The configuration of the experience that you are embedding.
     * </p>
     * 
     * @param experienceConfiguration
     *        The configuration of the experience that you are embedding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withExperienceConfiguration(AnonymousUserEmbeddingExperienceConfiguration experienceConfiguration) {
        setExperienceConfiguration(experienceConfiguration);
        return this;
    }

    /**
     * <p>
     * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This
     * optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon
     * QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to
     * three domains or subdomains in each API call.
     * </p>
     * <p>
     * To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     * <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * </p>
     * 
     * @return The domains that you want to add to the allow list for access to the generated URL that is then embedded.
     *         This optional parameter overrides the static domains that are configured in the Manage QuickSight menu in
     *         the Amazon QuickSight console. Instead, it allows only the domains that you include in this parameter.
     *         You can list up to three domains or subdomains in each API call.</p>
     *         <p>
     *         To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     *         <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     */

    public java.util.List<String> getAllowedDomains() {
        return allowedDomains;
    }

    /**
     * <p>
     * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This
     * optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon
     * QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to
     * three domains or subdomains in each API call.
     * </p>
     * <p>
     * To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     * <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * </p>
     * 
     * @param allowedDomains
     *        The domains that you want to add to the allow list for access to the generated URL that is then embedded.
     *        This optional parameter overrides the static domains that are configured in the Manage QuickSight menu in
     *        the Amazon QuickSight console. Instead, it allows only the domains that you include in this parameter. You
     *        can list up to three domains or subdomains in each API call.</p>
     *        <p>
     *        To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     *        <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     */

    public void setAllowedDomains(java.util.Collection<String> allowedDomains) {
        if (allowedDomains == null) {
            this.allowedDomains = null;
            return;
        }

        this.allowedDomains = new java.util.ArrayList<String>(allowedDomains);
    }

    /**
     * <p>
     * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This
     * optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon
     * QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to
     * three domains or subdomains in each API call.
     * </p>
     * <p>
     * To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     * <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedDomains(java.util.Collection)} or {@link #withAllowedDomains(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedDomains
     *        The domains that you want to add to the allow list for access to the generated URL that is then embedded.
     *        This optional parameter overrides the static domains that are configured in the Manage QuickSight menu in
     *        the Amazon QuickSight console. Instead, it allows only the domains that you include in this parameter. You
     *        can list up to three domains or subdomains in each API call.</p>
     *        <p>
     *        To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     *        <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withAllowedDomains(String... allowedDomains) {
        if (this.allowedDomains == null) {
            setAllowedDomains(new java.util.ArrayList<String>(allowedDomains.length));
        }
        for (String ele : allowedDomains) {
            this.allowedDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This
     * optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon
     * QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to
     * three domains or subdomains in each API call.
     * </p>
     * <p>
     * To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     * <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * </p>
     * 
     * @param allowedDomains
     *        The domains that you want to add to the allow list for access to the generated URL that is then embedded.
     *        This optional parameter overrides the static domains that are configured in the Manage QuickSight menu in
     *        the Amazon QuickSight console. Instead, it allows only the domains that you include in this parameter. You
     *        can list up to three domains or subdomains in each API call.</p>
     *        <p>
     *        To include all subdomains under a specific domain to the allow list, use <code>*</code>. For example,
     *        <code>https://*.sapp.amazon.com</code> includes all subdomains under <code>https://sapp.amazon.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForAnonymousUserRequest withAllowedDomains(java.util.Collection<String> allowedDomains) {
        setAllowedDomains(allowedDomains);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getSessionLifetimeInMinutes() != null)
            sb.append("SessionLifetimeInMinutes: ").append(getSessionLifetimeInMinutes()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getSessionTags() != null)
            sb.append("SessionTags: ").append(getSessionTags()).append(",");
        if (getAuthorizedResourceArns() != null)
            sb.append("AuthorizedResourceArns: ").append(getAuthorizedResourceArns()).append(",");
        if (getExperienceConfiguration() != null)
            sb.append("ExperienceConfiguration: ").append(getExperienceConfiguration()).append(",");
        if (getAllowedDomains() != null)
            sb.append("AllowedDomains: ").append(getAllowedDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateEmbedUrlForAnonymousUserRequest == false)
            return false;
        GenerateEmbedUrlForAnonymousUserRequest other = (GenerateEmbedUrlForAnonymousUserRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getSessionLifetimeInMinutes() == null ^ this.getSessionLifetimeInMinutes() == null)
            return false;
        if (other.getSessionLifetimeInMinutes() != null && other.getSessionLifetimeInMinutes().equals(this.getSessionLifetimeInMinutes()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getSessionTags() == null ^ this.getSessionTags() == null)
            return false;
        if (other.getSessionTags() != null && other.getSessionTags().equals(this.getSessionTags()) == false)
            return false;
        if (other.getAuthorizedResourceArns() == null ^ this.getAuthorizedResourceArns() == null)
            return false;
        if (other.getAuthorizedResourceArns() != null && other.getAuthorizedResourceArns().equals(this.getAuthorizedResourceArns()) == false)
            return false;
        if (other.getExperienceConfiguration() == null ^ this.getExperienceConfiguration() == null)
            return false;
        if (other.getExperienceConfiguration() != null && other.getExperienceConfiguration().equals(this.getExperienceConfiguration()) == false)
            return false;
        if (other.getAllowedDomains() == null ^ this.getAllowedDomains() == null)
            return false;
        if (other.getAllowedDomains() != null && other.getAllowedDomains().equals(this.getAllowedDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getSessionLifetimeInMinutes() == null) ? 0 : getSessionLifetimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getSessionTags() == null) ? 0 : getSessionTags().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedResourceArns() == null) ? 0 : getAuthorizedResourceArns().hashCode());
        hashCode = prime * hashCode + ((getExperienceConfiguration() == null) ? 0 : getExperienceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAllowedDomains() == null) ? 0 : getAllowedDomains().hashCode());
        return hashCode;
    }

    @Override
    public GenerateEmbedUrlForAnonymousUserRequest clone() {
        return (GenerateEmbedUrlForAnonymousUserRequest) super.clone();
    }

}
