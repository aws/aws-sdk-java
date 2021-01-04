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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name, Arn, <code>CreationTime</code>, <code>FeatureGroup</code> values, <code>LastUpdatedTime</code> and
 * <code>EnableOnlineStorage</code> status of a <code>FeatureGroup</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FeatureGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of <code>FeatureGroup</code>.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * Unique identifier for the <code>FeatureGroup</code>.
     * </p>
     */
    private String featureGroupArn;
    /**
     * <p>
     * A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>, <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * </p>
     */
    private String featureGroupStatus;
    /**
     * <p>
     * Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     * <code>Active</code> or <code>Blocked</code>.
     * </p>
     */
    private OfflineStoreStatus offlineStoreStatus;

    /**
     * <p>
     * The name of <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupName
     *        The name of <code>FeatureGroup</code>.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of <code>FeatureGroup</code>.
     * </p>
     * 
     * @return The name of <code>FeatureGroup</code>.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupName
     *        The name of <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroupSummary withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupArn
     *        Unique identifier for the <code>FeatureGroup</code>.
     */

    public void setFeatureGroupArn(String featureGroupArn) {
        this.featureGroupArn = featureGroupArn;
    }

    /**
     * <p>
     * Unique identifier for the <code>FeatureGroup</code>.
     * </p>
     * 
     * @return Unique identifier for the <code>FeatureGroup</code>.
     */

    public String getFeatureGroupArn() {
        return this.featureGroupArn;
    }

    /**
     * <p>
     * Unique identifier for the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupArn
     *        Unique identifier for the <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroupSummary withFeatureGroupArn(String featureGroupArn) {
        setFeatureGroupArn(featureGroupArn);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @return A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating the time of creation time of the <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroupSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>, <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * </p>
     * 
     * @param featureGroupStatus
     *        The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>,
     *        <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * @see FeatureGroupStatus
     */

    public void setFeatureGroupStatus(String featureGroupStatus) {
        this.featureGroupStatus = featureGroupStatus;
    }

    /**
     * <p>
     * The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>, <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * </p>
     * 
     * @return The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>,
     *         <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * @see FeatureGroupStatus
     */

    public String getFeatureGroupStatus() {
        return this.featureGroupStatus;
    }

    /**
     * <p>
     * The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>, <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * </p>
     * 
     * @param featureGroupStatus
     *        The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>,
     *        <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public FeatureGroupSummary withFeatureGroupStatus(String featureGroupStatus) {
        setFeatureGroupStatus(featureGroupStatus);
        return this;
    }

    /**
     * <p>
     * The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>, <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * </p>
     * 
     * @param featureGroupStatus
     *        The status of a FeatureGroup. The status can be any of the following: <code>Creating</code>,
     *        <code>Created</code>, <code>CreateFail</code>, <code>Deleting</code> or <code>DetailFail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public FeatureGroupSummary withFeatureGroupStatus(FeatureGroupStatus featureGroupStatus) {
        this.featureGroupStatus = featureGroupStatus.toString();
        return this;
    }

    /**
     * <p>
     * Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     * <code>Active</code> or <code>Blocked</code>.
     * </p>
     * 
     * @param offlineStoreStatus
     *        Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     *        <code>Active</code> or <code>Blocked</code>.
     */

    public void setOfflineStoreStatus(OfflineStoreStatus offlineStoreStatus) {
        this.offlineStoreStatus = offlineStoreStatus;
    }

    /**
     * <p>
     * Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     * <code>Active</code> or <code>Blocked</code>.
     * </p>
     * 
     * @return Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     *         <code>Active</code> or <code>Blocked</code>.
     */

    public OfflineStoreStatus getOfflineStoreStatus() {
        return this.offlineStoreStatus;
    }

    /**
     * <p>
     * Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     * <code>Active</code> or <code>Blocked</code>.
     * </p>
     * 
     * @param offlineStoreStatus
     *        Notifies you if replicating data into the <code>OfflineStore</code> has failed. Returns either:
     *        <code>Active</code> or <code>Blocked</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroupSummary withOfflineStoreStatus(OfflineStoreStatus offlineStoreStatus) {
        setOfflineStoreStatus(offlineStoreStatus);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getFeatureGroupArn() != null)
            sb.append("FeatureGroupArn: ").append(getFeatureGroupArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFeatureGroupStatus() != null)
            sb.append("FeatureGroupStatus: ").append(getFeatureGroupStatus()).append(",");
        if (getOfflineStoreStatus() != null)
            sb.append("OfflineStoreStatus: ").append(getOfflineStoreStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureGroupSummary == false)
            return false;
        FeatureGroupSummary other = (FeatureGroupSummary) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getFeatureGroupArn() == null ^ this.getFeatureGroupArn() == null)
            return false;
        if (other.getFeatureGroupArn() != null && other.getFeatureGroupArn().equals(this.getFeatureGroupArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFeatureGroupStatus() == null ^ this.getFeatureGroupStatus() == null)
            return false;
        if (other.getFeatureGroupStatus() != null && other.getFeatureGroupStatus().equals(this.getFeatureGroupStatus()) == false)
            return false;
        if (other.getOfflineStoreStatus() == null ^ this.getOfflineStoreStatus() == null)
            return false;
        if (other.getOfflineStoreStatus() != null && other.getOfflineStoreStatus().equals(this.getOfflineStoreStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getFeatureGroupArn() == null) ? 0 : getFeatureGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFeatureGroupStatus() == null) ? 0 : getFeatureGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getOfflineStoreStatus() == null) ? 0 : getOfflineStoreStatus().hashCode());
        return hashCode;
    }

    @Override
    public FeatureGroupSummary clone() {
        try {
            return (FeatureGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FeatureGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
