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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The catalog data for a repository. This data is publicly visible in the Amazon ECR Public Gallery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/RepositoryCatalogData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryCatalogData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The short description of the repository.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The architecture tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     */
    private java.util.List<String> architectures;
    /**
     * <p>
     * The operating system tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     */
    private java.util.List<String> operatingSystems;
    /**
     * <p>
     * The URL containing the logo associated with the repository.
     * </p>
     */
    private String logoUrl;
    /**
     * <p>
     * The longform description of the contents of the repository. This text appears in the repository details on the
     * Amazon ECR Public Gallery.
     * </p>
     */
    private String aboutText;
    /**
     * <p>
     * The longform usage details of the contents of the repository. The usage text provides context for users of the
     * repository.
     * </p>
     */
    private String usageText;
    /**
     * <p>
     * Whether or not the repository is certified by AWS Marketplace.
     * </p>
     */
    private Boolean marketplaceCertified;

    /**
     * <p>
     * The short description of the repository.
     * </p>
     * 
     * @param description
     *        The short description of the repository.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The short description of the repository.
     * </p>
     * 
     * @return The short description of the repository.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The short description of the repository.
     * </p>
     * 
     * @param description
     *        The short description of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The architecture tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * 
     * @return The architecture tags that are associated with the repository.</p> <note>
     *         <p>
     *         Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *         information, see <a>RepositoryCatalogDataInput</a>.
     *         </p>
     */

    public java.util.List<String> getArchitectures() {
        return architectures;
    }

    /**
     * <p>
     * The architecture tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * 
     * @param architectures
     *        The architecture tags that are associated with the repository.</p> <note>
     *        <p>
     *        Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *        information, see <a>RepositoryCatalogDataInput</a>.
     *        </p>
     */

    public void setArchitectures(java.util.Collection<String> architectures) {
        if (architectures == null) {
            this.architectures = null;
            return;
        }

        this.architectures = new java.util.ArrayList<String>(architectures);
    }

    /**
     * <p>
     * The architecture tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitectures(java.util.Collection)} or {@link #withArchitectures(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param architectures
     *        The architecture tags that are associated with the repository.</p> <note>
     *        <p>
     *        Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *        information, see <a>RepositoryCatalogDataInput</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withArchitectures(String... architectures) {
        if (this.architectures == null) {
            setArchitectures(new java.util.ArrayList<String>(architectures.length));
        }
        for (String ele : architectures) {
            this.architectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The architecture tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * 
     * @param architectures
     *        The architecture tags that are associated with the repository.</p> <note>
     *        <p>
     *        Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *        information, see <a>RepositoryCatalogDataInput</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withArchitectures(java.util.Collection<String> architectures) {
        setArchitectures(architectures);
        return this;
    }

    /**
     * <p>
     * The operating system tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * 
     * @return The operating system tags that are associated with the repository.</p> <note>
     *         <p>
     *         Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *         information, see <a>RepositoryCatalogDataInput</a>.
     *         </p>
     */

    public java.util.List<String> getOperatingSystems() {
        return operatingSystems;
    }

    /**
     * <p>
     * The operating system tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * 
     * @param operatingSystems
     *        The operating system tags that are associated with the repository.</p> <note>
     *        <p>
     *        Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *        information, see <a>RepositoryCatalogDataInput</a>.
     *        </p>
     */

    public void setOperatingSystems(java.util.Collection<String> operatingSystems) {
        if (operatingSystems == null) {
            this.operatingSystems = null;
            return;
        }

        this.operatingSystems = new java.util.ArrayList<String>(operatingSystems);
    }

    /**
     * <p>
     * The operating system tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingSystems(java.util.Collection)} or {@link #withOperatingSystems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingSystems
     *        The operating system tags that are associated with the repository.</p> <note>
     *        <p>
     *        Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *        information, see <a>RepositoryCatalogDataInput</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withOperatingSystems(String... operatingSystems) {
        if (this.operatingSystems == null) {
            setOperatingSystems(new java.util.ArrayList<String>(operatingSystems.length));
        }
        for (String ele : operatingSystems) {
            this.operatingSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating system tags that are associated with the repository.
     * </p>
     * <note>
     * <p>
     * Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see
     * <a>RepositoryCatalogDataInput</a>.
     * </p>
     * </note>
     * 
     * @param operatingSystems
     *        The operating system tags that are associated with the repository.</p> <note>
     *        <p>
     *        Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more
     *        information, see <a>RepositoryCatalogDataInput</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withOperatingSystems(java.util.Collection<String> operatingSystems) {
        setOperatingSystems(operatingSystems);
        return this;
    }

    /**
     * <p>
     * The URL containing the logo associated with the repository.
     * </p>
     * 
     * @param logoUrl
     *        The URL containing the logo associated with the repository.
     */

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * <p>
     * The URL containing the logo associated with the repository.
     * </p>
     * 
     * @return The URL containing the logo associated with the repository.
     */

    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * <p>
     * The URL containing the logo associated with the repository.
     * </p>
     * 
     * @param logoUrl
     *        The URL containing the logo associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withLogoUrl(String logoUrl) {
        setLogoUrl(logoUrl);
        return this;
    }

    /**
     * <p>
     * The longform description of the contents of the repository. This text appears in the repository details on the
     * Amazon ECR Public Gallery.
     * </p>
     * 
     * @param aboutText
     *        The longform description of the contents of the repository. This text appears in the repository details on
     *        the Amazon ECR Public Gallery.
     */

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    /**
     * <p>
     * The longform description of the contents of the repository. This text appears in the repository details on the
     * Amazon ECR Public Gallery.
     * </p>
     * 
     * @return The longform description of the contents of the repository. This text appears in the repository details
     *         on the Amazon ECR Public Gallery.
     */

    public String getAboutText() {
        return this.aboutText;
    }

    /**
     * <p>
     * The longform description of the contents of the repository. This text appears in the repository details on the
     * Amazon ECR Public Gallery.
     * </p>
     * 
     * @param aboutText
     *        The longform description of the contents of the repository. This text appears in the repository details on
     *        the Amazon ECR Public Gallery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withAboutText(String aboutText) {
        setAboutText(aboutText);
        return this;
    }

    /**
     * <p>
     * The longform usage details of the contents of the repository. The usage text provides context for users of the
     * repository.
     * </p>
     * 
     * @param usageText
     *        The longform usage details of the contents of the repository. The usage text provides context for users of
     *        the repository.
     */

    public void setUsageText(String usageText) {
        this.usageText = usageText;
    }

    /**
     * <p>
     * The longform usage details of the contents of the repository. The usage text provides context for users of the
     * repository.
     * </p>
     * 
     * @return The longform usage details of the contents of the repository. The usage text provides context for users
     *         of the repository.
     */

    public String getUsageText() {
        return this.usageText;
    }

    /**
     * <p>
     * The longform usage details of the contents of the repository. The usage text provides context for users of the
     * repository.
     * </p>
     * 
     * @param usageText
     *        The longform usage details of the contents of the repository. The usage text provides context for users of
     *        the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withUsageText(String usageText) {
        setUsageText(usageText);
        return this;
    }

    /**
     * <p>
     * Whether or not the repository is certified by AWS Marketplace.
     * </p>
     * 
     * @param marketplaceCertified
     *        Whether or not the repository is certified by AWS Marketplace.
     */

    public void setMarketplaceCertified(Boolean marketplaceCertified) {
        this.marketplaceCertified = marketplaceCertified;
    }

    /**
     * <p>
     * Whether or not the repository is certified by AWS Marketplace.
     * </p>
     * 
     * @return Whether or not the repository is certified by AWS Marketplace.
     */

    public Boolean getMarketplaceCertified() {
        return this.marketplaceCertified;
    }

    /**
     * <p>
     * Whether or not the repository is certified by AWS Marketplace.
     * </p>
     * 
     * @param marketplaceCertified
     *        Whether or not the repository is certified by AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCatalogData withMarketplaceCertified(Boolean marketplaceCertified) {
        setMarketplaceCertified(marketplaceCertified);
        return this;
    }

    /**
     * <p>
     * Whether or not the repository is certified by AWS Marketplace.
     * </p>
     * 
     * @return Whether or not the repository is certified by AWS Marketplace.
     */

    public Boolean isMarketplaceCertified() {
        return this.marketplaceCertified;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getArchitectures() != null)
            sb.append("Architectures: ").append(getArchitectures()).append(",");
        if (getOperatingSystems() != null)
            sb.append("OperatingSystems: ").append(getOperatingSystems()).append(",");
        if (getLogoUrl() != null)
            sb.append("LogoUrl: ").append(getLogoUrl()).append(",");
        if (getAboutText() != null)
            sb.append("AboutText: ").append(getAboutText()).append(",");
        if (getUsageText() != null)
            sb.append("UsageText: ").append(getUsageText()).append(",");
        if (getMarketplaceCertified() != null)
            sb.append("MarketplaceCertified: ").append(getMarketplaceCertified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryCatalogData == false)
            return false;
        RepositoryCatalogData other = (RepositoryCatalogData) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArchitectures() == null ^ this.getArchitectures() == null)
            return false;
        if (other.getArchitectures() != null && other.getArchitectures().equals(this.getArchitectures()) == false)
            return false;
        if (other.getOperatingSystems() == null ^ this.getOperatingSystems() == null)
            return false;
        if (other.getOperatingSystems() != null && other.getOperatingSystems().equals(this.getOperatingSystems()) == false)
            return false;
        if (other.getLogoUrl() == null ^ this.getLogoUrl() == null)
            return false;
        if (other.getLogoUrl() != null && other.getLogoUrl().equals(this.getLogoUrl()) == false)
            return false;
        if (other.getAboutText() == null ^ this.getAboutText() == null)
            return false;
        if (other.getAboutText() != null && other.getAboutText().equals(this.getAboutText()) == false)
            return false;
        if (other.getUsageText() == null ^ this.getUsageText() == null)
            return false;
        if (other.getUsageText() != null && other.getUsageText().equals(this.getUsageText()) == false)
            return false;
        if (other.getMarketplaceCertified() == null ^ this.getMarketplaceCertified() == null)
            return false;
        if (other.getMarketplaceCertified() != null && other.getMarketplaceCertified().equals(this.getMarketplaceCertified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArchitectures() == null) ? 0 : getArchitectures().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystems() == null) ? 0 : getOperatingSystems().hashCode());
        hashCode = prime * hashCode + ((getLogoUrl() == null) ? 0 : getLogoUrl().hashCode());
        hashCode = prime * hashCode + ((getAboutText() == null) ? 0 : getAboutText().hashCode());
        hashCode = prime * hashCode + ((getUsageText() == null) ? 0 : getUsageText().hashCode());
        hashCode = prime * hashCode + ((getMarketplaceCertified() == null) ? 0 : getMarketplaceCertified().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryCatalogData clone() {
        try {
            return (RepositoryCatalogData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.RepositoryCatalogDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
