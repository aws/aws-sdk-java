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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This input determines which steps to list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSteps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stepStates;
    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stepIds;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     * 
     * @param clusterId
     *        The identifier of the cluster for which to list the steps.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     * 
     * @return The identifier of the cluster for which to list the steps.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     * 
     * @param clusterId
     *        The identifier of the cluster for which to list the steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepsRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * 
     * @return The filter to limit the step list based on certain states.
     * @see StepState
     */

    public java.util.List<String> getStepStates() {
        if (stepStates == null) {
            stepStates = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stepStates;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * 
     * @param stepStates
     *        The filter to limit the step list based on certain states.
     * @see StepState
     */

    public void setStepStates(java.util.Collection<String> stepStates) {
        if (stepStates == null) {
            this.stepStates = null;
            return;
        }

        this.stepStates = new com.amazonaws.internal.SdkInternalList<String>(stepStates);
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepStates(java.util.Collection)} or {@link #withStepStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepStates
     *        The filter to limit the step list based on certain states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepState
     */

    public ListStepsRequest withStepStates(String... stepStates) {
        if (this.stepStates == null) {
            setStepStates(new com.amazonaws.internal.SdkInternalList<String>(stepStates.length));
        }
        for (String ele : stepStates) {
            this.stepStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * 
     * @param stepStates
     *        The filter to limit the step list based on certain states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepState
     */

    public ListStepsRequest withStepStates(java.util.Collection<String> stepStates) {
        setStepStates(stepStates);
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * 
     * @param stepStates
     *        The filter to limit the step list based on certain states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepState
     */

    public ListStepsRequest withStepStates(StepState... stepStates) {
        com.amazonaws.internal.SdkInternalList<String> stepStatesCopy = new com.amazonaws.internal.SdkInternalList<String>(stepStates.length);
        for (StepState value : stepStates) {
            stepStatesCopy.add(value.toString());
        }
        if (getStepStates() == null) {
            setStepStates(stepStatesCopy);
        } else {
            getStepStates().addAll(stepStatesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * </p>
     * 
     * @return The filter to limit the step list based on the identifier of the steps.
     */

    public java.util.List<String> getStepIds() {
        if (stepIds == null) {
            stepIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stepIds;
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * </p>
     * 
     * @param stepIds
     *        The filter to limit the step list based on the identifier of the steps.
     */

    public void setStepIds(java.util.Collection<String> stepIds) {
        if (stepIds == null) {
            this.stepIds = null;
            return;
        }

        this.stepIds = new com.amazonaws.internal.SdkInternalList<String>(stepIds);
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepIds(java.util.Collection)} or {@link #withStepIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param stepIds
     *        The filter to limit the step list based on the identifier of the steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepsRequest withStepIds(String... stepIds) {
        if (this.stepIds == null) {
            setStepIds(new com.amazonaws.internal.SdkInternalList<String>(stepIds.length));
        }
        for (String ele : stepIds) {
            this.stepIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * </p>
     * 
     * @param stepIds
     *        The filter to limit the step list based on the identifier of the steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepsRequest withStepIds(java.util.Collection<String> stepIds) {
        setStepIds(stepIds);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStepsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getStepStates() != null)
            sb.append("StepStates: ").append(getStepStates()).append(",");
        if (getStepIds() != null)
            sb.append("StepIds: ").append(getStepIds()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStepsRequest == false)
            return false;
        ListStepsRequest other = (ListStepsRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepStates() == null ^ this.getStepStates() == null)
            return false;
        if (other.getStepStates() != null && other.getStepStates().equals(this.getStepStates()) == false)
            return false;
        if (other.getStepIds() == null ^ this.getStepIds() == null)
            return false;
        if (other.getStepIds() != null && other.getStepIds().equals(this.getStepIds()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getStepStates() == null) ? 0 : getStepStates().hashCode());
        hashCode = prime * hashCode + ((getStepIds() == null) ? 0 : getStepIds().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListStepsRequest clone() {
        return (ListStepsRequest) super.clone();
    }

}
