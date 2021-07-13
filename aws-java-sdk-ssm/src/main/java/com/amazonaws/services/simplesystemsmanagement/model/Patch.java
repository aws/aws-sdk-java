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
     * The ID of the patch. Applies to Windows patches only.
     * </p>
     * <note>
     * <p>
     * This ID isn't the same as the Microsoft Knowledge Base ID.
     * </p>
     * </note>
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
     * The product family the patch is applicable for. For example, <code>Windows</code> or <code>Amazon Linux 2</code>.
     * </p>
     */
    private String productFamily;
    /**
     * <p>
     * The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     * <code>AmazonLinux2018.03</code>.
     * </p>
     */
    private String product;
    /**
     * <p>
     * The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     * <code>CriticalUpdates</code>.
     * </p>
     */
    private String classification;
    /**
     * <p>
     * The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or <code>Moderate</code>.
     * Applies to Windows patches only.
     * </p>
     */
    private String msrcSeverity;
    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     * </p>
     */
    private String kbNumber;
    /**
     * <p>
     * The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     * <code>MS14-045</code>. Applies to Windows patches only.
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
     * The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> advisoryIds;
    /**
     * <p>
     * The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bugzillaIds;
    /**
     * <p>
     * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>. Applies
     * to Linux-based instances only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cVEIds;
    /**
     * <p>
     * The name of the patch. Applies to Linux-based instances only.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch value is
     * <code>20180914-2</code>. Applies to Linux-based instances only.
     * </p>
     */
    private Integer epoch;
    /**
     * <p>
     * The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the version
     * number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the
     * release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     * </p>
     */
    private String release;
    /**
     * <p>
     * The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     * architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     * </p>
     */
    private String arch;
    /**
     * <p>
     * The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The source patch repository for the operating system and version, such as <code>trusty-security</code> for Ubuntu
     * Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to Linux-based instances
     * only.
     * </p>
     */
    private String repository;

    /**
     * <p>
     * The ID of the patch. Applies to Windows patches only.
     * </p>
     * <note>
     * <p>
     * This ID isn't the same as the Microsoft Knowledge Base ID.
     * </p>
     * </note>
     * 
     * @param id
     *        The ID of the patch. Applies to Windows patches only.</p> <note>
     *        <p>
     *        This ID isn't the same as the Microsoft Knowledge Base ID.
     *        </p>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the patch. Applies to Windows patches only.
     * </p>
     * <note>
     * <p>
     * This ID isn't the same as the Microsoft Knowledge Base ID.
     * </p>
     * </note>
     * 
     * @return The ID of the patch. Applies to Windows patches only.</p> <note>
     *         <p>
     *         This ID isn't the same as the Microsoft Knowledge Base ID.
     *         </p>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the patch. Applies to Windows patches only.
     * </p>
     * <note>
     * <p>
     * This ID isn't the same as the Microsoft Knowledge Base ID.
     * </p>
     * </note>
     * 
     * @param id
     *        The ID of the patch. Applies to Windows patches only.</p> <note>
     *        <p>
     *        This ID isn't the same as the Microsoft Knowledge Base ID.
     *        </p>
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
     * The product family the patch is applicable for. For example, <code>Windows</code> or <code>Amazon Linux 2</code>.
     * </p>
     * 
     * @param productFamily
     *        The product family the patch is applicable for. For example, <code>Windows</code> or
     *        <code>Amazon Linux 2</code>.
     */

    public void setProductFamily(String productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * <p>
     * The product family the patch is applicable for. For example, <code>Windows</code> or <code>Amazon Linux 2</code>.
     * </p>
     * 
     * @return The product family the patch is applicable for. For example, <code>Windows</code> or
     *         <code>Amazon Linux 2</code>.
     */

    public String getProductFamily() {
        return this.productFamily;
    }

    /**
     * <p>
     * The product family the patch is applicable for. For example, <code>Windows</code> or <code>Amazon Linux 2</code>.
     * </p>
     * 
     * @param productFamily
     *        The product family the patch is applicable for. For example, <code>Windows</code> or
     *        <code>Amazon Linux 2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withProductFamily(String productFamily) {
        setProductFamily(productFamily);
        return this;
    }

    /**
     * <p>
     * The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     * <code>AmazonLinux2018.03</code>.
     * </p>
     * 
     * @param product
     *        The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     *        <code>AmazonLinux2018.03</code>.
     */

    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     * <code>AmazonLinux2018.03</code>.
     * </p>
     * 
     * @return The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     *         <code>AmazonLinux2018.03</code>.
     */

    public String getProduct() {
        return this.product;
    }

    /**
     * <p>
     * The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     * <code>AmazonLinux2018.03</code>.
     * </p>
     * 
     * @param product
     *        The specific product the patch is applicable for. For example, <code>WindowsServer2016</code> or
     *        <code>AmazonLinux2018.03</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withProduct(String product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     * <code>CriticalUpdates</code>.
     * </p>
     * 
     * @param classification
     *        The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     *        <code>CriticalUpdates</code>.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     * <code>CriticalUpdates</code>.
     * </p>
     * 
     * @return The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     *         <code>CriticalUpdates</code>.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     * <code>CriticalUpdates</code>.
     * </p>
     * 
     * @param classification
     *        The classification of the patch. For example, <code>SecurityUpdates</code>, <code>Updates</code>, or
     *        <code>CriticalUpdates</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or <code>Moderate</code>.
     * Applies to Windows patches only.
     * </p>
     * 
     * @param msrcSeverity
     *        The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or <code>Moderate</code>
     *        . Applies to Windows patches only.
     */

    public void setMsrcSeverity(String msrcSeverity) {
        this.msrcSeverity = msrcSeverity;
    }

    /**
     * <p>
     * The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or <code>Moderate</code>.
     * Applies to Windows patches only.
     * </p>
     * 
     * @return The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or
     *         <code>Moderate</code>. Applies to Windows patches only.
     */

    public String getMsrcSeverity() {
        return this.msrcSeverity;
    }

    /**
     * <p>
     * The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or <code>Moderate</code>.
     * Applies to Windows patches only.
     * </p>
     * 
     * @param msrcSeverity
     *        The severity of the patch, such as <code>Critical</code>, <code>Important</code>, or <code>Moderate</code>
     *        . Applies to Windows patches only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withMsrcSeverity(String msrcSeverity) {
        setMsrcSeverity(msrcSeverity);
        return this;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     * </p>
     * 
     * @param kbNumber
     *        The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     */

    public void setKbNumber(String kbNumber) {
        this.kbNumber = kbNumber;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     * </p>
     * 
     * @return The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     */

    public String getKbNumber() {
        return this.kbNumber;
    }

    /**
     * <p>
     * The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     * </p>
     * 
     * @param kbNumber
     *        The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withKbNumber(String kbNumber) {
        setKbNumber(kbNumber);
        return this;
    }

    /**
     * <p>
     * The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     * <code>MS14-045</code>. Applies to Windows patches only.
     * </p>
     * 
     * @param msrcNumber
     *        The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     *        <code>MS14-045</code>. Applies to Windows patches only.
     */

    public void setMsrcNumber(String msrcNumber) {
        this.msrcNumber = msrcNumber;
    }

    /**
     * <p>
     * The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     * <code>MS14-045</code>. Applies to Windows patches only.
     * </p>
     * 
     * @return The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     *         <code>MS14-045</code>. Applies to Windows patches only.
     */

    public String getMsrcNumber() {
        return this.msrcNumber;
    }

    /**
     * <p>
     * The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     * <code>MS14-045</code>. Applies to Windows patches only.
     * </p>
     * 
     * @param msrcNumber
     *        The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example,
     *        <code>MS14-045</code>. Applies to Windows patches only.
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
     * <p>
     * The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances
     *         only.
     */

    public java.util.List<String> getAdvisoryIds() {
        if (advisoryIds == null) {
            advisoryIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return advisoryIds;
    }

    /**
     * <p>
     * The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param advisoryIds
     *        The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances
     *        only.
     */

    public void setAdvisoryIds(java.util.Collection<String> advisoryIds) {
        if (advisoryIds == null) {
            this.advisoryIds = null;
            return;
        }

        this.advisoryIds = new com.amazonaws.internal.SdkInternalList<String>(advisoryIds);
    }

    /**
     * <p>
     * The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvisoryIds(java.util.Collection)} or {@link #withAdvisoryIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param advisoryIds
     *        The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances
     *        only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withAdvisoryIds(String... advisoryIds) {
        if (this.advisoryIds == null) {
            setAdvisoryIds(new com.amazonaws.internal.SdkInternalList<String>(advisoryIds.length));
        }
        for (String ele : advisoryIds) {
            this.advisoryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param advisoryIds
     *        The Advisory ID of the patch. For example, <code>RHSA-2020:3779</code>. Applies to Linux-based instances
     *        only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withAdvisoryIds(java.util.Collection<String> advisoryIds) {
        setAdvisoryIds(advisoryIds);
        return this;
    }

    /**
     * <p>
     * The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     */

    public java.util.List<String> getBugzillaIds() {
        if (bugzillaIds == null) {
            bugzillaIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bugzillaIds;
    }

    /**
     * <p>
     * The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param bugzillaIds
     *        The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     */

    public void setBugzillaIds(java.util.Collection<String> bugzillaIds) {
        if (bugzillaIds == null) {
            this.bugzillaIds = null;
            return;
        }

        this.bugzillaIds = new com.amazonaws.internal.SdkInternalList<String>(bugzillaIds);
    }

    /**
     * <p>
     * The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBugzillaIds(java.util.Collection)} or {@link #withBugzillaIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bugzillaIds
     *        The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withBugzillaIds(String... bugzillaIds) {
        if (this.bugzillaIds == null) {
            setBugzillaIds(new com.amazonaws.internal.SdkInternalList<String>(bugzillaIds.length));
        }
        for (String ele : bugzillaIds) {
            this.bugzillaIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param bugzillaIds
     *        The Bugzilla ID of the patch. For example, <code>1600646</code>. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withBugzillaIds(java.util.Collection<String> bugzillaIds) {
        setBugzillaIds(bugzillaIds);
        return this;
    }

    /**
     * <p>
     * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>. Applies
     * to Linux-based instances only.
     * </p>
     * 
     * @return The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>.
     *         Applies to Linux-based instances only.
     */

    public java.util.List<String> getCVEIds() {
        if (cVEIds == null) {
            cVEIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cVEIds;
    }

    /**
     * <p>
     * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>. Applies
     * to Linux-based instances only.
     * </p>
     * 
     * @param cVEIds
     *        The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>.
     *        Applies to Linux-based instances only.
     */

    public void setCVEIds(java.util.Collection<String> cVEIds) {
        if (cVEIds == null) {
            this.cVEIds = null;
            return;
        }

        this.cVEIds = new com.amazonaws.internal.SdkInternalList<String>(cVEIds);
    }

    /**
     * <p>
     * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>. Applies
     * to Linux-based instances only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCVEIds(java.util.Collection)} or {@link #withCVEIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cVEIds
     *        The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>.
     *        Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withCVEIds(String... cVEIds) {
        if (this.cVEIds == null) {
            setCVEIds(new com.amazonaws.internal.SdkInternalList<String>(cVEIds.length));
        }
        for (String ele : cVEIds) {
            this.cVEIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>. Applies
     * to Linux-based instances only.
     * </p>
     * 
     * @param cVEIds
     *        The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, <code>CVE-2011-3192</code>.
     *        Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withCVEIds(java.util.Collection<String> cVEIds) {
        setCVEIds(cVEIds);
        return this;
    }

    /**
     * <p>
     * The name of the patch. Applies to Linux-based instances only.
     * </p>
     * 
     * @param name
     *        The name of the patch. Applies to Linux-based instances only.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the patch. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The name of the patch. Applies to Linux-based instances only.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the patch. Applies to Linux-based instances only.
     * </p>
     * 
     * @param name
     *        The name of the patch. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch value is
     * <code>20180914-2</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param epoch
     *        The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch
     *        value is <code>20180914-2</code>. Applies to Linux-based instances only.
     */

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    /**
     * <p>
     * The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch value is
     * <code>20180914-2</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch
     *         value is <code>20180914-2</code>. Applies to Linux-based instances only.
     */

    public Integer getEpoch() {
        return this.epoch;
    }

    /**
     * <p>
     * The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch value is
     * <code>20180914-2</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param epoch
     *        The epoch of the patch. For example in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the epoch
     *        value is <code>20180914-2</code>. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withEpoch(Integer epoch) {
        setEpoch(epoch);
        return this;
    }

    /**
     * <p>
     * The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the version
     * number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param version
     *        The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the
     *        version number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the version
     * number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the
     *         version number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the version
     * number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param version
     *        The version number of the patch. For example, in <code>example-pkg-1.710.10-2.7.abcd.x86_64</code>, the
     *        version number is indicated by <code>-1</code>. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the
     * release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param release
     *        The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>,
     *        the release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     */

    public void setRelease(String release) {
        this.release = release;
    }

    /**
     * <p>
     * The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the
     * release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>,
     *         the release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     */

    public String getRelease() {
        return this.release;
    }

    /**
     * <p>
     * The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>, the
     * release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param release
     *        The particular release of a patch. For example, in <code>pkg-example-EE-20180914-2.2.amzn1.noarch</code>,
     *        the release is <code>2.amaz1</code>. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withRelease(String release) {
        setRelease(release);
        return this;
    }

    /**
     * <p>
     * The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     * architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param arch
     *        The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     *        architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     */

    public void setArch(String arch) {
        this.arch = arch;
    }

    /**
     * <p>
     * The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     * architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @return The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     *         architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     */

    public String getArch() {
        return this.arch;
    }

    /**
     * <p>
     * The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     * architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     * </p>
     * 
     * @param arch
     *        The architecture of the patch. For example, in <code>example-pkg-0.710.10-2.7.abcd.x86_64</code>, the
     *        architecture is indicated by <code>x86_64</code>. Applies to Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withArch(String arch) {
        setArch(arch);
        return this;
    }

    /**
     * <p>
     * The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     * </p>
     * 
     * @param severity
     *        The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     * </p>
     * 
     * @return The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     * </p>
     * 
     * @param severity
     *        The severity level of the patch. For example, <code>CRITICAL</code> or <code>MODERATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The source patch repository for the operating system and version, such as <code>trusty-security</code> for Ubuntu
     * Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to Linux-based instances
     * only.
     * </p>
     * 
     * @param repository
     *        The source patch repository for the operating system and version, such as <code>trusty-security</code> for
     *        Ubuntu Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to
     *        Linux-based instances only.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The source patch repository for the operating system and version, such as <code>trusty-security</code> for Ubuntu
     * Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to Linux-based instances
     * only.
     * </p>
     * 
     * @return The source patch repository for the operating system and version, such as <code>trusty-security</code>
     *         for Ubuntu Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to
     *         Linux-based instances only.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The source patch repository for the operating system and version, such as <code>trusty-security</code> for Ubuntu
     * Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to Linux-based instances
     * only.
     * </p>
     * 
     * @param repository
     *        The source patch repository for the operating system and version, such as <code>trusty-security</code> for
     *        Ubuntu Server 14.04 LTE and <code>focal-security</code> for Ubuntu Server 20.04 LTE. Applies to
     *        Linux-based instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Patch withRepository(String repository) {
        setRepository(repository);
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
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getAdvisoryIds() != null)
            sb.append("AdvisoryIds: ").append(getAdvisoryIds()).append(",");
        if (getBugzillaIds() != null)
            sb.append("BugzillaIds: ").append(getBugzillaIds()).append(",");
        if (getCVEIds() != null)
            sb.append("CVEIds: ").append(getCVEIds()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEpoch() != null)
            sb.append("Epoch: ").append(getEpoch()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getRelease() != null)
            sb.append("Release: ").append(getRelease()).append(",");
        if (getArch() != null)
            sb.append("Arch: ").append(getArch()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository());
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
        if (other.getAdvisoryIds() == null ^ this.getAdvisoryIds() == null)
            return false;
        if (other.getAdvisoryIds() != null && other.getAdvisoryIds().equals(this.getAdvisoryIds()) == false)
            return false;
        if (other.getBugzillaIds() == null ^ this.getBugzillaIds() == null)
            return false;
        if (other.getBugzillaIds() != null && other.getBugzillaIds().equals(this.getBugzillaIds()) == false)
            return false;
        if (other.getCVEIds() == null ^ this.getCVEIds() == null)
            return false;
        if (other.getCVEIds() != null && other.getCVEIds().equals(this.getCVEIds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEpoch() == null ^ this.getEpoch() == null)
            return false;
        if (other.getEpoch() != null && other.getEpoch().equals(this.getEpoch()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getRelease() == null ^ this.getRelease() == null)
            return false;
        if (other.getRelease() != null && other.getRelease().equals(this.getRelease()) == false)
            return false;
        if (other.getArch() == null ^ this.getArch() == null)
            return false;
        if (other.getArch() != null && other.getArch().equals(this.getArch()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
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
        hashCode = prime * hashCode + ((getAdvisoryIds() == null) ? 0 : getAdvisoryIds().hashCode());
        hashCode = prime * hashCode + ((getBugzillaIds() == null) ? 0 : getBugzillaIds().hashCode());
        hashCode = prime * hashCode + ((getCVEIds() == null) ? 0 : getCVEIds().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEpoch() == null) ? 0 : getEpoch().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getRelease() == null) ? 0 : getRelease().hashCode());
        hashCode = prime * hashCode + ((getArch() == null) ? 0 : getArch().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
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
