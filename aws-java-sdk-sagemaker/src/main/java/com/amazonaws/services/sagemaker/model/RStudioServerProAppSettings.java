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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
 * <code>RStudioServerProAppSettings</code> cannot be updated. The <code>RStudioServerPro</code> app must be deleted and
 * a new one created to make any changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RStudioServerProAppSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RStudioServerProAppSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * </p>
     */
    private String accessStatus;
    /**
     * <p>
     * The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value defaults to
     * `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * </p>
     */
    private String userGroup;

    /**
     * <p>
     * Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @param accessStatus
     *        Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * @see RStudioServerProAccessStatus
     */

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    /**
     * <p>
     * Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @return Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * @see RStudioServerProAccessStatus
     */

    public String getAccessStatus() {
        return this.accessStatus;
    }

    /**
     * <p>
     * Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @param accessStatus
     *        Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RStudioServerProAccessStatus
     */

    public RStudioServerProAppSettings withAccessStatus(String accessStatus) {
        setAccessStatus(accessStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @param accessStatus
     *        Indicates whether the current user has access to the <code>RStudioServerPro</code> app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RStudioServerProAccessStatus
     */

    public RStudioServerProAppSettings withAccessStatus(RStudioServerProAccessStatus accessStatus) {
        this.accessStatus = accessStatus.toString();
        return this;
    }

    /**
     * <p>
     * The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value defaults to
     * `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * </p>
     * 
     * @param userGroup
     *        The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value
     *        defaults to `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * @see RStudioServerProUserGroup
     */

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * <p>
     * The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value defaults to
     * `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * </p>
     * 
     * @return The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value
     *         defaults to `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * @see RStudioServerProUserGroup
     */

    public String getUserGroup() {
        return this.userGroup;
    }

    /**
     * <p>
     * The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value defaults to
     * `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * </p>
     * 
     * @param userGroup
     *        The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value
     *        defaults to `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RStudioServerProUserGroup
     */

    public RStudioServerProAppSettings withUserGroup(String userGroup) {
        setUserGroup(userGroup);
        return this;
    }

    /**
     * <p>
     * The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value defaults to
     * `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * </p>
     * 
     * @param userGroup
     *        The level of permissions that the user has within the <code>RStudioServerPro</code> app. This value
     *        defaults to `User`. The `Admin` value allows the user access to the RStudio Administrative Dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RStudioServerProUserGroup
     */

    public RStudioServerProAppSettings withUserGroup(RStudioServerProUserGroup userGroup) {
        this.userGroup = userGroup.toString();
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
        if (getAccessStatus() != null)
            sb.append("AccessStatus: ").append(getAccessStatus()).append(",");
        if (getUserGroup() != null)
            sb.append("UserGroup: ").append(getUserGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RStudioServerProAppSettings == false)
            return false;
        RStudioServerProAppSettings other = (RStudioServerProAppSettings) obj;
        if (other.getAccessStatus() == null ^ this.getAccessStatus() == null)
            return false;
        if (other.getAccessStatus() != null && other.getAccessStatus().equals(this.getAccessStatus()) == false)
            return false;
        if (other.getUserGroup() == null ^ this.getUserGroup() == null)
            return false;
        if (other.getUserGroup() != null && other.getUserGroup().equals(this.getUserGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessStatus() == null) ? 0 : getAccessStatus().hashCode());
        hashCode = prime * hashCode + ((getUserGroup() == null) ? 0 : getUserGroup().hashCode());
        return hashCode;
    }

    @Override
    public RStudioServerProAppSettings clone() {
        try {
            return (RStudioServerProAppSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RStudioServerProAppSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
