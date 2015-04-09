/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an AWS Directory Service directory for use
 * with Amazon WorkSpaces.
 * </p>
 */
public class WorkspaceDirectory implements Serializable, Cloneable {

    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     */
    private String directoryId;

    /**
     * The directory alias.
     */
    private String alias;

    /**
     * The name of the directory.
     */
    private String directoryName;

    /**
     * The registration code for the directory. This is the code that users
     * enter in their Amazon WorkSpaces client application to connect to the
     * directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     */
    private String registrationCode;

    /**
     * An array of strings that contains the identifiers of the subnets used
     * with the directory.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * An array of strings that contains the IP addresses of the DNS servers
     * for the directory.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsIpAddresses;

    /**
     * The user name for the service account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String customerUserName;

    /**
     * The identifier of the IAM role. This is the role that allows Amazon
     * WorkSpaces to make calls to other services, such as Amazon EC2, on
     * your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$<br/>
     */
    private String iamRoleId;

    /**
     * The directory type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIMPLE_AD, AD_CONNECTOR
     */
    private String directoryType;

    /**
     * The identifier of the security group that is assigned to new
     * WorkSpaces.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     */
    private String workspaceSecurityGroupId;

    /**
     * The state of the directory's registration with Amazon WorkSpaces
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR
     */
    private String state;

    /**
     * A structure that specifies the default creation properties for all
     * WorkSpaces in the directory.
     */
    private DefaultWorkspaceCreationProperties workspaceCreationProperties;

    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @return The directory identifier.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @param directoryId The directory identifier.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The directory identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @param directoryId The directory identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The directory alias.
     *
     * @return The directory alias.
     */
    public String getAlias() {
        return alias;
    }
    
    /**
     * The directory alias.
     *
     * @param alias The directory alias.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    /**
     * The directory alias.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alias The directory alias.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * The name of the directory.
     *
     * @return The name of the directory.
     */
    public String getDirectoryName() {
        return directoryName;
    }
    
