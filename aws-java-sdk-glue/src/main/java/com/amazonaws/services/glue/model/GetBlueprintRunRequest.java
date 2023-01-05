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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetBlueprintRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlueprintRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String blueprintName;
    /**
     * <p>
     * The run ID for the blueprint run you want to retrieve.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint.
     */

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRunRequest withBlueprintName(String blueprintName) {
        setBlueprintName(blueprintName);
        return this;
    }

    /**
     * <p>
     * The run ID for the blueprint run you want to retrieve.
     * </p>
     * 
     * @param runId
     *        The run ID for the blueprint run you want to retrieve.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The run ID for the blueprint run you want to retrieve.
     * </p>
     * 
     * @return The run ID for the blueprint run you want to retrieve.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The run ID for the blueprint run you want to retrieve.
     * </p>
     * 
     * @param runId
     *        The run ID for the blueprint run you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRunRequest withRunId(String runId) {
        setRunId(runId);
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
        if (getBlueprintName() != null)
            sb.append("BlueprintName: ").append(getBlueprintName()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlueprintRunRequest == false)
            return false;
        GetBlueprintRunRequest other = (GetBlueprintRunRequest) obj;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public GetBlueprintRunRequest clone() {
        return (GetBlueprintRunRequest) super.clone();
    }

}
