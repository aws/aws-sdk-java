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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptPredictions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptPredictionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be accepted.
     * </p>
     */
    private java.util.List<AcceptChoice> acceptChoices;
    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be accepted.
     * </p>
     */
    private AcceptRule acceptRule;
    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the asset.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be accepted.
     * </p>
     * 
     * @return Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for
     *         example, a column name) that can be accepted.
     */

    public java.util.List<AcceptChoice> getAcceptChoices() {
        return acceptChoices;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be accepted.
     * </p>
     * 
     * @param acceptChoices
     *        Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example,
     *        a column name) that can be accepted.
     */

    public void setAcceptChoices(java.util.Collection<AcceptChoice> acceptChoices) {
        if (acceptChoices == null) {
            this.acceptChoices = null;
            return;
        }

        this.acceptChoices = new java.util.ArrayList<AcceptChoice>(acceptChoices);
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be accepted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceptChoices(java.util.Collection)} or {@link #withAcceptChoices(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param acceptChoices
     *        Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example,
     *        a column name) that can be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPredictionsRequest withAcceptChoices(AcceptChoice... acceptChoices) {
        if (this.acceptChoices == null) {
            setAcceptChoices(new java.util.ArrayList<AcceptChoice>(acceptChoices.length));
        }
        for (AcceptChoice ele : acceptChoices) {
            this.acceptChoices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be accepted.
     * </p>
     * 
     * @param acceptChoices
     *        Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example,
     *        a column name) that can be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPredictionsRequest withAcceptChoices(java.util.Collection<AcceptChoice> acceptChoices) {
        setAcceptChoices(acceptChoices);
        return this;
    }

    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be accepted.
     * </p>
     * 
     * @param acceptRule
     *        Specifies the rule (or the conditions) under which a prediction can be accepted.
     */

    public void setAcceptRule(AcceptRule acceptRule) {
        this.acceptRule = acceptRule;
    }

    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be accepted.
     * </p>
     * 
     * @return Specifies the rule (or the conditions) under which a prediction can be accepted.
     */

    public AcceptRule getAcceptRule() {
        return this.acceptRule;
    }

    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be accepted.
     * </p>
     * 
     * @param acceptRule
     *        Specifies the rule (or the conditions) under which a prediction can be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPredictionsRequest withAcceptRule(AcceptRule acceptRule) {
        setAcceptRule(acceptRule);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically
     *        populated if not provided.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically
     *         populated if not provided.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically
     *        populated if not provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPredictionsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPredictionsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
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

    public AcceptPredictionsRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     * 
     * @param revision
     *        The revision that is to be made to the asset.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     * 
     * @return The revision that is to be made to the asset.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     * 
     * @param revision
     *        The revision that is to be made to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPredictionsRequest withRevision(String revision) {
        setRevision(revision);
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
        if (getAcceptChoices() != null)
            sb.append("AcceptChoices: ").append(getAcceptChoices()).append(",");
        if (getAcceptRule() != null)
            sb.append("AcceptRule: ").append(getAcceptRule()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptPredictionsRequest == false)
            return false;
        AcceptPredictionsRequest other = (AcceptPredictionsRequest) obj;
        if (other.getAcceptChoices() == null ^ this.getAcceptChoices() == null)
            return false;
        if (other.getAcceptChoices() != null && other.getAcceptChoices().equals(this.getAcceptChoices()) == false)
            return false;
        if (other.getAcceptRule() == null ^ this.getAcceptRule() == null)
            return false;
        if (other.getAcceptRule() != null && other.getAcceptRule().equals(this.getAcceptRule()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptChoices() == null) ? 0 : getAcceptChoices().hashCode());
        hashCode = prime * hashCode + ((getAcceptRule() == null) ? 0 : getAcceptRule().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public AcceptPredictionsRequest clone() {
        return (AcceptPredictionsRequest) super.clone();
    }

}
