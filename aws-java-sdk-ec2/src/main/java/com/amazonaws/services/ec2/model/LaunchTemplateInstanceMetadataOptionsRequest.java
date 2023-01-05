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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The metadata options for the instance. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata and user
 * data</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateInstanceMetadataOptionsRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateInstanceMetadataOptionsRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a signed
     * token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with any instance metadata retrieval
     * requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the
     * version 1.0 credentials are not available.
     * </p>
     */
    private String httpTokens;
    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default
     * state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     */
    private String httpEndpoint;
    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     */
    private String httpProtocolIpv6;
    /**
     * <p>
     * Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     * <code>disabled</code> to turn off access to instance tags from the instance metadata. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     */
    private String instanceMetadataTags;

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a signed
     * token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with any instance metadata retrieval
     * requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *        request, the default state is <code>optional</code>.</p>
     *        <p>
     *        If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a
     *        signed token header on your request. If you retrieve the IAM role credentials without a token, the version
     *        1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed token,
     *        the version 2.0 role credentials are returned.
     *        </p>
     *        <p>
     *        If the state is <code>required</code>, you must send a signed token header with any instance metadata
     *        retrieval requests. In this state, retrieving the IAM role credentials always returns the version 2.0
     *        credentials; the version 1.0 credentials are not available.
     * @see LaunchTemplateHttpTokensState
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a signed
     * token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with any instance metadata retrieval
     * requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @return The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *         request, the default state is <code>optional</code>.</p>
     *         <p>
     *         If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a
     *         signed token header on your request. If you retrieve the IAM role credentials without a token, the
     *         version 1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed
     *         token, the version 2.0 role credentials are returned.
     *         </p>
     *         <p>
     *         If the state is <code>required</code>, you must send a signed token header with any instance metadata
     *         retrieval requests. In this state, retrieving the IAM role credentials always returns the version 2.0
     *         credentials; the version 1.0 credentials are not available.
     * @see LaunchTemplateHttpTokensState
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a signed
     * token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with any instance metadata retrieval
     * requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *        request, the default state is <code>optional</code>.</p>
     *        <p>
     *        If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a
     *        signed token header on your request. If you retrieve the IAM role credentials without a token, the version
     *        1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed token,
     *        the version 2.0 role credentials are returned.
     *        </p>
     *        <p>
     *        If the state is <code>required</code>, you must send a signed token header with any instance metadata
     *        retrieval requests. In this state, retrieving the IAM role credentials always returns the version 2.0
     *        credentials; the version 1.0 credentials are not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateHttpTokensState
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a signed
     * token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with any instance metadata retrieval
     * requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *        request, the default state is <code>optional</code>.</p>
     *        <p>
     *        If the state is <code>optional</code>, you can choose to retrieve instance metadata with or without a
     *        signed token header on your request. If you retrieve the IAM role credentials without a token, the version
     *        1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed token,
     *        the version 2.0 role credentials are returned.
     *        </p>
     *        <p>
     *        If the state is <code>required</code>, you must send a signed token header with any instance metadata
     *        retrieval requests. In this state, retrieving the IAM role credentials always returns the version 2.0
     *        credentials; the version 1.0 credentials are not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateHttpTokensState
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpTokens(LaunchTemplateHttpTokensState httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     *        instance metadata requests can travel.</p>
     *        <p>
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Possible values: Integers from 1 to 64
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * 
     * @return The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the
     *         further instance metadata requests can travel.</p>
     *         <p>
     *         Default: <code>1</code>
     *         </p>
     *         <p>
     *         Possible values: Integers from 1 to 64
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     *        instance metadata requests can travel.</p>
     *        <p>
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Possible values: Integers from 1 to 64
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
        return this;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default
     * state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the
     *        default state is <code>enabled</code>.</p> <note>
     *        <p>
     *        If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     *        </p>
     * @see LaunchTemplateInstanceMetadataEndpointState
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default
     * state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @return Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the
     *         default state is <code>enabled</code>.</p> <note>
     *         <p>
     *         If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     *         </p>
     * @see LaunchTemplateInstanceMetadataEndpointState
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default
     * state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the
     *        default state is <code>enabled</code>.</p> <note>
     *        <p>
     *        If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateInstanceMetadataEndpointState
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default
     * state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the
     *        default state is <code>enabled</code>.</p> <note>
     *        <p>
     *        If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateInstanceMetadataEndpointState
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpEndpoint(LaunchTemplateInstanceMetadataEndpointState httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
        return this;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @see LaunchTemplateInstanceMetadataProtocolIpv6
     */

    public void setHttpProtocolIpv6(String httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @return Enables or disables the IPv6 endpoint for the instance metadata service.</p>
     *         <p>
     *         Default: <code>disabled</code>
     * @see LaunchTemplateInstanceMetadataProtocolIpv6
     */

    public String getHttpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateInstanceMetadataProtocolIpv6
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpProtocolIpv6(String httpProtocolIpv6) {
        setHttpProtocolIpv6(httpProtocolIpv6);
        return this;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateInstanceMetadataProtocolIpv6
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withHttpProtocolIpv6(LaunchTemplateInstanceMetadataProtocolIpv6 httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     * <code>disabled</code> to turn off access to instance tags from the instance metadata. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param instanceMetadataTags
     *        Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     *        <code>disabled</code> to turn off access to instance tags from the instance metadata. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a>.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @see LaunchTemplateInstanceMetadataTagsState
     */

    public void setInstanceMetadataTags(String instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags;
    }

    /**
     * <p>
     * Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     * <code>disabled</code> to turn off access to instance tags from the instance metadata. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @return Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     *         <code>disabled</code> to turn off access to instance tags from the instance metadata. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *         with instance tags using the instance metadata</a>.</p>
     *         <p>
     *         Default: <code>disabled</code>
     * @see LaunchTemplateInstanceMetadataTagsState
     */

    public String getInstanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    /**
     * <p>
     * Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     * <code>disabled</code> to turn off access to instance tags from the instance metadata. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param instanceMetadataTags
     *        Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     *        <code>disabled</code> to turn off access to instance tags from the instance metadata. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a>.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateInstanceMetadataTagsState
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withInstanceMetadataTags(String instanceMetadataTags) {
        setInstanceMetadataTags(instanceMetadataTags);
        return this;
    }

    /**
     * <p>
     * Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     * <code>disabled</code> to turn off access to instance tags from the instance metadata. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param instanceMetadataTags
     *        Set to <code>enabled</code> to allow access to instance tags from the instance metadata. Set to
     *        <code>disabled</code> to turn off access to instance tags from the instance metadata. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a>.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateInstanceMetadataTagsState
     */

    public LaunchTemplateInstanceMetadataOptionsRequest withInstanceMetadataTags(LaunchTemplateInstanceMetadataTagsState instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags.toString();
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
        if (getHttpTokens() != null)
            sb.append("HttpTokens: ").append(getHttpTokens()).append(",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: ").append(getHttpPutResponseHopLimit()).append(",");
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: ").append(getHttpEndpoint()).append(",");
        if (getHttpProtocolIpv6() != null)
            sb.append("HttpProtocolIpv6: ").append(getHttpProtocolIpv6()).append(",");
        if (getInstanceMetadataTags() != null)
            sb.append("InstanceMetadataTags: ").append(getInstanceMetadataTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateInstanceMetadataOptionsRequest == false)
            return false;
        LaunchTemplateInstanceMetadataOptionsRequest other = (LaunchTemplateInstanceMetadataOptionsRequest) obj;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        if (other.getHttpProtocolIpv6() == null ^ this.getHttpProtocolIpv6() == null)
            return false;
        if (other.getHttpProtocolIpv6() != null && other.getHttpProtocolIpv6().equals(this.getHttpProtocolIpv6()) == false)
            return false;
        if (other.getInstanceMetadataTags() == null ^ this.getInstanceMetadataTags() == null)
            return false;
        if (other.getInstanceMetadataTags() != null && other.getInstanceMetadataTags().equals(this.getInstanceMetadataTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpProtocolIpv6() == null) ? 0 : getHttpProtocolIpv6().hashCode());
        hashCode = prime * hashCode + ((getInstanceMetadataTags() == null) ? 0 : getInstanceMetadataTags().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateInstanceMetadataOptionsRequest clone() {
        try {
            return (LaunchTemplateInstanceMetadataOptionsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
