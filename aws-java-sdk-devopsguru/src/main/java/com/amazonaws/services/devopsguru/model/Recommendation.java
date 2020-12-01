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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    private String description;

    private String link;

    private String name;

    private String reason;

    private java.util.List<RecommendationRelatedAnomaly> relatedAnomalies;

    private java.util.List<RecommendationRelatedEvent> relatedEvents;

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param link
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return
     */

    public String getLink() {
        return this.link;
    }

    /**
     * @param link
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withLink(String link) {
        setLink(link);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param reason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<RecommendationRelatedAnomaly> getRelatedAnomalies() {
        return relatedAnomalies;
    }

    /**
     * @param relatedAnomalies
     */

    public void setRelatedAnomalies(java.util.Collection<RecommendationRelatedAnomaly> relatedAnomalies) {
        if (relatedAnomalies == null) {
            this.relatedAnomalies = null;
            return;
        }

        this.relatedAnomalies = new java.util.ArrayList<RecommendationRelatedAnomaly>(relatedAnomalies);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedAnomalies(java.util.Collection)} or {@link #withRelatedAnomalies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedAnomalies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRelatedAnomalies(RecommendationRelatedAnomaly... relatedAnomalies) {
        if (this.relatedAnomalies == null) {
            setRelatedAnomalies(new java.util.ArrayList<RecommendationRelatedAnomaly>(relatedAnomalies.length));
        }
        for (RecommendationRelatedAnomaly ele : relatedAnomalies) {
            this.relatedAnomalies.add(ele);
        }
        return this;
    }

    /**
     * @param relatedAnomalies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRelatedAnomalies(java.util.Collection<RecommendationRelatedAnomaly> relatedAnomalies) {
        setRelatedAnomalies(relatedAnomalies);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<RecommendationRelatedEvent> getRelatedEvents() {
        return relatedEvents;
    }

    /**
     * @param relatedEvents
     */

    public void setRelatedEvents(java.util.Collection<RecommendationRelatedEvent> relatedEvents) {
        if (relatedEvents == null) {
            this.relatedEvents = null;
            return;
        }

        this.relatedEvents = new java.util.ArrayList<RecommendationRelatedEvent>(relatedEvents);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedEvents(java.util.Collection)} or {@link #withRelatedEvents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relatedEvents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRelatedEvents(RecommendationRelatedEvent... relatedEvents) {
        if (this.relatedEvents == null) {
            setRelatedEvents(new java.util.ArrayList<RecommendationRelatedEvent>(relatedEvents.length));
        }
        for (RecommendationRelatedEvent ele : relatedEvents) {
            this.relatedEvents.add(ele);
        }
        return this;
    }

    /**
     * @param relatedEvents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRelatedEvents(java.util.Collection<RecommendationRelatedEvent> relatedEvents) {
        setRelatedEvents(relatedEvents);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLink() != null)
            sb.append("Link: ").append(getLink()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getRelatedAnomalies() != null)
            sb.append("RelatedAnomalies: ").append(getRelatedAnomalies()).append(",");
        if (getRelatedEvents() != null)
            sb.append("RelatedEvents: ").append(getRelatedEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLink() == null ^ this.getLink() == null)
            return false;
        if (other.getLink() != null && other.getLink().equals(this.getLink()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getRelatedAnomalies() == null ^ this.getRelatedAnomalies() == null)
            return false;
        if (other.getRelatedAnomalies() != null && other.getRelatedAnomalies().equals(this.getRelatedAnomalies()) == false)
            return false;
        if (other.getRelatedEvents() == null ^ this.getRelatedEvents() == null)
            return false;
        if (other.getRelatedEvents() != null && other.getRelatedEvents().equals(this.getRelatedEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLink() == null) ? 0 : getLink().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getRelatedAnomalies() == null) ? 0 : getRelatedAnomalies().hashCode());
        hashCode = prime * hashCode + ((getRelatedEvents() == null) ? 0 : getRelatedEvents().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
