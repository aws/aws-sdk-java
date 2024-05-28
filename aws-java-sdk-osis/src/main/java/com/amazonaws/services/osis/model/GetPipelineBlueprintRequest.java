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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineBlueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineBlueprintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the blueprint to retrieve.
     * </p>
     */
    private String blueprintName;
    /**
     * <p>
     * The format format of the blueprint to retrieve.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The name of the blueprint to retrieve.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint to retrieve.
     */

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint to retrieve.
     * </p>
     * 
     * @return The name of the blueprint to retrieve.
     */

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint to retrieve.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineBlueprintRequest withBlueprintName(String blueprintName) {
        setBlueprintName(blueprintName);
        return this;
    }

    /**
     * <p>
     * The format format of the blueprint to retrieve.
     * </p>
     * 
     * @param format
     *        The format format of the blueprint to retrieve.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format format of the blueprint to retrieve.
     * </p>
     * 
     * @return The format format of the blueprint to retrieve.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format format of the blueprint to retrieve.
     * </p>
     * 
     * @param format
     *        The format format of the blueprint to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineBlueprintRequest withFormat(String format) {
        setFormat(format);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineBlueprintRequest == false)
            return false;
        GetPipelineBlueprintRequest other = (GetPipelineBlueprintRequest) obj;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineBlueprintRequest clone() {
        return (GetPipelineBlueprintRequest) super.clone();
    }

}
