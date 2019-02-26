/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/AddPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must
     * have AWS accounts, but do not need to be signed up for this service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> aWSAccountIds;
    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> actionNames;

    /**
     * Default constructor for AddPermissionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public AddPermissionRequest() {
    }

    /**
     * Constructs a new AddPermissionRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic whose access control policy you wish to modify.
     * @param label
     *        A unique identifier for the new policy statement.
     * @param aWSAccountIds
     *        The AWS account IDs of the users (principals) who will be given access to the specified actions. The users
     *        must have AWS accounts, but do not need to be signed up for this service.
     * @param actionNames
     *        The action you want to allow for the specified principal(s).</p>
     *        <p>
     *        Valid values: any Amazon SNS action name.
     */
    public AddPermissionRequest(String topicArn, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actionNames) {
        setTopicArn(topicArn);
        setLabel(label);
        setAWSAccountIds(aWSAccountIds);
        setActionNames(actionNames);
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic whose access control policy you wish to modify.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * 
     * @return The ARN of the topic whose access control policy you wish to modify.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic whose access control policy you wish to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     * 
     * @param label
     *        A unique identifier for the new policy statement.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     * 
     * @return A unique identifier for the new policy statement.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A unique identifier for the new policy statement.
     * </p>
     * 
     * @param label
     *        A unique identifier for the new policy statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must
     * have AWS accounts, but do not need to be signed up for this service.
     * </p>
     * 
     * @return The AWS account IDs of the users (principals) who will be given access to the specified actions. The
     *         users must have AWS accounts, but do not need to be signed up for this service.
     */

    public java.util.List<String> getAWSAccountIds() {
        if (aWSAccountIds == null) {
            aWSAccountIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return aWSAccountIds;
    }

    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must
     * have AWS accounts, but do not need to be signed up for this service.
     * </p>
     * 
     * @param aWSAccountIds
     *        The AWS account IDs of the users (principals) who will be given access to the specified actions. The users
     *        must have AWS accounts, but do not need to be signed up for this service.
     */

    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
            return;
        }

        this.aWSAccountIds = new com.amazonaws.internal.SdkInternalList<String>(aWSAccountIds);
    }

    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must
     * have AWS accounts, but do not need to be signed up for this service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAWSAccountIds(java.util.Collection)} or {@link #withAWSAccountIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param aWSAccountIds
     *        The AWS account IDs of the users (principals) who will be given access to the specified actions. The users
     *        must have AWS accounts, but do not need to be signed up for this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        if (this.aWSAccountIds == null) {
            setAWSAccountIds(new com.amazonaws.internal.SdkInternalList<String>(aWSAccountIds.length));
        }
        for (String ele : aWSAccountIds) {
            this.aWSAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must
     * have AWS accounts, but do not need to be signed up for this service.
     * </p>
     * 
     * @param aWSAccountIds
     *        The AWS account IDs of the users (principals) who will be given access to the specified actions. The users
     *        must have AWS accounts, but do not need to be signed up for this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        setAWSAccountIds(aWSAccountIds);
        return this;
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     * 
     * @return The action you want to allow for the specified principal(s).</p>
     *         <p>
     *         Valid values: any Amazon SNS action name.
     */

    public java.util.List<String> getActionNames() {
        if (actionNames == null) {
            actionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return actionNames;
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     * 
     * @param actionNames
     *        The action you want to allow for the specified principal(s).</p>
     *        <p>
     *        Valid values: any Amazon SNS action name.
     */

    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }

        this.actionNames = new com.amazonaws.internal.SdkInternalList<String>(actionNames);
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionNames(java.util.Collection)} or {@link #withActionNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionNames
     *        The action you want to allow for the specified principal(s).</p>
     *        <p>
     *        Valid values: any Amazon SNS action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withActionNames(String... actionNames) {
        if (this.actionNames == null) {
            setActionNames(new com.amazonaws.internal.SdkInternalList<String>(actionNames.length));
        }
        for (String ele : actionNames) {
            this.actionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The action you want to allow for the specified principal(s).
     * </p>
     * <p>
     * Valid values: any Amazon SNS action name.
     * </p>
     * 
     * @param actionNames
     *        The action you want to allow for the specified principal(s).</p>
     *        <p>
     *        Valid values: any Amazon SNS action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withActionNames(java.util.Collection<String> actionNames) {
        setActionNames(actionNames);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getAWSAccountIds() != null)
            sb.append("AWSAccountIds: ").append(getAWSAccountIds()).append(",");
        if (getActionNames() != null)
            sb.append("ActionNames: ").append(getActionNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddPermissionRequest == false)
            return false;
        AddPermissionRequest other = (AddPermissionRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getAWSAccountIds() == null ^ this.getAWSAccountIds() == null)
            return false;
        if (other.getAWSAccountIds() != null && other.getAWSAccountIds().equals(this.getAWSAccountIds()) == false)
            return false;
        if (other.getActionNames() == null ^ this.getActionNames() == null)
            return false;
        if (other.getActionNames() != null && other.getActionNames().equals(this.getActionNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getAWSAccountIds() == null) ? 0 : getAWSAccountIds().hashCode());
        hashCode = prime * hashCode + ((getActionNames() == null) ? 0 : getActionNames().hashCode());
        return hashCode;
    }

    @Override
    public AddPermissionRequest clone() {
        return (AddPermissionRequest) super.clone();
    }

}
