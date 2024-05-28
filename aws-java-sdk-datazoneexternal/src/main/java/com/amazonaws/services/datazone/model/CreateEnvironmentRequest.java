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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the Amazon DataZone environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the environment profile that is used to create this Amazon DataZone environment.
     * </p>
     */
    private String environmentProfileIdentifier;
    /**
     * <p>
     * The glossary terms that can be used in this Amazon DataZone environment.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the Amazon DataZone project in which this environment is created.
     * </p>
     */
    private String projectIdentifier;
    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     */
    private java.util.List<EnvironmentParameter> userParameters;

    /**
     * <p>
     * The description of the Amazon DataZone environment.
     * </p>
     * 
     * @param description
     *        The description of the Amazon DataZone environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Amazon DataZone environment.
     * </p>
     * 
     * @return The description of the Amazon DataZone environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Amazon DataZone environment.
     * </p>
     * 
     * @param description
     *        The description of the Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which the environment is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment is created.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which the environment is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which the environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment profile that is used to create this Amazon DataZone environment.
     * </p>
     * 
     * @param environmentProfileIdentifier
     *        The identifier of the environment profile that is used to create this Amazon DataZone environment.
     */

    public void setEnvironmentProfileIdentifier(String environmentProfileIdentifier) {
        this.environmentProfileIdentifier = environmentProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment profile that is used to create this Amazon DataZone environment.
     * </p>
     * 
     * @return The identifier of the environment profile that is used to create this Amazon DataZone environment.
     */

    public String getEnvironmentProfileIdentifier() {
        return this.environmentProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment profile that is used to create this Amazon DataZone environment.
     * </p>
     * 
     * @param environmentProfileIdentifier
     *        The identifier of the environment profile that is used to create this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withEnvironmentProfileIdentifier(String environmentProfileIdentifier) {
        setEnvironmentProfileIdentifier(environmentProfileIdentifier);
        return this;
    }

    /**
     * <p>
     * The glossary terms that can be used in this Amazon DataZone environment.
     * </p>
     * 
     * @return The glossary terms that can be used in this Amazon DataZone environment.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms that can be used in this Amazon DataZone environment.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms that can be used in this Amazon DataZone environment.
     */

    public void setGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<String>(glossaryTerms);
    }

    /**
     * <p>
     * The glossary terms that can be used in this Amazon DataZone environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms that can be used in this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withGlossaryTerms(String... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<String>(glossaryTerms.length));
        }
        for (String ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The glossary terms that can be used in this Amazon DataZone environment.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms that can be used in this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     * 
     * @return The name of the Amazon DataZone environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone environment.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project in which this environment is created.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project in which this environment is created.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project in which this environment is created.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone project in which this environment is created.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project in which this environment is created.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project in which this environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
        return this;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * 
     * @return The user parameters of this Amazon DataZone environment.
     */

    public java.util.List<EnvironmentParameter> getUserParameters() {
        return userParameters;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment.
     */

    public void setUserParameters(java.util.Collection<EnvironmentParameter> userParameters) {
        if (userParameters == null) {
            this.userParameters = null;
            return;
        }

        this.userParameters = new java.util.ArrayList<EnvironmentParameter>(userParameters);
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserParameters(java.util.Collection)} or {@link #withUserParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withUserParameters(EnvironmentParameter... userParameters) {
        if (this.userParameters == null) {
            setUserParameters(new java.util.ArrayList<EnvironmentParameter>(userParameters.length));
        }
        for (EnvironmentParameter ele : userParameters) {
            this.userParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withUserParameters(java.util.Collection<EnvironmentParameter> userParameters) {
        setUserParameters(userParameters);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentProfileIdentifier() != null)
            sb.append("EnvironmentProfileIdentifier: ").append(getEnvironmentProfileIdentifier()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier()).append(",");
        if (getUserParameters() != null)
            sb.append("UserParameters: ").append(getUserParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentProfileIdentifier() == null ^ this.getEnvironmentProfileIdentifier() == null)
            return false;
        if (other.getEnvironmentProfileIdentifier() != null && other.getEnvironmentProfileIdentifier().equals(this.getEnvironmentProfileIdentifier()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
            return false;
        if (other.getUserParameters() == null ^ this.getUserParameters() == null)
            return false;
        if (other.getUserParameters() != null && other.getUserParameters().equals(this.getUserParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentProfileIdentifier() == null) ? 0 : getEnvironmentProfileIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUserParameters() == null) ? 0 : getUserParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
