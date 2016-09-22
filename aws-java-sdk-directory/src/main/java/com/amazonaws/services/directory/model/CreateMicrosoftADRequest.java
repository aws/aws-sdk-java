/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Microsoft AD in the AWS cloud.
 * </p>
 */
public class CreateMicrosoftADRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will resolve
     * inside your VPC only. It does not need to be publicly resolvable.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you don't
     * specify a NetBIOS name, it will default to the first part of your directory DNS. For example, <code>CORP</code>
     * for the directory DNS <code>corp.example.com</code>.
     * </p>
     */
    private String shortName;
    /**
     * <p>
     * The password for the default administrative user named <code>Admin</code>.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A textual description for the directory. This label will appear on the AWS console <code>Directory Details</code>
     * page after the directory is created.
     * </p>
     */
    private String description;

    private DirectoryVpcSettings vpcSettings;

    /**
     * <p>
     * The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will resolve
     * inside your VPC only. It does not need to be publicly resolvable.
     * </p>
     * 
     * @param name
     *        The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will
     *        resolve inside your VPC only. It does not need to be publicly resolvable.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will resolve
     * inside your VPC only. It does not need to be publicly resolvable.
     * </p>
     * 
     * @return The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will
     *         resolve inside your VPC only. It does not need to be publicly resolvable.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will resolve
     * inside your VPC only. It does not need to be publicly resolvable.
     * </p>
     * 
     * @param name
     *        The fully qualified domain name for the directory, such as <code>corp.example.com</code>. This name will
     *        resolve inside your VPC only. It does not need to be publicly resolvable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftADRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you don't
     * specify a NetBIOS name, it will default to the first part of your directory DNS. For example, <code>CORP</code>
     * for the directory DNS <code>corp.example.com</code>.
     * </p>
     * 
     * @param shortName
     *        The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you
     *        don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example,
     *        <code>CORP</code> for the directory DNS <code>corp.example.com</code>.
     */

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * <p>
     * The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you don't
     * specify a NetBIOS name, it will default to the first part of your directory DNS. For example, <code>CORP</code>
     * for the directory DNS <code>corp.example.com</code>.
     * </p>
     * 
     * @return The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you
     *         don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example,
     *         <code>CORP</code> for the directory DNS <code>corp.example.com</code>.
     */

    public String getShortName() {
        return this.shortName;
    }

    /**
     * <p>
     * The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you don't
     * specify a NetBIOS name, it will default to the first part of your directory DNS. For example, <code>CORP</code>
     * for the directory DNS <code>corp.example.com</code>.
     * </p>
     * 
     * @param shortName
     *        The NetBIOS name for your domain. A short identifier for your domain, such as <code>CORP</code>. If you
     *        don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example,
     *        <code>CORP</code> for the directory DNS <code>corp.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftADRequest withShortName(String shortName) {
        setShortName(shortName);
        return this;
    }

    /**
     * <p>
     * The password for the default administrative user named <code>Admin</code>.
     * </p>
     * 
     * @param password
     *        The password for the default administrative user named <code>Admin</code>.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the default administrative user named <code>Admin</code>.
     * </p>
     * 
     * @return The password for the default administrative user named <code>Admin</code>.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the default administrative user named <code>Admin</code>.
     * </p>
     * 
     * @param password
     *        The password for the default administrative user named <code>Admin</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftADRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A textual description for the directory. This label will appear on the AWS console <code>Directory Details</code>
     * page after the directory is created.
     * </p>
     * 
     * @param description
     *        A textual description for the directory. This label will appear on the AWS console
     *        <code>Directory Details</code> page after the directory is created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A textual description for the directory. This label will appear on the AWS console <code>Directory Details</code>
     * page after the directory is created.
     * </p>
     * 
     * @return A textual description for the directory. This label will appear on the AWS console
     *         <code>Directory Details</code> page after the directory is created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A textual description for the directory. This label will appear on the AWS console <code>Directory Details</code>
     * page after the directory is created.
     * </p>
     * 
     * @param description
     *        A textual description for the directory. This label will appear on the AWS console
     *        <code>Directory Details</code> page after the directory is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftADRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param vpcSettings
     */

    public void setVpcSettings(DirectoryVpcSettings vpcSettings) {
        this.vpcSettings = vpcSettings;
    }

    /**
     * @return
     */

    public DirectoryVpcSettings getVpcSettings() {
        return this.vpcSettings;
    }

    /**
     * @param vpcSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftADRequest withVpcSettings(DirectoryVpcSettings vpcSettings) {
        setVpcSettings(vpcSettings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getShortName() != null)
            sb.append("ShortName: " + getShortName() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getVpcSettings() != null)
            sb.append("VpcSettings: " + getVpcSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMicrosoftADRequest == false)
            return false;
        CreateMicrosoftADRequest other = (CreateMicrosoftADRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getShortName() == null ^ this.getShortName() == null)
            return false;
        if (other.getShortName() != null && other.getShortName().equals(this.getShortName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVpcSettings() == null ^ this.getVpcSettings() == null)
            return false;
        if (other.getVpcSettings() != null && other.getVpcSettings().equals(this.getVpcSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortName() == null) ? 0 : getShortName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcSettings() == null) ? 0 : getVpcSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateMicrosoftADRequest clone() {
        return (CreateMicrosoftADRequest) super.clone();
    }
}
