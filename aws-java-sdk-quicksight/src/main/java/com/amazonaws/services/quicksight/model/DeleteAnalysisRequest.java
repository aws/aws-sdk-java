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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account where you want to delete an analysis.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the analysis that you're deleting.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't use
     * this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The default value is
     * 30.
     * </p>
     */
    private Long recoveryWindowInDays;
    /**
     * <p>
     * This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the analysis,
     * add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's deleted.
     * </p>
     */
    private Boolean forceDeleteWithoutRecovery;

    /**
     * <p>
     * The ID of the AWS account where you want to delete an analysis.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to delete an analysis.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to delete an analysis.
     * </p>
     * 
     * @return The ID of the AWS account where you want to delete an analysis.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to delete an analysis.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to delete an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the analysis that you're deleting.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis that you're deleting.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis that you're deleting.
     * </p>
     * 
     * @return The ID of the analysis that you're deleting.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis that you're deleting.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis that you're deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisRequest withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't use
     * this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The default value is
     * 30.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't
     *        use this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The
     *        default value is 30.
     */

    public void setRecoveryWindowInDays(Long recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    /**
     * <p>
     * A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't use
     * this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The default value is
     * 30.
     * </p>
     * 
     * @return A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't
     *         use this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The
     *         default value is 30.
     */

    public Long getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    /**
     * <p>
     * A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't use
     * this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The default value is
     * 30.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't
     *        use this parameter with the <code>ForceDeleteWithoutRecovery</code> option in the same API call. The
     *        default value is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisRequest withRecoveryWindowInDays(Long recoveryWindowInDays) {
        setRecoveryWindowInDays(recoveryWindowInDays);
        return this;
    }

    /**
     * <p>
     * This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the analysis,
     * add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's deleted.
     * </p>
     * 
     * @param forceDeleteWithoutRecovery
     *        This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the
     *        analysis, add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's
     *        deleted.
     */

    public void setForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
    }

    /**
     * <p>
     * This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the analysis,
     * add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's deleted.
     * </p>
     * 
     * @return This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the
     *         analysis, add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after
     *         it's deleted.
     */

    public Boolean getForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
    }

    /**
     * <p>
     * This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the analysis,
     * add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's deleted.
     * </p>
     * 
     * @param forceDeleteWithoutRecovery
     *        This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the
     *        analysis, add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisRequest withForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        setForceDeleteWithoutRecovery(forceDeleteWithoutRecovery);
        return this;
    }

    /**
     * <p>
     * This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the analysis,
     * add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after it's deleted.
     * </p>
     * 
     * @return This option defaults to the value <code>NoForceDeleteWithoutRecovery</code>. To immediately delete the
     *         analysis, add the <code>ForceDeleteWithoutRecovery</code> option. You can't restore an analysis after
     *         it's deleted.
     */

    public Boolean isForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
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
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getRecoveryWindowInDays() != null)
            sb.append("RecoveryWindowInDays: ").append(getRecoveryWindowInDays()).append(",");
        if (getForceDeleteWithoutRecovery() != null)
            sb.append("ForceDeleteWithoutRecovery: ").append(getForceDeleteWithoutRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAnalysisRequest == false)
            return false;
        DeleteAnalysisRequest other = (DeleteAnalysisRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getRecoveryWindowInDays() == null ^ this.getRecoveryWindowInDays() == null)
            return false;
        if (other.getRecoveryWindowInDays() != null && other.getRecoveryWindowInDays().equals(this.getRecoveryWindowInDays()) == false)
            return false;
        if (other.getForceDeleteWithoutRecovery() == null ^ this.getForceDeleteWithoutRecovery() == null)
            return false;
        if (other.getForceDeleteWithoutRecovery() != null && other.getForceDeleteWithoutRecovery().equals(this.getForceDeleteWithoutRecovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getRecoveryWindowInDays() == null) ? 0 : getRecoveryWindowInDays().hashCode());
        hashCode = prime * hashCode + ((getForceDeleteWithoutRecovery() == null) ? 0 : getForceDeleteWithoutRecovery().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAnalysisRequest clone() {
        return (DeleteAnalysisRequest) super.clone();
    }

}
