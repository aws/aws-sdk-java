/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that lists the changes and information for a
 * ChangeBatch.
 * </p>
 */
public class ChangeBatchRecord implements Serializable, Cloneable {

    /**
     * The ID of the request. Use this ID to track when the change has
     * completed across all Amazon Route 53 DNS servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String id;

    /**
     * The date and time the change was submitted, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC).
     */
    private java.util.Date submittedAt;

    /**
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS
     * servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     */
    private String status;

    /**
     * A complex type that describes change information about changes made to
     * your hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String comment;

    /**
     * The AWS account ID attached to the changes.
     */
    private String submitter;

    /**
     * A list of changes made in the ChangeBatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Change> changes;

    /**
     * The ID of the request. Use this ID to track when the change has
     * completed across all Amazon Route 53 DNS servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the request. Use this ID to track when the change has
     *         completed across all Amazon Route 53 DNS servers.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the request. Use this ID to track when the change has
     * completed across all Amazon Route 53 DNS servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the request. Use this ID to track when the change has
     *         completed across all Amazon Route 53 DNS servers.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the request. Use this ID to track when the change has
     * completed across all Amazon Route 53 DNS servers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the request. Use this ID to track when the change has
     *         completed across all Amazon Route 53 DNS servers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeBatchRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The date and time the change was submitted, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC).
     *
     * @return The date and time the change was submitted, in the format
     *         <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     *         standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     *         the time indicates that the time is listed in Coordinated Universal
     *         Time (UTC).
     */
    public java.util.Date getSubmittedAt() {
        return submittedAt;
    }
    
    /**
     * The date and time the change was submitted, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC).
     *
     * @param submittedAt The date and time the change was submitted, in the format
     *         <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     *         standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     *         the time indicates that the time is listed in Coordinated Universal
     *         Time (UTC).
     */
    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }
    
    /**
     * The date and time the change was submitted, in the format
     * <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     * standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     * the time indicates that the time is listed in Coordinated Universal
     * Time (UTC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submittedAt The date and time the change was submitted, in the format
     *         <code>YYYY-MM-DDThh:mm:ssZ</code>, as specified in the ISO 8601
     *         standard (for example, 2009-11-19T19:37:58Z). The <code>Z</code> after
     *         the time indicates that the time is listed in Coordinated Universal
     *         Time (UTC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeBatchRecord withSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS
     * servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @return The current state of the request. <code>PENDING</code> indicates that
     *         this request has not yet been applied to all Amazon Route 53 DNS
     *         servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     *
     * @see ChangeStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS
     * servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status The current state of the request. <code>PENDING</code> indicates that
     *         this request has not yet been applied to all Amazon Route 53 DNS
     *         servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     *
     * @see ChangeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS
     * servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status The current state of the request. <code>PENDING</code> indicates that
     *         this request has not yet been applied to all Amazon Route 53 DNS
     *         servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChangeStatus
     */
    public ChangeBatchRecord withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS
     * servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status The current state of the request. <code>PENDING</code> indicates that
     *         this request has not yet been applied to all Amazon Route 53 DNS
     *         servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     *
     * @see ChangeStatus
     */
    public void setStatus(ChangeStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS
     * servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status The current state of the request. <code>PENDING</code> indicates that
     *         this request has not yet been applied to all Amazon Route 53 DNS
     *         servers. <p>Valid Values: <code>PENDING</code> | <code>INSYNC</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChangeStatus
     */
    public ChangeBatchRecord withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * A complex type that describes change information about changes made to
     * your hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return A complex type that describes change information about changes made to
     *         your hosted zone. <p>This element contains an ID that you use when
     *         performing a <a>GetChange</a> action to get detailed information about
     *         the change.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * A complex type that describes change information about changes made to
     * your hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment A complex type that describes change information about changes made to
     *         your hosted zone. <p>This element contains an ID that you use when
     *         performing a <a>GetChange</a> action to get detailed information about
     *         the change.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * A complex type that describes change information about changes made to
     * your hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment A complex type that describes change information about changes made to
     *         your hosted zone. <p>This element contains an ID that you use when
     *         performing a <a>GetChange</a> action to get detailed information about
     *         the change.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeBatchRecord withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * The AWS account ID attached to the changes.
     *
     * @return The AWS account ID attached to the changes.
     */
    public String getSubmitter() {
        return submitter;
    }
    
    /**
     * The AWS account ID attached to the changes.
     *
     * @param submitter The AWS account ID attached to the changes.
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }
    
    /**
     * The AWS account ID attached to the changes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submitter The AWS account ID attached to the changes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeBatchRecord withSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }

    /**
     * A list of changes made in the ChangeBatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of changes made in the ChangeBatch.
     */
    public java.util.List<Change> getChanges() {
        if (changes == null) {
              changes = new com.amazonaws.internal.ListWithAutoConstructFlag<Change>();
              changes.setAutoConstruct(true);
        }
        return changes;
    }
    
    /**
     * A list of changes made in the ChangeBatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changes A list of changes made in the ChangeBatch.
     */
    public void setChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Change> changesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Change>(changes.size());
        changesCopy.addAll(changes);
        this.changes = changesCopy;
    }
    
    /**
     * A list of changes made in the ChangeBatch.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setChanges(java.util.Collection)} or {@link
     * #withChanges(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changes A list of changes made in the ChangeBatch.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeBatchRecord withChanges(Change... changes) {
        if (getChanges() == null) setChanges(new java.util.ArrayList<Change>(changes.length));
        for (Change value : changes) {
            getChanges().add(value);
        }
        return this;
    }
    
    /**
     * A list of changes made in the ChangeBatch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changes A list of changes made in the ChangeBatch.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeBatchRecord withChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Change> changesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Change>(changes.size());
            changesCopy.addAll(changes);
            this.changes = changesCopy;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getSubmittedAt() != null) sb.append("SubmittedAt: " + getSubmittedAt() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getSubmitter() != null) sb.append("Submitter: " + getSubmitter() + ",");
        if (getChanges() != null) sb.append("Changes: " + getChanges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getSubmittedAt() == null) ? 0 : getSubmittedAt().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((getSubmitter() == null) ? 0 : getSubmitter().hashCode()); 
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeBatchRecord == false) return false;
        ChangeBatchRecord other = (ChangeBatchRecord)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getSubmittedAt() == null ^ this.getSubmittedAt() == null) return false;
        if (other.getSubmittedAt() != null && other.getSubmittedAt().equals(this.getSubmittedAt()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.getSubmitter() == null ^ this.getSubmitter() == null) return false;
        if (other.getSubmitter() != null && other.getSubmitter().equals(this.getSubmitter()) == false) return false; 
        if (other.getChanges() == null ^ this.getChanges() == null) return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false) return false; 
        return true;
    }
    
    @Override
    public ChangeBatchRecord clone() {
        try {
            return (ChangeBatchRecord) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    