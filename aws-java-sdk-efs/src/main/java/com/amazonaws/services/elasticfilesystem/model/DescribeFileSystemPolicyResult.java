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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystemPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     * </p>
     * 
     * @return Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies the EFS file system to which the <code>FileSystemPolicy</code> applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemPolicyResult withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     * </p>
     * 
     * @param policy
     *        The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     * </p>
     * 
     * @return The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     * </p>
     * 
     * @param policy
     *        The JSON formatted <code>FileSystemPolicy</code> for the EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemPolicyResult withPolicy(String policy) {
        setPolicy(policy);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemPolicyResult == false)
            return false;
        DescribeFileSystemPolicyResult other = (DescribeFileSystemPolicyResult) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemPolicyResult clone() {
        try {
            return (DescribeFileSystemPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
