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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The created configured table.
     * </p>
     */
    private ConfiguredTable configuredTable;

    /**
     * <p>
     * The created configured table.
     * </p>
     * 
     * @param configuredTable
     *        The created configured table.
     */

    public void setConfiguredTable(ConfiguredTable configuredTable) {
        this.configuredTable = configuredTable;
    }

    /**
     * <p>
     * The created configured table.
     * </p>
     * 
     * @return The created configured table.
     */

    public ConfiguredTable getConfiguredTable() {
        return this.configuredTable;
    }

    /**
     * <p>
     * The created configured table.
     * </p>
     * 
     * @param configuredTable
     *        The created configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableResult withConfiguredTable(ConfiguredTable configuredTable) {
        setConfiguredTable(configuredTable);
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
        if (getConfiguredTable() != null)
            sb.append("ConfiguredTable: ").append(getConfiguredTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfiguredTableResult == false)
            return false;
        CreateConfiguredTableResult other = (CreateConfiguredTableResult) obj;
        if (other.getConfiguredTable() == null ^ this.getConfiguredTable() == null)
            return false;
        if (other.getConfiguredTable() != null && other.getConfiguredTable().equals(this.getConfiguredTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredTable() == null) ? 0 : getConfiguredTable().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredTableResult clone() {
        try {
            return (CreateConfiguredTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
