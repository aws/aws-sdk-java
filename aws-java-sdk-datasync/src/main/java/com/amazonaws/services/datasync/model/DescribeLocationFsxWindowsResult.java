/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxWindows"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationFsxWindowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URL of the FSx for Windows location that was described.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file
     * system.
     * </p>
     */
    private java.util.List<String> securityGroupArns;
    /**
     * <p>
     * The time that the FSx for Windows location was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     * </p>
     * 
     * @return The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the FSx for Windows location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URL of the FSx for Windows location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the FSx for Windows location that was described.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URL of the FSx for Windows location that was described.
     * </p>
     * 
     * @return The URL of the FSx for Windows location that was described.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URL of the FSx for Windows location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the FSx for Windows location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file
     * system.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for
     *         Windows file system.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file
     * system.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for
     *        Windows file system.
     */

    public void setSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        if (securityGroupArns == null) {
            this.securityGroupArns = null;
            return;
        }

        this.securityGroupArns = new java.util.ArrayList<String>(securityGroupArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file
     * system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for
     *        Windows file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withSecurityGroupArns(String... securityGroupArns) {
        if (this.securityGroupArns == null) {
            setSecurityGroupArns(new java.util.ArrayList<String>(securityGroupArns.length));
        }
        for (String ele : securityGroupArns) {
            this.securityGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file
     * system.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for
     *        Windows file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
        return this;
    }

    /**
     * <p>
     * The time that the FSx for Windows location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the FSx for Windows location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the FSx for Windows location was created.
     * </p>
     * 
     * @return The time that the FSx for Windows location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the FSx for Windows location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the FSx for Windows location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @param user
     *        The user who has the permissions to access files and folders in the FSx for Windows file system.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @return The user who has the permissions to access files and folders in the FSx for Windows file system.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @param user
     *        The user who has the permissions to access files and folders in the FSx for Windows file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the Windows domain that the FSx for Windows server belongs to.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     * 
     * @return The name of the Windows domain that the FSx for Windows server belongs to.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the Windows domain that the FSx for Windows server belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxWindowsResult withDomain(String domain) {
        setDomain(domain);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationFsxWindowsResult == false)
            return false;
        DescribeLocationFsxWindowsResult other = (DescribeLocationFsxWindowsResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationFsxWindowsResult clone() {
        try {
            return (DescribeLocationFsxWindowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
