/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetIncidentRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIncidentRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details structure of the incident record.
     * </p>
     */
    private IncidentRecord incidentRecord;

    /**
     * <p>
     * Details structure of the incident record.
     * </p>
     * 
     * @param incidentRecord
     *        Details structure of the incident record.
     */

    public void setIncidentRecord(IncidentRecord incidentRecord) {
        this.incidentRecord = incidentRecord;
    }

    /**
     * <p>
     * Details structure of the incident record.
     * </p>
     * 
     * @return Details structure of the incident record.
     */

    public IncidentRecord getIncidentRecord() {
        return this.incidentRecord;
    }

    /**
     * <p>
     * Details structure of the incident record.
     * </p>
     * 
     * @param incidentRecord
     *        Details structure of the incident record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIncidentRecordResult withIncidentRecord(IncidentRecord incidentRecord) {
        setIncidentRecord(incidentRecord);
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
        if (getIncidentRecord() != null)
            sb.append("IncidentRecord: ").append(getIncidentRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIncidentRecordResult == false)
            return false;
        GetIncidentRecordResult other = (GetIncidentRecordResult) obj;
        if (other.getIncidentRecord() == null ^ this.getIncidentRecord() == null)
            return false;
        if (other.getIncidentRecord() != null && other.getIncidentRecord().equals(this.getIncidentRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncidentRecord() == null) ? 0 : getIncidentRecord().hashCode());
        return hashCode;
    }

    @Override
    public GetIncidentRecordResult clone() {
        try {
            return (GetIncidentRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
