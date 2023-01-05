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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetResourceEvaluationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceEvaluationSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want to
     * retrieve the evaluation summary.
     * </p>
     */
    private String resourceEvaluationId;
    /**
     * <p>
     * Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values are
     * Detective or Proactive.
     * </p>
     */
    private String evaluationMode;
    /**
     * <p>
     * Returns an <code>EvaluationStatus</code> object.
     * </p>
     */
    private EvaluationStatus evaluationStatus;
    /**
     * <p>
     * The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     * </p>
     */
    private java.util.Date evaluationStartTimestamp;
    /**
     * <p>
     * The compliance status of the resource evaluation summary.
     * </p>
     */
    private String compliance;
    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     */
    private EvaluationContext evaluationContext;
    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     */
    private ResourceDetails resourceDetails;

    /**
     * <p>
     * The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want to
     * retrieve the evaluation summary.
     * </p>
     * 
     * @param resourceEvaluationId
     *        The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want
     *        to retrieve the evaluation summary.
     */

    public void setResourceEvaluationId(String resourceEvaluationId) {
        this.resourceEvaluationId = resourceEvaluationId;
    }

    /**
     * <p>
     * The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want to
     * retrieve the evaluation summary.
     * </p>
     * 
     * @return The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want
     *         to retrieve the evaluation summary.
     */

    public String getResourceEvaluationId() {
        return this.resourceEvaluationId;
    }

    /**
     * <p>
     * The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want to
     * retrieve the evaluation summary.
     * </p>
     * 
     * @param resourceEvaluationId
     *        The unique <code>ResourceEvaluationId</code> of Amazon Web Services resource execution for which you want
     *        to retrieve the evaluation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEvaluationSummaryResult withResourceEvaluationId(String resourceEvaluationId) {
        setResourceEvaluationId(resourceEvaluationId);
        return this;
    }

    /**
     * <p>
     * Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values are
     * Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values
     *        are Detective or Proactive.
     * @see EvaluationMode
     */

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    /**
     * <p>
     * Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values are
     * Detective or Proactive.
     * </p>
     * 
     * @return Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid
     *         values are Detective or Proactive.
     * @see EvaluationMode
     */

    public String getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * <p>
     * Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values are
     * Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values
     *        are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public GetResourceEvaluationSummaryResult withEvaluationMode(String evaluationMode) {
        setEvaluationMode(evaluationMode);
        return this;
    }

    /**
     * <p>
     * Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values are
     * Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values
     *        are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public GetResourceEvaluationSummaryResult withEvaluationMode(EvaluationMode evaluationMode) {
        this.evaluationMode = evaluationMode.toString();
        return this;
    }

    /**
     * <p>
     * Returns an <code>EvaluationStatus</code> object.
     * </p>
     * 
     * @param evaluationStatus
     *        Returns an <code>EvaluationStatus</code> object.
     */

    public void setEvaluationStatus(EvaluationStatus evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    /**
     * <p>
     * Returns an <code>EvaluationStatus</code> object.
     * </p>
     * 
     * @return Returns an <code>EvaluationStatus</code> object.
     */

    public EvaluationStatus getEvaluationStatus() {
        return this.evaluationStatus;
    }

    /**
     * <p>
     * Returns an <code>EvaluationStatus</code> object.
     * </p>
     * 
     * @param evaluationStatus
     *        Returns an <code>EvaluationStatus</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEvaluationSummaryResult withEvaluationStatus(EvaluationStatus evaluationStatus) {
        setEvaluationStatus(evaluationStatus);
        return this;
    }

    /**
     * <p>
     * The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     * </p>
     * 
     * @param evaluationStartTimestamp
     *        The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     */

    public void setEvaluationStartTimestamp(java.util.Date evaluationStartTimestamp) {
        this.evaluationStartTimestamp = evaluationStartTimestamp;
    }

    /**
     * <p>
     * The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     * </p>
     * 
     * @return The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     */

    public java.util.Date getEvaluationStartTimestamp() {
        return this.evaluationStartTimestamp;
    }

    /**
     * <p>
     * The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     * </p>
     * 
     * @param evaluationStartTimestamp
     *        The start timestamp when Config rule starts evaluating compliance for the provided resource details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEvaluationSummaryResult withEvaluationStartTimestamp(java.util.Date evaluationStartTimestamp) {
        setEvaluationStartTimestamp(evaluationStartTimestamp);
        return this;
    }

    /**
     * <p>
     * The compliance status of the resource evaluation summary.
     * </p>
     * 
     * @param compliance
     *        The compliance status of the resource evaluation summary.
     * @see ComplianceType
     */

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * The compliance status of the resource evaluation summary.
     * </p>
     * 
     * @return The compliance status of the resource evaluation summary.
     * @see ComplianceType
     */

    public String getCompliance() {
        return this.compliance;
    }

    /**
     * <p>
     * The compliance status of the resource evaluation summary.
     * </p>
     * 
     * @param compliance
     *        The compliance status of the resource evaluation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetResourceEvaluationSummaryResult withCompliance(String compliance) {
        setCompliance(compliance);
        return this;
    }

    /**
     * <p>
     * The compliance status of the resource evaluation summary.
     * </p>
     * 
     * @param compliance
     *        The compliance status of the resource evaluation summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetResourceEvaluationSummaryResult withCompliance(ComplianceType compliance) {
        this.compliance = compliance.toString();
        return this;
    }

    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     * 
     * @param evaluationContext
     *        Returns an <code>EvaluationContext</code> object.
     */

    public void setEvaluationContext(EvaluationContext evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     * 
     * @return Returns an <code>EvaluationContext</code> object.
     */

    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }

    /**
     * <p>
     * Returns an <code>EvaluationContext</code> object.
     * </p>
     * 
     * @param evaluationContext
     *        Returns an <code>EvaluationContext</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEvaluationSummaryResult withEvaluationContext(EvaluationContext evaluationContext) {
        setEvaluationContext(evaluationContext);
        return this;
    }

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     * 
     * @param resourceDetails
     *        Returns a <code>ResourceDetails</code> object.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     * 
     * @return Returns a <code>ResourceDetails</code> object.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Returns a <code>ResourceDetails</code> object.
     * </p>
     * 
     * @param resourceDetails
     *        Returns a <code>ResourceDetails</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEvaluationSummaryResult withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
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
        if (getResourceEvaluationId() != null)
            sb.append("ResourceEvaluationId: ").append(getResourceEvaluationId()).append(",");
        if (getEvaluationMode() != null)
            sb.append("EvaluationMode: ").append(getEvaluationMode()).append(",");
        if (getEvaluationStatus() != null)
            sb.append("EvaluationStatus: ").append(getEvaluationStatus()).append(",");
        if (getEvaluationStartTimestamp() != null)
            sb.append("EvaluationStartTimestamp: ").append(getEvaluationStartTimestamp()).append(",");
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance()).append(",");
        if (getEvaluationContext() != null)
            sb.append("EvaluationContext: ").append(getEvaluationContext()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceEvaluationSummaryResult == false)
            return false;
        GetResourceEvaluationSummaryResult other = (GetResourceEvaluationSummaryResult) obj;
        if (other.getResourceEvaluationId() == null ^ this.getResourceEvaluationId() == null)
            return false;
        if (other.getResourceEvaluationId() != null && other.getResourceEvaluationId().equals(this.getResourceEvaluationId()) == false)
            return false;
        if (other.getEvaluationMode() == null ^ this.getEvaluationMode() == null)
            return false;
        if (other.getEvaluationMode() != null && other.getEvaluationMode().equals(this.getEvaluationMode()) == false)
            return false;
        if (other.getEvaluationStatus() == null ^ this.getEvaluationStatus() == null)
            return false;
        if (other.getEvaluationStatus() != null && other.getEvaluationStatus().equals(this.getEvaluationStatus()) == false)
            return false;
        if (other.getEvaluationStartTimestamp() == null ^ this.getEvaluationStartTimestamp() == null)
            return false;
        if (other.getEvaluationStartTimestamp() != null && other.getEvaluationStartTimestamp().equals(this.getEvaluationStartTimestamp()) == false)
            return false;
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
            return false;
        if (other.getEvaluationContext() == null ^ this.getEvaluationContext() == null)
            return false;
        if (other.getEvaluationContext() != null && other.getEvaluationContext().equals(this.getEvaluationContext()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceEvaluationId() == null) ? 0 : getResourceEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMode() == null) ? 0 : getEvaluationMode().hashCode());
        hashCode = prime * hashCode + ((getEvaluationStatus() == null) ? 0 : getEvaluationStatus().hashCode());
        hashCode = prime * hashCode + ((getEvaluationStartTimestamp() == null) ? 0 : getEvaluationStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        hashCode = prime * hashCode + ((getEvaluationContext() == null) ? 0 : getEvaluationContext().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceEvaluationSummaryResult clone() {
        try {
            return (GetResourceEvaluationSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
