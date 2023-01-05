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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOpenZfs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationFsxOpenZfsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the FSx for OpenZFS location that was described.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.
     * </p>
     * <p>
     * Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * </p>
     */
    private java.util.List<String> securityGroupArns;
    /**
     * <p>
     * The type of protocol that DataSync uses to access your file system.
     * </p>
     */
    private FsxProtocol protocol;
    /**
     * <p>
     * The time that the FSx for OpenZFS location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ARN of the FSx for OpenZFS location that was described.
     * </p>
     * 
     * @param locationArn
     *        The ARN of the FSx for OpenZFS location that was described.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The ARN of the FSx for OpenZFS location that was described.
     * </p>
     * 
     * @return The ARN of the FSx for OpenZFS location that was described.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The ARN of the FSx for OpenZFS location that was described.
     * </p>
     * 
     * @param locationArn
     *        The ARN of the FSx for OpenZFS location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOpenZfsResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.
     * </p>
     * <p>
     * Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     * </p>
     * 
     * @param locationUri
     *        The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.</p>
     *        <p>
     *        Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.
     * </p>
     * <p>
     * Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     * </p>
     * 
     * @return The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.</p>
     *         <p>
     *         Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.
     * </p>
     * <p>
     * Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     * </p>
     * 
     * @param locationUri
     *        The uniform resource identifier (URI) of the FSx for OpenZFS location that was described.</p>
     *        <p>
     *        Example: <code>fsxz://us-west-2.fs-1234567890abcdef02/fsx/folderA/folder</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOpenZfsResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * </p>
     * 
     * @return The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * </p>
     * 
     * @param securityGroupArns
     *        The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
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
     * The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOpenZfsResult withSecurityGroupArns(String... securityGroupArns) {
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
     * The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * </p>
     * 
     * @param securityGroupArns
     *        The ARNs of the security groups that are configured for the FSx for OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOpenZfsResult withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
        return this;
    }

    /**
     * <p>
     * The type of protocol that DataSync uses to access your file system.
     * </p>
     * 
     * @param protocol
     *        The type of protocol that DataSync uses to access your file system.
     */

    public void setProtocol(FsxProtocol protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The type of protocol that DataSync uses to access your file system.
     * </p>
     * 
     * @return The type of protocol that DataSync uses to access your file system.
     */

    public FsxProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The type of protocol that DataSync uses to access your file system.
     * </p>
     * 
     * @param protocol
     *        The type of protocol that DataSync uses to access your file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOpenZfsResult withProtocol(FsxProtocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The time that the FSx for OpenZFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the FSx for OpenZFS location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the FSx for OpenZFS location was created.
     * </p>
     * 
     * @return The time that the FSx for OpenZFS location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the FSx for OpenZFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the FSx for OpenZFS location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOpenZfsResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationFsxOpenZfsResult == false)
            return false;
        DescribeLocationFsxOpenZfsResult other = (DescribeLocationFsxOpenZfsResult) obj;
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
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationFsxOpenZfsResult clone() {
        try {
            return (DescribeLocationFsxOpenZfsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
