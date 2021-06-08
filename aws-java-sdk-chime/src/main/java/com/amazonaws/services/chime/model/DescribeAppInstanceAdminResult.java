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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstanceAdmin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppInstanceAdminResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the created
     * and last-updated timestamps. All timestamps use epoch milliseconds.
     * </p>
     */
    private AppInstanceAdmin appInstanceAdmin;

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the created
     * and last-updated timestamps. All timestamps use epoch milliseconds.
     * </p>
     * 
     * @param appInstanceAdmin
     *        The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the
     *        created and last-updated timestamps. All timestamps use epoch milliseconds.
     */

    public void setAppInstanceAdmin(AppInstanceAdmin appInstanceAdmin) {
        this.appInstanceAdmin = appInstanceAdmin;
    }

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the created
     * and last-updated timestamps. All timestamps use epoch milliseconds.
     * </p>
     * 
     * @return The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the
     *         created and last-updated timestamps. All timestamps use epoch milliseconds.
     */

    public AppInstanceAdmin getAppInstanceAdmin() {
        return this.appInstanceAdmin;
    }

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the created
     * and last-updated timestamps. All timestamps use epoch milliseconds.
     * </p>
     * 
     * @param appInstanceAdmin
     *        The ARN and name of the <code>AppInstanceUser</code>, the ARN of the <code>AppInstance</code>, and the
     *        created and last-updated timestamps. All timestamps use epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppInstanceAdminResult withAppInstanceAdmin(AppInstanceAdmin appInstanceAdmin) {
        setAppInstanceAdmin(appInstanceAdmin);
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
            sb.append("AppInstanceAdmin: ").append(getAppInstanceAdmin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppInstanceAdminResult == false)
            return false;
        DescribeAppInstanceAdminResult other = (DescribeAppInstanceAdminResult) obj;
        if (other.getAppInstanceAdmin() == null ^ this.getAppInstanceAdmin() == null)
            return false;
        if (other.getAppInstanceAdmin() != null && other.getAppInstanceAdmin().equals(this.getAppInstanceAdmin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceAdmin() == null) ? 0 : getAppInstanceAdmin().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppInstanceAdminResult clone() {
        try {
            return (DescribeAppInstanceAdminResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
