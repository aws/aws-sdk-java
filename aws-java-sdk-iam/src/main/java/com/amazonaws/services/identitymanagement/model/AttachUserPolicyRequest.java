/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class AttachUserPolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) of the user to attach the policy to.
     * </p>
     */
    private String userName;

    private String policyArn;

    /**
     * <p>
     * The name (friendly name, not ARN) of the user to attach the policy to.
     * </p>
     * 
     * @param userName
     *        The name (friendly name, not ARN) of the user to attach the policy
     *        to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the user to attach the policy to.
     * </p>
     * 
     * @return The name (friendly name, not ARN) of the user to attach the
     *         policy to.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the user to attach the policy to.
     * </p>
     * 
     * @param userName
     *        The name (friendly name, not ARN) of the user to attach the policy
     *        to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AttachUserPolicyRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * @param policyArn
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * @return
     */
    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * @param policyArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AttachUserPolicyRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachUserPolicyRequest == false)
            return false;
        AttachUserPolicyRequest other = (AttachUserPolicyRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public AttachUserPolicyRequest clone() {
        return (AttachUserPolicyRequest) super.clone();
    }
}