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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserAccessLoggingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateUserAccessLoggingSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     */
    private String portalArn;
    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     */
    private String userAccessLoggingSettingsArn;

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     */

    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @return The ARN of the web portal.
     */

    public String getPortalArn() {
        return this.portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateUserAccessLoggingSettingsRequest withPortalArn(String portalArn) {
        setPortalArn(portalArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettingsArn
     *        The ARN of the user access logging settings.
     */

    public void setUserAccessLoggingSettingsArn(String userAccessLoggingSettingsArn) {
        this.userAccessLoggingSettingsArn = userAccessLoggingSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     * 
     * @return The ARN of the user access logging settings.
     */

    public String getUserAccessLoggingSettingsArn() {
        return this.userAccessLoggingSettingsArn;
    }

    /**
     * <p>
     * The ARN of the user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettingsArn
     *        The ARN of the user access logging settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateUserAccessLoggingSettingsRequest withUserAccessLoggingSettingsArn(String userAccessLoggingSettingsArn) {
        setUserAccessLoggingSettingsArn(userAccessLoggingSettingsArn);
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
        if (getPortalArn() != null)
            sb.append("PortalArn: ").append(getPortalArn()).append(",");
        if (getUserAccessLoggingSettingsArn() != null)
            sb.append("UserAccessLoggingSettingsArn: ").append(getUserAccessLoggingSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateUserAccessLoggingSettingsRequest == false)
            return false;
        AssociateUserAccessLoggingSettingsRequest other = (AssociateUserAccessLoggingSettingsRequest) obj;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        if (other.getUserAccessLoggingSettingsArn() == null ^ this.getUserAccessLoggingSettingsArn() == null)
            return false;
        if (other.getUserAccessLoggingSettingsArn() != null && other.getUserAccessLoggingSettingsArn().equals(this.getUserAccessLoggingSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode + ((getUserAccessLoggingSettingsArn() == null) ? 0 : getUserAccessLoggingSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateUserAccessLoggingSettingsRequest clone() {
        return (AssociateUserAccessLoggingSettingsRequest) super.clone();
    }

}
