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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Granular information about the skill.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SkillDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SkillDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the product.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     */
    private String invocationPhrase;
    /**
     * <p>
     * The date when the skill was released.
     * </p>
     */
    private String releaseDate;
    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     */
    private String endUserLicenseAgreement;
    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a skill.
     * </p>
     */
    private java.util.List<String> genericKeywords;
    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     */
    private java.util.List<String> bulletPoints;
    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     */
    private java.util.List<String> newInThisVersionBulletPoints;
    /**
     * <p>
     * The types of skills.
     * </p>
     */
    private java.util.List<String> skillTypes;
    /**
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     */
    private java.util.Map<String, String> reviews;
    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     */
    private DeveloperInfo developerInfo;

    /**
     * <p>
     * The description of the product.
     * </p>
     * 
     * @param productDescription
     *        The description of the product.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * 
     * @return The description of the product.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * 
     * @param productDescription
     *        The description of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     * 
     * @param invocationPhrase
     *        The phrase used to trigger the skill.
     */

    public void setInvocationPhrase(String invocationPhrase) {
        this.invocationPhrase = invocationPhrase;
    }

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     * 
     * @return The phrase used to trigger the skill.
     */

    public String getInvocationPhrase() {
        return this.invocationPhrase;
    }

    /**
     * <p>
     * The phrase used to trigger the skill.
     * </p>
     * 
     * @param invocationPhrase
     *        The phrase used to trigger the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withInvocationPhrase(String invocationPhrase) {
        setInvocationPhrase(invocationPhrase);
        return this;
    }

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     * 
     * @param releaseDate
     *        The date when the skill was released.
     */

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     * 
     * @return The date when the skill was released.
     */

    public String getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * <p>
     * The date when the skill was released.
     * </p>
     * 
     * @param releaseDate
     *        The date when the skill was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withReleaseDate(String releaseDate) {
        setReleaseDate(releaseDate);
        return this;
    }

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     * 
     * @param endUserLicenseAgreement
     *        The URL of the end user license agreement.
     */

    public void setEndUserLicenseAgreement(String endUserLicenseAgreement) {
        this.endUserLicenseAgreement = endUserLicenseAgreement;
    }

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     * 
     * @return The URL of the end user license agreement.
     */

    public String getEndUserLicenseAgreement() {
        return this.endUserLicenseAgreement;
    }

    /**
     * <p>
     * The URL of the end user license agreement.
     * </p>
     * 
     * @param endUserLicenseAgreement
     *        The URL of the end user license agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withEndUserLicenseAgreement(String endUserLicenseAgreement) {
        setEndUserLicenseAgreement(endUserLicenseAgreement);
        return this;
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a skill.
     * </p>
     * 
     * @return The generic keywords associated with the skill that can be used to find a skill.
     */

    public java.util.List<String> getGenericKeywords() {
        return genericKeywords;
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a skill.
     * </p>
     * 
     * @param genericKeywords
     *        The generic keywords associated with the skill that can be used to find a skill.
     */

    public void setGenericKeywords(java.util.Collection<String> genericKeywords) {
        if (genericKeywords == null) {
            this.genericKeywords = null;
            return;
        }

        this.genericKeywords = new java.util.ArrayList<String>(genericKeywords);
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a skill.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGenericKeywords(java.util.Collection)} or {@link #withGenericKeywords(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param genericKeywords
     *        The generic keywords associated with the skill that can be used to find a skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withGenericKeywords(String... genericKeywords) {
        if (this.genericKeywords == null) {
            setGenericKeywords(new java.util.ArrayList<String>(genericKeywords.length));
        }
        for (String ele : genericKeywords) {
            this.genericKeywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The generic keywords associated with the skill that can be used to find a skill.
     * </p>
     * 
     * @param genericKeywords
     *        The generic keywords associated with the skill that can be used to find a skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withGenericKeywords(java.util.Collection<String> genericKeywords) {
        setGenericKeywords(genericKeywords);
        return this;
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     * 
     * @return The details about what the skill supports organized as bullet points.
     */

    public java.util.List<String> getBulletPoints() {
        return bulletPoints;
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     * 
     * @param bulletPoints
     *        The details about what the skill supports organized as bullet points.
     */

    public void setBulletPoints(java.util.Collection<String> bulletPoints) {
        if (bulletPoints == null) {
            this.bulletPoints = null;
            return;
        }

        this.bulletPoints = new java.util.ArrayList<String>(bulletPoints);
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBulletPoints(java.util.Collection)} or {@link #withBulletPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bulletPoints
     *        The details about what the skill supports organized as bullet points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withBulletPoints(String... bulletPoints) {
        if (this.bulletPoints == null) {
            setBulletPoints(new java.util.ArrayList<String>(bulletPoints.length));
        }
        for (String ele : bulletPoints) {
            this.bulletPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about what the skill supports organized as bullet points.
     * </p>
     * 
     * @param bulletPoints
     *        The details about what the skill supports organized as bullet points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withBulletPoints(java.util.Collection<String> bulletPoints) {
        setBulletPoints(bulletPoints);
        return this;
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     * 
     * @return The updates added in bullet points.
     */

    public java.util.List<String> getNewInThisVersionBulletPoints() {
        return newInThisVersionBulletPoints;
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     * 
     * @param newInThisVersionBulletPoints
     *        The updates added in bullet points.
     */

    public void setNewInThisVersionBulletPoints(java.util.Collection<String> newInThisVersionBulletPoints) {
        if (newInThisVersionBulletPoints == null) {
            this.newInThisVersionBulletPoints = null;
            return;
        }

        this.newInThisVersionBulletPoints = new java.util.ArrayList<String>(newInThisVersionBulletPoints);
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewInThisVersionBulletPoints(java.util.Collection)} or
     * {@link #withNewInThisVersionBulletPoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param newInThisVersionBulletPoints
     *        The updates added in bullet points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withNewInThisVersionBulletPoints(String... newInThisVersionBulletPoints) {
        if (this.newInThisVersionBulletPoints == null) {
            setNewInThisVersionBulletPoints(new java.util.ArrayList<String>(newInThisVersionBulletPoints.length));
        }
        for (String ele : newInThisVersionBulletPoints) {
            this.newInThisVersionBulletPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updates added in bullet points.
     * </p>
     * 
     * @param newInThisVersionBulletPoints
     *        The updates added in bullet points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withNewInThisVersionBulletPoints(java.util.Collection<String> newInThisVersionBulletPoints) {
        setNewInThisVersionBulletPoints(newInThisVersionBulletPoints);
        return this;
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     * 
     * @return The types of skills.
     */

    public java.util.List<String> getSkillTypes() {
        return skillTypes;
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     * 
     * @param skillTypes
     *        The types of skills.
     */

    public void setSkillTypes(java.util.Collection<String> skillTypes) {
        if (skillTypes == null) {
            this.skillTypes = null;
            return;
        }

        this.skillTypes = new java.util.ArrayList<String>(skillTypes);
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkillTypes(java.util.Collection)} or {@link #withSkillTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param skillTypes
     *        The types of skills.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withSkillTypes(String... skillTypes) {
        if (this.skillTypes == null) {
            setSkillTypes(new java.util.ArrayList<String>(skillTypes.length));
        }
        for (String ele : skillTypes) {
            this.skillTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of skills.
     * </p>
     * 
     * @param skillTypes
     *        The types of skills.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withSkillTypes(java.util.Collection<String> skillTypes) {
        setSkillTypes(skillTypes);
        return this;
    }

    /**
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     * 
     * @return The list of reviews for the skill, including Key and Value pair.
     */

    public java.util.Map<String, String> getReviews() {
        return reviews;
    }

    /**
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     * 
     * @param reviews
     *        The list of reviews for the skill, including Key and Value pair.
     */

    public void setReviews(java.util.Map<String, String> reviews) {
        this.reviews = reviews;
    }

    /**
     * <p>
     * The list of reviews for the skill, including Key and Value pair.
     * </p>
     * 
     * @param reviews
     *        The list of reviews for the skill, including Key and Value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withReviews(java.util.Map<String, String> reviews) {
        setReviews(reviews);
        return this;
    }

    public SkillDetails addReviewsEntry(String key, String value) {
        if (null == this.reviews) {
            this.reviews = new java.util.HashMap<String, String>();
        }
        if (this.reviews.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.reviews.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Reviews.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails clearReviewsEntries() {
        this.reviews = null;
        return this;
    }

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     * 
     * @param developerInfo
     *        The details about the developer that published the skill.
     */

    public void setDeveloperInfo(DeveloperInfo developerInfo) {
        this.developerInfo = developerInfo;
    }

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     * 
     * @return The details about the developer that published the skill.
     */

    public DeveloperInfo getDeveloperInfo() {
        return this.developerInfo;
    }

    /**
     * <p>
     * The details about the developer that published the skill.
     * </p>
     * 
     * @param developerInfo
     *        The details about the developer that published the skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SkillDetails withDeveloperInfo(DeveloperInfo developerInfo) {
        setDeveloperInfo(developerInfo);
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
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getInvocationPhrase() != null)
            sb.append("InvocationPhrase: ").append(getInvocationPhrase()).append(",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: ").append(getReleaseDate()).append(",");
        if (getEndUserLicenseAgreement() != null)
            sb.append("EndUserLicenseAgreement: ").append(getEndUserLicenseAgreement()).append(",");
        if (getGenericKeywords() != null)
            sb.append("GenericKeywords: ").append(getGenericKeywords()).append(",");
        if (getBulletPoints() != null)
            sb.append("BulletPoints: ").append(getBulletPoints()).append(",");
        if (getNewInThisVersionBulletPoints() != null)
            sb.append("NewInThisVersionBulletPoints: ").append(getNewInThisVersionBulletPoints()).append(",");
        if (getSkillTypes() != null)
            sb.append("SkillTypes: ").append(getSkillTypes()).append(",");
        if (getReviews() != null)
            sb.append("Reviews: ").append(getReviews()).append(",");
        if (getDeveloperInfo() != null)
            sb.append("DeveloperInfo: ").append(getDeveloperInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillDetails == false)
            return false;
        SkillDetails other = (SkillDetails) obj;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getInvocationPhrase() == null ^ this.getInvocationPhrase() == null)
            return false;
        if (other.getInvocationPhrase() != null && other.getInvocationPhrase().equals(this.getInvocationPhrase()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getEndUserLicenseAgreement() == null ^ this.getEndUserLicenseAgreement() == null)
            return false;
        if (other.getEndUserLicenseAgreement() != null && other.getEndUserLicenseAgreement().equals(this.getEndUserLicenseAgreement()) == false)
            return false;
        if (other.getGenericKeywords() == null ^ this.getGenericKeywords() == null)
            return false;
        if (other.getGenericKeywords() != null && other.getGenericKeywords().equals(this.getGenericKeywords()) == false)
            return false;
        if (other.getBulletPoints() == null ^ this.getBulletPoints() == null)
            return false;
        if (other.getBulletPoints() != null && other.getBulletPoints().equals(this.getBulletPoints()) == false)
            return false;
        if (other.getNewInThisVersionBulletPoints() == null ^ this.getNewInThisVersionBulletPoints() == null)
            return false;
        if (other.getNewInThisVersionBulletPoints() != null && other.getNewInThisVersionBulletPoints().equals(this.getNewInThisVersionBulletPoints()) == false)
            return false;
        if (other.getSkillTypes() == null ^ this.getSkillTypes() == null)
            return false;
        if (other.getSkillTypes() != null && other.getSkillTypes().equals(this.getSkillTypes()) == false)
            return false;
        if (other.getReviews() == null ^ this.getReviews() == null)
            return false;
        if (other.getReviews() != null && other.getReviews().equals(this.getReviews()) == false)
            return false;
        if (other.getDeveloperInfo() == null ^ this.getDeveloperInfo() == null)
            return false;
        if (other.getDeveloperInfo() != null && other.getDeveloperInfo().equals(this.getDeveloperInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getInvocationPhrase() == null) ? 0 : getInvocationPhrase().hashCode());
        hashCode = prime * hashCode + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getEndUserLicenseAgreement() == null) ? 0 : getEndUserLicenseAgreement().hashCode());
        hashCode = prime * hashCode + ((getGenericKeywords() == null) ? 0 : getGenericKeywords().hashCode());
        hashCode = prime * hashCode + ((getBulletPoints() == null) ? 0 : getBulletPoints().hashCode());
        hashCode = prime * hashCode + ((getNewInThisVersionBulletPoints() == null) ? 0 : getNewInThisVersionBulletPoints().hashCode());
        hashCode = prime * hashCode + ((getSkillTypes() == null) ? 0 : getSkillTypes().hashCode());
        hashCode = prime * hashCode + ((getReviews() == null) ? 0 : getReviews().hashCode());
        hashCode = prime * hashCode + ((getDeveloperInfo() == null) ? 0 : getDeveloperInfo().hashCode());
        return hashCode;
    }

    @Override
    public SkillDetails clone() {
        try {
            return (SkillDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SkillDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
