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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of an OpenSearch Ingestion blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/PipelineBlueprintSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineBlueprintSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String blueprintName;
    /**
     * <p>
     * The display name of the blueprint.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A description of the blueprint.
     * </p>
     */
    private String displayDescription;
    /**
     * <p>
     * The name of the service that the blueprint is associated with.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The use case that the blueprint relates to.
     * </p>
     */
    private String useCase;

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

    public PipelineBlueprintSummary withBlueprintName(String blueprintName) {
        setBlueprintName(blueprintName);
        return this;
    }

    /**
     * <p>
     * The display name of the blueprint.
     * </p>
     * 
     * @param displayName
     *        The display name of the blueprint.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the blueprint.
     * </p>
     * 
     * @return The display name of the blueprint.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the blueprint.
     * </p>
     * 
     * @param displayName
     *        The display name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineBlueprintSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A description of the blueprint.
     * </p>
     * 
     * @param displayDescription
     *        A description of the blueprint.
     */

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    /**
     * <p>
     * A description of the blueprint.
     * </p>
     * 
     * @return A description of the blueprint.
     */

    public String getDisplayDescription() {
        return this.displayDescription;
    }

    /**
     * <p>
     * A description of the blueprint.
     * </p>
     * 
     * @param displayDescription
     *        A description of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineBlueprintSummary withDisplayDescription(String displayDescription) {
        setDisplayDescription(displayDescription);
        return this;
    }

    /**
     * <p>
     * The name of the service that the blueprint is associated with.
     * </p>
     * 
     * @param service
     *        The name of the service that the blueprint is associated with.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service that the blueprint is associated with.
     * </p>
     * 
     * @return The name of the service that the blueprint is associated with.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the service that the blueprint is associated with.
     * </p>
     * 
     * @param service
     *        The name of the service that the blueprint is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineBlueprintSummary withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The use case that the blueprint relates to.
     * </p>
     * 
     * @param useCase
     *        The use case that the blueprint relates to.
     */

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    /**
     * <p>
     * The use case that the blueprint relates to.
     * </p>
     * 
     * @return The use case that the blueprint relates to.
     */

    public String getUseCase() {
        return this.useCase;
    }

    /**
     * <p>
     * The use case that the blueprint relates to.
     * </p>
     * 
     * @param useCase
     *        The use case that the blueprint relates to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineBlueprintSummary withUseCase(String useCase) {
        setUseCase(useCase);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDisplayDescription() != null)
            sb.append("DisplayDescription: ").append(getDisplayDescription()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getUseCase() != null)
            sb.append("UseCase: ").append(getUseCase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineBlueprintSummary == false)
            return false;
        PipelineBlueprintSummary other = (PipelineBlueprintSummary) obj;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDisplayDescription() == null ^ this.getDisplayDescription() == null)
            return false;
        if (other.getDisplayDescription() != null && other.getDisplayDescription().equals(this.getDisplayDescription()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getUseCase() == null ^ this.getUseCase() == null)
            return false;
        if (other.getUseCase() != null && other.getUseCase().equals(this.getUseCase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDisplayDescription() == null) ? 0 : getDisplayDescription().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getUseCase() == null) ? 0 : getUseCase().hashCode());
        return hashCode;
    }

    @Override
    public PipelineBlueprintSummary clone() {
        try {
            return (PipelineBlueprintSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.PipelineBlueprintSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
