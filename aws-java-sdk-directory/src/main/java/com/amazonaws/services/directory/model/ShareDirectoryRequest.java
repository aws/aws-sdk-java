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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ShareDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareDirectoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     */
    private String shareNotes;
    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory is to be shared.
     * </p>
     */
    private ShareTarget shareTarget;
    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing request (
     * <code>HANDSHAKE</code>).
     * </p>
     */
    private String shareMethod;

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     * </p>
     * 
     * @return Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDirectoryRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     * 
     * @param shareNotes
     *        A directory share request that is sent by the directory owner to the directory consumer. The request
     *        includes a typed message to help the directory consumer administrator determine whether to approve or
     *        reject the share invitation.
     */

    public void setShareNotes(String shareNotes) {
        this.shareNotes = shareNotes;
    }

    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     * 
     * @return A directory share request that is sent by the directory owner to the directory consumer. The request
     *         includes a typed message to help the directory consumer administrator determine whether to approve or
     *         reject the share invitation.
     */

    public String getShareNotes() {
        return this.shareNotes;
    }

    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     * 
     * @param shareNotes
     *        A directory share request that is sent by the directory owner to the directory consumer. The request
     *        includes a typed message to help the directory consumer administrator determine whether to approve or
     *        reject the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDirectoryRequest withShareNotes(String shareNotes) {
        setShareNotes(shareNotes);
        return this;
    }

    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory is to be shared.
     * </p>
     * 
     * @param shareTarget
     *        Identifier for the directory consumer account with whom the directory is to be shared.
     */

    public void setShareTarget(ShareTarget shareTarget) {
        this.shareTarget = shareTarget;
    }

    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory is to be shared.
     * </p>
     * 
     * @return Identifier for the directory consumer account with whom the directory is to be shared.
     */

    public ShareTarget getShareTarget() {
        return this.shareTarget;
    }

    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory is to be shared.
     * </p>
     * 
     * @param shareTarget
     *        Identifier for the directory consumer account with whom the directory is to be shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDirectoryRequest withShareTarget(ShareTarget shareTarget) {
        setShareTarget(shareTarget);
        return this;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @param shareMethod
     *        The method used when sharing a directory to determine whether the directory should be shared within your
     *        AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing
     *        request (<code>HANDSHAKE</code>).
     * @see ShareMethod
     */

    public void setShareMethod(String shareMethod) {
        this.shareMethod = shareMethod;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @return The method used when sharing a directory to determine whether the directory should be shared within your
     *         AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing
     *         request (<code>HANDSHAKE</code>).
     * @see ShareMethod
     */

    public String getShareMethod() {
        return this.shareMethod;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @param shareMethod
     *        The method used when sharing a directory to determine whether the directory should be shared within your
     *        AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing
     *        request (<code>HANDSHAKE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareMethod
     */

    public ShareDirectoryRequest withShareMethod(String shareMethod) {
        setShareMethod(shareMethod);
        return this;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @param shareMethod
     *        The method used when sharing a directory to determine whether the directory should be shared within your
     *        AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a directory sharing
     *        request (<code>HANDSHAKE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareMethod
     */

    public ShareDirectoryRequest withShareMethod(ShareMethod shareMethod) {
        this.shareMethod = shareMethod.toString();
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
        if (getShareNotes() != null)
            sb.append("ShareNotes: ").append("***Sensitive Data Redacted***").append(",");
        if (getShareTarget() != null)
            sb.append("ShareTarget: ").append(getShareTarget()).append(",");
        if (getShareMethod() != null)
            sb.append("ShareMethod: ").append(getShareMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareDirectoryRequest == false)
            return false;
        ShareDirectoryRequest other = (ShareDirectoryRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getShareNotes() == null ^ this.getShareNotes() == null)
            return false;
        if (other.getShareNotes() != null && other.getShareNotes().equals(this.getShareNotes()) == false)
            return false;
        if (other.getShareTarget() == null ^ this.getShareTarget() == null)
            return false;
        if (other.getShareTarget() != null && other.getShareTarget().equals(this.getShareTarget()) == false)
            return false;
        if (other.getShareMethod() == null ^ this.getShareMethod() == null)
            return false;
        if (other.getShareMethod() != null && other.getShareMethod().equals(this.getShareMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getShareNotes() == null) ? 0 : getShareNotes().hashCode());
        hashCode = prime * hashCode + ((getShareTarget() == null) ? 0 : getShareTarget().hashCode());
        hashCode = prime * hashCode + ((getShareMethod() == null) ? 0 : getShareMethod().hashCode());
        return hashCode;
    }

    @Override
    public ShareDirectoryRequest clone() {
        return (ShareDirectoryRequest) super.clone();
    }

}
