/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the membership.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     */
    private String queryLogStatus;
    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     */
    private MembershipProtectedQueryResultConfiguration defaultResultConfiguration;

    /**
     * <p>
     * The unique identifier of the membership.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership.
     * </p>
     * 
     * @return The unique identifier of the membership.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMembershipRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the membership.
     * @see MembershipQueryLogStatus
     */

    public void setQueryLogStatus(String queryLogStatus) {
        this.queryLogStatus = queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @return An indicator as to whether query logging has been enabled or disabled for the membership.
     * @see MembershipQueryLogStatus
     */

    public String getQueryLogStatus() {
        return this.queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipQueryLogStatus
     */

    public UpdateMembershipRequest withQueryLogStatus(String queryLogStatus) {
        setQueryLogStatus(queryLogStatus);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipQueryLogStatus
     */

    public UpdateMembershipRequest withQueryLogStatus(MembershipQueryLogStatus queryLogStatus) {
        this.queryLogStatus = queryLogStatus.toString();
        return this;
    }

    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     * 
     * @param defaultResultConfiguration
     *        The default protected query result configuration as specified by the member who can receive results.
     */

    public void setDefaultResultConfiguration(MembershipProtectedQueryResultConfiguration defaultResultConfiguration) {
        this.defaultResultConfiguration = defaultResultConfiguration;
    }

    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     * 
     * @return The default protected query result configuration as specified by the member who can receive results.
     */

    public MembershipProtectedQueryResultConfiguration getDefaultResultConfiguration() {
        return this.defaultResultConfiguration;
    }

    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     * 
     * @param defaultResultConfiguration
     *        The default protected query result configuration as specified by the member who can receive results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMembershipRequest withDefaultResultConfiguration(MembershipProtectedQueryResultConfiguration defaultResultConfiguration) {
        setDefaultResultConfiguration(defaultResultConfiguration);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getQueryLogStatus() != null)
            sb.append("QueryLogStatus: ").append(getQueryLogStatus()).append(",");
        if (getDefaultResultConfiguration() != null)
            sb.append("DefaultResultConfiguration: ").append(getDefaultResultConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMembershipRequest == false)
            return false;
        UpdateMembershipRequest other = (UpdateMembershipRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getQueryLogStatus() == null ^ this.getQueryLogStatus() == null)
            return false;
        if (other.getQueryLogStatus() != null && other.getQueryLogStatus().equals(this.getQueryLogStatus()) == false)
            return false;
        if (other.getDefaultResultConfiguration() == null ^ this.getDefaultResultConfiguration() == null)
            return false;
        if (other.getDefaultResultConfiguration() != null && other.getDefaultResultConfiguration().equals(this.getDefaultResultConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getQueryLogStatus() == null) ? 0 : getQueryLogStatus().hashCode());
        hashCode = prime * hashCode + ((getDefaultResultConfiguration() == null) ? 0 : getDefaultResultConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMembershipRequest clone() {
        return (UpdateMembershipRequest) super.clone();
    }

}
