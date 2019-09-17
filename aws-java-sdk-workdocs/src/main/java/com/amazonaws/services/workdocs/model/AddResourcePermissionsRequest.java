/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AddResourcePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddResourcePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The users, groups, or organization being granted permission.
     * </p>
     */
    private java.util.List<SharePrincipal> principals;
    /**
     * <p>
     * The notification options.
     * </p>
     */
    private NotificationOptions notificationOptions;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The users, groups, or organization being granted permission.
     * </p>
     * 
     * @return The users, groups, or organization being granted permission.
     */

    public java.util.List<SharePrincipal> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The users, groups, or organization being granted permission.
     * </p>
     * 
     * @param principals
     *        The users, groups, or organization being granted permission.
     */

    public void setPrincipals(java.util.Collection<SharePrincipal> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<SharePrincipal>(principals);
    }

    /**
     * <p>
     * The users, groups, or organization being granted permission.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The users, groups, or organization being granted permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsRequest withPrincipals(SharePrincipal... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<SharePrincipal>(principals.length));
        }
        for (SharePrincipal ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The users, groups, or organization being granted permission.
     * </p>
     * 
     * @param principals
     *        The users, groups, or organization being granted permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsRequest withPrincipals(java.util.Collection<SharePrincipal> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The notification options.
     * </p>
     * 
     * @param notificationOptions
     *        The notification options.
     */

    public void setNotificationOptions(NotificationOptions notificationOptions) {
        this.notificationOptions = notificationOptions;
    }

    /**
     * <p>
     * The notification options.
     * </p>
     * 
     * @return The notification options.
     */

    public NotificationOptions getNotificationOptions() {
        return this.notificationOptions;
    }

    /**
     * <p>
     * The notification options.
     * </p>
     * 
     * @param notificationOptions
     *        The notification options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddResourcePermissionsRequest withNotificationOptions(NotificationOptions notificationOptions) {
        setNotificationOptions(notificationOptions);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getNotificationOptions() != null)
            sb.append("NotificationOptions: ").append(getNotificationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddResourcePermissionsRequest == false)
            return false;
        AddResourcePermissionsRequest other = (AddResourcePermissionsRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getNotificationOptions() == null ^ this.getNotificationOptions() == null)
            return false;
        if (other.getNotificationOptions() != null && other.getNotificationOptions().equals(this.getNotificationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getNotificationOptions() == null) ? 0 : getNotificationOptions().hashCode());
        return hashCode;
    }

    @Override
    public AddResourcePermissionsRequest clone() {
        return (AddResourcePermissionsRequest) super.clone();
    }

}
