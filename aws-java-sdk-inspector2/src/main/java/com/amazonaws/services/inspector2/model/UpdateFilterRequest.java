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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     */
    private String action;
    /**
     * <p>
     * A description of the filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the filter to update.
     * </p>
     */
    private String filterArn;
    /**
     * <p>
     * Defines the criteria to be update in the filter.
     * </p>
     */
    private FilterCriteria filterCriteria;
    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The reason the filter was updated.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @return Specifies the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public UpdateFilterRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public UpdateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @param description
     *        A description of the filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @return A description of the filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @param description
     *        A description of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the filter to update.
     * </p>
     * 
     * @param filterArn
     *        The Amazon Resource Number (ARN) of the filter to update.
     */

    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the filter to update.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the filter to update.
     */

    public String getFilterArn() {
        return this.filterArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the filter to update.
     * </p>
     * 
     * @param filterArn
     *        The Amazon Resource Number (ARN) of the filter to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withFilterArn(String filterArn) {
        setFilterArn(filterArn);
        return this;
    }

    /**
     * <p>
     * Defines the criteria to be update in the filter.
     * </p>
     * 
     * @param filterCriteria
     *        Defines the criteria to be update in the filter.
     */

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * Defines the criteria to be update in the filter.
     * </p>
     * 
     * @return Defines the criteria to be update in the filter.
     */

    public FilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * Defines the criteria to be update in the filter.
     * </p>
     * 
     * @param filterCriteria
     *        Defines the criteria to be update in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withFilterCriteria(FilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The reason the filter was updated.
     * </p>
     * 
     * @param reason
     *        The reason the filter was updated.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason the filter was updated.
     * </p>
     * 
     * @return The reason the filter was updated.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason the filter was updated.
     * </p>
     * 
     * @param reason
     *        The reason the filter was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withReason(String reason) {
        setReason(reason);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFilterArn() != null)
            sb.append("FilterArn: ").append(getFilterArn()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFilterRequest == false)
            return false;
        UpdateFilterRequest other = (UpdateFilterRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null)
            return false;
        if (other.getFilterArn() != null && other.getFilterArn().equals(this.getFilterArn()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFilterRequest clone() {
        return (UpdateFilterRequest) super.clone();
    }

}
