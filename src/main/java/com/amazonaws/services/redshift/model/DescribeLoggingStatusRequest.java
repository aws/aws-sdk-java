/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeLoggingStatus(DescribeLoggingStatusRequest) DescribeLoggingStatus operation}.
 * <p>
 * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeLoggingStatus(DescribeLoggingStatusRequest)
 */
public class DescribeLoggingStatusRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster to get the logging status from.
     * <p>Example: <code>examplecluster</code>
     */
    private String clusterIdentifier;

    /**
     * The identifier of the cluster to get the logging status from.
     * <p>Example: <code>examplecluster</code>
     *
     * @return The identifier of the cluster to get the logging status from.
     *         <p>Example: <code>examplecluster</code>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster to get the logging status from.
     * <p>Example: <code>examplecluster</code>
     *
     * @param clusterIdentifier The identifier of the cluster to get the logging status from.
     *         <p>Example: <code>examplecluster</code>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster to get the logging status from.
     * <p>Example: <code>examplecluster</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster to get the logging status from.
     *         <p>Example: <code>examplecluster</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoggingStatusRequest == false) return false;
        DescribeLoggingStatusRequest other = (DescribeLoggingStatusRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        return true;
    }
    
}
    