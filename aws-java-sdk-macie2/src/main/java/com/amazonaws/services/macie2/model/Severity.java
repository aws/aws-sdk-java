/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the numerical and qualitative representations of a finding's severity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Severity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Severity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
     * </p>
     */
    private String description;
    /**
     * <p>
     * The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     * </p>
     */
    private Long score;

    /**
     * <p>
     * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
     * </p>
     * 
     * @param description
     *        The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most
     *        severe).
     * @see SeverityDescription
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
     * </p>
     * 
     * @return The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most
     *         severe).
     * @see SeverityDescription
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
     * </p>
     * 
     * @param description
     *        The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most
     *        severe).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityDescription
     */

    public Severity withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
     * </p>
     * 
     * @param description
     *        The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most
     *        severe).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityDescription
     */

    public Severity withDescription(SeverityDescription description) {
        this.description = description.toString();
        return this;
    }

    /**
     * <p>
     * The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     * </p>
     * 
     * @param score
     *        The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     */

    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * <p>
     * The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     * </p>
     * 
     * @return The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     */

    public Long getScore() {
        return this.score;
    }

    /**
     * <p>
     * The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     * </p>
     * 
     * @param score
     *        The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Severity withScore(Long score) {
        setScore(score);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Severity == false)
            return false;
        Severity other = (Severity) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public Severity clone() {
        try {
            return (Severity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SeverityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
