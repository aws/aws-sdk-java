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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes an application that uses IAM Identity Center for access management.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID number of the application.
     * </p>
     */
    private String applicationAccount;
    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The ARN of the application provider for this application.
     * </p>
     */
    private String applicationProviderArn;
    /**
     * <p>
     * The date and time when the application was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure that describes the options for the access portal associated with this application.
     * </p>
     */
    private PortalOptions portalOptions;
    /**
     * <p>
     * The current status of the application in this instance of IAM Identity Center.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Web Services account ID number of the application.
     * </p>
     * 
     * @param applicationAccount
     *        The Amazon Web Services account ID number of the application.
     */

    public void setApplicationAccount(String applicationAccount) {
        this.applicationAccount = applicationAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID number of the application.
     * </p>
     * 
     * @return The Amazon Web Services account ID number of the application.
     */

    public String getApplicationAccount() {
        return this.applicationAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID number of the application.
     * </p>
     * 
     * @param applicationAccount
     *        The Amazon Web Services account ID number of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationAccount(String applicationAccount) {
        setApplicationAccount(applicationAccount);
        return this;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the application provider for this application.
     * </p>
     * 
     * @param applicationProviderArn
     *        The ARN of the application provider for this application.
     */

    public void setApplicationProviderArn(String applicationProviderArn) {
        this.applicationProviderArn = applicationProviderArn;
    }

    /**
     * <p>
     * The ARN of the application provider for this application.
     * </p>
     * 
     * @return The ARN of the application provider for this application.
     */

    public String getApplicationProviderArn() {
        return this.applicationProviderArn;
    }

    /**
     * <p>
     * The ARN of the application provider for this application.
     * </p>
     * 
     * @param applicationProviderArn
     *        The ARN of the application provider for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationProviderArn(String applicationProviderArn) {
        setApplicationProviderArn(applicationProviderArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the application was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the application was originally created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the application was originally created.
     * </p>
     * 
     * @return The date and time when the application was originally created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time when the application was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the application was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the instance of IAM Identity Center that is configured with this application.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     * </p>
     * 
     * @return The ARN of the instance of IAM Identity Center that is configured with this application.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center that is configured with this application.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the instance of IAM Identity Center that is configured with this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that describes the options for the access portal associated with this application.
     * </p>
     * 
     * @param portalOptions
     *        A structure that describes the options for the access portal associated with this application.
     */

    public void setPortalOptions(PortalOptions portalOptions) {
        this.portalOptions = portalOptions;
    }

    /**
     * <p>
     * A structure that describes the options for the access portal associated with this application.
     * </p>
     * 
     * @return A structure that describes the options for the access portal associated with this application.
     */

    public PortalOptions getPortalOptions() {
        return this.portalOptions;
    }

    /**
     * <p>
     * A structure that describes the options for the access portal associated with this application.
     * </p>
     * 
     * @param portalOptions
     *        A structure that describes the options for the access portal associated with this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withPortalOptions(PortalOptions portalOptions) {
        setPortalOptions(portalOptions);
        return this;
    }

    /**
     * <p>
     * The current status of the application in this instance of IAM Identity Center.
     * </p>
     * 
     * @param status
     *        The current status of the application in this instance of IAM Identity Center.
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the application in this instance of IAM Identity Center.
     * </p>
     * 
     * @return The current status of the application in this instance of IAM Identity Center.
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the application in this instance of IAM Identity Center.
     * </p>
     * 
     * @param status
     *        The current status of the application in this instance of IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the application in this instance of IAM Identity Center.
     * </p>
     * 
     * @param status
     *        The current status of the application in this instance of IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(ApplicationStatus status) {
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

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
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
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
