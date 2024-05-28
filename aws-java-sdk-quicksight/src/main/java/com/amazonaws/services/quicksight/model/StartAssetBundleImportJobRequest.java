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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartAssetBundleImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAssetBundleImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account to import assets into.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     */
    private String assetBundleImportJobId;
    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that you want to import. The file must be in
     * <code>QUICKSIGHT_JSON</code> format.
     * </p>
     */
    private AssetBundleImportSource assetBundleImportSource;
    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverrideParameters overrideParameters;
    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * <p>
     * If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by the
     * failed job.
     * </p>
     * <p>
     * If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes caused
     * by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * </p>
     */
    private String failureAction;
    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverridePermissions overridePermissions;
    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverrideTags overrideTags;
    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards that is applied to the resource
     * configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverrideValidationStrategy overrideValidationStrategy;

    /**
     * <p>
     * The ID of the Amazon Web Services account to import assets into.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account to import assets into.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account to import assets into.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account to import assets into.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account to import assets into.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account to import assets into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *        this ID for another job.
     */

    public void setAssetBundleImportJobId(String assetBundleImportJobId) {
        this.assetBundleImportJobId = assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @return The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *         this ID for another job.
     */

    public String getAssetBundleImportJobId() {
        return this.assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *        this ID for another job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withAssetBundleImportJobId(String assetBundleImportJobId) {
        setAssetBundleImportJobId(assetBundleImportJobId);
        return this;
    }

    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that you want to import. The file must be in
     * <code>QUICKSIGHT_JSON</code> format.
     * </p>
     * 
     * @param assetBundleImportSource
     *        The source of the asset bundle zip file that contains the data that you want to import. The file must be
     *        in <code>QUICKSIGHT_JSON</code> format.
     */

    public void setAssetBundleImportSource(AssetBundleImportSource assetBundleImportSource) {
        this.assetBundleImportSource = assetBundleImportSource;
    }

    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that you want to import. The file must be in
     * <code>QUICKSIGHT_JSON</code> format.
     * </p>
     * 
     * @return The source of the asset bundle zip file that contains the data that you want to import. The file must be
     *         in <code>QUICKSIGHT_JSON</code> format.
     */

    public AssetBundleImportSource getAssetBundleImportSource() {
        return this.assetBundleImportSource;
    }

    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that you want to import. The file must be in
     * <code>QUICKSIGHT_JSON</code> format.
     * </p>
     * 
     * @param assetBundleImportSource
     *        The source of the asset bundle zip file that contains the data that you want to import. The file must be
     *        in <code>QUICKSIGHT_JSON</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withAssetBundleImportSource(AssetBundleImportSource assetBundleImportSource) {
        setAssetBundleImportSource(assetBundleImportSource);
        return this;
    }

    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideParameters
     *        Optional overrides that are applied to the resource configuration before import.
     */

    public void setOverrideParameters(AssetBundleImportJobOverrideParameters overrideParameters) {
        this.overrideParameters = overrideParameters;
    }

    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @return Optional overrides that are applied to the resource configuration before import.
     */

    public AssetBundleImportJobOverrideParameters getOverrideParameters() {
        return this.overrideParameters;
    }

    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideParameters
     *        Optional overrides that are applied to the resource configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withOverrideParameters(AssetBundleImportJobOverrideParameters overrideParameters) {
        setOverrideParameters(overrideParameters);
        return this;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * <p>
     * If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by the
     * failed job.
     * </p>
     * <p>
     * If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes caused
     * by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * </p>
     * 
     * @param failureAction
     *        The failure action for the import job.</p>
     *        <p>
     *        If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by
     *        the failed job.
     *        </p>
     *        <p>
     *        If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes
     *        caused by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * @see AssetBundleImportFailureAction
     */

    public void setFailureAction(String failureAction) {
        this.failureAction = failureAction;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * <p>
     * If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by the
     * failed job.
     * </p>
     * <p>
     * If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes caused
     * by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * </p>
     * 
     * @return The failure action for the import job.</p>
     *         <p>
     *         If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by
     *         the failed job.
     *         </p>
     *         <p>
     *         If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes
     *         caused by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * @see AssetBundleImportFailureAction
     */

    public String getFailureAction() {
        return this.failureAction;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * <p>
     * If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by the
     * failed job.
     * </p>
     * <p>
     * If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes caused
     * by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * </p>
     * 
     * @param failureAction
     *        The failure action for the import job.</p>
     *        <p>
     *        If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by
     *        the failed job.
     *        </p>
     *        <p>
     *        If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes
     *        caused by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportFailureAction
     */

    public StartAssetBundleImportJobRequest withFailureAction(String failureAction) {
        setFailureAction(failureAction);
        return this;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * <p>
     * If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by the
     * failed job.
     * </p>
     * <p>
     * If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes caused
     * by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * </p>
     * 
     * @param failureAction
     *        The failure action for the import job.</p>
     *        <p>
     *        If you choose <code>ROLLBACK</code>, failed import jobs will attempt to undo any asset changes caused by
     *        the failed job.
     *        </p>
     *        <p>
     *        If you choose <code>DO_NOTHING</code>, failed import jobs will not attempt to roll back any asset changes
     *        caused by the failed job, possibly keeping the Amazon QuickSight account in an inconsistent state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportFailureAction
     */

    public StartAssetBundleImportJobRequest withFailureAction(AssetBundleImportFailureAction failureAction) {
        this.failureAction = failureAction.toString();
        return this;
    }

    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overridePermissions
     *        Optional permission overrides that are applied to the resource configuration before import.
     */

    public void setOverridePermissions(AssetBundleImportJobOverridePermissions overridePermissions) {
        this.overridePermissions = overridePermissions;
    }

    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @return Optional permission overrides that are applied to the resource configuration before import.
     */

    public AssetBundleImportJobOverridePermissions getOverridePermissions() {
        return this.overridePermissions;
    }

    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overridePermissions
     *        Optional permission overrides that are applied to the resource configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withOverridePermissions(AssetBundleImportJobOverridePermissions overridePermissions) {
        setOverridePermissions(overridePermissions);
        return this;
    }

    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideTags
     *        Optional tag overrides that are applied to the resource configuration before import.
     */

    public void setOverrideTags(AssetBundleImportJobOverrideTags overrideTags) {
        this.overrideTags = overrideTags;
    }

    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @return Optional tag overrides that are applied to the resource configuration before import.
     */

    public AssetBundleImportJobOverrideTags getOverrideTags() {
        return this.overrideTags;
    }

    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideTags
     *        Optional tag overrides that are applied to the resource configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withOverrideTags(AssetBundleImportJobOverrideTags overrideTags) {
        setOverrideTags(overrideTags);
        return this;
    }

    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards that is applied to the resource
     * configuration before import.
     * </p>
     * 
     * @param overrideValidationStrategy
     *        An optional validation strategy override for all analyses and dashboards that is applied to the resource
     *        configuration before import.
     */

    public void setOverrideValidationStrategy(AssetBundleImportJobOverrideValidationStrategy overrideValidationStrategy) {
        this.overrideValidationStrategy = overrideValidationStrategy;
    }

    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards that is applied to the resource
     * configuration before import.
     * </p>
     * 
     * @return An optional validation strategy override for all analyses and dashboards that is applied to the resource
     *         configuration before import.
     */

    public AssetBundleImportJobOverrideValidationStrategy getOverrideValidationStrategy() {
        return this.overrideValidationStrategy;
    }

    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards that is applied to the resource
     * configuration before import.
     * </p>
     * 
     * @param overrideValidationStrategy
     *        An optional validation strategy override for all analyses and dashboards that is applied to the resource
     *        configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleImportJobRequest withOverrideValidationStrategy(AssetBundleImportJobOverrideValidationStrategy overrideValidationStrategy) {
        setOverrideValidationStrategy(overrideValidationStrategy);
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
        if (getAssetBundleImportJobId() != null)
            sb.append("AssetBundleImportJobId: ").append(getAssetBundleImportJobId()).append(",");
        if (getAssetBundleImportSource() != null)
            sb.append("AssetBundleImportSource: ").append(getAssetBundleImportSource()).append(",");
        if (getOverrideParameters() != null)
            sb.append("OverrideParameters: ").append(getOverrideParameters()).append(",");
        if (getFailureAction() != null)
            sb.append("FailureAction: ").append(getFailureAction()).append(",");
        if (getOverridePermissions() != null)
            sb.append("OverridePermissions: ").append(getOverridePermissions()).append(",");
        if (getOverrideTags() != null)
            sb.append("OverrideTags: ").append(getOverrideTags()).append(",");
        if (getOverrideValidationStrategy() != null)
            sb.append("OverrideValidationStrategy: ").append(getOverrideValidationStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAssetBundleImportJobRequest == false)
            return false;
        StartAssetBundleImportJobRequest other = (StartAssetBundleImportJobRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssetBundleImportJobId() == null ^ this.getAssetBundleImportJobId() == null)
            return false;
        if (other.getAssetBundleImportJobId() != null && other.getAssetBundleImportJobId().equals(this.getAssetBundleImportJobId()) == false)
            return false;
        if (other.getAssetBundleImportSource() == null ^ this.getAssetBundleImportSource() == null)
            return false;
        if (other.getAssetBundleImportSource() != null && other.getAssetBundleImportSource().equals(this.getAssetBundleImportSource()) == false)
            return false;
        if (other.getOverrideParameters() == null ^ this.getOverrideParameters() == null)
            return false;
        if (other.getOverrideParameters() != null && other.getOverrideParameters().equals(this.getOverrideParameters()) == false)
            return false;
        if (other.getFailureAction() == null ^ this.getFailureAction() == null)
            return false;
        if (other.getFailureAction() != null && other.getFailureAction().equals(this.getFailureAction()) == false)
            return false;
        if (other.getOverridePermissions() == null ^ this.getOverridePermissions() == null)
            return false;
        if (other.getOverridePermissions() != null && other.getOverridePermissions().equals(this.getOverridePermissions()) == false)
            return false;
        if (other.getOverrideTags() == null ^ this.getOverrideTags() == null)
            return false;
        if (other.getOverrideTags() != null && other.getOverrideTags().equals(this.getOverrideTags()) == false)
            return false;
        if (other.getOverrideValidationStrategy() == null ^ this.getOverrideValidationStrategy() == null)
            return false;
        if (other.getOverrideValidationStrategy() != null && other.getOverrideValidationStrategy().equals(this.getOverrideValidationStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleImportJobId() == null) ? 0 : getAssetBundleImportJobId().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleImportSource() == null) ? 0 : getAssetBundleImportSource().hashCode());
        hashCode = prime * hashCode + ((getOverrideParameters() == null) ? 0 : getOverrideParameters().hashCode());
        hashCode = prime * hashCode + ((getFailureAction() == null) ? 0 : getFailureAction().hashCode());
        hashCode = prime * hashCode + ((getOverridePermissions() == null) ? 0 : getOverridePermissions().hashCode());
        hashCode = prime * hashCode + ((getOverrideTags() == null) ? 0 : getOverrideTags().hashCode());
        hashCode = prime * hashCode + ((getOverrideValidationStrategy() == null) ? 0 : getOverrideValidationStrategy().hashCode());
        return hashCode;
    }

    @Override
    public StartAssetBundleImportJobRequest clone() {
        return (StartAssetBundleImportJobRequest) super.clone();
    }

}
