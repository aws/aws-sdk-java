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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartStageDeployment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartStageDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Properties that describe the stage deployment.
     * </p>
     */
    private StageDeploymentDetails stageDeployment;

    /**
     * <p>
     * Properties that describe the stage deployment.
     * </p>
     * 
     * @param stageDeployment
     *        Properties that describe the stage deployment.
     */

    public void setStageDeployment(StageDeploymentDetails stageDeployment) {
        this.stageDeployment = stageDeployment;
    }

    /**
     * <p>
     * Properties that describe the stage deployment.
     * </p>
     * 
     * @return Properties that describe the stage deployment.
     */

    public StageDeploymentDetails getStageDeployment() {
        return this.stageDeployment;
    }

    /**
     * <p>
     * Properties that describe the stage deployment.
     * </p>
     * 
     * @param stageDeployment
     *        Properties that describe the stage deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStageDeploymentResult withStageDeployment(StageDeploymentDetails stageDeployment) {
        setStageDeployment(stageDeployment);
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
        if (getStageDeployment() != null)
            sb.append("StageDeployment: ").append(getStageDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStageDeploymentResult == false)
            return false;
        StartStageDeploymentResult other = (StartStageDeploymentResult) obj;
        if (other.getStageDeployment() == null ^ this.getStageDeployment() == null)
            return false;
        if (other.getStageDeployment() != null && other.getStageDeployment().equals(this.getStageDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStageDeployment() == null) ? 0 : getStageDeployment().hashCode());
        return hashCode;
    }

    @Override
    public StartStageDeploymentResult clone() {
        try {
            return (StartStageDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
