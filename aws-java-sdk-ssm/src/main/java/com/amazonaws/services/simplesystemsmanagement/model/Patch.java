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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents metadata about a patch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Patch" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Patch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date the patch was released.
     * </p>
     */
    private java.util.Date releaseDate;
    /**
     * <p>
     * The title of the patch.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the patch.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     */
    private String contentUrl;
    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     */
    private String vendor;
    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     */
    private String productFamily;
    /**
     * <p>
     * The specific product the patch is applicable for (for example, WindowsServer2016).
     * </p>
     */
    private String product;
    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     * </p>
     */
    private String classification;
    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     */
    private String msrcSeverity;
    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     */
    private String kbNumber;
    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     */
    private String msrcNumber;
    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     * </p>
     * 
     * @param id
     *        The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     * </p>
     * 
     * @return The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     * </p>
     * 
     * @param id
     *        The ID of the patch (this is different than the Microsoft Knowledge Base ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date the patch was released.
     * </p>
     * 
     * @param releaseDate
     *        The date the patch was released.
     */

    public void setReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date the patch was released.
     * </p>
     * 
     * @return The date the patch was released.
     */

    public java.util.Date getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * <p>
     * The date the patch was released.
     * </p>
     * 
     * @param releaseDate
     *        The date the patch was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withReleaseDate(java.util.Date releaseDate) {
        setReleaseDate(releaseDate);
        return this;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * 
     * @param title
     *        The title of the patch.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * 
     * @return The title of the patch.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * 
     * @param title
     *        The title of the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the patch.
     * </p>
     * 
     * @param description
     *        The description of the patch.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the patch.
     * </p>
     * 
     * @return The description of the patch.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the patch.
     * </p>
     * 
     * @param description
     *        The description of the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     * 
     * @param contentUrl
     *        The URL where more information can be obtained about the patch.
     */

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     * 
     * @return The URL where more information can be obtained about the patch.
     */

    public String getContentUrl() {
        return this.contentUrl;
    }

    /**
     * <p>
     * The URL where more information can be obtained about the patch.
     * </p>
     * 
     * @param contentUrl
     *        The URL where more information can be obtained about the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withContentUrl(String contentUrl) {
        setContentUrl(contentUrl);
        return this;
    }

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     * 
     * @param vendor
     *        The name of the vendor providing the patch.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     * 
     * @return The name of the vendor providing the patch.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The name of the vendor providing the patch.
     * </p>
     * 
     * @param vendor
     *        The name of the vendor providing the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     * 
     * @param productFamily
     *        The product family the patch is applicable for (for example, Windows).
     */

    public void setProductFamily(String productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     * 
     * @return The product family the patch is applicable for (for example, Windows).
     */

    public String getProductFamily() {
        return this.productFamily;
    }

    /**
     * <p>
     * The product family the patch is applicable for (for example, Windows).
     * </p>
     * 
     * @param productFamily
     *        The product family the patch is applicable for (for example, Windows).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withProductFamily(String productFamily) {
        setProductFamily(productFamily);
        return this;
    }

    /**
     * <p>
     * The specific product the patch is applicable for (for example, WindowsServer2016).
     * </p>
     * 
     * @param product
     *        The specific product the patch is applicable for (for example, WindowsServer2016).
     */

    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * The specific product the patch is applicable for (for example, WindowsServer2016).
     * </p>
     * 
     * @return The specific product the patch is applicable for (for example, WindowsServer2016).
     */

    public String getProduct() {
        return this.product;
    }

    /**
     * <p>
     * The specific product the patch is applicable for (for example, WindowsServer2016).
     * </p>
     * 
     * @param product
     *        The specific product the patch is applicable for (for example, WindowsServer2016).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withProduct(String product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     * </p>
     * 
     * @param classification
     *        The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     * </p>
     * 
     * @return The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     * </p>
     * 
     * @param classification
     *        The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     * 
     * @param msrcSeverity
     *        The severity of the patch (for example Critical, Important, Moderate).
     */

    public void setMsrcSeverity(String msrcSeverity) {
        this.msrcSeverity = msrcSeverity;
    }

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     * 
     * @return The severity of the patch (for example Critical, Important, Moderate).
     */

    public String getMsrcSeverity() {
        return this.msrcSeverity;
    }

    /**
     * <p>
     * The severity of the patch (for example Critical, Important, Moderate).
     * </p>
     * 
     * @param msrcSeverity
     *        The severity of the patch (for example Critical, Important, Moderate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withMsrcSeverity(String msrcSeverity) {
        setMsrcSeverity(msrcSeverity);
        return this;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     * 
     * @param kbNumber
     *        The Microsoft Knowledge Base ID of the patch.
     */

    public void setKbNumber(String kbNumber) {
        this.kbNumber = kbNumber;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     * 
     * @return The Microsoft Knowledge Base ID of the patch.
     */

    public String getKbNumber() {
        return this.kbNumber;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch.
     * </p>
     * 
     * @param kbNumber
     *        The Microsoft Knowledge Base ID of the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withKbNumber(String kbNumber) {
        setKbNumber(kbNumber);
        return this;
    }

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     * 
     * @param msrcNumber
     *        The ID of the MSRC bulletin the patch is related to.
     */

    public void setMsrcNumber(String msrcNumber) {
        this.msrcNumber = msrcNumber;
    }

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     * 
     * @return The ID of the MSRC bulletin the patch is related to.
     */

    public String getMsrcNumber() {
        return this.msrcNumber;
    }

    /**
     * <p>
     * The ID of the MSRC bulletin the patch is related to.
     * </p>
     * 
     * @param msrcNumber
     *        The ID of the MSRC bulletin the patch is related to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withMsrcNumber(String msrcNumber) {
        setMsrcNumber(msrcNumber);
        return this;
    }

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     * 
     * @param language
     *        The language of the patch if it's language-specific.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     * 
     * @return The language of the patch if it's language-specific.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language of the patch if it's language-specific.
     * </p>
     * 
     * @param language
     *        The language of the patch if it's language-specific.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withLanguage(String language) {
        setLanguage(language);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: ").append(getReleaseDate()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContentUrl() != null)
            sb.append("ContentUrl: ").append(getContentUrl()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor()).append(",");
        if (getProductFamily() != null)
            sb.append("ProductFamily: ").append(getProductFamily()).append(",");
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct()).append(",");
        if (getClassification() != null)
            sb.append("Classification: ").append(getClassification()).append(",");
        if (getMsrcSeverity() != null)
            sb.append("MsrcSeverity: ").append(getMsrcSeverity()).append(",");
        if (getKbNumber() != null)
            sb.append("KbNumber: ").append(getKbNumber()).append(",");
        if (getMsrcNumber() != null)
            sb.append("MsrcNumber: ").append(getMsrcNumber()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Patch == false)
            return false;
        Patch other = (Patch) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContentUrl() == null ^ this.getContentUrl() == null)
            return false;
        if (other.getContentUrl() != null && other.getContentUrl().equals(this.getContentUrl()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getProductFamily() == null ^ this.getProductFamily() == null)
            return false;
        if (other.getProductFamily() != null && other.getProductFamily().equals(this.getProductFamily()) == false)
            return false;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getMsrcSeverity() == null ^ this.getMsrcSeverity() == null)
            return false;
        if (other.getMsrcSeverity() != null && other.getMsrcSeverity().equals(this.getMsrcSeverity()) == false)
            return false;
        if (other.getKbNumber() == null ^ this.getKbNumber() == null)
            return false;
        if (other.getKbNumber() != null && other.getKbNumber().equals(this.getKbNumber()) == false)
            return false;
        if (other.getMsrcNumber() == null ^ this.getMsrcNumber() == null)
            return false;
        if (other.getMsrcNumber() != null && other.getMsrcNumber().equals(this.getMsrcNumber()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContentUrl() == null) ? 0 : getContentUrl().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode + ((getProductFamily() == null) ? 0 : getProductFamily().hashCode());
        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getMsrcSeverity() == null) ? 0 : getMsrcSeverity().hashCode());
        hashCode = prime * hashCode + ((getKbNumber() == null) ? 0 : getKbNumber().hashCode());
        hashCode = prime * hashCode + ((getMsrcNumber() == null) ? 0 : getMsrcNumber().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public Patch clone() {
        try {
            return (Patch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
