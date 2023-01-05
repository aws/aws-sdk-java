/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Reserved-node status details, such as the source reserved-node identifier, the target reserved-node identifier, the
 * node type, the node count, and other details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ReservedNodeExchangeStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeExchangeStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     */
    private String reservedNodeExchangeRequestId;
    /**
     * <p>
     * The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A date and time that indicate when the reserved-node exchange was requested.
     * </p>
     */
    private java.util.Date requestTime;
    /**
     * <p>
     * The identifier of the source reserved node.
     * </p>
     */
    private String sourceReservedNodeId;
    /**
     * <p>
     * The source reserved-node type, for example ds2.xlarge.
     * </p>
     */
    private String sourceReservedNodeType;
    /**
     * <p>
     * The source reserved-node count in the cluster.
     * </p>
     */
    private Integer sourceReservedNodeCount;
    /**
     * <p>
     * The identifier of the target reserved node offering.
     * </p>
     */
    private String targetReservedNodeOfferingId;
    /**
     * <p>
     * The node type of the target reserved node, for example ra3.4xlarge.
     * </p>
     */
    private String targetReservedNodeType;
    /**
     * <p>
     * The count of target reserved nodes in the cluster.
     * </p>
     */
    private Integer targetReservedNodeCount;

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     * 
     * @param reservedNodeExchangeRequestId
     *        The identifier of the reserved-node exchange request.
     */

    public void setReservedNodeExchangeRequestId(String reservedNodeExchangeRequestId) {
        this.reservedNodeExchangeRequestId = reservedNodeExchangeRequestId;
    }

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     * 
     * @return The identifier of the reserved-node exchange request.
     */

    public String getReservedNodeExchangeRequestId() {
        return this.reservedNodeExchangeRequestId;
    }

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     * 
     * @param reservedNodeExchangeRequestId
     *        The identifier of the reserved-node exchange request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withReservedNodeExchangeRequestId(String reservedNodeExchangeRequestId) {
        setReservedNodeExchangeRequestId(reservedNodeExchangeRequestId);
        return this;
    }

    /**
     * <p>
     * The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * </p>
     * 
     * @param status
     *        The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * @see ReservedNodeExchangeStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * </p>
     * 
     * @return The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * @see ReservedNodeExchangeStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * </p>
     * 
     * @param status
     *        The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeExchangeStatusType
     */

    public ReservedNodeExchangeStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * </p>
     * 
     * @param status
     *        The status of the reserved-node exchange request. Statuses include in-progress and requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeExchangeStatusType
     */

    public ReservedNodeExchangeStatus withStatus(ReservedNodeExchangeStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A date and time that indicate when the reserved-node exchange was requested.
     * </p>
     * 
     * @param requestTime
     *        A date and time that indicate when the reserved-node exchange was requested.
     */

    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * <p>
     * A date and time that indicate when the reserved-node exchange was requested.
     * </p>
     * 
     * @return A date and time that indicate when the reserved-node exchange was requested.
     */

    public java.util.Date getRequestTime() {
        return this.requestTime;
    }

    /**
     * <p>
     * A date and time that indicate when the reserved-node exchange was requested.
     * </p>
     * 
     * @param requestTime
     *        A date and time that indicate when the reserved-node exchange was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withRequestTime(java.util.Date requestTime) {
        setRequestTime(requestTime);
        return this;
    }

    /**
     * <p>
     * The identifier of the source reserved node.
     * </p>
     * 
     * @param sourceReservedNodeId
     *        The identifier of the source reserved node.
     */

    public void setSourceReservedNodeId(String sourceReservedNodeId) {
        this.sourceReservedNodeId = sourceReservedNodeId;
    }

    /**
     * <p>
     * The identifier of the source reserved node.
     * </p>
     * 
     * @return The identifier of the source reserved node.
     */

    public String getSourceReservedNodeId() {
        return this.sourceReservedNodeId;
    }

    /**
     * <p>
     * The identifier of the source reserved node.
     * </p>
     * 
     * @param sourceReservedNodeId
     *        The identifier of the source reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withSourceReservedNodeId(String sourceReservedNodeId) {
        setSourceReservedNodeId(sourceReservedNodeId);
        return this;
    }

    /**
     * <p>
     * The source reserved-node type, for example ds2.xlarge.
     * </p>
     * 
     * @param sourceReservedNodeType
     *        The source reserved-node type, for example ds2.xlarge.
     */

    public void setSourceReservedNodeType(String sourceReservedNodeType) {
        this.sourceReservedNodeType = sourceReservedNodeType;
    }

    /**
     * <p>
     * The source reserved-node type, for example ds2.xlarge.
     * </p>
     * 
     * @return The source reserved-node type, for example ds2.xlarge.
     */

    public String getSourceReservedNodeType() {
        return this.sourceReservedNodeType;
    }

    /**
     * <p>
     * The source reserved-node type, for example ds2.xlarge.
     * </p>
     * 
     * @param sourceReservedNodeType
     *        The source reserved-node type, for example ds2.xlarge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withSourceReservedNodeType(String sourceReservedNodeType) {
        setSourceReservedNodeType(sourceReservedNodeType);
        return this;
    }

    /**
     * <p>
     * The source reserved-node count in the cluster.
     * </p>
     * 
     * @param sourceReservedNodeCount
     *        The source reserved-node count in the cluster.
     */

    public void setSourceReservedNodeCount(Integer sourceReservedNodeCount) {
        this.sourceReservedNodeCount = sourceReservedNodeCount;
    }

    /**
     * <p>
     * The source reserved-node count in the cluster.
     * </p>
     * 
     * @return The source reserved-node count in the cluster.
     */

    public Integer getSourceReservedNodeCount() {
        return this.sourceReservedNodeCount;
    }

    /**
     * <p>
     * The source reserved-node count in the cluster.
     * </p>
     * 
     * @param sourceReservedNodeCount
     *        The source reserved-node count in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withSourceReservedNodeCount(Integer sourceReservedNodeCount) {
        setSourceReservedNodeCount(sourceReservedNodeCount);
        return this;
    }

    /**
     * <p>
     * The identifier of the target reserved node offering.
     * </p>
     * 
     * @param targetReservedNodeOfferingId
     *        The identifier of the target reserved node offering.
     */

    public void setTargetReservedNodeOfferingId(String targetReservedNodeOfferingId) {
        this.targetReservedNodeOfferingId = targetReservedNodeOfferingId;
    }

    /**
     * <p>
     * The identifier of the target reserved node offering.
     * </p>
     * 
     * @return The identifier of the target reserved node offering.
     */

    public String getTargetReservedNodeOfferingId() {
        return this.targetReservedNodeOfferingId;
    }

    /**
     * <p>
     * The identifier of the target reserved node offering.
     * </p>
     * 
     * @param targetReservedNodeOfferingId
     *        The identifier of the target reserved node offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withTargetReservedNodeOfferingId(String targetReservedNodeOfferingId) {
        setTargetReservedNodeOfferingId(targetReservedNodeOfferingId);
        return this;
    }

    /**
     * <p>
     * The node type of the target reserved node, for example ra3.4xlarge.
     * </p>
     * 
     * @param targetReservedNodeType
     *        The node type of the target reserved node, for example ra3.4xlarge.
     */

    public void setTargetReservedNodeType(String targetReservedNodeType) {
        this.targetReservedNodeType = targetReservedNodeType;
    }

    /**
     * <p>
     * The node type of the target reserved node, for example ra3.4xlarge.
     * </p>
     * 
     * @return The node type of the target reserved node, for example ra3.4xlarge.
     */

    public String getTargetReservedNodeType() {
        return this.targetReservedNodeType;
    }

    /**
     * <p>
     * The node type of the target reserved node, for example ra3.4xlarge.
     * </p>
     * 
     * @param targetReservedNodeType
     *        The node type of the target reserved node, for example ra3.4xlarge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withTargetReservedNodeType(String targetReservedNodeType) {
        setTargetReservedNodeType(targetReservedNodeType);
        return this;
    }

    /**
     * <p>
     * The count of target reserved nodes in the cluster.
     * </p>
     * 
     * @param targetReservedNodeCount
     *        The count of target reserved nodes in the cluster.
     */

    public void setTargetReservedNodeCount(Integer targetReservedNodeCount) {
        this.targetReservedNodeCount = targetReservedNodeCount;
    }

    /**
     * <p>
     * The count of target reserved nodes in the cluster.
     * </p>
     * 
     * @return The count of target reserved nodes in the cluster.
     */

    public Integer getTargetReservedNodeCount() {
        return this.targetReservedNodeCount;
    }

    /**
     * <p>
     * The count of target reserved nodes in the cluster.
     * </p>
     * 
     * @param targetReservedNodeCount
     *        The count of target reserved nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodeExchangeStatus withTargetReservedNodeCount(Integer targetReservedNodeCount) {
        setTargetReservedNodeCount(targetReservedNodeCount);
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
        if (getReservedNodeExchangeRequestId() != null)
            sb.append("ReservedNodeExchangeRequestId: ").append(getReservedNodeExchangeRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestTime() != null)
            sb.append("RequestTime: ").append(getRequestTime()).append(",");
        if (getSourceReservedNodeId() != null)
            sb.append("SourceReservedNodeId: ").append(getSourceReservedNodeId()).append(",");
        if (getSourceReservedNodeType() != null)
            sb.append("SourceReservedNodeType: ").append(getSourceReservedNodeType()).append(",");
        if (getSourceReservedNodeCount() != null)
            sb.append("SourceReservedNodeCount: ").append(getSourceReservedNodeCount()).append(",");
        if (getTargetReservedNodeOfferingId() != null)
            sb.append("TargetReservedNodeOfferingId: ").append(getTargetReservedNodeOfferingId()).append(",");
        if (getTargetReservedNodeType() != null)
            sb.append("TargetReservedNodeType: ").append(getTargetReservedNodeType()).append(",");
        if (getTargetReservedNodeCount() != null)
            sb.append("TargetReservedNodeCount: ").append(getTargetReservedNodeCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedNodeExchangeStatus == false)
            return false;
        ReservedNodeExchangeStatus other = (ReservedNodeExchangeStatus) obj;
        if (other.getReservedNodeExchangeRequestId() == null ^ this.getReservedNodeExchangeRequestId() == null)
            return false;
        if (other.getReservedNodeExchangeRequestId() != null
                && other.getReservedNodeExchangeRequestId().equals(this.getReservedNodeExchangeRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getSourceReservedNodeId() == null ^ this.getSourceReservedNodeId() == null)
            return false;
        if (other.getSourceReservedNodeId() != null && other.getSourceReservedNodeId().equals(this.getSourceReservedNodeId()) == false)
            return false;
        if (other.getSourceReservedNodeType() == null ^ this.getSourceReservedNodeType() == null)
            return false;
        if (other.getSourceReservedNodeType() != null && other.getSourceReservedNodeType().equals(this.getSourceReservedNodeType()) == false)
            return false;
        if (other.getSourceReservedNodeCount() == null ^ this.getSourceReservedNodeCount() == null)
            return false;
        if (other.getSourceReservedNodeCount() != null && other.getSourceReservedNodeCount().equals(this.getSourceReservedNodeCount()) == false)
            return false;
        if (other.getTargetReservedNodeOfferingId() == null ^ this.getTargetReservedNodeOfferingId() == null)
            return false;
        if (other.getTargetReservedNodeOfferingId() != null && other.getTargetReservedNodeOfferingId().equals(this.getTargetReservedNodeOfferingId()) == false)
            return false;
        if (other.getTargetReservedNodeType() == null ^ this.getTargetReservedNodeType() == null)
            return false;
        if (other.getTargetReservedNodeType() != null && other.getTargetReservedNodeType().equals(this.getTargetReservedNodeType()) == false)
            return false;
        if (other.getTargetReservedNodeCount() == null ^ this.getTargetReservedNodeCount() == null)
            return false;
        if (other.getTargetReservedNodeCount() != null && other.getTargetReservedNodeCount().equals(this.getTargetReservedNodeCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNodeExchangeRequestId() == null) ? 0 : getReservedNodeExchangeRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode + ((getSourceReservedNodeId() == null) ? 0 : getSourceReservedNodeId().hashCode());
        hashCode = prime * hashCode + ((getSourceReservedNodeType() == null) ? 0 : getSourceReservedNodeType().hashCode());
        hashCode = prime * hashCode + ((getSourceReservedNodeCount() == null) ? 0 : getSourceReservedNodeCount().hashCode());
        hashCode = prime * hashCode + ((getTargetReservedNodeOfferingId() == null) ? 0 : getTargetReservedNodeOfferingId().hashCode());
        hashCode = prime * hashCode + ((getTargetReservedNodeType() == null) ? 0 : getTargetReservedNodeType().hashCode());
        hashCode = prime * hashCode + ((getTargetReservedNodeCount() == null) ? 0 : getTargetReservedNodeCount().hashCode());
        return hashCode;
    }

    @Override
    public ReservedNodeExchangeStatus clone() {
        try {
            return (ReservedNodeExchangeStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
