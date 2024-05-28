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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateActiveModelVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateActiveModelVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the machine learning model for which the active model version was set.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The version that is currently active of the machine learning model for which the active model version was set.
     * </p>
     */
    private Long currentActiveVersion;
    /**
     * <p>
     * The previous version that was active of the machine learning model for which the active model version was set.
     * </p>
     */
    private Long previousActiveVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that is the current active model version.
     * </p>
     */
    private String currentActiveVersionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model version.
     * </p>
     */
    private String previousActiveVersionArn;

    /**
     * <p>
     * The name of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model for which the active model version was set.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @return The name of the machine learning model for which the active model version was set.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param modelName
     *        The name of the machine learning model for which the active model version was set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActiveModelVersionResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the machine learning model for which the active model version was set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActiveModelVersionResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The version that is currently active of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param currentActiveVersion
     *        The version that is currently active of the machine learning model for which the active model version was
     *        set.
     */

    public void setCurrentActiveVersion(Long currentActiveVersion) {
        this.currentActiveVersion = currentActiveVersion;
    }

    /**
     * <p>
     * The version that is currently active of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @return The version that is currently active of the machine learning model for which the active model version was
     *         set.
     */

    public Long getCurrentActiveVersion() {
        return this.currentActiveVersion;
    }

    /**
     * <p>
     * The version that is currently active of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param currentActiveVersion
     *        The version that is currently active of the machine learning model for which the active model version was
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActiveModelVersionResult withCurrentActiveVersion(Long currentActiveVersion) {
        setCurrentActiveVersion(currentActiveVersion);
        return this;
    }

    /**
     * <p>
     * The previous version that was active of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param previousActiveVersion
     *        The previous version that was active of the machine learning model for which the active model version was
     *        set.
     */

    public void setPreviousActiveVersion(Long previousActiveVersion) {
        this.previousActiveVersion = previousActiveVersion;
    }

    /**
     * <p>
     * The previous version that was active of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @return The previous version that was active of the machine learning model for which the active model version was
     *         set.
     */

    public Long getPreviousActiveVersion() {
        return this.previousActiveVersion;
    }

    /**
     * <p>
     * The previous version that was active of the machine learning model for which the active model version was set.
     * </p>
     * 
     * @param previousActiveVersion
     *        The previous version that was active of the machine learning model for which the active model version was
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActiveModelVersionResult withPreviousActiveVersion(Long previousActiveVersion) {
        setPreviousActiveVersion(previousActiveVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that is the current active model version.
     * </p>
     * 
     * @param currentActiveVersionArn
     *        The Amazon Resource Name (ARN) of the machine learning model version that is the current active model
     *        version.
     */

    public void setCurrentActiveVersionArn(String currentActiveVersionArn) {
        this.currentActiveVersionArn = currentActiveVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that is the current active model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the machine learning model version that is the current active model
     *         version.
     */

    public String getCurrentActiveVersionArn() {
        return this.currentActiveVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that is the current active model version.
     * </p>
     * 
     * @param currentActiveVersionArn
     *        The Amazon Resource Name (ARN) of the machine learning model version that is the current active model
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActiveModelVersionResult withCurrentActiveVersionArn(String currentActiveVersionArn) {
        setCurrentActiveVersionArn(currentActiveVersionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model version.
     * </p>
     * 
     * @param previousActiveVersionArn
     *        The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model
     *        version.
     */

    public void setPreviousActiveVersionArn(String previousActiveVersionArn) {
        this.previousActiveVersionArn = previousActiveVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model
     *         version.
     */

    public String getPreviousActiveVersionArn() {
        return this.previousActiveVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model version.
     * </p>
     * 
     * @param previousActiveVersionArn
     *        The Amazon Resource Name (ARN) of the machine learning model version that was the previous active model
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActiveModelVersionResult withPreviousActiveVersionArn(String previousActiveVersionArn) {
        setPreviousActiveVersionArn(previousActiveVersionArn);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getCurrentActiveVersion() != null)
            sb.append("CurrentActiveVersion: ").append(getCurrentActiveVersion()).append(",");
        if (getPreviousActiveVersion() != null)
            sb.append("PreviousActiveVersion: ").append(getPreviousActiveVersion()).append(",");
        if (getCurrentActiveVersionArn() != null)
            sb.append("CurrentActiveVersionArn: ").append(getCurrentActiveVersionArn()).append(",");
        if (getPreviousActiveVersionArn() != null)
            sb.append("PreviousActiveVersionArn: ").append(getPreviousActiveVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateActiveModelVersionResult == false)
            return false;
        UpdateActiveModelVersionResult other = (UpdateActiveModelVersionResult) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getCurrentActiveVersion() == null ^ this.getCurrentActiveVersion() == null)
            return false;
        if (other.getCurrentActiveVersion() != null && other.getCurrentActiveVersion().equals(this.getCurrentActiveVersion()) == false)
            return false;
        if (other.getPreviousActiveVersion() == null ^ this.getPreviousActiveVersion() == null)
            return false;
        if (other.getPreviousActiveVersion() != null && other.getPreviousActiveVersion().equals(this.getPreviousActiveVersion()) == false)
            return false;
        if (other.getCurrentActiveVersionArn() == null ^ this.getCurrentActiveVersionArn() == null)
            return false;
        if (other.getCurrentActiveVersionArn() != null && other.getCurrentActiveVersionArn().equals(this.getCurrentActiveVersionArn()) == false)
            return false;
        if (other.getPreviousActiveVersionArn() == null ^ this.getPreviousActiveVersionArn() == null)
            return false;
        if (other.getPreviousActiveVersionArn() != null && other.getPreviousActiveVersionArn().equals(this.getPreviousActiveVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getCurrentActiveVersion() == null) ? 0 : getCurrentActiveVersion().hashCode());
        hashCode = prime * hashCode + ((getPreviousActiveVersion() == null) ? 0 : getPreviousActiveVersion().hashCode());
        hashCode = prime * hashCode + ((getCurrentActiveVersionArn() == null) ? 0 : getCurrentActiveVersionArn().hashCode());
        hashCode = prime * hashCode + ((getPreviousActiveVersionArn() == null) ? 0 : getPreviousActiveVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateActiveModelVersionResult clone() {
        try {
            return (UpdateActiveModelVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
