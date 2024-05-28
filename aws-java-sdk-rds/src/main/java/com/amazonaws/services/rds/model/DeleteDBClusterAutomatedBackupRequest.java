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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterAutomatedBackup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBClusterAutomatedBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     */
    private String dbClusterResourceId;

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *        Services Region.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @return The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *         Services Region.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBClusterAutomatedBackupRequest withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
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
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: ").append(getDbClusterResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBClusterAutomatedBackupRequest == false)
            return false;
        DeleteDBClusterAutomatedBackupRequest other = (DeleteDBClusterAutomatedBackupRequest) obj;
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBClusterAutomatedBackupRequest clone() {
        return (DeleteDBClusterAutomatedBackupRequest) super.clone();
    }

}
