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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThemePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the theme.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the theme.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * A list of resource permissions to be granted for the theme.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;
    /**
     * <p>
     * A list of resource permissions to be revoked from the theme.
     * </p>
     */
    private java.util.List<ResourcePermission> revokePermissions;

    /**
     * <p>
     * The ID of the AWS account that contains the theme.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme.
     * </p>
     * 
     * @return The ID of the AWS account that contains the theme.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemePermissionsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param themeId
     *        The ID for the theme.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @return The ID for the theme.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param themeId
     *        The ID for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemePermissionsRequest withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be granted for the theme.
     * </p>
     * 
     * @return A list of resource permissions to be granted for the theme.
     */

    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * A list of resource permissions to be granted for the theme.
     * </p>
     * 
     * @param grantPermissions
     *        A list of resource permissions to be granted for the theme.
     */

    public void setGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        if (grantPermissions == null) {
            this.grantPermissions = null;
            return;
        }

        this.grantPermissions = new java.util.ArrayList<ResourcePermission>(grantPermissions);
    }

    /**
     * <p>
     * A list of resource permissions to be granted for the theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantPermissions(java.util.Collection)} or {@link #withGrantPermissions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param grantPermissions
     *        A list of resource permissions to be granted for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemePermissionsRequest withGrantPermissions(ResourcePermission... grantPermissions) {
        if (this.grantPermissions == null) {
            setGrantPermissions(new java.util.ArrayList<ResourcePermission>(grantPermissions.length));
        }
        for (ResourcePermission ele : grantPermissions) {
            this.grantPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be granted for the theme.
     * </p>
     * 
     * @param grantPermissions
     *        A list of resource permissions to be granted for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemePermissionsRequest withGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the theme.
     * </p>
     * 
     * @return A list of resource permissions to be revoked from the theme.
     */

    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the theme.
     * </p>
     * 
     * @param revokePermissions
     *        A list of resource permissions to be revoked from the theme.
     */

    public void setRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        if (revokePermissions == null) {
            this.revokePermissions = null;
            return;
        }

        this.revokePermissions = new java.util.ArrayList<ResourcePermission>(revokePermissions);
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevokePermissions(java.util.Collection)} or {@link #withRevokePermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param revokePermissions
     *        A list of resource permissions to be revoked from the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemePermissionsRequest withRevokePermissions(ResourcePermission... revokePermissions) {
        if (this.revokePermissions == null) {
            setRevokePermissions(new java.util.ArrayList<ResourcePermission>(revokePermissions.length));
        }
        for (ResourcePermission ele : revokePermissions) {
            this.revokePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the theme.
     * </p>
     * 
     * @param revokePermissions
     *        A list of resource permissions to be revoked from the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemePermissionsRequest withRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        setRevokePermissions(revokePermissions);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getThemeId() != null)
            sb.append("ThemeId: ").append(getThemeId()).append(",");
        if (getGrantPermissions() != null)
            sb.append("GrantPermissions: ").append(getGrantPermissions()).append(",");
        if (getRevokePermissions() != null)
            sb.append("RevokePermissions: ").append(getRevokePermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThemePermissionsRequest == false)
            return false;
        UpdateThemePermissionsRequest other = (UpdateThemePermissionsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getGrantPermissions() == null ^ this.getGrantPermissions() == null)
            return false;
        if (other.getGrantPermissions() != null && other.getGrantPermissions().equals(this.getGrantPermissions()) == false)
            return false;
        if (other.getRevokePermissions() == null ^ this.getRevokePermissions() == null)
            return false;
        if (other.getRevokePermissions() != null && other.getRevokePermissions().equals(this.getRevokePermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getGrantPermissions() == null) ? 0 : getGrantPermissions().hashCode());
        hashCode = prime * hashCode + ((getRevokePermissions() == null) ? 0 : getRevokePermissions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThemePermissionsRequest clone() {
        return (UpdateThemePermissionsRequest) super.clone();
    }

}
