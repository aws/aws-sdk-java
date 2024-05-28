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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a GraphQL API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GraphqlApi implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The authentication type.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     */
    private LogConfig logConfig;
    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     */
    private UserPoolConfig userPoolConfig;
    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     */
    private OpenIDConnectConfig openIDConnectConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The URIs.
     * </p>
     */
    private java.util.Map<String, String> uris;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     */
    private java.util.List<AdditionalAuthenticationProvider> additionalAuthenticationProviders;
    /**
     * <p>
     * A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     * </p>
     */
    private Boolean xrayEnabled;
    /**
     * <p>
     * The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     * </p>
     */
    private String wafWebAclArn;
    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     */
    private LambdaAuthorizerConfig lambdaAuthorizerConfig;
    /**
     * <p>
     * The DNS records for the API.
     * </p>
     */
    private java.util.Map<String, String> dns;
    /**
     * <p>
     * Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no value
     * is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be changed once the
     * API has been created.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     */
    private String apiType;
    /**
     * <p>
     * The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this role on
     * behalf of the Merged API to validate access to source APIs at runtime and to prompt the <code>AUTO_MERGE</code>
     * to update the merged API endpoint with the source API changes automatically.
     * </p>
     */
    private String mergedApiExecutionRoleArn;
    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The owner contact information for an API resource.
     * </p>
     * <p>
     * This field accepts any string input with a length of 0 - 256 characters.
     * </p>
     */
    private String ownerContact;
    /**
     * <p>
     * Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     * introspection. If no value is provided, the introspection configuration will be set to <code>ENABLED</code> by
     * default. This field will produce an error if the operation attempts to use the introspection feature while this
     * field is disabled.
     * </p>
     * <p>
     * For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     * introspection</a>.
     * </p>
     */
    private String introspectionConfig;
    /**
     * <p>
     * The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in
     * the body of query. The default value is <code>0</code> (or unspecified), which indicates there's no depth limit.
     * If you set a limit, it can be between <code>1</code> and <code>75</code> nested levels. This field will produce a
     * limit error if the operation falls out of bounds.
     * </p>
     * <p>
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the
     * error will be thrown upwards to the first nullable field available.
     * </p>
     */
    private Integer queryDepthLimit;
    /**
     * <p>
     * The maximum number of resolvers that can be invoked in a single request. The default value is <code>0</code> (or
     * unspecified), which will set the limit to <code>10000</code>. When specified, the limit value can be between
     * <code>1</code> and <code>10000</code>. This field will produce a limit error if the operation falls out of
     * bounds.
     * </p>
     */
    private Integer resolverCountLimit;
    /**
     * <p>
     * The <code>enhancedMetricsConfig</code> object.
     * </p>
     */
    private EnhancedMetricsConfig enhancedMetricsConfig;

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param name
     *        The API name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @return The API name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param name
     *        The API name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @return The authentication type.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public GraphqlApi withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public GraphqlApi withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     */

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs configuration.
     */

    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withLogConfig(LogConfig logConfig) {
        setLogConfig(logConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     */

    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @return The Amazon Cognito user pool configuration.
     */

    public UserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withUserPoolConfig(UserPoolConfig userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration.
     */

    public void setOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @return The OpenID Connect configuration.
     */

    public OpenIDConnectConfig getOpenIDConnectConfig() {
        return this.openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        setOpenIDConnectConfig(openIDConnectConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The URIs.
     * </p>
     * 
     * @return The URIs.
     */

    public java.util.Map<String, String> getUris() {
        return uris;
    }

    /**
     * <p>
     * The URIs.
     * </p>
     * 
     * @param uris
     *        The URIs.
     */

    public void setUris(java.util.Map<String, String> uris) {
        this.uris = uris;
    }

    /**
     * <p>
     * The URIs.
     * </p>
     * 
     * @param uris
     *        The URIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withUris(java.util.Map<String, String> uris) {
        setUris(uris);
        return this;
    }

    /**
     * Add a single Uris entry
     *
     * @see GraphqlApi#withUris
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi addUrisEntry(String key, String value) {
        if (null == this.uris) {
            this.uris = new java.util.HashMap<String, String>();
        }
        if (this.uris.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.uris.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Uris.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi clearUrisEntries() {
        this.uris = null;
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GraphqlApi#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @return A list of additional authentication providers for the <code>GraphqlApi</code> API.
     */

    public java.util.List<AdditionalAuthenticationProvider> getAdditionalAuthenticationProviders() {
        return additionalAuthenticationProviders;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     */

    public void setAdditionalAuthenticationProviders(java.util.Collection<AdditionalAuthenticationProvider> additionalAuthenticationProviders) {
        if (additionalAuthenticationProviders == null) {
            this.additionalAuthenticationProviders = null;
            return;
        }

        this.additionalAuthenticationProviders = new java.util.ArrayList<AdditionalAuthenticationProvider>(additionalAuthenticationProviders);
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAuthenticationProviders(java.util.Collection)} or
     * {@link #withAdditionalAuthenticationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withAdditionalAuthenticationProviders(AdditionalAuthenticationProvider... additionalAuthenticationProviders) {
        if (this.additionalAuthenticationProviders == null) {
            setAdditionalAuthenticationProviders(new java.util.ArrayList<AdditionalAuthenticationProvider>(additionalAuthenticationProviders.length));
        }
        for (AdditionalAuthenticationProvider ele : additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withAdditionalAuthenticationProviders(java.util.Collection<AdditionalAuthenticationProvider> additionalAuthenticationProviders) {
        setAdditionalAuthenticationProviders(additionalAuthenticationProviders);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @param xrayEnabled
     *        A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     */

    public void setXrayEnabled(Boolean xrayEnabled) {
        this.xrayEnabled = xrayEnabled;
    }

    /**
     * <p>
     * A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @return A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     */

    public Boolean getXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     * <p>
     * A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @param xrayEnabled
     *        A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withXrayEnabled(Boolean xrayEnabled) {
        setXrayEnabled(xrayEnabled);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     * </p>
     * 
     * @return A flag indicating whether to use X-Ray tracing for this <code>GraphqlApi</code>.
     */

    public Boolean isXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     * <p>
     * The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     * </p>
     * 
     * @param wafWebAclArn
     *        The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     */

    public void setWafWebAclArn(String wafWebAclArn) {
        this.wafWebAclArn = wafWebAclArn;
    }

    /**
     * <p>
     * The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     * </p>
     * 
     * @return The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     */

    public String getWafWebAclArn() {
        return this.wafWebAclArn;
    }

    /**
     * <p>
     * The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     * </p>
     * 
     * @param wafWebAclArn
     *        The ARN of the WAF access control list (ACL) associated with this <code>GraphqlApi</code>, if one exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withWafWebAclArn(String wafWebAclArn) {
        setWafWebAclArn(wafWebAclArn);
        return this;
    }

    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        Configuration for Lambda function authorization.
     */

    public void setLambdaAuthorizerConfig(LambdaAuthorizerConfig lambdaAuthorizerConfig) {
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     * 
     * @return Configuration for Lambda function authorization.
     */

    public LambdaAuthorizerConfig getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        Configuration for Lambda function authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withLambdaAuthorizerConfig(LambdaAuthorizerConfig lambdaAuthorizerConfig) {
        setLambdaAuthorizerConfig(lambdaAuthorizerConfig);
        return this;
    }

    /**
     * <p>
     * The DNS records for the API.
     * </p>
     * 
     * @return The DNS records for the API.
     */

    public java.util.Map<String, String> getDns() {
        return dns;
    }

    /**
     * <p>
     * The DNS records for the API.
     * </p>
     * 
     * @param dns
     *        The DNS records for the API.
     */

    public void setDns(java.util.Map<String, String> dns) {
        this.dns = dns;
    }

    /**
     * <p>
     * The DNS records for the API.
     * </p>
     * 
     * @param dns
     *        The DNS records for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withDns(java.util.Map<String, String> dns) {
        setDns(dns);
        return this;
    }

    /**
     * Add a single Dns entry
     *
     * @see GraphqlApi#withDns
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi addDnsEntry(String key, String value) {
        if (null == this.dns) {
            this.dns = new java.util.HashMap<String, String>();
        }
        if (this.dns.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dns.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dns.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi clearDnsEntries() {
        this.dns = null;
        return this;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no value
     * is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be changed once the
     * API has been created.
     * </p>
     * 
     * @param visibility
     *        Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no
     *        value is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be
     *        changed once the API has been created.
     * @see GraphQLApiVisibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no value
     * is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be changed once the
     * API has been created.
     * </p>
     * 
     * @return Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If
     *         no value is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be
     *         changed once the API has been created.
     * @see GraphQLApiVisibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no value
     * is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be changed once the
     * API has been created.
     * </p>
     * 
     * @param visibility
     *        Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no
     *        value is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be
     *        changed once the API has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiVisibility
     */

    public GraphqlApi withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no value
     * is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be changed once the
     * API has been created.
     * </p>
     * 
     * @param visibility
     *        Sets the value of the GraphQL API to public (<code>GLOBAL</code>) or private (<code>PRIVATE</code>). If no
     *        value is provided, the visibility will be set to <code>GLOBAL</code> by default. This value cannot be
     *        changed once the API has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiVisibility
     */

    public GraphqlApi withVisibility(GraphQLApiVisibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @param apiType
     *        The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *        <code>MERGED</code>).
     * @see GraphQLApiType
     */

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @return The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *         <code>MERGED</code>).
     * @see GraphQLApiType
     */

    public String getApiType() {
        return this.apiType;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @param apiType
     *        The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *        <code>MERGED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiType
     */

    public GraphqlApi withApiType(String apiType) {
        setApiType(apiType);
        return this;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @param apiType
     *        The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *        <code>MERGED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiType
     */

    public GraphqlApi withApiType(GraphQLApiType apiType) {
        this.apiType = apiType.toString();
        return this;
    }

    /**
     * <p>
     * The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this role on
     * behalf of the Merged API to validate access to source APIs at runtime and to prompt the <code>AUTO_MERGE</code>
     * to update the merged API endpoint with the source API changes automatically.
     * </p>
     * 
     * @param mergedApiExecutionRoleArn
     *        The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this
     *        role on behalf of the Merged API to validate access to source APIs at runtime and to prompt the
     *        <code>AUTO_MERGE</code> to update the merged API endpoint with the source API changes automatically.
     */

    public void setMergedApiExecutionRoleArn(String mergedApiExecutionRoleArn) {
        this.mergedApiExecutionRoleArn = mergedApiExecutionRoleArn;
    }

    /**
     * <p>
     * The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this role on
     * behalf of the Merged API to validate access to source APIs at runtime and to prompt the <code>AUTO_MERGE</code>
     * to update the merged API endpoint with the source API changes automatically.
     * </p>
     * 
     * @return The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this
     *         role on behalf of the Merged API to validate access to source APIs at runtime and to prompt the
     *         <code>AUTO_MERGE</code> to update the merged API endpoint with the source API changes automatically.
     */

    public String getMergedApiExecutionRoleArn() {
        return this.mergedApiExecutionRoleArn;
    }

    /**
     * <p>
     * The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this role on
     * behalf of the Merged API to validate access to source APIs at runtime and to prompt the <code>AUTO_MERGE</code>
     * to update the merged API endpoint with the source API changes automatically.
     * </p>
     * 
     * @param mergedApiExecutionRoleArn
     *        The Identity and Access Management service role ARN for a merged API. The AppSync service assumes this
     *        role on behalf of the Merged API to validate access to source APIs at runtime and to prompt the
     *        <code>AUTO_MERGE</code> to update the merged API endpoint with the source API changes automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withMergedApiExecutionRoleArn(String mergedApiExecutionRoleArn) {
        setMergedApiExecutionRoleArn(mergedApiExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @param owner
     *        The account owner of the GraphQL API.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @return The account owner of the GraphQL API.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @param owner
     *        The account owner of the GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The owner contact information for an API resource.
     * </p>
     * <p>
     * This field accepts any string input with a length of 0 - 256 characters.
     * </p>
     * 
     * @param ownerContact
     *        The owner contact information for an API resource.</p>
     *        <p>
     *        This field accepts any string input with a length of 0 - 256 characters.
     */

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    /**
     * <p>
     * The owner contact information for an API resource.
     * </p>
     * <p>
     * This field accepts any string input with a length of 0 - 256 characters.
     * </p>
     * 
     * @return The owner contact information for an API resource.</p>
     *         <p>
     *         This field accepts any string input with a length of 0 - 256 characters.
     */

    public String getOwnerContact() {
        return this.ownerContact;
    }

    /**
     * <p>
     * The owner contact information for an API resource.
     * </p>
     * <p>
     * This field accepts any string input with a length of 0 - 256 characters.
     * </p>
     * 
     * @param ownerContact
     *        The owner contact information for an API resource.</p>
     *        <p>
     *        This field accepts any string input with a length of 0 - 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withOwnerContact(String ownerContact) {
        setOwnerContact(ownerContact);
        return this;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     * introspection. If no value is provided, the introspection configuration will be set to <code>ENABLED</code> by
     * default. This field will produce an error if the operation attempts to use the introspection feature while this
     * field is disabled.
     * </p>
     * <p>
     * For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     * introspection</a>.
     * </p>
     * 
     * @param introspectionConfig
     *        Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     *        introspection. If no value is provided, the introspection configuration will be set to
     *        <code>ENABLED</code> by default. This field will produce an error if the operation attempts to use the
     *        introspection feature while this field is disabled.</p>
     *        <p>
     *        For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     *        introspection</a>.
     * @see GraphQLApiIntrospectionConfig
     */

    public void setIntrospectionConfig(String introspectionConfig) {
        this.introspectionConfig = introspectionConfig;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     * introspection. If no value is provided, the introspection configuration will be set to <code>ENABLED</code> by
     * default. This field will produce an error if the operation attempts to use the introspection feature while this
     * field is disabled.
     * </p>
     * <p>
     * For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     * introspection</a>.
     * </p>
     * 
     * @return Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     *         introspection. If no value is provided, the introspection configuration will be set to
     *         <code>ENABLED</code> by default. This field will produce an error if the operation attempts to use the
     *         introspection feature while this field is disabled.</p>
     *         <p>
     *         For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     *         introspection</a>.
     * @see GraphQLApiIntrospectionConfig
     */

    public String getIntrospectionConfig() {
        return this.introspectionConfig;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     * introspection. If no value is provided, the introspection configuration will be set to <code>ENABLED</code> by
     * default. This field will produce an error if the operation attempts to use the introspection feature while this
     * field is disabled.
     * </p>
     * <p>
     * For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     * introspection</a>.
     * </p>
     * 
     * @param introspectionConfig
     *        Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     *        introspection. If no value is provided, the introspection configuration will be set to
     *        <code>ENABLED</code> by default. This field will produce an error if the operation attempts to use the
     *        introspection feature while this field is disabled.</p>
     *        <p>
     *        For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     *        introspection</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiIntrospectionConfig
     */

    public GraphqlApi withIntrospectionConfig(String introspectionConfig) {
        setIntrospectionConfig(introspectionConfig);
        return this;
    }

    /**
     * <p>
     * Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     * introspection. If no value is provided, the introspection configuration will be set to <code>ENABLED</code> by
     * default. This field will produce an error if the operation attempts to use the introspection feature while this
     * field is disabled.
     * </p>
     * <p>
     * For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     * introspection</a>.
     * </p>
     * 
     * @param introspectionConfig
     *        Sets the value of the GraphQL API to enable (<code>ENABLED</code>) or disable (<code>DISABLED</code>)
     *        introspection. If no value is provided, the introspection configuration will be set to
     *        <code>ENABLED</code> by default. This field will produce an error if the operation attempts to use the
     *        introspection feature while this field is disabled.</p>
     *        <p>
     *        For more information about introspection, see <a href="https://graphql.org/learn/introspection/">GraphQL
     *        introspection</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiIntrospectionConfig
     */

    public GraphqlApi withIntrospectionConfig(GraphQLApiIntrospectionConfig introspectionConfig) {
        this.introspectionConfig = introspectionConfig.toString();
        return this;
    }

    /**
     * <p>
     * The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in
     * the body of query. The default value is <code>0</code> (or unspecified), which indicates there's no depth limit.
     * If you set a limit, it can be between <code>1</code> and <code>75</code> nested levels. This field will produce a
     * limit error if the operation falls out of bounds.
     * </p>
     * <p>
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the
     * error will be thrown upwards to the first nullable field available.
     * </p>
     * 
     * @param queryDepthLimit
     *        The maximum depth a query can have in a single request. Depth refers to the amount of nested levels
     *        allowed in the body of query. The default value is <code>0</code> (or unspecified), which indicates
     *        there's no depth limit. If you set a limit, it can be between <code>1</code> and <code>75</code> nested
     *        levels. This field will produce a limit error if the operation falls out of bounds.</p>
     *        <p>
     *        Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error,
     *        the error will be thrown upwards to the first nullable field available.
     */

    public void setQueryDepthLimit(Integer queryDepthLimit) {
        this.queryDepthLimit = queryDepthLimit;
    }

    /**
     * <p>
     * The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in
     * the body of query. The default value is <code>0</code> (or unspecified), which indicates there's no depth limit.
     * If you set a limit, it can be between <code>1</code> and <code>75</code> nested levels. This field will produce a
     * limit error if the operation falls out of bounds.
     * </p>
     * <p>
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the
     * error will be thrown upwards to the first nullable field available.
     * </p>
     * 
     * @return The maximum depth a query can have in a single request. Depth refers to the amount of nested levels
     *         allowed in the body of query. The default value is <code>0</code> (or unspecified), which indicates
     *         there's no depth limit. If you set a limit, it can be between <code>1</code> and <code>75</code> nested
     *         levels. This field will produce a limit error if the operation falls out of bounds.</p>
     *         <p>
     *         Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error,
     *         the error will be thrown upwards to the first nullable field available.
     */

    public Integer getQueryDepthLimit() {
        return this.queryDepthLimit;
    }

    /**
     * <p>
     * The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in
     * the body of query. The default value is <code>0</code> (or unspecified), which indicates there's no depth limit.
     * If you set a limit, it can be between <code>1</code> and <code>75</code> nested levels. This field will produce a
     * limit error if the operation falls out of bounds.
     * </p>
     * <p>
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the
     * error will be thrown upwards to the first nullable field available.
     * </p>
     * 
     * @param queryDepthLimit
     *        The maximum depth a query can have in a single request. Depth refers to the amount of nested levels
     *        allowed in the body of query. The default value is <code>0</code> (or unspecified), which indicates
     *        there's no depth limit. If you set a limit, it can be between <code>1</code> and <code>75</code> nested
     *        levels. This field will produce a limit error if the operation falls out of bounds.</p>
     *        <p>
     *        Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error,
     *        the error will be thrown upwards to the first nullable field available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withQueryDepthLimit(Integer queryDepthLimit) {
        setQueryDepthLimit(queryDepthLimit);
        return this;
    }

    /**
     * <p>
     * The maximum number of resolvers that can be invoked in a single request. The default value is <code>0</code> (or
     * unspecified), which will set the limit to <code>10000</code>. When specified, the limit value can be between
     * <code>1</code> and <code>10000</code>. This field will produce a limit error if the operation falls out of
     * bounds.
     * </p>
     * 
     * @param resolverCountLimit
     *        The maximum number of resolvers that can be invoked in a single request. The default value is
     *        <code>0</code> (or unspecified), which will set the limit to <code>10000</code>. When specified, the limit
     *        value can be between <code>1</code> and <code>10000</code>. This field will produce a limit error if the
     *        operation falls out of bounds.
     */

    public void setResolverCountLimit(Integer resolverCountLimit) {
        this.resolverCountLimit = resolverCountLimit;
    }

    /**
     * <p>
     * The maximum number of resolvers that can be invoked in a single request. The default value is <code>0</code> (or
     * unspecified), which will set the limit to <code>10000</code>. When specified, the limit value can be between
     * <code>1</code> and <code>10000</code>. This field will produce a limit error if the operation falls out of
     * bounds.
     * </p>
     * 
     * @return The maximum number of resolvers that can be invoked in a single request. The default value is
     *         <code>0</code> (or unspecified), which will set the limit to <code>10000</code>. When specified, the
     *         limit value can be between <code>1</code> and <code>10000</code>. This field will produce a limit error
     *         if the operation falls out of bounds.
     */

    public Integer getResolverCountLimit() {
        return this.resolverCountLimit;
    }

    /**
     * <p>
     * The maximum number of resolvers that can be invoked in a single request. The default value is <code>0</code> (or
     * unspecified), which will set the limit to <code>10000</code>. When specified, the limit value can be between
     * <code>1</code> and <code>10000</code>. This field will produce a limit error if the operation falls out of
     * bounds.
     * </p>
     * 
     * @param resolverCountLimit
     *        The maximum number of resolvers that can be invoked in a single request. The default value is
     *        <code>0</code> (or unspecified), which will set the limit to <code>10000</code>. When specified, the limit
     *        value can be between <code>1</code> and <code>10000</code>. This field will produce a limit error if the
     *        operation falls out of bounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withResolverCountLimit(Integer resolverCountLimit) {
        setResolverCountLimit(resolverCountLimit);
        return this;
    }

    /**
     * <p>
     * The <code>enhancedMetricsConfig</code> object.
     * </p>
     * 
     * @param enhancedMetricsConfig
     *        The <code>enhancedMetricsConfig</code> object.
     */

    public void setEnhancedMetricsConfig(EnhancedMetricsConfig enhancedMetricsConfig) {
        this.enhancedMetricsConfig = enhancedMetricsConfig;
    }

    /**
     * <p>
     * The <code>enhancedMetricsConfig</code> object.
     * </p>
     * 
     * @return The <code>enhancedMetricsConfig</code> object.
     */

    public EnhancedMetricsConfig getEnhancedMetricsConfig() {
        return this.enhancedMetricsConfig;
    }

    /**
     * <p>
     * The <code>enhancedMetricsConfig</code> object.
     * </p>
     * 
     * @param enhancedMetricsConfig
     *        The <code>enhancedMetricsConfig</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphqlApi withEnhancedMetricsConfig(EnhancedMetricsConfig enhancedMetricsConfig) {
        setEnhancedMetricsConfig(enhancedMetricsConfig);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getLogConfig() != null)
            sb.append("LogConfig: ").append(getLogConfig()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig()).append(",");
        if (getOpenIDConnectConfig() != null)
            sb.append("OpenIDConnectConfig: ").append(getOpenIDConnectConfig()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUris() != null)
            sb.append("Uris: ").append(getUris()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAdditionalAuthenticationProviders() != null)
            sb.append("AdditionalAuthenticationProviders: ").append(getAdditionalAuthenticationProviders()).append(",");
        if (getXrayEnabled() != null)
            sb.append("XrayEnabled: ").append(getXrayEnabled()).append(",");
        if (getWafWebAclArn() != null)
            sb.append("WafWebAclArn: ").append(getWafWebAclArn()).append(",");
        if (getLambdaAuthorizerConfig() != null)
            sb.append("LambdaAuthorizerConfig: ").append(getLambdaAuthorizerConfig()).append(",");
        if (getDns() != null)
            sb.append("Dns: ").append(getDns()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getApiType() != null)
            sb.append("ApiType: ").append(getApiType()).append(",");
        if (getMergedApiExecutionRoleArn() != null)
            sb.append("MergedApiExecutionRoleArn: ").append(getMergedApiExecutionRoleArn()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getOwnerContact() != null)
            sb.append("OwnerContact: ").append(getOwnerContact()).append(",");
        if (getIntrospectionConfig() != null)
            sb.append("IntrospectionConfig: ").append(getIntrospectionConfig()).append(",");
        if (getQueryDepthLimit() != null)
            sb.append("QueryDepthLimit: ").append(getQueryDepthLimit()).append(",");
        if (getResolverCountLimit() != null)
            sb.append("ResolverCountLimit: ").append(getResolverCountLimit()).append(",");
        if (getEnhancedMetricsConfig() != null)
            sb.append("EnhancedMetricsConfig: ").append(getEnhancedMetricsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GraphqlApi == false)
            return false;
        GraphqlApi other = (GraphqlApi) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getLogConfig() == null ^ this.getLogConfig() == null)
            return false;
        if (other.getLogConfig() != null && other.getLogConfig().equals(this.getLogConfig()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        if (other.getOpenIDConnectConfig() == null ^ this.getOpenIDConnectConfig() == null)
            return false;
        if (other.getOpenIDConnectConfig() != null && other.getOpenIDConnectConfig().equals(this.getOpenIDConnectConfig()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUris() == null ^ this.getUris() == null)
            return false;
        if (other.getUris() != null && other.getUris().equals(this.getUris()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAdditionalAuthenticationProviders() == null ^ this.getAdditionalAuthenticationProviders() == null)
            return false;
        if (other.getAdditionalAuthenticationProviders() != null
                && other.getAdditionalAuthenticationProviders().equals(this.getAdditionalAuthenticationProviders()) == false)
            return false;
        if (other.getXrayEnabled() == null ^ this.getXrayEnabled() == null)
            return false;
        if (other.getXrayEnabled() != null && other.getXrayEnabled().equals(this.getXrayEnabled()) == false)
            return false;
        if (other.getWafWebAclArn() == null ^ this.getWafWebAclArn() == null)
            return false;
        if (other.getWafWebAclArn() != null && other.getWafWebAclArn().equals(this.getWafWebAclArn()) == false)
            return false;
        if (other.getLambdaAuthorizerConfig() == null ^ this.getLambdaAuthorizerConfig() == null)
            return false;
        if (other.getLambdaAuthorizerConfig() != null && other.getLambdaAuthorizerConfig().equals(this.getLambdaAuthorizerConfig()) == false)
            return false;
        if (other.getDns() == null ^ this.getDns() == null)
            return false;
        if (other.getDns() != null && other.getDns().equals(this.getDns()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getApiType() == null ^ this.getApiType() == null)
            return false;
        if (other.getApiType() != null && other.getApiType().equals(this.getApiType()) == false)
            return false;
        if (other.getMergedApiExecutionRoleArn() == null ^ this.getMergedApiExecutionRoleArn() == null)
            return false;
        if (other.getMergedApiExecutionRoleArn() != null && other.getMergedApiExecutionRoleArn().equals(this.getMergedApiExecutionRoleArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getOwnerContact() == null ^ this.getOwnerContact() == null)
            return false;
        if (other.getOwnerContact() != null && other.getOwnerContact().equals(this.getOwnerContact()) == false)
            return false;
        if (other.getIntrospectionConfig() == null ^ this.getIntrospectionConfig() == null)
            return false;
        if (other.getIntrospectionConfig() != null && other.getIntrospectionConfig().equals(this.getIntrospectionConfig()) == false)
            return false;
        if (other.getQueryDepthLimit() == null ^ this.getQueryDepthLimit() == null)
            return false;
        if (other.getQueryDepthLimit() != null && other.getQueryDepthLimit().equals(this.getQueryDepthLimit()) == false)
            return false;
        if (other.getResolverCountLimit() == null ^ this.getResolverCountLimit() == null)
            return false;
        if (other.getResolverCountLimit() != null && other.getResolverCountLimit().equals(this.getResolverCountLimit()) == false)
            return false;
        if (other.getEnhancedMetricsConfig() == null ^ this.getEnhancedMetricsConfig() == null)
            return false;
        if (other.getEnhancedMetricsConfig() != null && other.getEnhancedMetricsConfig().equals(this.getEnhancedMetricsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getLogConfig() == null) ? 0 : getLogConfig().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getOpenIDConnectConfig() == null) ? 0 : getOpenIDConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUris() == null) ? 0 : getUris().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAuthenticationProviders() == null) ? 0 : getAdditionalAuthenticationProviders().hashCode());
        hashCode = prime * hashCode + ((getXrayEnabled() == null) ? 0 : getXrayEnabled().hashCode());
        hashCode = prime * hashCode + ((getWafWebAclArn() == null) ? 0 : getWafWebAclArn().hashCode());
        hashCode = prime * hashCode + ((getLambdaAuthorizerConfig() == null) ? 0 : getLambdaAuthorizerConfig().hashCode());
        hashCode = prime * hashCode + ((getDns() == null) ? 0 : getDns().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getApiType() == null) ? 0 : getApiType().hashCode());
        hashCode = prime * hashCode + ((getMergedApiExecutionRoleArn() == null) ? 0 : getMergedApiExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getOwnerContact() == null) ? 0 : getOwnerContact().hashCode());
        hashCode = prime * hashCode + ((getIntrospectionConfig() == null) ? 0 : getIntrospectionConfig().hashCode());
        hashCode = prime * hashCode + ((getQueryDepthLimit() == null) ? 0 : getQueryDepthLimit().hashCode());
        hashCode = prime * hashCode + ((getResolverCountLimit() == null) ? 0 : getResolverCountLimit().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMetricsConfig() == null) ? 0 : getEnhancedMetricsConfig().hashCode());
        return hashCode;
    }

    @Override
    public GraphqlApi clone() {
        try {
            return (GraphqlApi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.GraphqlApiMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
