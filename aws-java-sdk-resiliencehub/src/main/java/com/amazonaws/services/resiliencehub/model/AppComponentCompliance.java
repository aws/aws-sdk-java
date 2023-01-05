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
 * Defines the compliance of an application component against the resiliency policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppComponentCompliance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppComponentCompliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application component.
     * </p>
     */
    private String appComponentName;
    /**
     * <p>
     * The compliance of the application component against the resiliency policy.
     * </p>
     */
    private java.util.Map<String, DisruptionCompliance> compliance;
    /**
     * <p>
     * The cost for the application.
     * </p>
     */
    private Cost cost;
    /**
     * <p>
     * The compliance message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     */
    private ResiliencyScore resiliencyScore;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @param appComponentName
     *        The name of the application component.
     */

    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @return The name of the application component.
     */

    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @param appComponentName
     *        The name of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * The compliance of the application component against the resiliency policy.
     * </p>
     * 
     * @return The compliance of the application component against the resiliency policy.
     */

    public java.util.Map<String, DisruptionCompliance> getCompliance() {
        return compliance;
    }

    /**
     * <p>
     * The compliance of the application component against the resiliency policy.
     * </p>
     * 
     * @param compliance
     *        The compliance of the application component against the resiliency policy.
     */

    public void setCompliance(java.util.Map<String, DisruptionCompliance> compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * The compliance of the application component against the resiliency policy.
     * </p>
     * 
     * @param compliance
     *        The compliance of the application component against the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance withCompliance(java.util.Map<String, DisruptionCompliance> compliance) {
        setCompliance(compliance);
        return this;
    }

    /**
     * Add a single Compliance entry
     *
     * @see AppComponentCompliance#withCompliance
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance addComplianceEntry(String key, DisruptionCompliance value) {
        if (null == this.compliance) {
            this.compliance = new java.util.HashMap<String, DisruptionCompliance>();
        }
        if (this.compliance.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.compliance.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Compliance.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance clearComplianceEntries() {
        this.compliance = null;
        return this;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     */

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @return The cost for the application.
     */

    public Cost getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance withCost(Cost cost) {
        setCost(cost);
        return this;
    }

    /**
     * <p>
     * The compliance message.
     * </p>
     * 
     * @param message
     *        The compliance message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The compliance message.
     * </p>
     * 
     * @return The compliance message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The compliance message.
     * </p>
     * 
     * @param message
     *        The compliance message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        The current resiliency score for the application.
     */

    public void setResiliencyScore(ResiliencyScore resiliencyScore) {
        this.resiliencyScore = resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @return The current resiliency score for the application.
     */

    public ResiliencyScore getResiliencyScore() {
        return this.resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        The current resiliency score for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppComponentCompliance withResiliencyScore(ResiliencyScore resiliencyScore) {
        setResiliencyScore(resiliencyScore);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ComplianceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see ComplianceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppComponentCompliance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppComponentCompliance withStatus(ComplianceStatus status) {
        this.status = status.toString();
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
        if (getAppComponentName() != null)
            sb.append("AppComponentName: ").append(getAppComponentName()).append(",");
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResiliencyScore() != null)
            sb.append("ResiliencyScore: ").append(getResiliencyScore()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppComponentCompliance == false)
            return false;
        AppComponentCompliance other = (AppComponentCompliance) obj;
        if (other.getAppComponentName() == null ^ this.getAppComponentName() == null)
            return false;
        if (other.getAppComponentName() != null && other.getAppComponentName().equals(this.getAppComponentName()) == false)
            return false;
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResiliencyScore() == null ^ this.getResiliencyScore() == null)
            return false;
        if (other.getResiliencyScore() != null && other.getResiliencyScore().equals(this.getResiliencyScore()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppComponentName() == null) ? 0 : getAppComponentName().hashCode());
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResiliencyScore() == null) ? 0 : getResiliencyScore().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AppComponentCompliance clone() {
        try {
            return (AppComponentCompliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppComponentComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
