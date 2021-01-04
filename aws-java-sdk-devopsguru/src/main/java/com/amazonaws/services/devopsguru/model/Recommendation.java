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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Recommendation information to help you remediate detected anomalous behavior that generated an insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the problem.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A hyperlink to information to help you address the problem.
     * </p>
     */
    private String link;
    /**
     * <p>
     * The name of the recommendation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The reason DevOps Guru flagged the anomalous behavior as a problem.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Events that are related to the problem. Use these events to learn more about what's happening and to help address
     * the issue.
     * </p>
     */
    private java.util.List<RecommendationRelatedEvent> relatedEvents;
    /**
     * <p>
     * Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to help
     * address the issue.
     * </p>
     */
    private java.util.List<RecommendationRelatedAnomaly> relatedAnomalies;

    /**
     * <p>
     * A description of the problem.
     * </p>
     * 
     * @param description
     *        A description of the problem.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the problem.
     * </p>
     * 
     * @return A description of the problem.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the problem.
     * </p>
     * 
     * @param description
     *        A description of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A hyperlink to information to help you address the problem.
     * </p>
     * 
     * @param link
     *        A hyperlink to information to help you address the problem.
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * <p>
     * A hyperlink to information to help you address the problem.
     * </p>
     * 
     * @return A hyperlink to information to help you address the problem.
     */

    public String getLink() {
        return this.link;
    }

    /**
     * <p>
     * A hyperlink to information to help you address the problem.
     * </p>
     * 
     * @param link
     *        A hyperlink to information to help you address the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withLink(String link) {
        setLink(link);
        return this;
    }

    /**
     * <p>
     * The name of the recommendation.
     * </p>
     * 
     * @param name
     *        The name of the recommendation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recommendation.
     * </p>
     * 
     * @return The name of the recommendation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recommendation.
     * </p>
     * 
     * @param name
     *        The name of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The reason DevOps Guru flagged the anomalous behavior as a problem.
     * </p>
     * 
     * @param reason
     *        The reason DevOps Guru flagged the anomalous behavior as a problem.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason DevOps Guru flagged the anomalous behavior as a problem.
     * </p>
     * 
     * @return The reason DevOps Guru flagged the anomalous behavior as a problem.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason DevOps Guru flagged the anomalous behavior as a problem.
     * </p>
     * 
     * @param reason
     *        The reason DevOps Guru flagged the anomalous behavior as a problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Events that are related to the problem. Use these events to learn more about what's happening and to help address
     * the issue.
     * </p>
     * 
     * @return Events that are related to the problem. Use these events to learn more about what's happening and to help
     *         address the issue.
     */

    public java.util.List<RecommendationRelatedEvent> getRelatedEvents() {
        return relatedEvents;
    }

    /**
     * <p>
     * Events that are related to the problem. Use these events to learn more about what's happening and to help address
     * the issue.
     * </p>
     * 
     * @param relatedEvents
     *        Events that are related to the problem. Use these events to learn more about what's happening and to help
     *        address the issue.
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
     * Events that are related to the problem. Use these events to learn more about what's happening and to help address
     * the issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedEvents(java.util.Collection)} or {@link #withRelatedEvents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relatedEvents
     *        Events that are related to the problem. Use these events to learn more about what's happening and to help
     *        address the issue.
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
     * <p>
     * Events that are related to the problem. Use these events to learn more about what's happening and to help address
     * the issue.
     * </p>
     * 
     * @param relatedEvents
     *        Events that are related to the problem. Use these events to learn more about what's happening and to help
     *        address the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRelatedEvents(java.util.Collection<RecommendationRelatedEvent> relatedEvents) {
        setRelatedEvents(relatedEvents);
        return this;
    }

    /**
     * <p>
     * Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to help
     * address the issue.
     * </p>
     * 
     * @return Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and
     *         to help address the issue.
     */

    public java.util.List<RecommendationRelatedAnomaly> getRelatedAnomalies() {
        return relatedAnomalies;
    }

    /**
     * <p>
     * Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to help
     * address the issue.
     * </p>
     * 
     * @param relatedAnomalies
     *        Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to
     *        help address the issue.
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
     * Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to help
     * address the issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedAnomalies(java.util.Collection)} or {@link #withRelatedAnomalies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedAnomalies
     *        Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to
     *        help address the issue.
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
     * <p>
     * Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to help
     * address the issue.
     * </p>
     * 
     * @param relatedAnomalies
     *        Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to
     *        help address the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRelatedAnomalies(java.util.Collection<RecommendationRelatedAnomaly> relatedAnomalies) {
        setRelatedAnomalies(relatedAnomalies);
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
        if (getRelatedEvents() != null)
            sb.append("RelatedEvents: ").append(getRelatedEvents()).append(",");
        if (getRelatedAnomalies() != null)
            sb.append("RelatedAnomalies: ").append(getRelatedAnomalies());
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
        if (other.getRelatedEvents() == null ^ this.getRelatedEvents() == null)
            return false;
        if (other.getRelatedEvents() != null && other.getRelatedEvents().equals(this.getRelatedEvents()) == false)
            return false;
        if (other.getRelatedAnomalies() == null ^ this.getRelatedAnomalies() == null)
            return false;
        if (other.getRelatedAnomalies() != null && other.getRelatedAnomalies().equals(this.getRelatedAnomalies()) == false)
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
        hashCode = prime * hashCode + ((getRelatedEvents() == null) ? 0 : getRelatedEvents().hashCode());
        hashCode = prime * hashCode + ((getRelatedAnomalies() == null) ? 0 : getRelatedAnomalies().hashCode());
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
