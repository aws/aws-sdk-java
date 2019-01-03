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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CopyClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceSnapshotIdentifier;
    /**
     * <p>
     * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user
     * has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceSnapshotClusterIdentifier;
    /**
     * <p>
     * The identifier given to the new manual snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for the AWS account that is making the request.
     * </p>
     * </li>
     * </ul>
     */
    private String targetSnapshotIdentifier;
    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;

    /**
     * <p>
     * The identifier for the source snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceSnapshotIdentifier
     *        The identifier for the source snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     *        </p>
     *        </li>
     */

    public void setSourceSnapshotIdentifier(String sourceSnapshotIdentifier) {
        this.sourceSnapshotIdentifier = sourceSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the source snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the source snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     *         </p>
     *         </li>
     */

    public String getSourceSnapshotIdentifier() {
        return this.sourceSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the source snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceSnapshotIdentifier
     *        The identifier for the source snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for a valid automated snapshot whose state is <code>available</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withSourceSnapshotIdentifier(String sourceSnapshotIdentifier) {
        setSourceSnapshotIdentifier(sourceSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user
     * has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceSnapshotClusterIdentifier
     *        The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM
     *        user has a policy containing a snapshot resource element that specifies anything other than * for the
     *        cluster name.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for a valid cluster.
     *        </p>
     *        </li>
     */

    public void setSourceSnapshotClusterIdentifier(String sourceSnapshotClusterIdentifier) {
        this.sourceSnapshotClusterIdentifier = sourceSnapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user
     * has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the cluster the source snapshot was created from. This parameter is required if your
     *         IAM user has a policy containing a snapshot resource element that specifies anything other than * for the
     *         cluster name.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier for a valid cluster.
     *         </p>
     *         </li>
     */

    public String getSourceSnapshotClusterIdentifier() {
        return this.sourceSnapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user
     * has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for a valid cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceSnapshotClusterIdentifier
     *        The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM
     *        user has a policy containing a snapshot resource element that specifies anything other than * for the
     *        cluster name.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for a valid cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withSourceSnapshotClusterIdentifier(String sourceSnapshotClusterIdentifier) {
        setSourceSnapshotClusterIdentifier(sourceSnapshotClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier given to the new manual snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for the AWS account that is making the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetSnapshotIdentifier
     *        The identifier given to the new manual snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unique for the AWS account that is making the request.
     *        </p>
     *        </li>
     */

    public void setTargetSnapshotIdentifier(String targetSnapshotIdentifier) {
        this.targetSnapshotIdentifier = targetSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier given to the new manual snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for the AWS account that is making the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier given to the new manual snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cannot be null, empty, or blank.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unique for the AWS account that is making the request.
     *         </p>
     *         </li>
     */

    public String getTargetSnapshotIdentifier() {
        return this.targetSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier given to the new manual snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for the AWS account that is making the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetSnapshotIdentifier
     *        The identifier given to the new manual snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unique for the AWS account that is making the request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withTargetSnapshotIdentifier(String targetSnapshotIdentifier) {
        setTargetSnapshotIdentifier(targetSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely. </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        The default value is -1.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @return The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is
     *         retained indefinitely. </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         The default value is -1.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely. </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        The default value is -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
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
        if (getSourceSnapshotIdentifier() != null)
            sb.append("SourceSnapshotIdentifier: ").append(getSourceSnapshotIdentifier()).append(",");
        if (getSourceSnapshotClusterIdentifier() != null)
            sb.append("SourceSnapshotClusterIdentifier: ").append(getSourceSnapshotClusterIdentifier()).append(",");
        if (getTargetSnapshotIdentifier() != null)
            sb.append("TargetSnapshotIdentifier: ").append(getTargetSnapshotIdentifier()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyClusterSnapshotRequest == false)
            return false;
        CopyClusterSnapshotRequest other = (CopyClusterSnapshotRequest) obj;
        if (other.getSourceSnapshotIdentifier() == null ^ this.getSourceSnapshotIdentifier() == null)
            return false;
        if (other.getSourceSnapshotIdentifier() != null && other.getSourceSnapshotIdentifier().equals(this.getSourceSnapshotIdentifier()) == false)
            return false;
        if (other.getSourceSnapshotClusterIdentifier() == null ^ this.getSourceSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSourceSnapshotClusterIdentifier() != null
                && other.getSourceSnapshotClusterIdentifier().equals(this.getSourceSnapshotClusterIdentifier()) == false)
            return false;
        if (other.getTargetSnapshotIdentifier() == null ^ this.getTargetSnapshotIdentifier() == null)
            return false;
        if (other.getTargetSnapshotIdentifier() != null && other.getTargetSnapshotIdentifier().equals(this.getTargetSnapshotIdentifier()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceSnapshotIdentifier() == null) ? 0 : getSourceSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceSnapshotClusterIdentifier() == null) ? 0 : getSourceSnapshotClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetSnapshotIdentifier() == null) ? 0 : getTargetSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CopyClusterSnapshotRequest clone() {
        return (CopyClusterSnapshotRequest) super.clone();
    }

}
