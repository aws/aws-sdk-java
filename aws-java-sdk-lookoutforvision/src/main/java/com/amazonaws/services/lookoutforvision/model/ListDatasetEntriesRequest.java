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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListDatasetEntries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetEntriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the dataset that you want to list.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset. Specify
     * <code>test</code> to list the test dataset. If you have a single dataset project, specify <code>train</code>.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't specify
     * a value, Lookout for Vision returns all entries.
     * </p>
     */
    private Boolean labeled;
    /**
     * <p>
     * Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include anomalous
     * entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous images.
     * </p>
     */
    private String anomalyClass;
    /**
     * <p>
     * Only includes entries before the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     */
    private java.util.Date beforeCreationDate;
    /**
     * <p>
     * Only includes entries after the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     */
    private java.util.Date afterCreationDate;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of dataset
     * entries.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For example a
     * value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches <i>*IMG_17*</i>.
     * </p>
     */
    private String sourceRefContains;

    /**
     * <p>
     * The name of the project that contains the dataset that you want to list.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to list.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to list.
     * </p>
     * 
     * @return The name of the project that contains the dataset that you want to list.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to list.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset. Specify
     * <code>test</code> to list the test dataset. If you have a single dataset project, specify <code>train</code>.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset.
     *        Specify <code>test</code> to list the test dataset. If you have a single dataset project, specify
     *        <code>train</code>.
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset. Specify
     * <code>test</code> to list the test dataset. If you have a single dataset project, specify <code>train</code>.
     * </p>
     * 
     * @return The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset.
     *         Specify <code>test</code> to list the test dataset. If you have a single dataset project, specify
     *         <code>train</code>.
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset. Specify
     * <code>test</code> to list the test dataset. If you have a single dataset project, specify <code>train</code>.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset that you want to list. Specify <code>train</code> to list the training dataset.
     *        Specify <code>test</code> to list the test dataset. If you have a single dataset project, specify
     *        <code>train</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't specify
     * a value, Lookout for Vision returns all entries.
     * </p>
     * 
     * @param labeled
     *        Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't
     *        specify a value, Lookout for Vision returns all entries.
     */

    public void setLabeled(Boolean labeled) {
        this.labeled = labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't specify
     * a value, Lookout for Vision returns all entries.
     * </p>
     * 
     * @return Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't
     *         specify a value, Lookout for Vision returns all entries.
     */

    public Boolean getLabeled() {
        return this.labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't specify
     * a value, Lookout for Vision returns all entries.
     * </p>
     * 
     * @param labeled
     *        Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't
     *        specify a value, Lookout for Vision returns all entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withLabeled(Boolean labeled) {
        setLabeled(labeled);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't specify
     * a value, Lookout for Vision returns all entries.
     * </p>
     * 
     * @return Specify <code>true</code> to include labeled entries, otherwise specify <code>false</code>. If you don't
     *         specify a value, Lookout for Vision returns all entries.
     */

    public Boolean isLabeled() {
        return this.labeled;
    }

    /**
     * <p>
     * Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include anomalous
     * entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous images.
     * </p>
     * 
     * @param anomalyClass
     *        Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include
     *        anomalous entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous
     *        images.
     */

    public void setAnomalyClass(String anomalyClass) {
        this.anomalyClass = anomalyClass;
    }

    /**
     * <p>
     * Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include anomalous
     * entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous images.
     * </p>
     * 
     * @return Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include
     *         anomalous entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous
     *         images.
     */

    public String getAnomalyClass() {
        return this.anomalyClass;
    }

    /**
     * <p>
     * Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include anomalous
     * entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous images.
     * </p>
     * 
     * @param anomalyClass
     *        Specify <code>normal</code> to include only normal images. Specify <code>anomaly</code> to only include
     *        anomalous entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous
     *        images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withAnomalyClass(String anomalyClass) {
        setAnomalyClass(anomalyClass);
        return this;
    }

    /**
     * <p>
     * Only includes entries before the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     * 
     * @param beforeCreationDate
     *        Only includes entries before the specified date in the response. For example,
     *        <code>2020-06-23T00:00:00</code>.
     */

    public void setBeforeCreationDate(java.util.Date beforeCreationDate) {
        this.beforeCreationDate = beforeCreationDate;
    }

    /**
     * <p>
     * Only includes entries before the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     * 
     * @return Only includes entries before the specified date in the response. For example,
     *         <code>2020-06-23T00:00:00</code>.
     */

    public java.util.Date getBeforeCreationDate() {
        return this.beforeCreationDate;
    }

    /**
     * <p>
     * Only includes entries before the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     * 
     * @param beforeCreationDate
     *        Only includes entries before the specified date in the response. For example,
     *        <code>2020-06-23T00:00:00</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withBeforeCreationDate(java.util.Date beforeCreationDate) {
        setBeforeCreationDate(beforeCreationDate);
        return this;
    }

    /**
     * <p>
     * Only includes entries after the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     * 
     * @param afterCreationDate
     *        Only includes entries after the specified date in the response. For example,
     *        <code>2020-06-23T00:00:00</code>.
     */

    public void setAfterCreationDate(java.util.Date afterCreationDate) {
        this.afterCreationDate = afterCreationDate;
    }

    /**
     * <p>
     * Only includes entries after the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     * 
     * @return Only includes entries after the specified date in the response. For example,
     *         <code>2020-06-23T00:00:00</code>.
     */

    public java.util.Date getAfterCreationDate() {
        return this.afterCreationDate;
    }

    /**
     * <p>
     * Only includes entries after the specified date in the response. For example, <code>2020-06-23T00:00:00</code>.
     * </p>
     * 
     * @param afterCreationDate
     *        Only includes entries after the specified date in the response. For example,
     *        <code>2020-06-23T00:00:00</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withAfterCreationDate(java.util.Date afterCreationDate) {
        setAfterCreationDate(afterCreationDate);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of dataset
     * entries.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for
     *        Vision returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of dataset entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of dataset
     * entries.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for
     *         Vision returns a pagination token in the response. You can use this pagination token to retrieve the next
     *         set of dataset entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of dataset
     * entries.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for
     *        Vision returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of dataset entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *        you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @return The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *         you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *        you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For example a
     * value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches <i>*IMG_17*</i>.
     * </p>
     * 
     * @param sourceRefContains
     *        Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For
     *        example a value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches
     *        <i>*IMG_17*</i>.
     */

    public void setSourceRefContains(String sourceRefContains) {
        this.sourceRefContains = sourceRefContains;
    }

    /**
     * <p>
     * Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For example a
     * value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches <i>*IMG_17*</i>.
     * </p>
     * 
     * @return Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For
     *         example a value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches
     *         <i>*IMG_17*</i>.
     */

    public String getSourceRefContains() {
        return this.sourceRefContains;
    }

    /**
     * <p>
     * Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For example a
     * value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches <i>*IMG_17*</i>.
     * </p>
     * 
     * @param sourceRefContains
     *        Perform a "contains" search on the values of the <code>source-ref</code> key within the dataset. For
     *        example a value of "IMG_17" returns all JSON Lines where the <code>source-ref</code> key value matches
     *        <i>*IMG_17*</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withSourceRefContains(String sourceRefContains) {
        setSourceRefContains(sourceRefContains);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getLabeled() != null)
            sb.append("Labeled: ").append(getLabeled()).append(",");
        if (getAnomalyClass() != null)
            sb.append("AnomalyClass: ").append(getAnomalyClass()).append(",");
        if (getBeforeCreationDate() != null)
            sb.append("BeforeCreationDate: ").append(getBeforeCreationDate()).append(",");
        if (getAfterCreationDate() != null)
            sb.append("AfterCreationDate: ").append(getAfterCreationDate()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSourceRefContains() != null)
            sb.append("SourceRefContains: ").append(getSourceRefContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetEntriesRequest == false)
            return false;
        ListDatasetEntriesRequest other = (ListDatasetEntriesRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getLabeled() == null ^ this.getLabeled() == null)
            return false;
        if (other.getLabeled() != null && other.getLabeled().equals(this.getLabeled()) == false)
            return false;
        if (other.getAnomalyClass() == null ^ this.getAnomalyClass() == null)
            return false;
        if (other.getAnomalyClass() != null && other.getAnomalyClass().equals(this.getAnomalyClass()) == false)
            return false;
        if (other.getBeforeCreationDate() == null ^ this.getBeforeCreationDate() == null)
            return false;
        if (other.getBeforeCreationDate() != null && other.getBeforeCreationDate().equals(this.getBeforeCreationDate()) == false)
            return false;
        if (other.getAfterCreationDate() == null ^ this.getAfterCreationDate() == null)
            return false;
        if (other.getAfterCreationDate() != null && other.getAfterCreationDate().equals(this.getAfterCreationDate()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSourceRefContains() == null ^ this.getSourceRefContains() == null)
            return false;
        if (other.getSourceRefContains() != null && other.getSourceRefContains().equals(this.getSourceRefContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getLabeled() == null) ? 0 : getLabeled().hashCode());
        hashCode = prime * hashCode + ((getAnomalyClass() == null) ? 0 : getAnomalyClass().hashCode());
        hashCode = prime * hashCode + ((getBeforeCreationDate() == null) ? 0 : getBeforeCreationDate().hashCode());
        hashCode = prime * hashCode + ((getAfterCreationDate() == null) ? 0 : getAfterCreationDate().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSourceRefContains() == null) ? 0 : getSourceRefContains().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetEntriesRequest clone() {
        return (ListDatasetEntriesRequest) super.clone();
    }

}
