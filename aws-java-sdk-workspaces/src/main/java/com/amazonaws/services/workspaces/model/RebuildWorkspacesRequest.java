/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebuildWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkSpace to rebuild. You can specify a single WorkSpace.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RebuildRequest> rebuildWorkspaceRequests;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String additionalInfo;

    /**
     * <p>
     * The WorkSpace to rebuild. You can specify a single WorkSpace.
     * </p>
     * 
     * @return The WorkSpace to rebuild. You can specify a single WorkSpace.
     */

    public java.util.List<RebuildRequest> getRebuildWorkspaceRequests() {
        if (rebuildWorkspaceRequests == null) {
            rebuildWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<RebuildRequest>();
        }
        return rebuildWorkspaceRequests;
    }

    /**
     * <p>
     * The WorkSpace to rebuild. You can specify a single WorkSpace.
     * </p>
     * 
     * @param rebuildWorkspaceRequests
     *        The WorkSpace to rebuild. You can specify a single WorkSpace.
     */

    public void setRebuildWorkspaceRequests(java.util.Collection<RebuildRequest> rebuildWorkspaceRequests) {
        if (rebuildWorkspaceRequests == null) {
            this.rebuildWorkspaceRequests = null;
            return;
        }

        this.rebuildWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<RebuildRequest>(rebuildWorkspaceRequests);
    }

    /**
     * <p>
     * The WorkSpace to rebuild. You can specify a single WorkSpace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRebuildWorkspaceRequests(java.util.Collection)} or
     * {@link #withRebuildWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rebuildWorkspaceRequests
     *        The WorkSpace to rebuild. You can specify a single WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesRequest withRebuildWorkspaceRequests(RebuildRequest... rebuildWorkspaceRequests) {
        if (this.rebuildWorkspaceRequests == null) {
            setRebuildWorkspaceRequests(new com.amazonaws.internal.SdkInternalList<RebuildRequest>(rebuildWorkspaceRequests.length));
        }
        for (RebuildRequest ele : rebuildWorkspaceRequests) {
            this.rebuildWorkspaceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The WorkSpace to rebuild. You can specify a single WorkSpace.
     * </p>
     * 
     * @param rebuildWorkspaceRequests
     *        The WorkSpace to rebuild. You can specify a single WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesRequest withRebuildWorkspaceRequests(java.util.Collection<RebuildRequest> rebuildWorkspaceRequests) {
        setRebuildWorkspaceRequests(rebuildWorkspaceRequests);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesRequest withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
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
        if (getRebuildWorkspaceRequests() != null)
            sb.append("RebuildWorkspaceRequests: ").append(getRebuildWorkspaceRequests()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebuildWorkspacesRequest == false)
            return false;
        RebuildWorkspacesRequest other = (RebuildWorkspacesRequest) obj;
        if (other.getRebuildWorkspaceRequests() == null ^ this.getRebuildWorkspaceRequests() == null)
            return false;
        if (other.getRebuildWorkspaceRequests() != null && other.getRebuildWorkspaceRequests().equals(this.getRebuildWorkspaceRequests()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRebuildWorkspaceRequests() == null) ? 0 : getRebuildWorkspaceRequests().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public RebuildWorkspacesRequest clone() {
        return (RebuildWorkspacesRequest) super.clone();
    }

}
