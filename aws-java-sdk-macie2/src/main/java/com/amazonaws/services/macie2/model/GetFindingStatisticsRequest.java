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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     */
    private FindingCriteria findingCriteria;
    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity level of the finding, such as High or Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     */
    private String groupBy;
    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     */
    private FindingStatisticsSortCriteria sortCriteria;

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * 
     * @param findingCriteria
     *        The criteria to use to filter the query results.
     */

    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * 
     * @return The criteria to use to filter the query results.
     */

    public FindingCriteria getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * 
     * @param findingCriteria
     *        The criteria to use to filter the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingStatisticsRequest withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity level of the finding, such as High or Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        The finding property to use to group the query results. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        severity.description - The severity level of the finding, such as High or Medium.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     *        </p>
     *        </li>
     * @see GroupBy
     */

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity level of the finding, such as High or Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The finding property to use to group the query results. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         severity.description - The severity level of the finding, such as High or Medium.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     *         </p>
     *         </li>
     * @see GroupBy
     */

    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity level of the finding, such as High or Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        The finding property to use to group the query results. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        severity.description - The severity level of the finding, such as High or Medium.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupBy
     */

    public GetFindingStatisticsRequest withGroupBy(String groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity level of the finding, such as High or Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        The finding property to use to group the query results. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        classificationDetails.jobId - The unique identifier for the classification job that produced the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        severity.description - The severity level of the finding, such as High or Medium.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupBy
     */

    public GetFindingStatisticsRequest withGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @param size
     *        The maximum number of items to include in each page of the response.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @return The maximum number of items to include in each page of the response.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @param size
     *        The maximum number of items to include in each page of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingStatisticsRequest withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @param sortCriteria
     *        The criteria to use to sort the query results.
     */

    public void setSortCriteria(FindingStatisticsSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @return The criteria to use to sort the query results.
     */

    public FindingStatisticsSortCriteria getSortCriteria() {
        return this.sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @param sortCriteria
     *        The criteria to use to sort the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingStatisticsRequest withSortCriteria(FindingStatisticsSortCriteria sortCriteria) {
        setSortCriteria(sortCriteria);
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
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingStatisticsRequest == false)
            return false;
        GetFindingStatisticsRequest other = (GetFindingStatisticsRequest) obj;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingStatisticsRequest clone() {
        return (GetFindingStatisticsRequest) super.clone();
    }

}
