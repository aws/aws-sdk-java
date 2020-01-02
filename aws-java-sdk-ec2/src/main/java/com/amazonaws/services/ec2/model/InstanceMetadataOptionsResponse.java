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
 * The metadata options for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceMetadataOptionsResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceMetadataOptionsResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the instance is not ready to process metadata
     * traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied on the instance.
     * </p>
     */
    private String state;
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
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials; the
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
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the instance is not ready to process metadata
     * traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied on the instance.
     * </p>
     * 
     * @param state
     *        The state of the metadata option changes.</p>
     *        <p>
     *        <code>pending</code> - The metadata options are being updated and the instance is not ready to process
     *        metadata traffic with the new selection.
     *        </p>
     *        <p>
     *        <code>applied</code> - The metadata options have been successfully applied on the instance.
     * @see InstanceMetadataOptionsState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the instance is not ready to process metadata
     * traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied on the instance.
     * </p>
     * 
     * @return The state of the metadata option changes.</p>
     *         <p>
     *         <code>pending</code> - The metadata options are being updated and the instance is not ready to process
     *         metadata traffic with the new selection.
     *         </p>
     *         <p>
     *         <code>applied</code> - The metadata options have been successfully applied on the instance.
     * @see InstanceMetadataOptionsState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the instance is not ready to process metadata
     * traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied on the instance.
     * </p>
     * 
     * @param state
     *        The state of the metadata option changes.</p>
     *        <p>
     *        <code>pending</code> - The metadata options are being updated and the instance is not ready to process
     *        metadata traffic with the new selection.
     *        </p>
     *        <p>
     *        <code>applied</code> - The metadata options have been successfully applied on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataOptionsState
     */

    public InstanceMetadataOptionsResponse withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the metadata option changes.
     * </p>
     * <p>
     * <code>pending</code> - The metadata options are being updated and the instance is not ready to process metadata
     * traffic with the new selection.
     * </p>
     * <p>
     * <code>applied</code> - The metadata options have been successfully applied on the instance.
     * </p>
     * 
     * @param state
     *        The state of the metadata option changes.</p>
     *        <p>
     *        <code>pending</code> - The metadata options are being updated and the instance is not ready to process
     *        metadata traffic with the new selection.
     *        </p>
     *        <p>
     *        <code>applied</code> - The metadata options have been successfully applied on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataOptionsState
     */

    public InstanceMetadataOptionsResponse withState(InstanceMetadataOptionsState state) {
        this.state = state.toString();
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
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials; the
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
     *        retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *        credentials; the version 1.0 credentials are not available.
     * @see HttpTokensState
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
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials; the
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
     *         retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *         credentials; the version 1.0 credentials are not available.
     * @see HttpTokensState
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
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials; the
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
     *        retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *        credentials; the version 1.0 credentials are not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokensState
     */

    public InstanceMetadataOptionsResponse withHttpTokens(String httpTokens) {
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
     * requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials; the
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
     *        retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0
     *        credentials; the version 1.0 credentials are not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokensState
     */

    public InstanceMetadataOptionsResponse withHttpTokens(HttpTokensState httpTokens) {
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

    public InstanceMetadataOptionsResponse withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
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
     * @see InstanceMetadataEndpointState
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
     * @see InstanceMetadataEndpointState
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
     * @see InstanceMetadataEndpointState
     */

    public InstanceMetadataOptionsResponse withHttpEndpoint(String httpEndpoint) {
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
     * @see InstanceMetadataEndpointState
     */

    public InstanceMetadataOptionsResponse withHttpEndpoint(InstanceMetadataEndpointState httpEndpoint) {
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof InstanceMetadataOptionsResponse == false)
            return false;
        InstanceMetadataOptionsResponse other = (InstanceMetadataOptionsResponse) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMetadataOptionsResponse clone() {
        try {
            return (InstanceMetadataOptionsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
