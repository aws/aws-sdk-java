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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetCallerIdentity</a> request, including information about the entity making
 * the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetCallerIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCallerIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the calling entity. The exact value depends on the type of entity making the call. The
     * values returned are those listed in the <b>aws:userid</b> column in the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable">Principal
     * table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The AWS account ID number of the account that owns or contains the calling entity.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The AWS ARN associated with the calling entity.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The unique identifier of the calling entity. The exact value depends on the type of entity making the call. The
     * values returned are those listed in the <b>aws:userid</b> column in the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable">Principal
     * table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param userId
     *        The unique identifier of the calling entity. The exact value depends on the type of entity making the
     *        call. The values returned are those listed in the <b>aws:userid</b> column in the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable"
     *        >Principal table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier of the calling entity. The exact value depends on the type of entity making the call. The
     * values returned are those listed in the <b>aws:userid</b> column in the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable">Principal
     * table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The unique identifier of the calling entity. The exact value depends on the type of entity making the
     *         call. The values returned are those listed in the <b>aws:userid</b> column in the <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable"
     *         >Principal table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier of the calling entity. The exact value depends on the type of entity making the call. The
     * values returned are those listed in the <b>aws:userid</b> column in the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable">Principal
     * table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param userId
     *        The unique identifier of the calling entity. The exact value depends on the type of entity making the
     *        call. The values returned are those listed in the <b>aws:userid</b> column in the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable"
     *        >Principal table</a> found on the <b>Policy Variables</b> reference page in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCallerIdentityResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID number of the account that owns or contains the calling entity.
     * </p>
     * 
     * @param account
     *        The AWS account ID number of the account that owns or contains the calling entity.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The AWS account ID number of the account that owns or contains the calling entity.
     * </p>
     * 
     * @return The AWS account ID number of the account that owns or contains the calling entity.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The AWS account ID number of the account that owns or contains the calling entity.
     * </p>
     * 
     * @param account
     *        The AWS account ID number of the account that owns or contains the calling entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCallerIdentityResult withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The AWS ARN associated with the calling entity.
     * </p>
     * 
     * @param arn
     *        The AWS ARN associated with the calling entity.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The AWS ARN associated with the calling entity.
     * </p>
     * 
     * @return The AWS ARN associated with the calling entity.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The AWS ARN associated with the calling entity.
     * </p>
     * 
     * @param arn
     *        The AWS ARN associated with the calling entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCallerIdentityResult withArn(String arn) {
        setArn(arn);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCallerIdentityResult == false)
            return false;
        GetCallerIdentityResult other = (GetCallerIdentityResult) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetCallerIdentityResult clone() {
        try {
            return (GetCallerIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
