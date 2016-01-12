/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a destination in Amazon Redshift.
 * </p>
 */
public class RedshiftDestinationDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The database connection string.
     * </p>
     */
    private String clusterJDBCURL;
    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     */
    private CopyCommand copyCommand;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     */
    private S3DestinationDescription s3DestinationDescription;

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @return The ARN of the AWS credentials.
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RedshiftDestinationDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @param clusterJDBCURL
     *        The database connection string.
     */
    public void setClusterJDBCURL(String clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @return The database connection string.
     */
    public String getClusterJDBCURL() {
        return this.clusterJDBCURL;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @param clusterJDBCURL
     *        The database connection string.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RedshiftDestinationDescription withClusterJDBCURL(
            String clusterJDBCURL) {
        setClusterJDBCURL(clusterJDBCURL);
        return this;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @param copyCommand
     *        The <code>COPY</code> command.
     */
    public void setCopyCommand(CopyCommand copyCommand) {
        this.copyCommand = copyCommand;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @return The <code>COPY</code> command.
     */
    public CopyCommand getCopyCommand() {
        return this.copyCommand;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @param copyCommand
     *        The <code>COPY</code> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RedshiftDestinationDescription withCopyCommand(
            CopyCommand copyCommand) {
        setCopyCommand(copyCommand);
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RedshiftDestinationDescription withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * 
     * @param s3DestinationDescription
     *        The Amazon S3 destination.
     */
    public void setS3DestinationDescription(
            S3DestinationDescription s3DestinationDescription) {
        this.s3DestinationDescription = s3DestinationDescription;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * 
     * @return The Amazon S3 destination.
     */
    public S3DestinationDescription getS3DestinationDescription() {
        return this.s3DestinationDescription;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * 
     * @param s3DestinationDescription
     *        The Amazon S3 destination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RedshiftDestinationDescription withS3DestinationDescription(
            S3DestinationDescription s3DestinationDescription) {
        setS3DestinationDescription(s3DestinationDescription);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getClusterJDBCURL() != null)
            sb.append("ClusterJDBCURL: " + getClusterJDBCURL() + ",");
        if (getCopyCommand() != null)
            sb.append("CopyCommand: " + getCopyCommand() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getS3DestinationDescription() != null)
            sb.append("S3DestinationDescription: "
                    + getS3DestinationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDestinationDescription == false)
            return false;
        RedshiftDestinationDescription other = (RedshiftDestinationDescription) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null
                && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getClusterJDBCURL() == null
                ^ this.getClusterJDBCURL() == null)
            return false;
        if (other.getClusterJDBCURL() != null
                && other.getClusterJDBCURL().equals(this.getClusterJDBCURL()) == false)
            return false;
        if (other.getCopyCommand() == null ^ this.getCopyCommand() == null)
            return false;
        if (other.getCopyCommand() != null
                && other.getCopyCommand().equals(this.getCopyCommand()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null
                && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getS3DestinationDescription() == null
                ^ this.getS3DestinationDescription() == null)
            return false;
        if (other.getS3DestinationDescription() != null
                && other.getS3DestinationDescription().equals(
                        this.getS3DestinationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterJDBCURL() == null) ? 0 : getClusterJDBCURL()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCopyCommand() == null) ? 0 : getCopyCommand().hashCode());
        hashCode = prime * hashCode
                + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3DestinationDescription() == null) ? 0
                        : getS3DestinationDescription().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDestinationDescription clone() {
        try {
            return (RedshiftDestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}