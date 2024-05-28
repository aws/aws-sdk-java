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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFaceLivenessSessionResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible statuses are: CREATED, IN_PROGRESS,
     * SUCCEEDED, FAILED, EXPIRED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was live, represented as a float value
     * between 0 to 100.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for face comparison or search. It includes a
     * bounding box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     * request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's recommended to retry the Liveness check.
     * </p>
     */
    private AuditImage referenceImage;
    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding box of
     * the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an
     * OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration. If no
     * Amazon S3 bucket is defined, raw bytes are sent instead.
     * </p>
     */
    private java.util.List<AuditImage> auditImages;

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * 
     * @param sessionId
     *        The sessionId for which this request was called.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * 
     * @return The sessionId for which this request was called.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * 
     * @param sessionId
     *        The sessionId for which this request was called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceLivenessSessionResultsResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible statuses are: CREATED, IN_PROGRESS,
     * SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * 
     * @param status
     *        Represents a status corresponding to the state of the session. Possible statuses are: CREATED,
     *        IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * @see LivenessSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible statuses are: CREATED, IN_PROGRESS,
     * SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * 
     * @return Represents a status corresponding to the state of the session. Possible statuses are: CREATED,
     *         IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * @see LivenessSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible statuses are: CREATED, IN_PROGRESS,
     * SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * 
     * @param status
     *        Represents a status corresponding to the state of the session. Possible statuses are: CREATED,
     *        IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LivenessSessionStatus
     */

    public GetFaceLivenessSessionResultsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible statuses are: CREATED, IN_PROGRESS,
     * SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * 
     * @param status
     *        Represents a status corresponding to the state of the session. Possible statuses are: CREATED,
     *        IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LivenessSessionStatus
     */

    public GetFaceLivenessSessionResultsResult withStatus(LivenessSessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was live, represented as a float value
     * between 0 to 100.
     * </p>
     * 
     * @param confidence
     *        Probabalistic confidence score for if the person in the given video was live, represented as a float value
     *        between 0 to 100.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was live, represented as a float value
     * between 0 to 100.
     * </p>
     * 
     * @return Probabalistic confidence score for if the person in the given video was live, represented as a float
     *         value between 0 to 100.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was live, represented as a float value
     * between 0 to 100.
     * </p>
     * 
     * @param confidence
     *        Probabalistic confidence score for if the person in the given video was live, represented as a float value
     *        between 0 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceLivenessSessionResultsResult withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for face comparison or search. It includes a
     * bounding box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     * request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's recommended to retry the Liveness check.
     * </p>
     * 
     * @param referenceImage
     *        A high-quality image from the Face Liveness video that can be used for face comparison or search. It
     *        includes a bounding box of the face and the Base64-encoded bytes that return an image. If the
     *        CreateFaceLivenessSession request included an OutputConfig argument, the image will be uploaded to an
     *        S3Object specified in the output configuration. In case the reference image is not returned, it's
     *        recommended to retry the Liveness check.
     */

    public void setReferenceImage(AuditImage referenceImage) {
        this.referenceImage = referenceImage;
    }

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for face comparison or search. It includes a
     * bounding box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     * request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's recommended to retry the Liveness check.
     * </p>
     * 
     * @return A high-quality image from the Face Liveness video that can be used for face comparison or search. It
     *         includes a bounding box of the face and the Base64-encoded bytes that return an image. If the
     *         CreateFaceLivenessSession request included an OutputConfig argument, the image will be uploaded to an
     *         S3Object specified in the output configuration. In case the reference image is not returned, it's
     *         recommended to retry the Liveness check.
     */

    public AuditImage getReferenceImage() {
        return this.referenceImage;
    }

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for face comparison or search. It includes a
     * bounding box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     * request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's recommended to retry the Liveness check.
     * </p>
     * 
     * @param referenceImage
     *        A high-quality image from the Face Liveness video that can be used for face comparison or search. It
     *        includes a bounding box of the face and the Base64-encoded bytes that return an image. If the
     *        CreateFaceLivenessSession request included an OutputConfig argument, the image will be uploaded to an
     *        S3Object specified in the output configuration. In case the reference image is not returned, it's
     *        recommended to retry the Liveness check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceLivenessSessionResultsResult withReferenceImage(AuditImage referenceImage) {
        setReferenceImage(referenceImage);
        return this;
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding box of
     * the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an
     * OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration. If no
     * Amazon S3 bucket is defined, raw bytes are sent instead.
     * </p>
     * 
     * @return A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding
     *         box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     *         request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the
     *         output configuration. If no Amazon S3 bucket is defined, raw bytes are sent instead.
     */

    public java.util.List<AuditImage> getAuditImages() {
        return auditImages;
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding box of
     * the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an
     * OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration. If no
     * Amazon S3 bucket is defined, raw bytes are sent instead.
     * </p>
     * 
     * @param auditImages
     *        A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding
     *        box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     *        request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the
     *        output configuration. If no Amazon S3 bucket is defined, raw bytes are sent instead.
     */

    public void setAuditImages(java.util.Collection<AuditImage> auditImages) {
        if (auditImages == null) {
            this.auditImages = null;
            return;
        }

        this.auditImages = new java.util.ArrayList<AuditImage>(auditImages);
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding box of
     * the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an
     * OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration. If no
     * Amazon S3 bucket is defined, raw bytes are sent instead.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuditImages(java.util.Collection)} or {@link #withAuditImages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param auditImages
     *        A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding
     *        box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     *        request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the
     *        output configuration. If no Amazon S3 bucket is defined, raw bytes are sent instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceLivenessSessionResultsResult withAuditImages(AuditImage... auditImages) {
        if (this.auditImages == null) {
            setAuditImages(new java.util.ArrayList<AuditImage>(auditImages.length));
        }
        for (AuditImage ele : auditImages) {
            this.auditImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding box of
     * the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an
     * OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration. If no
     * Amazon S3 bucket is defined, raw bytes are sent instead.
     * </p>
     * 
     * @param auditImages
     *        A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding
     *        box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession
     *        request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the
     *        output configuration. If no Amazon S3 bucket is defined, raw bytes are sent instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceLivenessSessionResultsResult withAuditImages(java.util.Collection<AuditImage> auditImages) {
        setAuditImages(auditImages);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getReferenceImage() != null)
            sb.append("ReferenceImage: ").append(getReferenceImage()).append(",");
        if (getAuditImages() != null)
            sb.append("AuditImages: ").append(getAuditImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFaceLivenessSessionResultsResult == false)
            return false;
        GetFaceLivenessSessionResultsResult other = (GetFaceLivenessSessionResultsResult) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getReferenceImage() == null ^ this.getReferenceImage() == null)
            return false;
        if (other.getReferenceImage() != null && other.getReferenceImage().equals(this.getReferenceImage()) == false)
            return false;
        if (other.getAuditImages() == null ^ this.getAuditImages() == null)
            return false;
        if (other.getAuditImages() != null && other.getAuditImages().equals(this.getAuditImages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getReferenceImage() == null) ? 0 : getReferenceImage().hashCode());
        hashCode = prime * hashCode + ((getAuditImages() == null) ? 0 : getAuditImages().hashCode());
        return hashCode;
    }

    @Override
    public GetFaceLivenessSessionResultsResult clone() {
        try {
            return (GetFaceLivenessSessionResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
