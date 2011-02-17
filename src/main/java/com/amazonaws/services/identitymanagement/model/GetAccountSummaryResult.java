/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * GetAccountSummary action.
 * </p>
 */
public class GetAccountSummaryResult {

    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     * <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     * Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     * Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     * for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     * Number of Server Certificates for the AWS Account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     * Certificates allowed for the AWS Account</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * User policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobyes)</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * User can belong to</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per User</li> </ul>
     */
    private java.util.Map<String,Integer> summaryMap;

    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     * <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     * Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     * Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     * for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     * Number of Server Certificates for the AWS Account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     * Certificates allowed for the AWS Account</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * User policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobyes)</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * User can belong to</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per User</li> </ul>
     *
     * @return A set of key value pairs containing account-level information. <p>
     *         <code>SummaryMap</code> contains the following keys: <ul>
     *         <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     *         <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     *         Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     *         Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     *         for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     *         Number of Server Certificates for the AWS Account</li>
     *         <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     *         Certificates allowed for the AWS Account</li>
     *         <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     *         User policy documents (in kilobytes) </li>
     *         <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     *         Group policy documents (in kilobyes)</li>
     *         <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     *         User can belong to</li>
     *         <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     *         of X509 certificates allowed for a user</li>
     *         <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     *         keys that can be created per User</li> </ul>
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
     * <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     * <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     * Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     * Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     * for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     * Number of Server Certificates for the AWS Account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     * Certificates allowed for the AWS Account</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * User policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobyes)</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * User can belong to</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per User</li> </ul>
     *
     * @param summaryMap A set of key value pairs containing account-level information. <p>
     *         <code>SummaryMap</code> contains the following keys: <ul>
     *         <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     *         <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     *         Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     *         Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     *         for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     *         Number of Server Certificates for the AWS Account</li>
     *         <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     *         Certificates allowed for the AWS Account</li>
     *         <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     *         User policy documents (in kilobytes) </li>
     *         <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     *         Group policy documents (in kilobyes)</li>
     *         <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     *         User can belong to</li>
     *         <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     *         of X509 certificates allowed for a user</li>
     *         <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     *         keys that can be created per User</li> </ul>
     */
    public void setSummaryMap(java.util.Map<String,Integer> summaryMap) {
        this.summaryMap = summaryMap;
    }
    
    /**
     * A set of key value pairs containing account-level information. <p>
     * <code>SummaryMap</code> contains the following keys: <ul>
     * <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     * <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     * Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     * Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     * for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     * Number of Server Certificates for the AWS Account</li>
     * <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     * Certificates allowed for the AWS Account</li>
     * <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     * User policy documents (in kilobytes) </li>
     * <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     * Group policy documents (in kilobyes)</li>
     * <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     * User can belong to</li>
     * <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     * of X509 certificates allowed for a user</li>
     * <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     * keys that can be created per User</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaryMap A set of key value pairs containing account-level information. <p>
     *         <code>SummaryMap</code> contains the following keys: <ul>
     *         <li><p><code>Users</code> - Number of Users for the AWS Account</li>
     *         <li><p><code>UsersQuota</code> - Maximum Users allowed for the AWS
     *         Account</li> <li><p><code>Groups</code> - Number of Groups for the AWS
     *         Account</li> <li><p><code>GroupsQuota</code> - Maximum Groups allowed
     *         for the AWS Account</li> <li><p><code>ServerCertificates</code> -
     *         Number of Server Certificates for the AWS Account</li>
     *         <li><p><code>ServerCertificatesQuota</code> - Maximum Server
     *         Certificates allowed for the AWS Account</li>
     *         <li><p><code>UserPolicySizeQuota</code> - Maximum allowed size for
     *         User policy documents (in kilobytes) </li>
     *         <li><p><code>GroupPolicySizeQuota</code> - Maximum allowed size for
     *         Group policy documents (in kilobyes)</li>
     *         <li><p><code>GroupsPerUserQuota</code> - Maximum number of groups a
     *         User can belong to</li>
     *         <li><p><code>SigningCertificatesPerUserQuota</code> - Maximum number
     *         of X509 certificates allowed for a user</li>
     *         <li><p><code>AccessKeysPerUserQuota</code> - Maximum number of access
     *         keys that can be created per User</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAccountSummaryResult withSummaryMap(java.util.Map<String,Integer> summaryMap) {
        setSummaryMap(summaryMap);
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
        sb.append("SummaryMap: " + summaryMap + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    