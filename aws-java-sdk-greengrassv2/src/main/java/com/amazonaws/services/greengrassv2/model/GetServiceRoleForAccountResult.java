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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetServiceRoleForAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceRoleForAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     */
    private String associatedAt;
    /**
     * <p>
     * The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @param associatedAt
     *        The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in
     *        this Amazon Web Services Region.
     */

    public void setAssociatedAt(String associatedAt) {
        this.associatedAt = associatedAt;
    }

    /**
     * <p>
     * The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @return The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in
     *         this Amazon Web Services Region.
     */

    public String getAssociatedAt() {
        return this.associatedAt;
    }

    /**
     * <p>
     * The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @param associatedAt
     *        The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in
     *        this Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceRoleForAccountResult withAssociatedAt(String associatedAt) {
        setAssociatedAt(associatedAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in
     *        this Amazon Web Services Region.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @return The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account
     *         in this Amazon Web Services Region.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in this
     * Amazon Web Services Region.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in
     *        this Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceRoleForAccountResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getAssociatedAt() != null)
            sb.append("AssociatedAt: ").append(getAssociatedAt()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceRoleForAccountResult == false)
            return false;
        GetServiceRoleForAccountResult other = (GetServiceRoleForAccountResult) obj;
        if (other.getAssociatedAt() == null ^ this.getAssociatedAt() == null)
            return false;
        if (other.getAssociatedAt() != null && other.getAssociatedAt().equals(this.getAssociatedAt()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedAt() == null) ? 0 : getAssociatedAt().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceRoleForAccountResult clone() {
        try {
            return (GetServiceRoleForAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
