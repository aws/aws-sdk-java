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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the postAgentProfileRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PostAgentProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostAgentProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The submitted profiling data.
     * </p>
     */
    private java.nio.ByteBuffer agentProfile;
    /**
     * <p>
     * The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     */
    private String contentType;
    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental submission of
     * duplicate profiling data if there are failures and retries.
     * </p>
     */
    private String profileToken;
    /**
     * <p>
     * The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     * </p>
     */
    private String profilingGroupName;

    /**
     * <p>
     * The submitted profiling data.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param agentProfile
     *        The submitted profiling data.
     */

    public void setAgentProfile(java.nio.ByteBuffer agentProfile) {
        this.agentProfile = agentProfile;
    }

    /**
     * <p>
     * The submitted profiling data.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The submitted profiling data.
     */

    public java.nio.ByteBuffer getAgentProfile() {
        return this.agentProfile;
    }

    /**
     * <p>
     * The submitted profiling data.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param agentProfile
     *        The submitted profiling data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAgentProfileRequest withAgentProfile(java.nio.ByteBuffer agentProfile) {
        setAgentProfile(agentProfile);
        return this;
    }

    /**
     * <p>
     * The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param contentType
     *        The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     *        <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the
     *        default . </p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @return The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     *         <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the
     *         default . </p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     * <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the default .
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param contentType
     *        The format of the submitted profiling data. The format maps to the <code>Accept</code> and
     *        <code>Content-Type</code> headers of the HTTP request. You can specify one of the following: or the
     *        default . </p>
     * 
     *        <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAgentProfileRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental submission of
     * duplicate profiling data if there are failures and retries.
     * </p>
     * 
     * @param profileToken
     *        Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental
     *        submission of duplicate profiling data if there are failures and retries.
     */

    public void setProfileToken(String profileToken) {
        this.profileToken = profileToken;
    }

    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental submission of
     * duplicate profiling data if there are failures and retries.
     * </p>
     * 
     * @return Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental
     *         submission of duplicate profiling data if there are failures and retries.
     */

    public String getProfileToken() {
        return this.profileToken;
    }

    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental submission of
     * duplicate profiling data if there are failures and retries.
     * </p>
     * 
     * @param profileToken
     *        Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental
     *        submission of duplicate profiling data if there are failures and retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAgentProfileRequest withProfileToken(String profileToken) {
        setProfileToken(profileToken);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     * </p>
     * 
     * @return The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group with the aggregated profile that receives the submitted profiling data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostAgentProfileRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
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
        if (getAgentProfile() != null)
            sb.append("AgentProfile: ").append(getAgentProfile()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getProfileToken() != null)
            sb.append("ProfileToken: ").append(getProfileToken()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostAgentProfileRequest == false)
            return false;
        PostAgentProfileRequest other = (PostAgentProfileRequest) obj;
        if (other.getAgentProfile() == null ^ this.getAgentProfile() == null)
            return false;
        if (other.getAgentProfile() != null && other.getAgentProfile().equals(this.getAgentProfile()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getProfileToken() == null ^ this.getProfileToken() == null)
            return false;
        if (other.getProfileToken() != null && other.getProfileToken().equals(this.getProfileToken()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentProfile() == null) ? 0 : getAgentProfile().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getProfileToken() == null) ? 0 : getProfileToken().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public PostAgentProfileRequest clone() {
        return (PostAgentProfileRequest) super.clone();
    }

}
