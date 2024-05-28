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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name that you give the monitor that is displayed in the Deadline Cloud console.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     * </p>
     */
    private String identityCenterInstanceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every user
     * that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The subdomain to use when creating the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     */
    private String subdomain;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name that you give the monitor that is displayed in the Deadline Cloud console.
     * </p>
     * 
     * @param displayName
     *        The name that you give the monitor that is displayed in the Deadline Cloud console.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name that you give the monitor that is displayed in the Deadline Cloud console.
     * </p>
     * 
     * @return The name that you give the monitor that is displayed in the Deadline Cloud console.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name that you give the monitor that is displayed in the Deadline Cloud console.
     * </p>
     * 
     * @param displayName
     *        The name that you give the monitor that is displayed in the Deadline Cloud console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     */

    public void setIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        this.identityCenterInstanceArn = identityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     */

    public String getIdentityCenterInstanceArn() {
        return this.identityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The Amazon Resource Name (ARN) of the IAM Identity Center instance that authenticates monitor users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        setIdentityCenterInstanceArn(identityCenterInstanceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every user
     * that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every
     *        user that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every user
     * that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every
     *         user that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every user
     * that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that the monitor uses to connect to Deadline Cloud. Every
     *        user that signs in to the monitor using IAM Identity Center uses this role to access Deadline Cloud
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The subdomain to use when creating the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @param subdomain
     *        The subdomain to use when creating the monitor URL. The full URL of the monitor is
     *        subdomain.Region.deadlinecloud.amazonaws.com.
     */

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * <p>
     * The subdomain to use when creating the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @return The subdomain to use when creating the monitor URL. The full URL of the monitor is
     *         subdomain.Region.deadlinecloud.amazonaws.com.
     */

    public String getSubdomain() {
        return this.subdomain;
    }

    /**
     * <p>
     * The subdomain to use when creating the monitor URL. The full URL of the monitor is
     * subdomain.Region.deadlinecloud.amazonaws.com.
     * </p>
     * 
     * @param subdomain
     *        The subdomain to use when creating the monitor URL. The full URL of the monitor is
     *        subdomain.Region.deadlinecloud.amazonaws.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withSubdomain(String subdomain) {
        setSubdomain(subdomain);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getIdentityCenterInstanceArn() != null)
            sb.append("IdentityCenterInstanceArn: ").append(getIdentityCenterInstanceArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSubdomain() != null)
            sb.append("Subdomain: ").append(getSubdomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMonitorRequest == false)
            return false;
        CreateMonitorRequest other = (CreateMonitorRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIdentityCenterInstanceArn() == null ^ this.getIdentityCenterInstanceArn() == null)
            return false;
        if (other.getIdentityCenterInstanceArn() != null && other.getIdentityCenterInstanceArn().equals(this.getIdentityCenterInstanceArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSubdomain() == null ^ this.getSubdomain() == null)
            return false;
        if (other.getSubdomain() != null && other.getSubdomain().equals(this.getSubdomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterInstanceArn() == null) ? 0 : getIdentityCenterInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubdomain() == null) ? 0 : getSubdomain().hashCode());
        return hashCode;
    }

    @Override
    public CreateMonitorRequest clone() {
        return (CreateMonitorRequest) super.clone();
    }

}
