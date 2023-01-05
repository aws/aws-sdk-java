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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateStandbyWorkspaces" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStandbyWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Region of the primary WorkSpace.
     * </p>
     */
    private String primaryRegion;
    /**
     * <p>
     * Information about the Standby WorkSpace to be created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StandbyWorkspace> standbyWorkspaces;

    /**
     * <p>
     * The Region of the primary WorkSpace.
     * </p>
     * 
     * @param primaryRegion
     *        The Region of the primary WorkSpace.
     */

    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The Region of the primary WorkSpace.
     * </p>
     * 
     * @return The Region of the primary WorkSpace.
     */

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * <p>
     * The Region of the primary WorkSpace.
     * </p>
     * 
     * @param primaryRegion
     *        The Region of the primary WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesRequest withPrimaryRegion(String primaryRegion) {
        setPrimaryRegion(primaryRegion);
        return this;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace to be created.
     * </p>
     * 
     * @return Information about the Standby WorkSpace to be created.
     */

    public java.util.List<StandbyWorkspace> getStandbyWorkspaces() {
        if (standbyWorkspaces == null) {
            standbyWorkspaces = new com.amazonaws.internal.SdkInternalList<StandbyWorkspace>();
        }
        return standbyWorkspaces;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace to be created.
     * </p>
     * 
     * @param standbyWorkspaces
     *        Information about the Standby WorkSpace to be created.
     */

    public void setStandbyWorkspaces(java.util.Collection<StandbyWorkspace> standbyWorkspaces) {
        if (standbyWorkspaces == null) {
            this.standbyWorkspaces = null;
            return;
        }

        this.standbyWorkspaces = new com.amazonaws.internal.SdkInternalList<StandbyWorkspace>(standbyWorkspaces);
    }

    /**
     * <p>
     * Information about the Standby WorkSpace to be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandbyWorkspaces(java.util.Collection)} or {@link #withStandbyWorkspaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param standbyWorkspaces
     *        Information about the Standby WorkSpace to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesRequest withStandbyWorkspaces(StandbyWorkspace... standbyWorkspaces) {
        if (this.standbyWorkspaces == null) {
            setStandbyWorkspaces(new com.amazonaws.internal.SdkInternalList<StandbyWorkspace>(standbyWorkspaces.length));
        }
        for (StandbyWorkspace ele : standbyWorkspaces) {
            this.standbyWorkspaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace to be created.
     * </p>
     * 
     * @param standbyWorkspaces
     *        Information about the Standby WorkSpace to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesRequest withStandbyWorkspaces(java.util.Collection<StandbyWorkspace> standbyWorkspaces) {
        setStandbyWorkspaces(standbyWorkspaces);
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
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: ").append(getPrimaryRegion()).append(",");
        if (getStandbyWorkspaces() != null)
            sb.append("StandbyWorkspaces: ").append(getStandbyWorkspaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStandbyWorkspacesRequest == false)
            return false;
        CreateStandbyWorkspacesRequest other = (CreateStandbyWorkspacesRequest) obj;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        if (other.getStandbyWorkspaces() == null ^ this.getStandbyWorkspaces() == null)
            return false;
        if (other.getStandbyWorkspaces() != null && other.getStandbyWorkspaces().equals(this.getStandbyWorkspaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        hashCode = prime * hashCode + ((getStandbyWorkspaces() == null) ? 0 : getStandbyWorkspaces().hashCode());
        return hashCode;
    }

    @Override
    public CreateStandbyWorkspacesRequest clone() {
        return (CreateStandbyWorkspacesRequest) super.clone();
    }

}
