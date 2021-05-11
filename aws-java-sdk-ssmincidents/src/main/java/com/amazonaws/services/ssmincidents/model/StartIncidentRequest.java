/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/StartIncident" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartIncidentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     */
    private Integer impact;
    /**
     * <p>
     * Add related items to the incident for other responders to use. Related items are AWS resources, external links,
     * or files uploaded to an S3 bucket.
     * </p>
     */
    private java.util.List<RelatedItem> relatedItems;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     * runbooks, title, and impact of the incident.
     * </p>
     */
    private String responsePlanArn;
    /**
     * <p>
     * Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     * </p>
     */
    private String title;
    /**
     * <p>
     * Details of what created the incident record in Incident Manager.
     * </p>
     */
    private TriggerDetails triggerDetails;

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param impact
     *        Defines the impact to the customers. Providing an impact overwrites the impact provided by a response
     *        plan.</p>
     *        <p class="title">
     *        <b>Possible impacts:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to
     *        all customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> - High impact, partial application failure with impact to many customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3</code> - Medium impact, the application is providing reduced service to customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid
     *        impact.
     *        </p>
     *        </li>
     */

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the impact to the customers. Providing an impact overwrites the impact provided by a response
     *         plan.</p>
     *         <p class="title">
     *         <b>Possible impacts:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to
     *         all customers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2</code> - High impact, partial application failure with impact to many customers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>3</code> - Medium impact, the application is providing reduced service to customers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid
     *         impact.
     *         </p>
     *         </li>
     */

    public Integer getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.
     * </p>
     * <p class="title">
     * <b>Possible impacts:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to all
     * customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> - High impact, partial application failure with impact to many customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3</code> - Medium impact, the application is providing reduced service to customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param impact
     *        Defines the impact to the customers. Providing an impact overwrites the impact provided by a response
     *        plan.</p>
     *        <p class="title">
     *        <b>Possible impacts:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1</code> - Critical impact, this typically relates to full application failure that impacts many to
     *        all customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> - High impact, partial application failure with impact to many customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3</code> - Medium impact, the application is providing reduced service to customers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>4</code> - Low impact, customer might aren't impacted by the problem yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5</code> - No impact, customers aren't currently impacted but urgent action is needed to avoid
     *        impact.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withImpact(Integer impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * Add related items to the incident for other responders to use. Related items are AWS resources, external links,
     * or files uploaded to an S3 bucket.
     * </p>
     * 
     * @return Add related items to the incident for other responders to use. Related items are AWS resources, external
     *         links, or files uploaded to an S3 bucket.
     */

    public java.util.List<RelatedItem> getRelatedItems() {
        return relatedItems;
    }

    /**
     * <p>
     * Add related items to the incident for other responders to use. Related items are AWS resources, external links,
     * or files uploaded to an S3 bucket.
     * </p>
     * 
     * @param relatedItems
     *        Add related items to the incident for other responders to use. Related items are AWS resources, external
     *        links, or files uploaded to an S3 bucket.
     */

    public void setRelatedItems(java.util.Collection<RelatedItem> relatedItems) {
        if (relatedItems == null) {
            this.relatedItems = null;
            return;
        }

        this.relatedItems = new java.util.ArrayList<RelatedItem>(relatedItems);
    }

    /**
     * <p>
     * Add related items to the incident for other responders to use. Related items are AWS resources, external links,
     * or files uploaded to an S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedItems(java.util.Collection)} or {@link #withRelatedItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param relatedItems
     *        Add related items to the incident for other responders to use. Related items are AWS resources, external
     *        links, or files uploaded to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withRelatedItems(RelatedItem... relatedItems) {
        if (this.relatedItems == null) {
            setRelatedItems(new java.util.ArrayList<RelatedItem>(relatedItems.length));
        }
        for (RelatedItem ele : relatedItems) {
            this.relatedItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Add related items to the incident for other responders to use. Related items are AWS resources, external links,
     * or files uploaded to an S3 bucket.
     * </p>
     * 
     * @param relatedItems
     *        Add related items to the incident for other responders to use. Related items are AWS resources, external
     *        links, or files uploaded to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withRelatedItems(java.util.Collection<RelatedItem> relatedItems) {
        setRelatedItems(relatedItems);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     * runbooks, title, and impact of the incident.
     * </p>
     * 
     * @param responsePlanArn
     *        The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     *        runbooks, title, and impact of the incident.
     */

    public void setResponsePlanArn(String responsePlanArn) {
        this.responsePlanArn = responsePlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     * runbooks, title, and impact of the incident.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     *         runbooks, title, and impact of the incident.
     */

    public String getResponsePlanArn() {
        return this.responsePlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     * runbooks, title, and impact of the incident.
     * </p>
     * 
     * @param responsePlanArn
     *        The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, SNS topics,
     *        runbooks, title, and impact of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withResponsePlanArn(String responsePlanArn) {
        setResponsePlanArn(responsePlanArn);
        return this;
    }

    /**
     * <p>
     * Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     * </p>
     * 
     * @param title
     *        Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     * </p>
     * 
     * @return Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     * </p>
     * 
     * @param title
     *        Provide a title for the incident. Providing a title overwrites the title provided by the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Details of what created the incident record in Incident Manager.
     * </p>
     * 
     * @param triggerDetails
     *        Details of what created the incident record in Incident Manager.
     */

    public void setTriggerDetails(TriggerDetails triggerDetails) {
        this.triggerDetails = triggerDetails;
    }

    /**
     * <p>
     * Details of what created the incident record in Incident Manager.
     * </p>
     * 
     * @return Details of what created the incident record in Incident Manager.
     */

    public TriggerDetails getTriggerDetails() {
        return this.triggerDetails;
    }

    /**
     * <p>
     * Details of what created the incident record in Incident Manager.
     * </p>
     * 
     * @param triggerDetails
     *        Details of what created the incident record in Incident Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentRequest withTriggerDetails(TriggerDetails triggerDetails) {
        setTriggerDetails(triggerDetails);
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
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getRelatedItems() != null)
            sb.append("RelatedItems: ").append(getRelatedItems()).append(",");
        if (getResponsePlanArn() != null)
            sb.append("ResponsePlanArn: ").append(getResponsePlanArn()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getTriggerDetails() != null)
            sb.append("TriggerDetails: ").append(getTriggerDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartIncidentRequest == false)
            return false;
        StartIncidentRequest other = (StartIncidentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getRelatedItems() == null ^ this.getRelatedItems() == null)
            return false;
        if (other.getRelatedItems() != null && other.getRelatedItems().equals(this.getRelatedItems()) == false)
            return false;
        if (other.getResponsePlanArn() == null ^ this.getResponsePlanArn() == null)
            return false;
        if (other.getResponsePlanArn() != null && other.getResponsePlanArn().equals(this.getResponsePlanArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getTriggerDetails() == null ^ this.getTriggerDetails() == null)
            return false;
        if (other.getTriggerDetails() != null && other.getTriggerDetails().equals(this.getTriggerDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getRelatedItems() == null) ? 0 : getRelatedItems().hashCode());
        hashCode = prime * hashCode + ((getResponsePlanArn() == null) ? 0 : getResponsePlanArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getTriggerDetails() == null) ? 0 : getTriggerDetails().hashCode());
        return hashCode;
    }

    @Override
    public StartIncidentRequest clone() {
        return (StartIncidentRequest) super.clone();
    }

}
