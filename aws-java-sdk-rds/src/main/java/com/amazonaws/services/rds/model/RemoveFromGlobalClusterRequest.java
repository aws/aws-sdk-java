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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveFromGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveFromGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster.
     * </p>
     */
    private String dbClusterIdentifier;

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The cluster identifier to detach from the Aurora global database cluster.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     * 
     * @return The cluster identifier to detach from the Aurora global database cluster.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier to detach from the Aurora global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The cluster identifier to detach from the Aurora global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFromGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database
     *        cluster.
     */

    public void setDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database
     *         cluster.
     */

    public String getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFromGlobalClusterRequest withDbClusterIdentifier(String dbClusterIdentifier) {
        setDbClusterIdentifier(dbClusterIdentifier);
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getDbClusterIdentifier() != null)
            sb.append("DbClusterIdentifier: ").append(getDbClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFromGlobalClusterRequest == false)
            return false;
        RemoveFromGlobalClusterRequest other = (RemoveFromGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getDbClusterIdentifier() == null ^ this.getDbClusterIdentifier() == null)
            return false;
        if (other.getDbClusterIdentifier() != null && other.getDbClusterIdentifier().equals(this.getDbClusterIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbClusterIdentifier() == null) ? 0 : getDbClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public RemoveFromGlobalClusterRequest clone() {
        return (RemoveFromGlobalClusterRequest) super.clone();
    }

}
