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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an AWS Directory Service directory that is used with Amazon WorkSpaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceDirectory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The directory identifier.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The directory alias.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The name of the directory.
     * </p>
     */
    private String directoryName;
    /**
     * <p>
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client
     * application to connect to the directory.
     * </p>
     */
    private String registrationCode;
    /**
     * <p>
     * The identifiers of the subnets used with the directory.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The IP addresses of the DNS servers for the directory.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsIpAddresses;
    /**
     * <p>
     * The user name for the service account.
     * </p>
     */
    private String customerUserName;
    /**
     * <p>
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services,
     * such as Amazon EC2, on your behalf.
     * </p>
     */
    private String iamRoleId;
    /**
     * <p>
     * The directory type.
     * </p>
     */
    private String directoryType;
    /**
     * <p>
     * The identifier of the security group that is assigned to new WorkSpaces.
     * </p>
     */
    private String workspaceSecurityGroupId;
    /**
     * <p>
     * The state of the directory's registration with Amazon WorkSpaces
     * </p>
     */
    private String state;
    /**
     * <p>
     * The default creation properties for all WorkSpaces in the directory.
     * </p>
     */
    private DefaultWorkspaceCreationProperties workspaceCreationProperties;
    /**
     * <p>
     * The identifiers of the IP access control groups associated with the directory.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipGroupIds;

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @return The directory identifier.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The directory alias.
     * </p>
     * 
     * @param alias
     *        The directory alias.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The directory alias.
     * </p>
     * 
     * @return The directory alias.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The directory alias.
     * </p>
     * 
     * @param alias
     *        The directory alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The name of the directory.
     * </p>
     * 
     * @param directoryName
     *        The name of the directory.
     */

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    /**
     * <p>
     * The name of the directory.
     * </p>
     * 
     * @return The name of the directory.
     */

    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * <p>
     * The name of the directory.
     * </p>
     * 
     * @param directoryName
     *        The name of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withDirectoryName(String directoryName) {
        setDirectoryName(directoryName);
        return this;
    }

    /**
     * <p>
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client
     * application to connect to the directory.
     * </p>
     * 
     * @param registrationCode
     *        The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces
     *        client application to connect to the directory.
     */

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    /**
     * <p>
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client
     * application to connect to the directory.
     * </p>
     * 
     * @return The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces
     *         client application to connect to the directory.
     */

    public String getRegistrationCode() {
        return this.registrationCode;
    }

    /**
     * <p>
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client
     * application to connect to the directory.
     * </p>
     * 
     * @param registrationCode
     *        The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces
     *        client application to connect to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withRegistrationCode(String registrationCode) {
        setRegistrationCode(registrationCode);
        return this;
    }

    /**
     * <p>
     * The identifiers of the subnets used with the directory.
     * </p>
     * 
     * @return The identifiers of the subnets used with the directory.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The identifiers of the subnets used with the directory.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets used with the directory.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * The identifiers of the subnets used with the directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets used with the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the subnets used with the directory.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets used with the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory.
     * </p>
     * 
     * @return The IP addresses of the DNS servers for the directory.
     */

    public java.util.List<String> getDnsIpAddresses() {
        if (dnsIpAddresses == null) {
            dnsIpAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsIpAddresses;
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory.
     * </p>
     * 
     * @param dnsIpAddresses
     *        The IP addresses of the DNS servers for the directory.
     */

    public void setDnsIpAddresses(java.util.Collection<String> dnsIpAddresses) {
        if (dnsIpAddresses == null) {
            this.dnsIpAddresses = null;
            return;
        }

        this.dnsIpAddresses = new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddresses);
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIpAddresses(java.util.Collection)} or {@link #withDnsIpAddresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dnsIpAddresses
     *        The IP addresses of the DNS servers for the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withDnsIpAddresses(String... dnsIpAddresses) {
        if (this.dnsIpAddresses == null) {
            setDnsIpAddresses(new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddresses.length));
        }
        for (String ele : dnsIpAddresses) {
            this.dnsIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory.
     * </p>
     * 
     * @param dnsIpAddresses
     *        The IP addresses of the DNS servers for the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withDnsIpAddresses(java.util.Collection<String> dnsIpAddresses) {
        setDnsIpAddresses(dnsIpAddresses);
        return this;
    }

    /**
     * <p>
     * The user name for the service account.
     * </p>
     * 
     * @param customerUserName
     *        The user name for the service account.
     */

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    /**
     * <p>
     * The user name for the service account.
     * </p>
     * 
     * @return The user name for the service account.
     */

    public String getCustomerUserName() {
        return this.customerUserName;
    }

    /**
     * <p>
     * The user name for the service account.
     * </p>
     * 
     * @param customerUserName
     *        The user name for the service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withCustomerUserName(String customerUserName) {
        setCustomerUserName(customerUserName);
        return this;
    }

    /**
     * <p>
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services,
     * such as Amazon EC2, on your behalf.
     * </p>
     * 
     * @param iamRoleId
     *        The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other
     *        services, such as Amazon EC2, on your behalf.
     */

    public void setIamRoleId(String iamRoleId) {
        this.iamRoleId = iamRoleId;
    }

    /**
     * <p>
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services,
     * such as Amazon EC2, on your behalf.
     * </p>
     * 
     * @return The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other
     *         services, such as Amazon EC2, on your behalf.
     */

    public String getIamRoleId() {
        return this.iamRoleId;
    }

    /**
     * <p>
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services,
     * such as Amazon EC2, on your behalf.
     * </p>
     * 
     * @param iamRoleId
     *        The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other
     *        services, such as Amazon EC2, on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withIamRoleId(String iamRoleId) {
        setIamRoleId(iamRoleId);
        return this;
    }

    /**
     * <p>
     * The directory type.
     * </p>
     * 
     * @param directoryType
     *        The directory type.
     * @see WorkspaceDirectoryType
     */

    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    /**
     * <p>
     * The directory type.
     * </p>
     * 
     * @return The directory type.
     * @see WorkspaceDirectoryType
     */

    public String getDirectoryType() {
        return this.directoryType;
    }

    /**
     * <p>
     * The directory type.
     * </p>
     * 
     * @param directoryType
     *        The directory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceDirectoryType
     */

    public WorkspaceDirectory withDirectoryType(String directoryType) {
        setDirectoryType(directoryType);
        return this;
    }

    /**
     * <p>
     * The directory type.
     * </p>
     * 
     * @param directoryType
     *        The directory type.
     * @see WorkspaceDirectoryType
     */

    public void setDirectoryType(WorkspaceDirectoryType directoryType) {
        withDirectoryType(directoryType);
    }

    /**
     * <p>
     * The directory type.
     * </p>
     * 
     * @param directoryType
     *        The directory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceDirectoryType
     */

    public WorkspaceDirectory withDirectoryType(WorkspaceDirectoryType directoryType) {
        this.directoryType = directoryType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the security group that is assigned to new WorkSpaces.
     * </p>
     * 
     * @param workspaceSecurityGroupId
     *        The identifier of the security group that is assigned to new WorkSpaces.
     */

    public void setWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of the security group that is assigned to new WorkSpaces.
     * </p>
     * 
     * @return The identifier of the security group that is assigned to new WorkSpaces.
     */

    public String getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of the security group that is assigned to new WorkSpaces.
     * </p>
     * 
     * @param workspaceSecurityGroupId
     *        The identifier of the security group that is assigned to new WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        setWorkspaceSecurityGroupId(workspaceSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The state of the directory's registration with Amazon WorkSpaces
     * </p>
     * 
     * @param state
     *        The state of the directory's registration with Amazon WorkSpaces
     * @see WorkspaceDirectoryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the directory's registration with Amazon WorkSpaces
     * </p>
     * 
     * @return The state of the directory's registration with Amazon WorkSpaces
     * @see WorkspaceDirectoryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the directory's registration with Amazon WorkSpaces
     * </p>
     * 
     * @param state
     *        The state of the directory's registration with Amazon WorkSpaces
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceDirectoryState
     */

    public WorkspaceDirectory withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the directory's registration with Amazon WorkSpaces
     * </p>
     * 
     * @param state
     *        The state of the directory's registration with Amazon WorkSpaces
     * @see WorkspaceDirectoryState
     */

    public void setState(WorkspaceDirectoryState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the directory's registration with Amazon WorkSpaces
     * </p>
     * 
     * @param state
     *        The state of the directory's registration with Amazon WorkSpaces
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceDirectoryState
     */

    public WorkspaceDirectory withState(WorkspaceDirectoryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The default creation properties for all WorkSpaces in the directory.
     * </p>
     * 
     * @param workspaceCreationProperties
     *        The default creation properties for all WorkSpaces in the directory.
     */

    public void setWorkspaceCreationProperties(DefaultWorkspaceCreationProperties workspaceCreationProperties) {
        this.workspaceCreationProperties = workspaceCreationProperties;
    }

    /**
     * <p>
     * The default creation properties for all WorkSpaces in the directory.
     * </p>
     * 
     * @return The default creation properties for all WorkSpaces in the directory.
     */

    public DefaultWorkspaceCreationProperties getWorkspaceCreationProperties() {
        return this.workspaceCreationProperties;
    }

    /**
     * <p>
     * The default creation properties for all WorkSpaces in the directory.
     * </p>
     * 
     * @param workspaceCreationProperties
     *        The default creation properties for all WorkSpaces in the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withWorkspaceCreationProperties(DefaultWorkspaceCreationProperties workspaceCreationProperties) {
        setWorkspaceCreationProperties(workspaceCreationProperties);
        return this;
    }

    /**
     * <p>
     * The identifiers of the IP access control groups associated with the directory.
     * </p>
     * 
     * @return The identifiers of the IP access control groups associated with the directory.
     */

    public java.util.List<String> getIpGroupIds() {
        if (ipGroupIds == null) {
            ipGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipGroupIds;
    }

    /**
     * <p>
     * The identifiers of the IP access control groups associated with the directory.
     * </p>
     * 
     * @param ipGroupIds
     *        The identifiers of the IP access control groups associated with the directory.
     */

    public void setIpGroupIds(java.util.Collection<String> ipGroupIds) {
        if (ipGroupIds == null) {
            this.ipGroupIds = null;
            return;
        }

        this.ipGroupIds = new com.amazonaws.internal.SdkInternalList<String>(ipGroupIds);
    }

    /**
     * <p>
     * The identifiers of the IP access control groups associated with the directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpGroupIds(java.util.Collection)} or {@link #withIpGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipGroupIds
     *        The identifiers of the IP access control groups associated with the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withIpGroupIds(String... ipGroupIds) {
        if (this.ipGroupIds == null) {
            setIpGroupIds(new com.amazonaws.internal.SdkInternalList<String>(ipGroupIds.length));
        }
        for (String ele : ipGroupIds) {
            this.ipGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the IP access control groups associated with the directory.
     * </p>
     * 
     * @param ipGroupIds
     *        The identifiers of the IP access control groups associated with the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDirectory withIpGroupIds(java.util.Collection<String> ipGroupIds) {
        setIpGroupIds(ipGroupIds);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getDirectoryName() != null)
            sb.append("DirectoryName: ").append(getDirectoryName()).append(",");
        if (getRegistrationCode() != null)
            sb.append("RegistrationCode: ").append(getRegistrationCode()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getDnsIpAddresses() != null)
            sb.append("DnsIpAddresses: ").append(getDnsIpAddresses()).append(",");
        if (getCustomerUserName() != null)
            sb.append("CustomerUserName: ").append(getCustomerUserName()).append(",");
        if (getIamRoleId() != null)
            sb.append("IamRoleId: ").append(getIamRoleId()).append(",");
        if (getDirectoryType() != null)
            sb.append("DirectoryType: ").append(getDirectoryType()).append(",");
        if (getWorkspaceSecurityGroupId() != null)
            sb.append("WorkspaceSecurityGroupId: ").append(getWorkspaceSecurityGroupId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getWorkspaceCreationProperties() != null)
            sb.append("WorkspaceCreationProperties: ").append(getWorkspaceCreationProperties()).append(",");
        if (getIpGroupIds() != null)
            sb.append("IpGroupIds: ").append(getIpGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceDirectory == false)
            return false;
        WorkspaceDirectory other = (WorkspaceDirectory) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getDirectoryName() == null ^ this.getDirectoryName() == null)
            return false;
        if (other.getDirectoryName() != null && other.getDirectoryName().equals(this.getDirectoryName()) == false)
            return false;
        if (other.getRegistrationCode() == null ^ this.getRegistrationCode() == null)
            return false;
        if (other.getRegistrationCode() != null && other.getRegistrationCode().equals(this.getRegistrationCode()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getDnsIpAddresses() == null ^ this.getDnsIpAddresses() == null)
            return false;
        if (other.getDnsIpAddresses() != null && other.getDnsIpAddresses().equals(this.getDnsIpAddresses()) == false)
            return false;
        if (other.getCustomerUserName() == null ^ this.getCustomerUserName() == null)
            return false;
        if (other.getCustomerUserName() != null && other.getCustomerUserName().equals(this.getCustomerUserName()) == false)
            return false;
        if (other.getIamRoleId() == null ^ this.getIamRoleId() == null)
            return false;
        if (other.getIamRoleId() != null && other.getIamRoleId().equals(this.getIamRoleId()) == false)
            return false;
        if (other.getDirectoryType() == null ^ this.getDirectoryType() == null)
            return false;
        if (other.getDirectoryType() != null && other.getDirectoryType().equals(this.getDirectoryType()) == false)
            return false;
        if (other.getWorkspaceSecurityGroupId() == null ^ this.getWorkspaceSecurityGroupId() == null)
            return false;
        if (other.getWorkspaceSecurityGroupId() != null && other.getWorkspaceSecurityGroupId().equals(this.getWorkspaceSecurityGroupId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getWorkspaceCreationProperties() == null ^ this.getWorkspaceCreationProperties() == null)
            return false;
        if (other.getWorkspaceCreationProperties() != null && other.getWorkspaceCreationProperties().equals(this.getWorkspaceCreationProperties()) == false)
            return false;
        if (other.getIpGroupIds() == null ^ this.getIpGroupIds() == null)
            return false;
        if (other.getIpGroupIds() != null && other.getIpGroupIds().equals(this.getIpGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getDirectoryName() == null) ? 0 : getDirectoryName().hashCode());
        hashCode = prime * hashCode + ((getRegistrationCode() == null) ? 0 : getRegistrationCode().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddresses() == null) ? 0 : getDnsIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getCustomerUserName() == null) ? 0 : getCustomerUserName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleId() == null) ? 0 : getIamRoleId().hashCode());
        hashCode = prime * hashCode + ((getDirectoryType() == null) ? 0 : getDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceSecurityGroupId() == null) ? 0 : getWorkspaceSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceCreationProperties() == null) ? 0 : getWorkspaceCreationProperties().hashCode());
        hashCode = prime * hashCode + ((getIpGroupIds() == null) ? 0 : getIpGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceDirectory clone() {
        try {
            return (WorkspaceDirectory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspaceDirectoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
