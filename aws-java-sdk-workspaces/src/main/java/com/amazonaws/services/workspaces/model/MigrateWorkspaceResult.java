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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/MigrateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrateWorkspaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The original identifier of the WorkSpace that is being migrated.
     * </p>
     */
    private String sourceWorkspaceId;
    /**
     * <p>
     * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     * WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     * </p>
     */
    private String targetWorkspaceId;

    /**
     * <p>
     * The original identifier of the WorkSpace that is being migrated.
     * </p>
     * 
     * @param sourceWorkspaceId
     *        The original identifier of the WorkSpace that is being migrated.
     */

    public void setSourceWorkspaceId(String sourceWorkspaceId) {
        this.sourceWorkspaceId = sourceWorkspaceId;
    }

    /**
     * <p>
     * The original identifier of the WorkSpace that is being migrated.
     * </p>
     * 
     * @return The original identifier of the WorkSpace that is being migrated.
     */

    public String getSourceWorkspaceId() {
        return this.sourceWorkspaceId;
    }

    /**
     * <p>
     * The original identifier of the WorkSpace that is being migrated.
     * </p>
     * 
     * @param sourceWorkspaceId
     *        The original identifier of the WorkSpace that is being migrated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrateWorkspaceResult withSourceWorkspaceId(String sourceWorkspaceId) {
        setSourceWorkspaceId(sourceWorkspaceId);
        return this;
    }

    /**
     * <p>
     * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     * WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     * </p>
     * 
     * @param targetWorkspaceId
     *        The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     *        WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     */

    public void setTargetWorkspaceId(String targetWorkspaceId) {
        this.targetWorkspaceId = targetWorkspaceId;
    }

    /**
     * <p>
     * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     * WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     * </p>
     * 
     * @return The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     *         WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     */

    public String getTargetWorkspaceId() {
        return this.targetWorkspaceId;
    }

    /**
     * <p>
     * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     * WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     * </p>
     * 
     * @param targetWorkspaceId
     *        The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target
     *        WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrateWorkspaceResult withTargetWorkspaceId(String targetWorkspaceId) {
        setTargetWorkspaceId(targetWorkspaceId);
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
        if (getSourceWorkspaceId() != null)
            sb.append("SourceWorkspaceId: ").append(getSourceWorkspaceId()).append(",");
        if (getTargetWorkspaceId() != null)
            sb.append("TargetWorkspaceId: ").append(getTargetWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrateWorkspaceResult == false)
            return false;
        MigrateWorkspaceResult other = (MigrateWorkspaceResult) obj;
        if (other.getSourceWorkspaceId() == null ^ this.getSourceWorkspaceId() == null)
            return false;
        if (other.getSourceWorkspaceId() != null && other.getSourceWorkspaceId().equals(this.getSourceWorkspaceId()) == false)
            return false;
        if (other.getTargetWorkspaceId() == null ^ this.getTargetWorkspaceId() == null)
            return false;
        if (other.getTargetWorkspaceId() != null && other.getTargetWorkspaceId().equals(this.getTargetWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceWorkspaceId() == null) ? 0 : getSourceWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getTargetWorkspaceId() == null) ? 0 : getTargetWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public MigrateWorkspaceResult clone() {
        try {
            return (MigrateWorkspaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
