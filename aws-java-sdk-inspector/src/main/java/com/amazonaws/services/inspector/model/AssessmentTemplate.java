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
 * Contains information about an Amazon Inspector assessment template. This data type is used as the response element in
 * the <a>DescribeAssessmentTemplates</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssessmentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the assessment template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the assessment template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the assessment target that corresponds to this assessment template.
     * </p>
     */
    private String assessmentTargetArn;
    /**
     * <p>
     * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The
     * maximum value is 86400 seconds (one day).
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The rules packages that are specified for this assessment template.
     * </p>
     */
    private java.util.List<String> rulesPackageArns;
    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this
     * assessment template.
     * </p>
     */
    private java.util.List<Attribute> userAttributesForFindings;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This
     * value exists only when the value of assessmentRunCount is greaterpa than zero.
     * </p>
     */
    private String lastAssessmentRunArn;
    /**
     * <p>
     * The number of existing assessment runs associated with this assessment template. This value can be zero or a
     * positive integer.
     * </p>
     */
    private Integer assessmentRunCount;
    /**
     * <p>
     * The time at which the assessment template is created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ARN of the assessment template.
     * </p>
     * 
     * @param arn
     *        The ARN of the assessment template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the assessment template.
     * </p>
     * 
     * @return The ARN of the assessment template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the assessment template.
     * </p>
     * 
     * @param arn
     *        The ARN of the assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the assessment template.
     * </p>
     * 
     * @param name
     *        The name of the assessment template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the assessment template.
     * </p>
     * 
     * @return The name of the assessment template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the assessment template.
     * </p>
     * 
     * @param name
     *        The name of the assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment target that corresponds to this assessment template.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN of the assessment target that corresponds to this assessment template.
     */

    public void setAssessmentTargetArn(String assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN of the assessment target that corresponds to this assessment template.
     * </p>
     * 
     * @return The ARN of the assessment target that corresponds to this assessment template.
     */

    public String getAssessmentTargetArn() {
        return this.assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN of the assessment target that corresponds to this assessment template.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN of the assessment target that corresponds to this assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withAssessmentTargetArn(String assessmentTargetArn) {
        setAssessmentTargetArn(assessmentTargetArn);
        return this;
    }

    /**
     * <p>
     * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The
     * maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        The duration in seconds specified for this assessment template. The default value is 3600 seconds (one
     *        hour). The maximum value is 86400 seconds (one day).
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The
     * maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @return The duration in seconds specified for this assessment template. The default value is 3600 seconds (one
     *         hour). The maximum value is 86400 seconds (one day).
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The
     * maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        The duration in seconds specified for this assessment template. The default value is 3600 seconds (one
     *        hour). The maximum value is 86400 seconds (one day).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The rules packages that are specified for this assessment template.
     * </p>
     * 
     * @return The rules packages that are specified for this assessment template.
     */

    public java.util.List<String> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * <p>
     * The rules packages that are specified for this assessment template.
     * </p>
     * 
     * @param rulesPackageArns
     *        The rules packages that are specified for this assessment template.
     */

    public void setRulesPackageArns(java.util.Collection<String> rulesPackageArns) {
        if (rulesPackageArns == null) {
            this.rulesPackageArns = null;
            return;
        }

        this.rulesPackageArns = new java.util.ArrayList<String>(rulesPackageArns);
    }

    /**
     * <p>
     * The rules packages that are specified for this assessment template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesPackageArns(java.util.Collection)} or {@link #withRulesPackageArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rulesPackageArns
     *        The rules packages that are specified for this assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withRulesPackageArns(String... rulesPackageArns) {
        if (this.rulesPackageArns == null) {
            setRulesPackageArns(new java.util.ArrayList<String>(rulesPackageArns.length));
        }
        for (String ele : rulesPackageArns) {
            this.rulesPackageArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules packages that are specified for this assessment template.
     * </p>
     * 
     * @param rulesPackageArns
     *        The rules packages that are specified for this assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withRulesPackageArns(java.util.Collection<String> rulesPackageArns) {
        setRulesPackageArns(rulesPackageArns);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this
     * assessment template.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to every generated finding from the assessment run that
     *         uses this assessment template.
     */

    public java.util.List<Attribute> getUserAttributesForFindings() {
        return userAttributesForFindings;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this
     * assessment template.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated finding from the assessment run that uses
     *        this assessment template.
     */

    public void setUserAttributesForFindings(java.util.Collection<Attribute> userAttributesForFindings) {
        if (userAttributesForFindings == null) {
            this.userAttributesForFindings = null;
            return;
        }

        this.userAttributesForFindings = new java.util.ArrayList<Attribute>(userAttributesForFindings);
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this
     * assessment template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributesForFindings(java.util.Collection)} or
     * {@link #withUserAttributesForFindings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated finding from the assessment run that uses
     *        this assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withUserAttributesForFindings(Attribute... userAttributesForFindings) {
        if (this.userAttributesForFindings == null) {
            setUserAttributesForFindings(new java.util.ArrayList<Attribute>(userAttributesForFindings.length));
        }
        for (Attribute ele : userAttributesForFindings) {
            this.userAttributesForFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this
     * assessment template.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated finding from the assessment run that uses
     *        this assessment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withUserAttributesForFindings(java.util.Collection<Attribute> userAttributesForFindings) {
        setUserAttributesForFindings(userAttributesForFindings);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This
     * value exists only when the value of assessmentRunCount is greaterpa than zero.
     * </p>
     * 
     * @param lastAssessmentRunArn
     *        The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template.
     *        This value exists only when the value of assessmentRunCount is greaterpa than zero.
     */

    public void setLastAssessmentRunArn(String lastAssessmentRunArn) {
        this.lastAssessmentRunArn = lastAssessmentRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This
     * value exists only when the value of assessmentRunCount is greaterpa than zero.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment
     *         template. This value exists only when the value of assessmentRunCount is greaterpa than zero.
     */

    public String getLastAssessmentRunArn() {
        return this.lastAssessmentRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This
     * value exists only when the value of assessmentRunCount is greaterpa than zero.
     * </p>
     * 
     * @param lastAssessmentRunArn
     *        The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template.
     *        This value exists only when the value of assessmentRunCount is greaterpa than zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withLastAssessmentRunArn(String lastAssessmentRunArn) {
        setLastAssessmentRunArn(lastAssessmentRunArn);
        return this;
    }

    /**
     * <p>
     * The number of existing assessment runs associated with this assessment template. This value can be zero or a
     * positive integer.
     * </p>
     * 
     * @param assessmentRunCount
     *        The number of existing assessment runs associated with this assessment template. This value can be zero or
     *        a positive integer.
     */

    public void setAssessmentRunCount(Integer assessmentRunCount) {
        this.assessmentRunCount = assessmentRunCount;
    }

    /**
     * <p>
     * The number of existing assessment runs associated with this assessment template. This value can be zero or a
     * positive integer.
     * </p>
     * 
     * @return The number of existing assessment runs associated with this assessment template. This value can be zero
     *         or a positive integer.
     */

    public Integer getAssessmentRunCount() {
        return this.assessmentRunCount;
    }

    /**
     * <p>
     * The number of existing assessment runs associated with this assessment template. This value can be zero or a
     * positive integer.
     * </p>
     * 
     * @param assessmentRunCount
     *        The number of existing assessment runs associated with this assessment template. This value can be zero or
     *        a positive integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withAssessmentRunCount(Integer assessmentRunCount) {
        setAssessmentRunCount(assessmentRunCount);
        return this;
    }

    /**
     * <p>
     * The time at which the assessment template is created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the assessment template is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the assessment template is created.
     * </p>
     * 
     * @return The time at which the assessment template is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the assessment template is created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the assessment template is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTemplate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAssessmentTargetArn() != null)
            sb.append("AssessmentTargetArn: ").append(getAssessmentTargetArn()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getRulesPackageArns() != null)
            sb.append("RulesPackageArns: ").append(getRulesPackageArns()).append(",");
        if (getUserAttributesForFindings() != null)
            sb.append("UserAttributesForFindings: ").append(getUserAttributesForFindings()).append(",");
        if (getLastAssessmentRunArn() != null)
            sb.append("LastAssessmentRunArn: ").append(getLastAssessmentRunArn()).append(",");
        if (getAssessmentRunCount() != null)
            sb.append("AssessmentRunCount: ").append(getAssessmentRunCount()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentTemplate == false)
            return false;
        AssessmentTemplate other = (AssessmentTemplate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssessmentTargetArn() == null ^ this.getAssessmentTargetArn() == null)
            return false;
        if (other.getAssessmentTargetArn() != null && other.getAssessmentTargetArn().equals(this.getAssessmentTargetArn()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getRulesPackageArns() == null ^ this.getRulesPackageArns() == null)
            return false;
        if (other.getRulesPackageArns() != null && other.getRulesPackageArns().equals(this.getRulesPackageArns()) == false)
            return false;
        if (other.getUserAttributesForFindings() == null ^ this.getUserAttributesForFindings() == null)
            return false;
        if (other.getUserAttributesForFindings() != null && other.getUserAttributesForFindings().equals(this.getUserAttributesForFindings()) == false)
            return false;
        if (other.getLastAssessmentRunArn() == null ^ this.getLastAssessmentRunArn() == null)
            return false;
        if (other.getLastAssessmentRunArn() != null && other.getLastAssessmentRunArn().equals(this.getLastAssessmentRunArn()) == false)
            return false;
        if (other.getAssessmentRunCount() == null ^ this.getAssessmentRunCount() == null)
            return false;
        if (other.getAssessmentRunCount() != null && other.getAssessmentRunCount().equals(this.getAssessmentRunCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentTargetArn() == null) ? 0 : getAssessmentTargetArn().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getRulesPackageArns() == null) ? 0 : getRulesPackageArns().hashCode());
        hashCode = prime * hashCode + ((getUserAttributesForFindings() == null) ? 0 : getUserAttributesForFindings().hashCode());
        hashCode = prime * hashCode + ((getLastAssessmentRunArn() == null) ? 0 : getLastAssessmentRunArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentRunCount() == null) ? 0 : getAssessmentRunCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentTemplate clone() {
        try {
            return (AssessmentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssessmentTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
