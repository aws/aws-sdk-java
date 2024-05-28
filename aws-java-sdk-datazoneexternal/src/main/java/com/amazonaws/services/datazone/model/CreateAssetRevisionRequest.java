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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The revised description of the asset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the domain where the asset is being revised.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The metadata forms to be attached to the asset as part of asset revision.
     * </p>
     */
    private java.util.List<FormInput> formsInput;
    /**
     * <p>
     * The glossary terms to be attached to the asset as part of asset revision.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * The identifier of the asset.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Te revised name of the asset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration of the automatically generated business-friendly metadata for the asset.
     * </p>
     */
    private PredictionConfiguration predictionConfiguration;
    /**
     * <p>
     * The revision type of the asset.
     * </p>
     */
    private String typeRevision;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The revised description of the asset.
     * </p>
     * 
     * @param description
     *        The revised description of the asset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The revised description of the asset.
     * </p>
     * 
     * @return The revised description of the asset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The revised description of the asset.
     * </p>
     * 
     * @param description
     *        The revised description of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the domain where the asset is being revised.
     * </p>
     * 
     * @param domainIdentifier
     *        The unique identifier of the domain where the asset is being revised.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the domain where the asset is being revised.
     * </p>
     * 
     * @return The unique identifier of the domain where the asset is being revised.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the domain where the asset is being revised.
     * </p>
     * 
     * @param domainIdentifier
     *        The unique identifier of the domain where the asset is being revised.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The metadata forms to be attached to the asset as part of asset revision.
     * </p>
     * 
     * @return The metadata forms to be attached to the asset as part of asset revision.
     */

    public java.util.List<FormInput> getFormsInput() {
        return formsInput;
    }

    /**
     * <p>
     * The metadata forms to be attached to the asset as part of asset revision.
     * </p>
     * 
     * @param formsInput
     *        The metadata forms to be attached to the asset as part of asset revision.
     */

    public void setFormsInput(java.util.Collection<FormInput> formsInput) {
        if (formsInput == null) {
            this.formsInput = null;
            return;
        }

        this.formsInput = new java.util.ArrayList<FormInput>(formsInput);
    }

    /**
     * <p>
     * The metadata forms to be attached to the asset as part of asset revision.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormsInput(java.util.Collection)} or {@link #withFormsInput(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param formsInput
     *        The metadata forms to be attached to the asset as part of asset revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withFormsInput(FormInput... formsInput) {
        if (this.formsInput == null) {
            setFormsInput(new java.util.ArrayList<FormInput>(formsInput.length));
        }
        for (FormInput ele : formsInput) {
            this.formsInput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata forms to be attached to the asset as part of asset revision.
     * </p>
     * 
     * @param formsInput
     *        The metadata forms to be attached to the asset as part of asset revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withFormsInput(java.util.Collection<FormInput> formsInput) {
        setFormsInput(formsInput);
        return this;
    }

    /**
     * <p>
     * The glossary terms to be attached to the asset as part of asset revision.
     * </p>
     * 
     * @return The glossary terms to be attached to the asset as part of asset revision.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms to be attached to the asset as part of asset revision.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms to be attached to the asset as part of asset revision.
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
     * The glossary terms to be attached to the asset as part of asset revision.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms to be attached to the asset as part of asset revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withGlossaryTerms(String... glossaryTerms) {
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
     * The glossary terms to be attached to the asset as part of asset revision.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms to be attached to the asset as part of asset revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The identifier of the asset.
     * </p>
     * 
     * @param identifier
     *        The identifier of the asset.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the asset.
     * </p>
     * 
     * @return The identifier of the asset.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the asset.
     * </p>
     * 
     * @param identifier
     *        The identifier of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Te revised name of the asset.
     * </p>
     * 
     * @param name
     *        Te revised name of the asset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Te revised name of the asset.
     * </p>
     * 
     * @return Te revised name of the asset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Te revised name of the asset.
     * </p>
     * 
     * @param name
     *        Te revised name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration of the automatically generated business-friendly metadata for the asset.
     * </p>
     * 
     * @param predictionConfiguration
     *        The configuration of the automatically generated business-friendly metadata for the asset.
     */

    public void setPredictionConfiguration(PredictionConfiguration predictionConfiguration) {
        this.predictionConfiguration = predictionConfiguration;
    }

    /**
     * <p>
     * The configuration of the automatically generated business-friendly metadata for the asset.
     * </p>
     * 
     * @return The configuration of the automatically generated business-friendly metadata for the asset.
     */

    public PredictionConfiguration getPredictionConfiguration() {
        return this.predictionConfiguration;
    }

    /**
     * <p>
     * The configuration of the automatically generated business-friendly metadata for the asset.
     * </p>
     * 
     * @param predictionConfiguration
     *        The configuration of the automatically generated business-friendly metadata for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withPredictionConfiguration(PredictionConfiguration predictionConfiguration) {
        setPredictionConfiguration(predictionConfiguration);
        return this;
    }

    /**
     * <p>
     * The revision type of the asset.
     * </p>
     * 
     * @param typeRevision
     *        The revision type of the asset.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The revision type of the asset.
     * </p>
     * 
     * @return The revision type of the asset.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The revision type of the asset.
     * </p>
     * 
     * @param typeRevision
     *        The revision type of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRevisionRequest withTypeRevision(String typeRevision) {
        setTypeRevision(typeRevision);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getFormsInput() != null)
            sb.append("FormsInput: ").append("***Sensitive Data Redacted***").append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getPredictionConfiguration() != null)
            sb.append("PredictionConfiguration: ").append(getPredictionConfiguration()).append(",");
        if (getTypeRevision() != null)
            sb.append("TypeRevision: ").append(getTypeRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetRevisionRequest == false)
            return false;
        CreateAssetRevisionRequest other = (CreateAssetRevisionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getFormsInput() == null ^ this.getFormsInput() == null)
            return false;
        if (other.getFormsInput() != null && other.getFormsInput().equals(this.getFormsInput()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPredictionConfiguration() == null ^ this.getPredictionConfiguration() == null)
            return false;
        if (other.getPredictionConfiguration() != null && other.getPredictionConfiguration().equals(this.getPredictionConfiguration()) == false)
            return false;
        if (other.getTypeRevision() == null ^ this.getTypeRevision() == null)
            return false;
        if (other.getTypeRevision() != null && other.getTypeRevision().equals(this.getTypeRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFormsInput() == null) ? 0 : getFormsInput().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPredictionConfiguration() == null) ? 0 : getPredictionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetRevisionRequest clone() {
        return (CreateAssetRevisionRequest) super.clone();
    }

}
