/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This data type is used in the <a>Finding</a> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/InspectorServiceAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InspectorServiceAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     */
    private Integer schemaVersion;
    /**
     * <p>
     * The ARN of the assessment run during which the finding is generated.
     * </p>
     */
    private String assessmentRunArn;
    /**
     * <p>
     * The ARN of the rules package that is used to generate the finding.
     * </p>
     */
    private String rulesPackageArn;

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of this data type.
     */

    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @return The schema version of this data type.
     */

    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of this data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectorServiceAttributes withSchemaVersion(Integer schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment run during which the finding is generated.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run during which the finding is generated.
     */

    public void setAssessmentRunArn(String assessmentRunArn) {
        this.assessmentRunArn = assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run during which the finding is generated.
     * </p>
     * 
     * @return The ARN of the assessment run during which the finding is generated.
     */

    public String getAssessmentRunArn() {
        return this.assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run during which the finding is generated.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run during which the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectorServiceAttributes withAssessmentRunArn(String assessmentRunArn) {
        setAssessmentRunArn(assessmentRunArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the rules package that is used to generate the finding.
     * </p>
     * 
     * @param rulesPackageArn
     *        The ARN of the rules package that is used to generate the finding.
     */

    public void setRulesPackageArn(String rulesPackageArn) {
        this.rulesPackageArn = rulesPackageArn;
    }

    /**
     * <p>
     * The ARN of the rules package that is used to generate the finding.
     * </p>
     * 
     * @return The ARN of the rules package that is used to generate the finding.
     */

    public String getRulesPackageArn() {
        return this.rulesPackageArn;
    }

    /**
     * <p>
     * The ARN of the rules package that is used to generate the finding.
     * </p>
     * 
     * @param rulesPackageArn
     *        The ARN of the rules package that is used to generate the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectorServiceAttributes withRulesPackageArn(String rulesPackageArn) {
        setRulesPackageArn(rulesPackageArn);
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
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getAssessmentRunArn() != null)
            sb.append("AssessmentRunArn: ").append(getAssessmentRunArn()).append(",");
        if (getRulesPackageArn() != null)
            sb.append("RulesPackageArn: ").append(getRulesPackageArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InspectorServiceAttributes == false)
            return false;
        InspectorServiceAttributes other = (InspectorServiceAttributes) obj;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getAssessmentRunArn() == null ^ this.getAssessmentRunArn() == null)
            return false;
        if (other.getAssessmentRunArn() != null && other.getAssessmentRunArn().equals(this.getAssessmentRunArn()) == false)
            return false;
        if (other.getRulesPackageArn() == null ^ this.getRulesPackageArn() == null)
            return false;
        if (other.getRulesPackageArn() != null && other.getRulesPackageArn().equals(this.getRulesPackageArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getAssessmentRunArn() == null) ? 0 : getAssessmentRunArn().hashCode());
        hashCode = prime * hashCode + ((getRulesPackageArn() == null) ? 0 : getRulesPackageArn().hashCode());
        return hashCode;
    }

    @Override
    public InspectorServiceAttributes clone() {
        try {
            return (InspectorServiceAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.InspectorServiceAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
