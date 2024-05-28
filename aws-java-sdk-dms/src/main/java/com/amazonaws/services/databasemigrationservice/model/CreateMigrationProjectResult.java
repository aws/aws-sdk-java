/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateMigrationProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMigrationProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The migration project that was created.
     * </p>
     */
    private MigrationProject migrationProject;

    /**
     * <p>
     * The migration project that was created.
     * </p>
     * 
     * @param migrationProject
     *        The migration project that was created.
     */

    public void setMigrationProject(MigrationProject migrationProject) {
        this.migrationProject = migrationProject;
    }

    /**
     * <p>
     * The migration project that was created.
     * </p>
     * 
     * @return The migration project that was created.
     */

    public MigrationProject getMigrationProject() {
        return this.migrationProject;
    }

    /**
     * <p>
     * The migration project that was created.
     * </p>
     * 
     * @param migrationProject
     *        The migration project that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMigrationProjectResult withMigrationProject(MigrationProject migrationProject) {
        setMigrationProject(migrationProject);
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
        if (getMigrationProject() != null)
            sb.append("MigrationProject: ").append(getMigrationProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMigrationProjectResult == false)
            return false;
        CreateMigrationProjectResult other = (CreateMigrationProjectResult) obj;
        if (other.getMigrationProject() == null ^ this.getMigrationProject() == null)
            return false;
        if (other.getMigrationProject() != null && other.getMigrationProject().equals(this.getMigrationProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationProject() == null) ? 0 : getMigrationProject().hashCode());
        return hashCode;
    }

    @Override
    public CreateMigrationProjectResult clone() {
        try {
            return (CreateMigrationProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
