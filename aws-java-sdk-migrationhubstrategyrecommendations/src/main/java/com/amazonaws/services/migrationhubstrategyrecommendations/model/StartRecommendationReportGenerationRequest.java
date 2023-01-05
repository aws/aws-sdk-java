/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartRecommendationReportGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRecommendationReportGenerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Groups the resources in the recommendation report with a unique name.
     * </p>
     */
    private java.util.List<Group> groupIdFilter;
    /**
     * <p>
     * The output format for the recommendation report file. The default format is Microsoft Excel.
     * </p>
     */
    private String outputFormat;

    /**
     * <p>
     * Groups the resources in the recommendation report with a unique name.
     * </p>
     * 
     * @return Groups the resources in the recommendation report with a unique name.
     */

    public java.util.List<Group> getGroupIdFilter() {
        return groupIdFilter;
    }

    /**
     * <p>
     * Groups the resources in the recommendation report with a unique name.
     * </p>
     * 
     * @param groupIdFilter
     *        Groups the resources in the recommendation report with a unique name.
     */

    public void setGroupIdFilter(java.util.Collection<Group> groupIdFilter) {
        if (groupIdFilter == null) {
            this.groupIdFilter = null;
            return;
        }

        this.groupIdFilter = new java.util.ArrayList<Group>(groupIdFilter);
    }

    /**
     * <p>
     * Groups the resources in the recommendation report with a unique name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIdFilter(java.util.Collection)} or {@link #withGroupIdFilter(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param groupIdFilter
     *        Groups the resources in the recommendation report with a unique name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecommendationReportGenerationRequest withGroupIdFilter(Group... groupIdFilter) {
        if (this.groupIdFilter == null) {
            setGroupIdFilter(new java.util.ArrayList<Group>(groupIdFilter.length));
        }
        for (Group ele : groupIdFilter) {
            this.groupIdFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Groups the resources in the recommendation report with a unique name.
     * </p>
     * 
     * @param groupIdFilter
     *        Groups the resources in the recommendation report with a unique name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecommendationReportGenerationRequest withGroupIdFilter(java.util.Collection<Group> groupIdFilter) {
        setGroupIdFilter(groupIdFilter);
        return this;
    }

    /**
     * <p>
     * The output format for the recommendation report file. The default format is Microsoft Excel.
     * </p>
     * 
     * @param outputFormat
     *        The output format for the recommendation report file. The default format is Microsoft Excel.
     * @see OutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The output format for the recommendation report file. The default format is Microsoft Excel.
     * </p>
     * 
     * @return The output format for the recommendation report file. The default format is Microsoft Excel.
     * @see OutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The output format for the recommendation report file. The default format is Microsoft Excel.
     * </p>
     * 
     * @param outputFormat
     *        The output format for the recommendation report file. The default format is Microsoft Excel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public StartRecommendationReportGenerationRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The output format for the recommendation report file. The default format is Microsoft Excel.
     * </p>
     * 
     * @param outputFormat
     *        The output format for the recommendation report file. The default format is Microsoft Excel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public StartRecommendationReportGenerationRequest withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
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
        if (getGroupIdFilter() != null)
            sb.append("GroupIdFilter: ").append(getGroupIdFilter()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartRecommendationReportGenerationRequest == false)
            return false;
        StartRecommendationReportGenerationRequest other = (StartRecommendationReportGenerationRequest) obj;
        if (other.getGroupIdFilter() == null ^ this.getGroupIdFilter() == null)
            return false;
        if (other.getGroupIdFilter() != null && other.getGroupIdFilter().equals(this.getGroupIdFilter()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupIdFilter() == null) ? 0 : getGroupIdFilter().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        return hashCode;
    }

    @Override
    public StartRecommendationReportGenerationRequest clone() {
        return (StartRecommendationReportGenerationRequest) super.clone();
    }

}
