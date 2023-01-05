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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartGeneratedCodeJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartGeneratedCodeJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String gameName;
    /**
     * <p>
     * Properties of the generator to use for the job.
     * </p>
     */
    private Generator generator;
    /**
     * <p>
     * The identifier of the snapshot for which to generate code.
     * </p>
     */
    private String snapshotId;

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

    public StartGeneratedCodeJobRequest withGameName(String gameName) {
        setGameName(gameName);
        return this;
    }

    /**
     * <p>
     * Properties of the generator to use for the job.
     * </p>
     * 
     * @param generator
     *        Properties of the generator to use for the job.
     */

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    /**
     * <p>
     * Properties of the generator to use for the job.
     * </p>
     * 
     * @return Properties of the generator to use for the job.
     */

    public Generator getGenerator() {
        return this.generator;
    }

    /**
     * <p>
     * Properties of the generator to use for the job.
     * </p>
     * 
     * @param generator
     *        Properties of the generator to use for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGeneratedCodeJobRequest withGenerator(Generator generator) {
        setGenerator(generator);
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot for which to generate code.
     * </p>
     * 
     * @param snapshotId
     *        The identifier of the snapshot for which to generate code.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The identifier of the snapshot for which to generate code.
     * </p>
     * 
     * @return The identifier of the snapshot for which to generate code.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The identifier of the snapshot for which to generate code.
     * </p>
     * 
     * @param snapshotId
     *        The identifier of the snapshot for which to generate code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGeneratedCodeJobRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getGameName() != null)
            sb.append("GameName: ").append(getGameName()).append(",");
        if (getGenerator() != null)
            sb.append("Generator: ").append(getGenerator()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartGeneratedCodeJobRequest == false)
            return false;
        StartGeneratedCodeJobRequest other = (StartGeneratedCodeJobRequest) obj;
        if (other.getGameName() == null ^ this.getGameName() == null)
            return false;
        if (other.getGameName() != null && other.getGameName().equals(this.getGameName()) == false)
            return false;
        if (other.getGenerator() == null ^ this.getGenerator() == null)
            return false;
        if (other.getGenerator() != null && other.getGenerator().equals(this.getGenerator()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameName() == null) ? 0 : getGameName().hashCode());
        hashCode = prime * hashCode + ((getGenerator() == null) ? 0 : getGenerator().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public StartGeneratedCodeJobRequest clone() {
        return (StartGeneratedCodeJobRequest) super.clone();
    }

}
