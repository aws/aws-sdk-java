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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetEntriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry only if one or more of the labels in
     * <code>ContainsLabels</code> exist in the entry.
     * </p>
     */
    private java.util.List<String> containsLabels;
    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify <code>false</code> to
     * get only the JSON Lines where the image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     * </p>
     */
    private Boolean labeled;
    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     * <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code> field
     * contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks such as getting
     * the JSON Line for a single image, or gettting JSON Lines for all images within a specific folder.
     * </p>
     */
    private String sourceRefContains;
    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to only include entries that have errors.
     * </p>
     */
    private Boolean hasErrors;
    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
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
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) for the dataset that you want to use.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the dataset that you want to use.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset that you want to use.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) for the dataset that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry only if one or more of the labels in
     * <code>ContainsLabels</code> exist in the entry.
     * </p>
     * 
     * @return Specifies a label filter for the response. The response includes an entry only if one or more of the
     *         labels in <code>ContainsLabels</code> exist in the entry.
     */

    public java.util.List<String> getContainsLabels() {
        return containsLabels;
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry only if one or more of the labels in
     * <code>ContainsLabels</code> exist in the entry.
     * </p>
     * 
     * @param containsLabels
     *        Specifies a label filter for the response. The response includes an entry only if one or more of the
     *        labels in <code>ContainsLabels</code> exist in the entry.
     */

    public void setContainsLabels(java.util.Collection<String> containsLabels) {
        if (containsLabels == null) {
            this.containsLabels = null;
            return;
        }

        this.containsLabels = new java.util.ArrayList<String>(containsLabels);
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry only if one or more of the labels in
     * <code>ContainsLabels</code> exist in the entry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainsLabels(java.util.Collection)} or {@link #withContainsLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param containsLabels
     *        Specifies a label filter for the response. The response includes an entry only if one or more of the
     *        labels in <code>ContainsLabels</code> exist in the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withContainsLabels(String... containsLabels) {
        if (this.containsLabels == null) {
            setContainsLabels(new java.util.ArrayList<String>(containsLabels.length));
        }
        for (String ele : containsLabels) {
            this.containsLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a label filter for the response. The response includes an entry only if one or more of the labels in
     * <code>ContainsLabels</code> exist in the entry.
     * </p>
     * 
     * @param containsLabels
     *        Specifies a label filter for the response. The response includes an entry only if one or more of the
     *        labels in <code>ContainsLabels</code> exist in the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withContainsLabels(java.util.Collection<String> containsLabels) {
        setContainsLabels(containsLabels);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify <code>false</code> to
     * get only the JSON Lines where the image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     * </p>
     * 
     * @param labeled
     *        Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify
     *        <code>false</code> to get only the JSON Lines where the image isn't labeled. If you don't specify
     *        <code>Labeled</code>, <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     */

    public void setLabeled(Boolean labeled) {
        this.labeled = labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify <code>false</code> to
     * get only the JSON Lines where the image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     * </p>
     * 
     * @return Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify
     *         <code>false</code> to get only the JSON Lines where the image isn't labeled. If you don't specify
     *         <code>Labeled</code>, <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled
     *         images.
     */

    public Boolean getLabeled() {
        return this.labeled;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify <code>false</code> to
     * get only the JSON Lines where the image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     * </p>
     * 
     * @param labeled
     *        Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify
     *        <code>false</code> to get only the JSON Lines where the image isn't labeled. If you don't specify
     *        <code>Labeled</code>, <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withLabeled(Boolean labeled) {
        setLabeled(labeled);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify <code>false</code> to
     * get only the JSON Lines where the image isn't labeled. If you don't specify <code>Labeled</code>,
     * <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled images.
     * </p>
     * 
     * @return Specify <code>true</code> to get only the JSON Lines where the image is labeled. Specify
     *         <code>false</code> to get only the JSON Lines where the image isn't labeled. If you don't specify
     *         <code>Labeled</code>, <code>ListDatasetEntries</code> returns JSON Lines for labeled and unlabeled
     *         images.
     */

    public Boolean isLabeled() {
        return this.labeled;
    }

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     * <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code> field
     * contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks such as getting
     * the JSON Line for a single image, or gettting JSON Lines for all images within a specific folder.
     * </p>
     * 
     * @param sourceRefContains
     *        If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     *        <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code>
     *        field contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks
     *        such as getting the JSON Line for a single image, or gettting JSON Lines for all images within a specific
     *        folder.
     */

    public void setSourceRefContains(String sourceRefContains) {
        this.sourceRefContains = sourceRefContains;
    }

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     * <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code> field
     * contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks such as getting
     * the JSON Line for a single image, or gettting JSON Lines for all images within a specific folder.
     * </p>
     * 
     * @return If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     *         <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code>
     *         field contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks
     *         such as getting the JSON Line for a single image, or gettting JSON Lines for all images within a specific
     *         folder.
     */

    public String getSourceRefContains() {
        return this.sourceRefContains;
    }

    /**
     * <p>
     * If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     * <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code> field
     * contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks such as getting
     * the JSON Line for a single image, or gettting JSON Lines for all images within a specific folder.
     * </p>
     * 
     * @param sourceRefContains
     *        If specified, <code>ListDatasetEntries</code> only returns JSON Lines where the value of
     *        <code>SourceRefContains</code> is part of the <code>source-ref</code> field. The <code>source-ref</code>
     *        field contains the Amazon S3 location of the image. You can use <code>SouceRefContains</code> for tasks
     *        such as getting the JSON Line for a single image, or gettting JSON Lines for all images within a specific
     *        folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withSourceRefContains(String sourceRefContains) {
        setSourceRefContains(sourceRefContains);
        return this;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to only include entries that have errors.
     * </p>
     * 
     * @param hasErrors
     *        Specifies an error filter for the response. Specify <code>True</code> to only include entries that have
     *        errors.
     */

    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to only include entries that have errors.
     * </p>
     * 
     * @return Specifies an error filter for the response. Specify <code>True</code> to only include entries that have
     *         errors.
     */

    public Boolean getHasErrors() {
        return this.hasErrors;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to only include entries that have errors.
     * </p>
     * 
     * @param hasErrors
     *        Specifies an error filter for the response. Specify <code>True</code> to only include entries that have
     *        errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetEntriesRequest withHasErrors(Boolean hasErrors) {
        setHasErrors(hasErrors);
        return this;
    }

    /**
     * <p>
     * Specifies an error filter for the response. Specify <code>True</code> to only include entries that have errors.
     * </p>
     * 
     * @return Specifies an error filter for the response. Specify <code>True</code> to only include entries that have
     *         errors.
     */

    public Boolean isHasErrors() {
        return this.hasErrors;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *         Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getContainsLabels() != null)
            sb.append("ContainsLabels: ").append(getContainsLabels()).append(",");
        if (getLabeled() != null)
            sb.append("Labeled: ").append(getLabeled()).append(",");
        if (getSourceRefContains() != null)
            sb.append("SourceRefContains: ").append(getSourceRefContains()).append(",");
        if (getHasErrors() != null)
            sb.append("HasErrors: ").append(getHasErrors()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
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
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getContainsLabels() == null ^ this.getContainsLabels() == null)
            return false;
        if (other.getContainsLabels() != null && other.getContainsLabels().equals(this.getContainsLabels()) == false)
            return false;
        if (other.getLabeled() == null ^ this.getLabeled() == null)
            return false;
        if (other.getLabeled() != null && other.getLabeled().equals(this.getLabeled()) == false)
            return false;
        if (other.getSourceRefContains() == null ^ this.getSourceRefContains() == null)
            return false;
        if (other.getSourceRefContains() != null && other.getSourceRefContains().equals(this.getSourceRefContains()) == false)
            return false;
        if (other.getHasErrors() == null ^ this.getHasErrors() == null)
            return false;
        if (other.getHasErrors() != null && other.getHasErrors().equals(this.getHasErrors()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getContainsLabels() == null) ? 0 : getContainsLabels().hashCode());
        hashCode = prime * hashCode + ((getLabeled() == null) ? 0 : getLabeled().hashCode());
        hashCode = prime * hashCode + ((getSourceRefContains() == null) ? 0 : getSourceRefContains().hashCode());
        hashCode = prime * hashCode + ((getHasErrors() == null) ? 0 : getHasErrors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetEntriesRequest clone() {
        return (ListDatasetEntriesRequest) super.clone();
    }

}
