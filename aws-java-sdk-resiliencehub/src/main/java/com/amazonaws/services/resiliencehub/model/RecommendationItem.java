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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RecommendationItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     */
    private Boolean alreadyImplemented;
    /**
     * <p>
     * The resource identifier.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The target account identifier.
     * </p>
     */
    private String targetAccountId;
    /**
     * <p>
     * The target region.
     * </p>
     */
    private String targetRegion;

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @param alreadyImplemented
     *        Specifies if the recommendation has already been implemented.
     */

    public void setAlreadyImplemented(Boolean alreadyImplemented) {
        this.alreadyImplemented = alreadyImplemented;
    }

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @return Specifies if the recommendation has already been implemented.
     */

    public Boolean getAlreadyImplemented() {
        return this.alreadyImplemented;
    }

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @param alreadyImplemented
     *        Specifies if the recommendation has already been implemented.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withAlreadyImplemented(Boolean alreadyImplemented) {
        setAlreadyImplemented(alreadyImplemented);
        return this;
    }

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @return Specifies if the recommendation has already been implemented.
     */

    public Boolean isAlreadyImplemented() {
        return this.alreadyImplemented;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * 
     * @param resourceId
     *        The resource identifier.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * 
     * @return The resource identifier.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * 
     * @param resourceId
     *        The resource identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The target account identifier.
     * </p>
     * 
     * @param targetAccountId
     *        The target account identifier.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The target account identifier.
     * </p>
     * 
     * @return The target account identifier.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * The target account identifier.
     * </p>
     * 
     * @param targetAccountId
     *        The target account identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
        return this;
    }

    /**
     * <p>
     * The target region.
     * </p>
     * 
     * @param targetRegion
     *        The target region.
     */

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * <p>
     * The target region.
     * </p>
     * 
     * @return The target region.
     */

    public String getTargetRegion() {
        return this.targetRegion;
    }

    /**
     * <p>
     * The target region.
     * </p>
     * 
     * @param targetRegion
     *        The target region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withTargetRegion(String targetRegion) {
        setTargetRegion(targetRegion);
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
        if (getAlreadyImplemented() != null)
            sb.append("AlreadyImplemented: ").append(getAlreadyImplemented()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: ").append(getTargetAccountId()).append(",");
        if (getTargetRegion() != null)
            sb.append("TargetRegion: ").append(getTargetRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationItem == false)
            return false;
        RecommendationItem other = (RecommendationItem) obj;
        if (other.getAlreadyImplemented() == null ^ this.getAlreadyImplemented() == null)
            return false;
        if (other.getAlreadyImplemented() != null && other.getAlreadyImplemented().equals(this.getAlreadyImplemented()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        if (other.getTargetRegion() == null ^ this.getTargetRegion() == null)
            return false;
        if (other.getTargetRegion() != null && other.getTargetRegion().equals(this.getTargetRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlreadyImplemented() == null) ? 0 : getAlreadyImplemented().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        hashCode = prime * hashCode + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationItem clone() {
        try {
            return (RecommendationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.RecommendationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
