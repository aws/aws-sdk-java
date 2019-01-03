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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetExclusionsPreview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExclusionsPreviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the status of the request to generate an exclusions preview.
     * </p>
     */
    private String previewStatus;
    /**
     * <p>
     * Information about the exclusions included in the preview.
     * </p>
     */
    private java.util.List<ExclusionPreview> exclusionPreviews;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameters is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the status of the request to generate an exclusions preview.
     * </p>
     * 
     * @param previewStatus
     *        Specifies the status of the request to generate an exclusions preview.
     * @see PreviewStatus
     */

    public void setPreviewStatus(String previewStatus) {
        this.previewStatus = previewStatus;
    }

    /**
     * <p>
     * Specifies the status of the request to generate an exclusions preview.
     * </p>
     * 
     * @return Specifies the status of the request to generate an exclusions preview.
     * @see PreviewStatus
     */

    public String getPreviewStatus() {
        return this.previewStatus;
    }

    /**
     * <p>
     * Specifies the status of the request to generate an exclusions preview.
     * </p>
     * 
     * @param previewStatus
     *        Specifies the status of the request to generate an exclusions preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreviewStatus
     */

    public GetExclusionsPreviewResult withPreviewStatus(String previewStatus) {
        setPreviewStatus(previewStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the request to generate an exclusions preview.
     * </p>
     * 
     * @param previewStatus
     *        Specifies the status of the request to generate an exclusions preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreviewStatus
     */

    public GetExclusionsPreviewResult withPreviewStatus(PreviewStatus previewStatus) {
        this.previewStatus = previewStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the exclusions included in the preview.
     * </p>
     * 
     * @return Information about the exclusions included in the preview.
     */

    public java.util.List<ExclusionPreview> getExclusionPreviews() {
        return exclusionPreviews;
    }

    /**
     * <p>
     * Information about the exclusions included in the preview.
     * </p>
     * 
     * @param exclusionPreviews
     *        Information about the exclusions included in the preview.
     */

    public void setExclusionPreviews(java.util.Collection<ExclusionPreview> exclusionPreviews) {
        if (exclusionPreviews == null) {
            this.exclusionPreviews = null;
            return;
        }

        this.exclusionPreviews = new java.util.ArrayList<ExclusionPreview>(exclusionPreviews);
    }

    /**
     * <p>
     * Information about the exclusions included in the preview.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPreviews(java.util.Collection)} or {@link #withExclusionPreviews(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPreviews
     *        Information about the exclusions included in the preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewResult withExclusionPreviews(ExclusionPreview... exclusionPreviews) {
        if (this.exclusionPreviews == null) {
            setExclusionPreviews(new java.util.ArrayList<ExclusionPreview>(exclusionPreviews.length));
        }
        for (ExclusionPreview ele : exclusionPreviews) {
            this.exclusionPreviews.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the exclusions included in the preview.
     * </p>
     * 
     * @param exclusionPreviews
     *        Information about the exclusions included in the preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewResult withExclusionPreviews(java.util.Collection<ExclusionPreview> exclusionPreviews) {
        setExclusionPreviews(exclusionPreviews);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameters is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameters is present in the
     *        response and contains the value to use for the nextToken parameter in a subsequent pagination request. If
     *        there is no more data to be listed, this parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameters is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed, this parameters is present in the
     *         response and contains the value to use for the nextToken parameter in a subsequent pagination request. If
     *         there is no more data to be listed, this parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameters is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameters is present in the
     *        response and contains the value to use for the nextToken parameter in a subsequent pagination request. If
     *        there is no more data to be listed, this parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExclusionsPreviewResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPreviewStatus() != null)
            sb.append("PreviewStatus: ").append(getPreviewStatus()).append(",");
        if (getExclusionPreviews() != null)
            sb.append("ExclusionPreviews: ").append(getExclusionPreviews()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExclusionsPreviewResult == false)
            return false;
        GetExclusionsPreviewResult other = (GetExclusionsPreviewResult) obj;
        if (other.getPreviewStatus() == null ^ this.getPreviewStatus() == null)
            return false;
        if (other.getPreviewStatus() != null && other.getPreviewStatus().equals(this.getPreviewStatus()) == false)
            return false;
        if (other.getExclusionPreviews() == null ^ this.getExclusionPreviews() == null)
            return false;
        if (other.getExclusionPreviews() != null && other.getExclusionPreviews().equals(this.getExclusionPreviews()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreviewStatus() == null) ? 0 : getPreviewStatus().hashCode());
        hashCode = prime * hashCode + ((getExclusionPreviews() == null) ? 0 : getExclusionPreviews().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetExclusionsPreviewResult clone() {
        try {
            return (GetExclusionsPreviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
