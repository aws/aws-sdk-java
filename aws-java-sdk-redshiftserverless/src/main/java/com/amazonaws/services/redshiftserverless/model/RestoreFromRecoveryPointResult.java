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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromRecoveryPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreFromRecoveryPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace that data was restored into.
     * </p>
     */
    private Namespace namespace;
    /**
     * <p>
     * The unique identifier of the recovery point used for the restore.
     * </p>
     */
    private String recoveryPointId;

    /**
     * <p>
     * The namespace that data was restored into.
     * </p>
     * 
     * @param namespace
     *        The namespace that data was restored into.
     */

    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that data was restored into.
     * </p>
     * 
     * @return The namespace that data was restored into.
     */

    public Namespace getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace that data was restored into.
     * </p>
     * 
     * @param namespace
     *        The namespace that data was restored into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromRecoveryPointResult withNamespace(Namespace namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the recovery point used for the restore.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point used for the restore.
     */

    public void setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point used for the restore.
     * </p>
     * 
     * @return The unique identifier of the recovery point used for the restore.
     */

    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point used for the restore.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point used for the restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromRecoveryPointResult withRecoveryPointId(String recoveryPointId) {
        setRecoveryPointId(recoveryPointId);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getRecoveryPointId() != null)
            sb.append("RecoveryPointId: ").append(getRecoveryPointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreFromRecoveryPointResult == false)
            return false;
        RestoreFromRecoveryPointResult other = (RestoreFromRecoveryPointResult) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getRecoveryPointId() == null ^ this.getRecoveryPointId() == null)
            return false;
        if (other.getRecoveryPointId() != null && other.getRecoveryPointId().equals(this.getRecoveryPointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointId() == null) ? 0 : getRecoveryPointId().hashCode());
        return hashCode;
    }

    @Override
    public RestoreFromRecoveryPointResult clone() {
        try {
            return (RestoreFromRecoveryPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