    /**
     * The name of the directory.
     *
     * @param directoryName The name of the directory.
     */
    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }
    
    /**
     * The name of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param directoryName The name of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }

    /**
     * The registration code for the directory. This is the code that users
     * enter in their Amazon WorkSpaces client application to connect to the
     * directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @return The registration code for the directory. This is the code that users
     *         enter in their Amazon WorkSpaces client application to connect to the
     *         directory.
     */
    public String getRegistrationCode() {
        return registrationCode;
    }
    
    /**
     * The registration code for the directory. This is the code that users
     * enter in their Amazon WorkSpaces client application to connect to the
     * directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param registrationCode The registration code for the directory. This is the code that users
     *         enter in their Amazon WorkSpaces client application to connect to the
     *         directory.
     */
    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }
    
    /**
     * The registration code for the directory. This is the code that users
     * enter in their Amazon WorkSpaces client application to connect to the
     * directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param registrationCode The registration code for the directory. This is the code that users
     *         enter in their Amazon WorkSpaces client application to connect to the
     *         directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
        return this;
    }

    /**
     * An array of strings that contains the identifiers of the subnets used
     * with the directory.
     *
     * @return An array of strings that contains the identifiers of the subnets used
     *         with the directory.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * An array of strings that contains the identifiers of the subnets used
     * with the directory.
     *
     * @param subnetIds An array of strings that contains the identifiers of the subnets used
     *         with the directory.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * An array of strings that contains the identifiers of the subnets used
     * with the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds An array of strings that contains the identifiers of the subnets used
     *         with the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that contains the identifiers of the subnets used
     * with the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds An array of strings that contains the identifiers of the subnets used
     *         with the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
        }

        return this;
    }

    /**
     * An array of strings that contains the IP addresses of the DNS servers
     * for the directory.
     *
     * @return An array of strings that contains the IP addresses of the DNS servers
     *         for the directory.
     */
    public java.util.List<String> getDnsIpAddresses() {
        if (dnsIpAddresses == null) {
              dnsIpAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dnsIpAddresses.setAutoConstruct(true);
        }
        return dnsIpAddresses;
    }
    
    /**
     * An array of strings that contains the IP addresses of the DNS servers
     * for the directory.
     *
     * @param dnsIpAddresses An array of strings that contains the IP addresses of the DNS servers
     *         for the directory.
     */
    public void setDnsIpAddresses(java.util.Collection<String> dnsIpAddresses) {
        if (dnsIpAddresses == null) {
            this.dnsIpAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsIpAddresses.size());
        dnsIpAddressesCopy.addAll(dnsIpAddresses);
        this.dnsIpAddresses = dnsIpAddressesCopy;
    }
    
    /**
     * An array of strings that contains the IP addresses of the DNS servers
     * for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsIpAddresses An array of strings that contains the IP addresses of the DNS servers
     *         for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withDnsIpAddresses(String... dnsIpAddresses) {
        if (getDnsIpAddresses() == null) setDnsIpAddresses(new java.util.ArrayList<String>(dnsIpAddresses.length));
        for (String value : dnsIpAddresses) {
            getDnsIpAddresses().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that contains the IP addresses of the DNS servers
     * for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsIpAddresses An array of strings that contains the IP addresses of the DNS servers
     *         for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withDnsIpAddresses(java.util.Collection<String> dnsIpAddresses) {
        if (dnsIpAddresses == null) {
            this.dnsIpAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsIpAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsIpAddresses.size());
            dnsIpAddressesCopy.addAll(dnsIpAddresses);
            this.dnsIpAddresses = dnsIpAddressesCopy;
        }

        return this;
    }

    /**
     * The user name for the service account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return The user name for the service account.
     */
    public String getCustomerUserName() {
        return customerUserName;
    }
    
    /**
     * The user name for the service account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param customerUserName The user name for the service account.
     */
    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }
    
    /**
     * The user name for the service account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param customerUserName The user name for the service account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
        return this;
    }

    /**
     * The identifier of the IAM role. This is the role that allows Amazon
     * WorkSpaces to make calls to other services, such as Amazon EC2, on
     * your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$<br/>
     *
     * @return The identifier of the IAM role. This is the role that allows Amazon
     *         WorkSpaces to make calls to other services, such as Amazon EC2, on
     *         your behalf.
     */
    public String getIamRoleId() {
        return iamRoleId;
    }
    
    /**
     * The identifier of the IAM role. This is the role that allows Amazon
     * WorkSpaces to make calls to other services, such as Amazon EC2, on
     * your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$<br/>
     *
     * @param iamRoleId The identifier of the IAM role. This is the role that allows Amazon
     *         WorkSpaces to make calls to other services, such as Amazon EC2, on
     *         your behalf.
     */
    public void setIamRoleId(String iamRoleId) {
        this.iamRoleId = iamRoleId;
    }
    
    /**
     * The identifier of the IAM role. This is the role that allows Amazon
     * WorkSpaces to make calls to other services, such as Amazon EC2, on
     * your behalf.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$<br/>
     *
     * @param iamRoleId The identifier of the IAM role. This is the role that allows Amazon
     *         WorkSpaces to make calls to other services, such as Amazon EC2, on
     *         your behalf.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withIamRoleId(String iamRoleId) {
        this.iamRoleId = iamRoleId;
        return this;
    }

    /**
     * The directory type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIMPLE_AD, AD_CONNECTOR
     *
     * @return The directory type.
     *
     * @see WorkspaceDirectoryType
     */
    public String getDirectoryType() {
        return directoryType;
    }
    
    /**
     * The directory type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIMPLE_AD, AD_CONNECTOR
     *
     * @param directoryType The directory type.
     *
     * @see WorkspaceDirectoryType
     */
    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }
    
    /**
     * The directory type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIMPLE_AD, AD_CONNECTOR
     *
     * @param directoryType The directory type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see WorkspaceDirectoryType
     */
    public WorkspaceDirectory withDirectoryType(String directoryType) {
        this.directoryType = directoryType;
        return this;
    }

    /**
     * The directory type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIMPLE_AD, AD_CONNECTOR
     *
     * @param directoryType The directory type.
     *
     * @see WorkspaceDirectoryType
     */
    public void setDirectoryType(WorkspaceDirectoryType directoryType) {
        this.directoryType = directoryType.toString();
    }
    
    /**
     * The directory type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIMPLE_AD, AD_CONNECTOR
     *
     * @param directoryType The directory type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see WorkspaceDirectoryType
     */
    public WorkspaceDirectory withDirectoryType(WorkspaceDirectoryType directoryType) {
        this.directoryType = directoryType.toString();
        return this;
    }

    /**
     * The identifier of the security group that is assigned to new
     * WorkSpaces.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of the security group that is assigned to new
     *         WorkSpaces.
     */
    public String getWorkspaceSecurityGroupId() {
        return workspaceSecurityGroupId;
    }
    
    /**
     * The identifier of the security group that is assigned to new
     * WorkSpaces.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param workspaceSecurityGroupId The identifier of the security group that is assigned to new
     *         WorkSpaces.
     */
    public void setWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }
    
    /**
     * The identifier of the security group that is assigned to new
     * WorkSpaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param workspaceSecurityGroupId The identifier of the security group that is assigned to new
     *         WorkSpaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
        return this;
    }

    /**
     * The state of the directory's registration with Amazon WorkSpaces
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR
     *
     * @return The state of the directory's registration with Amazon WorkSpaces
     *
     * @see WorkspaceDirectoryState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the directory's registration with Amazon WorkSpaces
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR
     *
     * @param state The state of the directory's registration with Amazon WorkSpaces
     *
     * @see WorkspaceDirectoryState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the directory's registration with Amazon WorkSpaces
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR
     *
     * @param state The state of the directory's registration with Amazon WorkSpaces
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see WorkspaceDirectoryState
     */
    public WorkspaceDirectory withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the directory's registration with Amazon WorkSpaces
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR
     *
     * @param state The state of the directory's registration with Amazon WorkSpaces
     *
     * @see WorkspaceDirectoryState
     */
    public void setState(WorkspaceDirectoryState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the directory's registration with Amazon WorkSpaces
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR
     *
     * @param state The state of the directory's registration with Amazon WorkSpaces
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see WorkspaceDirectoryState
     */
    public WorkspaceDirectory withState(WorkspaceDirectoryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * A structure that specifies the default creation properties for all
     * WorkSpaces in the directory.
     *
     * @return A structure that specifies the default creation properties for all
     *         WorkSpaces in the directory.
     */
    public DefaultWorkspaceCreationProperties getWorkspaceCreationProperties() {
        return workspaceCreationProperties;
    }
    
    /**
     * A structure that specifies the default creation properties for all
     * WorkSpaces in the directory.
     *
     * @param workspaceCreationProperties A structure that specifies the default creation properties for all
     *         WorkSpaces in the directory.
     */
    public void setWorkspaceCreationProperties(DefaultWorkspaceCreationProperties workspaceCreationProperties) {
        this.workspaceCreationProperties = workspaceCreationProperties;
    }
    
    /**
     * A structure that specifies the default creation properties for all
     * WorkSpaces in the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workspaceCreationProperties A structure that specifies the default creation properties for all
     *         WorkSpaces in the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceDirectory withWorkspaceCreationProperties(DefaultWorkspaceCreationProperties workspaceCreationProperties) {
        this.workspaceCreationProperties = workspaceCreationProperties;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getAlias() != null) sb.append("Alias: " + getAlias() + ",");
        if (getDirectoryName() != null) sb.append("DirectoryName: " + getDirectoryName() + ",");
        if (getRegistrationCode() != null) sb.append("RegistrationCode: " + getRegistrationCode() + ",");
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getDnsIpAddresses() != null) sb.append("DnsIpAddresses: " + getDnsIpAddresses() + ",");
        if (getCustomerUserName() != null) sb.append("CustomerUserName: " + getCustomerUserName() + ",");
        if (getIamRoleId() != null) sb.append("IamRoleId: " + getIamRoleId() + ",");
        if (getDirectoryType() != null) sb.append("DirectoryType: " + getDirectoryType() + ",");
        if (getWorkspaceSecurityGroupId() != null) sb.append("WorkspaceSecurityGroupId: " + getWorkspaceSecurityGroupId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getWorkspaceCreationProperties() != null) sb.append("WorkspaceCreationProperties: " + getWorkspaceCreationProperties() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkspaceDirectory == false) return false;
        WorkspaceDirectory other = (WorkspaceDirectory)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getAlias() == null ^ this.getAlias() == null) return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false) return false; 
        if (other.getDirectoryName() == null ^ this.getDirectoryName() == null) return false;
        if (other.getDirectoryName() != null && other.getDirectoryName().equals(this.getDirectoryName()) == false) return false; 
        if (other.getRegistrationCode() == null ^ this.getRegistrationCode() == null) return false;
        if (other.getRegistrationCode() != null && other.getRegistrationCode().equals(this.getRegistrationCode()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getDnsIpAddresses() == null ^ this.getDnsIpAddresses() == null) return false;
        if (other.getDnsIpAddresses() != null && other.getDnsIpAddresses().equals(this.getDnsIpAddresses()) == false) return false; 
        if (other.getCustomerUserName() == null ^ this.getCustomerUserName() == null) return false;
        if (other.getCustomerUserName() != null && other.getCustomerUserName().equals(this.getCustomerUserName()) == false) return false; 
        if (other.getIamRoleId() == null ^ this.getIamRoleId() == null) return false;
        if (other.getIamRoleId() != null && other.getIamRoleId().equals(this.getIamRoleId()) == false) return false; 
        if (other.getDirectoryType() == null ^ this.getDirectoryType() == null) return false;
        if (other.getDirectoryType() != null && other.getDirectoryType().equals(this.getDirectoryType()) == false) return false; 
        if (other.getWorkspaceSecurityGroupId() == null ^ this.getWorkspaceSecurityGroupId() == null) return false;
        if (other.getWorkspaceSecurityGroupId() != null && other.getWorkspaceSecurityGroupId().equals(this.getWorkspaceSecurityGroupId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getWorkspaceCreationProperties() == null ^ this.getWorkspaceCreationProperties() == null) return false;
        if (other.getWorkspaceCreationProperties() != null && other.getWorkspaceCreationProperties().equals(this.getWorkspaceCreationProperties()) == false) return false; 
        return true;
    }
    
    @Override
    public WorkspaceDirectory clone() {
        try {
            return (WorkspaceDirectory) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    