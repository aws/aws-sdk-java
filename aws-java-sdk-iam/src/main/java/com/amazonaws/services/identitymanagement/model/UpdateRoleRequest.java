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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private Integer maxSessionDuration;

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     * 
     * @param roleName
     *        The name of the role that you want to modify.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     * 
     * @return The name of the role that you want to modify.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role that you want to modify.
     * </p>
     * 
     * @param roleName
     *        The name of the role that you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     * 
     * @param description
     *        The new description that you want to apply to the specified role.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     * 
     * @return The new description that you want to apply to the specified role.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description that you want to apply to the specified role.
     * </p>
     * 
     * @param description
     *        The new description that you want to apply to the specified role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum session duration (in seconds) that you want to set for the specified role. If you do not
     *        specify a value for this setting, the default maximum of one hour is applied. This setting can have a
     *        value from 1 hour to 12 hours.</p>
     *        <p>
     *        Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter
     *        or the <code>duration-seconds</code> CLI parameter to request a longer session. The
     *        <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the
     *        <code>DurationSeconds</code> parameter. If users don't specify a value for the
     *        <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default. This
     *        applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     *        operations but does not apply when you use those operations to create a console URL. For more information,
     *        see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in
     *        the <i>IAM User Guide</i>.
     */

    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The maximum session duration (in seconds) that you want to set for the specified role. If you do not
     *         specify a value for this setting, the default maximum of one hour is applied. This setting can have a
     *         value from 1 hour to 12 hours.</p>
     *         <p>
     *         Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API
     *         parameter or the <code>duration-seconds</code> CLI parameter to request a longer session. The
     *         <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the
     *         <code>DurationSeconds</code> parameter. If users don't specify a value for the
     *         <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default.
     *         This applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code>
     *         CLI operations but does not apply when you use those operations to create a console URL. For more
     *         information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM
     *         Roles</a> in the <i>IAM User Guide</i>.
     */

    public Integer getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum session duration (in seconds) that you want to set for the specified role. If you do not
     *        specify a value for this setting, the default maximum of one hour is applied. This setting can have a
     *        value from 1 hour to 12 hours.</p>
     *        <p>
     *        Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter
     *        or the <code>duration-seconds</code> CLI parameter to request a longer session. The
     *        <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the
     *        <code>DurationSeconds</code> parameter. If users don't specify a value for the
     *        <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default. This
     *        applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     *        operations but does not apply when you use those operations to create a console URL. For more information,
     *        see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in
     *        the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleRequest withMaxSessionDuration(Integer maxSessionDuration) {
        setMaxSessionDuration(maxSessionDuration);
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
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: ").append(getMaxSessionDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoleRequest == false)
            return false;
        UpdateRoleRequest other = (UpdateRoleRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoleRequest clone() {
        return (UpdateRoleRequest) super.clone();
    }

}
