/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#addPermission(AddPermissionRequest) AddPermission operation}.
 * <p>
 * The <code>AddPermission</code> action adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the
 * specified actions.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#addPermission(AddPermissionRequest)
 */
public class AddPermissionRequest extends AmazonWebServiceRequest implements Serializable {

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
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIds;

    /**
     * The action you want to allow for the specified principal(s). <p>Valid
     * values: any Amazon SNS action name.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> actionNames;

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
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * @param actionNames The action you want to allow for the specified
     * principal(s). <p>Valid values: any Amazon SNS action name.
     */
    public AddPermissionRequest(String topicArn, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actionNames) {
        setTopicArn(topicArn);
        setLabel(label);
        setAWSAccountIds(aWSAccountIds);
        setActionNames(actionNames);
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
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @return The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     */
    public java.util.List<String> getAWSAccountIds() {
        if (aWSAccountIds == null) {
              aWSAccountIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              aWSAccountIds.setAutoConstruct(true);
        }
        return aWSAccountIds;
    }
    
    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @param aWSAccountIds The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     */
    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aWSAccountIds.size());
        aWSAccountIdsCopy.addAll(aWSAccountIds);
        this.aWSAccountIds = aWSAccountIdsCopy;
    }
    
    /**
     * The AWS account IDs of the users (principals) who will be given access
     * to the specified actions. The users must have AWS accounts, but do not
     * need to be signed up for this service. <!--For information about
     * locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        if (getAWSAccountIds() == null) setAWSAccountIds(new java.util.ArrayList<String>(aWSAccountIds.length));
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
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     * AWS Identifiers</aulink> in the &service; Developer Guide.-->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account IDs of the users (principals) who will be given access
     *         to the specified actions. The users must have AWS accounts, but do not
     *         need to be signed up for this service. <!--For information about
     *         locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/index.html?AWSCredentials.html">Your
     *         AWS Identifiers</aulink> in the &service; Developer Guide.-->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aWSAccountIds.size());
            aWSAccountIdsCopy.addAll(aWSAccountIds);
            this.aWSAccountIds = aWSAccountIdsCopy;
        }

        return this;
    }

    /**
     * The action you want to allow for the specified principal(s). <p>Valid
     * values: any Amazon SNS action name.
     *
     * @return The action you want to allow for the specified principal(s). <p>Valid
     *         values: any Amazon SNS action name.
     */
    public java.util.List<String> getActionNames() {
        if (actionNames == null) {
              actionNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              actionNames.setAutoConstruct(true);
        }
        return actionNames;
    }
    
    /**
     * The action you want to allow for the specified principal(s). <p>Valid
     * values: any Amazon SNS action name.
     *
     * @param actionNames The action you want to allow for the specified principal(s). <p>Valid
     *         values: any Amazon SNS action name.
     */
    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> actionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actionNames.size());
        actionNamesCopy.addAll(actionNames);
        this.actionNames = actionNamesCopy;
    }
    
    /**
     * The action you want to allow for the specified principal(s). <p>Valid
     * values: any Amazon SNS action name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionNames The action you want to allow for the specified principal(s). <p>Valid
     *         values: any Amazon SNS action name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddPermissionRequest withActionNames(String... actionNames) {
        if (getActionNames() == null) setActionNames(new java.util.ArrayList<String>(actionNames.length));
        for (String value : actionNames) {
            getActionNames().add(value);
        }
        return this;
    }
    
    /**
     * The action you want to allow for the specified principal(s). <p>Valid
     * values: any Amazon SNS action name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionNames The action you want to allow for the specified principal(s). <p>Valid
     *         values: any Amazon SNS action name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddPermissionRequest withActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> actionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actionNames.size());
            actionNamesCopy.addAll(actionNames);
            this.actionNames = actionNamesCopy;
        }

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
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getAWSAccountIds() != null) sb.append("AWSAccountIds: " + getAWSAccountIds() + ",");
        if (getActionNames() != null) sb.append("ActionNames: " + getActionNames() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddPermissionRequest == false) return false;
        AddPermissionRequest other = (AddPermissionRequest)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getAWSAccountIds() == null ^ this.getAWSAccountIds() == null) return false;
        if (other.getAWSAccountIds() != null && other.getAWSAccountIds().equals(this.getAWSAccountIds()) == false) return false; 
        if (other.getActionNames() == null ^ this.getActionNames() == null) return false;
        if (other.getActionNames() != null && other.getActionNames().equals(this.getActionNames()) == false) return false; 
        return true;
    }
    
}
    