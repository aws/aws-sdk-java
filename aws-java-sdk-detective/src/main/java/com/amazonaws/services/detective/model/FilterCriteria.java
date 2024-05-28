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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on the criteria used to define the filter for investigation results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/FilterCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter the investigation results based on the severity.
     * </p>
     */
    private StringFilter severity;
    /**
     * <p>
     * Filter the investigation results based on the status.
     * </p>
     */
    private StringFilter status;
    /**
     * <p>
     * Filter the investigation results based on the state.
     * </p>
     */
    private StringFilter state;
    /**
     * <p>
     * Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private StringFilter entityArn;
    /**
     * <p>
     * Filter the investigation results based on when the investigation was created.
     * </p>
     */
    private DateFilter createdTime;

    /**
     * <p>
     * Filter the investigation results based on the severity.
     * </p>
     * 
     * @param severity
     *        Filter the investigation results based on the severity.
     */

    public void setSeverity(StringFilter severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Filter the investigation results based on the severity.
     * </p>
     * 
     * @return Filter the investigation results based on the severity.
     */

    public StringFilter getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Filter the investigation results based on the severity.
     * </p>
     * 
     * @param severity
     *        Filter the investigation results based on the severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withSeverity(StringFilter severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Filter the investigation results based on the status.
     * </p>
     * 
     * @param status
     *        Filter the investigation results based on the status.
     */

    public void setStatus(StringFilter status) {
        this.status = status;
    }

    /**
     * <p>
     * Filter the investigation results based on the status.
     * </p>
     * 
     * @return Filter the investigation results based on the status.
     */

    public StringFilter getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filter the investigation results based on the status.
     * </p>
     * 
     * @param status
     *        Filter the investigation results based on the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withStatus(StringFilter status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Filter the investigation results based on the state.
     * </p>
     * 
     * @param state
     *        Filter the investigation results based on the state.
     */

    public void setState(StringFilter state) {
        this.state = state;
    }

    /**
     * <p>
     * Filter the investigation results based on the state.
     * </p>
     * 
     * @return Filter the investigation results based on the state.
     */

    public StringFilter getState() {
        return this.state;
    }

    /**
     * <p>
     * Filter the investigation results based on the state.
     * </p>
     * 
     * @param state
     *        Filter the investigation results based on the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withState(StringFilter state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param entityArn
     *        Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     */

    public void setEntityArn(StringFilter entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     */

    public StringFilter getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param entityArn
     *        Filter the investigation results based on the Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEntityArn(StringFilter entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * Filter the investigation results based on when the investigation was created.
     * </p>
     * 
     * @param createdTime
     *        Filter the investigation results based on when the investigation was created.
     */

    public void setCreatedTime(DateFilter createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Filter the investigation results based on when the investigation was created.
     * </p>
     * 
     * @return Filter the investigation results based on when the investigation was created.
     */

    public DateFilter getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Filter the investigation results based on when the investigation was created.
     * </p>
     * 
     * @param createdTime
     *        Filter the investigation results based on when the investigation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withCreatedTime(DateFilter createdTime) {
        setCreatedTime(createdTime);
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
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCriteria == false)
            return false;
        FilterCriteria other = (FilterCriteria) obj;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public FilterCriteria clone() {
        try {
            return (FilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.FilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
