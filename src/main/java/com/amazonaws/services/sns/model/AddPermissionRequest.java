/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#addPermission(AddPermissionRequest) AddPermission operation}.
 * <p>
 * The AddPermission action adds a statement to a topic's access control
 * policy, granting access for the specified AWS accounts to the
 * specified actions.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#addPermission(AddPermissionRequest)
 */
public class AddPermissionRequest extends AmazonWebServiceRequest {

    /**
     * The ARN of the topic whose access control policy you wish to modify.
     */
    private String topicArn;

    /**
     * A unique identifier for the new policy statement.
     */
    private String label;

    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     */
    private java.util.List<String> aWSAccountIds;

    /**
     * The action you want to allow for the specified principal(s).
     */
    private java.util.List<String> actionNames;

    /**
     * Default constructor for a new AddPermissionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AddPermissionRequest() {}
    
    /**
     * Constructs a new AddPermissionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic whose access control policy you
     * wish to modify.
     * @param label A unique identifier for the new policy statement.
     * @param aWSAccountIds The AWS account IDs of the users (principals) who
     * will be given access to the specified actions. The users must have AWS
     * accounts, but do not need to be signed up for this service. <!--For
     * information about locating the AWS account identification, see <a
     * eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * @param actionNames The action you want to allow for the specified
     * principal(s).
     */
    public AddPermissionRequest(String topicArn, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actionNames) {
        this.topicArn = topicArn;
        this.label = label;
        this.aWSAccountIds = aWSAccountIds;
        this.actionNames = actionNames;
    }
    
    /**
     * The ARN of the topic whose access control policy you wish to modify.
     *
     * @return The ARN of the topic whose access control policy you wish to modify.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the topic whose access control policy you wish to modify.
     *
     * @param topicArn The ARN of the topic whose access control policy you wish to modify.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the topic whose access control policy you wish to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the topic whose access control policy you wish to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }
    
    
    /**
     * A unique identifier for the new policy statement.
     *
     * @return A unique identifier for the new policy statement.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * A unique identifier for the new policy statement.
     *
     * @param label A unique identifier for the new policy statement.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * A unique identifier for the new policy statement.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label A unique identifier for the new policy statement.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withLabel(String label) {
        this.label = label;
        return this;
    }
    
    
    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @return The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     */
    public java.util.List<String> getAWSAccountIds() {
        if (aWSAccountIds == null) {
            aWSAccountIds = new java.util.ArrayList<String>();
        }
        return aWSAccountIds;
    }
    
    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @param aWSAccountIds The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     */
    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        java.util.List<String> aWSAccountIdsCopy = new java.util.ArrayList<String>();
        if (aWSAccountIds != null) {
            aWSAccountIdsCopy.addAll(aWSAccountIds);
        }
        this.aWSAccountIds = aWSAccountIdsCopy;
    }
    
    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        for (String value : aWSAccountIds) {
            getAWSAccountIds().add(value);
        }
        return this;
    }
    
    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         eService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        java.util.List<String> aWSAccountIdsCopy = new java.util.ArrayList<String>();
        if (aWSAccountIds != null) {
            aWSAccountIdsCopy.addAll(aWSAccountIds);
        }
        this.aWSAccountIds = aWSAccountIdsCopy;

        return this;
    }
    
    /**
     * The action you want to allow for the specified principal(s).
     *
     * @return The action you want to allow for the specified principal(s).
     */
    public java.util.List<String> getActionNames() {
        if (actionNames == null) {
            actionNames = new java.util.ArrayList<String>();
        }
        return actionNames;
    }
    
    /**
     * The action you want to allow for the specified principal(s).
     *
     * @param actionNames The action you want to allow for the specified principal(s).
     */
    public void setActionNames(java.util.Collection<String> actionNames) {
        java.util.List<String> actionNamesCopy = new java.util.ArrayList<String>();
        if (actionNames != null) {
            actionNamesCopy.addAll(actionNames);
        }
        this.actionNames = actionNamesCopy;
    }
    
    /**
     * The action you want to allow for the specified principal(s).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionNames The action you want to allow for the specified principal(s).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withActionNames(String... actionNames) {
        for (String value : actionNames) {
            getActionNames().add(value);
        }
        return this;
    }
    
    /**
     * The action you want to allow for the specified principal(s).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionNames The action you want to allow for the specified principal(s).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withActionNames(java.util.Collection<String> actionNames) {
        java.util.List<String> actionNamesCopy = new java.util.ArrayList<String>();
        if (actionNames != null) {
            actionNamesCopy.addAll(actionNames);
        }
        this.actionNames = actionNamesCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("TopicArn: " + topicArn + ", ");
        sb.append("Label: " + label + ", ");
        sb.append("AWSAccountIds: " + aWSAccountIds + ", ");
        sb.append("ActionNames: " + actionNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    