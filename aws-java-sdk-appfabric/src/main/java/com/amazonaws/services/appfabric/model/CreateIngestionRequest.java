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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIngestionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     */
    private String appBundleIdentifier;
    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     */
    private String app;
    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     */
    private String tenantId;
    /**
     * <p>
     * The ingestion type.
     * </p>
     */
    private String ingestionType;
    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     */

    public void setAppBundleIdentifier(String appBundleIdentifier) {
        this.appBundleIdentifier = appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *         request.
     */

    public String getAppBundleIdentifier() {
        return this.appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionRequest withAppBundleIdentifier(String appBundleIdentifier) {
        setAppBundleIdentifier(appBundleIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param app
     *        The name of the application.</p>
     *        <p>
     *        Valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SLACK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASANA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JIRA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365AUDITLOGS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZOOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZENDESK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OKTA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOOGLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DROPBOX</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMARTSHEET</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CISCO</code>
     *        </p>
     *        </li>
     */

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the application.</p>
     *         <p>
     *         Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SLACK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASANA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JIRA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>M365</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>M365AUDITLOGS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZOOM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZENDESK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OKTA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GOOGLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DROPBOX</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMARTSHEET</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CISCO</code>
     *         </p>
     *         </li>
     */

    public String getApp() {
        return this.app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param app
     *        The name of the application.</p>
     *        <p>
     *        Valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SLACK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASANA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JIRA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365AUDITLOGS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZOOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZENDESK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OKTA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOOGLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DROPBOX</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMARTSHEET</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CISCO</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionRequest withApp(String app) {
        setApp(app);
        return this;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantId
     *        The ID of the application tenant.
     */

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @return The ID of the application tenant.
     */

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantId
     *        The ID of the application tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionRequest withTenantId(String tenantId) {
        setTenantId(tenantId);
        return this;
    }

    /**
     * <p>
     * The ingestion type.
     * </p>
     * 
     * @param ingestionType
     *        The ingestion type.
     * @see IngestionType
     */

    public void setIngestionType(String ingestionType) {
        this.ingestionType = ingestionType;
    }

    /**
     * <p>
     * The ingestion type.
     * </p>
     * 
     * @return The ingestion type.
     * @see IngestionType
     */

    public String getIngestionType() {
        return this.ingestionType;
    }

    /**
     * <p>
     * The ingestion type.
     * </p>
     * 
     * @param ingestionType
     *        The ingestion type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionType
     */

    public CreateIngestionRequest withIngestionType(String ingestionType) {
        setIngestionType(ingestionType);
        return this;
    }

    /**
     * <p>
     * The ingestion type.
     * </p>
     * 
     * @param ingestionType
     *        The ingestion type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionType
     */

    public CreateIngestionRequest withIngestionType(IngestionType ingestionType) {
        this.ingestionType = ingestionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @return A map of the key-value pairs of the tag or tags to assign to the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
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
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionRequest withTags(Tag... tags) {
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
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngestionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAppBundleIdentifier() != null)
            sb.append("AppBundleIdentifier: ").append(getAppBundleIdentifier()).append(",");
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getTenantId() != null)
            sb.append("TenantId: ").append(getTenantId()).append(",");
        if (getIngestionType() != null)
            sb.append("IngestionType: ").append(getIngestionType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateIngestionRequest == false)
            return false;
        CreateIngestionRequest other = (CreateIngestionRequest) obj;
        if (other.getAppBundleIdentifier() == null ^ this.getAppBundleIdentifier() == null)
            return false;
        if (other.getAppBundleIdentifier() != null && other.getAppBundleIdentifier().equals(this.getAppBundleIdentifier()) == false)
            return false;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getTenantId() == null ^ this.getTenantId() == null)
            return false;
        if (other.getTenantId() != null && other.getTenantId().equals(this.getTenantId()) == false)
            return false;
        if (other.getIngestionType() == null ^ this.getIngestionType() == null)
            return false;
        if (other.getIngestionType() != null && other.getIngestionType().equals(this.getIngestionType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getAppBundleIdentifier() == null) ? 0 : getAppBundleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        hashCode = prime * hashCode + ((getIngestionType() == null) ? 0 : getIngestionType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateIngestionRequest clone() {
        return (CreateIngestionRequest) super.clone();
    }

}
