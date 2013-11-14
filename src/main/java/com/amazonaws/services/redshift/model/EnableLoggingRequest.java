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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#enableLogging(EnableLoggingRequest) EnableLogging operation}.
 * <p>
 * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#enableLogging(EnableLoggingRequest)
 */
public class EnableLoggingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster on which logging is to be started.
     * <p>Example: <code>examplecluster</code>
     */
    private String clusterIdentifier;

    /**
     * The name of an existing S3 bucket where the log files are to be
     * stored. <p>Constraints: <ul> <li>Must be in the same region as the
     * cluster</li> <li>The cluster must have read bucket and put object
     * permissions</li> </ul>
     */
    private String bucketName;

    /**
     * The prefix applied to the log file names. <p>Constraints: <ul>
     * <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     * double quotes ("), single quotes ('), a backslash (\), or control
     * characters. The hexadecimal codes for invalid characters are: <ul>
     * <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     * larger</li> </ul> </li> </ul>
     */
    private String s3KeyPrefix;

    /**
     * The identifier of the cluster on which logging is to be started.
     * <p>Example: <code>examplecluster</code>
     *
     * @return The identifier of the cluster on which logging is to be started.
     *         <p>Example: <code>examplecluster</code>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster on which logging is to be started.
     * <p>Example: <code>examplecluster</code>
     *
     * @param clusterIdentifier The identifier of the cluster on which logging is to be started.
     *         <p>Example: <code>examplecluster</code>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster on which logging is to be started.
     * <p>Example: <code>examplecluster</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster on which logging is to be started.
     *         <p>Example: <code>examplecluster</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableLoggingRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The name of an existing S3 bucket where the log files are to be
     * stored. <p>Constraints: <ul> <li>Must be in the same region as the
     * cluster</li> <li>The cluster must have read bucket and put object
     * permissions</li> </ul>
     *
     * @return The name of an existing S3 bucket where the log files are to be
     *         stored. <p>Constraints: <ul> <li>Must be in the same region as the
     *         cluster</li> <li>The cluster must have read bucket and put object
     *         permissions</li> </ul>
     */
    public String getBucketName() {
        return bucketName;
    }
    
    /**
     * The name of an existing S3 bucket where the log files are to be
     * stored. <p>Constraints: <ul> <li>Must be in the same region as the
     * cluster</li> <li>The cluster must have read bucket and put object
     * permissions</li> </ul>
     *
     * @param bucketName The name of an existing S3 bucket where the log files are to be
     *         stored. <p>Constraints: <ul> <li>Must be in the same region as the
     *         cluster</li> <li>The cluster must have read bucket and put object
     *         permissions</li> </ul>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    /**
     * The name of an existing S3 bucket where the log files are to be
     * stored. <p>Constraints: <ul> <li>Must be in the same region as the
     * cluster</li> <li>The cluster must have read bucket and put object
     * permissions</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucketName The name of an existing S3 bucket where the log files are to be
     *         stored. <p>Constraints: <ul> <li>Must be in the same region as the
     *         cluster</li> <li>The cluster must have read bucket and put object
     *         permissions</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableLoggingRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * The prefix applied to the log file names. <p>Constraints: <ul>
     * <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     * double quotes ("), single quotes ('), a backslash (\), or control
     * characters. The hexadecimal codes for invalid characters are: <ul>
     * <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     * larger</li> </ul> </li> </ul>
     *
     * @return The prefix applied to the log file names. <p>Constraints: <ul>
     *         <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     *         double quotes ("), single quotes ('), a backslash (\), or control
     *         characters. The hexadecimal codes for invalid characters are: <ul>
     *         <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     *         larger</li> </ul> </li> </ul>
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * The prefix applied to the log file names. <p>Constraints: <ul>
     * <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     * double quotes ("), single quotes ('), a backslash (\), or control
     * characters. The hexadecimal codes for invalid characters are: <ul>
     * <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     * larger</li> </ul> </li> </ul>
     *
     * @param s3KeyPrefix The prefix applied to the log file names. <p>Constraints: <ul>
     *         <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     *         double quotes ("), single quotes ('), a backslash (\), or control
     *         characters. The hexadecimal codes for invalid characters are: <ul>
     *         <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     *         larger</li> </ul> </li> </ul>
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * The prefix applied to the log file names. <p>Constraints: <ul>
     * <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     * double quotes ("), single quotes ('), a backslash (\), or control
     * characters. The hexadecimal codes for invalid characters are: <ul>
     * <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     * larger</li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix The prefix applied to the log file names. <p>Constraints: <ul>
     *         <li>Cannot exceed 512 characters</li> <li>Cannot contain spaces( ),
     *         double quotes ("), single quotes ('), a backslash (\), or control
     *         characters. The hexadecimal codes for invalid characters are: <ul>
     *         <li>x00 to x20</li> <li>x22</li> <li>x27</li> <li>x5c</li> <li>x7f or
     *         larger</li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableLoggingRequest withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getBucketName() != null) sb.append("BucketName: " + getBucketName() + ",");
        if (getS3KeyPrefix() != null) sb.append("S3KeyPrefix: " + getS3KeyPrefix() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode()); 
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableLoggingRequest == false) return false;
        EnableLoggingRequest other = (EnableLoggingRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getBucketName() == null ^ this.getBucketName() == null) return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false) return false; 
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null) return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false) return false; 
        return true;
    }
    
}
    