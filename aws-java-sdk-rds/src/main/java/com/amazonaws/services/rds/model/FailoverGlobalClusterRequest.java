/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The identifier is the
     * unique key assigned by the user when the Aurora global database was created. In other words, it's the name of the
     * Aurora global database that you want to fail over.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     * </p>
     * </li>
     * </ul>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global database
     * (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     * cluster in its Amazon Web Services Region.
     * </p>
     */
    private String targetDbClusterIdentifier;

    /**
     * <p>
     * Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The identifier is the
     * unique key assigned by the user when the Aurora global database was created. In other words, it's the name of the
     * Aurora global database that you want to fail over.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The identifier
     *        is the unique key assigned by the user when the Aurora global database was created. In other words, it's
     *        the name of the Aurora global database that you want to fail over. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     *        </p>
     *        </li>
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The identifier is the
     * unique key assigned by the user when the Aurora global database was created. In other words, it's the name of the
     * Aurora global database that you want to fail over.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The
     *         identifier is the unique key assigned by the user when the Aurora global database was created. In other
     *         words, it's the name of the Aurora global database that you want to fail over. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     *         </p>
     *         </li>
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The identifier is the
     * unique key assigned by the user when the Aurora global database was created. In other words, it's the name of the
     * Aurora global database that you want to fail over.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        Identifier of the Aurora global database (<a>GlobalCluster</a>) that should be failed over. The identifier
     *        is the unique key assigned by the user when the Aurora global database was created. In other words, it's
     *        the name of the Aurora global database that you want to fail over. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing <a>GlobalCluster</a> (Aurora global database).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global database
     * (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     * cluster in its Amazon Web Services Region.
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global
     *        database (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can
     *        locate the cluster in its Amazon Web Services Region.
     */

    public void setTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        this.targetDbClusterIdentifier = targetDbClusterIdentifier;
    }

    /**
     * <p>
     * Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global database
     * (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     * cluster in its Amazon Web Services Region.
     * </p>
     * 
     * @return Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global
     *         database (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can
     *         locate the cluster in its Amazon Web Services Region.
     */

    public String getTargetDbClusterIdentifier() {
        return this.targetDbClusterIdentifier;
    }

    /**
     * <p>
     * Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global database
     * (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     * cluster in its Amazon Web Services Region.
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global
     *        database (<a>GlobalCluster</a>.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can
     *        locate the cluster in its Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
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

        if (obj instanceof FailoverGlobalClusterRequest == false)
            return false;
        FailoverGlobalClusterRequest other = (FailoverGlobalClusterRequest) obj;
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
    public FailoverGlobalClusterRequest clone() {
        return (FailoverGlobalClusterRequest) super.clone();
    }

}
