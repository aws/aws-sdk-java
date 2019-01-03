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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashboardEmbedUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account ID that contains the dashboard you are embedding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard, also added to IAM policy
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The authentication method the user uses to sign in (IAM only).
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     * </p>
     */
    private Long sessionLifetimeInMinutes;
    /**
     * <p>
     * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     */
    private Boolean undoRedoDisabled;
    /**
     * <p>
     * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     * </p>
     */
    private Boolean resetDisabled;

    /**
     * <p>
     * AWS account ID that contains the dashboard you are embedding.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the dashboard you are embedding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the dashboard you are embedding.
     * </p>
     * 
     * @return AWS account ID that contains the dashboard you are embedding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the dashboard you are embedding.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the dashboard you are embedding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to IAM policy
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard, also added to IAM policy
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to IAM policy
     * </p>
     * 
     * @return The ID for the dashboard, also added to IAM policy
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to IAM policy
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard, also added to IAM policy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The authentication method the user uses to sign in (IAM only).
     * </p>
     * 
     * @param identityType
     *        The authentication method the user uses to sign in (IAM only).
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The authentication method the user uses to sign in (IAM only).
     * </p>
     * 
     * @return The authentication method the user uses to sign in (IAM only).
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The authentication method the user uses to sign in (IAM only).
     * </p>
     * 
     * @param identityType
     *        The authentication method the user uses to sign in (IAM only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public GetDashboardEmbedUrlRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The authentication method the user uses to sign in (IAM only).
     * </p>
     * 
     * @param identityType
     *        The authentication method the user uses to sign in (IAM only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public GetDashboardEmbedUrlRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     */

    public void setSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     * </p>
     * 
     * @return How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     */

    public Long getSessionLifetimeInMinutes() {
        return this.sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        setSessionLifetimeInMinutes(sessionLifetimeInMinutes);
        return this;
    }

    /**
     * <p>
     * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @param undoRedoDisabled
     *        Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo
     *        button.
     */

    public void setUndoRedoDisabled(Boolean undoRedoDisabled) {
        this.undoRedoDisabled = undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @return Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo
     *         button.
     */

    public Boolean getUndoRedoDisabled() {
        return this.undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @param undoRedoDisabled
     *        Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo
     *        button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withUndoRedoDisabled(Boolean undoRedoDisabled) {
        setUndoRedoDisabled(undoRedoDisabled);
        return this;
    }

    /**
     * <p>
     * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @return Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo
     *         button.
     */

    public Boolean isUndoRedoDisabled() {
        return this.undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     * </p>
     * 
     * @param resetDisabled
     *        Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     */

    public void setResetDisabled(Boolean resetDisabled) {
        this.resetDisabled = resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     * </p>
     * 
     * @return Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     */

    public Boolean getResetDisabled() {
        return this.resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     * </p>
     * 
     * @param resetDisabled
     *        Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withResetDisabled(Boolean resetDisabled) {
        setResetDisabled(resetDisabled);
        return this;
    }

    /**
     * <p>
     * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     * </p>
     * 
     * @return Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
     */

    public Boolean isResetDisabled() {
        return this.resetDisabled;
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
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getSessionLifetimeInMinutes() != null)
            sb.append("SessionLifetimeInMinutes: ").append(getSessionLifetimeInMinutes()).append(",");
        if (getUndoRedoDisabled() != null)
            sb.append("UndoRedoDisabled: ").append(getUndoRedoDisabled()).append(",");
        if (getResetDisabled() != null)
            sb.append("ResetDisabled: ").append(getResetDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDashboardEmbedUrlRequest == false)
            return false;
        GetDashboardEmbedUrlRequest other = (GetDashboardEmbedUrlRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getSessionLifetimeInMinutes() == null ^ this.getSessionLifetimeInMinutes() == null)
            return false;
        if (other.getSessionLifetimeInMinutes() != null && other.getSessionLifetimeInMinutes().equals(this.getSessionLifetimeInMinutes()) == false)
            return false;
        if (other.getUndoRedoDisabled() == null ^ this.getUndoRedoDisabled() == null)
            return false;
        if (other.getUndoRedoDisabled() != null && other.getUndoRedoDisabled().equals(this.getUndoRedoDisabled()) == false)
            return false;
        if (other.getResetDisabled() == null ^ this.getResetDisabled() == null)
            return false;
        if (other.getResetDisabled() != null && other.getResetDisabled().equals(this.getResetDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getSessionLifetimeInMinutes() == null) ? 0 : getSessionLifetimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getUndoRedoDisabled() == null) ? 0 : getUndoRedoDisabled().hashCode());
        hashCode = prime * hashCode + ((getResetDisabled() == null) ? 0 : getResetDisabled().hashCode());
        return hashCode;
    }

    @Override
    public GetDashboardEmbedUrlRequest clone() {
        return (GetDashboardEmbedUrlRequest) super.clone();
    }

}
