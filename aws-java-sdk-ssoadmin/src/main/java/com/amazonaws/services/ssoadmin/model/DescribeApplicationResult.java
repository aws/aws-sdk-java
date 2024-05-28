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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID.
     * </p>
     */
    private String applicationAccount;
    /**
     * <p>
     * Specifies the ARN of the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     */
    private String applicationProviderArn;
    /**
     * <p>
     * The date the application was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The description of the .
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the IAM Identity Center application under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The application name.
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
     * The account ID.
     * </p>
     * 
     * @param applicationAccount
     *        The account ID.
     */

    public void setApplicationAccount(String applicationAccount) {
        this.applicationAccount = applicationAccount;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @return The account ID.
     */

    public String getApplicationAccount() {
        return this.applicationAccount;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param applicationAccount
     *        The account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withApplicationAccount(String applicationAccount) {
        setApplicationAccount(applicationAccount);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the application.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application.
     * </p>
     * 
     * @return Specifies the ARN of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

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

    public DescribeApplicationResult withApplicationProviderArn(String applicationProviderArn) {
        setApplicationProviderArn(applicationProviderArn);
        return this;
    }

    /**
     * <p>
     * The date the application was created.
     * </p>
     * 
     * @param createdDate
     *        The date the application was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the application was created.
     * </p>
     * 
     * @return The date the application was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the application was created.
     * </p>
     * 
     * @param createdDate
     *        The date the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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

    public DescribeApplicationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center application under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the IAM Identity Center application under which the operation will run. For more information
     *        about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     *        Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center application under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The ARN of the IAM Identity Center application under which the operation will run. For more information
     *         about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     *         and Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center application under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the IAM Identity Center application under which the operation will run. For more information
     *        about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     *        Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param name
     *        The application name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @return The application name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param name
     *        The application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withName(String name) {
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

    public DescribeApplicationResult withPortalOptions(PortalOptions portalOptions) {
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

    public DescribeApplicationResult withStatus(String status) {
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

    public DescribeApplicationResult withStatus(ApplicationStatus status) {
        this.status = status.toString();
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
        if (getApplicationAccount() != null)
            sb.append("ApplicationAccount: ").append(getApplicationAccount()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getApplicationProviderArn() != null)
            sb.append("ApplicationProviderArn: ").append(getApplicationProviderArn()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPortalOptions() != null)
            sb.append("PortalOptions: ").append(getPortalOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationResult == false)
            return false;
        DescribeApplicationResult other = (DescribeApplicationResult) obj;
        if (other.getApplicationAccount() == null ^ this.getApplicationAccount() == null)
            return false;
        if (other.getApplicationAccount() != null && other.getApplicationAccount().equals(this.getApplicationAccount()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getApplicationProviderArn() == null ^ this.getApplicationProviderArn() == null)
            return false;
        if (other.getApplicationProviderArn() != null && other.getApplicationProviderArn().equals(this.getApplicationProviderArn()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationAccount() == null) ? 0 : getApplicationAccount().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationProviderArn() == null) ? 0 : getApplicationProviderArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortalOptions() == null) ? 0 : getPortalOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationResult clone() {
        try {
            return (DescribeApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
