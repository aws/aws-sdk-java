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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteAccountSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccountSettingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified, the ARN
     * for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID
     * for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it
     * modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the account unless an
     * IAM user or role explicitly overrides these settings for themselves. If this field is omitted, the setting are
     * changed only for the authenticated user.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified, the ARN
     * for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID
     * for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected.
     * </p>
     * 
     * @param name
     *        The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified,
     *        the ARN for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN
     *        and resource ID for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is
     *        specified, the ARN and resource ID for your Amazon ECS container instances is affected.
     * @see SettingName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified, the ARN
     * for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID
     * for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected.
     * </p>
     * 
     * @return The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified,
     *         the ARN for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN
     *         and resource ID for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is
     *         specified, the ARN and resource ID for your Amazon ECS container instances is affected.
     * @see SettingName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified, the ARN
     * for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID
     * for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected.
     * </p>
     * 
     * @param name
     *        The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified,
     *        the ARN for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN
     *        and resource ID for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is
     *        specified, the ARN and resource ID for your Amazon ECS container instances is affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public DeleteAccountSettingRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified, the ARN
     * for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID
     * for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected.
     * </p>
     * 
     * @param name
     *        The resource name for which to disable the new format. If <code>serviceLongArnFormat</code> is specified,
     *        the ARN for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN
     *        and resource ID for your Amazon ECS tasks is affected. If <code>containerInstanceLongArnFormat</code> is
     *        specified, the ARN and resource ID for your Amazon ECS container instances is affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public DeleteAccountSettingRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it
     * modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the account unless an
     * IAM user or role explicitly overrides these settings for themselves. If this field is omitted, the setting are
     * changed only for the authenticated user.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root
     *        user, it modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the
     *        account unless an IAM user or role explicitly overrides these settings for themselves. If this field is
     *        omitted, the setting are changed only for the authenticated user.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it
     * modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the account unless an
     * IAM user or role explicitly overrides these settings for themselves. If this field is omitted, the setting are
     * changed only for the authenticated user.
     * </p>
     * 
     * @return The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root
     *         user, it modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the
     *         account unless an IAM user or role explicitly overrides these settings for themselves. If this field is
     *         omitted, the setting are changed only for the authenticated user.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it
     * modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the account unless an
     * IAM user or role explicitly overrides these settings for themselves. If this field is omitted, the setting are
     * changed only for the authenticated user.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root
     *        user, it modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the
     *        account unless an IAM user or role explicitly overrides these settings for themselves. If this field is
     *        omitted, the setting are changed only for the authenticated user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountSettingRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccountSettingRequest == false)
            return false;
        DeleteAccountSettingRequest other = (DeleteAccountSettingRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccountSettingRequest clone() {
        return (DeleteAccountSettingRequest) super.clone();
    }

}
