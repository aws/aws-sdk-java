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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of rules used to make a recommendation during an analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/Pattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Pattern implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the different counters used to determine if there is a match.
     * </p>
     */
    private java.util.List<String> countersToAggregate;
    /**
     * <p>
     * The description of the recommendation. This explains a potential inefficiency in a profiled application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The universally unique identifier (UUID) of this pattern.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name for this pattern.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A string that contains the steps recommended to address the potential inefficiency.
     * </p>
     */
    private String resolutionSteps;
    /**
     * <p>
     * A list of frame names that were searched during the analysis that generated a recommendation.
     * </p>
     */
    private java.util.List<java.util.List<String>> targetFrames;
    /**
     * <p>
     * The percentage of time an application spends in one method that triggers a recommendation. The percentage of time
     * is the same as the percentage of the total gathered sample counts during analysis.
     * </p>
     */
    private Double thresholdPercent;

    /**
     * <p>
     * A list of the different counters used to determine if there is a match.
     * </p>
     * 
     * @return A list of the different counters used to determine if there is a match.
     */

    public java.util.List<String> getCountersToAggregate() {
        return countersToAggregate;
    }

    /**
     * <p>
     * A list of the different counters used to determine if there is a match.
     * </p>
     * 
     * @param countersToAggregate
     *        A list of the different counters used to determine if there is a match.
     */

    public void setCountersToAggregate(java.util.Collection<String> countersToAggregate) {
        if (countersToAggregate == null) {
            this.countersToAggregate = null;
            return;
        }

        this.countersToAggregate = new java.util.ArrayList<String>(countersToAggregate);
    }

    /**
     * <p>
     * A list of the different counters used to determine if there is a match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCountersToAggregate(java.util.Collection)} or {@link #withCountersToAggregate(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param countersToAggregate
     *        A list of the different counters used to determine if there is a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withCountersToAggregate(String... countersToAggregate) {
        if (this.countersToAggregate == null) {
            setCountersToAggregate(new java.util.ArrayList<String>(countersToAggregate.length));
        }
        for (String ele : countersToAggregate) {
            this.countersToAggregate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the different counters used to determine if there is a match.
     * </p>
     * 
     * @param countersToAggregate
     *        A list of the different counters used to determine if there is a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withCountersToAggregate(java.util.Collection<String> countersToAggregate) {
        setCountersToAggregate(countersToAggregate);
        return this;
    }

    /**
     * <p>
     * The description of the recommendation. This explains a potential inefficiency in a profiled application.
     * </p>
     * 
     * @param description
     *        The description of the recommendation. This explains a potential inefficiency in a profiled application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the recommendation. This explains a potential inefficiency in a profiled application.
     * </p>
     * 
     * @return The description of the recommendation. This explains a potential inefficiency in a profiled application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the recommendation. This explains a potential inefficiency in a profiled application.
     * </p>
     * 
     * @param description
     *        The description of the recommendation. This explains a potential inefficiency in a profiled application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of this pattern.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of this pattern.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of this pattern.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of this pattern.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of this pattern.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of this pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name for this pattern.
     * </p>
     * 
     * @param name
     *        The name for this pattern.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for this pattern.
     * </p>
     * 
     * @return The name for this pattern.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for this pattern.
     * </p>
     * 
     * @param name
     *        The name for this pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A string that contains the steps recommended to address the potential inefficiency.
     * </p>
     * 
     * @param resolutionSteps
     *        A string that contains the steps recommended to address the potential inefficiency.
     */

    public void setResolutionSteps(String resolutionSteps) {
        this.resolutionSteps = resolutionSteps;
    }

    /**
     * <p>
     * A string that contains the steps recommended to address the potential inefficiency.
     * </p>
     * 
     * @return A string that contains the steps recommended to address the potential inefficiency.
     */

    public String getResolutionSteps() {
        return this.resolutionSteps;
    }

    /**
     * <p>
     * A string that contains the steps recommended to address the potential inefficiency.
     * </p>
     * 
     * @param resolutionSteps
     *        A string that contains the steps recommended to address the potential inefficiency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withResolutionSteps(String resolutionSteps) {
        setResolutionSteps(resolutionSteps);
        return this;
    }

    /**
     * <p>
     * A list of frame names that were searched during the analysis that generated a recommendation.
     * </p>
     * 
     * @return A list of frame names that were searched during the analysis that generated a recommendation.
     */

    public java.util.List<java.util.List<String>> getTargetFrames() {
        return targetFrames;
    }

    /**
     * <p>
     * A list of frame names that were searched during the analysis that generated a recommendation.
     * </p>
     * 
     * @param targetFrames
     *        A list of frame names that were searched during the analysis that generated a recommendation.
     */

    public void setTargetFrames(java.util.Collection<java.util.List<String>> targetFrames) {
        if (targetFrames == null) {
            this.targetFrames = null;
            return;
        }

        this.targetFrames = new java.util.ArrayList<java.util.List<String>>(targetFrames);
    }

    /**
     * <p>
     * A list of frame names that were searched during the analysis that generated a recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetFrames(java.util.Collection)} or {@link #withTargetFrames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetFrames
     *        A list of frame names that were searched during the analysis that generated a recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withTargetFrames(java.util.List<String>... targetFrames) {
        if (this.targetFrames == null) {
            setTargetFrames(new java.util.ArrayList<java.util.List<String>>(targetFrames.length));
        }
        for (java.util.List<String> ele : targetFrames) {
            this.targetFrames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of frame names that were searched during the analysis that generated a recommendation.
     * </p>
     * 
     * @param targetFrames
     *        A list of frame names that were searched during the analysis that generated a recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withTargetFrames(java.util.Collection<java.util.List<String>> targetFrames) {
        setTargetFrames(targetFrames);
        return this;
    }

    /**
     * <p>
     * The percentage of time an application spends in one method that triggers a recommendation. The percentage of time
     * is the same as the percentage of the total gathered sample counts during analysis.
     * </p>
     * 
     * @param thresholdPercent
     *        The percentage of time an application spends in one method that triggers a recommendation. The percentage
     *        of time is the same as the percentage of the total gathered sample counts during analysis.
     */

    public void setThresholdPercent(Double thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
    }

    /**
     * <p>
     * The percentage of time an application spends in one method that triggers a recommendation. The percentage of time
     * is the same as the percentage of the total gathered sample counts during analysis.
     * </p>
     * 
     * @return The percentage of time an application spends in one method that triggers a recommendation. The percentage
     *         of time is the same as the percentage of the total gathered sample counts during analysis.
     */

    public Double getThresholdPercent() {
        return this.thresholdPercent;
    }

    /**
     * <p>
     * The percentage of time an application spends in one method that triggers a recommendation. The percentage of time
     * is the same as the percentage of the total gathered sample counts during analysis.
     * </p>
     * 
     * @param thresholdPercent
     *        The percentage of time an application spends in one method that triggers a recommendation. The percentage
     *        of time is the same as the percentage of the total gathered sample counts during analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pattern withThresholdPercent(Double thresholdPercent) {
        setThresholdPercent(thresholdPercent);
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
        if (getCountersToAggregate() != null)
            sb.append("CountersToAggregate: ").append(getCountersToAggregate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResolutionSteps() != null)
            sb.append("ResolutionSteps: ").append(getResolutionSteps()).append(",");
        if (getTargetFrames() != null)
            sb.append("TargetFrames: ").append(getTargetFrames()).append(",");
        if (getThresholdPercent() != null)
            sb.append("ThresholdPercent: ").append(getThresholdPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Pattern == false)
            return false;
        Pattern other = (Pattern) obj;
        if (other.getCountersToAggregate() == null ^ this.getCountersToAggregate() == null)
            return false;
        if (other.getCountersToAggregate() != null && other.getCountersToAggregate().equals(this.getCountersToAggregate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResolutionSteps() == null ^ this.getResolutionSteps() == null)
            return false;
        if (other.getResolutionSteps() != null && other.getResolutionSteps().equals(this.getResolutionSteps()) == false)
            return false;
        if (other.getTargetFrames() == null ^ this.getTargetFrames() == null)
            return false;
        if (other.getTargetFrames() != null && other.getTargetFrames().equals(this.getTargetFrames()) == false)
            return false;
        if (other.getThresholdPercent() == null ^ this.getThresholdPercent() == null)
            return false;
        if (other.getThresholdPercent() != null && other.getThresholdPercent().equals(this.getThresholdPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountersToAggregate() == null) ? 0 : getCountersToAggregate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResolutionSteps() == null) ? 0 : getResolutionSteps().hashCode());
        hashCode = prime * hashCode + ((getTargetFrames() == null) ? 0 : getTargetFrames().hashCode());
        hashCode = prime * hashCode + ((getThresholdPercent() == null) ? 0 : getThresholdPercent().hashCode());
        return hashCode;
    }

    @Override
    public Pattern clone() {
        try {
            return (Pattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.PatternMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
