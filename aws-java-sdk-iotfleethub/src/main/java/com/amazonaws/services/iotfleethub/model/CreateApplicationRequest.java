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
package com.amazonaws.services.iotfleethub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the web application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * An optional description of the web application.
     * </p>
     */
    private String applicationDescription;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * <note>
     * <p>
     * The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     * </p>
     * </note>
     */
    private String roleArn;
    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the web application.
     * </p>
     * 
     * @param applicationName
     *        The name of the web application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the web application.
     * </p>
     * 
     * @return The name of the web application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the web application.
     * </p>
     * 
     * @param applicationName
     *        The name of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * An optional description of the web application.
     * </p>
     * 
     * @param applicationDescription
     *        An optional description of the web application.
     */

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    /**
     * <p>
     * An optional description of the web application.
     * </p>
     * 
     * @return An optional description of the web application.
     */

    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * <p>
     * An optional description of the web application.
     * </p>
     * 
     * @param applicationDescription
     *        An optional description of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationDescription(String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * <note>
     * <p>
     * The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The ARN of the role that the web application assumes when it interacts with AWS IoT Core.</p> <note>
     *        <p>
     *        The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     *        </p>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * <note>
     * <p>
     * The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     * </p>
     * </note>
     * 
     * @return The ARN of the role that the web application assumes when it interacts with AWS IoT Core.</p> <note>
     *         <p>
     *         The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     *         </p>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * <note>
     * <p>
     * The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The ARN of the role that the web application assumes when it interacts with AWS IoT Core.</p> <note>
     *        <p>
     *        The name of the role must be in the form <code>AWSIotFleetHub_<i>random_string</i> </code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     * 
     * @return A set of key/value pairs that you can use to manage the web application resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     * 
     * @param tags
     *        A set of key/value pairs that you can use to manage the web application resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     * 
     * @param tags
     *        A set of key/value pairs that you can use to manage the web application resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest addTagsEntry(String key, String value) {
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

    public CreateApplicationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: ").append(getApplicationDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationDescription() == null ^ this.getApplicationDescription() == null)
            return false;
        if (other.getApplicationDescription() != null && other.getApplicationDescription().equals(this.getApplicationDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getApplicationDescription() == null) ? 0 : getApplicationDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
