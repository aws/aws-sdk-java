/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DetectCustomLabelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     */
    private String projectVersionArn;

    private Image image;
    /**
     * <p>
     * Maximum number of results you want the service to return in the response. The service returns the specified
     * number of highest confidence labels ranked from highest confidence to lowest.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence lower than this specified value. If you specify a value of 0, all labels are return, regardless
     * of the default thresholds that the model version applies.
     * </p>
     */
    private Float minConfidence;

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * 
     * @param projectVersionArn
     *        The ARN of the model version that you want to use.
     */

    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * 
     * @return The ARN of the model version that you want to use.
     */

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * 
     * @param projectVersionArn
     *        The ARN of the model version that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectCustomLabelsRequest withProjectVersionArn(String projectVersionArn) {
        setProjectVersionArn(projectVersionArn);
        return this;
    }

    /**
     * @param image
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * @param image
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectCustomLabelsRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Maximum number of results you want the service to return in the response. The service returns the specified
     * number of highest confidence labels ranked from highest confidence to lowest.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results you want the service to return in the response. The service returns the
     *        specified number of highest confidence labels ranked from highest confidence to lowest.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results you want the service to return in the response. The service returns the specified
     * number of highest confidence labels ranked from highest confidence to lowest.
     * </p>
     * 
     * @return Maximum number of results you want the service to return in the response. The service returns the
     *         specified number of highest confidence labels ranked from highest confidence to lowest.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results you want the service to return in the response. The service returns the specified
     * number of highest confidence labels ranked from highest confidence to lowest.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results you want the service to return in the response. The service returns the
     *        specified number of highest confidence labels ranked from highest confidence to lowest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectCustomLabelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence lower than this specified value. If you specify a value of 0, all labels are return, regardless
     * of the default thresholds that the model version applies.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with a confidence lower than this specified value. If you specify a value of 0, all labels are
     *        return, regardless of the default thresholds that the model version applies.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence lower than this specified value. If you specify a value of 0, all labels are return, regardless
     * of the default thresholds that the model version applies.
     * </p>
     * 
     * @return Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *         labels with a confidence lower than this specified value. If you specify a value of 0, all labels are
     *         return, regardless of the default thresholds that the model version applies.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence lower than this specified value. If you specify a value of 0, all labels are return, regardless
     * of the default thresholds that the model version applies.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with a confidence lower than this specified value. If you specify a value of 0, all labels are
     *        return, regardless of the default thresholds that the model version applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectCustomLabelsRequest withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: ").append(getProjectVersionArn()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectCustomLabelsRequest == false)
            return false;
        DetectCustomLabelsRequest other = (DetectCustomLabelsRequest) obj;
        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public DetectCustomLabelsRequest clone() {
        return (DetectCustomLabelsRequest) super.clone();
    }

}
