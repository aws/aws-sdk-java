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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a generation request made for the bot locale.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GenerationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     */
    private String generationId;
    /**
     * <p>
     * The status of the generation request.
     * </p>
     */
    private String generationStatus;
    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time at which the generation request was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     * 
     * @param generationId
     *        The unique identifier of the generation request.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     * 
     * @return The unique identifier of the generation request.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     * 
     * @param generationId
     *        The unique identifier of the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withGenerationId(String generationId) {
        setGenerationId(generationId);
        return this;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @param generationStatus
     *        The status of the generation request.
     * @see GenerationStatus
     */

    public void setGenerationStatus(String generationStatus) {
        this.generationStatus = generationStatus;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @return The status of the generation request.
     * @see GenerationStatus
     */

    public String getGenerationStatus() {
        return this.generationStatus;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @param generationStatus
     *        The status of the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public GenerationSummary withGenerationStatus(String generationStatus) {
        setGenerationStatus(generationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @param generationStatus
     *        The status of the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public GenerationSummary withGenerationStatus(GenerationStatus generationStatus) {
        this.generationStatus = generationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the generation request was made.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     * 
     * @return The date and time at which the generation request was made.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the generation request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time at which the generation request was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time at which the generation request was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time at which the generation request was last updated.
     * </p>
     * 
     * @return The date and time at which the generation request was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time at which the generation request was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time at which the generation request was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getGenerationId() != null)
            sb.append("GenerationId: ").append(getGenerationId()).append(",");
        if (getGenerationStatus() != null)
            sb.append("GenerationStatus: ").append(getGenerationStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerationSummary == false)
            return false;
        GenerationSummary other = (GenerationSummary) obj;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null && other.getGenerationId().equals(this.getGenerationId()) == false)
            return false;
        if (other.getGenerationStatus() == null ^ this.getGenerationStatus() == null)
            return false;
        if (other.getGenerationStatus() != null && other.getGenerationStatus().equals(this.getGenerationStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        hashCode = prime * hashCode + ((getGenerationStatus() == null) ? 0 : getGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public GenerationSummary clone() {
        try {
            return (GenerationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.GenerationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
