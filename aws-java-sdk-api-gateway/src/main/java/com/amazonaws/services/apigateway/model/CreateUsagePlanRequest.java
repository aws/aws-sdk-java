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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the
 * associated API stages, specified in the payload.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsagePlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the usage plan.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     */
    private java.util.List<ApiStage> apiStages;
    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     */
    private ThrottleSettings throttle;
    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     */
    private QuotaSettings quota;

    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     * 
     * @param name
     *        [Required] The name of the usage plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     * 
     * @return [Required] The name of the usage plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * [Required] The name of the usage plan.
     * </p>
     * 
     * @param name
     *        [Required] The name of the usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     * 
     * @param description
     *        The description of the usage plan.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     * 
     * @return The description of the usage plan.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the usage plan.
     * </p>
     * 
     * @param description
     *        The description of the usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     * 
     * @return The associated API stages of the usage plan.
     */

    public java.util.List<ApiStage> getApiStages() {
        return apiStages;
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     * 
     * @param apiStages
     *        The associated API stages of the usage plan.
     */

    public void setApiStages(java.util.Collection<ApiStage> apiStages) {
        if (apiStages == null) {
            this.apiStages = null;
            return;
        }

        this.apiStages = new java.util.ArrayList<ApiStage>(apiStages);
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApiStages(java.util.Collection)} or {@link #withApiStages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param apiStages
     *        The associated API stages of the usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanRequest withApiStages(ApiStage... apiStages) {
        if (this.apiStages == null) {
            setApiStages(new java.util.ArrayList<ApiStage>(apiStages.length));
        }
        for (ApiStage ele : apiStages) {
            this.apiStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associated API stages of the usage plan.
     * </p>
     * 
     * @param apiStages
     *        The associated API stages of the usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanRequest withApiStages(java.util.Collection<ApiStage> apiStages) {
        setApiStages(apiStages);
        return this;
    }

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     * 
     * @param throttle
     *        The throttling limits of the usage plan.
     */

    public void setThrottle(ThrottleSettings throttle) {
        this.throttle = throttle;
    }

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     * 
     * @return The throttling limits of the usage plan.
     */

    public ThrottleSettings getThrottle() {
        return this.throttle;
    }

    /**
     * <p>
     * The throttling limits of the usage plan.
     * </p>
     * 
     * @param throttle
     *        The throttling limits of the usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanRequest withThrottle(ThrottleSettings throttle) {
        setThrottle(throttle);
        return this;
    }

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     * 
     * @param quota
     *        The quota of the usage plan.
     */

    public void setQuota(QuotaSettings quota) {
        this.quota = quota;
    }

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     * 
     * @return The quota of the usage plan.
     */

    public QuotaSettings getQuota() {
        return this.quota;
    }

    /**
     * <p>
     * The quota of the usage plan.
     * </p>
     * 
     * @param quota
     *        The quota of the usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanRequest withQuota(QuotaSettings quota) {
        setQuota(quota);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getApiStages() != null)
            sb.append("ApiStages: ").append(getApiStages()).append(",");
        if (getThrottle() != null)
            sb.append("Throttle: ").append(getThrottle()).append(",");
        if (getQuota() != null)
            sb.append("Quota: ").append(getQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUsagePlanRequest == false)
            return false;
        CreateUsagePlanRequest other = (CreateUsagePlanRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApiStages() == null ^ this.getApiStages() == null)
            return false;
        if (other.getApiStages() != null && other.getApiStages().equals(this.getApiStages()) == false)
            return false;
        if (other.getThrottle() == null ^ this.getThrottle() == null)
            return false;
        if (other.getThrottle() != null && other.getThrottle().equals(this.getThrottle()) == false)
            return false;
        if (other.getQuota() == null ^ this.getQuota() == null)
            return false;
        if (other.getQuota() != null && other.getQuota().equals(this.getQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApiStages() == null) ? 0 : getApiStages().hashCode());
        hashCode = prime * hashCode + ((getThrottle() == null) ? 0 : getThrottle().hashCode());
        hashCode = prime * hashCode + ((getQuota() == null) ? 0 : getQuota().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsagePlanRequest clone() {
        return (CreateUsagePlanRequest) super.clone();
    }

}
