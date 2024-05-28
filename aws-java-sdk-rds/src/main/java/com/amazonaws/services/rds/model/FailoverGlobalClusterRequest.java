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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the global database cluster (Aurora global database) this operation should apply to. The
     * identifier is the unique key assigned by the user when the Aurora global database is created. In other words,
     * it's the name of the Aurora global database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the cluster in its
     * Amazon Web Services Region.
     * </p>
     */
    private String targetDbClusterIdentifier;
    /**
     * <p>
     * Specifies whether to allow data loss for this global database cluster operation. Allowing data loss triggers a
     * global failover operation.
     * </p>
     * <p>
     * If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a switchover.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>Switchover</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean allowDataLoss;
    /**
     * <p>
     * Specifies whether to switch over this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean switchover;

    /**
     * <p>
     * The identifier of the global database cluster (Aurora global database) this operation should apply to. The
     * identifier is the unique key assigned by the user when the Aurora global database is created. In other words,
     * it's the name of the Aurora global database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        The identifier of the global database cluster (Aurora global database) this operation should apply to. The
     *        identifier is the unique key assigned by the user when the Aurora global database is created. In other
     *        words, it's the name of the Aurora global database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global database cluster.
     *        </p>
     *        </li>
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the global database cluster (Aurora global database) this operation should apply to. The
     * identifier is the unique key assigned by the user when the Aurora global database is created. In other words,
     * it's the name of the Aurora global database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the global database cluster (Aurora global database) this operation should apply to.
     *         The identifier is the unique key assigned by the user when the Aurora global database is created. In
     *         other words, it's the name of the Aurora global database.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing global database cluster.
     *         </p>
     *         </li>
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the global database cluster (Aurora global database) this operation should apply to. The
     * identifier is the unique key assigned by the user when the Aurora global database is created. In other words,
     * it's the name of the Aurora global database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        The identifier of the global database cluster (Aurora global database) this operation should apply to. The
     *        identifier is the unique key assigned by the user when the Aurora global database is created. In other
     *        words, it's the name of the Aurora global database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global database cluster.
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
     * The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the cluster in its
     * Amazon Web Services Region.
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global
     *        database cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     *        cluster in its Amazon Web Services Region.
     */

    public void setTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        this.targetDbClusterIdentifier = targetDbClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the cluster in its
     * Amazon Web Services Region.
     * </p>
     * 
     * @return The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global
     *         database cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     *         cluster in its Amazon Web Services Region.
     */

    public String getTargetDbClusterIdentifier() {
        return this.targetDbClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global database
     * cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the cluster in its
     * Amazon Web Services Region.
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        The identifier of the secondary Aurora DB cluster that you want to promote to the primary for the global
     *        database cluster. Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the
     *        cluster in its Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        setTargetDbClusterIdentifier(targetDbClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether to allow data loss for this global database cluster operation. Allowing data loss triggers a
     * global failover operation.
     * </p>
     * <p>
     * If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a switchover.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>Switchover</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param allowDataLoss
     *        Specifies whether to allow data loss for this global database cluster operation. Allowing data loss
     *        triggers a global failover operation.</p>
     *        <p>
     *        If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a
     *        switchover.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified together with the <code>Switchover</code> parameter.
     *        </p>
     *        </li>
     */

    public void setAllowDataLoss(Boolean allowDataLoss) {
        this.allowDataLoss = allowDataLoss;
    }

    /**
     * <p>
     * Specifies whether to allow data loss for this global database cluster operation. Allowing data loss triggers a
     * global failover operation.
     * </p>
     * <p>
     * If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a switchover.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>Switchover</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to allow data loss for this global database cluster operation. Allowing data loss
     *         triggers a global failover operation.</p>
     *         <p>
     *         If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a
     *         switchover.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified together with the <code>Switchover</code> parameter.
     *         </p>
     *         </li>
     */

    public Boolean getAllowDataLoss() {
        return this.allowDataLoss;
    }

    /**
     * <p>
     * Specifies whether to allow data loss for this global database cluster operation. Allowing data loss triggers a
     * global failover operation.
     * </p>
     * <p>
     * If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a switchover.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>Switchover</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param allowDataLoss
     *        Specifies whether to allow data loss for this global database cluster operation. Allowing data loss
     *        triggers a global failover operation.</p>
     *        <p>
     *        If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a
     *        switchover.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified together with the <code>Switchover</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withAllowDataLoss(Boolean allowDataLoss) {
        setAllowDataLoss(allowDataLoss);
        return this;
    }

    /**
     * <p>
     * Specifies whether to allow data loss for this global database cluster operation. Allowing data loss triggers a
     * global failover operation.
     * </p>
     * <p>
     * If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a switchover.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>Switchover</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to allow data loss for this global database cluster operation. Allowing data loss
     *         triggers a global failover operation.</p>
     *         <p>
     *         If you don't specify <code>AllowDataLoss</code>, the global database cluster operation defaults to a
     *         switchover.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified together with the <code>Switchover</code> parameter.
     *         </p>
     *         </li>
     */

    public Boolean isAllowDataLoss() {
        return this.allowDataLoss;
    }

    /**
     * <p>
     * Specifies whether to switch over this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param switchover
     *        Specifies whether to switch over this global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified together with the <code>AllowDataLoss</code> parameter.
     *        </p>
     *        </li>
     */

    public void setSwitchover(Boolean switchover) {
        this.switchover = switchover;
    }

    /**
     * <p>
     * Specifies whether to switch over this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to switch over this global database cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified together with the <code>AllowDataLoss</code> parameter.
     *         </p>
     *         </li>
     */

    public Boolean getSwitchover() {
        return this.switchover;
    }

    /**
     * <p>
     * Specifies whether to switch over this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param switchover
     *        Specifies whether to switch over this global database cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified together with the <code>AllowDataLoss</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withSwitchover(Boolean switchover) {
        setSwitchover(switchover);
        return this;
    }

    /**
     * <p>
     * Specifies whether to switch over this global database cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified together with the <code>AllowDataLoss</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to switch over this global database cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified together with the <code>AllowDataLoss</code> parameter.
     *         </p>
     *         </li>
     */

    public Boolean isSwitchover() {
        return this.switchover;
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
            sb.append("TargetDbClusterIdentifier: ").append(getTargetDbClusterIdentifier()).append(",");
        if (getAllowDataLoss() != null)
            sb.append("AllowDataLoss: ").append(getAllowDataLoss()).append(",");
        if (getSwitchover() != null)
            sb.append("Switchover: ").append(getSwitchover());
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
        if (other.getAllowDataLoss() == null ^ this.getAllowDataLoss() == null)
            return false;
        if (other.getAllowDataLoss() != null && other.getAllowDataLoss().equals(this.getAllowDataLoss()) == false)
            return false;
        if (other.getSwitchover() == null ^ this.getSwitchover() == null)
            return false;
        if (other.getSwitchover() != null && other.getSwitchover().equals(this.getSwitchover()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDbClusterIdentifier() == null) ? 0 : getTargetDbClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAllowDataLoss() == null) ? 0 : getAllowDataLoss().hashCode());
        hashCode = prime * hashCode + ((getSwitchover() == null) ? 0 : getSwitchover().hashCode());
        return hashCode;
    }

    @Override
    public FailoverGlobalClusterRequest clone() {
        return (FailoverGlobalClusterRequest) super.clone();
    }

}
