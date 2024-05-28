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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateCalculatedAttributeDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCalculatedAttributeDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     */
    private String calculatedAttributeName;
    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     */
    private Conditions conditions;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCalculatedAttributeDefinitionRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @param calculatedAttributeName
     *        The unique name of the calculated attribute.
     */

    public void setCalculatedAttributeName(String calculatedAttributeName) {
        this.calculatedAttributeName = calculatedAttributeName;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @return The unique name of the calculated attribute.
     */

    public String getCalculatedAttributeName() {
        return this.calculatedAttributeName;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @param calculatedAttributeName
     *        The unique name of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCalculatedAttributeDefinitionRequest withCalculatedAttributeName(String calculatedAttributeName) {
        setCalculatedAttributeName(calculatedAttributeName);
        return this;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @param displayName
     *        The display name of the calculated attribute.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @return The display name of the calculated attribute.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @param displayName
     *        The display name of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCalculatedAttributeDefinitionRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     * 
     * @param description
     *        The description of the calculated attribute.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     * 
     * @return The description of the calculated attribute.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     * 
     * @param description
     *        The description of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCalculatedAttributeDefinitionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     * 
     * @param conditions
     *        The conditions including range, object count, and threshold for the calculated attribute.
     */

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     * 
     * @return The conditions including range, object count, and threshold for the calculated attribute.
     */

    public Conditions getConditions() {
        return this.conditions;
    }

    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     * 
     * @param conditions
     *        The conditions including range, object count, and threshold for the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCalculatedAttributeDefinitionRequest withConditions(Conditions conditions) {
        setConditions(conditions);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getCalculatedAttributeName() != null)
            sb.append("CalculatedAttributeName: ").append(getCalculatedAttributeName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCalculatedAttributeDefinitionRequest == false)
            return false;
        UpdateCalculatedAttributeDefinitionRequest other = (UpdateCalculatedAttributeDefinitionRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCalculatedAttributeName() == null ^ this.getCalculatedAttributeName() == null)
            return false;
        if (other.getCalculatedAttributeName() != null && other.getCalculatedAttributeName().equals(this.getCalculatedAttributeName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getCalculatedAttributeName() == null) ? 0 : getCalculatedAttributeName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCalculatedAttributeDefinitionRequest clone() {
        return (UpdateCalculatedAttributeDefinitionRequest) super.clone();
    }

}
