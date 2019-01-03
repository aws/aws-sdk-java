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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase
     * string.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a
     *        lowercase string.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @return The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a
     *         lowercase string.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a
     *        lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDBClusterRequest == false)
            return false;
        StopDBClusterRequest other = (StopDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StopDBClusterRequest clone() {
        return (StopDBClusterRequest) super.clone();
    }

}
