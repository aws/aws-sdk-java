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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a test recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/TestRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application component.
     * </p>
     */
    private String appComponentName;
    /**
     * <p>
     * A list of recommended alarms that are used in the test and must be exported before or with the test.
     * </p>
     */
    private java.util.List<String> dependsOnAlarms;
    /**
     * <p>
     * The description for the test recommendation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The intent of the test recommendation.
     * </p>
     */
    private String intent;
    /**
     * <p>
     * The test recommendation items.
     * </p>
     */
    private java.util.List<RecommendationItem> items;
    /**
     * <p>
     * The name of the test recommendation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The prerequisite of the test recommendation.
     * </p>
     */
    private String prerequisite;
    /**
     * <p>
     * Identifier for the test recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The reference identifier for the test recommendation.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * The level of risk for this test recommendation.
     * </p>
     */
    private String risk;
    /**
     * <p>
     * The type of test recommendation.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @param appComponentName
     *        The name of the application component.
     */

    public void setAppComponentName(String appComponentName) {
        this.appComponentName = appComponentName;
    }

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @return The name of the application component.
     */

    public String getAppComponentName() {
        return this.appComponentName;
    }

    /**
     * <p>
     * The name of the application component.
     * </p>
     * 
     * @param appComponentName
     *        The name of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withAppComponentName(String appComponentName) {
        setAppComponentName(appComponentName);
        return this;
    }

    /**
     * <p>
     * A list of recommended alarms that are used in the test and must be exported before or with the test.
     * </p>
     * 
     * @return A list of recommended alarms that are used in the test and must be exported before or with the test.
     */

    public java.util.List<String> getDependsOnAlarms() {
        return dependsOnAlarms;
    }

    /**
     * <p>
     * A list of recommended alarms that are used in the test and must be exported before or with the test.
     * </p>
     * 
     * @param dependsOnAlarms
     *        A list of recommended alarms that are used in the test and must be exported before or with the test.
     */

    public void setDependsOnAlarms(java.util.Collection<String> dependsOnAlarms) {
        if (dependsOnAlarms == null) {
            this.dependsOnAlarms = null;
            return;
        }

        this.dependsOnAlarms = new java.util.ArrayList<String>(dependsOnAlarms);
    }

    /**
     * <p>
     * A list of recommended alarms that are used in the test and must be exported before or with the test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOnAlarms(java.util.Collection)} or {@link #withDependsOnAlarms(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dependsOnAlarms
     *        A list of recommended alarms that are used in the test and must be exported before or with the test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withDependsOnAlarms(String... dependsOnAlarms) {
        if (this.dependsOnAlarms == null) {
            setDependsOnAlarms(new java.util.ArrayList<String>(dependsOnAlarms.length));
        }
        for (String ele : dependsOnAlarms) {
            this.dependsOnAlarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recommended alarms that are used in the test and must be exported before or with the test.
     * </p>
     * 
     * @param dependsOnAlarms
     *        A list of recommended alarms that are used in the test and must be exported before or with the test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withDependsOnAlarms(java.util.Collection<String> dependsOnAlarms) {
        setDependsOnAlarms(dependsOnAlarms);
        return this;
    }

    /**
     * <p>
     * The description for the test recommendation.
     * </p>
     * 
     * @param description
     *        The description for the test recommendation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the test recommendation.
     * </p>
     * 
     * @return The description for the test recommendation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the test recommendation.
     * </p>
     * 
     * @param description
     *        The description for the test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The intent of the test recommendation.
     * </p>
     * 
     * @param intent
     *        The intent of the test recommendation.
     */

    public void setIntent(String intent) {
        this.intent = intent;
    }

    /**
     * <p>
     * The intent of the test recommendation.
     * </p>
     * 
     * @return The intent of the test recommendation.
     */

    public String getIntent() {
        return this.intent;
    }

    /**
     * <p>
     * The intent of the test recommendation.
     * </p>
     * 
     * @param intent
     *        The intent of the test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withIntent(String intent) {
        setIntent(intent);
        return this;
    }

    /**
     * <p>
     * The test recommendation items.
     * </p>
     * 
     * @return The test recommendation items.
     */

    public java.util.List<RecommendationItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The test recommendation items.
     * </p>
     * 
     * @param items
     *        The test recommendation items.
     */

    public void setItems(java.util.Collection<RecommendationItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<RecommendationItem>(items);
    }

    /**
     * <p>
     * The test recommendation items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The test recommendation items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withItems(RecommendationItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<RecommendationItem>(items.length));
        }
        for (RecommendationItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test recommendation items.
     * </p>
     * 
     * @param items
     *        The test recommendation items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withItems(java.util.Collection<RecommendationItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The name of the test recommendation.
     * </p>
     * 
     * @param name
     *        The name of the test recommendation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test recommendation.
     * </p>
     * 
     * @return The name of the test recommendation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test recommendation.
     * </p>
     * 
     * @param name
     *        The name of the test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The prerequisite of the test recommendation.
     * </p>
     * 
     * @param prerequisite
     *        The prerequisite of the test recommendation.
     */

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    /**
     * <p>
     * The prerequisite of the test recommendation.
     * </p>
     * 
     * @return The prerequisite of the test recommendation.
     */

    public String getPrerequisite() {
        return this.prerequisite;
    }

    /**
     * <p>
     * The prerequisite of the test recommendation.
     * </p>
     * 
     * @param prerequisite
     *        The prerequisite of the test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withPrerequisite(String prerequisite) {
        setPrerequisite(prerequisite);
        return this;
    }

    /**
     * <p>
     * Identifier for the test recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Identifier for the test recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * Identifier for the test recommendation.
     * </p>
     * 
     * @return Identifier for the test recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * Identifier for the test recommendation.
     * </p>
     * 
     * @param recommendationId
     *        Identifier for the test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The reference identifier for the test recommendation.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier for the test recommendation.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference identifier for the test recommendation.
     * </p>
     * 
     * @return The reference identifier for the test recommendation.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The reference identifier for the test recommendation.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier for the test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRecommendation withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The level of risk for this test recommendation.
     * </p>
     * 
     * @param risk
     *        The level of risk for this test recommendation.
     * @see TestRisk
     */

    public void setRisk(String risk) {
        this.risk = risk;
    }

    /**
     * <p>
     * The level of risk for this test recommendation.
     * </p>
     * 
     * @return The level of risk for this test recommendation.
     * @see TestRisk
     */

    public String getRisk() {
        return this.risk;
    }

    /**
     * <p>
     * The level of risk for this test recommendation.
     * </p>
     * 
     * @param risk
     *        The level of risk for this test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestRisk
     */

    public TestRecommendation withRisk(String risk) {
        setRisk(risk);
        return this;
    }

    /**
     * <p>
     * The level of risk for this test recommendation.
     * </p>
     * 
     * @param risk
     *        The level of risk for this test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestRisk
     */

    public TestRecommendation withRisk(TestRisk risk) {
        this.risk = risk.toString();
        return this;
    }

    /**
     * <p>
     * The type of test recommendation.
     * </p>
     * 
     * @param type
     *        The type of test recommendation.
     * @see TestType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of test recommendation.
     * </p>
     * 
     * @return The type of test recommendation.
     * @see TestType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of test recommendation.
     * </p>
     * 
     * @param type
     *        The type of test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestType
     */

    public TestRecommendation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of test recommendation.
     * </p>
     * 
     * @param type
     *        The type of test recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestType
     */

    public TestRecommendation withType(TestType type) {
        this.type = type.toString();
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
        if (getAppComponentName() != null)
            sb.append("AppComponentName: ").append(getAppComponentName()).append(",");
        if (getDependsOnAlarms() != null)
            sb.append("DependsOnAlarms: ").append(getDependsOnAlarms()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIntent() != null)
            sb.append("Intent: ").append(getIntent()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrerequisite() != null)
            sb.append("Prerequisite: ").append(getPrerequisite()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getRisk() != null)
            sb.append("Risk: ").append(getRisk()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRecommendation == false)
            return false;
        TestRecommendation other = (TestRecommendation) obj;
        if (other.getAppComponentName() == null ^ this.getAppComponentName() == null)
            return false;
        if (other.getAppComponentName() != null && other.getAppComponentName().equals(this.getAppComponentName()) == false)
            return false;
        if (other.getDependsOnAlarms() == null ^ this.getDependsOnAlarms() == null)
            return false;
        if (other.getDependsOnAlarms() != null && other.getDependsOnAlarms().equals(this.getDependsOnAlarms()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntent() == null ^ this.getIntent() == null)
            return false;
        if (other.getIntent() != null && other.getIntent().equals(this.getIntent()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrerequisite() == null ^ this.getPrerequisite() == null)
            return false;
        if (other.getPrerequisite() != null && other.getPrerequisite().equals(this.getPrerequisite()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getRisk() == null ^ this.getRisk() == null)
            return false;
        if (other.getRisk() != null && other.getRisk().equals(this.getRisk()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppComponentName() == null) ? 0 : getAppComponentName().hashCode());
        hashCode = prime * hashCode + ((getDependsOnAlarms() == null) ? 0 : getDependsOnAlarms().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIntent() == null) ? 0 : getIntent().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrerequisite() == null) ? 0 : getPrerequisite().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getRisk() == null) ? 0 : getRisk().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TestRecommendation clone() {
        try {
            return (TestRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.TestRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
