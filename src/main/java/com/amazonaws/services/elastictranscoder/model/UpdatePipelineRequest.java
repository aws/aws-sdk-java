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
package com.amazonaws.services.elastictranscoder.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipeline(UpdatePipelineRequest) UpdatePipeline operation}.
 * 
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipeline(UpdatePipelineRequest)
 */
public class UpdatePipelineRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String name;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String inputBucket;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     */
    private String role;

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     */
    private Notifications notifications;

    /**
     * 
     */
    private PipelineOutputConfig contentConfig;

    /**
     * 
     */
    private PipelineOutputConfig thumbnailConfig;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return 
     */
    public String getId() {
        return id;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return 
     */
    public String getInputBucket() {
        return inputBucket;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket 
     */
    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param inputBucket 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @return 
     */
    public String getRole() {
        return role;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role 
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:iam::\w{12}:role/.+$<br/>
     *
     * @param role 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withRole(String role) {
        this.role = role;
        return this;
    }
    
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     *
     * @return The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     *         notify in order to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important>
     */
    public Notifications getNotifications() {
        return notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     *         notify in order to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important>
     */
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     * notify in order to report job status. <important>To receive
     * notifications, you must also subscribe to the new topic in the Amazon
     * SNS console.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic or topics to
     *         notify in order to report job status. <important>To receive
     *         notifications, you must also subscribe to the new topic in the Amazon
     *         SNS console.</important>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withNotifications(Notifications notifications) {
        this.notifications = notifications;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public PipelineOutputConfig getContentConfig() {
        return contentConfig;
    }
    
    /**
     * 
     *
     * @param contentConfig 
     */
    public void setContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentConfig 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public PipelineOutputConfig getThumbnailConfig() {
        return thumbnailConfig;
    }
    
    /**
     * 
     *
     * @param thumbnailConfig 
     */
    public void setThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbnailConfig 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdatePipelineRequest withThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");    	
        if (getName() != null) sb.append("Name: " + getName() + ",");    	
        if (getInputBucket() != null) sb.append("InputBucket: " + getInputBucket() + ",");    	
        if (getRole() != null) sb.append("Role: " + getRole() + ",");    	
        if (getNotifications() != null) sb.append("Notifications: " + getNotifications() + ",");    	
        if (getContentConfig() != null) sb.append("ContentConfig: " + getContentConfig() + ",");    	
        if (getThumbnailConfig() != null) sb.append("ThumbnailConfig: " + getThumbnailConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getInputBucket() == null) ? 0 : getInputBucket().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode()); 
        hashCode = prime * hashCode + ((getContentConfig() == null) ? 0 : getContentConfig().hashCode()); 
        hashCode = prime * hashCode + ((getThumbnailConfig() == null) ? 0 : getThumbnailConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdatePipelineRequest == false) return false;
        UpdatePipelineRequest other = (UpdatePipelineRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getInputBucket() == null ^ this.getInputBucket() == null) return false;
        if (other.getInputBucket() != null && other.getInputBucket().equals(this.getInputBucket()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getNotifications() == null ^ this.getNotifications() == null) return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false) return false; 
        if (other.getContentConfig() == null ^ this.getContentConfig() == null) return false;
        if (other.getContentConfig() != null && other.getContentConfig().equals(this.getContentConfig()) == false) return false; 
        if (other.getThumbnailConfig() == null ^ this.getThumbnailConfig() == null) return false;
        if (other.getThumbnailConfig() != null && other.getThumbnailConfig().equals(this.getThumbnailConfig()) == false) return false; 
        return true;
    }
    
}
    