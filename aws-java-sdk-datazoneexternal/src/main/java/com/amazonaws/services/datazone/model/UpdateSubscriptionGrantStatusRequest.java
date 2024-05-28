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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionGrantStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionGrantStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the asset the subscription grant status of which is to be updated.
     * </p>
     */
    private String assetIdentifier;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private FailureCause failureCause;
    /**
     * <p>
     * The identifier of the subscription grant the status of which is to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     */
    private String targetName;

    /**
     * <p>
     * The identifier of the asset the subscription grant status of which is to be updated.
     * </p>
     * 
     * @param assetIdentifier
     *        The identifier of the asset the subscription grant status of which is to be updated.
     */

    public void setAssetIdentifier(String assetIdentifier) {
        this.assetIdentifier = assetIdentifier;
    }

    /**
     * <p>
     * The identifier of the asset the subscription grant status of which is to be updated.
     * </p>
     * 
     * @return The identifier of the asset the subscription grant status of which is to be updated.
     */

    public String getAssetIdentifier() {
        return this.assetIdentifier;
    }

    /**
     * <p>
     * The identifier of the asset the subscription grant status of which is to be updated.
     * </p>
     * 
     * @param assetIdentifier
     *        The identifier of the asset the subscription grant status of which is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusRequest withAssetIdentifier(String assetIdentifier) {
        setAssetIdentifier(assetIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param failureCause
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public void setFailureCause(FailureCause failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public FailureCause getFailureCause() {
        return this.failureCause;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param failureCause
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusRequest withFailureCause(FailureCause failureCause) {
        setFailureCause(failureCause);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription grant the status of which is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the subscription grant the status of which is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the subscription grant the status of which is to be updated.
     * </p>
     * 
     * @return The identifier of the subscription grant the status of which is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the subscription grant the status of which is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the subscription grant the status of which is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @see SubscriptionGrantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @return The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @see SubscriptionGrantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionGrantStatus
     */

    public UpdateSubscriptionGrantStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionGrantStatus
     */

    public UpdateSubscriptionGrantStatusRequest withStatus(SubscriptionGrantStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param targetName
     *        The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @return The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param targetName
     *        The target name to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusRequest withTargetName(String targetName) {
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
        if (getAssetIdentifier() != null)
            sb.append("AssetIdentifier: ").append(getAssetIdentifier()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getFailureCause() != null)
            sb.append("FailureCause: ").append(getFailureCause()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof UpdateSubscriptionGrantStatusRequest == false)
            return false;
        UpdateSubscriptionGrantStatusRequest other = (UpdateSubscriptionGrantStatusRequest) obj;
        if (other.getAssetIdentifier() == null ^ this.getAssetIdentifier() == null)
            return false;
        if (other.getAssetIdentifier() != null && other.getAssetIdentifier().equals(this.getAssetIdentifier()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getAssetIdentifier() == null) ? 0 : getAssetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionGrantStatusRequest clone() {
        return (UpdateSubscriptionGrantStatusRequest) super.clone();
    }

}
