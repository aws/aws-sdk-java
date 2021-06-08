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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFHIRDatastoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The datastore ARN is generated during the creation of the Data Store and can be found in the output from the
     * initial Data Store creation call.
     * </p>
     */
    private String datastoreArn;
    /**
     * <p>
     * The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * </p>
     */
    private String datastoreStatus;
    /**
     * <p>
     * The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     * </p>
     */
    private String datastoreEndpoint;

    /**
     * <p>
     * The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     * </p>
     * 
     * @return The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFHIRDatastoreResult withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The datastore ARN is generated during the creation of the Data Store and can be found in the output from the
     * initial Data Store creation call.
     * </p>
     * 
     * @param datastoreArn
     *        The datastore ARN is generated during the creation of the Data Store and can be found in the output from
     *        the initial Data Store creation call.
     */

    public void setDatastoreArn(String datastoreArn) {
        this.datastoreArn = datastoreArn;
    }

    /**
     * <p>
     * The datastore ARN is generated during the creation of the Data Store and can be found in the output from the
     * initial Data Store creation call.
     * </p>
     * 
     * @return The datastore ARN is generated during the creation of the Data Store and can be found in the output from
     *         the initial Data Store creation call.
     */

    public String getDatastoreArn() {
        return this.datastoreArn;
    }

    /**
     * <p>
     * The datastore ARN is generated during the creation of the Data Store and can be found in the output from the
     * initial Data Store creation call.
     * </p>
     * 
     * @param datastoreArn
     *        The datastore ARN is generated during the creation of the Data Store and can be found in the output from
     *        the initial Data Store creation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFHIRDatastoreResult withDatastoreArn(String datastoreArn) {
        setDatastoreArn(datastoreArn);
        return this;
    }

    /**
     * <p>
     * The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * </p>
     * 
     * @param datastoreStatus
     *        The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * @see DatastoreStatus
     */

    public void setDatastoreStatus(String datastoreStatus) {
        this.datastoreStatus = datastoreStatus;
    }

    /**
     * <p>
     * The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * </p>
     * 
     * @return The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * @see DatastoreStatus
     */

    public String getDatastoreStatus() {
        return this.datastoreStatus;
    }

    /**
     * <p>
     * The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * </p>
     * 
     * @param datastoreStatus
     *        The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public CreateFHIRDatastoreResult withDatastoreStatus(String datastoreStatus) {
        setDatastoreStatus(datastoreStatus);
        return this;
    }

    /**
     * <p>
     * The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * </p>
     * 
     * @param datastoreStatus
     *        The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public CreateFHIRDatastoreResult withDatastoreStatus(DatastoreStatus datastoreStatus) {
        this.datastoreStatus = datastoreStatus.toString();
        return this;
    }

    /**
     * <p>
     * The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     * </p>
     * 
     * @param datastoreEndpoint
     *        The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     */

    public void setDatastoreEndpoint(String datastoreEndpoint) {
        this.datastoreEndpoint = datastoreEndpoint;
    }

    /**
     * <p>
     * The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     * </p>
     * 
     * @return The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     */

    public String getDatastoreEndpoint() {
        return this.datastoreEndpoint;
    }

    /**
     * <p>
     * The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     * </p>
     * 
     * @param datastoreEndpoint
     *        The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFHIRDatastoreResult withDatastoreEndpoint(String datastoreEndpoint) {
        setDatastoreEndpoint(datastoreEndpoint);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getDatastoreArn() != null)
            sb.append("DatastoreArn: ").append(getDatastoreArn()).append(",");
        if (getDatastoreStatus() != null)
            sb.append("DatastoreStatus: ").append(getDatastoreStatus()).append(",");
        if (getDatastoreEndpoint() != null)
            sb.append("DatastoreEndpoint: ").append(getDatastoreEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFHIRDatastoreResult == false)
            return false;
        CreateFHIRDatastoreResult other = (CreateFHIRDatastoreResult) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getDatastoreArn() == null ^ this.getDatastoreArn() == null)
            return false;
        if (other.getDatastoreArn() != null && other.getDatastoreArn().equals(this.getDatastoreArn()) == false)
            return false;
        if (other.getDatastoreStatus() == null ^ this.getDatastoreStatus() == null)
            return false;
        if (other.getDatastoreStatus() != null && other.getDatastoreStatus().equals(this.getDatastoreStatus()) == false)
            return false;
        if (other.getDatastoreEndpoint() == null ^ this.getDatastoreEndpoint() == null)
            return false;
        if (other.getDatastoreEndpoint() != null && other.getDatastoreEndpoint().equals(this.getDatastoreEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDatastoreArn() == null) ? 0 : getDatastoreArn().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStatus() == null) ? 0 : getDatastoreStatus().hashCode());
        hashCode = prime * hashCode + ((getDatastoreEndpoint() == null) ? 0 : getDatastoreEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreateFHIRDatastoreResult clone() {
        try {
            return (CreateFHIRDatastoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
