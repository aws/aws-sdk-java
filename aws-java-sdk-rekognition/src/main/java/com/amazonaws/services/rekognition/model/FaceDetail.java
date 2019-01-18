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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure containing attributes of the face that the algorithm detected.
 * </p>
 * <p>
 * A <code>FaceDetail</code> object contains either the default facial attributes or all facial attributes. The default
 * attributes are <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and
 * <code>Quality</code>.
 * </p>
 * <p>
 * <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video operation that can return a
 * <code>FaceDetail</code> object with all attributes. To specify which attributes to return, use the
 * <code>FaceAttributes</code> input parameter for <a>StartFaceDetection</a>. The following Amazon Rekognition Video
 * operations return only the default attributes. The corresponding Start operations don't have a
 * <code>FaceAttributes</code> input parameter.
 * </p>
 * <ul>
 * <li>
 * <p>
 * GetCelebrityRecognition
 * </p>
 * </li>
 * <li>
 * <p>
 * GetPersonTracking
 * </p>
 * </li>
 * <li>
 * <p>
 * GetFaceSearch
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a> operations can return all facial attributes. To
 * specify which attributes to return, use the <code>Attributes</code> input parameter for <code>DetectFaces</code>. For
 * <code>IndexFaces</code>, use the <code>DetectAttributes</code> input parameter.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the
     * highest estimated age.
     * </p>
     */
    private AgeRange ageRange;
    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in the determination.
     * </p>
     */
    private Smile smile;
    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     * </p>
     */
    private Eyeglasses eyeglasses;
    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     * </p>
     */
    private Sunglasses sunglasses;
    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     */
    private Gender gender;
    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level in the determination.
     * </p>
     */
    private Beard beard;
    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence level in the determination.
     * </p>
     */
    private Mustache mustache;
    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     * </p>
     */
    private EyeOpen eyesOpen;
    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     * </p>
     */
    private MouthOpen mouthOpen;
    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and
     * ANGRY.
     * </p>
     */
    private java.util.List<Emotion> emotions;
    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     */
    private java.util.List<Landmark> landmarks;
    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     * </p>
     */
    private Pose pose;
    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     */
    private ImageQuality quality;
    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default
     * attribute.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     * 
     * @param boundingBox
     *        Bounding box of the face. Default attribute.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     * 
     * @return Bounding box of the face. Default attribute.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face. Default attribute.
     * </p>
     * 
     * @param boundingBox
     *        Bounding box of the face. Default attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the
     * highest estimated age.
     * </p>
     * 
     * @param ageRange
     *        The estimated age range, in years, for the face. Low represents the lowest estimated age and High
     *        represents the highest estimated age.
     */

    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
    }

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the
     * highest estimated age.
     * </p>
     * 
     * @return The estimated age range, in years, for the face. Low represents the lowest estimated age and High
     *         represents the highest estimated age.
     */

    public AgeRange getAgeRange() {
        return this.ageRange;
    }

    /**
     * <p>
     * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the
     * highest estimated age.
     * </p>
     * 
     * @param ageRange
     *        The estimated age range, in years, for the face. Low represents the lowest estimated age and High
     *        represents the highest estimated age.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withAgeRange(AgeRange ageRange) {
        setAgeRange(ageRange);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in the determination.
     * </p>
     * 
     * @param smile
     *        Indicates whether or not the face is smiling, and the confidence level in the determination.
     */

    public void setSmile(Smile smile) {
        this.smile = smile;
    }

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the face is smiling, and the confidence level in the determination.
     */

    public Smile getSmile() {
        return this.smile;
    }

    /**
     * <p>
     * Indicates whether or not the face is smiling, and the confidence level in the determination.
     * </p>
     * 
     * @param smile
     *        Indicates whether or not the face is smiling, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withSmile(Smile smile) {
        setSmile(smile);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     * </p>
     * 
     * @param eyeglasses
     *        Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     */

    public void setEyeglasses(Eyeglasses eyeglasses) {
        this.eyeglasses = eyeglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     */

    public Eyeglasses getEyeglasses() {
        return this.eyeglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     * </p>
     * 
     * @param eyeglasses
     *        Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withEyeglasses(Eyeglasses eyeglasses) {
        setEyeglasses(eyeglasses);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     * </p>
     * 
     * @param sunglasses
     *        Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     */

    public void setSunglasses(Sunglasses sunglasses) {
        this.sunglasses = sunglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     */

    public Sunglasses getSunglasses() {
        return this.sunglasses;
    }

    /**
     * <p>
     * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     * </p>
     * 
     * @param sunglasses
     *        Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withSunglasses(Sunglasses sunglasses) {
        setSunglasses(sunglasses);
        return this;
    }

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     * 
     * @param gender
     *        Gender of the face and the confidence level in the determination.
     */

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     * 
     * @return Gender of the face and the confidence level in the determination.
     */

    public Gender getGender() {
        return this.gender;
    }

    /**
     * <p>
     * Gender of the face and the confidence level in the determination.
     * </p>
     * 
     * @param gender
     *        Gender of the face and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withGender(Gender gender) {
        setGender(gender);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level in the determination.
     * </p>
     * 
     * @param beard
     *        Indicates whether or not the face has a beard, and the confidence level in the determination.
     */

    public void setBeard(Beard beard) {
        this.beard = beard;
    }

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the face has a beard, and the confidence level in the determination.
     */

    public Beard getBeard() {
        return this.beard;
    }

    /**
     * <p>
     * Indicates whether or not the face has a beard, and the confidence level in the determination.
     * </p>
     * 
     * @param beard
     *        Indicates whether or not the face has a beard, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withBeard(Beard beard) {
        setBeard(beard);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence level in the determination.
     * </p>
     * 
     * @param mustache
     *        Indicates whether or not the face has a mustache, and the confidence level in the determination.
     */

    public void setMustache(Mustache mustache) {
        this.mustache = mustache;
    }

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the face has a mustache, and the confidence level in the determination.
     */

    public Mustache getMustache() {
        return this.mustache;
    }

    /**
     * <p>
     * Indicates whether or not the face has a mustache, and the confidence level in the determination.
     * </p>
     * 
     * @param mustache
     *        Indicates whether or not the face has a mustache, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withMustache(Mustache mustache) {
        setMustache(mustache);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     * </p>
     * 
     * @param eyesOpen
     *        Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     */

    public void setEyesOpen(EyeOpen eyesOpen) {
        this.eyesOpen = eyesOpen;
    }

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     */

    public EyeOpen getEyesOpen() {
        return this.eyesOpen;
    }

    /**
     * <p>
     * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     * </p>
     * 
     * @param eyesOpen
     *        Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withEyesOpen(EyeOpen eyesOpen) {
        setEyesOpen(eyesOpen);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     * </p>
     * 
     * @param mouthOpen
     *        Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     */

    public void setMouthOpen(MouthOpen mouthOpen) {
        this.mouthOpen = mouthOpen;
    }

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     * </p>
     * 
     * @return Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     */

    public MouthOpen getMouthOpen() {
        return this.mouthOpen;
    }

    /**
     * <p>
     * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     * </p>
     * 
     * @param mouthOpen
     *        Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withMouthOpen(MouthOpen mouthOpen) {
        setMouthOpen(mouthOpen);
        return this;
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and
     * ANGRY.
     * </p>
     * 
     * @return The emotions detected on the face, and the confidence level in the determination. For example, HAPPY,
     *         SAD, and ANGRY.
     */

    public java.util.List<Emotion> getEmotions() {
        return emotions;
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and
     * ANGRY.
     * </p>
     * 
     * @param emotions
     *        The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD,
     *        and ANGRY.
     */

    public void setEmotions(java.util.Collection<Emotion> emotions) {
        if (emotions == null) {
            this.emotions = null;
            return;
        }

        this.emotions = new java.util.ArrayList<Emotion>(emotions);
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and
     * ANGRY.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmotions(java.util.Collection)} or {@link #withEmotions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param emotions
     *        The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD,
     *        and ANGRY.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withEmotions(Emotion... emotions) {
        if (this.emotions == null) {
            setEmotions(new java.util.ArrayList<Emotion>(emotions.length));
        }
        for (Emotion ele : emotions) {
            this.emotions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and
     * ANGRY.
     * </p>
     * 
     * @param emotions
     *        The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD,
     *        and ANGRY.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withEmotions(java.util.Collection<Emotion> emotions) {
        setEmotions(emotions);
        return this;
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     * 
     * @return Indicates the location of landmarks on the face. Default attribute.
     */

    public java.util.List<Landmark> getLandmarks() {
        return landmarks;
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     * 
     * @param landmarks
     *        Indicates the location of landmarks on the face. Default attribute.
     */

    public void setLandmarks(java.util.Collection<Landmark> landmarks) {
        if (landmarks == null) {
            this.landmarks = null;
            return;
        }

        this.landmarks = new java.util.ArrayList<Landmark>(landmarks);
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLandmarks(java.util.Collection)} or {@link #withLandmarks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param landmarks
     *        Indicates the location of landmarks on the face. Default attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withLandmarks(Landmark... landmarks) {
        if (this.landmarks == null) {
            setLandmarks(new java.util.ArrayList<Landmark>(landmarks.length));
        }
        for (Landmark ele : landmarks) {
            this.landmarks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the location of landmarks on the face. Default attribute.
     * </p>
     * 
     * @param landmarks
     *        Indicates the location of landmarks on the face. Default attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withLandmarks(java.util.Collection<Landmark> landmarks) {
        setLandmarks(landmarks);
        return this;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     * </p>
     * 
     * @param pose
     *        Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     */

    public void setPose(Pose pose) {
        this.pose = pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     * </p>
     * 
     * @return Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     */

    public Pose getPose() {
        return this.pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     * </p>
     * 
     * @param pose
     *        Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withPose(Pose pose) {
        setPose(pose);
        return this;
    }

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     * 
     * @param quality
     *        Identifies image brightness and sharpness. Default attribute.
     */

    public void setQuality(ImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     * 
     * @return Identifies image brightness and sharpness. Default attribute.
     */

    public ImageQuality getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * Identifies image brightness and sharpness. Default attribute.
     * </p>
     * 
     * @param quality
     *        Identifies image brightness and sharpness. Default attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withQuality(ImageQuality quality) {
        setQuality(quality);
        return this;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default
     * attribute.
     * </p>
     * 
     * @param confidence
     *        Confidence level that the bounding box contains a face (and not a different object such as a tree).
     *        Default attribute.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default
     * attribute.
     * </p>
     * 
     * @return Confidence level that the bounding box contains a face (and not a different object such as a tree).
     *         Default attribute.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default
     * attribute.
     * </p>
     * 
     * @param confidence
     *        Confidence level that the bounding box contains a face (and not a different object such as a tree).
     *        Default attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetail withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox()).append(",");
        if (getAgeRange() != null)
            sb.append("AgeRange: ").append(getAgeRange()).append(",");
        if (getSmile() != null)
            sb.append("Smile: ").append(getSmile()).append(",");
        if (getEyeglasses() != null)
            sb.append("Eyeglasses: ").append(getEyeglasses()).append(",");
        if (getSunglasses() != null)
            sb.append("Sunglasses: ").append(getSunglasses()).append(",");
        if (getGender() != null)
            sb.append("Gender: ").append(getGender()).append(",");
        if (getBeard() != null)
            sb.append("Beard: ").append(getBeard()).append(",");
        if (getMustache() != null)
            sb.append("Mustache: ").append(getMustache()).append(",");
        if (getEyesOpen() != null)
            sb.append("EyesOpen: ").append(getEyesOpen()).append(",");
        if (getMouthOpen() != null)
            sb.append("MouthOpen: ").append(getMouthOpen()).append(",");
        if (getEmotions() != null)
            sb.append("Emotions: ").append(getEmotions()).append(",");
        if (getLandmarks() != null)
            sb.append("Landmarks: ").append(getLandmarks()).append(",");
        if (getPose() != null)
            sb.append("Pose: ").append(getPose()).append(",");
        if (getQuality() != null)
            sb.append("Quality: ").append(getQuality()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceDetail == false)
            return false;
        FaceDetail other = (FaceDetail) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getAgeRange() == null ^ this.getAgeRange() == null)
            return false;
        if (other.getAgeRange() != null && other.getAgeRange().equals(this.getAgeRange()) == false)
            return false;
        if (other.getSmile() == null ^ this.getSmile() == null)
            return false;
        if (other.getSmile() != null && other.getSmile().equals(this.getSmile()) == false)
            return false;
        if (other.getEyeglasses() == null ^ this.getEyeglasses() == null)
            return false;
        if (other.getEyeglasses() != null && other.getEyeglasses().equals(this.getEyeglasses()) == false)
            return false;
        if (other.getSunglasses() == null ^ this.getSunglasses() == null)
            return false;
        if (other.getSunglasses() != null && other.getSunglasses().equals(this.getSunglasses()) == false)
            return false;
        if (other.getGender() == null ^ this.getGender() == null)
            return false;
        if (other.getGender() != null && other.getGender().equals(this.getGender()) == false)
            return false;
        if (other.getBeard() == null ^ this.getBeard() == null)
            return false;
        if (other.getBeard() != null && other.getBeard().equals(this.getBeard()) == false)
            return false;
        if (other.getMustache() == null ^ this.getMustache() == null)
            return false;
        if (other.getMustache() != null && other.getMustache().equals(this.getMustache()) == false)
            return false;
        if (other.getEyesOpen() == null ^ this.getEyesOpen() == null)
            return false;
        if (other.getEyesOpen() != null && other.getEyesOpen().equals(this.getEyesOpen()) == false)
            return false;
        if (other.getMouthOpen() == null ^ this.getMouthOpen() == null)
            return false;
        if (other.getMouthOpen() != null && other.getMouthOpen().equals(this.getMouthOpen()) == false)
            return false;
        if (other.getEmotions() == null ^ this.getEmotions() == null)
            return false;
        if (other.getEmotions() != null && other.getEmotions().equals(this.getEmotions()) == false)
            return false;
        if (other.getLandmarks() == null ^ this.getLandmarks() == null)
            return false;
        if (other.getLandmarks() != null && other.getLandmarks().equals(this.getLandmarks()) == false)
            return false;
        if (other.getPose() == null ^ this.getPose() == null)
            return false;
        if (other.getPose() != null && other.getPose().equals(this.getPose()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getAgeRange() == null) ? 0 : getAgeRange().hashCode());
        hashCode = prime * hashCode + ((getSmile() == null) ? 0 : getSmile().hashCode());
        hashCode = prime * hashCode + ((getEyeglasses() == null) ? 0 : getEyeglasses().hashCode());
        hashCode = prime * hashCode + ((getSunglasses() == null) ? 0 : getSunglasses().hashCode());
        hashCode = prime * hashCode + ((getGender() == null) ? 0 : getGender().hashCode());
        hashCode = prime * hashCode + ((getBeard() == null) ? 0 : getBeard().hashCode());
        hashCode = prime * hashCode + ((getMustache() == null) ? 0 : getMustache().hashCode());
        hashCode = prime * hashCode + ((getEyesOpen() == null) ? 0 : getEyesOpen().hashCode());
        hashCode = prime * hashCode + ((getMouthOpen() == null) ? 0 : getMouthOpen().hashCode());
        hashCode = prime * hashCode + ((getEmotions() == null) ? 0 : getEmotions().hashCode());
        hashCode = prime * hashCode + ((getLandmarks() == null) ? 0 : getLandmarks().hashCode());
        hashCode = prime * hashCode + ((getPose() == null) ? 0 : getPose().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public FaceDetail clone() {
        try {
            return (FaceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.FaceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
