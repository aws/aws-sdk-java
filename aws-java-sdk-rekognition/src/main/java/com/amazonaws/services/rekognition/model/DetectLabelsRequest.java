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
public class DetectLabelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     */
    private Integer maxLabels;
    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 55 percent.
     * </p>
     */
    private Float minConfidence;
    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature, while
     * specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is specified
     * GENERAL_LABELS is used by default.
     * </p>
     */
    private java.util.List<String> features;
    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image properties. Specified filters can be
     * inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label categories.
     * The exact label names or label categories must be supplied. For a full list of labels and label categories, see
     * LINK HERE.
     * </p>
     */
    private DetectLabelsSettings settings;

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be
     *        base64-encoded.</p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @return The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need
     *         to be base64-encoded.</p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *         developer guide.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be
     *        base64-encoded.</p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     * 
     * @param maxLabels
     *        Maximum number of labels you want the service to return in the response. The service returns the specified
     *        number of highest confidence labels.
     */

    public void setMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     * 
     * @return Maximum number of labels you want the service to return in the response. The service returns the
     *         specified number of highest confidence labels.
     */

    public Integer getMaxLabels() {
        return this.maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     * 
     * @param maxLabels
     *        Maximum number of labels you want the service to return in the response. The service returns the specified
     *        number of highest confidence labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withMaxLabels(Integer maxLabels) {
        setMaxLabels(maxLabels);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 55 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with confidence lower than this specified value.</p>
     *        <p>
     *        If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values
     *        greater than or equal to 55 percent.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 55 percent.
     * </p>
     * 
     * @return Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *         labels with confidence lower than this specified value.</p>
     *         <p>
     *         If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values
     *         greater than or equal to 55 percent.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 55 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with confidence lower than this specified value.</p>
     *        <p>
     *        If <code>MinConfidence</code> is not specified, the operation returns labels with a confidence values
     *        greater than or equal to 55 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature, while
     * specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is specified
     * GENERAL_LABELS is used by default.
     * </p>
     * 
     * @return A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature,
     *         while specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is
     *         specified GENERAL_LABELS is used by default.
     * @see DetectLabelsFeatureName
     */

    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature, while
     * specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is specified
     * GENERAL_LABELS is used by default.
     * </p>
     * 
     * @param features
     *        A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature,
     *        while specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is
     *        specified GENERAL_LABELS is used by default.
     * @see DetectLabelsFeatureName
     */

    public void setFeatures(java.util.Collection<String> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<String>(features);
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature, while
     * specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is specified
     * GENERAL_LABELS is used by default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature,
     *        while specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is
     *        specified GENERAL_LABELS is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectLabelsFeatureName
     */

    public DetectLabelsRequest withFeatures(String... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<String>(features.length));
        }
        for (String ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature, while
     * specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is specified
     * GENERAL_LABELS is used by default.
     * </p>
     * 
     * @param features
     *        A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature,
     *        while specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is
     *        specified GENERAL_LABELS is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectLabelsFeatureName
     */

    public DetectLabelsRequest withFeatures(java.util.Collection<String> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature, while
     * specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is specified
     * GENERAL_LABELS is used by default.
     * </p>
     * 
     * @param features
     *        A list of the types of analysis to perform. Specifying GENERAL_LABELS uses the label detection feature,
     *        while specifying IMAGE_PROPERTIES returns information regarding image color and quality. If no option is
     *        specified GENERAL_LABELS is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectLabelsFeatureName
     */

    public DetectLabelsRequest withFeatures(DetectLabelsFeatureName... features) {
        java.util.ArrayList<String> featuresCopy = new java.util.ArrayList<String>(features.length);
        for (DetectLabelsFeatureName value : features) {
            featuresCopy.add(value.toString());
        }
        if (getFeatures() == null) {
            setFeatures(featuresCopy);
        } else {
            getFeatures().addAll(featuresCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image properties. Specified filters can be
     * inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label categories.
     * The exact label names or label categories must be supplied. For a full list of labels and label categories, see
     * LINK HERE.
     * </p>
     * 
     * @param settings
     *        A list of the filters to be applied to returned detected labels and image properties. Specified filters
     *        can be inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label
     *        categories. The exact label names or label categories must be supplied. For a full list of labels and
     *        label categories, see LINK HERE.
     */

    public void setSettings(DetectLabelsSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image properties. Specified filters can be
     * inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label categories.
     * The exact label names or label categories must be supplied. For a full list of labels and label categories, see
     * LINK HERE.
     * </p>
     * 
     * @return A list of the filters to be applied to returned detected labels and image properties. Specified filters
     *         can be inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label
     *         categories. The exact label names or label categories must be supplied. For a full list of labels and
     *         label categories, see LINK HERE.
     */

    public DetectLabelsSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image properties. Specified filters can be
     * inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label categories.
     * The exact label names or label categories must be supplied. For a full list of labels and label categories, see
     * LINK HERE.
     * </p>
     * 
     * @param settings
     *        A list of the filters to be applied to returned detected labels and image properties. Specified filters
     *        can be inclusive, exclusive, or a combination of both. Filters can be used for individual labels or label
     *        categories. The exact label names or label categories must be supplied. For a full list of labels and
     *        label categories, see LINK HERE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withSettings(DetectLabelsSettings settings) {
        setSettings(settings);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getMaxLabels() != null)
            sb.append("MaxLabels: ").append(getMaxLabels()).append(",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsRequest == false)
            return false;
        DetectLabelsRequest other = (DetectLabelsRequest) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxLabels() == null ^ this.getMaxLabels() == null)
            return false;
        if (other.getMaxLabels() != null && other.getMaxLabels().equals(this.getMaxLabels()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMaxLabels() == null) ? 0 : getMaxLabels().hashCode());
        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsRequest clone() {
        return (DetectLabelsRequest) super.clone();
    }

}
