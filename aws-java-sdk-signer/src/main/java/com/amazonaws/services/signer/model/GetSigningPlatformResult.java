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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningPlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSigningPlatformResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the target signing platform.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * The display name of the target signing platform.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A list of partner entities that use the target signing platform.
     * </p>
     */
    private String partner;
    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The category type of the target signing platform.
     * </p>
     */
    private String category;
    /**
     * <p>
     * A list of configurations applied to the target platform at signing.
     * </p>
     */
    private SigningConfiguration signingConfiguration;
    /**
     * <p>
     * The format of the target platform's signing image.
     * </p>
     */
    private SigningImageFormat signingImageFormat;
    /**
     * <p>
     * The maximum size (in MB) of the payload that can be signed by the target platform.
     * </p>
     */
    private Integer maxSizeInMB;

    /**
     * <p>
     * The ID of the target signing platform.
     * </p>
     * 
     * @param platformId
     *        The ID of the target signing platform.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The ID of the target signing platform.
     * </p>
     * 
     * @return The ID of the target signing platform.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The ID of the target signing platform.
     * </p>
     * 
     * @param platformId
     *        The ID of the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * The display name of the target signing platform.
     * </p>
     * 
     * @param displayName
     *        The display name of the target signing platform.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the target signing platform.
     * </p>
     * 
     * @return The display name of the target signing platform.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the target signing platform.
     * </p>
     * 
     * @param displayName
     *        The display name of the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A list of partner entities that use the target signing platform.
     * </p>
     * 
     * @param partner
     *        A list of partner entities that use the target signing platform.
     */

    public void setPartner(String partner) {
        this.partner = partner;
    }

    /**
     * <p>
     * A list of partner entities that use the target signing platform.
     * </p>
     * 
     * @return A list of partner entities that use the target signing platform.
     */

    public String getPartner() {
        return this.partner;
    }

    /**
     * <p>
     * A list of partner entities that use the target signing platform.
     * </p>
     * 
     * @param partner
     *        A list of partner entities that use the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withPartner(String partner) {
        setPartner(partner);
        return this;
    }

    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     * 
     * @param target
     *        The validation template that is used by the target signing platform.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     * 
     * @return The validation template that is used by the target signing platform.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The validation template that is used by the target signing platform.
     * </p>
     * 
     * @param target
     *        The validation template that is used by the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The category type of the target signing platform.
     * </p>
     * 
     * @param category
     *        The category type of the target signing platform.
     * @see Category
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category type of the target signing platform.
     * </p>
     * 
     * @return The category type of the target signing platform.
     * @see Category
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category type of the target signing platform.
     * </p>
     * 
     * @param category
     *        The category type of the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public GetSigningPlatformResult withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category type of the target signing platform.
     * </p>
     * 
     * @param category
     *        The category type of the target signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public GetSigningPlatformResult withCategory(Category category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * A list of configurations applied to the target platform at signing.
     * </p>
     * 
     * @param signingConfiguration
     *        A list of configurations applied to the target platform at signing.
     */

    public void setSigningConfiguration(SigningConfiguration signingConfiguration) {
        this.signingConfiguration = signingConfiguration;
    }

    /**
     * <p>
     * A list of configurations applied to the target platform at signing.
     * </p>
     * 
     * @return A list of configurations applied to the target platform at signing.
     */

    public SigningConfiguration getSigningConfiguration() {
        return this.signingConfiguration;
    }

    /**
     * <p>
     * A list of configurations applied to the target platform at signing.
     * </p>
     * 
     * @param signingConfiguration
     *        A list of configurations applied to the target platform at signing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withSigningConfiguration(SigningConfiguration signingConfiguration) {
        setSigningConfiguration(signingConfiguration);
        return this;
    }

    /**
     * <p>
     * The format of the target platform's signing image.
     * </p>
     * 
     * @param signingImageFormat
     *        The format of the target platform's signing image.
     */

    public void setSigningImageFormat(SigningImageFormat signingImageFormat) {
        this.signingImageFormat = signingImageFormat;
    }

    /**
     * <p>
     * The format of the target platform's signing image.
     * </p>
     * 
     * @return The format of the target platform's signing image.
     */

    public SigningImageFormat getSigningImageFormat() {
        return this.signingImageFormat;
    }

    /**
     * <p>
     * The format of the target platform's signing image.
     * </p>
     * 
     * @param signingImageFormat
     *        The format of the target platform's signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withSigningImageFormat(SigningImageFormat signingImageFormat) {
        setSigningImageFormat(signingImageFormat);
        return this;
    }

    /**
     * <p>
     * The maximum size (in MB) of the payload that can be signed by the target platform.
     * </p>
     * 
     * @param maxSizeInMB
     *        The maximum size (in MB) of the payload that can be signed by the target platform.
     */

    public void setMaxSizeInMB(Integer maxSizeInMB) {
        this.maxSizeInMB = maxSizeInMB;
    }

    /**
     * <p>
     * The maximum size (in MB) of the payload that can be signed by the target platform.
     * </p>
     * 
     * @return The maximum size (in MB) of the payload that can be signed by the target platform.
     */

    public Integer getMaxSizeInMB() {
        return this.maxSizeInMB;
    }

    /**
     * <p>
     * The maximum size (in MB) of the payload that can be signed by the target platform.
     * </p>
     * 
     * @param maxSizeInMB
     *        The maximum size (in MB) of the payload that can be signed by the target platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningPlatformResult withMaxSizeInMB(Integer maxSizeInMB) {
        setMaxSizeInMB(maxSizeInMB);
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
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getPartner() != null)
            sb.append("Partner: ").append(getPartner()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getSigningConfiguration() != null)
            sb.append("SigningConfiguration: ").append(getSigningConfiguration()).append(",");
        if (getSigningImageFormat() != null)
            sb.append("SigningImageFormat: ").append(getSigningImageFormat()).append(",");
        if (getMaxSizeInMB() != null)
            sb.append("MaxSizeInMB: ").append(getMaxSizeInMB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSigningPlatformResult == false)
            return false;
        GetSigningPlatformResult other = (GetSigningPlatformResult) obj;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getPartner() == null ^ this.getPartner() == null)
            return false;
        if (other.getPartner() != null && other.getPartner().equals(this.getPartner()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getSigningConfiguration() == null ^ this.getSigningConfiguration() == null)
            return false;
        if (other.getSigningConfiguration() != null && other.getSigningConfiguration().equals(this.getSigningConfiguration()) == false)
            return false;
        if (other.getSigningImageFormat() == null ^ this.getSigningImageFormat() == null)
            return false;
        if (other.getSigningImageFormat() != null && other.getSigningImageFormat().equals(this.getSigningImageFormat()) == false)
            return false;
        if (other.getMaxSizeInMB() == null ^ this.getMaxSizeInMB() == null)
            return false;
        if (other.getMaxSizeInMB() != null && other.getMaxSizeInMB().equals(this.getMaxSizeInMB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPartner() == null) ? 0 : getPartner().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSigningConfiguration() == null) ? 0 : getSigningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSigningImageFormat() == null) ? 0 : getSigningImageFormat().hashCode());
        hashCode = prime * hashCode + ((getMaxSizeInMB() == null) ? 0 : getMaxSizeInMB().hashCode());
        return hashCode;
    }

    @Override
    public GetSigningPlatformResult clone() {
        try {
            return (GetSigningPlatformResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
