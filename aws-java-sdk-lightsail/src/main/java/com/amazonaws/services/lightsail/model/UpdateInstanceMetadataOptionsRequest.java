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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateInstanceMetadataOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstanceMetadataOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance for which to update metadata parameters.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed token
     * header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with all instance metadata retrieval
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The
     * version 1.0 credentials are not available.
     * </p>
     */
    private String httpTokens;
    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     * existing state is maintained.
     * </p>
     * <p>
     * If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     */
    private String httpEndpoint;
    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther. If no parameter is specified, the existing state is maintained.
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when the HTTP
     * metadata endpoint is enabled.
     * </p>
     * <note>
     * <p>
     * This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     * <code>eu-north-1</code>).
     * </p>
     * </note>
     */
    private String httpProtocolIpv6;

    /**
     * <p>
     * The name of the instance for which to update metadata parameters.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance for which to update metadata parameters.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance for which to update metadata parameters.
     * </p>
     * 
     * @return The name of the instance for which to update metadata parameters.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance for which to update metadata parameters.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance for which to update metadata parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceMetadataOptionsRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed token
     * header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with all instance metadata retrieval
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *        request, the default state is <code>optional</code>.</p>
     *        <p>
     *        If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed
     *        token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0
     *        role credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the
     *        version 2.0 role credentials are returned.
     *        </p>
     *        <p>
     *        If the state is <code>required</code>, you must send a signed token header with all instance metadata
     *        retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *        credentials. The version 1.0 credentials are not available.
     * @see HttpTokens
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
     * If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed token
     * header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with all instance metadata retrieval
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @return The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *         request, the default state is <code>optional</code>.</p>
     *         <p>
     *         If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed
     *         token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0
     *         role credentials are returned. If you retrieve the IAM role credentials by using a valid signed token,
     *         the version 2.0 role credentials are returned.
     *         </p>
     *         <p>
     *         If the state is <code>required</code>, you must send a signed token header with all instance metadata
     *         retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *         credentials. The version 1.0 credentials are not available.
     * @see HttpTokens
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
     * If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed token
     * header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with all instance metadata retrieval
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *        request, the default state is <code>optional</code>.</p>
     *        <p>
     *        If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed
     *        token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0
     *        role credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the
     *        version 2.0 role credentials are returned.
     *        </p>
     *        <p>
     *        If the state is <code>required</code>, you must send a signed token header with all instance metadata
     *        retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *        credentials. The version 1.0 credentials are not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokens
     */

    public UpdateInstanceMetadataOptionsRequest withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests. If the parameter is not specified in the request,
     * the default state is <code>optional</code>.
     * </p>
     * <p>
     * If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed token
     * header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role
     * credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0
     * role credentials are returned.
     * </p>
     * <p>
     * If the state is <code>required</code>, you must send a signed token header with all instance metadata retrieval
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The
     * version 1.0 credentials are not available.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests. If the parameter is not specified in the
     *        request, the default state is <code>optional</code>.</p>
     *        <p>
     *        If the state is <code>optional</code>, you can choose whether to retrieve instance metadata with a signed
     *        token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0
     *        role credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the
     *        version 2.0 role credentials are returned.
     *        </p>
     *        <p>
     *        If the state is <code>required</code>, you must send a signed token header with all instance metadata
     *        retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *        credentials. The version 1.0 credentials are not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokens
     */

    public UpdateInstanceMetadataOptionsRequest withHttpTokens(HttpTokens httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     * existing state is maintained.
     * </p>
     * <p>
     * If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     *        existing state is maintained.</p>
     *        <p>
     *        If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * @see HttpEndpoint
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     * existing state is maintained.
     * </p>
     * <p>
     * If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @return Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     *         existing state is maintained.</p>
     *         <p>
     *         If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * @see HttpEndpoint
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     * existing state is maintained.
     * </p>
     * <p>
     * If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     *        existing state is maintained.</p>
     *        <p>
     *        If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpEndpoint
     */

    public UpdateInstanceMetadataOptionsRequest withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     * existing state is maintained.
     * </p>
     * <p>
     * If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the
     *        existing state is maintained.</p>
     *        <p>
     *        If you specify a value of <code>disabled</code>, you cannot access your instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpEndpoint
     */

    public UpdateInstanceMetadataOptionsRequest withHttpEndpoint(HttpEndpoint httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
        return this;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther. If no parameter is specified, the existing state is maintained.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the
     *        instance metadata requests can travel farther. If no parameter is specified, the existing state is
     *        maintained.
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther. If no parameter is specified, the existing state is maintained.
     * </p>
     * 
     * @return The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the
     *         instance metadata requests can travel farther. If no parameter is specified, the existing state is
     *         maintained.
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther. If no parameter is specified, the existing state is maintained.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the
     *        instance metadata requests can travel farther. If no parameter is specified, the existing state is
     *        maintained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceMetadataOptionsRequest withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
        return this;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when the HTTP
     * metadata endpoint is enabled.
     * </p>
     * <note>
     * <p>
     * This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     * <code>eu-north-1</code>).
     * </p>
     * </note>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when
     *        the HTTP metadata endpoint is enabled.</p> <note>
     *        <p>
     *        This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     *        <code>eu-north-1</code>).
     *        </p>
     * @see HttpProtocolIpv6
     */

    public void setHttpProtocolIpv6(String httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when the HTTP
     * metadata endpoint is enabled.
     * </p>
     * <note>
     * <p>
     * This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     * <code>eu-north-1</code>).
     * </p>
     * </note>
     * 
     * @return Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when
     *         the HTTP metadata endpoint is enabled.</p> <note>
     *         <p>
     *         This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     *         <code>eu-north-1</code>).
     *         </p>
     * @see HttpProtocolIpv6
     */

    public String getHttpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when the HTTP
     * metadata endpoint is enabled.
     * </p>
     * <note>
     * <p>
     * This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     * <code>eu-north-1</code>).
     * </p>
     * </note>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when
     *        the HTTP metadata endpoint is enabled.</p> <note>
     *        <p>
     *        This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     *        <code>eu-north-1</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpProtocolIpv6
     */

    public UpdateInstanceMetadataOptionsRequest withHttpProtocolIpv6(String httpProtocolIpv6) {
        setHttpProtocolIpv6(httpProtocolIpv6);
        return this;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when the HTTP
     * metadata endpoint is enabled.
     * </p>
     * <note>
     * <p>
     * This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     * <code>eu-north-1</code>).
     * </p>
     * </note>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when
     *        the HTTP metadata endpoint is enabled.</p> <note>
     *        <p>
     *        This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (
     *        <code>eu-north-1</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpProtocolIpv6
     */

    public UpdateInstanceMetadataOptionsRequest withHttpProtocolIpv6(HttpProtocolIpv6 httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6.toString();
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getHttpTokens() != null)
            sb.append("HttpTokens: ").append(getHttpTokens()).append(",");
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: ").append(getHttpEndpoint()).append(",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: ").append(getHttpPutResponseHopLimit()).append(",");
        if (getHttpProtocolIpv6() != null)
            sb.append("HttpProtocolIpv6: ").append(getHttpProtocolIpv6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstanceMetadataOptionsRequest == false)
            return false;
        UpdateInstanceMetadataOptionsRequest other = (UpdateInstanceMetadataOptionsRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        if (other.getHttpProtocolIpv6() == null ^ this.getHttpProtocolIpv6() == null)
            return false;
        if (other.getHttpProtocolIpv6() != null && other.getHttpProtocolIpv6().equals(this.getHttpProtocolIpv6()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpProtocolIpv6() == null) ? 0 : getHttpProtocolIpv6().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstanceMetadataOptionsRequest clone() {
        return (UpdateInstanceMetadataOptionsRequest) super.clone();
    }

}
