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

/**
 * <p>
 * Contains the state of scheduled or in-process failover operations on an Aurora global database
 * (<a>GlobalCluster</a>). This Data type is empty unless a failover operation is scheduled or is currently underway on
 * the Aurora global database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverState implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received by the
     * service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster are being
     * verified before the failover process can start.
     * </p>
     * </li>
     * <li>
     * <p>
     * failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     * failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     * synchronizing replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled and
     * the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their previous
     * states.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is associated
     * with this state.
     * </p>
     */
    private String fromDbClusterArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is associated
     * with this state.
     * </p>
     */
    private String toDbClusterArn;

    /**
     * <p>
     * The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received by the
     * service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster are being
     * verified before the failover process can start.
     * </p>
     * </li>
     * <li>
     * <p>
     * failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     * failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     * synchronizing replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled and
     * the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their previous
     * states.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received
     *        by the service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster
     *        are being verified before the failover process can start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     *        failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     *        synchronizing replicas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled
     *        and the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their
     *        previous states.
     *        </p>
     *        </li>
     * @see FailoverStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received by the
     * service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster are being
     * verified before the failover process can start.
     * </p>
     * </li>
     * <li>
     * <p>
     * failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     * failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     * synchronizing replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled and
     * the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their previous
     * states.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received
     *         by the service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB
     *         cluster are being verified before the failover process can start.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     *         failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     *         synchronizing replicas.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was
     *         cancelled and the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to
     *         their previous states.
     *         </p>
     *         </li>
     * @see FailoverStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received by the
     * service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster are being
     * verified before the failover process can start.
     * </p>
     * </li>
     * <li>
     * <p>
     * failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     * failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     * synchronizing replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled and
     * the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their previous
     * states.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received
     *        by the service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster
     *        are being verified before the failover process can start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     *        failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     *        synchronizing replicas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled
     *        and the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their
     *        previous states.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailoverStatus
     */

    public FailoverState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received by the
     * service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster are being
     * verified before the failover process can start.
     * </p>
     * </li>
     * <li>
     * <p>
     * failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     * failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     * synchronizing replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled and
     * the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their previous
     * states.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the Aurora global database (<a>GlobalCluster</a>). Possible values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pending &#x96; A request to fail over the Aurora global database (<a>GlobalCluster</a>) has been received
     *        by the service. The <code>GlobalCluster</code>'s primary DB cluster and the specified secondary DB cluster
     *        are being verified before the failover process can start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        failing-over &#x96; This status covers the range of Aurora internal operations that take place during the
     *        failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and
     *        synchronizing replicas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        cancelling &#x96; The request to fail over the Aurora global database (<a>GlobalCluster</a>) was cancelled
     *        and the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their
     *        previous states.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailoverStatus
     */

    public FailoverState withStatus(FailoverStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is associated
     * with this state.
     * </p>
     * 
     * @param fromDbClusterArn
     *        The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is
     *        associated with this state.
     */

    public void setFromDbClusterArn(String fromDbClusterArn) {
        this.fromDbClusterArn = fromDbClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is associated
     * with this state.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is
     *         associated with this state.
     */

    public String getFromDbClusterArn() {
        return this.fromDbClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is associated
     * with this state.
     * </p>
     * 
     * @param fromDbClusterArn
     *        The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is
     *        associated with this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverState withFromDbClusterArn(String fromDbClusterArn) {
        setFromDbClusterArn(fromDbClusterArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is associated
     * with this state.
     * </p>
     * 
     * @param toDbClusterArn
     *        The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is
     *        associated with this state.
     */

    public void setToDbClusterArn(String toDbClusterArn) {
        this.toDbClusterArn = toDbClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is associated
     * with this state.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is
     *         associated with this state.
     */

    public String getToDbClusterArn() {
        return this.toDbClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is associated
     * with this state.
     * </p>
     * 
     * @param toDbClusterArn
     *        The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is
     *        associated with this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverState withToDbClusterArn(String toDbClusterArn) {
        setToDbClusterArn(toDbClusterArn);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFromDbClusterArn() != null)
            sb.append("FromDbClusterArn: ").append(getFromDbClusterArn()).append(",");
        if (getToDbClusterArn() != null)
            sb.append("ToDbClusterArn: ").append(getToDbClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverState == false)
            return false;
        FailoverState other = (FailoverState) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFromDbClusterArn() == null ^ this.getFromDbClusterArn() == null)
            return false;
        if (other.getFromDbClusterArn() != null && other.getFromDbClusterArn().equals(this.getFromDbClusterArn()) == false)
            return false;
        if (other.getToDbClusterArn() == null ^ this.getToDbClusterArn() == null)
            return false;
        if (other.getToDbClusterArn() != null && other.getToDbClusterArn().equals(this.getToDbClusterArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFromDbClusterArn() == null) ? 0 : getFromDbClusterArn().hashCode());
        hashCode = prime * hashCode + ((getToDbClusterArn() == null) ? 0 : getToDbClusterArn().hashCode());
        return hashCode;
    }

    @Override
    public FailoverState clone() {
        try {
            return (FailoverState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
