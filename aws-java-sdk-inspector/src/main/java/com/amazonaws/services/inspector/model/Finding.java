/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an Inspector finding.
 * </p>
 * <p>
 * This data type is used as the response element in the <a>DescribeFinding</a>
 * action.
 * </p>
 */
public class Finding implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the finding.
     * </p>
     */
    private String findingArn;
    /**
     * <p>
     * The ARN of the assessment run that generated the finding.
     * </p>
     */
    private String runArn;
    /**
     * <p>
     * The ARN of the rules package that is used to generate the finding.
     * </p>
     */
    private String rulesPackageArn;
    /**
     * <p>
     * The rule name that is used to generate the finding.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The EC2 instance ID where the agent is installed that is used during the
     * assessment that generates the finding.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The autoscaling group of the EC2 instance where the agent is installed
     * that is used during the assessment that generates the finding.
     * </p>
     */
    private String autoScalingGroup;
    /**
     * <p>
     * The finding severity. Values can be set to <i>High</i>, <i>Medium</i>,
     * <i>Low</i>, and <i>Informational</i>.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * A short description that identifies the finding.
     * </p>
     */
    private LocalizedText finding;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private LocalizedText description;
    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     */
    private LocalizedText recommendation;
    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     */
    private java.util.List<Attribute> attributes;
    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     */
    private java.util.List<Attribute> userAttributes;

    /**
     * <p>
     * The ARN specifying the finding.
     * </p>
     * 
     * @param findingArn
     *        The ARN specifying the finding.
     */
    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The ARN specifying the finding.
     * </p>
     * 
     * @return The ARN specifying the finding.
     */
    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The ARN specifying the finding.
     * </p>
     * 
     * @param findingArn
     *        The ARN specifying the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withFindingArn(String findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment run that generated the finding.
     * </p>
     * 
     * @param runArn
     *        The ARN of the assessment run that generated the finding.
     */
    public void setRunArn(String runArn) {
        this.runArn = runArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that generated the finding.
     * </p>
     * 
     * @return The ARN of the assessment run that generated the finding.
     */
    public String getRunArn() {
        return this.runArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that generated the finding.
     * </p>
     * 
     * @param runArn
     *        The ARN of the assessment run that generated the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withRunArn(String runArn) {
        setRunArn(runArn);
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
     * @return The ARN of the rules package that is used to generate the
     *         finding.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withRulesPackageArn(String rulesPackageArn) {
        setRulesPackageArn(rulesPackageArn);
        return this;
    }

    /**
     * <p>
     * The rule name that is used to generate the finding.
     * </p>
     * 
     * @param ruleName
     *        The rule name that is used to generate the finding.
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The rule name that is used to generate the finding.
     * </p>
     * 
     * @return The rule name that is used to generate the finding.
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The rule name that is used to generate the finding.
     * </p>
     * 
     * @param ruleName
     *        The rule name that is used to generate the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The EC2 instance ID where the agent is installed that is used during the
     * assessment that generates the finding.
     * </p>
     * 
     * @param agentId
     *        The EC2 instance ID where the agent is installed that is used
     *        during the assessment that generates the finding.
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The EC2 instance ID where the agent is installed that is used during the
     * assessment that generates the finding.
     * </p>
     * 
     * @return The EC2 instance ID where the agent is installed that is used
     *         during the assessment that generates the finding.
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The EC2 instance ID where the agent is installed that is used during the
     * assessment that generates the finding.
     * </p>
     * 
     * @param agentId
     *        The EC2 instance ID where the agent is installed that is used
     *        during the assessment that generates the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The autoscaling group of the EC2 instance where the agent is installed
     * that is used during the assessment that generates the finding.
     * </p>
     * 
     * @param autoScalingGroup
     *        The autoscaling group of the EC2 instance where the agent is
     *        installed that is used during the assessment that generates the
     *        finding.
     */
    public void setAutoScalingGroup(String autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    /**
     * <p>
     * The autoscaling group of the EC2 instance where the agent is installed
     * that is used during the assessment that generates the finding.
     * </p>
     * 
     * @return The autoscaling group of the EC2 instance where the agent is
     *         installed that is used during the assessment that generates the
     *         finding.
     */
    public String getAutoScalingGroup() {
        return this.autoScalingGroup;
    }

    /**
     * <p>
     * The autoscaling group of the EC2 instance where the agent is installed
     * that is used during the assessment that generates the finding.
     * </p>
     * 
     * @param autoScalingGroup
     *        The autoscaling group of the EC2 instance where the agent is
     *        installed that is used during the assessment that generates the
     *        finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withAutoScalingGroup(String autoScalingGroup) {
        setAutoScalingGroup(autoScalingGroup);
        return this;
    }

    /**
     * <p>
     * The finding severity. Values can be set to <i>High</i>, <i>Medium</i>,
     * <i>Low</i>, and <i>Informational</i>.
     * </p>
     * 
     * @param severity
     *        The finding severity. Values can be set to <i>High</i>,
     *        <i>Medium</i>, <i>Low</i>, and <i>Informational</i>.
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The finding severity. Values can be set to <i>High</i>, <i>Medium</i>,
     * <i>Low</i>, and <i>Informational</i>.
     * </p>
     * 
     * @return The finding severity. Values can be set to <i>High</i>,
     *         <i>Medium</i>, <i>Low</i>, and <i>Informational</i>.
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The finding severity. Values can be set to <i>High</i>, <i>Medium</i>,
     * <i>Low</i>, and <i>Informational</i>.
     * </p>
     * 
     * @param severity
     *        The finding severity. Values can be set to <i>High</i>,
     *        <i>Medium</i>, <i>Low</i>, and <i>Informational</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * A short description that identifies the finding.
     * </p>
     * 
     * @param finding
     *        A short description that identifies the finding.
     */
    public void setFinding(LocalizedText finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * A short description that identifies the finding.
     * </p>
     * 
     * @return A short description that identifies the finding.
     */
    public LocalizedText getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * A short description that identifies the finding.
     * </p>
     * 
     * @param finding
     *        A short description that identifies the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withFinding(LocalizedText finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     */
    public void setDescription(LocalizedText description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @return The description of the finding.
     */
    public LocalizedText getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withDescription(LocalizedText description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     * 
     * @param recommendation
     *        The recommendation for the finding.
     */
    public void setRecommendation(LocalizedText recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     * 
     * @return The recommendation for the finding.
     */
    public LocalizedText getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     * 
     * @param recommendation
     *        The recommendation for the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withRecommendation(LocalizedText recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * 
     * @return The system-defined attributes for the finding.
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the finding.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttributes(java.util.Collection)} or
     * {@link #withAttributes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to the finding.
     */
    public java.util.List<Attribute> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * 
     * @param userAttributes
     *        The user-defined attributes that are assigned to the finding.
     */
    public void setUserAttributes(java.util.Collection<Attribute> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<Attribute>(userAttributes);
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserAttributes(java.util.Collection)} or
     * {@link #withUserAttributes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userAttributes
     *        The user-defined attributes that are assigned to the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withUserAttributes(Attribute... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<Attribute>(
                    userAttributes.length));
        }
        for (Attribute ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * 
     * @param userAttributes
     *        The user-defined attributes that are assigned to the finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Finding withUserAttributes(
            java.util.Collection<Attribute> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFindingArn() != null)
            sb.append("FindingArn: " + getFindingArn() + ",");
        if (getRunArn() != null)
            sb.append("RunArn: " + getRunArn() + ",");
        if (getRulesPackageArn() != null)
            sb.append("RulesPackageArn: " + getRulesPackageArn() + ",");
        if (getRuleName() != null)
            sb.append("RuleName: " + getRuleName() + ",");
        if (getAgentId() != null)
            sb.append("AgentId: " + getAgentId() + ",");
        if (getAutoScalingGroup() != null)
            sb.append("AutoScalingGroup: " + getAutoScalingGroup() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getFinding() != null)
            sb.append("Finding: " + getFinding() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRecommendation() != null)
            sb.append("Recommendation: " + getRecommendation() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null
                && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getRunArn() == null ^ this.getRunArn() == null)
            return false;
        if (other.getRunArn() != null
                && other.getRunArn().equals(this.getRunArn()) == false)
            return false;
        if (other.getRulesPackageArn() == null
                ^ this.getRulesPackageArn() == null)
            return false;
        if (other.getRulesPackageArn() != null
                && other.getRulesPackageArn().equals(this.getRulesPackageArn()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null
                && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null
                && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAutoScalingGroup() == null
                ^ this.getAutoScalingGroup() == null)
            return false;
        if (other.getAutoScalingGroup() != null
                && other.getAutoScalingGroup().equals(
                        this.getAutoScalingGroup()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null
                && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getFinding() == null ^ this.getFinding() == null)
            return false;
        if (other.getFinding() != null
                && other.getFinding().equals(this.getFinding()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRecommendation() == null
                ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null
                && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUserAttributes() == null
                ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode
                + ((getRunArn() == null) ? 0 : getRunArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getRulesPackageArn() == null) ? 0 : getRulesPackageArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode
                + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoScalingGroup() == null) ? 0 : getAutoScalingGroup()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode
                + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendation() == null) ? 0 : getRecommendation()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Finding clone() {
        try {
            return (Finding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}