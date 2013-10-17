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

import java.io.Serializable;


/**
 * <p>
 * The Amazon Simple Notification Service (Amazon SNS) topic or topics to notify in order to report job status.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
 * </p>
 */
public class Notifications implements Serializable {

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify when Elastic Transcoder has started to process the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     */
    private String progressing;

    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * has finished processing the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     */
    private String completed;

    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters a warning condition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     */
    private String warning;

    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters an error condition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     */
    private String error;

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify when Elastic Transcoder has started to process the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @return The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify when Elastic Transcoder has started to process the job.
     */
    public String getProgressing() {
        return progressing;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify when Elastic Transcoder has started to process the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param progressing The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify when Elastic Transcoder has started to process the job.
     */
    public void setProgressing(String progressing) {
        this.progressing = progressing;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you
     * want to notify when Elastic Transcoder has started to process the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param progressing The Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify when Elastic Transcoder has started to process the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Notifications withProgressing(String progressing) {
        this.progressing = progressing;
        return this;
    }

    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * has finished processing the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @return The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         has finished processing the job.
     */
    public String getCompleted() {
        return completed;
    }
    
    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * has finished processing the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param completed The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         has finished processing the job.
     */
    public void setCompleted(String completed) {
        this.completed = completed;
    }
    
    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * has finished processing the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param completed The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         has finished processing the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Notifications withCompleted(String completed) {
        this.completed = completed;
        return this;
    }

    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters a warning condition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @return The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters a warning condition.
     */
    public String getWarning() {
        return warning;
    }
    
    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters a warning condition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param warning The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters a warning condition.
     */
    public void setWarning(String warning) {
        this.warning = warning;
    }
    
    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters a warning condition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param warning The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters a warning condition.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Notifications withWarning(String warning) {
        this.warning = warning;
        return this;
    }

    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters an error condition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @return The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters an error condition.
     */
    public String getError() {
        return error;
    }
    
    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters an error condition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param error The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters an error condition.
     */
    public void setError(String error) {
        this.error = error;
    }
    
    /**
     * The Amazon SNS topic that you want to notify when Elastic Transcoder
     * encounters an error condition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param error The Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters an error condition.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Notifications withError(String error) {
        this.error = error;
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
        if (getProgressing() != null) sb.append("Progressing: " + getProgressing() + ",");
        if (getCompleted() != null) sb.append("Completed: " + getCompleted() + ",");
        if (getWarning() != null) sb.append("Warning: " + getWarning() + ",");
        if (getError() != null) sb.append("Error: " + getError() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProgressing() == null) ? 0 : getProgressing().hashCode()); 
        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode()); 
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode()); 
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Notifications == false) return false;
        Notifications other = (Notifications)obj;
        
        if (other.getProgressing() == null ^ this.getProgressing() == null) return false;
        if (other.getProgressing() != null && other.getProgressing().equals(this.getProgressing()) == false) return false; 
        if (other.getCompleted() == null ^ this.getCompleted() == null) return false;
        if (other.getCompleted() != null && other.getCompleted().equals(this.getCompleted()) == false) return false; 
        if (other.getWarning() == null ^ this.getWarning() == null) return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false) return false; 
        if (other.getError() == null ^ this.getError() == null) return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false) return false; 
        return true;
    }
    
}
    