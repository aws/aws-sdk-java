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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdatePermissionSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePermissionSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The ARN of the permission set.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The description of the <a>PermissionSet</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
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

    public UpdatePermissionSetRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     * 
     * @return The ARN of the permission set.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionSetRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
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

    public UpdatePermissionSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     * </p>
     * 
     * @param sessionDuration
     *        The length of time that the application user sessions are valid for in the ISO-8601 standard.
     */

    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    /**
     * <p>
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     * </p>
     * 
     * @return The length of time that the application user sessions are valid for in the ISO-8601 standard.
     */

    public String getSessionDuration() {
        return this.sessionDuration;
    }

    /**
     * <p>
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     * </p>
     * 
     * @param sessionDuration
     *        The length of time that the application user sessions are valid for in the ISO-8601 standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionSetRequest withSessionDuration(String sessionDuration) {
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

    public UpdatePermissionSetRequest withRelayState(String relayState) {
        setRelayState(relayState);
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getPermissionSetArn() != null)
            sb.append("PermissionSetArn: ").append(getPermissionSetArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSessionDuration() != null)
            sb.append("SessionDuration: ").append(getSessionDuration()).append(",");
        if (getRelayState() != null)
            sb.append("RelayState: ").append(getRelayState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePermissionSetRequest == false)
            return false;
        UpdatePermissionSetRequest other = (UpdatePermissionSetRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSessionDuration() == null ^ this.getSessionDuration() == null)
            return false;
        if (other.getSessionDuration() != null && other.getSessionDuration().equals(this.getSessionDuration()) == false)
            return false;
        if (other.getRelayState() == null ^ this.getRelayState() == null)
            return false;
        if (other.getRelayState() != null && other.getRelayState().equals(this.getRelayState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSessionDuration() == null) ? 0 : getSessionDuration().hashCode());
        hashCode = prime * hashCode + ((getRelayState() == null) ? 0 : getRelayState().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePermissionSetRequest clone() {
        return (UpdatePermissionSetRequest) super.clone();
    }

}
