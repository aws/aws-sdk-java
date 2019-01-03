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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironmentMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEnvironmentMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the environment to delete the environment member from.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     * </p>
     */
    private String userArn;

    /**
     * <p>
     * The ID of the environment to delete the environment member from.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to delete the environment member from.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment to delete the environment member from.
     * </p>
     * 
     * @return The ID of the environment to delete the environment member from.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment to delete the environment member from.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to delete the environment member from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEnvironmentMembershipRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the environment member to delete from the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEnvironmentMembershipRequest withUserArn(String userArn) {
        setUserArn(userArn);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEnvironmentMembershipRequest == false)
            return false;
        DeleteEnvironmentMembershipRequest other = (DeleteEnvironmentMembershipRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEnvironmentMembershipRequest clone() {
        return (DeleteEnvironmentMembershipRequest) super.clone();
    }

}
