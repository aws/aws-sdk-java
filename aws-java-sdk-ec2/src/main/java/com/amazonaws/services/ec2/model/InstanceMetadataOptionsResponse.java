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
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     */
    private String httpTokens;
    /**
     * <p>
     * The maximum number of hops that the metadata token can travel.
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>
     * </p>
     */
    private Integer httpPutResponseHopLimit;
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
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     */
    private String httpProtocolIpv6;
    /**
     * <p>
     * Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     */
    private String instanceMetadataTags;

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
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpTokens
     *        Indicates whether IMDSv2 is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *        </p>
     *        </li>
     * @see HttpTokensState
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether IMDSv2 is required.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *         </p>
     *         </li>
     * @see HttpTokensState
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpTokens
     *        Indicates whether IMDSv2 is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokensState
     */

    public InstanceMetadataOptionsResponse withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * Indicates whether IMDSv2 is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpTokens
     *        Indicates whether IMDSv2 is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>optional</code> - IMDSv2 is optional, which means that you can use either IMDSv2 or IMDSv1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>required</code> - IMDSv2 is required, which means that IMDSv1 is disabled, and you must use IMDSv2.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpTokensState
     */

    public InstanceMetadataOptionsResponse withHttpTokens(HttpTokensState httpTokens) {
        this.httpTokens = httpTokens.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of hops that the metadata token can travel.
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The maximum number of hops that the metadata token can travel.</p>
     *        <p>
     *        Possible values: Integers from <code>1</code> to <code>64</code>
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The maximum number of hops that the metadata token can travel.
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>
     * </p>
     * 
     * @return The maximum number of hops that the metadata token can travel.</p>
     *         <p>
     *         Possible values: Integers from <code>1</code> to <code>64</code>
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The maximum number of hops that the metadata token can travel.
     * </p>
     * <p>
     * Possible values: Integers from <code>1</code> to <code>64</code>
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The maximum number of hops that the metadata token can travel.</p>
     *        <p>
     *        Possible values: Integers from <code>1</code> to <code>64</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMetadataOptionsResponse withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
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
     * @see InstanceMetadataEndpointState
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
     * @see InstanceMetadataEndpointState
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
     * @see InstanceMetadataEndpointState
     */

    public InstanceMetadataOptionsResponse withHttpEndpoint(String httpEndpoint) {
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
     * @see InstanceMetadataEndpointState
     */

    public InstanceMetadataOptionsResponse withHttpEndpoint(InstanceMetadataEndpointState httpEndpoint) {
        this.httpEndpoint = httpEndpoint.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @see InstanceMetadataProtocolState
     */

    public void setHttpProtocolIpv6(String httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @return Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.</p>
     *         <p>
     *         Default: <code>disabled</code>
     * @see InstanceMetadataProtocolState
     */

    public String getHttpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataProtocolState
     */

    public InstanceMetadataOptionsResponse withHttpProtocolIpv6(String httpProtocolIpv6) {
        setHttpProtocolIpv6(httpProtocolIpv6);
        return this;
    }

    /**
     * <p>
     * Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.
     * </p>
     * <p>
     * Default: <code>disabled</code>
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Indicates whether the IPv6 endpoint for the instance metadata service is enabled or disabled.</p>
     *        <p>
     *        Default: <code>disabled</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataProtocolState
     */

    public InstanceMetadataOptionsResponse withHttpProtocolIpv6(InstanceMetadataProtocolState httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a>.
     * @see InstanceMetadataTagsState
     */

    public void setInstanceMetadataTags(String instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags;
    }

    /**
     * <p>
     * Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * 
     * @return Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *         with instance tags using the instance metadata</a>.
     * @see InstanceMetadataTagsState
     */

    public String getInstanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    /**
     * <p>
     * Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataTagsState
     */

    public InstanceMetadataOptionsResponse withInstanceMetadataTags(String instanceMetadataTags) {
        setInstanceMetadataTags(instanceMetadataTags);
        return this;
    }

    /**
     * <p>
     * Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata</a>.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Indicates whether access to instance tags from the instance metadata is enabled or disabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work
     *        with instance tags using the instance metadata</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetadataTagsState
     */

    public InstanceMetadataOptionsResponse withInstanceMetadataTags(InstanceMetadataTagsState instanceMetadataTags) {
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpProtocolIpv6() == null) ? 0 : getHttpProtocolIpv6().hashCode());
        hashCode = prime * hashCode + ((getInstanceMetadataTags() == null) ? 0 : getInstanceMetadataTags().hashCode());
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
