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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the operational recommendation item that needs a status update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateRecommendationStatusItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecommendationStatusItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Resource identifier of the operational recommendation item.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Identifier of the target Amazon Web Services account.
     * </p>
     */
    private String targetAccountId;
    /**
     * <p>
     * Identifier of the target Amazon Web Services Region.
     * </p>
     */
    private String targetRegion;

    /**
     * <p>
     * Resource identifier of the operational recommendation item.
     * </p>
     * 
     * @param resourceId
     *        Resource identifier of the operational recommendation item.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Resource identifier of the operational recommendation item.
     * </p>
     * 
     * @return Resource identifier of the operational recommendation item.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Resource identifier of the operational recommendation item.
     * </p>
     * 
     * @param resourceId
     *        Resource identifier of the operational recommendation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationStatusItem withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Identifier of the target Amazon Web Services account.
     * </p>
     * 
     * @param targetAccountId
     *        Identifier of the target Amazon Web Services account.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * Identifier of the target Amazon Web Services account.
     * </p>
     * 
     * @return Identifier of the target Amazon Web Services account.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * Identifier of the target Amazon Web Services account.
     * </p>
     * 
     * @param targetAccountId
     *        Identifier of the target Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationStatusItem withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
        return this;
    }

    /**
     * <p>
     * Identifier of the target Amazon Web Services Region.
     * </p>
     * 
     * @param targetRegion
     *        Identifier of the target Amazon Web Services Region.
     */

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * <p>
     * Identifier of the target Amazon Web Services Region.
     * </p>
     * 
     * @return Identifier of the target Amazon Web Services Region.
     */

    public String getTargetRegion() {
        return this.targetRegion;
    }

    /**
     * <p>
     * Identifier of the target Amazon Web Services Region.
     * </p>
     * 
     * @param targetRegion
     *        Identifier of the target Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationStatusItem withTargetRegion(String targetRegion) {
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

        if (obj instanceof UpdateRecommendationStatusItem == false)
            return false;
        UpdateRecommendationStatusItem other = (UpdateRecommendationStatusItem) obj;
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        hashCode = prime * hashCode + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecommendationStatusItem clone() {
        try {
            return (UpdateRecommendationStatusItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.UpdateRecommendationStatusItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
