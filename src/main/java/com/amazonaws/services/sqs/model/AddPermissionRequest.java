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
package com.amazonaws.services.sqs.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#addPermission(AddPermissionRequest) AddPermission operation}.
 * 
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#addPermission(AddPermissionRequest)
 */
public class AddPermissionRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String queueUrl;

    private String label;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIds;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> actions;

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
     * @param queueUrl
     * @param label
     * @param aWSAccountIds
     * @param actions
     */
    public AddPermissionRequest(String queueUrl, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actions) {
        setQueueUrl(queueUrl);
        setLabel(label);
        setAWSAccountIds(aWSAccountIds);
        setActions(actions);
    }

    
    
    /**
     * Returns the value of the QueueUrl property for this object.
     *
     * @return The value of the QueueUrl property for this object.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * Sets the value of the QueueUrl property for this object.
     *
     * @param queueUrl The new value for the QueueUrl property for this object.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * Sets the value of the QueueUrl property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The new value for the QueueUrl property for this object.
     */
    public AddPermissionRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * Returns the value of the Label property for this object.
     *
     * @return The value of the Label property for this object.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * Sets the value of the Label property for this object.
     *
     * @param label The new value for the Label property for this object.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * Sets the value of the Label property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label The new value for the Label property for this object.
     */
    public AddPermissionRequest withLabel(String label) {
        this.label = label;
        return this;
    }
    
    
    /**
     * Returns the value of the AWSAccountIds property for this object.
     *
     * @return The value of the AWSAccountIds property for this object.
     */
    public java.util.List<String> getAWSAccountIds() {
        
        if (aWSAccountIds == null) {
              aWSAccountIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              aWSAccountIds.setAutoConstruct(true);
        }
        return aWSAccountIds;
    }
    
    /**
     * Sets the value of the AWSAccountIds property for this object.
     *
     * @param aWSAccountIds The new value for the AWSAccountIds property for this object.
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
     * Sets the value of the AWSAccountIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The new value for the AWSAccountIds property for this object.
     */
    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        if (getAWSAccountIds() == null) setAWSAccountIds(new java.util.ArrayList<String>(aWSAccountIds.length));
        for (String value : aWSAccountIds) {
            getAWSAccountIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AWSAccountIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The new value for the AWSAccountIds property for this object.
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
     * Returns the value of the Actions property for this object.
     *
     * @return The value of the Actions property for this object.
     */
    public java.util.List<String> getActions() {
        
        if (actions == null) {
              actions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              actions.setAutoConstruct(true);
        }
        return actions;
    }
    
    /**
     * Sets the value of the Actions property for this object.
     *
     * @param actions The new value for the Actions property for this object.
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actions.size());
        actionsCopy.addAll(actions);
        this.actions = actionsCopy;
    }
    
    /**
     * Sets the value of the Actions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The new value for the Actions property for this object.
     */
    public AddPermissionRequest withActions(String... actions) {
        if (getActions() == null) setActions(new java.util.ArrayList<String>(actions.length));
        for (String value : actions) {
            getActions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Actions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The new value for the Actions property for this object.
     */
    public AddPermissionRequest withActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actions.size());
            actionsCopy.addAll(actions);
            this.actions = actionsCopy;
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getAWSAccountIds() != null) sb.append("AWSAccountIds: " + getAWSAccountIds() + ",");
        if (getActions() != null) sb.append("Actions: " + getActions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        hashCode = prime * hashCode + ((getAWSAccountIds() == null) ? 0 : getAWSAccountIds().hashCode()); 
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddPermissionRequest == false) return false;
        AddPermissionRequest other = (AddPermissionRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getAWSAccountIds() == null ^ this.getAWSAccountIds() == null) return false;
        if (other.getAWSAccountIds() != null && other.getAWSAccountIds().equals(this.getAWSAccountIds()) == false) return false; 
        if (other.getActions() == null ^ this.getActions() == null) return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false) return false; 
        return true;
    }
    
}
    