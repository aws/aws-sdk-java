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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitivityInspectionTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSensitivityInspectionTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The custom description of the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     * </p>
     */
    private SensitivityInspectionTemplateExcludes excludes;
    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers that are included (used) when analyzing
     * data.
     * </p>
     */
    private SensitivityInspectionTemplateIncludes includes;
    /**
     * <p>
     * The name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     */
    private String sensitivityInspectionTemplateId;

    /**
     * <p>
     * The custom description of the template.
     * </p>
     * 
     * @param description
     *        The custom description of the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the template.
     * </p>
     * 
     * @return The custom description of the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the template.
     * </p>
     * 
     * @param description
     *        The custom description of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitivityInspectionTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     * </p>
     * 
     * @param excludes
     *        <p>
     *        The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     *        </p>
     */

    public void setExcludes(SensitivityInspectionTemplateExcludes excludes) {
        this.excludes = excludes;
    }

    /**
     * <p>
     * The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     * </p>
     * 
     * @return <p>
     *         The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     *         </p>
     */

    public SensitivityInspectionTemplateExcludes getExcludes() {
        return this.excludes;
    }

    /**
     * <p>
     * The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     * </p>
     * 
     * @param excludes
     *        <p>
     *        The managed data identifiers that are explicitly excluded (not used) when analyzing data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitivityInspectionTemplateResult withExcludes(SensitivityInspectionTemplateExcludes excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers that are included (used) when analyzing
     * data.
     * </p>
     * 
     * @param includes
     *        The allow lists, custom data identifiers, and managed data identifiers that are included (used) when
     *        analyzing data.
     */

    public void setIncludes(SensitivityInspectionTemplateIncludes includes) {
        this.includes = includes;
    }

    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers that are included (used) when analyzing
     * data.
     * </p>
     * 
     * @return The allow lists, custom data identifiers, and managed data identifiers that are included (used) when
     *         analyzing data.
     */

    public SensitivityInspectionTemplateIncludes getIncludes() {
        return this.includes;
    }

    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers that are included (used) when analyzing
     * data.
     * </p>
     * 
     * @param includes
     *        The allow lists, custom data identifiers, and managed data identifiers that are included (used) when
     *        analyzing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitivityInspectionTemplateResult withIncludes(SensitivityInspectionTemplateIncludes includes) {
        setIncludes(includes);
        return this;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @return The name of the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitivityInspectionTemplateResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     * 
     * @param sensitivityInspectionTemplateId
     *        The unique identifier for the template.
     */

    public void setSensitivityInspectionTemplateId(String sensitivityInspectionTemplateId) {
        this.sensitivityInspectionTemplateId = sensitivityInspectionTemplateId;
    }

    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     * 
     * @return The unique identifier for the template.
     */

    public String getSensitivityInspectionTemplateId() {
        return this.sensitivityInspectionTemplateId;
    }

    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     * 
     * @param sensitivityInspectionTemplateId
     *        The unique identifier for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitivityInspectionTemplateResult withSensitivityInspectionTemplateId(String sensitivityInspectionTemplateId) {
        setSensitivityInspectionTemplateId(sensitivityInspectionTemplateId);
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
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSensitivityInspectionTemplateId() != null)
            sb.append("SensitivityInspectionTemplateId: ").append(getSensitivityInspectionTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSensitivityInspectionTemplateResult == false)
            return false;
        GetSensitivityInspectionTemplateResult other = (GetSensitivityInspectionTemplateResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSensitivityInspectionTemplateId() == null ^ this.getSensitivityInspectionTemplateId() == null)
            return false;
        if (other.getSensitivityInspectionTemplateId() != null
                && other.getSensitivityInspectionTemplateId().equals(this.getSensitivityInspectionTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSensitivityInspectionTemplateId() == null) ? 0 : getSensitivityInspectionTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public GetSensitivityInspectionTemplateResult clone() {
        try {
            return (GetSensitivityInspectionTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
