/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * PutDialRequestBatchRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PutDialRequestBatch"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDialRequestBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private java.util.List<DialRequest> dialRequests;

    private String id;

    /**
     * @return
     */

    public java.util.List<DialRequest> getDialRequests() {
        return dialRequests;
    }

    /**
     * @param dialRequests
     */

    public void setDialRequests(java.util.Collection<DialRequest> dialRequests) {
        if (dialRequests == null) {
            this.dialRequests = null;
            return;
        }

        this.dialRequests = new java.util.ArrayList<DialRequest>(dialRequests);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDialRequests(java.util.Collection)} or {@link #withDialRequests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dialRequests
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchRequest withDialRequests(DialRequest... dialRequests) {
        if (this.dialRequests == null) {
            setDialRequests(new java.util.ArrayList<DialRequest>(dialRequests.length));
        }
        for (DialRequest ele : dialRequests) {
            this.dialRequests.add(ele);
        }
        return this;
    }

    /**
     * @param dialRequests
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchRequest withDialRequests(java.util.Collection<DialRequest> dialRequests) {
        setDialRequests(dialRequests);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchRequest withId(String id) {
        setId(id);
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
        if (getDialRequests() != null)
            sb.append("DialRequests: ").append(getDialRequests()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDialRequestBatchRequest == false)
            return false;
        PutDialRequestBatchRequest other = (PutDialRequestBatchRequest) obj;
        if (other.getDialRequests() == null ^ this.getDialRequests() == null)
            return false;
        if (other.getDialRequests() != null && other.getDialRequests().equals(this.getDialRequests()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialRequests() == null) ? 0 : getDialRequests().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public PutDialRequestBatchRequest clone() {
        return (PutDialRequestBatchRequest) super.clone();
    }

}
