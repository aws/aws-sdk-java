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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateMapRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMapRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run.
     * </p>
     */
    private String mapRunArn;
    /**
     * <p>
     * The maximum number of child workflow executions that can be specified to run in parallel for the Map Run at the
     * same time.
     * </p>
     */
    private Integer maxConcurrency;
    /**
     * <p>
     * The maximum percentage of failed items before the Map Run fails.
     * </p>
     */
    private Float toleratedFailurePercentage;
    /**
     * <p>
     * The maximum number of failed items before the Map Run fails.
     * </p>
     */
    private Long toleratedFailureCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) of a Map Run.
     */

    public void setMapRunArn(String mapRunArn) {
        this.mapRunArn = mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Map Run.
     */

    public String getMapRunArn() {
        return this.mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Map Run.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) of a Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapRunRequest withMapRunArn(String mapRunArn) {
        setMapRunArn(mapRunArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of child workflow executions that can be specified to run in parallel for the Map Run at the
     * same time.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of child workflow executions that can be specified to run in parallel for the Map Run
     *        at the same time.
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of child workflow executions that can be specified to run in parallel for the Map Run at the
     * same time.
     * </p>
     * 
     * @return The maximum number of child workflow executions that can be specified to run in parallel for the Map Run
     *         at the same time.
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of child workflow executions that can be specified to run in parallel for the Map Run at the
     * same time.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of child workflow executions that can be specified to run in parallel for the Map Run
     *        at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapRunRequest withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum percentage of failed items before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailurePercentage
     *        The maximum percentage of failed items before the Map Run fails.
     */

    public void setToleratedFailurePercentage(Float toleratedFailurePercentage) {
        this.toleratedFailurePercentage = toleratedFailurePercentage;
    }

    /**
     * <p>
     * The maximum percentage of failed items before the Map Run fails.
     * </p>
     * 
     * @return The maximum percentage of failed items before the Map Run fails.
     */

    public Float getToleratedFailurePercentage() {
        return this.toleratedFailurePercentage;
    }

    /**
     * <p>
     * The maximum percentage of failed items before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailurePercentage
     *        The maximum percentage of failed items before the Map Run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapRunRequest withToleratedFailurePercentage(Float toleratedFailurePercentage) {
        setToleratedFailurePercentage(toleratedFailurePercentage);
        return this;
    }

    /**
     * <p>
     * The maximum number of failed items before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailureCount
     *        The maximum number of failed items before the Map Run fails.
     */

    public void setToleratedFailureCount(Long toleratedFailureCount) {
        this.toleratedFailureCount = toleratedFailureCount;
    }

    /**
     * <p>
     * The maximum number of failed items before the Map Run fails.
     * </p>
     * 
     * @return The maximum number of failed items before the Map Run fails.
     */

    public Long getToleratedFailureCount() {
        return this.toleratedFailureCount;
    }

    /**
     * <p>
     * The maximum number of failed items before the Map Run fails.
     * </p>
     * 
     * @param toleratedFailureCount
     *        The maximum number of failed items before the Map Run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapRunRequest withToleratedFailureCount(Long toleratedFailureCount) {
        setToleratedFailureCount(toleratedFailureCount);
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
        if (getMapRunArn() != null)
            sb.append("MapRunArn: ").append(getMapRunArn()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getToleratedFailurePercentage() != null)
            sb.append("ToleratedFailurePercentage: ").append(getToleratedFailurePercentage()).append(",");
        if (getToleratedFailureCount() != null)
            sb.append("ToleratedFailureCount: ").append(getToleratedFailureCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMapRunRequest == false)
            return false;
        UpdateMapRunRequest other = (UpdateMapRunRequest) obj;
        if (other.getMapRunArn() == null ^ this.getMapRunArn() == null)
            return false;
        if (other.getMapRunArn() != null && other.getMapRunArn().equals(this.getMapRunArn()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getToleratedFailurePercentage() == null ^ this.getToleratedFailurePercentage() == null)
            return false;
        if (other.getToleratedFailurePercentage() != null && other.getToleratedFailurePercentage().equals(this.getToleratedFailurePercentage()) == false)
            return false;
        if (other.getToleratedFailureCount() == null ^ this.getToleratedFailureCount() == null)
            return false;
        if (other.getToleratedFailureCount() != null && other.getToleratedFailureCount().equals(this.getToleratedFailureCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapRunArn() == null) ? 0 : getMapRunArn().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getToleratedFailurePercentage() == null) ? 0 : getToleratedFailurePercentage().hashCode());
        hashCode = prime * hashCode + ((getToleratedFailureCount() == null) ? 0 : getToleratedFailureCount().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMapRunRequest clone() {
        return (UpdateMapRunRequest) super.clone();
    }

}
