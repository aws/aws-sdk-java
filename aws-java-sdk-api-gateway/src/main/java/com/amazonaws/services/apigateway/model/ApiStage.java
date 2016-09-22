/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * API stage name of the associated API stage in a usage plan.
 * </p>
 */
public class ApiStage implements Serializable, Cloneable {

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     * 
     * @param apiId
     *        API Id of the associated API stage in a usage plan.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     * 
     * @return API Id of the associated API stage in a usage plan.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     * 
     * @param apiId
     *        API Id of the associated API stage in a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiStage withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     * 
     * @param stage
     *        API stage name of the associated API stage in a usage plan.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     * 
     * @return API stage name of the associated API stage in a usage plan.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     * 
     * @param stage
     *        API stage name of the associated API stage in a usage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiStage withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getStage() != null)
            sb.append("Stage: " + getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiStage == false)
            return false;
        ApiStage other = (ApiStage) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public ApiStage clone() {
        try {
            return (ApiStage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
