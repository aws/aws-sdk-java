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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateStage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Properties that provide details of the updated stage.
     * </p>
     */
    private StageDetails stage;

    /**
     * <p>
     * Properties that provide details of the updated stage.
     * </p>
     * 
     * @param stage
     *        Properties that provide details of the updated stage.
     */

    public void setStage(StageDetails stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * Properties that provide details of the updated stage.
     * </p>
     * 
     * @return Properties that provide details of the updated stage.
     */

    public StageDetails getStage() {
        return this.stage;
    }

    /**
     * <p>
     * Properties that provide details of the updated stage.
     * </p>
     * 
     * @param stage
     *        Properties that provide details of the updated stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withStage(StageDetails stage) {
        setStage(stage);
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
        if (getStage() != null)
            sb.append("Stage: ").append(getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStageResult == false)
            return false;
        UpdateStageResult other = (UpdateStageResult) obj;
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

        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStageResult clone() {
        try {
            return (UpdateStageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
