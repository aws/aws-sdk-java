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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ImportHypervisorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportHypervisorConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     */
    private String host;
    /**
     * <p>
     * The Key Management Service for the hypervisor.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The tags of the hypervisor configuration to import.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @return The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *         (FQDN).
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The Key Management Service for the hypervisor.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Key Management Service for the hypervisor.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Key Management Service for the hypervisor.
     * </p>
     * 
     * @return The Key Management Service for the hypervisor.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Key Management Service for the hypervisor.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Key Management Service for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     * 
     * @param name
     *        The name of the hypervisor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     * 
     * @return The name of the hypervisor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     * 
     * @param name
     *        The name of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     * 
     * @param password
     *        The password for the hypervisor.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     * 
     * @return The password for the hypervisor.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the hypervisor.
     * </p>
     * 
     * @param password
     *        The password for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The tags of the hypervisor configuration to import.
     * </p>
     * 
     * @return The tags of the hypervisor configuration to import.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the hypervisor configuration to import.
     * </p>
     * 
     * @param tags
     *        The tags of the hypervisor configuration to import.
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
     * The tags of the hypervisor configuration to import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags of the hypervisor configuration to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withTags(Tag... tags) {
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
     * The tags of the hypervisor configuration to import.
     * </p>
     * 
     * @param tags
     *        The tags of the hypervisor configuration to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     * 
     * @param username
     *        The username for the hypervisor.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     * 
     * @return The username for the hypervisor.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username for the hypervisor.
     * </p>
     * 
     * @param username
     *        The username for the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHypervisorConfigurationRequest withUsername(String username) {
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof ImportHypervisorConfigurationRequest == false)
            return false;
        ImportHypervisorConfigurationRequest other = (ImportHypervisorConfigurationRequest) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public ImportHypervisorConfigurationRequest clone() {
        return (ImportHypervisorConfigurationRequest) super.clone();
    }

}
