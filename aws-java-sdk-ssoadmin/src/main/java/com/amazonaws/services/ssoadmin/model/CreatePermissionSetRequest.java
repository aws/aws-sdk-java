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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreatePermissionSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePermissionSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the <a>PermissionSet</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the <a>PermissionSet</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The length of time that the application user sessions are valid in the ISO-8601 standard.
     * </p>
     */
    private String sessionDuration;
    /**
     * <p>
     * Used to redirect users within the application during the federation authentication process.
     * </p>
     */
    private String relayState;
    /**
     * <p>
     * The tags to attach to the new <a>PermissionSet</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the <a>PermissionSet</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>PermissionSet</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>PermissionSet</a>.
     * </p>
     * 
     * @return The name of the <a>PermissionSet</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <a>PermissionSet</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>PermissionSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the <a>PermissionSet</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>PermissionSet</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>PermissionSet</a>.
     * </p>
     * 
     * @return The description of the <a>PermissionSet</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <a>PermissionSet</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>PermissionSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *         see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS
     *         Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The length of time that the application user sessions are valid in the ISO-8601 standard.
     * </p>
     * 
     * @param sessionDuration
     *        The length of time that the application user sessions are valid in the ISO-8601 standard.
     */

    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    /**
     * <p>
     * The length of time that the application user sessions are valid in the ISO-8601 standard.
     * </p>
     * 
     * @return The length of time that the application user sessions are valid in the ISO-8601 standard.
     */

    public String getSessionDuration() {
        return this.sessionDuration;
    }

    /**
     * <p>
     * The length of time that the application user sessions are valid in the ISO-8601 standard.
     * </p>
     * 
     * @param sessionDuration
     *        The length of time that the application user sessions are valid in the ISO-8601 standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withSessionDuration(String sessionDuration) {
        setSessionDuration(sessionDuration);
        return this;
    }

    /**
     * <p>
     * Used to redirect users within the application during the federation authentication process.
     * </p>
     * 
     * @param relayState
     *        Used to redirect users within the application during the federation authentication process.
     */

    public void setRelayState(String relayState) {
        this.relayState = relayState;
    }

    /**
     * <p>
     * Used to redirect users within the application during the federation authentication process.
     * </p>
     * 
     * @return Used to redirect users within the application during the federation authentication process.
     */

    public String getRelayState() {
        return this.relayState;
    }

    /**
     * <p>
     * Used to redirect users within the application during the federation authentication process.
     * </p>
     * 
     * @param relayState
     *        Used to redirect users within the application during the federation authentication process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withRelayState(String relayState) {
        setRelayState(relayState);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the new <a>PermissionSet</a>.
     * </p>
     * 
     * @return The tags to attach to the new <a>PermissionSet</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the new <a>PermissionSet</a>.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new <a>PermissionSet</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to attach to the new <a>PermissionSet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new <a>PermissionSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to attach to the new <a>PermissionSet</a>.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new <a>PermissionSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getSessionDuration() != null)
            sb.append("SessionDuration: ").append(getSessionDuration()).append(",");
        if (getRelayState() != null)
            sb.append("RelayState: ").append(getRelayState()).append(",");
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

        if (obj instanceof CreatePermissionSetRequest == false)
            return false;
        CreatePermissionSetRequest other = (CreatePermissionSetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getSessionDuration() == null ^ this.getSessionDuration() == null)
            return false;
        if (other.getSessionDuration() != null && other.getSessionDuration().equals(this.getSessionDuration()) == false)
            return false;
        if (other.getRelayState() == null ^ this.getRelayState() == null)
            return false;
        if (other.getRelayState() != null && other.getRelayState().equals(this.getRelayState()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getSessionDuration() == null) ? 0 : getSessionDuration().hashCode());
        hashCode = prime * hashCode + ((getRelayState() == null) ? 0 : getRelayState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePermissionSetRequest clone() {
        return (CreatePermissionSetRequest) super.clone();
    }

}
