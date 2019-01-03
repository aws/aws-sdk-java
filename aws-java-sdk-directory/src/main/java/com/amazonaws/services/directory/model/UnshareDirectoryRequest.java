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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UnshareDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnshareDirectoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory has to be unshared.
     * </p>
     */
    private UnshareTarget unshareTarget;

    /**
     * <p>
     * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     * </p>
     * 
     * @return The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnshareDirectoryRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory has to be unshared.
     * </p>
     * 
     * @param unshareTarget
     *        Identifier for the directory consumer account with whom the directory has to be unshared.
     */

    public void setUnshareTarget(UnshareTarget unshareTarget) {
        this.unshareTarget = unshareTarget;
    }

    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory has to be unshared.
     * </p>
     * 
     * @return Identifier for the directory consumer account with whom the directory has to be unshared.
     */

    public UnshareTarget getUnshareTarget() {
        return this.unshareTarget;
    }

    /**
     * <p>
     * Identifier for the directory consumer account with whom the directory has to be unshared.
     * </p>
     * 
     * @param unshareTarget
     *        Identifier for the directory consumer account with whom the directory has to be unshared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnshareDirectoryRequest withUnshareTarget(UnshareTarget unshareTarget) {
        setUnshareTarget(unshareTarget);
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
        if (getUnshareTarget() != null)
            sb.append("UnshareTarget: ").append(getUnshareTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnshareDirectoryRequest == false)
            return false;
        UnshareDirectoryRequest other = (UnshareDirectoryRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUnshareTarget() == null ^ this.getUnshareTarget() == null)
            return false;
        if (other.getUnshareTarget() != null && other.getUnshareTarget().equals(this.getUnshareTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getUnshareTarget() == null) ? 0 : getUnshareTarget().hashCode());
        return hashCode;
    }

    @Override
    public UnshareDirectoryRequest clone() {
        return (UnshareDirectoryRequest) super.clone();
    }

}
