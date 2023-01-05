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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStageDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStageDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you use
     * here.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String gameName;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you use
     * here.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you
     *        use here.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you use
     * here.
     * </p>
     * 
     * @return The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you
     *         use here.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you use
     * here.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the stage deployment. <code>StartStageDeployment</code> returns the identifier that you
     *        use here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param gameName
     *        The name of the game.
     */

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @return The name of the game.
     */

    public String getGameName() {
        return this.gameName;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param gameName
     *        The name of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageDeploymentRequest withGameName(String gameName) {
        setGameName(gameName);
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageDeploymentRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getGameName() != null)
            sb.append("GameName: ").append(getGameName()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStageDeploymentRequest == false)
            return false;
        GetStageDeploymentRequest other = (GetStageDeploymentRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getGameName() == null ^ this.getGameName() == null)
            return false;
        if (other.getGameName() != null && other.getGameName().equals(this.getGameName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getGameName() == null) ? 0 : getGameName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public GetStageDeploymentRequest clone() {
        return (GetStageDeploymentRequest) super.clone();
    }

}
