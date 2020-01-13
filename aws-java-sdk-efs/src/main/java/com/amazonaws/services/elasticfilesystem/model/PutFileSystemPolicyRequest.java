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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutFileSystemPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFileSystemPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To find out
     * more about the elements that make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check. The
     * policy lockout safety check determines whether the policy in the request will prevent the principal making the
     * request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to prevent the principal
     * that is making the request from making a subsequent <code>PutFileSystemPolicy</code> request on the file system.
     * The default value is False.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     * </p>
     * 
     * @return The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the EFS file system that you want to create or update the <code>FileSystemPolicy</code> for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileSystemPolicyRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To find out
     * more about the elements that make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     * 
     * @param policy
     *        The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To
     *        find out more about the elements that make up a file system policy, see <a href=
     *        "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *        >EFS Resource-based Policies</a>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To find out
     * more about the elements that make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     * 
     * @return The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To
     *         find out more about the elements that make up a file system policy, see <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *         >EFS Resource-based Policies</a>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To find out
     * more about the elements that make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     * 
     * @param policy
     *        The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON formatted policy definition. To
     *        find out more about the elements that make up a file system policy, see <a href=
     *        "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *        >EFS Resource-based Policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileSystemPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check. The
     * policy lockout safety check determines whether the policy in the request will prevent the principal making the
     * request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to prevent the principal
     * that is making the request from making a subsequent <code>PutFileSystemPolicy</code> request on the file system.
     * The default value is False.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check.
     *        The policy lockout safety check determines whether the policy in the request will prevent the principal
     *        making the request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the
     *        file system. Set <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to
     *        prevent the principal that is making the request from making a subsequent <code>PutFileSystemPolicy</code>
     *        request on the file system. The default value is False.
     */

    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check. The
     * policy lockout safety check determines whether the policy in the request will prevent the principal making the
     * request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to prevent the principal
     * that is making the request from making a subsequent <code>PutFileSystemPolicy</code> request on the file system.
     * The default value is False.
     * </p>
     * 
     * @return (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check.
     *         The policy lockout safety check determines whether the policy in the request will prevent the principal
     *         making the request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the
     *         file system. Set <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to
     *         prevent the principal that is making the request from making a subsequent
     *         <code>PutFileSystemPolicy</code> request on the file system. The default value is False.
     */

    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check. The
     * policy lockout safety check determines whether the policy in the request will prevent the principal making the
     * request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to prevent the principal
     * that is making the request from making a subsequent <code>PutFileSystemPolicy</code> request on the file system.
     * The default value is False.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check.
     *        The policy lockout safety check determines whether the policy in the request will prevent the principal
     *        making the request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the
     *        file system. Set <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to
     *        prevent the principal that is making the request from making a subsequent <code>PutFileSystemPolicy</code>
     *        request on the file system. The default value is False.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileSystemPolicyRequest withBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        setBypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck);
        return this;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check. The
     * policy lockout safety check determines whether the policy in the request will prevent the principal making the
     * request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to prevent the principal
     * that is making the request from making a subsequent <code>PutFileSystemPolicy</code> request on the file system.
     * The default value is False.
     * </p>
     * 
     * @return (Optional) A flag to indicate whether to bypass the <code>FileSystemPolicy</code> lockout safety check.
     *         The policy lockout safety check determines whether the policy in the request will prevent the principal
     *         making the request will be locked out from making future <code>PutFileSystemPolicy</code> requests on the
     *         file system. Set <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only when you intend to
     *         prevent the principal that is making the request from making a subsequent
     *         <code>PutFileSystemPolicy</code> request on the file system. The default value is False.
     */

    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
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
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: ").append(getBypassPolicyLockoutSafetyCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFileSystemPolicyRequest == false)
            return false;
        PutFileSystemPolicyRequest other = (PutFileSystemPolicyRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0 : getBypassPolicyLockoutSafetyCheck().hashCode());
        return hashCode;
    }

    @Override
    public PutFileSystemPolicyRequest clone() {
        return (PutFileSystemPolicyRequest) super.clone();
    }

}
