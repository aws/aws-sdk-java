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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a kdb cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING –The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED– The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * A unique name for the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Specifies the type of KDB database that is being created. The following types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HDB – A Historical Database. The data is only accessible with read-only permissions from one of the FinSpace
     * managed kdb databases mounted to the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it in
     * memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This cluster
     * type requires local storage for temporary storage of data during the savedown process. If you specify this field
     * in your request, you must provide the <code>savedownStorageConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to create
     * your own routing logic using the initialization scripts and custom code. This type of cluster does not require a
     * writable local storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * GP – A general purpose cluster allows you to quickly iterate on code during development by granting greater
     * access to system commands and enabling a fast reload of custom code. This cluster type can optionally mount
     * databases including cache and savedown storage. For this cluster type, the node count is fixed at 1. It does not
     * support autoscaling and supports only <code>SINGLE</code> AZ mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It can
     * publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist messages to log,
     * which is readable by any RDB environment. It supports only single-node that is only one kdb process.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterType;
    /**
     * <p>
     * A description of the cluster.
     * </p>
     */
    private String clusterDescription;
    /**
     * <p>
     * A version of the FinSpace managed kdb to run.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * A list of volumes attached to the cluster.
     * </p>
     */
    private java.util.List<Volume> volumes;
    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     */
    private String initializationScript;
    /**
     * <p>
     * An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed when a
     * cluster attempts to access another cluster.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The number of availability zones assigned per cluster. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE</code> – Assigns one availability zone per cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI</code> – Assigns all the availability zones per cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String azMode;
    /**
     * <p>
     * The availability zone identifiers for the requested regions.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The status of a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING –The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED– The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING – The cluster is pending creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING –The cluster creation process is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED– The cluster creation process has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING – The cluster creation process is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The cluster is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The cluster is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The cluster has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The cluster failed to delete.
     *        </p>
     *        </li>
     * @see KxClusterStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING –The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED– The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of a cluster.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING – The cluster is pending creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATING –The cluster creation process is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_FAILED– The cluster creation process has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING – The cluster creation process is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The cluster is in the process of being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The cluster is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETED – The cluster has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_FAILED – The cluster failed to delete.
     *         </p>
     *         </li>
     * @see KxClusterStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING –The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED– The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING – The cluster is pending creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING –The cluster creation process is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED– The cluster creation process has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING – The cluster creation process is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The cluster is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The cluster is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The cluster has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The cluster failed to delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterStatus
     */

    public KxCluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING –The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED– The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING – The cluster is pending creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING –The cluster creation process is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED– The cluster creation process has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING – The cluster creation process is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The cluster is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The cluster is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The cluster has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The cluster failed to delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterStatus
     */

    public KxCluster withStatus(KxClusterStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @return The error message when a failed state occurs.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * A unique name for the cluster.
     * </p>
     * 
     * @param clusterName
     *        A unique name for the cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * A unique name for the cluster.
     * </p>
     * 
     * @return A unique name for the cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * A unique name for the cluster.
     * </p>
     * 
     * @param clusterName
     *        A unique name for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Specifies the type of KDB database that is being created. The following types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HDB – A Historical Database. The data is only accessible with read-only permissions from one of the FinSpace
     * managed kdb databases mounted to the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it in
     * memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This cluster
     * type requires local storage for temporary storage of data during the savedown process. If you specify this field
     * in your request, you must provide the <code>savedownStorageConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to create
     * your own routing logic using the initialization scripts and custom code. This type of cluster does not require a
     * writable local storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * GP – A general purpose cluster allows you to quickly iterate on code during development by granting greater
     * access to system commands and enabling a fast reload of custom code. This cluster type can optionally mount
     * databases including cache and savedown storage. For this cluster type, the node count is fixed at 1. It does not
     * support autoscaling and supports only <code>SINGLE</code> AZ mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It can
     * publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist messages to log,
     * which is readable by any RDB environment. It supports only single-node that is only one kdb process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterType
     *        Specifies the type of KDB database that is being created. The following types are available: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HDB – A Historical Database. The data is only accessible with read-only permissions from one of the
     *        FinSpace managed kdb databases mounted to the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it
     *        in memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This
     *        cluster type requires local storage for temporary storage of data during the savedown process. If you
     *        specify this field in your request, you must provide the <code>savedownStorageConfiguration</code>
     *        parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to
     *        create your own routing logic using the initialization scripts and custom code. This type of cluster does
     *        not require a writable local storage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GP – A general purpose cluster allows you to quickly iterate on code during development by granting
     *        greater access to system commands and enabling a fast reload of custom code. This cluster type can
     *        optionally mount databases including cache and savedown storage. For this cluster type, the node count is
     *        fixed at 1. It does not support autoscaling and supports only <code>SINGLE</code> AZ mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It
     *        can publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist
     *        messages to log, which is readable by any RDB environment. It supports only single-node that is only one
     *        kdb process.
     *        </p>
     *        </li>
     * @see KxClusterType
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * Specifies the type of KDB database that is being created. The following types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HDB – A Historical Database. The data is only accessible with read-only permissions from one of the FinSpace
     * managed kdb databases mounted to the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it in
     * memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This cluster
     * type requires local storage for temporary storage of data during the savedown process. If you specify this field
     * in your request, you must provide the <code>savedownStorageConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to create
     * your own routing logic using the initialization scripts and custom code. This type of cluster does not require a
     * writable local storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * GP – A general purpose cluster allows you to quickly iterate on code during development by granting greater
     * access to system commands and enabling a fast reload of custom code. This cluster type can optionally mount
     * databases including cache and savedown storage. For this cluster type, the node count is fixed at 1. It does not
     * support autoscaling and supports only <code>SINGLE</code> AZ mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It can
     * publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist messages to log,
     * which is readable by any RDB environment. It supports only single-node that is only one kdb process.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of KDB database that is being created. The following types are available: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         HDB – A Historical Database. The data is only accessible with read-only permissions from one of the
     *         FinSpace managed kdb databases mounted to the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it
     *         in memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This
     *         cluster type requires local storage for temporary storage of data during the savedown process. If you
     *         specify this field in your request, you must provide the <code>savedownStorageConfiguration</code>
     *         parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to
     *         create your own routing logic using the initialization scripts and custom code. This type of cluster does
     *         not require a writable local storage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GP – A general purpose cluster allows you to quickly iterate on code during development by granting
     *         greater access to system commands and enabling a fast reload of custom code. This cluster type can
     *         optionally mount databases including cache and savedown storage. For this cluster type, the node count is
     *         fixed at 1. It does not support autoscaling and supports only <code>SINGLE</code> AZ mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It
     *         can publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist
     *         messages to log, which is readable by any RDB environment. It supports only single-node that is only one
     *         kdb process.
     *         </p>
     *         </li>
     * @see KxClusterType
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * Specifies the type of KDB database that is being created. The following types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HDB – A Historical Database. The data is only accessible with read-only permissions from one of the FinSpace
     * managed kdb databases mounted to the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it in
     * memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This cluster
     * type requires local storage for temporary storage of data during the savedown process. If you specify this field
     * in your request, you must provide the <code>savedownStorageConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to create
     * your own routing logic using the initialization scripts and custom code. This type of cluster does not require a
     * writable local storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * GP – A general purpose cluster allows you to quickly iterate on code during development by granting greater
     * access to system commands and enabling a fast reload of custom code. This cluster type can optionally mount
     * databases including cache and savedown storage. For this cluster type, the node count is fixed at 1. It does not
     * support autoscaling and supports only <code>SINGLE</code> AZ mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It can
     * publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist messages to log,
     * which is readable by any RDB environment. It supports only single-node that is only one kdb process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterType
     *        Specifies the type of KDB database that is being created. The following types are available: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HDB – A Historical Database. The data is only accessible with read-only permissions from one of the
     *        FinSpace managed kdb databases mounted to the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it
     *        in memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This
     *        cluster type requires local storage for temporary storage of data during the savedown process. If you
     *        specify this field in your request, you must provide the <code>savedownStorageConfiguration</code>
     *        parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to
     *        create your own routing logic using the initialization scripts and custom code. This type of cluster does
     *        not require a writable local storage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GP – A general purpose cluster allows you to quickly iterate on code during development by granting
     *        greater access to system commands and enabling a fast reload of custom code. This cluster type can
     *        optionally mount databases including cache and savedown storage. For this cluster type, the node count is
     *        fixed at 1. It does not support autoscaling and supports only <code>SINGLE</code> AZ mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It
     *        can publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist
     *        messages to log, which is readable by any RDB environment. It supports only single-node that is only one
     *        kdb process.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterType
     */

    public KxCluster withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of KDB database that is being created. The following types are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HDB – A Historical Database. The data is only accessible with read-only permissions from one of the FinSpace
     * managed kdb databases mounted to the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it in
     * memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This cluster
     * type requires local storage for temporary storage of data during the savedown process. If you specify this field
     * in your request, you must provide the <code>savedownStorageConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to create
     * your own routing logic using the initialization scripts and custom code. This type of cluster does not require a
     * writable local storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * GP – A general purpose cluster allows you to quickly iterate on code during development by granting greater
     * access to system commands and enabling a fast reload of custom code. This cluster type can optionally mount
     * databases including cache and savedown storage. For this cluster type, the node count is fixed at 1. It does not
     * support autoscaling and supports only <code>SINGLE</code> AZ mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It can
     * publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist messages to log,
     * which is readable by any RDB environment. It supports only single-node that is only one kdb process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterType
     *        Specifies the type of KDB database that is being created. The following types are available: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HDB – A Historical Database. The data is only accessible with read-only permissions from one of the
     *        FinSpace managed kdb databases mounted to the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDB – A Realtime Database. This type of database captures all the data from a ticker plant and stores it
     *        in memory until the end of day, after which it writes all of its data to a disk and reloads the HDB. This
     *        cluster type requires local storage for temporary storage of data during the savedown process. If you
     *        specify this field in your request, you must provide the <code>savedownStorageConfiguration</code>
     *        parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GATEWAY – A gateway cluster allows you to access data across processes in kdb systems. It allows you to
     *        create your own routing logic using the initialization scripts and custom code. This type of cluster does
     *        not require a writable local storage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GP – A general purpose cluster allows you to quickly iterate on code during development by granting
     *        greater access to system commands and enabling a fast reload of custom code. This cluster type can
     *        optionally mount databases including cache and savedown storage. For this cluster type, the node count is
     *        fixed at 1. It does not support autoscaling and supports only <code>SINGLE</code> AZ mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tickerplant – A tickerplant cluster allows you to subscribe to feed handlers based on IAM permissions. It
     *        can publish to RDBs, other Tickerplants, and real-time subscribers (RTS). Tickerplants can persist
     *        messages to log, which is readable by any RDB environment. It supports only single-node that is only one
     *        kdb process.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterType
     */

    public KxCluster withClusterType(KxClusterType clusterType) {
        this.clusterType = clusterType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the cluster.
     * </p>
     * 
     * @param clusterDescription
     *        A description of the cluster.
     */

    public void setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
    }

    /**
     * <p>
     * A description of the cluster.
     * </p>
     * 
     * @return A description of the cluster.
     */

    public String getClusterDescription() {
        return this.clusterDescription;
    }

    /**
     * <p>
     * A description of the cluster.
     * </p>
     * 
     * @param clusterDescription
     *        A description of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withClusterDescription(String clusterDescription) {
        setClusterDescription(clusterDescription);
        return this;
    }

    /**
     * <p>
     * A version of the FinSpace managed kdb to run.
     * </p>
     * 
     * @param releaseLabel
     *        A version of the FinSpace managed kdb to run.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * A version of the FinSpace managed kdb to run.
     * </p>
     * 
     * @return A version of the FinSpace managed kdb to run.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * A version of the FinSpace managed kdb to run.
     * </p>
     * 
     * @param releaseLabel
     *        A version of the FinSpace managed kdb to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * A list of volumes attached to the cluster.
     * </p>
     * 
     * @return A list of volumes attached to the cluster.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * A list of volumes attached to the cluster.
     * </p>
     * 
     * @param volumes
     *        A list of volumes attached to the cluster.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * A list of volumes attached to the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volumes attached to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volumes attached to the cluster.
     * </p>
     * 
     * @param volumes
     *        A list of volumes attached to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * 
     * @param initializationScript
     *        Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i>
     *        file that contains the custom code, which will be loaded on the cluster. It must include the file name
     *        itself. For example, <code>somedir/init.q</code>.
     */

    public void setInitializationScript(String initializationScript) {
        this.initializationScript = initializationScript;
    }

    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * 
     * @return Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i>
     *         file that contains the custom code, which will be loaded on the cluster. It must include the file name
     *         itself. For example, <code>somedir/init.q</code>.
     */

    public String getInitializationScript() {
        return this.initializationScript;
    }

    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * 
     * @param initializationScript
     *        Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i>
     *        file that contains the custom code, which will be loaded on the cluster. It must include the file name
     *        itself. For example, <code>somedir/init.q</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withInitializationScript(String initializationScript) {
        setInitializationScript(initializationScript);
        return this;
    }

    /**
     * <p>
     * An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed when a
     * cluster attempts to access another cluster.
     * </p>
     * 
     * @param executionRole
     *        An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed
     *        when a cluster attempts to access another cluster.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed when a
     * cluster attempts to access another cluster.
     * </p>
     * 
     * @return An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed
     *         when a cluster attempts to access another cluster.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed when a
     * cluster attempts to access another cluster.
     * </p>
     * 
     * @param executionRole
     *        An IAM role that defines a set of permissions associated with a cluster. These permissions are assumed
     *        when a cluster attempts to access another cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The number of availability zones assigned per cluster. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE</code> – Assigns one availability zone per cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI</code> – Assigns all the availability zones per cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param azMode
     *        The number of availability zones assigned per cluster. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE</code> – Assigns one availability zone per cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI</code> – Assigns all the availability zones per cluster.
     *        </p>
     *        </li>
     * @see KxAzMode
     */

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    /**
     * <p>
     * The number of availability zones assigned per cluster. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE</code> – Assigns one availability zone per cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI</code> – Assigns all the availability zones per cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of availability zones assigned per cluster. This can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SINGLE</code> – Assigns one availability zone per cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MULTI</code> – Assigns all the availability zones per cluster.
     *         </p>
     *         </li>
     * @see KxAzMode
     */

    public String getAzMode() {
        return this.azMode;
    }

    /**
     * <p>
     * The number of availability zones assigned per cluster. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE</code> – Assigns one availability zone per cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI</code> – Assigns all the availability zones per cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param azMode
     *        The number of availability zones assigned per cluster. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE</code> – Assigns one availability zone per cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI</code> – Assigns all the availability zones per cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public KxCluster withAzMode(String azMode) {
        setAzMode(azMode);
        return this;
    }

    /**
     * <p>
     * The number of availability zones assigned per cluster. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE</code> – Assigns one availability zone per cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI</code> – Assigns all the availability zones per cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param azMode
     *        The number of availability zones assigned per cluster. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE</code> – Assigns one availability zone per cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI</code> – Assigns all the availability zones per cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public KxCluster withAzMode(KxAzMode azMode) {
        this.azMode = azMode.toString();
        return this;
    }

    /**
     * <p>
     * The availability zone identifiers for the requested regions.
     * </p>
     * 
     * @param availabilityZoneId
     *        The availability zone identifiers for the requested regions.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The availability zone identifiers for the requested regions.
     * </p>
     * 
     * @return The availability zone identifiers for the requested regions.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The availability zone identifiers for the requested regions.
     * </p>
     * 
     * @param availabilityZoneId
     *        The availability zone identifiers for the requested regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the cluster was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the cluster was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxCluster withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getClusterDescription() != null)
            sb.append("ClusterDescription: ").append(getClusterDescription()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getInitializationScript() != null)
            sb.append("InitializationScript: ").append(getInitializationScript()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getAzMode() != null)
            sb.append("AzMode: ").append(getAzMode()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxCluster == false)
            return false;
        KxCluster other = (KxCluster) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getClusterDescription() == null ^ this.getClusterDescription() == null)
            return false;
        if (other.getClusterDescription() != null && other.getClusterDescription().equals(this.getClusterDescription()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getInitializationScript() == null ^ this.getInitializationScript() == null)
            return false;
        if (other.getInitializationScript() != null && other.getInitializationScript().equals(this.getInitializationScript()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getAzMode() == null ^ this.getAzMode() == null)
            return false;
        if (other.getAzMode() != null && other.getAzMode().equals(this.getAzMode()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getClusterDescription() == null) ? 0 : getClusterDescription().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getInitializationScript() == null) ? 0 : getInitializationScript().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getAzMode() == null) ? 0 : getAzMode().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public KxCluster clone() {
        try {
            return (KxCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
