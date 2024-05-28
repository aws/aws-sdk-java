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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
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
     * The maximum number of results to return in this request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxClustersRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
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

    public ListKxClustersRequest withClusterType(String clusterType) {
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

    public ListKxClustersRequest withClusterType(KxClusterType clusterType) {
        this.clusterType = clusterType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @return The maximum number of results to return in this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxClustersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxClustersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKxClustersRequest == false)
            return false;
        ListKxClustersRequest other = (ListKxClustersRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxClustersRequest clone() {
        return (ListKxClustersRequest) super.clone();
    }

}
