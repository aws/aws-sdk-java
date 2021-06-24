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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateReportGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReportGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the report group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of report group.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about where the report group test results are
     * exported.
     * </p>
     */
    private ReportExportConfig exportConfig;
    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the report group.
     * </p>
     * 
     * @param name
     *        The name of the report group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the report group.
     * </p>
     * 
     * @return The name of the report group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the report group.
     * </p>
     * 
     * @param name
     *        The name of the report group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReportGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * 
     * @param type
     *        The type of report group.
     * @see ReportType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * 
     * @return The type of report group.
     * @see ReportType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * 
     * @param type
     *        The type of report group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public CreateReportGroupRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * 
     * @param type
     *        The type of report group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public CreateReportGroupRequest withType(ReportType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about where the report group test results are
     * exported.
     * </p>
     * 
     * @param exportConfig
     *        A <code>ReportExportConfig</code> object that contains information about where the report group test
     *        results are exported.
     */

    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about where the report group test results are
     * exported.
     * </p>
     * 
     * @return A <code>ReportExportConfig</code> object that contains information about where the report group test
     *         results are exported.
     */

    public ReportExportConfig getExportConfig() {
        return this.exportConfig;
    }

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about where the report group test results are
     * exported.
     * </p>
     * 
     * @param exportConfig
     *        A <code>ReportExportConfig</code> object that contains information about where the report group test
     *        results are exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReportGroupRequest withExportConfig(ReportExportConfig exportConfig) {
        setExportConfig(exportConfig);
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * 
     * @return A list of tag key and value pairs associated with this report group. </p>
     *         <p>
     *         These tags are available for use by Amazon Web Services services that support CodeBuild report group
     *         tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this report group. </p>
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
     * A list of tag key and value pairs associated with this report group.
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
     *        A list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReportGroupRequest withTags(Tag... tags) {
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
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this report group. </p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReportGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof CreateReportGroupRequest == false)
            return false;
        CreateReportGroupRequest other = (CreateReportGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateReportGroupRequest clone() {
        return (CreateReportGroupRequest) super.clone();
    }

}
