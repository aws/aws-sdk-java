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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateReportGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReportGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     */
    private ReportExportConfig exportConfig;
    /**
     * <p>
     * An updated list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * 
     * @param arn
     *        The ARN of the report group to update.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * 
     * @return The ARN of the report group to update.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * 
     * @param arn
     *        The ARN of the report group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportGroupRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportConfig
     *        Used to specify an updated export type. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>: The report results are exported to an S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_EXPORT</code>: The report results are not exported.
     *        </p>
     *        </li>
     */

    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Used to specify an updated export type. Valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>S3</code>: The report results are exported to an S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_EXPORT</code>: The report results are not exported.
     *         </p>
     *         </li>
     */

    public ReportExportConfig getExportConfig() {
        return this.exportConfig;
    }

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportConfig
     *        Used to specify an updated export type. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>: The report results are exported to an S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_EXPORT</code>: The report results are not exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportGroupRequest withExportConfig(ReportExportConfig exportConfig) {
        setExportConfig(exportConfig);
        return this;
    }

    /**
     * <p>
     * An updated list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * 
     * @return An updated list of tag key and value pairs associated with this report group. </p>
     *         <p>
     *         These tags are available for use by Amazon Web Services services that support CodeBuild report group
     *         tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An updated list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * 
     * @param tags
     *        An updated list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An updated list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An updated list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An updated list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * 
     * @param tags
     *        An updated list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getExportConfig() != null)
            sb.append("ExportConfig: ").append(getExportConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportGroupRequest == false)
            return false;
        UpdateReportGroupRequest other = (UpdateReportGroupRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getExportConfig() == null ^ this.getExportConfig() == null)
            return false;
        if (other.getExportConfig() != null && other.getExportConfig().equals(this.getExportConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReportGroupRequest clone() {
        return (UpdateReportGroupRequest) super.clone();
    }

}
