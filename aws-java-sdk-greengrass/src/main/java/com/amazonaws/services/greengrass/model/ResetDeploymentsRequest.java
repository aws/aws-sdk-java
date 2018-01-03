/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Information needed to perform a reset of a group's deployments.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResetDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The client token used to request idempotent operations. */
    private String amznClientToken;
    /** When set to true, perform a best-effort only core reset. */
    private Boolean force;
    /** The unique Id of the AWS Greengrass Group */
    private String groupId;

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @return The client token used to request idempotent operations.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDeploymentsRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * When set to true, perform a best-effort only core reset.
     * 
     * @param force
     *        When set to true, perform a best-effort only core reset.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * When set to true, perform a best-effort only core reset.
     * 
     * @return When set to true, perform a best-effort only core reset.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * When set to true, perform a best-effort only core reset.
     * 
     * @param force
     *        When set to true, perform a best-effort only core reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDeploymentsRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * When set to true, perform a best-effort only core reset.
     * 
     * @return When set to true, perform a best-effort only core reset.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @return The unique Id of the AWS Greengrass Group
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDeploymentsRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetDeploymentsRequest == false)
            return false;
        ResetDeploymentsRequest other = (ResetDeploymentsRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public ResetDeploymentsRequest clone() {
        return (ResetDeploymentsRequest) super.clone();
    }

}
