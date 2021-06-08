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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstanceAdmin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppInstanceAdminResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name and ARN of the admin for the <code>AppInstance</code>.
     * </p>
     */
    private Identity appInstanceAdmin;
    /**
     * <p>
     * The ARN of the of the admin for the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceArn;

    /**
     * <p>
     * The name and ARN of the admin for the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceAdmin
     *        The name and ARN of the admin for the <code>AppInstance</code>.
     */

    public void setAppInstanceAdmin(Identity appInstanceAdmin) {
        this.appInstanceAdmin = appInstanceAdmin;
    }

    /**
     * <p>
     * The name and ARN of the admin for the <code>AppInstance</code>.
     * </p>
     * 
     * @return The name and ARN of the admin for the <code>AppInstance</code>.
     */

    public Identity getAppInstanceAdmin() {
        return this.appInstanceAdmin;
    }

    /**
     * <p>
     * The name and ARN of the admin for the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceAdmin
     *        The name and ARN of the admin for the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceAdminResult withAppInstanceAdmin(Identity appInstanceAdmin) {
        setAppInstanceAdmin(appInstanceAdmin);
        return this;
    }

    /**
     * <p>
     * The ARN of the of the admin for the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the of the admin for the <code>AppInstance</code>.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the of the admin for the <code>AppInstance</code>.
     * </p>
     * 
     * @return The ARN of the of the admin for the <code>AppInstance</code>.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the of the admin for the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the of the admin for the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceAdminResult withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
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
        if (getAppInstanceAdmin() != null)
            sb.append("AppInstanceAdmin: ").append(getAppInstanceAdmin()).append(",");
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppInstanceAdminResult == false)
            return false;
        CreateAppInstanceAdminResult other = (CreateAppInstanceAdminResult) obj;
        if (other.getAppInstanceAdmin() == null ^ this.getAppInstanceAdmin() == null)
            return false;
        if (other.getAppInstanceAdmin() != null && other.getAppInstanceAdmin().equals(this.getAppInstanceAdmin()) == false)
            return false;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceAdmin() == null) ? 0 : getAppInstanceAdmin().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppInstanceAdminResult clone() {
        try {
            return (CreateAppInstanceAdminResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
