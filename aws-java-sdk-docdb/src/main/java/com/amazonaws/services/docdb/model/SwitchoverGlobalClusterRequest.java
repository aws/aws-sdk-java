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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/SwitchoverGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SwitchoverGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the unique key
     * assigned by the user when the cluster is created. In other words, it's the name of the global cluster. This
     * parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can locate the cluster
     * in its Amazon Web Services region.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing secondary cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     */
    private String targetDbClusterIdentifier;

    /**
     * <p>
     * The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the unique key
     * assigned by the user when the cluster is created. In other words, it's the name of the global cluster. This
     * parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the
     *        unique key assigned by the user when the cluster is created. In other words, it's the name of the global
     *        cluster. This parameter isn’t case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Minimum length of 1. Maximum length of 255.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the unique key
     * assigned by the user when the cluster is created. In other words, it's the name of the global cluster. This
     * parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     * 
     * @return The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the
     *         unique key assigned by the user when the cluster is created. In other words, it's the name of the global
     *         cluster. This parameter isn’t case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Minimum length of 1. Maximum length of 255.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the unique key
     * assigned by the user when the cluster is created. In other words, it's the name of the global cluster. This
     * parameter isn’t case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The identifier of the Amazon DocumentDB global database cluster to switch over. The identifier is the
     *        unique key assigned by the user when the cluster is created. In other words, it's the name of the global
     *        cluster. This parameter isn’t case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global cluster (Amazon DocumentDB global database).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Minimum length of 1. Maximum length of 255.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can locate the cluster
     * in its Amazon Web Services region.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing secondary cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global
     *        database cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can
     *        locate the cluster in its Amazon Web Services region.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing secondary cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Minimum length of 1. Maximum length of 255.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     */

    public void setTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        this.targetDbClusterIdentifier = targetDbClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can locate the cluster
     * in its Amazon Web Services region.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing secondary cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     * 
     * @return The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global
     *         database cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can
     *         locate the cluster in its Amazon Web Services region.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing secondary cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Minimum length of 1. Maximum length of 255.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     */

    public String getTargetDbClusterIdentifier() {
        return this.targetDbClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can locate the cluster
     * in its Amazon Web Services region.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing secondary cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * Minimum length of 1. Maximum length of 255.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        The identifier of the secondary Amazon DocumentDB cluster to promote to the new primary for the global
     *        database cluster. Use the Amazon Resource Name (ARN) for the identifier so that Amazon DocumentDB can
     *        locate the cluster in its Amazon Web Services region.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing secondary cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Minimum length of 1. Maximum length of 255.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Pattern: <code>[A-Za-z][0-9A-Za-z-:._]*</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverGlobalClusterRequest withTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        setTargetDbClusterIdentifier(targetDbClusterIdentifier);
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
        if (getTargetDbClusterIdentifier() != null)
            sb.append("TargetDbClusterIdentifier: ").append(getTargetDbClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SwitchoverGlobalClusterRequest == false)
            return false;
        SwitchoverGlobalClusterRequest other = (SwitchoverGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getTargetDbClusterIdentifier() == null ^ this.getTargetDbClusterIdentifier() == null)
            return false;
        if (other.getTargetDbClusterIdentifier() != null && other.getTargetDbClusterIdentifier().equals(this.getTargetDbClusterIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDbClusterIdentifier() == null) ? 0 : getTargetDbClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public SwitchoverGlobalClusterRequest clone() {
        return (SwitchoverGlobalClusterRequest) super.clone();
    }

}
