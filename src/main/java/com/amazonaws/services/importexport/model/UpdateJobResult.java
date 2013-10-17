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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;


/**
 * <p>
 * Output structure for the UpateJob operation.
 * </p>
 */
public class UpdateJobResult implements Serializable {

    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     */
    private Boolean success;

    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     */
    private String warningMessage;

    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     *
     * @return Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     */
    public Boolean isSuccess() {
        return success;
    }
    
    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     *
     * @param success Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    
    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param success Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateJobResult withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     *
     * @return Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     *
     * @return An optional message notifying you of non-fatal issues with the job,
     *         such as use of an incompatible Amazon S3 bucket name.
     */
    public String getWarningMessage() {
        return warningMessage;
    }
    
    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     *
     * @param warningMessage An optional message notifying you of non-fatal issues with the job,
     *         such as use of an incompatible Amazon S3 bucket name.
     */
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
    
    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warningMessage An optional message notifying you of non-fatal issues with the job,
     *         such as use of an incompatible Amazon S3 bucket name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateJobResult withWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
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
        if (isSuccess() != null) sb.append("Success: " + isSuccess() + ",");
        if (getWarningMessage() != null) sb.append("WarningMessage: " + getWarningMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isSuccess() == null) ? 0 : isSuccess().hashCode()); 
        hashCode = prime * hashCode + ((getWarningMessage() == null) ? 0 : getWarningMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateJobResult == false) return false;
        UpdateJobResult other = (UpdateJobResult)obj;
        
        if (other.isSuccess() == null ^ this.isSuccess() == null) return false;
        if (other.isSuccess() != null && other.isSuccess().equals(this.isSuccess()) == false) return false; 
        if (other.getWarningMessage() == null ^ this.getWarningMessage() == null) return false;
        if (other.getWarningMessage() != null && other.getWarningMessage().equals(this.getWarningMessage()) == false) return false; 
        return true;
    }
    
}
    