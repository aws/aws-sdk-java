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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested table version.
     * </p>
     */
    private TableVersion tableVersion;

    /**
     * <p>
     * The requested table version.
     * </p>
     * 
     * @param tableVersion
     *        The requested table version.
     */

    public void setTableVersion(TableVersion tableVersion) {
        this.tableVersion = tableVersion;
    }

    /**
     * <p>
     * The requested table version.
     * </p>
     * 
     * @return The requested table version.
     */

    public TableVersion getTableVersion() {
        return this.tableVersion;
    }

    /**
     * <p>
     * The requested table version.
     * </p>
     * 
     * @param tableVersion
     *        The requested table version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionResult withTableVersion(TableVersion tableVersion) {
        setTableVersion(tableVersion);
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
        if (getTableVersion() != null)
            sb.append("TableVersion: ").append(getTableVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableVersionResult == false)
            return false;
        GetTableVersionResult other = (GetTableVersionResult) obj;
        if (other.getTableVersion() == null ^ this.getTableVersion() == null)
            return false;
        if (other.getTableVersion() != null && other.getTableVersion().equals(this.getTableVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableVersion() == null) ? 0 : getTableVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetTableVersionResult clone() {
        try {
            return (GetTableVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
