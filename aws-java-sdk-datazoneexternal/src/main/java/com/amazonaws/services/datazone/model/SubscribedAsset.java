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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the asset for which the subscription grant is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SubscribedAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribedAsset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the asset for which the subscription grant is created.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The revision of the asset for which the subscription grant is created.
     * </p>
     */
    private String assetRevision;
    /**
     * <p>
     * The failure cause included in the details of the asset for which the subscription grant is created.
     * </p>
     */
    private FailureCause failureCause;
    /**
     * <p>
     * The failure timestamp included in the details of the asset for which the subscription grant is created.
     * </p>
     */
    private java.util.Date failureTimestamp;
    /**
     * <p>
     * The timestamp of when the subscription grant to the asset is created.
     * </p>
     */
    private java.util.Date grantedTimestamp;
    /**
     * <p>
     * The status of the asset for which the subscription grant is created.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The target name of the asset for which the subscription grant is created.
     * </p>
     */
    private String targetName;

    /**
     * <p>
     * The identifier of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param assetId
     *        The identifier of the asset for which the subscription grant is created.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The identifier of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The identifier of the asset for which the subscription grant is created.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The identifier of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param assetId
     *        The identifier of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAsset withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The revision of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param assetRevision
     *        The revision of the asset for which the subscription grant is created.
     */

    public void setAssetRevision(String assetRevision) {
        this.assetRevision = assetRevision;
    }

    /**
     * <p>
     * The revision of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The revision of the asset for which the subscription grant is created.
     */

    public String getAssetRevision() {
        return this.assetRevision;
    }

    /**
     * <p>
     * The revision of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param assetRevision
     *        The revision of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAsset withAssetRevision(String assetRevision) {
        setAssetRevision(assetRevision);
        return this;
    }

    /**
     * <p>
     * The failure cause included in the details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param failureCause
     *        The failure cause included in the details of the asset for which the subscription grant is created.
     */

    public void setFailureCause(FailureCause failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * The failure cause included in the details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The failure cause included in the details of the asset for which the subscription grant is created.
     */

    public FailureCause getFailureCause() {
        return this.failureCause;
    }

    /**
     * <p>
     * The failure cause included in the details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param failureCause
     *        The failure cause included in the details of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAsset withFailureCause(FailureCause failureCause) {
        setFailureCause(failureCause);
        return this;
    }

    /**
     * <p>
     * The failure timestamp included in the details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param failureTimestamp
     *        The failure timestamp included in the details of the asset for which the subscription grant is created.
     */

    public void setFailureTimestamp(java.util.Date failureTimestamp) {
        this.failureTimestamp = failureTimestamp;
    }

    /**
     * <p>
     * The failure timestamp included in the details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The failure timestamp included in the details of the asset for which the subscription grant is created.
     */

    public java.util.Date getFailureTimestamp() {
        return this.failureTimestamp;
    }

    /**
     * <p>
     * The failure timestamp included in the details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param failureTimestamp
     *        The failure timestamp included in the details of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAsset withFailureTimestamp(java.util.Date failureTimestamp) {
        setFailureTimestamp(failureTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant to the asset is created.
     * </p>
     * 
     * @param grantedTimestamp
     *        The timestamp of when the subscription grant to the asset is created.
     */

    public void setGrantedTimestamp(java.util.Date grantedTimestamp) {
        this.grantedTimestamp = grantedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant to the asset is created.
     * </p>
     * 
     * @return The timestamp of when the subscription grant to the asset is created.
     */

    public java.util.Date getGrantedTimestamp() {
        return this.grantedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant to the asset is created.
     * </p>
     * 
     * @param grantedTimestamp
     *        The timestamp of when the subscription grant to the asset is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAsset withGrantedTimestamp(java.util.Date grantedTimestamp) {
        setGrantedTimestamp(grantedTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param status
     *        The status of the asset for which the subscription grant is created.
     * @see SubscriptionGrantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The status of the asset for which the subscription grant is created.
     * @see SubscriptionGrantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param status
     *        The status of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionGrantStatus
     */

    public SubscribedAsset withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param status
     *        The status of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionGrantStatus
     */

    public SubscribedAsset withStatus(SubscriptionGrantStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target name of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param targetName
     *        The target name of the asset for which the subscription grant is created.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The target name of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The target name of the asset for which the subscription grant is created.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The target name of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param targetName
     *        The target name of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedAsset withTargetName(String targetName) {
        setTargetName(targetName);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetRevision() != null)
            sb.append("AssetRevision: ").append(getAssetRevision()).append(",");
        if (getFailureCause() != null)
            sb.append("FailureCause: ").append(getFailureCause()).append(",");
        if (getFailureTimestamp() != null)
            sb.append("FailureTimestamp: ").append(getFailureTimestamp()).append(",");
        if (getGrantedTimestamp() != null)
            sb.append("GrantedTimestamp: ").append(getGrantedTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribedAsset == false)
            return false;
        SubscribedAsset other = (SubscribedAsset) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetRevision() == null ^ this.getAssetRevision() == null)
            return false;
        if (other.getAssetRevision() != null && other.getAssetRevision().equals(this.getAssetRevision()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        if (other.getFailureTimestamp() == null ^ this.getFailureTimestamp() == null)
            return false;
        if (other.getFailureTimestamp() != null && other.getFailureTimestamp().equals(this.getFailureTimestamp()) == false)
            return false;
        if (other.getGrantedTimestamp() == null ^ this.getGrantedTimestamp() == null)
            return false;
        if (other.getGrantedTimestamp() != null && other.getGrantedTimestamp().equals(this.getGrantedTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetRevision() == null) ? 0 : getAssetRevision().hashCode());
        hashCode = prime * hashCode + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        hashCode = prime * hashCode + ((getFailureTimestamp() == null) ? 0 : getFailureTimestamp().hashCode());
        hashCode = prime * hashCode + ((getGrantedTimestamp() == null) ? 0 : getGrantedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        return hashCode;
    }

    @Override
    public SubscribedAsset clone() {
        try {
            return (SubscribedAsset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SubscribedAssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
