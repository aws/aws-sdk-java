/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetSessionEmbedUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionEmbedUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight session that you're embedding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The entry point for the embedded session.
     * </p>
     */
    private String entryPoint;
    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     */
    private Long sessionLifetimeInMinutes;
    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     */
    private String userArn;

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight session that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that contains the QuickSight session that you're embedding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight session that you're embedding.
     * </p>
     * 
     * @return The ID for the AWS account that contains the QuickSight session that you're embedding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight session that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that contains the QuickSight session that you're embedding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionEmbedUrlRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The entry point for the embedded session.
     * </p>
     * 
     * @param entryPoint
     *        The entry point for the embedded session.
     */

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * <p>
     * The entry point for the embedded session.
     * </p>
     * 
     * @return The entry point for the embedded session.
     */

    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * <p>
     * The entry point for the embedded session.
     * </p>
     * 
     * @param entryPoint
     *        The entry point for the embedded session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionEmbedUrlRequest withEntryPoint(String entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     */

    public void setSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     * 
     * @return How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     */

    public Long getSessionLifetimeInMinutes() {
        return this.sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionEmbedUrlRequest withSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        setSessionLifetimeInMinutes(sessionLifetimeInMinutes);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userArn
     *        The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity
     *        type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins)
     *        authenticated as one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Active Directory (AD) users or group members
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Invited nonfederated users
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID
     *        Connect, or IAM federation.
     *        </p>
     *        </li>
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity
     *         type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins)
     *         authenticated as one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Active Directory (AD) users or group members
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Invited nonfederated users
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID
     *         Connect, or IAM federation.
     *         </p>
     *         </li>
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userArn
     *        The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity
     *        type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins)
     *        authenticated as one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Active Directory (AD) users or group members
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Invited nonfederated users
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID
     *        Connect, or IAM federation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionEmbedUrlRequest withUserArn(String userArn) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getSessionLifetimeInMinutes() != null)
            sb.append("SessionLifetimeInMinutes: ").append(getSessionLifetimeInMinutes()).append(",");
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

        if (obj instanceof GetSessionEmbedUrlRequest == false)
            return false;
        GetSessionEmbedUrlRequest other = (GetSessionEmbedUrlRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getSessionLifetimeInMinutes() == null ^ this.getSessionLifetimeInMinutes() == null)
            return false;
        if (other.getSessionLifetimeInMinutes() != null && other.getSessionLifetimeInMinutes().equals(this.getSessionLifetimeInMinutes()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getSessionLifetimeInMinutes() == null) ? 0 : getSessionLifetimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionEmbedUrlRequest clone() {
        return (GetSessionEmbedUrlRequest) super.clone();
    }

}
