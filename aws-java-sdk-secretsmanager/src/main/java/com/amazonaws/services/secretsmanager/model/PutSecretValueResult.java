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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutSecretValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSecretValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret for which you just created a version.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret for which you just created or updated a version.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the version of the secret you just created or updated.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to
     * track a version as it progresses through the secret rotation process.
     * </p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret for which you just created a version.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) for the secret for which you just created a version.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret for which you just created a version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the secret for which you just created a version.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret for which you just created a version.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) for the secret for which you just created a version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret for which you just created or updated a version.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret for which you just created or updated a version.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret for which you just created or updated a version.
     * </p>
     * 
     * @return The friendly name of the secret for which you just created or updated a version.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret for which you just created or updated a version.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret for which you just created or updated a version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret you just created or updated.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of the version of the secret you just created or updated.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret you just created or updated.
     * </p>
     * 
     * @return The unique identifier of the version of the secret you just created or updated.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret you just created or updated.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of the version of the secret you just created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to
     * track a version as it progresses through the secret rotation process.
     * </p>
     * 
     * @return The list of staging labels that are currently attached to this version of the secret. Staging labels are
     *         used to track a version as it progresses through the secret rotation process.
     */

    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>
     * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to
     * track a version as it progresses through the secret rotation process.
     * </p>
     * 
     * @param versionStages
     *        The list of staging labels that are currently attached to this version of the secret. Staging labels are
     *        used to track a version as it progresses through the secret rotation process.
     */

    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>
     * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to
     * track a version as it progresses through the secret rotation process.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionStages(java.util.Collection)} or {@link #withVersionStages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionStages
     *        The list of staging labels that are currently attached to this version of the secret. Staging labels are
     *        used to track a version as it progresses through the secret rotation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueResult withVersionStages(String... versionStages) {
        if (this.versionStages == null) {
            setVersionStages(new java.util.ArrayList<String>(versionStages.length));
        }
        for (String ele : versionStages) {
            this.versionStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to
     * track a version as it progresses through the secret rotation process.
     * </p>
     * 
     * @param versionStages
     *        The list of staging labels that are currently attached to this version of the secret. Staging labels are
     *        used to track a version as it progresses through the secret rotation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSecretValueResult withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
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
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getVersionStages() != null)
            sb.append("VersionStages: ").append(getVersionStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSecretValueResult == false)
            return false;
        PutSecretValueResult other = (PutSecretValueResult) obj;
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
        if (other.getVersionStages() == null ^ this.getVersionStages() == null)
            return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false)
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
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        return hashCode;
    }

    @Override
    public PutSecretValueResult clone() {
        try {
            return (PutSecretValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
