/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateHypervisor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHypervisorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     */
    private String host;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor to update.
     * </p>
     */
    private String hypervisorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     */
    private String logGroupArn;
    /**
     * <p>
     * The updated name for the hypervisor
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated password for the hypervisor.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The updated username for the hypervisor.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @return The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *         (FQDN).
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The updated host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorRequest withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor to update.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor to update.
     */

    public void setHypervisorArn(String hypervisorArn) {
        this.hypervisorArn = hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hypervisor to update.
     */

    public String getHypervisorArn() {
        return this.hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor to update.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorRequest withHypervisorArn(String hypervisorArn) {
        setHypervisorArn(hypervisorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorRequest withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
        return this;
    }

    /**
     * <p>
     * The updated name for the hypervisor
     * </p>
     * 
     * @param name
     *        The updated name for the hypervisor
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name for the hypervisor
     * </p>
     * 
     * @return The updated name for the hypervisor
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name for the hypervisor
     * </p>
     * 
     * @param name
     *        The updated name for the hypervisor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated password for the hypervisor.
     * </p>
     * 
     * @param password
     *        The updated password for the hypervisor.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The updated password for the hypervisor.
     * </p>
     * 
     * @return The updated password for the hypervisor.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The updated password for the hypervisor.
     * </p>
     * 
     * @param password
     *        The updated password for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The updated username for the hypervisor.
     * </p>
     * 
     * @param username
     *        The updated username for the hypervisor.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The updated username for the hypervisor.
     * </p>
     * 
     * @return The updated username for the hypervisor.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The updated username for the hypervisor.
     * </p>
     * 
     * @param username
     *        The updated username for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHypervisorRequest withUsername(String username) {
        setUsername(username);
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getHypervisorArn() != null)
            sb.append("HypervisorArn: ").append(getHypervisorArn()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHypervisorRequest == false)
            return false;
        UpdateHypervisorRequest other = (UpdateHypervisorRequest) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getHypervisorArn() == null ^ this.getHypervisorArn() == null)
            return false;
        if (other.getHypervisorArn() != null && other.getHypervisorArn().equals(this.getHypervisorArn()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getHypervisorArn() == null) ? 0 : getHypervisorArn().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHypervisorRequest clone() {
        return (UpdateHypervisorRequest) super.clone();
    }

}
