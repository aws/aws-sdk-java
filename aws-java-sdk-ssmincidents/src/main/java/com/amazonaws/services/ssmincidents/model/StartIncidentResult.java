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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/StartIncident" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartIncidentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the newly created incident record.
     * </p>
     */
    private String incidentRecordArn;

    /**
     * <p>
     * The ARN of the newly created incident record.
     * </p>
     * 
     * @param incidentRecordArn
     *        The ARN of the newly created incident record.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The ARN of the newly created incident record.
     * </p>
     * 
     * @return The ARN of the newly created incident record.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The ARN of the newly created incident record.
     * </p>
     * 
     * @param incidentRecordArn
     *        The ARN of the newly created incident record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIncidentResult withIncidentRecordArn(String incidentRecordArn) {
        setIncidentRecordArn(incidentRecordArn);
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
        if (getIncidentRecordArn() != null)
            sb.append("IncidentRecordArn: ").append(getIncidentRecordArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartIncidentResult == false)
            return false;
        StartIncidentResult other = (StartIncidentResult) obj;
        if (other.getIncidentRecordArn() == null ^ this.getIncidentRecordArn() == null)
            return false;
        if (other.getIncidentRecordArn() != null && other.getIncidentRecordArn().equals(this.getIncidentRecordArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        return hashCode;
    }

    @Override
    public StartIncidentResult clone() {
        try {
            return (StartIncidentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
