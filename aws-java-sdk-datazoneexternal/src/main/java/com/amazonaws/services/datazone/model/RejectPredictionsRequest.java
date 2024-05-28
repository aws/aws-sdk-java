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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectPredictions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectPredictionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
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
     * The identifier of the prediction.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be rejected.
     * </p>
     */
    private java.util.List<RejectChoice> rejectChoices;
    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be rejected.
     * </p>
     */
    private RejectRule rejectRule;
    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     */
    private String revision;

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

    public RejectPredictionsRequest withClientToken(String clientToken) {
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

    public RejectPredictionsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the prediction.
     * </p>
     * 
     * @param identifier
     *        The identifier of the prediction.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the prediction.
     * </p>
     * 
     * @return The identifier of the prediction.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the prediction.
     * </p>
     * 
     * @param identifier
     *        The identifier of the prediction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectPredictionsRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be rejected.
     * </p>
     * 
     * @return Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for
     *         example, a column name) that can be rejected.
     */

    public java.util.List<RejectChoice> getRejectChoices() {
        return rejectChoices;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be rejected.
     * </p>
     * 
     * @param rejectChoices
     *        Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example,
     *        a column name) that can be rejected.
     */

    public void setRejectChoices(java.util.Collection<RejectChoice> rejectChoices) {
        if (rejectChoices == null) {
            this.rejectChoices = null;
            return;
        }

        this.rejectChoices = new java.util.ArrayList<RejectChoice>(rejectChoices);
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be rejected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRejectChoices(java.util.Collection)} or {@link #withRejectChoices(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rejectChoices
     *        Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example,
     *        a column name) that can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectPredictionsRequest withRejectChoices(RejectChoice... rejectChoices) {
        if (this.rejectChoices == null) {
            setRejectChoices(new java.util.ArrayList<RejectChoice>(rejectChoices.length));
        }
        for (RejectChoice ele : rejectChoices) {
            this.rejectChoices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a
     * column name) that can be rejected.
     * </p>
     * 
     * @param rejectChoices
     *        Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example,
     *        a column name) that can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectPredictionsRequest withRejectChoices(java.util.Collection<RejectChoice> rejectChoices) {
        setRejectChoices(rejectChoices);
        return this;
    }

    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be rejected.
     * </p>
     * 
     * @param rejectRule
     *        Specifies the rule (or the conditions) under which a prediction can be rejected.
     */

    public void setRejectRule(RejectRule rejectRule) {
        this.rejectRule = rejectRule;
    }

    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be rejected.
     * </p>
     * 
     * @return Specifies the rule (or the conditions) under which a prediction can be rejected.
     */

    public RejectRule getRejectRule() {
        return this.rejectRule;
    }

    /**
     * <p>
     * Specifies the rule (or the conditions) under which a prediction can be rejected.
     * </p>
     * 
     * @param rejectRule
     *        Specifies the rule (or the conditions) under which a prediction can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectPredictionsRequest withRejectRule(RejectRule rejectRule) {
        setRejectRule(rejectRule);
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

    public RejectPredictionsRequest withRevision(String revision) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRejectChoices() != null)
            sb.append("RejectChoices: ").append(getRejectChoices()).append(",");
        if (getRejectRule() != null)
            sb.append("RejectRule: ").append(getRejectRule()).append(",");
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

        if (obj instanceof RejectPredictionsRequest == false)
            return false;
        RejectPredictionsRequest other = (RejectPredictionsRequest) obj;
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
        if (other.getRejectChoices() == null ^ this.getRejectChoices() == null)
            return false;
        if (other.getRejectChoices() != null && other.getRejectChoices().equals(this.getRejectChoices()) == false)
            return false;
        if (other.getRejectRule() == null ^ this.getRejectRule() == null)
            return false;
        if (other.getRejectRule() != null && other.getRejectRule().equals(this.getRejectRule()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRejectChoices() == null) ? 0 : getRejectChoices().hashCode());
        hashCode = prime * hashCode + ((getRejectRule() == null) ? 0 : getRejectRule().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public RejectPredictionsRequest clone() {
        return (RejectPredictionsRequest) super.clone();
    }

}
