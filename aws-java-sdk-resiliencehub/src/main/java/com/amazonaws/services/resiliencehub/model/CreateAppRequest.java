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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     */
    private String assessmentSchedule;
    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The optional description for an app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports only
     * <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * </p>
     */
    private java.util.List<EventSubscription> eventSubscriptions;
    /**
     * <p>
     * Name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     */
    private PermissionModel permissionModel;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @see AppAssessmentScheduleType
     */

    public void setAssessmentSchedule(String assessmentSchedule) {
        this.assessmentSchedule = assessmentSchedule;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @return Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @see AppAssessmentScheduleType
     */

    public String getAssessmentSchedule() {
        return this.assessmentSchedule;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAssessmentScheduleType
     */

    public CreateAppRequest withAssessmentSchedule(String assessmentSchedule) {
        setAssessmentSchedule(assessmentSchedule);
        return this;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAssessmentScheduleType
     */

    public CreateAppRequest withAssessmentSchedule(AppAssessmentScheduleType assessmentSchedule) {
        this.assessmentSchedule = assessmentSchedule.toString();
        return this;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @return Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *         characters. You should not reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @return The optional description for an app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports only
     * <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * </p>
     * 
     * @return The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *         supports only <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     */

    public java.util.List<EventSubscription> getEventSubscriptions() {
        return eventSubscriptions;
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports only
     * <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *        supports only <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     */

    public void setEventSubscriptions(java.util.Collection<EventSubscription> eventSubscriptions) {
        if (eventSubscriptions == null) {
            this.eventSubscriptions = null;
            return;
        }

        this.eventSubscriptions = new java.util.ArrayList<EventSubscription>(eventSubscriptions);
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports only
     * <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSubscriptions(java.util.Collection)} or {@link #withEventSubscriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *        supports only <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withEventSubscriptions(EventSubscription... eventSubscriptions) {
        if (this.eventSubscriptions == null) {
            setEventSubscriptions(new java.util.ArrayList<EventSubscription>(eventSubscriptions.length));
        }
        for (EventSubscription ele : eventSubscriptions) {
            this.eventSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports only
     * <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *        supports only <b>Drift detected</b> and <b>Scheduled assessment failure</b> events notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withEventSubscriptions(java.util.Collection<EventSubscription> eventSubscriptions) {
        setEventSubscriptions(eventSubscriptions);
        return this;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param name
     *        Name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @return Name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param name
     *        Name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     * 
     * @param permissionModel
     *        Defines the roles and credentials that Resilience Hub would use while creating the application, importing
     *        its resources, and running an assessment.
     */

    public void setPermissionModel(PermissionModel permissionModel) {
        this.permissionModel = permissionModel;
    }

    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     * 
     * @return Defines the roles and credentials that Resilience Hub would use while creating the application, importing
     *         its resources, and running an assessment.
     */

    public PermissionModel getPermissionModel() {
        return this.permissionModel;
    }

    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     * 
     * @param permissionModel
     *        Defines the roles and credentials that Resilience Hub would use while creating the application, importing
     *        its resources, and running an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withPermissionModel(PermissionModel permissionModel) {
        setPermissionModel(permissionModel);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param policyArn
     *        Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *         <code>policy-id</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param policyArn
     *        Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each
     *         tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAppRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAssessmentSchedule() != null)
            sb.append("AssessmentSchedule: ").append(getAssessmentSchedule()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventSubscriptions() != null)
            sb.append("EventSubscriptions: ").append(getEventSubscriptions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: ").append(getPermissionModel()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppRequest == false)
            return false;
        CreateAppRequest other = (CreateAppRequest) obj;
        if (other.getAssessmentSchedule() == null ^ this.getAssessmentSchedule() == null)
            return false;
        if (other.getAssessmentSchedule() != null && other.getAssessmentSchedule().equals(this.getAssessmentSchedule()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventSubscriptions() == null ^ this.getEventSubscriptions() == null)
            return false;
        if (other.getEventSubscriptions() != null && other.getEventSubscriptions().equals(this.getEventSubscriptions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentSchedule() == null) ? 0 : getAssessmentSchedule().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventSubscriptions() == null) ? 0 : getEventSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppRequest clone() {
        return (CreateAppRequest) super.clone();
    }

}
