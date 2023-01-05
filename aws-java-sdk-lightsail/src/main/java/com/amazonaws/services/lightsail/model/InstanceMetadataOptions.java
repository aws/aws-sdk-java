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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata options for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceMetadataOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceMetadataOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process metadata
     * traffic with the new selection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied to the instance.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The state of token usage for your instance metadata requests.
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
     * <important>
     * <p>
     * Not all instance blueprints in Lightsail support version 2.0 credentials. Use the <code>MetadataNoToken</code>
     * instance metric to track the number of calls to the instance metadata service that are using version 1.0
     * credentials. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     * >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </important>
     */
    private String httpTokens;
    /**
     * <p>
     * Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.
     * </p>
     * <p>
     * If the value is <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     */
    private String httpEndpoint;
    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther.
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     */
    private String httpProtocolIpv6;

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process metadata
     * traffic with the new selection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied to the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the metadata option changes.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process
     *        metadata traffic with the new selection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applied</code> - The metadata options have been successfully applied to the instance.
     *        </p>
     *        </li>
     * @see InstanceMetadataState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process metadata
     * traffic with the new selection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied to the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the metadata option changes.</p>
     *         <p>
     *         The following states are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process
     *         metadata traffic with the new selection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>applied</code> - The metadata options have been successfully applied to the instance.
     *         </p>
     *         </li>
     * @see InstanceMetadataState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process metadata
     * traffic with the new selection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied to the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the metadata option changes.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process
     *        metadata traffic with the new selection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applied</code> - The metadata options have been successfully applied to the instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataState
     */

    public InstanceMetadataOptions withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process metadata
     * traffic with the new selection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied to the instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the metadata option changes.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - The metadata options are being updated. The instance is not yet ready to process
     *        metadata traffic with the new selection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applied</code> - The metadata options have been successfully applied to the instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataState
     */

    public InstanceMetadataOptions withState(InstanceMetadataState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
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
     * <important>
     * <p>
     * Not all instance blueprints in Lightsail support version 2.0 credentials. Use the <code>MetadataNoToken</code>
     * instance metric to track the number of calls to the instance metadata service that are using version 1.0
     * credentials. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     * >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests.</p>
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
     *        </p>
     *        <important>
     *        <p>
     *        Not all instance blueprints in Lightsail support version 2.0 credentials. Use the
     *        <code>MetadataNoToken</code> instance metric to track the number of calls to the instance metadata service
     *        that are using version 1.0 credentials. For more information, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     *        >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     * @see HttpTokens
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
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
     * <important>
     * <p>
     * Not all instance blueprints in Lightsail support version 2.0 credentials. Use the <code>MetadataNoToken</code>
     * instance metric to track the number of calls to the instance metadata service that are using version 1.0
     * credentials. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     * >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @return The state of token usage for your instance metadata requests.</p>
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
     *         </p>
     *         <important>
     *         <p>
     *         Not all instance blueprints in Lightsail support version 2.0 credentials. Use the
     *         <code>MetadataNoToken</code> instance metric to track the number of calls to the instance metadata
     *         service that are using version 1.0 credentials. For more information, see <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     *         >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *         </p>
     * @see HttpTokens
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
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
     * <important>
     * <p>
     * Not all instance blueprints in Lightsail support version 2.0 credentials. Use the <code>MetadataNoToken</code>
     * instance metric to track the number of calls to the instance metadata service that are using version 1.0
     * credentials. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     * >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests.</p>
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
     *        </p>
     *        <important>
     *        <p>
     *        Not all instance blueprints in Lightsail support version 2.0 credentials. Use the
     *        <code>MetadataNoToken</code> instance metric to track the number of calls to the instance metadata service
     *        that are using version 1.0 credentials. For more information, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     *        >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokens
     */

    public InstanceMetadataOptions withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
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
     * <important>
     * <p>
     * Not all instance blueprints in Lightsail support version 2.0 credentials. Use the <code>MetadataNoToken</code>
     * instance metric to track the number of calls to the instance metadata service that are using version 1.0
     * credentials. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     * >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests.</p>
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
     *        </p>
     *        <important>
     *        <p>
     *        Not all instance blueprints in Lightsail support version 2.0 credentials. Use the
     *        <code>MetadataNoToken</code> instance metric to track the number of calls to the instance metadata service
     *        that are using version 1.0 credentials. For more information, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-viewing-instance-health-metrics"
     *        >Viewing instance metrics in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokens
     */

    public InstanceMetadataOptions withHttpTokens(HttpTokens httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.
     * </p>
     * <p>
     * If the value is <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @param httpEndpoint
     *        Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.</p>
     *        <p>
     *        If the value is <code>disabled</code>, you cannot access your instance metadata.
     * @see HttpEndpoint
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.
     * </p>
     * <p>
     * If the value is <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @return Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.</p>
     *         <p>
     *         If the value is <code>disabled</code>, you cannot access your instance metadata.
     * @see HttpEndpoint
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.
     * </p>
     * <p>
     * If the value is <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @param httpEndpoint
     *        Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.</p>
     *        <p>
     *        If the value is <code>disabled</code>, you cannot access your instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpEndpoint
     */

    public InstanceMetadataOptions withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.
     * </p>
     * <p>
     * If the value is <code>disabled</code>, you cannot access your instance metadata.
     * </p>
     * 
     * @param httpEndpoint
     *        Indicates whether the HTTP metadata endpoint on your instances is enabled or disabled.</p>
     *        <p>
     *        If the value is <code>disabled</code>, you cannot access your instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpEndpoint
     */

    public InstanceMetadataOptions withHttpEndpoint(HttpEndpoint httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
        return this;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the
     *        instance metadata requests can travel farther.
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther.
     * </p>
     * 
     * @return The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the
     *         instance metadata requests can travel farther.
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance
     * metadata requests can travel farther.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the
     *        instance metadata requests can travel farther.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMetadataOptions withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
        return this;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * @see HttpProtocolIpv6
     */

    public void setHttpProtocolIpv6(String httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * @see HttpProtocolIpv6
     */

    public String getHttpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpProtocolIpv6
     */

    public InstanceMetadataOptions withHttpProtocolIpv6(String httpProtocolIpv6) {
        setHttpProtocolIpv6(httpProtocolIpv6);
        return this;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpProtocolIpv6
     */

    public InstanceMetadataOptions withHttpProtocolIpv6(HttpProtocolIpv6 httpProtocolIpv6) {
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof InstanceMetadataOptions == false)
            return false;
        InstanceMetadataOptions other = (InstanceMetadataOptions) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpProtocolIpv6() == null) ? 0 : getHttpProtocolIpv6().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMetadataOptions clone() {
        try {
            return (InstanceMetadataOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceMetadataOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
