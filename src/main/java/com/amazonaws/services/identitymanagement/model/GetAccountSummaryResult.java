/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the GetAccountSummary action.
 * </p>
 */
public class GetAccountSummaryResult implements Serializable {

    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per user</li>
     * <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     * MFA device assigned to it, 0 otherwise</li>
     * <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     * for assume role policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     * - Number of Groups for the AWS account</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     * groups allowed for the AWS account</li>
     * <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     * the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     * Maximum instance profiles allowed for the AWS account</li>
     * <li><p><code>MFADevices</code> - Number of MFA devices, either
     * assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     * Number of MFA devices that have been assigned to an IAM user or to the
     * root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     * allowed size for role policy documents (in kilobytes) </li>
     * <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     * <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     * account</li> <li><p><code>ServerCertificates</code> - Number of server
     * certificates for the AWS account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum server
     * certificates allowed for the AWS account</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     * Number of users for the AWS account</li>
     * <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     * account</li> </ul>
     */
    private java.util.Map<String,Integer> summaryMap;

    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per user</li>
     * <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     * MFA device assigned to it, 0 otherwise</li>
     * <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     * for assume role policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     * - Number of Groups for the AWS account</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     * groups allowed for the AWS account</li>
     * <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     * the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     * Maximum instance profiles allowed for the AWS account</li>
     * <li><p><code>MFADevices</code> - Number of MFA devices, either
     * assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     * Number of MFA devices that have been assigned to an IAM user or to the
     * root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     * allowed size for role policy documents (in kilobytes) </li>
     * <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     * <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     * account</li> <li><p><code>ServerCertificates</code> - Number of server
     * certificates for the AWS account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum server
     * certificates allowed for the AWS account</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     * Number of users for the AWS account</li>
     * <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     * account</li> </ul>
     *
     * @return A set of key value pairs containing account-level information. <p>
     *         <code>SummaryMap</code> contains the following keys: <ul>
     *         <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     *         keys that can be created per user</li>
     *         <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     *         MFA device assigned to it, 0 otherwise</li>
     *         <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     *         for assume role policy documents (in kilobytes) </li>
     *         <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     *         Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     *         - Number of Groups for the AWS account</li>
     *         <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     *         user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     *         groups allowed for the AWS account</li>
     *         <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     *         the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     *         Maximum instance profiles allowed for the AWS account</li>
     *         <li><p><code>MFADevices</code> - Number of MFA devices, either
     *         assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     *         Number of MFA devices that have been assigned to an IAM user or to the
     *         root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     *         allowed size for role policy documents (in kilobytes) </li>
     *         <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     *         <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     *         account</li> <li><p><code>ServerCertificates</code> - Number of server
     *         certificates for the AWS account</li>
     *         <li><p><code>ServerCertificatesQuota</code> - Maximum server
     *         certificates allowed for the AWS account</li>
     *         <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     *         of X509 certificates allowed for a user</li>
     *         <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     *         user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     *         Number of users for the AWS account</li>
     *         <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     *         account</li> </ul>
     */
    public java.util.Map<String,Integer> getSummaryMap() {
        
        if (summaryMap == null) {
            summaryMap = new java.util.HashMap<String,Integer>();
        }
        return summaryMap;
    }
    
    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per user</li>
     * <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     * MFA device assigned to it, 0 otherwise</li>
     * <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     * for assume role policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     * - Number of Groups for the AWS account</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     * groups allowed for the AWS account</li>
     * <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     * the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     * Maximum instance profiles allowed for the AWS account</li>
     * <li><p><code>MFADevices</code> - Number of MFA devices, either
     * assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     * Number of MFA devices that have been assigned to an IAM user or to the
     * root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     * allowed size for role policy documents (in kilobytes) </li>
     * <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     * <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     * account</li> <li><p><code>ServerCertificates</code> - Number of server
     * certificates for the AWS account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum server
     * certificates allowed for the AWS account</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     * Number of users for the AWS account</li>
     * <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     * account</li> </ul>
     *
     * @param summaryMap A set of key value pairs containing account-level information. <p>
     *         <code>SummaryMap</code> contains the following keys: <ul>
     *         <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     *         keys that can be created per user</li>
     *         <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     *         MFA device assigned to it, 0 otherwise</li>
     *         <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     *         for assume role policy documents (in kilobytes) </li>
     *         <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     *         Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     *         - Number of Groups for the AWS account</li>
     *         <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     *         user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     *         groups allowed for the AWS account</li>
     *         <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     *         the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     *         Maximum instance profiles allowed for the AWS account</li>
     *         <li><p><code>MFADevices</code> - Number of MFA devices, either
     *         assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     *         Number of MFA devices that have been assigned to an IAM user or to the
     *         root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     *         allowed size for role policy documents (in kilobytes) </li>
     *         <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     *         <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     *         account</li> <li><p><code>ServerCertificates</code> - Number of server
     *         certificates for the AWS account</li>
     *         <li><p><code>ServerCertificatesQuota</code> - Maximum server
     *         certificates allowed for the AWS account</li>
     *         <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     *         of X509 certificates allowed for a user</li>
     *         <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     *         user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     *         Number of users for the AWS account</li>
     *         <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     *         account</li> </ul>
     */
    public void setSummaryMap(java.util.Map<String,Integer> summaryMap) {
        this.summaryMap = summaryMap;
    }
    
    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per user</li>
     * <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     * MFA device assigned to it, 0 otherwise</li>
     * <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     * for assume role policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     * - Number of Groups for the AWS account</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     * groups allowed for the AWS account</li>
     * <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     * the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     * Maximum instance profiles allowed for the AWS account</li>
     * <li><p><code>MFADevices</code> - Number of MFA devices, either
     * assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     * Number of MFA devices that have been assigned to an IAM user or to the
     * root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     * allowed size for role policy documents (in kilobytes) </li>
     * <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     * <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     * account</li> <li><p><code>ServerCertificates</code> - Number of server
     * certificates for the AWS account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum server
     * certificates allowed for the AWS account</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     * Number of users for the AWS account</li>
     * <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     * account</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaryMap A set of key value pairs containing account-level information. <p>
     *         <code>SummaryMap</code> contains the following keys: <ul>
     *         <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     *         keys that can be created per user</li>
     *         <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     *         MFA device assigned to it, 0 otherwise</li>
     *         <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     *         for assume role policy documents (in kilobytes) </li>
     *         <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     *         Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     *         - Number of Groups for the AWS account</li>
     *         <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     *         user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     *         groups allowed for the AWS account</li>
     *         <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     *         the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     *         Maximum instance profiles allowed for the AWS account</li>
     *         <li><p><code>MFADevices</code> - Number of MFA devices, either
     *         assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     *         Number of MFA devices that have been assigned to an IAM user or to the
     *         root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     *         allowed size for role policy documents (in kilobytes) </li>
     *         <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     *         <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     *         account</li> <li><p><code>ServerCertificates</code> - Number of server
     *         certificates for the AWS account</li>
     *         <li><p><code>ServerCertificatesQuota</code> - Maximum server
     *         certificates allowed for the AWS account</li>
     *         <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     *         of X509 certificates allowed for a user</li>
     *         <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     *         user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     *         Number of users for the AWS account</li>
     *         <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     *         account</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetAccountSummaryResult withSummaryMap(java.util.Map<String,Integer> summaryMap) {
        setSummaryMap(summaryMap);
        return this;
    }

    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per user</li>
     * <li><p><code>AccountMFAEnabled</code> - 1 if the root account has an
     * MFA device assigned to it, 0 otherwise</li>
     * <li><p><code>AssumeRolePolicySizeQuota</code> - Maximum allowed size
     * for assume role policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobytes)</li> <li><p><code>Groups</code>
     * - Number of Groups for the AWS account</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * user can belong to</li> <li><p><code>GroupsQuota</code> - Maximum
     * groups allowed for the AWS account</li>
     * <li><p><code>InstanceProfiles</code> - Number of instance profiles for
     * the AWS account</li> <li><p><code>InstanceProfilesQuota</code> -
     * Maximum instance profiles allowed for the AWS account</li>
     * <li><p><code>MFADevices</code> - Number of MFA devices, either
     * assigned or unassigned</li> <li><p><code>MFADevicesInUse</code> -
     * Number of MFA devices that have been assigned to an IAM user or to the
     * root account</li> <li><p><code>RolePolicySizeQuota</code> - Maximum
     * allowed size for role policy documents (in kilobytes) </li>
     * <li><p><code>Roles</code> - Number of roles for the AWS account</li>
     * <li><p><code>RolesQuota</code> - Maximum roles allowed for the AWS
     * account</li> <li><p><code>ServerCertificates</code> - Number of server
     * certificates for the AWS account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum server
     * certificates allowed for the AWS account</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * user policy documents (in kilobytes) </li> <li><p><code>Users</code> -
     * Number of users for the AWS account</li>
     * <li><p><code>UsersQuota</code> - Maximum users allowed for the AWS
     * account</li> </ul>
     * <p>
     * The method adds a new key-value pair into SummaryMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into SummaryMap.
     * @param value The corresponding value of the entry to be added into SummaryMap.
     */
	public GetAccountSummaryResult addSummaryMapEntry(String key, Integer value) {
		if (null == this.summaryMap) {
			this.summaryMap = new java.util.HashMap<String,Integer>();
		}
		if (this.summaryMap.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.summaryMap.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into SummaryMap.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public GetAccountSummaryResult clearSummaryMapEntries() {
		this.summaryMap = null;
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
        if (getSummaryMap() != null) sb.append("SummaryMap: " + getSummaryMap() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSummaryMap() == null) ? 0 : getSummaryMap().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccountSummaryResult == false) return false;
        GetAccountSummaryResult other = (GetAccountSummaryResult)obj;
        
        if (other.getSummaryMap() == null ^ this.getSummaryMap() == null) return false;
        if (other.getSummaryMap() != null && other.getSummaryMap().equals(this.getSummaryMap()) == false) return false; 
        return true;
    }
    
}
    