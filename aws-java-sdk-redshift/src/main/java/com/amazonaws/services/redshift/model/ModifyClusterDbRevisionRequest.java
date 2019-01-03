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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterDbRevision" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterDbRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from the response to the
     * <a>DescribeClusterDbRevisions</a> request.
     * </p>
     */
    private String revisionTarget;

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of a cluster whose database revision you want to modify. </p>
     *        <p>
     *        Example: <code>examplecluster</code>
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @return The unique identifier of a cluster whose database revision you want to modify. </p>
     *         <p>
     *         Example: <code>examplecluster</code>
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of a cluster whose database revision you want to modify. </p>
     *        <p>
     *        Example: <code>examplecluster</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterDbRevisionRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from the response to the
     * <a>DescribeClusterDbRevisions</a> request.
     * </p>
     * 
     * @param revisionTarget
     *        The identifier of the database revision. You can retrieve this value from the response to the
     *        <a>DescribeClusterDbRevisions</a> request.
     */

    public void setRevisionTarget(String revisionTarget) {
        this.revisionTarget = revisionTarget;
    }

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from the response to the
     * <a>DescribeClusterDbRevisions</a> request.
     * </p>
     * 
     * @return The identifier of the database revision. You can retrieve this value from the response to the
     *         <a>DescribeClusterDbRevisions</a> request.
     */

    public String getRevisionTarget() {
        return this.revisionTarget;
    }

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from the response to the
     * <a>DescribeClusterDbRevisions</a> request.
     * </p>
     * 
     * @param revisionTarget
     *        The identifier of the database revision. You can retrieve this value from the response to the
     *        <a>DescribeClusterDbRevisions</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterDbRevisionRequest withRevisionTarget(String revisionTarget) {
        setRevisionTarget(revisionTarget);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getRevisionTarget() != null)
            sb.append("RevisionTarget: ").append(getRevisionTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterDbRevisionRequest == false)
            return false;
        ModifyClusterDbRevisionRequest other = (ModifyClusterDbRevisionRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getRevisionTarget() == null ^ this.getRevisionTarget() == null)
            return false;
        if (other.getRevisionTarget() != null && other.getRevisionTarget().equals(this.getRevisionTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRevisionTarget() == null) ? 0 : getRevisionTarget().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterDbRevisionRequest clone() {
        return (ModifyClusterDbRevisionRequest) super.clone();
    }

}
