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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReportInstanceStatusRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#reportInstanceStatus(ReportInstanceStatusRequest) ReportInstanceStatus operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#reportInstanceStatus(ReportInstanceStatusRequest)
 */
public class ReportInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ReportInstanceStatusRequest> {

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instances;

    private String status;

    private java.util.Date startTime;

    private java.util.Date endTime;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reasonCodes;

    private String description;

    /**
     * Returns the value of the Instances property for this object.
     *
     * @return The value of the Instances property for this object.
     */
    public java.util.List<String> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     *
     * @param instances The new value for the Instances property for this object.
     */
    public void setInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The new value for the Instances property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withInstances(String... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<String>(instances.length));
        for (String value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The new value for the Instances property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @return The value of the Status property for this object.
     *
     * @see ReportStatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status The new value for the Status property for this object.
     *
     * @see ReportStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReportStatusType
     */
    public ReportInstanceStatusRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Sets the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status The new value for the Status property for this object.
     *
     * @see ReportStatusType
     */
    public void setStatus(ReportStatusType status) {
        this.status = status.toString();
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReportStatusType
     */
    public ReportInstanceStatusRequest withStatus(ReportStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns the value of the StartTime property for this object.
     *
     * @return The value of the StartTime property for this object.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Sets the value of the StartTime property for this object.
     *
     * @param startTime The new value for the StartTime property for this object.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Sets the value of the StartTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The new value for the StartTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns the value of the EndTime property for this object.
     *
     * @return The value of the EndTime property for this object.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * Sets the value of the EndTime property for this object.
     *
     * @param endTime The new value for the EndTime property for this object.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * Sets the value of the EndTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The new value for the EndTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns the value of the ReasonCodes property for this object.
     *
     * @return The value of the ReasonCodes property for this object.
     */
    public java.util.List<String> getReasonCodes() {
        if (reasonCodes == null) {
              reasonCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reasonCodes.setAutoConstruct(true);
        }
        return reasonCodes;
    }
    
    /**
     * Sets the value of the ReasonCodes property for this object.
     *
     * @param reasonCodes The new value for the ReasonCodes property for this object.
     */
    public void setReasonCodes(java.util.Collection<String> reasonCodes) {
        if (reasonCodes == null) {
            this.reasonCodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reasonCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reasonCodes.size());
        reasonCodesCopy.addAll(reasonCodes);
        this.reasonCodes = reasonCodesCopy;
    }
    
    /**
     * Sets the value of the ReasonCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonCodes The new value for the ReasonCodes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withReasonCodes(String... reasonCodes) {
        if (getReasonCodes() == null) setReasonCodes(new java.util.ArrayList<String>(reasonCodes.length));
        for (String value : reasonCodes) {
            getReasonCodes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ReasonCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonCodes The new value for the ReasonCodes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withReasonCodes(java.util.Collection<String> reasonCodes) {
        if (reasonCodes == null) {
            this.reasonCodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reasonCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reasonCodes.size());
            reasonCodesCopy.addAll(reasonCodes);
            this.reasonCodes = reasonCodesCopy;
        }

        return this;
    }

    /**
     * Sets the value of the ReasonCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonCodes The new value for the ReasonCodes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withReasonCodes(ReportInstanceReasonCodes... reasonCodes) {
        java.util.ArrayList<String> reasonCodesCopy = new java.util.ArrayList<String>(reasonCodes.length);
        for (ReportInstanceReasonCodes member : reasonCodes) {
            reasonCodesCopy.add(member.toString());
        }
        if (getReasonCodes() == null) {
            setReasonCodes(reasonCodesCopy);
        } else {
            getReasonCodes().addAll(reasonCodesCopy);
        }
        return this;
    }

    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportInstanceStatusRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ReportInstanceStatusRequest> getDryRunRequest() {
        Request<ReportInstanceStatusRequest> request = new ReportInstanceStatusRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getReasonCodes() != null) sb.append("ReasonCodes: " + getReasonCodes() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getReasonCodes() == null) ? 0 : getReasonCodes().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportInstanceStatusRequest == false) return false;
        ReportInstanceStatusRequest other = (ReportInstanceStatusRequest)obj;
        
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getReasonCodes() == null ^ this.getReasonCodes() == null) return false;
        if (other.getReasonCodes() != null && other.getReasonCodes().equals(this.getReasonCodes()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    