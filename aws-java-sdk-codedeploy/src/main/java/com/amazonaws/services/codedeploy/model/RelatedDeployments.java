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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about deployments related to the specified deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RelatedDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedDeployments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deployment ID of the root deployment that triggered this deployment.
     * </p>
     */
    private String autoUpdateOutdatedInstancesRootDeploymentId;
    /**
     * <p>
     * The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> autoUpdateOutdatedInstancesDeploymentIds;

    /**
     * <p>
     * The deployment ID of the root deployment that triggered this deployment.
     * </p>
     * 
     * @param autoUpdateOutdatedInstancesRootDeploymentId
     *        The deployment ID of the root deployment that triggered this deployment.
     */

    public void setAutoUpdateOutdatedInstancesRootDeploymentId(String autoUpdateOutdatedInstancesRootDeploymentId) {
        this.autoUpdateOutdatedInstancesRootDeploymentId = autoUpdateOutdatedInstancesRootDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the root deployment that triggered this deployment.
     * </p>
     * 
     * @return The deployment ID of the root deployment that triggered this deployment.
     */

    public String getAutoUpdateOutdatedInstancesRootDeploymentId() {
        return this.autoUpdateOutdatedInstancesRootDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the root deployment that triggered this deployment.
     * </p>
     * 
     * @param autoUpdateOutdatedInstancesRootDeploymentId
     *        The deployment ID of the root deployment that triggered this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedDeployments withAutoUpdateOutdatedInstancesRootDeploymentId(String autoUpdateOutdatedInstancesRootDeploymentId) {
        setAutoUpdateOutdatedInstancesRootDeploymentId(autoUpdateOutdatedInstancesRootDeploymentId);
        return this;
    }

    /**
     * <p>
     * The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * </p>
     * 
     * @return The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     */

    public java.util.List<String> getAutoUpdateOutdatedInstancesDeploymentIds() {
        if (autoUpdateOutdatedInstancesDeploymentIds == null) {
            autoUpdateOutdatedInstancesDeploymentIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return autoUpdateOutdatedInstancesDeploymentIds;
    }

    /**
     * <p>
     * The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * </p>
     * 
     * @param autoUpdateOutdatedInstancesDeploymentIds
     *        The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     */

    public void setAutoUpdateOutdatedInstancesDeploymentIds(java.util.Collection<String> autoUpdateOutdatedInstancesDeploymentIds) {
        if (autoUpdateOutdatedInstancesDeploymentIds == null) {
            this.autoUpdateOutdatedInstancesDeploymentIds = null;
            return;
        }

        this.autoUpdateOutdatedInstancesDeploymentIds = new com.amazonaws.internal.SdkInternalList<String>(autoUpdateOutdatedInstancesDeploymentIds);
    }

    /**
     * <p>
     * The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoUpdateOutdatedInstancesDeploymentIds(java.util.Collection)} or
     * {@link #withAutoUpdateOutdatedInstancesDeploymentIds(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param autoUpdateOutdatedInstancesDeploymentIds
     *        The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedDeployments withAutoUpdateOutdatedInstancesDeploymentIds(String... autoUpdateOutdatedInstancesDeploymentIds) {
        if (this.autoUpdateOutdatedInstancesDeploymentIds == null) {
            setAutoUpdateOutdatedInstancesDeploymentIds(new com.amazonaws.internal.SdkInternalList<String>(autoUpdateOutdatedInstancesDeploymentIds.length));
        }
        for (String ele : autoUpdateOutdatedInstancesDeploymentIds) {
            this.autoUpdateOutdatedInstancesDeploymentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * </p>
     * 
     * @param autoUpdateOutdatedInstancesDeploymentIds
     *        The deployment IDs of 'auto-update outdated instances' deployments triggered by this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedDeployments withAutoUpdateOutdatedInstancesDeploymentIds(java.util.Collection<String> autoUpdateOutdatedInstancesDeploymentIds) {
        setAutoUpdateOutdatedInstancesDeploymentIds(autoUpdateOutdatedInstancesDeploymentIds);
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
        if (getAutoUpdateOutdatedInstancesRootDeploymentId() != null)
            sb.append("AutoUpdateOutdatedInstancesRootDeploymentId: ").append(getAutoUpdateOutdatedInstancesRootDeploymentId()).append(",");
        if (getAutoUpdateOutdatedInstancesDeploymentIds() != null)
            sb.append("AutoUpdateOutdatedInstancesDeploymentIds: ").append(getAutoUpdateOutdatedInstancesDeploymentIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedDeployments == false)
            return false;
        RelatedDeployments other = (RelatedDeployments) obj;
        if (other.getAutoUpdateOutdatedInstancesRootDeploymentId() == null ^ this.getAutoUpdateOutdatedInstancesRootDeploymentId() == null)
            return false;
        if (other.getAutoUpdateOutdatedInstancesRootDeploymentId() != null
                && other.getAutoUpdateOutdatedInstancesRootDeploymentId().equals(this.getAutoUpdateOutdatedInstancesRootDeploymentId()) == false)
            return false;
        if (other.getAutoUpdateOutdatedInstancesDeploymentIds() == null ^ this.getAutoUpdateOutdatedInstancesDeploymentIds() == null)
            return false;
        if (other.getAutoUpdateOutdatedInstancesDeploymentIds() != null
                && other.getAutoUpdateOutdatedInstancesDeploymentIds().equals(this.getAutoUpdateOutdatedInstancesDeploymentIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoUpdateOutdatedInstancesRootDeploymentId() == null) ? 0 : getAutoUpdateOutdatedInstancesRootDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdateOutdatedInstancesDeploymentIds() == null) ? 0 : getAutoUpdateOutdatedInstancesDeploymentIds().hashCode());
        return hashCode;
    }

    @Override
    public RelatedDeployments clone() {
        try {
            return (RelatedDeployments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.RelatedDeploymentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
