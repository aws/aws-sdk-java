/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an Inspector rules package.
 * </p>
 * <p>
 * This data type is used as the response element in the
 * <a>DescribeRulesPackage</a> action.
 * </p>
 */
public class RulesPackage implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     */
    private String rulesPackageArn;
    /**
     * <p>
     * The name of the rules package.
     * </p>
     */
    private String rulesPackageName;
    /**
     * <p>
     * The version id of the rules package.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The provider of the rules package.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The description of the rules package.
     * </p>
     */
    private LocalizedText description;

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     * 
     * @param rulesPackageArn
     *        The ARN of the rules package.
     */
    public void setRulesPackageArn(String rulesPackageArn) {
        this.rulesPackageArn = rulesPackageArn;
    }

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     * 
     * @return The ARN of the rules package.
     */
    public String getRulesPackageArn() {
        return this.rulesPackageArn;
    }

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     * 
     * @param rulesPackageArn
     *        The ARN of the rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RulesPackage withRulesPackageArn(String rulesPackageArn) {
        setRulesPackageArn(rulesPackageArn);
        return this;
    }

    /**
     * <p>
     * The name of the rules package.
     * </p>
     * 
     * @param rulesPackageName
     *        The name of the rules package.
     */
    public void setRulesPackageName(String rulesPackageName) {
        this.rulesPackageName = rulesPackageName;
    }

    /**
     * <p>
     * The name of the rules package.
     * </p>
     * 
     * @return The name of the rules package.
     */
    public String getRulesPackageName() {
        return this.rulesPackageName;
    }

    /**
     * <p>
     * The name of the rules package.
     * </p>
     * 
     * @param rulesPackageName
     *        The name of the rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RulesPackage withRulesPackageName(String rulesPackageName) {
        setRulesPackageName(rulesPackageName);
        return this;
    }

    /**
     * <p>
     * The version id of the rules package.
     * </p>
     * 
     * @param version
     *        The version id of the rules package.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version id of the rules package.
     * </p>
     * 
     * @return The version id of the rules package.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version id of the rules package.
     * </p>
     * 
     * @param version
     *        The version id of the rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RulesPackage withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The provider of the rules package.
     * </p>
     * 
     * @param provider
     *        The provider of the rules package.
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the rules package.
     * </p>
     * 
     * @return The provider of the rules package.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the rules package.
     * </p>
     * 
     * @param provider
     *        The provider of the rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RulesPackage withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The description of the rules package.
     * </p>
     * 
     * @param description
     *        The description of the rules package.
     */
    public void setDescription(LocalizedText description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rules package.
     * </p>
     * 
     * @return The description of the rules package.
     */
    public LocalizedText getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the rules package.
     * </p>
     * 
     * @param description
     *        The description of the rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RulesPackage withDescription(LocalizedText description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRulesPackageArn() != null)
            sb.append("RulesPackageArn: " + getRulesPackageArn() + ",");
        if (getRulesPackageName() != null)
            sb.append("RulesPackageName: " + getRulesPackageName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getProvider() != null)
            sb.append("Provider: " + getProvider() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RulesPackage == false)
            return false;
        RulesPackage other = (RulesPackage) obj;
        if (other.getRulesPackageArn() == null
                ^ this.getRulesPackageArn() == null)
            return false;
        if (other.getRulesPackageArn() != null
                && other.getRulesPackageArn().equals(this.getRulesPackageArn()) == false)
            return false;
        if (other.getRulesPackageName() == null
                ^ this.getRulesPackageName() == null)
            return false;
        if (other.getRulesPackageName() != null
                && other.getRulesPackageName().equals(
                        this.getRulesPackageName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null
                && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null
                && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRulesPackageArn() == null) ? 0 : getRulesPackageArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRulesPackageName() == null) ? 0 : getRulesPackageName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public RulesPackage clone() {
        try {
            return (RulesPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}