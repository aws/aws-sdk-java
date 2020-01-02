/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUpdateActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUpdateActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The replication group IDs
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replicationGroupIds;
    /**
     * <p>
     * The cache cluster IDs
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheClusterIds;
    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceUpdateStatus;
    /**
     * <p>
     * The range of time specified to search for service updates that are in available status
     * </p>
     */
    private TimeRangeFilter serviceUpdateTimeRange;
    /**
     * <p>
     * The status of the update action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> updateActionStatus;
    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     */
    private Boolean showNodeLevelUpdateStatus;
    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * 
     * @return The replication group IDs
     */

    public java.util.List<String> getReplicationGroupIds() {
        if (replicationGroupIds == null) {
            replicationGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replicationGroupIds;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * 
     * @param replicationGroupIds
     *        The replication group IDs
     */

    public void setReplicationGroupIds(java.util.Collection<String> replicationGroupIds) {
        if (replicationGroupIds == null) {
            this.replicationGroupIds = null;
            return;
        }

        this.replicationGroupIds = new com.amazonaws.internal.SdkInternalList<String>(replicationGroupIds);
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationGroupIds(java.util.Collection)} or {@link #withReplicationGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicationGroupIds
     *        The replication group IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withReplicationGroupIds(String... replicationGroupIds) {
        if (this.replicationGroupIds == null) {
            setReplicationGroupIds(new com.amazonaws.internal.SdkInternalList<String>(replicationGroupIds.length));
        }
        for (String ele : replicationGroupIds) {
            this.replicationGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * 
     * @param replicationGroupIds
     *        The replication group IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withReplicationGroupIds(java.util.Collection<String> replicationGroupIds) {
        setReplicationGroupIds(replicationGroupIds);
        return this;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * 
     * @return The cache cluster IDs
     */

    public java.util.List<String> getCacheClusterIds() {
        if (cacheClusterIds == null) {
            cacheClusterIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheClusterIds;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * 
     * @param cacheClusterIds
     *        The cache cluster IDs
     */

    public void setCacheClusterIds(java.util.Collection<String> cacheClusterIds) {
        if (cacheClusterIds == null) {
            this.cacheClusterIds = null;
            return;
        }

        this.cacheClusterIds = new com.amazonaws.internal.SdkInternalList<String>(cacheClusterIds);
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheClusterIds(java.util.Collection)} or {@link #withCacheClusterIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cacheClusterIds
     *        The cache cluster IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withCacheClusterIds(String... cacheClusterIds) {
        if (this.cacheClusterIds == null) {
            setCacheClusterIds(new com.amazonaws.internal.SdkInternalList<String>(cacheClusterIds.length));
        }
        for (String ele : cacheClusterIds) {
            this.cacheClusterIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * 
     * @param cacheClusterIds
     *        The cache cluster IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withCacheClusterIds(java.util.Collection<String> cacheClusterIds) {
        setCacheClusterIds(cacheClusterIds);
        return this;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @param engine
     *        The Elasticache engine to which the update applies. Either Redis or Memcached
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @return The Elasticache engine to which the update applies. Either Redis or Memcached
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @param engine
     *        The Elasticache engine to which the update applies. Either Redis or Memcached
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @return The status of the service update
     * @see ServiceUpdateStatus
     */

    public java.util.List<String> getServiceUpdateStatus() {
        if (serviceUpdateStatus == null) {
            serviceUpdateStatus = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @see ServiceUpdateStatus
     */

    public void setServiceUpdateStatus(java.util.Collection<String> serviceUpdateStatus) {
        if (serviceUpdateStatus == null) {
            this.serviceUpdateStatus = null;
            return;
        }

        this.serviceUpdateStatus = new com.amazonaws.internal.SdkInternalList<String>(serviceUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceUpdateStatus(java.util.Collection)} or {@link #withServiceUpdateStatus(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeUpdateActionsRequest withServiceUpdateStatus(String... serviceUpdateStatus) {
        if (this.serviceUpdateStatus == null) {
            setServiceUpdateStatus(new com.amazonaws.internal.SdkInternalList<String>(serviceUpdateStatus.length));
        }
        for (String ele : serviceUpdateStatus) {
            this.serviceUpdateStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeUpdateActionsRequest withServiceUpdateStatus(java.util.Collection<String> serviceUpdateStatus) {
        setServiceUpdateStatus(serviceUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeUpdateActionsRequest withServiceUpdateStatus(ServiceUpdateStatus... serviceUpdateStatus) {
        com.amazonaws.internal.SdkInternalList<String> serviceUpdateStatusCopy = new com.amazonaws.internal.SdkInternalList<String>(serviceUpdateStatus.length);
        for (ServiceUpdateStatus value : serviceUpdateStatus) {
            serviceUpdateStatusCopy.add(value.toString());
        }
        if (getServiceUpdateStatus() == null) {
            setServiceUpdateStatus(serviceUpdateStatusCopy);
        } else {
            getServiceUpdateStatus().addAll(serviceUpdateStatusCopy);
        }
        return this;
    }

    /**
     * <p>
     * The range of time specified to search for service updates that are in available status
     * </p>
     * 
     * @param serviceUpdateTimeRange
     *        The range of time specified to search for service updates that are in available status
     */

    public void setServiceUpdateTimeRange(TimeRangeFilter serviceUpdateTimeRange) {
        this.serviceUpdateTimeRange = serviceUpdateTimeRange;
    }

    /**
     * <p>
     * The range of time specified to search for service updates that are in available status
     * </p>
     * 
     * @return The range of time specified to search for service updates that are in available status
     */

    public TimeRangeFilter getServiceUpdateTimeRange() {
        return this.serviceUpdateTimeRange;
    }

    /**
     * <p>
     * The range of time specified to search for service updates that are in available status
     * </p>
     * 
     * @param serviceUpdateTimeRange
     *        The range of time specified to search for service updates that are in available status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withServiceUpdateTimeRange(TimeRangeFilter serviceUpdateTimeRange) {
        setServiceUpdateTimeRange(serviceUpdateTimeRange);
        return this;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * 
     * @return The status of the update action.
     * @see UpdateActionStatus
     */

    public java.util.List<String> getUpdateActionStatus() {
        if (updateActionStatus == null) {
            updateActionStatus = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action.
     * @see UpdateActionStatus
     */

    public void setUpdateActionStatus(java.util.Collection<String> updateActionStatus) {
        if (updateActionStatus == null) {
            this.updateActionStatus = null;
            return;
        }

        this.updateActionStatus = new com.amazonaws.internal.SdkInternalList<String>(updateActionStatus);
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateActionStatus(java.util.Collection)} or {@link #withUpdateActionStatus(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public DescribeUpdateActionsRequest withUpdateActionStatus(String... updateActionStatus) {
        if (this.updateActionStatus == null) {
            setUpdateActionStatus(new com.amazonaws.internal.SdkInternalList<String>(updateActionStatus.length));
        }
        for (String ele : updateActionStatus) {
            this.updateActionStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public DescribeUpdateActionsRequest withUpdateActionStatus(java.util.Collection<String> updateActionStatus) {
        setUpdateActionStatus(updateActionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the update action.
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public DescribeUpdateActionsRequest withUpdateActionStatus(UpdateActionStatus... updateActionStatus) {
        com.amazonaws.internal.SdkInternalList<String> updateActionStatusCopy = new com.amazonaws.internal.SdkInternalList<String>(updateActionStatus.length);
        for (UpdateActionStatus value : updateActionStatus) {
            updateActionStatusCopy.add(value.toString());
        }
        if (getUpdateActionStatus() == null) {
            setUpdateActionStatus(updateActionStatusCopy);
        } else {
            getUpdateActionStatus().addAll(updateActionStatusCopy);
        }
        return this;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     * 
     * @param showNodeLevelUpdateStatus
     *        Dictates whether to include node level update status in the response
     */

    public void setShowNodeLevelUpdateStatus(Boolean showNodeLevelUpdateStatus) {
        this.showNodeLevelUpdateStatus = showNodeLevelUpdateStatus;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     * 
     * @return Dictates whether to include node level update status in the response
     */

    public Boolean getShowNodeLevelUpdateStatus() {
        return this.showNodeLevelUpdateStatus;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     * 
     * @param showNodeLevelUpdateStatus
     *        Dictates whether to include node level update status in the response
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withShowNodeLevelUpdateStatus(Boolean showNodeLevelUpdateStatus) {
        setShowNodeLevelUpdateStatus(showNodeLevelUpdateStatus);
        return this;
    }

    /**
     * <p>
     * Dictates whether to include node level update status in the response
     * </p>
     * 
     * @return Dictates whether to include node level update status in the response
     */

    public Boolean isShowNodeLevelUpdateStatus() {
        return this.showNodeLevelUpdateStatus;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * 
     * @return The maximum number of records to include in the response
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getReplicationGroupIds() != null)
            sb.append("ReplicationGroupIds: ").append(getReplicationGroupIds()).append(",");
        if (getCacheClusterIds() != null)
            sb.append("CacheClusterIds: ").append(getCacheClusterIds()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: ").append(getServiceUpdateStatus()).append(",");
        if (getServiceUpdateTimeRange() != null)
            sb.append("ServiceUpdateTimeRange: ").append(getServiceUpdateTimeRange()).append(",");
        if (getUpdateActionStatus() != null)
            sb.append("UpdateActionStatus: ").append(getUpdateActionStatus()).append(",");
        if (getShowNodeLevelUpdateStatus() != null)
            sb.append("ShowNodeLevelUpdateStatus: ").append(getShowNodeLevelUpdateStatus()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUpdateActionsRequest == false)
            return false;
        DescribeUpdateActionsRequest other = (DescribeUpdateActionsRequest) obj;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getReplicationGroupIds() == null ^ this.getReplicationGroupIds() == null)
            return false;
        if (other.getReplicationGroupIds() != null && other.getReplicationGroupIds().equals(this.getReplicationGroupIds()) == false)
            return false;
        if (other.getCacheClusterIds() == null ^ this.getCacheClusterIds() == null)
            return false;
        if (other.getCacheClusterIds() != null && other.getCacheClusterIds().equals(this.getCacheClusterIds()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getServiceUpdateTimeRange() == null ^ this.getServiceUpdateTimeRange() == null)
            return false;
        if (other.getServiceUpdateTimeRange() != null && other.getServiceUpdateTimeRange().equals(this.getServiceUpdateTimeRange()) == false)
            return false;
        if (other.getUpdateActionStatus() == null ^ this.getUpdateActionStatus() == null)
            return false;
        if (other.getUpdateActionStatus() != null && other.getUpdateActionStatus().equals(this.getUpdateActionStatus()) == false)
            return false;
        if (other.getShowNodeLevelUpdateStatus() == null ^ this.getShowNodeLevelUpdateStatus() == null)
            return false;
        if (other.getShowNodeLevelUpdateStatus() != null && other.getShowNodeLevelUpdateStatus().equals(this.getShowNodeLevelUpdateStatus()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupIds() == null) ? 0 : getReplicationGroupIds().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterIds() == null) ? 0 : getCacheClusterIds().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateTimeRange() == null) ? 0 : getServiceUpdateTimeRange().hashCode());
        hashCode = prime * hashCode + ((getUpdateActionStatus() == null) ? 0 : getUpdateActionStatus().hashCode());
        hashCode = prime * hashCode + ((getShowNodeLevelUpdateStatus() == null) ? 0 : getShowNodeLevelUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUpdateActionsRequest clone() {
        return (DescribeUpdateActionsRequest) super.clone();
    }

}
