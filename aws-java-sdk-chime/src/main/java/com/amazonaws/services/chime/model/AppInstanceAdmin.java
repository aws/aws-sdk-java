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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an <code>AppInstanceAdmin</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AppInstanceAdmin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceAdmin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>AppInstanceAdmin</code> data.
     * </p>
     */
    private Identity admin;
    /**
     * <p>
     * The ARN of the <code>AppInstance</code> for which the user is an administrator.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The time at which an administrator was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The <code>AppInstanceAdmin</code> data.
     * </p>
     * 
     * @param admin
     *        The <code>AppInstanceAdmin</code> data.
     */

    public void setAdmin(Identity admin) {
        this.admin = admin;
    }

    /**
     * <p>
     * The <code>AppInstanceAdmin</code> data.
     * </p>
     * 
     * @return The <code>AppInstanceAdmin</code> data.
     */

    public Identity getAdmin() {
        return this.admin;
    }

    /**
     * <p>
     * The <code>AppInstanceAdmin</code> data.
     * </p>
     * 
     * @param admin
     *        The <code>AppInstanceAdmin</code> data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceAdmin withAdmin(Identity admin) {
        setAdmin(admin);
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> for which the user is an administrator.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code> for which the user is an administrator.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> for which the user is an administrator.
     * </p>
     * 
     * @return The ARN of the <code>AppInstance</code> for which the user is an administrator.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> for which the user is an administrator.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code> for which the user is an administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceAdmin withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The time at which an administrator was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which an administrator was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which an administrator was created.
     * </p>
     * 
     * @return The time at which an administrator was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which an administrator was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which an administrator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceAdmin withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getAdmin() != null)
            sb.append("Admin: ").append(getAdmin()).append(",");
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceAdmin == false)
            return false;
        AppInstanceAdmin other = (AppInstanceAdmin) obj;
        if (other.getAdmin() == null ^ this.getAdmin() == null)
            return false;
        if (other.getAdmin() != null && other.getAdmin().equals(this.getAdmin()) == false)
            return false;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceAdmin clone() {
        try {
            return (AppInstanceAdmin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AppInstanceAdminMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
