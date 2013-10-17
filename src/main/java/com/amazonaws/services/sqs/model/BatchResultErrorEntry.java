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

import java.io.Serializable;


/**
 * <p>
 * This is used in the responses of batch API to give a detailed description of the result of an operation on each entry in the request.
 * </p>
 */
public class BatchResultErrorEntry implements Serializable {

    /**
     * The id of an entry in a batch request.
     */
    private String id;

    /**
     * Whether the error happened due to the sender's fault.
     */
    private Boolean senderFault;

    /**
     * An error code representing why the operation failed on this entry.
     */
    private String code;

    /**
     * A message explaining why the operation failed on this entry.
     */
    private String message;

    /**
     * The id of an entry in a batch request.
     *
     * @return The id of an entry in a batch request.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The id of an entry in a batch request.
     *
     * @param id The id of an entry in a batch request.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The id of an entry in a batch request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The id of an entry in a batch request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchResultErrorEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Whether the error happened due to the sender's fault.
     *
     * @return Whether the error happened due to the sender's fault.
     */
    public Boolean isSenderFault() {
        return senderFault;
    }
    
    /**
     * Whether the error happened due to the sender's fault.
     *
     * @param senderFault Whether the error happened due to the sender's fault.
     */
    public void setSenderFault(Boolean senderFault) {
        this.senderFault = senderFault;
    }
    
    /**
     * Whether the error happened due to the sender's fault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param senderFault Whether the error happened due to the sender's fault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchResultErrorEntry withSenderFault(Boolean senderFault) {
        this.senderFault = senderFault;
        return this;
    }

    /**
     * Whether the error happened due to the sender's fault.
     *
     * @return Whether the error happened due to the sender's fault.
     */
    public Boolean getSenderFault() {
        return senderFault;
    }

    /**
     * An error code representing why the operation failed on this entry.
     *
     * @return An error code representing why the operation failed on this entry.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * An error code representing why the operation failed on this entry.
     *
     * @param code An error code representing why the operation failed on this entry.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * An error code representing why the operation failed on this entry.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code An error code representing why the operation failed on this entry.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchResultErrorEntry withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * A message explaining why the operation failed on this entry.
     *
     * @return A message explaining why the operation failed on this entry.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A message explaining why the operation failed on this entry.
     *
     * @param message A message explaining why the operation failed on this entry.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A message explaining why the operation failed on this entry.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message A message explaining why the operation failed on this entry.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchResultErrorEntry withMessage(String message) {
        this.message = message;
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
        if (isSenderFault() != null) sb.append("SenderFault: " + isSenderFault() + ",");
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((isSenderFault() == null) ? 0 : isSenderFault().hashCode()); 
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchResultErrorEntry == false) return false;
        BatchResultErrorEntry other = (BatchResultErrorEntry)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.isSenderFault() == null ^ this.isSenderFault() == null) return false;
        if (other.isSenderFault() != null && other.isSenderFault().equals(this.isSenderFault()) == false) return false; 
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    