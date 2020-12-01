/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RecommendationRelatedAnomaly"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationRelatedAnomaly implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<RecommendationRelatedAnomalyResource> resources;

    private java.util.List<RecommendationRelatedAnomalySourceDetail> sourceDetails;

    /**
     * @return
     */

    public java.util.List<RecommendationRelatedAnomalyResource> getResources() {
        return resources;
    }

    /**
     * @param resources
     */

    public void setResources(java.util.Collection<RecommendationRelatedAnomalyResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<RecommendationRelatedAnomalyResource>(resources);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedAnomaly withResources(RecommendationRelatedAnomalyResource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<RecommendationRelatedAnomalyResource>(resources.length));
        }
        for (RecommendationRelatedAnomalyResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedAnomaly withResources(java.util.Collection<RecommendationRelatedAnomalyResource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<RecommendationRelatedAnomalySourceDetail> getSourceDetails() {
        return sourceDetails;
    }

    /**
     * @param sourceDetails
     */

    public void setSourceDetails(java.util.Collection<RecommendationRelatedAnomalySourceDetail> sourceDetails) {
        if (sourceDetails == null) {
            this.sourceDetails = null;
            return;
        }

        this.sourceDetails = new java.util.ArrayList<RecommendationRelatedAnomalySourceDetail>(sourceDetails);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDetails(java.util.Collection)} or {@link #withSourceDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedAnomaly withSourceDetails(RecommendationRelatedAnomalySourceDetail... sourceDetails) {
        if (this.sourceDetails == null) {
            setSourceDetails(new java.util.ArrayList<RecommendationRelatedAnomalySourceDetail>(sourceDetails.length));
        }
        for (RecommendationRelatedAnomalySourceDetail ele : sourceDetails) {
            this.sourceDetails.add(ele);
        }
        return this;
    }

    /**
     * @param sourceDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedAnomaly withSourceDetails(java.util.Collection<RecommendationRelatedAnomalySourceDetail> sourceDetails) {
        setSourceDetails(sourceDetails);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getSourceDetails() != null)
            sb.append("SourceDetails: ").append(getSourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationRelatedAnomaly == false)
            return false;
        RecommendationRelatedAnomaly other = (RecommendationRelatedAnomaly) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null)
            return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationRelatedAnomaly clone() {
        try {
            return (RecommendationRelatedAnomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.RecommendationRelatedAnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
