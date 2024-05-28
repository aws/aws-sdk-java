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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateMetadataTransferJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMetadataTransferJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     */
    private String metadataTransferJobId;
    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The metadata transfer job sources.
     * </p>
     */
    private java.util.List<SourceConfiguration> sources;
    /**
     * <p>
     * The metadata transfer job destination.
     * </p>
     */
    private DestinationConfiguration destination;

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     */

    public void setMetadataTransferJobId(String metadataTransferJobId) {
        this.metadataTransferJobId = metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @return The metadata transfer job Id.
     */

    public String getMetadataTransferJobId() {
        return this.metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobRequest withMetadataTransferJobId(String metadataTransferJobId) {
        setMetadataTransferJobId(metadataTransferJobId);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     * 
     * @param description
     *        The metadata transfer job description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     * 
     * @return The metadata transfer job description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     * 
     * @param description
     *        The metadata transfer job description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job sources.
     * </p>
     * 
     * @return The metadata transfer job sources.
     */

    public java.util.List<SourceConfiguration> getSources() {
        return sources;
    }

    /**
     * <p>
     * The metadata transfer job sources.
     * </p>
     * 
     * @param sources
     *        The metadata transfer job sources.
     */

    public void setSources(java.util.Collection<SourceConfiguration> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<SourceConfiguration>(sources);
    }

    /**
     * <p>
     * The metadata transfer job sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The metadata transfer job sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobRequest withSources(SourceConfiguration... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<SourceConfiguration>(sources.length));
        }
        for (SourceConfiguration ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata transfer job sources.
     * </p>
     * 
     * @param sources
     *        The metadata transfer job sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobRequest withSources(java.util.Collection<SourceConfiguration> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job destination.
     * </p>
     * 
     * @param destination
     *        The metadata transfer job destination.
     */

    public void setDestination(DestinationConfiguration destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The metadata transfer job destination.
     * </p>
     * 
     * @return The metadata transfer job destination.
     */

    public DestinationConfiguration getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The metadata transfer job destination.
     * </p>
     * 
     * @param destination
     *        The metadata transfer job destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetadataTransferJobRequest withDestination(DestinationConfiguration destination) {
        setDestination(destination);
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
        if (getMetadataTransferJobId() != null)
            sb.append("MetadataTransferJobId: ").append(getMetadataTransferJobId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMetadataTransferJobRequest == false)
            return false;
        CreateMetadataTransferJobRequest other = (CreateMetadataTransferJobRequest) obj;
        if (other.getMetadataTransferJobId() == null ^ this.getMetadataTransferJobId() == null)
            return false;
        if (other.getMetadataTransferJobId() != null && other.getMetadataTransferJobId().equals(this.getMetadataTransferJobId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataTransferJobId() == null) ? 0 : getMetadataTransferJobId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public CreateMetadataTransferJobRequest clone() {
        return (CreateMetadataTransferJobRequest) super.clone();
    }

}
