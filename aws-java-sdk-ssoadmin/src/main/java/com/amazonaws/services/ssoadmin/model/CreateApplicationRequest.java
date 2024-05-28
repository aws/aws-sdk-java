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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     */
    private String applicationProviderArn;
    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.
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
     * The description of the .
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The name of the .
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     */
    private PortalOptions portalOptions;
    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies tags to be attached to the application.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     * 
     * @param applicationProviderArn
     *        The ARN of the application provider under which the operation will run.
     */

    public void setApplicationProviderArn(String applicationProviderArn) {
        this.applicationProviderArn = applicationProviderArn;
    }

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     * 
     * @return The ARN of the application provider under which the operation will run.
     */

    public String getApplicationProviderArn() {
        return this.applicationProviderArn;
    }

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     * 
     * @param applicationProviderArn
     *        The ARN of the application provider under which the operation will run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationProviderArn(String applicationProviderArn) {
        setApplicationProviderArn(applicationProviderArn);
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.
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
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
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
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This
     *         lets you safely retry the request without accidentally performing the same operation a second time.
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
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.
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
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the .
     * </p>
     * 
     * @param description
     *        The description of the .
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the .
     * </p>
     * 
     * @return The description of the .
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the .
     * </p>
     * 
     * @param description
     *        The description of the .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the instance of IAM Identity Center under which the operation will run. For more information
     *        about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     *        Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The ARN of the instance of IAM Identity Center under which the operation will run. For more information
     *         about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     *         and Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the instance of IAM Identity Center under which the operation will run. For more information
     *        about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     *        Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The name of the .
     * </p>
     * 
     * @param name
     *        The name of the .
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the .
     * </p>
     * 
     * @return The name of the .
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the .
     * </p>
     * 
     * @param name
     *        The name of the .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     * 
     * @param portalOptions
     *        A structure that describes the options for the portal associated with an application.
     */

    public void setPortalOptions(PortalOptions portalOptions) {
        this.portalOptions = portalOptions;
    }

    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     * 
     * @return A structure that describes the options for the portal associated with an application.
     */

    public PortalOptions getPortalOptions() {
        return this.portalOptions;
    }

    /**
     * <p>
     * A structure that describes the options for the portal associated with an application.
     * </p>
     * 
     * @param portalOptions
     *        A structure that describes the options for the portal associated with an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withPortalOptions(PortalOptions portalOptions) {
        setPortalOptions(portalOptions);
        return this;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the application is enabled or disabled.
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @return Specifies whether the application is enabled or disabled.
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the application is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public CreateApplicationRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether the application is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the application is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public CreateApplicationRequest withStatus(ApplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies tags to be attached to the application.
     * </p>
     * 
     * @return Specifies tags to be attached to the application.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies tags to be attached to the application.
     * </p>
     * 
     * @param tags
     *        Specifies tags to be attached to the application.
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
     * Specifies tags to be attached to the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies tags to be attached to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(Tag... tags) {
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
     * Specifies tags to be attached to the application.
     * </p>
     * 
     * @param tags
     *        Specifies tags to be attached to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getApplicationProviderArn() != null)
            sb.append("ApplicationProviderArn: ").append(getApplicationProviderArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPortalOptions() != null)
            sb.append("PortalOptions: ").append(getPortalOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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
        if (other.getApplicationProviderArn() == null ^ this.getApplicationProviderArn() == null)
            return false;
        if (other.getApplicationProviderArn() != null && other.getApplicationProviderArn().equals(this.getApplicationProviderArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPortalOptions() == null ^ this.getPortalOptions() == null)
            return false;
        if (other.getPortalOptions() != null && other.getPortalOptions().equals(this.getPortalOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getApplicationProviderArn() == null) ? 0 : getApplicationProviderArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortalOptions() == null) ? 0 : getPortalOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
