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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/RotateSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotateSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the new version of the secret created by the rotation started by this request.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @return The ARN of the secret.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @return The friendly name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the new version of the secret created by the rotation started by this request.
     * </p>
     * 
     * @param versionId
     *        The ID of the new version of the secret created by the rotation started by this request.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the new version of the secret created by the rotation started by this request.
     * </p>
     * 
     * @return The ID of the new version of the secret created by the rotation started by this request.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the new version of the secret created by the rotation started by this request.
     * </p>
     * 
     * @param versionId
     *        The ID of the new version of the secret created by the rotation started by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateSecretResult withVersionId(String versionId) {
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

        if (obj instanceof RotateSecretResult == false)
            return false;
        RotateSecretResult other = (RotateSecretResult) obj;
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
    public RotateSecretResult clone() {
        try {
            return (RotateSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
