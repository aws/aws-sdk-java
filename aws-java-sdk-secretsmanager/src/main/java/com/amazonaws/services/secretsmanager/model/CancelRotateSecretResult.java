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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/CancelRotateSecret" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelRotateSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret for which rotation was canceled.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret for which rotation was canceled.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the version of the secret that was created during the rotation. This version might not
     * be complete, and should be evaluated for possible deletion. At the very least, you should remove the
     * <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted. Failing to clean up
     * a cancelled rotation can block you from successfully starting future rotations.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The ARN of the secret for which rotation was canceled.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret for which rotation was canceled.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret for which rotation was canceled.
     * </p>
     * 
     * @return The ARN of the secret for which rotation was canceled.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret for which rotation was canceled.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret for which rotation was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelRotateSecretResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret for which rotation was canceled.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret for which rotation was canceled.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret for which rotation was canceled.
     * </p>
     * 
     * @return The friendly name of the secret for which rotation was canceled.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret for which rotation was canceled.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret for which rotation was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelRotateSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret that was created during the rotation. This version might not
     * be complete, and should be evaluated for possible deletion. At the very least, you should remove the
     * <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted. Failing to clean up
     * a cancelled rotation can block you from successfully starting future rotations.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of the version of the secret that was created during the rotation. This version
     *        might not be complete, and should be evaluated for possible deletion. At the very least, you should remove
     *        the <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted. Failing
     *        to clean up a cancelled rotation can block you from successfully starting future rotations.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret that was created during the rotation. This version might not
     * be complete, and should be evaluated for possible deletion. At the very least, you should remove the
     * <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted. Failing to clean up
     * a cancelled rotation can block you from successfully starting future rotations.
     * </p>
     * 
     * @return The unique identifier of the version of the secret that was created during the rotation. This version
     *         might not be complete, and should be evaluated for possible deletion. At the very least, you should
     *         remove the <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted.
     *         Failing to clean up a cancelled rotation can block you from successfully starting future rotations.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret that was created during the rotation. This version might not
     * be complete, and should be evaluated for possible deletion. At the very least, you should remove the
     * <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted. Failing to clean up
     * a cancelled rotation can block you from successfully starting future rotations.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of the version of the secret that was created during the rotation. This version
     *        might not be complete, and should be evaluated for possible deletion. At the very least, you should remove
     *        the <code>VersionStage</code> value <code>AWSPENDING</code> to enable this version to be deleted. Failing
     *        to clean up a cancelled rotation can block you from successfully starting future rotations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelRotateSecretResult withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelRotateSecretResult == false)
            return false;
        CancelRotateSecretResult other = (CancelRotateSecretResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public CancelRotateSecretResult clone() {
        try {
            return (CancelRotateSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
