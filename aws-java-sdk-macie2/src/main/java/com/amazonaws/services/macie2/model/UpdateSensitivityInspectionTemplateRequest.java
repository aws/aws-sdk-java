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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateSensitivityInspectionTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSensitivityInspectionTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A custom description of the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The managed data identifiers to explicitly exclude (not use) when analyzing data.
     * </p>
     * <p>
     * To exclude an allow list or custom data identifier that's currently included by the template, update the values
     * for the SensitivityInspectionTemplateIncludes.allowListIds and
     * SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     * </p>
     */
    private SensitivityInspectionTemplateExcludes excludes;
    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing data.
     * </p>
     */
    private SensitivityInspectionTemplateIncludes includes;

    /**
     * <p>
     * A custom description of the template.
     * </p>
     * 
     * @param description
     *        A custom description of the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the template.
     * </p>
     * 
     * @return A custom description of the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description of the template.
     * </p>
     * 
     * @param description
     *        A custom description of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSensitivityInspectionTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The managed data identifiers to explicitly exclude (not use) when analyzing data.
     * </p>
     * <p>
     * To exclude an allow list or custom data identifier that's currently included by the template, update the values
     * for the SensitivityInspectionTemplateIncludes.allowListIds and
     * SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     * </p>
     * 
     * @param excludes
     *        <p>
     *        The managed data identifiers to explicitly exclude (not use) when analyzing data.
     *        </p>
     *        <p>
     *        To exclude an allow list or custom data identifier that's currently included by the template, update the
     *        values for the SensitivityInspectionTemplateIncludes.allowListIds and
     *        SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     *        </p>
     */

    public void setExcludes(SensitivityInspectionTemplateExcludes excludes) {
        this.excludes = excludes;
    }

    /**
     * <p>
     * The managed data identifiers to explicitly exclude (not use) when analyzing data.
     * </p>
     * <p>
     * To exclude an allow list or custom data identifier that's currently included by the template, update the values
     * for the SensitivityInspectionTemplateIncludes.allowListIds and
     * SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     * </p>
     * 
     * @return <p>
     *         The managed data identifiers to explicitly exclude (not use) when analyzing data.
     *         </p>
     *         <p>
     *         To exclude an allow list or custom data identifier that's currently included by the template, update the
     *         values for the SensitivityInspectionTemplateIncludes.allowListIds and
     *         SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     *         </p>
     */

    public SensitivityInspectionTemplateExcludes getExcludes() {
        return this.excludes;
    }

    /**
     * <p>
     * The managed data identifiers to explicitly exclude (not use) when analyzing data.
     * </p>
     * <p>
     * To exclude an allow list or custom data identifier that's currently included by the template, update the values
     * for the SensitivityInspectionTemplateIncludes.allowListIds and
     * SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     * </p>
     * 
     * @param excludes
     *        <p>
     *        The managed data identifiers to explicitly exclude (not use) when analyzing data.
     *        </p>
     *        <p>
     *        To exclude an allow list or custom data identifier that's currently included by the template, update the
     *        values for the SensitivityInspectionTemplateIncludes.allowListIds and
     *        SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSensitivityInspectionTemplateRequest withExcludes(SensitivityInspectionTemplateExcludes excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Amazon Macie resource that the request applies to.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     * 
     * @return The unique identifier for the Amazon Macie resource that the request applies to.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource that the request applies to.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Amazon Macie resource that the request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSensitivityInspectionTemplateRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing data.
     * </p>
     * 
     * @param includes
     *        The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing
     *        data.
     */

    public void setIncludes(SensitivityInspectionTemplateIncludes includes) {
        this.includes = includes;
    }

    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing data.
     * </p>
     * 
     * @return The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing
     *         data.
     */

    public SensitivityInspectionTemplateIncludes getIncludes() {
        return this.includes;
    }

    /**
     * <p>
     * The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing data.
     * </p>
     * 
     * @param includes
     *        The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSensitivityInspectionTemplateRequest withIncludes(SensitivityInspectionTemplateIncludes includes) {
        setIncludes(includes);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSensitivityInspectionTemplateRequest == false)
            return false;
        UpdateSensitivityInspectionTemplateRequest other = (UpdateSensitivityInspectionTemplateRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSensitivityInspectionTemplateRequest clone() {
        return (UpdateSensitivityInspectionTemplateRequest) super.clone();
    }

}
