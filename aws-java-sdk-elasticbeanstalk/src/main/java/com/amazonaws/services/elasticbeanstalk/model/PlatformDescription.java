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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information about a platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/PlatformDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * The AWS account ID of the person who created the platform.
     * </p>
     */
    private String platformOwner;
    /**
     * <p>
     * The name of the platform.
     * </p>
     */
    private String platformName;
    /**
     * <p>
     * The version of the platform.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The name of the solution stack used by the platform.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The status of the platform.
     * </p>
     */
    private String platformStatus;
    /**
     * <p>
     * The date when the platform was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date when the platform was last updated.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * The category of the platform.
     * </p>
     */
    private String platformCategory;
    /**
     * <p>
     * The description of the platform.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the maintainer of the platform.
     * </p>
     */
    private String maintainer;
    /**
     * <p>
     * The operating system used by the platform.
     * </p>
     */
    private String operatingSystemName;
    /**
     * <p>
     * The version of the operating system used by the platform.
     * </p>
     */
    private String operatingSystemVersion;
    /**
     * <p>
     * The programming languages supported by the platform.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformProgrammingLanguage> programmingLanguages;
    /**
     * <p>
     * The frameworks supported by the platform.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformFramework> frameworks;
    /**
     * <p>
     * The custom AMIs supported by the platform.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomAmi> customAmiList;
    /**
     * <p>
     * The tiers supported by the platform.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedTierList;
    /**
     * <p>
     * The additions supported by the platform.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedAddonList;

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @return The ARN of the platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform.
     * </p>
     * 
     * @param platformOwner
     *        The AWS account ID of the person who created the platform.
     */

    public void setPlatformOwner(String platformOwner) {
        this.platformOwner = platformOwner;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform.
     * </p>
     * 
     * @return The AWS account ID of the person who created the platform.
     */

    public String getPlatformOwner() {
        return this.platformOwner;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform.
     * </p>
     * 
     * @param platformOwner
     *        The AWS account ID of the person who created the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withPlatformOwner(String platformOwner) {
        setPlatformOwner(platformOwner);
        return this;
    }

    /**
     * <p>
     * The name of the platform.
     * </p>
     * 
     * @param platformName
     *        The name of the platform.
     */

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of the platform.
     * </p>
     * 
     * @return The name of the platform.
     */

    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * <p>
     * The name of the platform.
     * </p>
     * 
     * @param platformName
     *        The name of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withPlatformName(String platformName) {
        setPlatformName(platformName);
        return this;
    }

    /**
     * <p>
     * The version of the platform.
     * </p>
     * 
     * @param platformVersion
     *        The version of the platform.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The version of the platform.
     * </p>
     * 
     * @return The version of the platform.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The version of the platform.
     * </p>
     * 
     * @param platformVersion
     *        The version of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The name of the solution stack used by the platform.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack used by the platform.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack used by the platform.
     * </p>
     * 
     * @return The name of the solution stack used by the platform.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack used by the platform.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack used by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The status of the platform.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform.
     * @see PlatformStatus
     */

    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
    }

    /**
     * <p>
     * The status of the platform.
     * </p>
     * 
     * @return The status of the platform.
     * @see PlatformStatus
     */

    public String getPlatformStatus() {
        return this.platformStatus;
    }

    /**
     * <p>
     * The status of the platform.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformStatus
     */

    public PlatformDescription withPlatformStatus(String platformStatus) {
        setPlatformStatus(platformStatus);
        return this;
    }

    /**
     * <p>
     * The status of the platform.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform.
     * @see PlatformStatus
     */

    public void setPlatformStatus(PlatformStatus platformStatus) {
        withPlatformStatus(platformStatus);
    }

    /**
     * <p>
     * The status of the platform.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformStatus
     */

    public PlatformDescription withPlatformStatus(PlatformStatus platformStatus) {
        this.platformStatus = platformStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date when the platform was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when the platform was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date when the platform was created.
     * </p>
     * 
     * @return The date when the platform was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date when the platform was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when the platform was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date when the platform was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date when the platform was last updated.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date when the platform was last updated.
     * </p>
     * 
     * @return The date when the platform was last updated.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date when the platform was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date when the platform was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The category of the platform.
     * </p>
     * 
     * @param platformCategory
     *        The category of the platform.
     */

    public void setPlatformCategory(String platformCategory) {
        this.platformCategory = platformCategory;
    }

    /**
     * <p>
     * The category of the platform.
     * </p>
     * 
     * @return The category of the platform.
     */

    public String getPlatformCategory() {
        return this.platformCategory;
    }

    /**
     * <p>
     * The category of the platform.
     * </p>
     * 
     * @param platformCategory
     *        The category of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withPlatformCategory(String platformCategory) {
        setPlatformCategory(platformCategory);
        return this;
    }

    /**
     * <p>
     * The description of the platform.
     * </p>
     * 
     * @param description
     *        The description of the platform.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the platform.
     * </p>
     * 
     * @return The description of the platform.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the platform.
     * </p>
     * 
     * @param description
     *        The description of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the maintainer of the platform.
     * </p>
     * 
     * @param maintainer
     *        Information about the maintainer of the platform.
     */

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    /**
     * <p>
     * Information about the maintainer of the platform.
     * </p>
     * 
     * @return Information about the maintainer of the platform.
     */

    public String getMaintainer() {
        return this.maintainer;
    }

    /**
     * <p>
     * Information about the maintainer of the platform.
     * </p>
     * 
     * @param maintainer
     *        Information about the maintainer of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withMaintainer(String maintainer) {
        setMaintainer(maintainer);
        return this;
    }

    /**
     * <p>
     * The operating system used by the platform.
     * </p>
     * 
     * @param operatingSystemName
     *        The operating system used by the platform.
     */

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    /**
     * <p>
     * The operating system used by the platform.
     * </p>
     * 
     * @return The operating system used by the platform.
     */

    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    /**
     * <p>
     * The operating system used by the platform.
     * </p>
     * 
     * @param operatingSystemName
     *        The operating system used by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withOperatingSystemName(String operatingSystemName) {
        setOperatingSystemName(operatingSystemName);
        return this;
    }

    /**
     * <p>
     * The version of the operating system used by the platform.
     * </p>
     * 
     * @param operatingSystemVersion
     *        The version of the operating system used by the platform.
     */

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * <p>
     * The version of the operating system used by the platform.
     * </p>
     * 
     * @return The version of the operating system used by the platform.
     */

    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    /**
     * <p>
     * The version of the operating system used by the platform.
     * </p>
     * 
     * @param operatingSystemVersion
     *        The version of the operating system used by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withOperatingSystemVersion(String operatingSystemVersion) {
        setOperatingSystemVersion(operatingSystemVersion);
        return this;
    }

    /**
     * <p>
     * The programming languages supported by the platform.
     * </p>
     * 
     * @return The programming languages supported by the platform.
     */

    public java.util.List<PlatformProgrammingLanguage> getProgrammingLanguages() {
        if (programmingLanguages == null) {
            programmingLanguages = new com.amazonaws.internal.SdkInternalList<PlatformProgrammingLanguage>();
        }
        return programmingLanguages;
    }

    /**
     * <p>
     * The programming languages supported by the platform.
     * </p>
     * 
     * @param programmingLanguages
     *        The programming languages supported by the platform.
     */

    public void setProgrammingLanguages(java.util.Collection<PlatformProgrammingLanguage> programmingLanguages) {
        if (programmingLanguages == null) {
            this.programmingLanguages = null;
            return;
        }

        this.programmingLanguages = new com.amazonaws.internal.SdkInternalList<PlatformProgrammingLanguage>(programmingLanguages);
    }

    /**
     * <p>
     * The programming languages supported by the platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProgrammingLanguages(java.util.Collection)} or {@link #withProgrammingLanguages(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param programmingLanguages
     *        The programming languages supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withProgrammingLanguages(PlatformProgrammingLanguage... programmingLanguages) {
        if (this.programmingLanguages == null) {
            setProgrammingLanguages(new com.amazonaws.internal.SdkInternalList<PlatformProgrammingLanguage>(programmingLanguages.length));
        }
        for (PlatformProgrammingLanguage ele : programmingLanguages) {
            this.programmingLanguages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The programming languages supported by the platform.
     * </p>
     * 
     * @param programmingLanguages
     *        The programming languages supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withProgrammingLanguages(java.util.Collection<PlatformProgrammingLanguage> programmingLanguages) {
        setProgrammingLanguages(programmingLanguages);
        return this;
    }

    /**
     * <p>
     * The frameworks supported by the platform.
     * </p>
     * 
     * @return The frameworks supported by the platform.
     */

    public java.util.List<PlatformFramework> getFrameworks() {
        if (frameworks == null) {
            frameworks = new com.amazonaws.internal.SdkInternalList<PlatformFramework>();
        }
        return frameworks;
    }

    /**
     * <p>
     * The frameworks supported by the platform.
     * </p>
     * 
     * @param frameworks
     *        The frameworks supported by the platform.
     */

    public void setFrameworks(java.util.Collection<PlatformFramework> frameworks) {
        if (frameworks == null) {
            this.frameworks = null;
            return;
        }

        this.frameworks = new com.amazonaws.internal.SdkInternalList<PlatformFramework>(frameworks);
    }

    /**
     * <p>
     * The frameworks supported by the platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworks(java.util.Collection)} or {@link #withFrameworks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param frameworks
     *        The frameworks supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withFrameworks(PlatformFramework... frameworks) {
        if (this.frameworks == null) {
            setFrameworks(new com.amazonaws.internal.SdkInternalList<PlatformFramework>(frameworks.length));
        }
        for (PlatformFramework ele : frameworks) {
            this.frameworks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The frameworks supported by the platform.
     * </p>
     * 
     * @param frameworks
     *        The frameworks supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withFrameworks(java.util.Collection<PlatformFramework> frameworks) {
        setFrameworks(frameworks);
        return this;
    }

    /**
     * <p>
     * The custom AMIs supported by the platform.
     * </p>
     * 
     * @return The custom AMIs supported by the platform.
     */

    public java.util.List<CustomAmi> getCustomAmiList() {
        if (customAmiList == null) {
            customAmiList = new com.amazonaws.internal.SdkInternalList<CustomAmi>();
        }
        return customAmiList;
    }

    /**
     * <p>
     * The custom AMIs supported by the platform.
     * </p>
     * 
     * @param customAmiList
     *        The custom AMIs supported by the platform.
     */

    public void setCustomAmiList(java.util.Collection<CustomAmi> customAmiList) {
        if (customAmiList == null) {
            this.customAmiList = null;
            return;
        }

        this.customAmiList = new com.amazonaws.internal.SdkInternalList<CustomAmi>(customAmiList);
    }

    /**
     * <p>
     * The custom AMIs supported by the platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAmiList(java.util.Collection)} or {@link #withCustomAmiList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customAmiList
     *        The custom AMIs supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withCustomAmiList(CustomAmi... customAmiList) {
        if (this.customAmiList == null) {
            setCustomAmiList(new com.amazonaws.internal.SdkInternalList<CustomAmi>(customAmiList.length));
        }
        for (CustomAmi ele : customAmiList) {
            this.customAmiList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom AMIs supported by the platform.
     * </p>
     * 
     * @param customAmiList
     *        The custom AMIs supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withCustomAmiList(java.util.Collection<CustomAmi> customAmiList) {
        setCustomAmiList(customAmiList);
        return this;
    }

    /**
     * <p>
     * The tiers supported by the platform.
     * </p>
     * 
     * @return The tiers supported by the platform.
     */

    public java.util.List<String> getSupportedTierList() {
        if (supportedTierList == null) {
            supportedTierList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedTierList;
    }

    /**
     * <p>
     * The tiers supported by the platform.
     * </p>
     * 
     * @param supportedTierList
     *        The tiers supported by the platform.
     */

    public void setSupportedTierList(java.util.Collection<String> supportedTierList) {
        if (supportedTierList == null) {
            this.supportedTierList = null;
            return;
        }

        this.supportedTierList = new com.amazonaws.internal.SdkInternalList<String>(supportedTierList);
    }

    /**
     * <p>
     * The tiers supported by the platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTierList(java.util.Collection)} or {@link #withSupportedTierList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedTierList
     *        The tiers supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withSupportedTierList(String... supportedTierList) {
        if (this.supportedTierList == null) {
            setSupportedTierList(new com.amazonaws.internal.SdkInternalList<String>(supportedTierList.length));
        }
        for (String ele : supportedTierList) {
            this.supportedTierList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tiers supported by the platform.
     * </p>
     * 
     * @param supportedTierList
     *        The tiers supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withSupportedTierList(java.util.Collection<String> supportedTierList) {
        setSupportedTierList(supportedTierList);
        return this;
    }

    /**
     * <p>
     * The additions supported by the platform.
     * </p>
     * 
     * @return The additions supported by the platform.
     */

    public java.util.List<String> getSupportedAddonList() {
        if (supportedAddonList == null) {
            supportedAddonList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedAddonList;
    }

    /**
     * <p>
     * The additions supported by the platform.
     * </p>
     * 
     * @param supportedAddonList
     *        The additions supported by the platform.
     */

    public void setSupportedAddonList(java.util.Collection<String> supportedAddonList) {
        if (supportedAddonList == null) {
            this.supportedAddonList = null;
            return;
        }

        this.supportedAddonList = new com.amazonaws.internal.SdkInternalList<String>(supportedAddonList);
    }

    /**
     * <p>
     * The additions supported by the platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedAddonList(java.util.Collection)} or {@link #withSupportedAddonList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedAddonList
     *        The additions supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withSupportedAddonList(String... supportedAddonList) {
        if (this.supportedAddonList == null) {
            setSupportedAddonList(new com.amazonaws.internal.SdkInternalList<String>(supportedAddonList.length));
        }
        for (String ele : supportedAddonList) {
            this.supportedAddonList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The additions supported by the platform.
     * </p>
     * 
     * @param supportedAddonList
     *        The additions supported by the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformDescription withSupportedAddonList(java.util.Collection<String> supportedAddonList) {
        setSupportedAddonList(supportedAddonList);
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
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getPlatformOwner() != null)
            sb.append("PlatformOwner: ").append(getPlatformOwner()).append(",");
        if (getPlatformName() != null)
            sb.append("PlatformName: ").append(getPlatformName()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getPlatformStatus() != null)
            sb.append("PlatformStatus: ").append(getPlatformStatus()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getPlatformCategory() != null)
            sb.append("PlatformCategory: ").append(getPlatformCategory()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMaintainer() != null)
            sb.append("Maintainer: ").append(getMaintainer()).append(",");
        if (getOperatingSystemName() != null)
            sb.append("OperatingSystemName: ").append(getOperatingSystemName()).append(",");
        if (getOperatingSystemVersion() != null)
            sb.append("OperatingSystemVersion: ").append(getOperatingSystemVersion()).append(",");
        if (getProgrammingLanguages() != null)
            sb.append("ProgrammingLanguages: ").append(getProgrammingLanguages()).append(",");
        if (getFrameworks() != null)
            sb.append("Frameworks: ").append(getFrameworks()).append(",");
        if (getCustomAmiList() != null)
            sb.append("CustomAmiList: ").append(getCustomAmiList()).append(",");
        if (getSupportedTierList() != null)
            sb.append("SupportedTierList: ").append(getSupportedTierList()).append(",");
        if (getSupportedAddonList() != null)
            sb.append("SupportedAddonList: ").append(getSupportedAddonList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformDescription == false)
            return false;
        PlatformDescription other = (PlatformDescription) obj;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getPlatformOwner() == null ^ this.getPlatformOwner() == null)
            return false;
        if (other.getPlatformOwner() != null && other.getPlatformOwner().equals(this.getPlatformOwner()) == false)
            return false;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformStatus() == null ^ this.getPlatformStatus() == null)
            return false;
        if (other.getPlatformStatus() != null && other.getPlatformStatus().equals(this.getPlatformStatus()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getPlatformCategory() == null ^ this.getPlatformCategory() == null)
            return false;
        if (other.getPlatformCategory() != null && other.getPlatformCategory().equals(this.getPlatformCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaintainer() == null ^ this.getMaintainer() == null)
            return false;
        if (other.getMaintainer() != null && other.getMaintainer().equals(this.getMaintainer()) == false)
            return false;
        if (other.getOperatingSystemName() == null ^ this.getOperatingSystemName() == null)
            return false;
        if (other.getOperatingSystemName() != null && other.getOperatingSystemName().equals(this.getOperatingSystemName()) == false)
            return false;
        if (other.getOperatingSystemVersion() == null ^ this.getOperatingSystemVersion() == null)
            return false;
        if (other.getOperatingSystemVersion() != null && other.getOperatingSystemVersion().equals(this.getOperatingSystemVersion()) == false)
            return false;
        if (other.getProgrammingLanguages() == null ^ this.getProgrammingLanguages() == null)
            return false;
        if (other.getProgrammingLanguages() != null && other.getProgrammingLanguages().equals(this.getProgrammingLanguages()) == false)
            return false;
        if (other.getFrameworks() == null ^ this.getFrameworks() == null)
            return false;
        if (other.getFrameworks() != null && other.getFrameworks().equals(this.getFrameworks()) == false)
            return false;
        if (other.getCustomAmiList() == null ^ this.getCustomAmiList() == null)
            return false;
        if (other.getCustomAmiList() != null && other.getCustomAmiList().equals(this.getCustomAmiList()) == false)
            return false;
        if (other.getSupportedTierList() == null ^ this.getSupportedTierList() == null)
            return false;
        if (other.getSupportedTierList() != null && other.getSupportedTierList().equals(this.getSupportedTierList()) == false)
            return false;
        if (other.getSupportedAddonList() == null ^ this.getSupportedAddonList() == null)
            return false;
        if (other.getSupportedAddonList() != null && other.getSupportedAddonList().equals(this.getSupportedAddonList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getPlatformOwner() == null) ? 0 : getPlatformOwner().hashCode());
        hashCode = prime * hashCode + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformStatus() == null) ? 0 : getPlatformStatus().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getPlatformCategory() == null) ? 0 : getPlatformCategory().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaintainer() == null) ? 0 : getMaintainer().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemName() == null) ? 0 : getOperatingSystemName().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemVersion() == null) ? 0 : getOperatingSystemVersion().hashCode());
        hashCode = prime * hashCode + ((getProgrammingLanguages() == null) ? 0 : getProgrammingLanguages().hashCode());
        hashCode = prime * hashCode + ((getFrameworks() == null) ? 0 : getFrameworks().hashCode());
        hashCode = prime * hashCode + ((getCustomAmiList() == null) ? 0 : getCustomAmiList().hashCode());
        hashCode = prime * hashCode + ((getSupportedTierList() == null) ? 0 : getSupportedTierList().hashCode());
        hashCode = prime * hashCode + ((getSupportedAddonList() == null) ? 0 : getSupportedAddonList().hashCode());
        return hashCode;
    }

    @Override
    public PlatformDescription clone() {
        try {
            return (PlatformDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
