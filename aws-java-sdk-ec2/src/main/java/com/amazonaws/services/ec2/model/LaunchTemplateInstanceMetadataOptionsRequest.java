/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
 * Data</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     * specified, the default state is <code>enabled</code>.
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
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     *        instance metadata requests can travel.</p>
     *        <p>
     *        Default: 1
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
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * 
     * @return The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the
     *         further instance metadata requests can travel.</p>
     *         <p>
     *         Default: 1
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
     * Default: 1
     * </p>
     * <p>
     * Possible values: Integers from 1 to 64
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     *        instance metadata requests can travel.</p>
     *        <p>
     *        Default: 1
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
     * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     * specified, the default state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @param httpEndpoint
     *        This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     *        specified, the default state is <code>enabled</code>.</p> <note>
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
     * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     * specified, the default state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @return This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     *         specified, the default state is <code>enabled</code>.</p> <note>
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
     * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     * specified, the default state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @param httpEndpoint
     *        This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     *        specified, the default state is <code>enabled</code>.</p> <note>
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
     * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     * specified, the default state is <code>enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you specify a value of <code>disabled</code>, you will not be able to access your instance metadata.
     * </p>
     * </note>
     * 
     * @param httpEndpoint
     *        This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not
     *        specified, the default state is <code>enabled</code>.</p> <note>
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
            sb.append("HttpEndpoint: ").append(getHttpEndpoint());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
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
